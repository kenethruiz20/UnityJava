import java.util.Date; // (https://docs.oracle.com/javase/7/docs/api/)
import java.text.SimpleDateFormat; // (https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)
import java.util.*;

public class Task{

    /* Do not modify */
    private String msg_reminder, notes;
    private Date do_date;
    private int priority = 0;
    private boolean status = false;
    private String pattern = "yyyy-MM-dd";
    private SimpleDateFormat simpleDateFormat;

    /* Your code here */
    public Task(String msg_reminder){
        this.msg_reminder = msg_reminder;
        this.do_date = new Date();
    }

    public Task(String msg_reminder, int priority, Date do_date) {
        this.msg_reminder = msg_reminder;
        this.priority = priority;
        this.do_date = do_date;
    }

    public Task(String msg_reminder, int priority, Date do_date, String notes) {
        this.msg_reminder = msg_reminder;
        this.priority = priority;
        this.do_date = do_date;
        this.notes=notes;
    }

    public String getNotes(){
        return this.notes;
    }

    public int getPriority(){
        return this.priority;
    }

    public boolean getStatus(){
        return this.status;
    }

    public boolean markAsDone(){
        return this.status = true;

    }


    public String toString(){
        return "Task: " + this.msg_reminder + " Priority: " + this.priority + " Do Date: " + this.do_date;
    }

  }
