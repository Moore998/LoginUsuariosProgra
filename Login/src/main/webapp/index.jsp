<link href="//cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css" rel="stylesheet" id="bootstrap-css">
<link href="Sources/css/login.css" rel="stylesheet" id="bootstrap-css">
<link href="Sources/ls/login.js" rel="stylesheet" id="bootstrap-css">
<script src="//cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>

<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!DOCTYPE html>
<html lang="en">
<head>
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link rel="icon" type="image/png" href="imagenes/iconfinder.png">
	<title>Login!</title>
	<meta charset="UTF-8">
	  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
	  <link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body>
	<div class="container" id="container">
		<div class="col s12">
	<form action="ServeletUser" method="post" class="col s6">
		<h2 align="center">Iniciar Sesion</h2>
        
        <div class="row">
        	<label for="icon_prefix"><h6 align="center">Nombre o Email</h6></label>
	  <div class="input-field col m12 s12">
	  	<i class="material-icons iconis prefix">account_box</i>
	  <input id="icon_prefix" name="usuario" type="text" class="validate">
	  
	 </div>
	 </div>
     
     <div class="row">
     	<label for="password"><h6 align="center">Contraseña</h6></label>
	 <div class="input-field col m12 s12">
	<i class="material-icons iconis prefix">enhanced_encryption</i>
    <input id="password" name="contra" type="password" class="validate">
    
    </div>
    </div>
	

    <div class="row" align="center">
	<button align="center" id="button" type="submit"class="btn btn primary btn-block">Entrar</button>
    </div>

	</form>
	<footer id="footer">
	<p>Desarrollado por Antony Fuentes WEB &copy; <?=date('yy') ?></p>
</footer>

</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
    <script src="mySpxript.js"></script>
 

</body>


</html>