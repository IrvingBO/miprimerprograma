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
    <title>Crear Libro</title>
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
    <h2>Libro</h2>
    <form method="get" action="crearLibro" name="Libro" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Nombre libro</label>
                <input type="text" name="NombreLibro" placeholder="Nombre libro"/>
            </div>
            <div class="col s4">
                <label>Autores</label>
                <input type="text" name="Autores" placeholder="Autores libro"/>
            </div>
            <div class="col s4">
                <label>Editorial</label>
                <input type="text" name="Editorial" placeholder="Editorial libro"/>
            </div>
            <div class="col s4">
                <label>Año</label>
                <input type="text" name="Año" placeholder="Año libro"/>
            </div>
            <div class="col s4">
                <label>ISBN</label>
                <input type="text" name="ISBN" placeholder="ISBN libro"/>
            </div>
            <div class="col s4">
                <label>Edicion</label>
                <input type="text" name="Edicion" placeholder="Edicion libro"/>
            </div>
        </div>



        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>
