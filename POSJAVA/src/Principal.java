import java.io.Console;
import java.util.ArrayList;

public class Principal {
	
	private static ArrayList<Venta> posKeneth = new ArrayList<>();
	private static ArrayList<Producto> inventario = new ArrayList<>();
	
	public static void main (String [] args){
	
		
		inventario.add(new Producto("CornFlakes",120000, 1000));
		
		Console c= System.console();
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("--------------- SISTEMA DE VENTAS KENETH ------------------");
		System.out.println("----------------------------------------------------------------------"+"\n");
		
		while(true){
			
	// Esta seria el menu principal del sistema de ventas		
			System.out.println("----------BIENVENIDO AL MENU PRINCIPAL---------:");
			System.out.println("1. inventario almacenado");
			System.out.println("2. Realizacion de Venta de productos");
			System.out.println("3. Resumen final de las ventas");
			int op = Integer.parseInt(c.readLine("Ingrese una opcion a continuacion:\n"));
// Si la opcion es 1 se dirigira a este area de inventario 
			if(op==1){
				listarProductos();
				System.out.println("\n--------------- Inventario Almacenado ----------------\n");
				System.out.println("Porfavor elige una de las siguientes opciones: ");
// Espacios entre texto para diferenciar 
				System.out.println(" ");
				System.out.println(" ");
//Opciones
				System.out.println("1. Agregar nuevo producto al inventario ");
				System.out.println("2. Realizar una modificacion con respecto a la cantidad inventariada");
				System.out.println("3. Regeresar al menu ");
				
//Si la opcion es 2 se dirigira  esta area que es  la realizacion de ventas de productos
				int op2 =  Integer.parseInt(c.readLine("elija lo deseado a continuacion porfavor:\n"));
				// Espacios entre texto para diferenciar 
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				if(op2==1){
					String nombre =  c.readLine("Nombre del producto:");
					double precio =  Double.parseDouble(c.readLine("Precio del producto:"));
					int cantidad =  Integer.parseInt(c.readLine("Cantidad disponible:"));
					Producto p = new Producto(nombre, precio, cantidad);
					inventario.add(p);
					System.out.println("\n El producto "+p.getNombre()+" se adjunto a existencias - existencias:"+ p.getCantidad()+"\n");
//apartado para realizar modificaciones en los productos
				}else if(op2==2){
					listarProductos();
					int idProducto =  Integer.parseInt(c.readLine("\n  Porfavor ingrese a continuacion el ID del producto del cual se desea modificar la canatidad: "));
					Producto p = inventario.get(idProducto);
					int cantidadNueva =  Integer.parseInt(c.readLine("\n Porfavor ingresar la nueva cantidad: "));
					p.setCantidad(cantidadNueva);
					System.out.println("\n El producto "+p.getNombre()+ "cuenta con una existencia de : "+ p.getCantidad()+"\n");
				} 
			}
// En este bloque de codigo vamos a ver el resumen de ventas
			else if(op==2){
				System.out.println("---------------- VENTAS ----------------\n");
				System.out.println("1. Adjuntar una nueva venta");
				System.out.println("2. Regresar");
				int op3 =  Integer.parseInt(c.readLine("\nPorfavor ingresar una opcion a continuacion:\n"));
				if(op3==1){
					boolean masVentas = true;
					Venta v = new Venta(new ArrayList<ItemVenta>(), 0);
					while(masVentas){
					listarProductos();
					int idProducto = Integer.parseInt(c.readLine("Ingresa el id del producto a vender"));
					Producto p = inventario.get(idProducto);
					int cantidad =  Integer.parseInt(c.readLine("\n Cantidad que se debe vender: "));
//MARCARA ERROR YA QUE NO HAY LAS EXISTENCIAS SUFICIENTES PARA EJECUTAR LA ACCION
					if(cantidad>p.getCantidad()){
						System.out.println("\n INSUFICIENTES EXISTENCIAS, favor volver a probar ("+p.getCantidad()+" disponibles). \n");
					}
					else{
						ItemVenta iv = new ItemVenta(cantidad, p, cantidad * p.getPrecio());
						v.agregarItem(iv);
						inventario.get(idProducto).setCantidad(inventario.get(idProducto).getCantidad()-cantidad);
						masVentas = (Integer.parseInt(c.readLine("¿ Desea agregar mas productos a esta venta? (0 para no, 1 para si)")) == 0)? false : true;
					}
					}

//APARTADO DE RESUMENES 
					System.out.println("");
					posKeneth.add(v);
					System.out.println("----------------------------------------------------------------------");
					System.out.println("----------------------- RESUMEN REGISTRADO --------------------------");
					System.out.println("----------------------------------------------------------------------"+"\n");
					v.imprimirFactura();
				}
			}
			else if(op ==3){
				imprimirListadoDeVentas();
			}
		}

	}
//BACKEND
	
	public static void listarProductos(){
		System.out.println("Id       Nombre        Precio por unidad.        Existencia");
		System.out.println("----------------------------------------------------------------"+"\n");
		for(int i =0; i< inventario.size();i++){
			System.out.println(i+"        "+inventario.get(i).getNombre()+"        "+inventario.get(i).getPrecio()+"        "+inventario.get(i).getCantidad());
		}
	}
//RESUMEN DE VENTAS 
	public static void imprimirListadoDeVentas(){
		System.out.println(" ");
		System.out.println("----------------------------RESUMEN de  VENTAS ------------------------------------------");
		for (int i = 0; i < posKeneth.size(); i++) {
			System.out.println("Venta #"+(i+1)+"     Total de "+posKeneth.get(i).getPrecioTotal()+"\n");
		}
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(" ");

	}
}
