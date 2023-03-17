package modelo;

import java.io.FileWriter;
import java.io.File;

import modelo.Utils;

import java.util.ArrayList;

public class Libreria {

	private Utils u = new Utils();
	public ArrayList<String>libros= new ArrayList<String>();
	
	
	
	public void add(String nombre, String autor, String id, 
					String categoria, String cantidad, String url)
	
	
	{
		char c = 34; //comillas dobles
		try {
			FileWriter f = new FileWriter(u.ruta+"\\Libros\\ArchivosJson\\"+nombre+".json");
			f.write("[{"+c+"nombre"+c+":"+c+nombre+c+","+"\n");
			f.write(c+"autor"+c+":"+c+autor+c+","+"\n");
			f.write(c+"id"+c+":"+c+id+c+","+"\n");
			f.write(c+"categoria"+c+":"+c+categoria+c+","+"\n");
			f.write(c+"cantidad"+c+":"+c+cantidad+c+","+"\n");
			f.write(c+"url"+c+":"+c+url+c+"\n"+"}]");
			f.close();
				
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	public void delete(String nombre)
	{

		File f = new File(u.ruta+"\\Libros\\ArchivosJson\\"+nombre+".json");
		f.delete();
			
		
	}
	
	public void search()
	{
		
	}
	
	public void modify()
	{
		
	}
	
	
}
