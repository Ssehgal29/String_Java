public class MirrorClockString {
    public static void main(String args[]){
        String clockTime="10:30";
        MirrorClockString obj=new MirrorClockString();
        obj.mirrorTime(clockTime);
    }
    private void mirrorTime(String time){
        String clockTime[] = time.split(":");

        int hour,min;
        hour = Integer.parseInt(clockTime[0]);
        min = Integer.parseInt(clockTime[1]);

        if (hour>12 || min>60){
            System.out.println("Enter correct input");
        }else {
            if (hour>=1&&hour<=12&&min>=1){
                hour=12-hour-1;
            }else if (hour>=1&&hour<=12&&min==0){
                hour=12-hour;
            }if (min>=1&&min<=60){
                min=60-min;
            }else if (min==0){
                min=0;
            }
            System.out.println(hour+":"+min);
        }
    }
}
