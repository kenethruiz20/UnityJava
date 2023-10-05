
public class Libro {

	private String nombre;
	private String autor;
	private boolean prestado;
	
	public Libro(String nombre, String autor, boolean prestado) {
		this.nombre = nombre;
		this.autor = autor;
		this.prestado = prestado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
}
