package lesson10OOP.clone;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ObjectVsCloneable implements Cloneable {

    private int firstField;
    private List<String> strings = new ArrayList<>();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("firstField=").append(firstField);
        sb.append(", strings=").append(strings);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        ObjectVsCloneable withoutCloneable = getExampleObject();

        System.out.println(withoutCloneable);
        System.out.println(withoutCloneable.clone());

        //After change All cloned and real elem have ONE links to Object

        ObjectVsCloneable clone = (ObjectVsCloneable) withoutCloneable.clone();
        clone.getStrings().add("Three");
        System.out.println(clone);
        System.out.println(withoutCloneable);
    }

    private static ObjectVsCloneable getExampleObject() {
        ObjectVsCloneable withoutCloneable = new ObjectVsCloneable();
        withoutCloneable.setFirstField(32);
        withoutCloneable.getStrings().add("one");
        withoutCloneable.getStrings().add("two");
        return withoutCloneable;
    }
}
