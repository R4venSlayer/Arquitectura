package modelo.Usuarios;

import java.io.FileWriter;
import java.util.ArrayList;

import modelo.Utils;

public class GestionUsuarios {

	private Utils u = new Utils();
	
	
	public void add(String nombre, String apellido, String cc, String edad,
					String telefono, String direccion)

	{
		char c = 34; //comillas dobles
		try {
			FileWriter f = new FileWriter(u.ruta+"\\Usuarios\\ArchivosJson\\"+nombre+".json");
			f.write("{"+c+"nombre"+c+":"+c+nombre+c+","+"\n");
			f.write(c+"apellido"+c+":"+c+apellido+c+","+"\n");
			f.write(c+"cc"+c+":"+c+cc+c+","+"\n");
			f.write(c+"edad"+c+":"+c+edad+c+","+"\n");
			f.write(c+"telefono"+c+":"+c+telefono+c+","+"\n");
			f.write(c+"direccion"+c+":"+c+direccion+c+"\n"+"}");
			f.close();
				
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}
