<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Historial Usuarios</title>
</head>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-Latest.js">
</script>
<script type="text/javascript">
$(document).ready(function(){
    
    
    $.post('ServeletHistorialUsuario',{

    },function(respose){
    let datos = JSON.parse(respose);
    
    console.log(datos[0][3]);
    
    
    var tabladatos = document.getElementById('tablaDatos');
   //forma 1 for(var i = 0; datos.length; i++)
    for(let item of datos){
    	if(item[2]==null || item[2]==undefined){
    		item[2]="No disponible";
    	}
    	tabladatos.innerHTML += `
    
    	<td>${item[0]}</td>
    	<td>${item[1]}</td>
    	<td>${item[2]}</td>
    	<td>${item[3]}</td>
    	<td>${item[4]}</td>
    	
    	
	
    		 `
    }
    
   
    
    });
    
});

</script>
<body>
<table class="table" id="tablaDatos">
  <thead class="thead-dark">
    <tr>
      <th>ID HISTORIAL</th>
         <th>ID USUARIOS</th>
       <th>Fecha</th>
      <th>Nombre</th>
      <th>Apellido</th>
      
    </tr>
  </thead>
  <tbody>
  
    </tbody>
    </table>

</body>
</html>