import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Leetcode380 {

    @Test
    public void run() {
        RandomizedSet set = new RandomizedSet();
    }

    class RandomizedSet {

        List<Integer> list;
        HashMap<Integer, Integer> indexMap;
        Random random;

        public RandomizedSet() {
            list = new ArrayList<>();
            indexMap = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (indexMap.containsKey(val)) {
                return false;
            }
            list.add(val);
            indexMap.put(val, list.size() - 1);
            return true;
        }

        public boolean remove(int val) {
            if (!indexMap.containsKey(val)) {
                return false;
            }
            int oldIndex = indexMap.get(val);
            int lastData=list.get(list.size()-1);
            list.set(oldIndex, lastData);
            list.remove(list.size() - 1);
            indexMap.remove(val);
            indexMap.put(lastData,oldIndex);
            return true;
        }

        public int getRandom() {
            int randomNum = random.nextInt(list.size());
            return list.get(randomNum);
        }
    }
}
