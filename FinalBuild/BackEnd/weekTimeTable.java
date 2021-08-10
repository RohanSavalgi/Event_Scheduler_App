package FinalBuild.BackEnd;
public class weekTimeTable 
{
    static void multipleDay()
    {
        try
        {
            char yesNoDay;
            mainprocess.singleDayBlock();
            System.out.println("Do you wish continue to the next day : (Y/N)");
            yesNoDay = 'Y';
            
            if(yesNoDay == 'Y')
            {
                while(yesNoDay == 'Y')
                {
                    mainprocess.singleDayBlock();     
                    System.out.println("Do you wish continue to the next day : (Y/N)");               
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return;
        }
    }
}