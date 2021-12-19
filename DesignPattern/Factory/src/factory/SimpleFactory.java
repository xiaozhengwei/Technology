package factory;

public class SimpleFactory {
    public static Parent create(String childrenName) {
        if ("childrenA".equals(childrenName)) {
            return new ChildrenA();
        } else if ("childrenB".equals(childrenName)) {
            return new ChildrenB();
        } else {
            return new ChildrenC();
        }
    }
}
