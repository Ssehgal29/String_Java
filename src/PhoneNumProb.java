public class PhoneNumProb {
    public static void main(String args[]){
        String num="1234512388";
        PhoneNumProb obj = new PhoneNumProb();
        obj.checkDifficulty(num);
    }
    private void checkDifficulty(String strNum){
        int count=0;
        for (int i=strNum.length()-1;i>=5;i--){
            if (strNum.charAt(i)==strNum.charAt(i-1)) {
                count++;
            } else if (strNum.charAt(i)==strNum.charAt(i-1)+1) {
                count++;
            } else if (strNum.charAt(i)==strNum.charAt(i-1)-1) {
                count++;
            } else {
                break;
                }
        }
        if (count==4) {
            System.out.println("Very Very Easy");
        } else if (count==3) {
            System.out.println("Very Easy");
        } else if (count==2) {
            System.out.println("Easy");
        } else {
            System.out.println("Not so Easy");
            }
    }
}
