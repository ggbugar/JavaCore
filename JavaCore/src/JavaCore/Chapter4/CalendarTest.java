package JavaCore.Chapter4;
import java.util.*;
import java.text.DateFormatSymbols;

/**
 * java.util.GregorianCalendar API
 *GregorianCalendar()
 * GregorianCalendar(int year,int month,int day)
 * GregorianCalendar(int year,int month,int day,int hour,int minutes,int seconds)
 * int get(int field)
 * void set(int field,int value)
 * void set(int year,int month,int day)
 * void set(int year,int month,int day,int hour,int minutes,int seconds)
 * void add(int field,int amount)
 * int getFirstDayOfWeek()
 * void setTime(Date time)
 * Date getTime()
 */

/**
 * java.text.DateFormatSymbols important API for Date
 * String[] getShortWeekdays()
 * String[] getShortMonths()
 * String[] getWeekdays()
 * String[] getMonths()
 */

public class CalendarTest {
    public static void main(String[] args) {
        //construct d as current date
        GregorianCalendar d=new GregorianCalendar();

        int today =d.get(Calendar.DAY_OF_MONTH);
        int month=d.get(Calendar.MONTH);

        //set d to start of the month
        d.set(Calendar.DAY_OF_MONTH,1);

        int weekday=d.get(Calendar.DAY_OF_WEEK);

        //get first day of week(Sunday in the US)
        int firstDayOfWeek=d.getFirstDayOfWeek();

        //determine the required indentation for the first line
        int indent=0;
        while(weekday!=firstDayOfWeek){
            indent++;
            d.add(Calendar.DAY_OF_WEEK,-1);
            weekday=d.get(Calendar.DAY_OF_WEEK);
        }

        //print weekday names
        String[] weekdayNames=new DateFormatSymbols().getShortWeekdays();
        do{
            System.out.printf("%4s",weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday=d.get(Calendar.DAY_OF_WEEK);
        }while(weekday!=firstDayOfWeek);
        System.out.println();

        for (int i=1;i<=indent;i++){
            System.out.println("   ");
        }

        d.set(Calendar.DAY_OF_MONTH,1);

        do{
            //print day
            int day=d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d",day);

            //mark current day with *
            if (day==today){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

            //advance d to the next day
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday=d.get(Calendar.DAY_OF_WEEK);

            //start a new line at the start of the week
            if (weekday==firstDayOfWeek)
                System.out.println();
        }while(d.get(Calendar.MONTH)==month);
        //the loop exits when d is day 1 of the next month

        //print final end of line if necessary
        if (weekday!=firstDayOfWeek)
            System.out.println();
    }
}
