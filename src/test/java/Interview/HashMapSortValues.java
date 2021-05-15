package Interview;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapSortValues {

    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");
        System.out.println("Before Sorting:");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        Map<Integer, String> map = sortByValues(hmap);
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }
    }

    private static Map<Integer, String> sortByValues(HashMap<Integer, String > map) {

      List<Map.Entry<Integer,String>> ls= new ArrayList<>(map.entrySet());

      Collections.sort(ls, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
      Map<Integer,String> hmap1= new HashMap<>();
      for(Map.Entry<Integer,String> mp: ls)
      {
          hmap1.put(mp.getKey(),mp.getValue());
      }
      for(Integer x : hmap1.keySet()){

      }

      for(Map.Entry<Integer,String> mp:hmap1.entrySet())
      {
          mp.getKey();
          mp.getValue();
      }

      hmap1.entrySet().forEach(x -> {
          x.getValue();
          x.getKey();
      });

      hmap1.entrySet().stream().filter(x -> x.getKey() > 5).forEach(y -> {
          y.getKey();
          y.getValue();
      });

      return hmap1;

    }

}
