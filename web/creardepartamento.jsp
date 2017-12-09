<%@ page import="Controlador.ControladorDepartamento" %><%--
<%--
  Created by IntelliJ IDEA.
  User: hp lap
  Date: 19/11/17
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear departamento</title>
    <link href="css/materialize.min.css" rel="stylesheet">
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
<div class="container">
    <h2>Departamento</h2>
    <form method="get" action="crearDepartamento" name="Departamento" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Nombre Departamento</label>
                <input type="text" name="nombreDepar" placeholder="Nombre"/>
            </div>
            <div class="col s4">
                <label>Numero de Edificio</label>
                <input type="text" name="Edificio" placeholder="Numero de Edificio"/>
            </div>
            <div class="col s4">
                <label>Docente RFC</label>
                <input type="text" name="Docente_RFC" placeholder="Docente_RFC"/>
            </div>
        </div>



        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>
