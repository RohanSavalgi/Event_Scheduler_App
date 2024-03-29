package FinalBuild.BackEnd;
import java.util.*;
public class eventsFill
{
    static Vector<event> doneEvent = new Vector<event>();
    public static double remainingTime;
    public static int breakingeve = 0;
    static void eventAllocator()
    {
        double currentPriority = 0;
        double currentDuration = 0;
        event currentEvent = new event();
        System.out.println("\n\n-----------Event Considered are : ---------------");
        System.out.println("main duration : " + event.mainDuration);
        while(currentDuration < event.mainDuration)
        {
            currentEvent = prioritySelector.nextEvent();
            
            if(currentEvent == null)
            {
                break;
            }
            setTimings(currentEvent);
            if(currentDuration + currentEvent.duration <= event.mainDuration)
            {
                currentDuration += currentEvent.duration;
                currentPriority += currentEvent.proirity;
            }
            else
            {
                breakingeve = 1;
                currentPriority += ((currentEvent.ratio) * (event.mainDuration - currentDuration));
                System.out.println("The last event is performed for " + (event.mainDuration - currentDuration) + " minutes"); 
                currentDuration += (event.mainDuration - currentDuration);
                remainingTime = (event.mainDuration - currentDuration);
                //remainingTime      
            }
            doneEvent.add(currentEvent);
        }
        System.out.println("Final priority " + currentPriority);
        System.out.println("Final duration " + currentDuration);
    }
    static void setTimings(event eventOne)
    {
        eventOne.eventStartTime.setTime(event.startTime.getTime());
        event.startTime.add(Calendar.HOUR,eventOne.dhh);
        event.startTime.add(Calendar.MINUTE,eventOne.dmm);
    }
}