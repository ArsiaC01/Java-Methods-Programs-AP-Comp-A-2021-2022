package chapter09.timeclass;

// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
public class Time
{
    private int hour;
    private int minute;

    public Time(int hour, int minute)
    {
        if (hour >= 1 && hour <= 23)
            this.hour = hour;
        else
            this.hour = 0;
        if ( minute >= 0 && minute <= 59)
            this.minute = minute;
        else
            this.minute = 0;
    }
    private int toMins()
    {
        int total = hour * 60;
        total += minute;
        return total;
    }
    public boolean lessThan(Time time2)
    {
        if(time2.hour > hour)
            return false;
        else if(time2.hour == hour)
        {
            if(time2.minute > minute)
                return false;
            else
                return true;
        }
        else
            return true;
    }
    public int elapsedSince(Time time2)
    {
        int time2TimeInMins = time2.toMins();
        int time1TimeInMins = this.toMins();
        int totalTimeElapsedMins;
        if(time2TimeInMins > time1TimeInMins)
        {
            time2TimeInMins = (time2TimeInMins - 1440) * -1;
            totalTimeElapsedMins = time2TimeInMins + time1TimeInMins;
        }
        else
            totalTimeElapsedMins = time2TimeInMins - time1TimeInMins;
        return totalTimeElapsedMins;
    }
    public String ToString()
    {
        String statement;
        if(hour >= 12)
            statement = "The time is " + (hour - 12) + ":" + minute + "PM";
        else
            statement = "The time is " + hour + ":" + minute + "AM";

        return statement;
    }
}