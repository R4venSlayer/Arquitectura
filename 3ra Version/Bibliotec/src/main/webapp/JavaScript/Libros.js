function crearLibro(){
	
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
    
  	dataType: 'json',
    type : 'POST',
  
    success : function(rta) {
      paintCard(rta)
    },
    error : function(xhr, status) {
        alert('Disculpe, existió un problema');
    },
    complete : function(xhr, status) {
        alert('Petición realizada');
    }
});
}

function paintCard(rta)
{
	let k = `
				<table>
  					<thead>
    				<tr>
      					<th>Nombre</th>
      					<th>Autor</th>
      					<th>Id</th>
    				</tr>
 					 </thead>
 					 <tbody>
    					<tr>
					      <td>${rta.nombre}</td>
					      <td>${rta.autor}</td>
					      <td>${rta.id}</td>
					    </tr>
					 </tbody>
	
	`
	$("#respuesta").append(k);
	
		
}

function repaint()
{
	var div = document.getElementById('');
	div.innerHTML = '';
	$("#respuesta")
}


function eliminarLibro(){
	
	//Capturamos información del libro
	
	let nombre=$("#nombreD").val();
	
	$.ajax({
    
    url : 'C_Libros',
    data : { nombre:nombre
    	   },
    type : 'DELETE',
  
    success : function(rta) {
       $("#respuestaEliminar").append("El resultado del server es: "+rta);
       alert("Se ha eliminado correctamente")
    },
    error : function(xhr, status) {
        alert('Disculpe, existió un problema');
    },
    complete : function(xhr, status) {
        alert('Petición realizada');
    }
    
    
});
}



