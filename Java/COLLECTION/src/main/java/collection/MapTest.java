package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        for(int i=0;i<10000;i++){
            map.put("Hello"+i,"World"+i);
        }

    }
}
