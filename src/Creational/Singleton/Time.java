package Creational.Singleton;

public class Time {
    private static Time time;
    private static int hours;

    public static synchronized Time getTime(){
        if(time == null) {
            time = new Time();
        }

        return time;
    }

    private Time(){}

    public void setTime(int hours){
        this.hours = hours;
    }

    @Override
    public String toString(){
        return Integer.toString(hours);
    }
}
