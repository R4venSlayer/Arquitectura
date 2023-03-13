package modelo;

import modelo.Usuario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


import com.google.gson.Gson;
import com.google.gson.*;
public class Archivo {

	private Usuario u;
	public Usuario lecturaFichero()
	{
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      
		try {
	         
	         archivo = new File ("C:\\Users\\R4ven\\eclipse-workspace\\Bibliotec\\src\\main\\java\\modelo\\usuario.json");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         Gson gson = new Gson();
	         
	  

	         // Lectura del fichero
	         String linea;
	         String res = "";
	         while((linea=br.readLine())!=null)
	         {
	        	 System.out.println(linea);
	        	 res += linea;
	         }
	         System.out.println(res);
	         u = gson.fromJson(res, Usuario.class);
	            
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }

      
        return u;
	}
}
