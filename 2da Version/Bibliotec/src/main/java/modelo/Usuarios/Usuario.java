package modelo.Usuarios;

public class Usuario {

	private String uname;
	private String upass;
	private String uemail;
	
	public Usuario(String uname, String upass, String uemail) {
		
		this.uname = uname;
		this.upass = upass;
		this.uemail = uemail;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	@Override
	public String toString() {
		return "Usuario [uname=" + uname + ", upass=" + upass + ", uemail=" + uemail + "]";
	}
	
	
	
}
