public class ReverseEachWordString {
    public static void main(String args[]){
        String str="hello sahil";
        ReverseEachWordString obj=new ReverseEachWordString();
        obj.reverseEachWord(str);
    }
    private void reverseEachWord(String str){
        String strArray[]=str.split(" ");
        String revString="";
        for (int i=0;i<strArray.length;i++){
            String words=strArray[i];
            String revWords="";
            for (int j=words.length()-1;j>=0;j--){
                revWords=revWords+words.charAt(j);
            }
            revString=revString+revWords+" ";
        }
        System.out.print(revString);
    }
}
