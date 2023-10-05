import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.util.*;
public class Runner {
  public static void main(String[] args)throws Exception {
    Scanner sn = new Scanner(System.in);
    Scanner ss = new Scanner(System.in);
    String mensaje,notas,nombrelista;
    int flag=0;
    String fecha="";
    int opcion=0;
    int opcion2=0;
    int prioridad;
    System.out.println(" Favor de ingresar el nombre de la TaskList");
    nombrelista=ss.nextLine();
    TaskList miListaDeTasks=new TaskList(nombrelista);
    while(opcion!=4)
    {
      opcion2=0;
      System.out.println("Favor de ingresar la opcion que se desea realizar");
      System.out.println("1.Crear un Task nuevo y añadirlo a alguna TaskList con existencia");
      System.out.println("2. Tasklist vacia");
      System.out.println("3. Listar los tasks");
      System.out.println("4. Salida");
      opcion = sn.nextInt();
      if(opcion==1)
      {
        while(opcion2!=4)
        {
        System.out.println("Favor de ingresar la opcion a realizar");
        System.out.println("1. Hacer un task que posea un mensaje de recordatorio");
        System.out.println("2. Hacer un task que posea un mensaje de recordatorio que contenga ademas prioridad, fecha");
        System.out.println("3. Hacer un task que posea un mensaje de recordatorio,que contenga ademas prioridad, fecha, notas");
        System.out.println("4.Salida");
        opcion2=sn.nextInt();
        if(opcion2==1)
        {
          System.out.println("Favor de ingresar el mensaje de recordatorio deseado");
          mensaje=ss.nextLine();
          Task myTask = new Task(mensaje);
          miListaDeTasks.addTask(myTask);
        }
        if(opcion2==2)
        {
          System.out.println("Favor de ingresar el mensaje de recordatorio deseado");
          mensaje=ss.nextLine();
          System.out.println("Favor de ingresar la prioridad del 1 al 3 deseada");
          prioridad=sn.nextInt();
          System.out.println("Favor de ingresar la fecha con el siguiente formato yyyy-MM-dd");
          fecha=ss.nextLine();
          Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
          Task myTask = new Task(mensaje,prioridad,date1);
          miListaDeTasks.addTask(myTask);

        }
        if(opcion2==3)
        {
          System.out.println("Favor de ingresar el mensaje de recordatorio deseado");
          mensaje=ss.nextLine();
          System.out.println("Favor de Ingresar la prioridad del 1 al 3 deseada");
          prioridad=sn.nextInt();
          System.out.println("Favor de Ingresar la fecha con el siguiente formato yyyy-MM-dd");
          fecha=ss.nextLine();
          System.out.println("Favor de ingresar las notas extras");
          notas=ss.nextLine();
          Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
          Task myTask = new Task(mensaje,prioridad,date1,notas);
          miListaDeTasks.addTask(myTask);
        }

        }
      }

      if(opcion==2)
      {
        System.out.println("Favor de ingresar el nombre de la Tasklist");
        nombrelista=ss.nextLine();
        miListaDeTasks=new TaskList(nombrelista);
      }

      if(opcion==3)
      {
        miListaDeTasks.printList();
      }
    }



  }
}
