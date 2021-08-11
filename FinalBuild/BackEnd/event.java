package FinalBuild.BackEnd;
import java.text.SimpleDateFormat;
import java.util.*;
public class event
{
    static String eventDay;
    int flag;
    public String day;
    public String name;//
    public int duration;//
    static int mhh,mmm; 
    static int mainDuration;
    public int dhh,dmm;
    int proirity;
    public static int eventsCounter = 0;
    double ratio;
    public static Calendar startTime = Calendar.getInstance();
    public Calendar eventStartTime = Calendar.getInstance();
    SimpleDateFormat commonDateFormat = new SimpleDateFormat("hh:mm a");

    public event()
    {
        eventsCounter++;
        flag = 0;
    }

    public void collectData(event thisEvent)
    {
        name = FinalBuild.FrontEnd.compile.nameOfEvent;
        dhh = FinalBuild.FrontEnd.compile.dhEvent;
        dmm = FinalBuild.FrontEnd.compile.dmEvent;
        System.out.println(name);
        priorityBucket.priorityBucketSelector(thisEvent);
        minuteConvertor();
    }
    public void displayData()
    {
        System.out.println("\nThe Event detail are : ");
        System.out.println("Name : " + name);
        System.out.println("Starting Time : " + commonDateFormat.format(eventStartTime.getTime()));
        System.out.println("Duration : " + duration);
        System.out.println("Priority : " + proirity);
        System.out.println("Ratio : " + ratio);
        System.out.println("Flag : " + flag);
    }
    public static void getStartingTime()
    {
        int HH,mm;
        HH = FinalBuild.FrontEnd.compile.startingHour;
        mm = FinalBuild.FrontEnd.compile.startingMin;
        startTime.set(2021, 7, 12, HH , mm);
        mhh = FinalBuild.FrontEnd.compile.dHour;
        mmm = FinalBuild.FrontEnd.compile.dMin;
        eventDay = FinalBuild.FrontEnd.compile.day;
        mainDuration = 0;
        if(mhh == 0)
        {
            mainDuration = mmm;
        }
        else
        {
            mainDuration += ((mhh * 60) + mmm);
        }
    }
    int minuteConvertor()
    {
        duration = 0;
        if(dhh == 0)
        {
            duration = dmm;
        }
        else
        {
            duration += ((dhh * 60) + dmm);
        }
        return duration;
    }
}