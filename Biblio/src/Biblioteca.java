import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro> libros;
	
	public Biblioteca(ArrayList<Libro>libros){
		this.libros = libros;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
	public boolean agregarLibro(Libro libro){
		if(!libros.contains(libro)){
			libros.add(libro);
			return true;
		}
		return false;
	}
	
	public void listarLibros(){
		System.out.println("Nombre del libro		Autor		Prestado");
		System.out.println("--------------------------------------------------------------"+"\n");
		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i).getNombre()+"		"+ libros.get(i).getAutor()+"		"+(libros.get(i).isPrestado()?"Prestado":"Disponible"));
		}
		System.out.println("\n"+"Fin de los registros");
	}
	
	public boolean prestarLibro(String nombre){
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getNombre().equals(nombre) && !libros.get(i).isPrestado()){
				libros.get(i).setPrestado(true);
				return true;
			}
		}
		return false;
	}
	
	public boolean retornarLibro(String nombre){
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getNombre().equals(nombre)){
				libros.get(i).setPrestado(false);
				return true;
			}
		}
		return false;
	}
}
