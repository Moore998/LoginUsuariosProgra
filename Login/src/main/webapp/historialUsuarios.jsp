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
    
    
    var tabladatos = document.getElementById('tablaDatos');
    for(let item of datos){
    	tabladatos.innerHTML += `
    
    	
    	
	
    		 `
    }
    
   
    
    });
    
});

</script>
<body>
<table class="table" id="tablaDatos">
  <thead class="thead-dark">
    <tr>
      <th>ID</th>
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