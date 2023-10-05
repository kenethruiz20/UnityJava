
public class Producto {

	private String nombre;
	private double precioUnitario;
	private int inventario;
	
	public Producto(String nombre, double precio, int inventario) {
		this.nombre = nombre;
		this.precioUnitario = precio;
		this.inventario = inventario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precioUnitario;
	}
	public void setPrecio(double precio) {
		this.precioUnitario = precio;
	}
	public int getCantidad() {
		return inventario;
	}
	public void setCantidad(int inventario) {
		this.inventario = inventario;
	}
	
	
}
