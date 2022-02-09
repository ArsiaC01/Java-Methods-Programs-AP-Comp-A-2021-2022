/*import java.io.IOException;

public class SampleCode
{

    private int hour;
    private int minute;
    public SampleCode()
    {
        hour = 0;
        minute = 0;
    }


    public SampleCode(int h, int m)
    {
        if ( h >= 1 && h <= 23)
            hour =h;
        else
            hour = 0;
        if ( m >= 0 && m <= 59)
            minute = m;
        else
            minute = 0;
    }



    public String toString()
    {
        String s = "";
        if ( hour < 10 && minute < 10)
            s = "0" + hour + "0" + minute;
        else if ( hour < 10 && minute > 10)
            s = "0" + hour + minute;
        else if ( hour > 10 && minute < 10)
            s = hour + "0" + minute;
        else if ( hour > 10 && minute > 10)
            s = hour +""+ minute;
        else if ( hour == 0)
            s = "0" + hour + minute;
        else if ( minute == 0)
            s = hour + "0" + minute;

        return s;

    }

    public String convert()
    {
        String c = "";

        if (hour >11)
        {
            if (hour == 12)
            {
                c = hour +":"+ minute + " PM";
            }
            if (hour > 12)
            {
                c = (hour - 12) +":"+ minute + " PM";
            }
        }
        else if (hour == 0)
        {
            c = (hour+12) +":"+ minute + " AM";
        }

        else
             c = hour +":"+ minute + " AM";











        if(minute < 10)
        {
            c= c.substring(0, c.length()-4)+"0"+minute+" "+c.substring(c.length()-2, c.length());
        }
        return c;
    }
    public void increment()
    {
        if (hour == 23 && minute == 59)
        {
            hour = 0;
            minute = 0;
        }
        else
        {
        minute++;
        if (minute == 60)
        {
            hour++;
            minute = 0;
        }
        else if ( hour == 24)
            hour = 0;
        }
    }

     public static void main(String str[]) throws IOException
     {

         SampleCode time1 = new SampleCode(14, 56);
          System.out.println("time1: " + time1);
          System.out.println("convert time1 to standard time: " + time1.convert());
          System.out.println("time1: " + time1);
          System.out.print("increment time1 five times: ");
          time1.increment();
          time1.increment();
          time1.increment();
          time1.increment();
          time1.increment();
          System.out.println(time1 + "\n");

          SampleCode time2 = new SampleCode(-7, 12);
          System.out.println("time2: " + time2);
          System.out.print("increment time2 67 times: ");
          for (int i = 0; i < 67; i++)
           time2.increment();
          System.out.println(time2);
          System.out.println("convert to time2 standard time: " + time2.convert());
          System.out.println("time2: " + time2 + "\n");


          SampleCode time3 = new SampleCode(5, 1);
          System.out.println("time3: " + time3);
          System.out.print("convert time3: ");
          System.out.println(time3.convert());

          SampleCode time4 = new SampleCode(12, 15);
          System.out.println("\ntime4: " + time4);
          System.out.println("convert time4: " + time4.convert());

          SampleCode time5 = new SampleCode(0, 15);
          System.out.println("\ntime5: " + time5);
          System.out.println("convert time5: " + time5.convert());

          SampleCode time6 = new SampleCode(24, 15);
          System.out.println("\ntime6: " + time6);
          System.out.println("convert time6: " + time6.convert());

          SampleCode time7 = new SampleCode(23,59);
          System.out.println("\ntime7: " + time7);
          System.out.println("convert time7: " + time7.convert());
          time7.increment();
          System.out.println("increment time7: " + time7);
          System.out.println("convert time7: " + time7.convert());

     }

}*/