package modelo.Usuarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.Utils;
import modelo.Libros.Libro;
import modelo.Usuarios.Usuario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.*;

public class Login {

	private Utils u = new Utils();
	public Usuario lecturaFichero(String a, String b) throws IOException, JSONException {	      
		
		String carpeta = u.ruta+"\\Usuarios\\ArchivosJson";
	    File directorio = new File(carpeta);
	    Usuario u = new Usuario();
	    
	    for (File archivo : directorio.listFiles()) {

	    	if (archivo.isFile() && archivo.getName().endsWith(".json")) {
	            String contenido = new String(Files.readAllBytes(archivo.toPath()));

	            JSONArray arregloJson = new JSONArray(contenido);

	            // Procesar los elementos del arreglo
	            for (int i = 0; i < arregloJson.length(); i++) {
	                // Obtener el elemento actual del arreglo
	                JSONObject elemento = arregloJson.getJSONObject(i);

	                // Acceder a las propiedades del elemento
	                String propiedad1 = elemento.getString("nombre");
	                int propiedad2 = elemento.getInt("id");
	                String propiedad3 = elemento.getString("usuario");
	                String propiedad4 = elemento.getString("contraseña");

	                if(propiedad3.equals(a) && propiedad4.equals(b)) {
	                	u.setNombre(propiedad1);
	                	u.setId(String.valueOf(propiedad2));
	                	u.setUsuario(propiedad3);
	                	u.setContraseña(propiedad4);
	                	return u;
	                	
	                }
	            }
	        }
	    }
		return null;		
	}

	public Libro lecturalibro(String a) throws IOException, JSONException {	      
			
			String carpeta = u.ruta+"\\Libros\\ArchivosJson";
		    File directorio = new File(carpeta);
		    Libro l;
		    
		    for (File archivo : directorio.listFiles()) {
	
		    	if (archivo.isFile() && archivo.getName().endsWith(".json")) {
		            String contenido = new String(Files.readAllBytes(archivo.toPath()));
	
		            JSONArray arregloJson = new JSONArray(contenido);
	
		            // Procesar los elementos del arreglo
		            for (int i = 0; i < arregloJson.length(); i++) {
		                // Obtener el elemento actual del arreglo
		                JSONObject elemento = arregloJson.getJSONObject(i);
	
		                // Acceder a las propiedades del elemento
		                String nombre = elemento.getString("nombre");
		                String id = elemento.getString("id");
		                String autor = elemento.getString("autor");
		                String cantidad = elemento.getString("cantidad");
		                String categoria = elemento.getString("categoria");
		                String url = elemento.getString("url");
	
		                if(id.equals(a)) {
		                	l = new Libro(nombre, autor, id, categoria, cantidad, url);
		                	return l;
		                	
		                }
		            }
		        }
		    }
			return null;		
		}
}
