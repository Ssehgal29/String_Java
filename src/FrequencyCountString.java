import java.util.HashMap;
import java.util.Set;

public class FrequencyCountString {
    public static void main (String args[]){
        String str="aabbcccdddeefffgggghiiiyh";
        FrequencyCountString obj=new FrequencyCountString();
        obj.countFrequency(str);
    }
    private void countFrequency(String str){
        char charArray[]=str.toCharArray();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (char c:charArray){
            if (hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }else {
                hashMap.put(c,1);
            }
        }
        Set<Character> setChar=hashMap.keySet();
        for (char c:setChar){
            if (hashMap.get(c)>0){
                System.out.println(c+" "+hashMap.get(c));
            }
        }
    }
}
