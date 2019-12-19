public class ReverseStringWordWise {
    public static void main(String args[]){
        String str="hello sahil how are you";
        ReverseStringWordWise obj=new ReverseStringWordWise();
        obj.reverseWordWise(str);
    }
    private void reverseWordWise(String str){
        String strArray[]=str.split(" ");
        for (int i=strArray.length-1;i>=0;i--){
            System.out.print(strArray[i]+" ");
        }
    }
}
