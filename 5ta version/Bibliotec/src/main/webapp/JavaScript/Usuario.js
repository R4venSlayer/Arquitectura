function crearUsuario(){
	
	//Capturamos información del usuario
	
	let nombre=$("#nombreReg").val();
	let apellido=$("#apellidoReg").val();
	let id=$("#cedulaReg").val();
	let edad=$("#edadReg").val();
	let telefono=$("#telefonoReg").val();
	let direccion=$("#dicReg").val();
	
	$.ajax({
    
    url : 'C_Registro',
    data : { nombre:nombre, 
    		 apellido:apellido, 
    		 id:id, 
    		 edad:edad,
    		 telefono:telefono,
    		 direccion:direccion},
    type : 'POST',
  
    success : function(rta) {
       $("#respuesta").append("usuario creado: "+rta);
       alert("usuario creado");
    },
    error : function(xhr, status) {
        alert('Disculpe, existió un problema');
    },
    complete : function(xhr, status) {
        alert('Petición realizada');
    }
});
}
