// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.

/**
 * A class representing the time of day in hours and minutes.
 */
public class Time {
    private final int hours;
    private final int minutes;

    /**
     * Constructs a {@link Time} by hours and minutes using military time, e.g., 23:00 instead of 11:00 PM.
     * @param hours The hour of day. Defaults to zero if an hour not between 0 and 23 is not given.
     * @param minutes The minute. Defaults to zero if a minute not between 0 and 59 is not given.
     */
    public Time(int hours, int minutes) {
        if (hours < 0 || hours > 23) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }
        if (minutes < 0 || minutes > 59) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    /**
     * @return The minutes since the day has started.
     */
    private int toMins() {
        return (hours * 60) + minutes;
    }

    /**
     * Compares this {@link Time} with another.
     * @param other Another {@link Time} object.
     * @return {@code true} if this time is strictly earlier than the {@code other} time.
     */
    public boolean lessThan(Time other) {
        return this.toMins() < other.toMins();
    }

    /**
     * Calculates the minutes that have passed at this time since the {@code other} time.
     * <p>
     * This method assumes that the {@code other} time is always before this time, so if a time later in the day is
     * given, this will assume that that time is in the previous day.
     * @param other Another {@link Time} object.
     * @return The amount of minutes elapsed.
     */
    public int elapsedSince(Time other) {
        if (other.toMins() > this.toMins()) {
            final int minutesInDay = 1440;
            return this.toMins() - (other.toMins() - minutesInDay);
        } else {
            return this.toMins() - other.toMins();
        }
    }

    @Override
    public String toString() {
        String zero = "";
        if (minutes < 10) {
            zero = "0"; // Add a zero with single-digit minutes, or else times can show up as 12:0 or 3:8.
        }

        // Displays in civilian time.
        if (hours == 0) {
            return "The time is 12:" + zero + minutes + " AM.";
        } else if (hours < 12) {
            return "The time is " + hours + ":" + zero + minutes + " AM.";
        } else if (hours == 12) {
            return "The time is 12:" + zero + minutes + " PM.";
        } else {
            return "The time is " + (hours - 12) + ":" + zero + minutes + " PM.";
        }
    }
}