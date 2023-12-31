import java.util.LinkedList; // (https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html)
import java.util.Collections; // (https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html)
import java.util.Comparator; // (https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)
import java.util.*;

public class TaskList{


    /* Do not modify */
    private String name;
    private LinkedList<Task> tasks = new LinkedList<Task>();

    /* Your code here */
    public TaskList(String name) {
        this.name = name;
    }

    public TaskList(String name, Task task) {
        this.name = name;
        this.tasks.add(task);
    }

    public boolean addTask(Task task){
        return this.tasks.add(task);
    }

    public void sortByPriority(){
        Collections.sort(this.tasks, Comparator.comparingInt((Task task) -> task.getPriority()).reversed());
    }

    public void printList(){
      System.out.println(tasks.toString());
       /* Your code here */
    }

}
