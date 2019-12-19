public class AddClockHourString {
    public static void main(String args[]){
        String clockTiming="12:05:35";
        String addTime="13:30:30";
        AddClockHourString obj = new AddClockHourString();
        obj.afterAdditionTime(clockTiming,addTime);
    }
    private void afterAdditionTime(String strClockTime,String strAddTime){

        String arrClockTime[]=strClockTime.split(":");
        String arrAddTime[]=strAddTime.split(":");

        int clockHour,clockMin,clockSec,addHour,addMin,addSec,finalHour=0,finalMin=0,finalSec=0;
        clockHour= Integer.parseInt(arrClockTime[0]);
        clockMin= Integer.parseInt(arrClockTime[1]);
        clockSec= Integer.parseInt(arrClockTime[2]);
        addHour= Integer.parseInt(arrAddTime[0]);
        addMin= Integer.parseInt(arrAddTime[1]);
        addSec= Integer.parseInt(arrAddTime[2]);

        if (clockHour>24 || clockMin>60 || clockSec>60 || addHour>24 || addMin>60 || addSec>60){
            System.out.println("Enter Correct Input");
        }else {
            finalHour = clockHour+addHour;
            finalMin = clockMin+addMin;
            finalSec = clockSec+addSec;
            if (finalSec>=60){
                finalMin++;
                finalSec=finalSec-60;
            }if (finalMin>=60){
                finalHour++;
                finalMin=finalMin-60;
            }if (finalHour>24){
                finalHour=finalHour-24;
            }
            System.out.println(finalHour+":"+finalMin+":"+finalSec);
        }
    }
}
