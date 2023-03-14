function peticion(){
	
	//Capturamos información del libro
	
	let nombre=$("#campoA").val();
	let autor=$("#campoB").val();
	let id=$("#campoC").val();
	let categoria=$("#campoD").val();
	let cantidad=$("#campoE").val();
	
	$.ajax({
    
    url : 'C_Libros',
    data : { nombre:nombre, 
    		 autor:autor, 
    		 id:id, 
    		 categoria:categoria,
    		 cantidad:cantidad},
    type : 'GET',
  
    success : function(rta) {
       $("#respuesta").append("El resultado del server es: "+rta);
       alert(rta)
    },
    error : function(xhr, status) {
        alert('Disculpe, existió un problema');
    },
    complete : function(xhr, status) {
        alert('Petición realizada');
    }
});
}


function eliminarLibro()
{
		//Capturamos información del libro
	
	let =$("#campoA").val();
}