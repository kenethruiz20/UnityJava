import java.io.Console;
import java.util.ArrayList;

public class Principal{
	public static void main (String [] args){
		
		Biblioteca b = new Biblioteca(new ArrayList<>());
		
		Console c= System.console();
		
		boolean ejecutar= true;

		while(ejecutar){
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("---BIENVENIDO A LA BIBLIOTECA DE LA UNIVERSIDAD FRANCISCO MARROQUIN---");
		System.out.println("----------------------------------------------------------------------"+"\n");

		System.out.println("Menu principal:");
		System.out.println("1. Listar libros");
		System.out.println("2. Agregar nuevo libro");
		System.out.println("3. Prestar libro existente");
		System.out.println("4. Retornar libro");
		System.out.println("5. Salir");

		
		int op = Integer.parseInt(c.readLine("Ingrese una opción a continuación:"));
		System.out.println(" ");

		if(op==1){
			b.listarLibros();
		}
		if(op==2){
			String nombre = c.readLine("Ingresa el nombre del libro:");
			String autor =  c.readLine("Ingresa el nombre del autor:");
			boolean agrego = b.agregarLibro(new Libro(nombre,autor,false));
			if(agrego){
				System.out.println("El libro "+ nombre+" se agrego exitosamente");
			}else{
				System.err.println("Error agregando el nuevo libro");
			}
		}
		if(op==3){
			String nombre = c.readLine("Ingresa el nombre del libro a prestar:");
			boolean presto = b.prestarLibro(nombre);
			if(presto){
				System.out.println("El libro "+nombre+" cambió su estado a PRESTADO - NO DISPONIBLE");
			}
			else{
				System.err.println("El libro no está disponible en la biblioteca");

			}
		}
		if(op==4){
			String nombre = c.readLine("Ingresa el nombre del libro a retornar:");
			boolean retorno = b.retornarLibro(nombre);
			if(retorno){
				System.out.println("El libro "+nombre+" cambió su estado a DISPONIBLE");
			}
			else{
				System.err.println("No existe el libro con el nombre diligenciado");

			}
		}
		
		else{
			ejecutar = false;
		}
		
		}
		
		System.out.println("\n"+"FINALIZANDO SESION DEL SISTEMA");
	}
}