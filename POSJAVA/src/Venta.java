import java.util.ArrayList;

public class Venta {

	private ArrayList<ItemVenta>productos;
	private double precioTotal;
	
	public Venta(ArrayList<ItemVenta> productos, double precioTotal) {
		this.productos = productos;
		this.precioTotal = precioTotal;
	}
	
	public ArrayList<ItemVenta> getProducto() {
		return productos;
	}
	
	public void setProducto(ArrayList<ItemVenta> productos) {
		this.productos = productos;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public boolean agregarItem(ItemVenta item){
		if(item.getCantidad() <= item.getProducto().getCantidad())
			if(!productos.contains(item)){
				productos.add(item);
				double nuevoPrecio = getPrecioTotal() + item.getPrecio();
				this.setPrecioTotal(nuevoPrecio);
				return true;
			}
		return false;
	}
	
	public boolean removerItem(int indice){
			if(productos.get(indice) !=null){
				productos.remove(indice);
				return true;
			}
		return false;
	}
	
	public void imprimirFactura(){  
		System.out.println("Producto		Cantidad		Precio Unitario		Total");
		System.out.println("-------------------------------------------------------------------------------------------");
		for(int i=0; i<productos.size();i++){
			System.out.println(productos.get(i).getProducto().getNombre()+"                        "+productos.get(i).getCantidad()+"                   "+productos.get(i).getProducto().getPrecio()+"                    "+productos.get(i).getPrecio()+"\n");
		}
		System.out.println("Precio Final: "+ precioTotal);
		
	}
}
