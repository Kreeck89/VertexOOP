package homeTaskFromLists.pack10;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@XmlRootElement(name = "All_Men")
@XmlAccessorType(XmlAccessType.FIELD)

public class Men {

    @XmlElement(name = "Man")
    private List<Man> menList = new ArrayList<>();
}
