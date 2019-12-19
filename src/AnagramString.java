import java.util.Arrays;

public class AnagramString {
    public  static void main(String args[]){
        String s1="army";
        String s2="mary";
        AnagramString obj=new AnagramString();
        System.out.println("Both the strings are anagram : "+obj.isAnagram(s1,s2));
    }
    private boolean isAnagram(String s1, String s2){
        char strArray1[]=s1.toCharArray();
        char strArray2[]=s2.toCharArray();

        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        if (strArray1.length!=strArray2.length){
            return false;
        }else{
            return Arrays.equals(strArray1,strArray2);
        }
    }
}
