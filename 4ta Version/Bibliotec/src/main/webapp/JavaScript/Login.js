function peticion(){
	//Capturar datos!
	let a=$("#campoA").val();
	let b=$("#campoB").val();

	$.ajax({
    
    url : 'C_Login',
    data : {a:a, b:b},
    type : 'GET',
  
    success : function(rta) {
       $("#respuesta").append("El resultado del server es: "+rta);
       if(rta != null)
       {
		   location.href = "GestionLibros.html" 
	   }
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