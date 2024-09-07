public class MyTime {

    public int hours;
    public int minutes;
    public int seconds;
    private boolean meredian; //not true or false //must be AM and PM
}

public class MyTime {

    private int hours;
    public int minutes;
    private int seconds;

    public void setHours(int hours){
        //encapsulation
        this.hours = (hours <= 12 && hours > 0) ? hours : 12; //refering to accessing all the methods and itself?
    }

    //to retrieva value
    public int getHours(){ //no other variable in getHours //a local within a scope
        return hours; //this.hours also works. but it's only 1 so not needed?
    }
}

public class myFirstProject {

    public static void main(String() argv){
        MyTime t = new MyTime(); // constructor

        t.setHours(12);
        t.setMinutes(30);
        t.setSeconds(100);
        MyTime = x;

        x = t;
        // t.hours = 10;
        // t.minutes = 1-;
         t.setHours(10);

        // System.out.println(t.hours + "i" + t.minutes);
        System.out.println(t.getHours());
        //System.out.println(t.toString());

        x.setHours(6);
        System.Out.println(t);
    }
}

public void setMinutes(int minutes){
    this.minutes = minutes < 60 && minutes >= 0) ? minutes: 0;

}


//override
@override
String toString(){
    return String.format("$address something,", hours, minutes, seconrds);
}

public MyTime(int hrs, int min, int sec){
    setHours(Hrs);
    setMinutes(Min);
    setSeconds(sec);
}

//assignment
public void tickBySecond() {}

public void tickByMinute() {}

public void tickByHour() {}

public void advanceTime(int seconds) {} //place how many seconds are you asking

