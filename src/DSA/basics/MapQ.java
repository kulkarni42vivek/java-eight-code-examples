package DSA.basics;
import java.util.*;
import java.util.stream.Collectors;

public class MapQ {
    public static void main(String[] args) {
        String s= "tree";
        Map<String , Integer> hmap = new HashMap<>();
        for(int i = 0 ; i< s.length() ; i++){
            hmap.put(String.valueOf(s.charAt(i)), hmap.getOrDefault(String.valueOf(s.charAt(i)), 0) + 1);
        }
//        LinkedHashMap<String, Integer> collect = hmap.entrySet().stream().sorted((o1, o2) -> {
//            if (o2.getValue() > o1.getValue()) {
//                return 1;
//            } else if (o2.getValue() < o1.getValue()) {
//                return -1;
//            } else {
//                return o1.getKey().compareTo(o2.getKey());
//            }
//        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (integer, integer2) -> integer, () -> new LinkedHashMap<>()));

        ArrayList<Map.Entry<String ,Integer>> alist = new ArrayList<>(hmap.entrySet());
        Collections.sort(alist, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o2.getValue() > o1.getValue()){
                    return 1 ;
                }
                else if (o2.getValue() < o1.getValue()){
                    return -1;
                }
                else{
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });
        List<String> all = new ArrayList<>();
        alist.forEach(x->{
            all.add(x.getKey());
        });
        System.out.println(all);
    }
}
