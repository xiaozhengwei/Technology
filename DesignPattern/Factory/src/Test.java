import entity.People;
import entity.Student;
import entity.Teacher;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Test {

    final static Map<String, Supplier<People>> map = new HashMap<>();

    static {
        map.put("student", Student::new);
        map.put("teacher", Teacher::new);

    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<C> cConstructor = C.class.getDeclaredConstructor(int.class);
        cConstructor.setAccessible(true);
        cConstructor.newInstance(5);

    }
}

class C {
    public C() {
        System.out.println("C");
    }
    private C(int i) {
        System.out.println("HelloC" + i);
    }

}