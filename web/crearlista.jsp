<%--
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
    <title>Crear lista</title>
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
    <h2>Lista</h2>
    <form method="get" action="crearLista" name="Lista" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Numero de Solicitud</label>
                <input type="text" name="NumeroSolicitud" placeholder="Numero de Solicitud"/>
            </div>
            <div class="col s4">
                <label>ISBN del Libro</label>
                <input type="text" name="Libro_ISBN" placeholder="ISBN del Libro"/>
            </div>
            <div class="col s4">
                <label>Clave Asignatura</label>
                <input type="text" name="Asignatura_clave" placeholder="Asignatura"/>
            </div>
        </div>



        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>
