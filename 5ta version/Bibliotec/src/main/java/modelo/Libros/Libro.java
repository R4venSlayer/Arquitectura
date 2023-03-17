package modelo.Libros;

public class Libro {
	
	public String nombre;
	public String autor;
	public String id;
	public String categoria;
	public String cantidad;
	public String url;
	
	
	public Libro(String nombre, String autor, String id, String categoria, String cantidad, String url) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.id = id;
		this.categoria = categoria;
		this.cantidad = cantidad;
		this.url = url;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url) 
	{
		this.url = url;
	}
		
}
