package homeTaskFromLists.pack10.xmlUse;

import homeTaskFromLists.pack10.Man;
import homeTaskFromLists.pack10.Men;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainJAXB {

    public static void main(String[] args) {
        Men allMen = getAllMen();

        MainJAXB xmlReader = new MainJAXB();
        File xmlFile = new File("src/main/java/homeTaskFromLists/pack10/xmlUse/Men.xml");
        try {
            xmlFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        xmlReader.WriteMen(xmlFile, allMen);

        List<Man> menFromXML = xmlReader.ReadMen(xmlFile);

        System.out.println(menFromXML);

    }

    private List<Man> ReadMen(File xmlFile) {
        Men resault = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Men.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            resault = (Men) unmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return resault.getMenList();
    }

    private void WriteMen(File xmlFile, Men men) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Men.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(men, xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static Men getAllMen() {
        return new Men(Arrays.asList(
                new Man("Vasia", "Kiev", 28),
                new Man("Valera", "Kiev", 27)));
    }
}
