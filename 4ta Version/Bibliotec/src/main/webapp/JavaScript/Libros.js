let array=[];

function crearLibro() {

	//Capturamos información del libro

	let nombre = $("#campoA").val();
	let autor = $("#campoB").val();
	let id = $("#campoC").val();
	let categoria = $("#campoD").val();
	let cantidad = $("#campoE").val();
	let url = $("#campoF").val();	

	$.ajax({

		url: 'C_Libros',
		data: {
			nombre: nombre,
			autor: autor,
			id: id,
			categoria: categoria,
			cantidad: cantidad,
			url: url
		},

		dataType: 'json',
		type: 'POST',

		success: function(rta) {
			

			
			array.push(rta)
			alert(array.length)
			if(array.length == 3)
			{
				paintCard(array)
			}

		},
		error: function(xhr, status) {
			alert('Disculpe, existió un problema');
		},
		complete: function(xhr, status) {
			alert('Petición realizada');
		}
	});
}

function paintCard(array) {

	for(let i = 0; i < array.length; i++)
	{
		let k=`
				<tr>
			      <td>${array[i].nombre}</td>
			      <td>${array[i].autor}</td>
			      <td>${array[i].id}</td>
			      <td>${array[i].categoria}</td>
			      <td>${array[i].cantidad}</td>
			      <td>${array[i].url}</td>
    			</tr>
				`
		$("#bodyTabla").append(k);
	}
	

}

function repaint() {
	var div = document.getElementById('');
	div.innerHTML = '';
	$("#respuesta")
}


function eliminarLibro() {

	//Capturamos información del libro

	let nombre = $("#nombreD").val();

	$.ajax({

		url: 'C_Libros',
		data: {
			nombre: nombre
		},
		type: 'DELETE',

		success: function(rta) {
			$("#respuestaEliminar").append("El resultado del server es: " + rta);
			alert("Se ha eliminado correctamente")
		},
		error: function(xhr, status) {
			alert('Disculpe, existió un problema');
		},
		complete: function(xhr, status) {
			alert('Petición realizada');
		}


	});
}



