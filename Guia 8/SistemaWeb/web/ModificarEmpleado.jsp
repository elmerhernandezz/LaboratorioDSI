<%-- 
    Document   : ModificarEmpleado
    Created on : 4 nov 2023, 09:59:51
    Author     : MINEDUCYT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar empleado</title>
    </head>
    <body>
        <h1>Modificar empleado</h1>
        <form method="POST" action="/SistemaWeb/ServletPrincipal?accion=ModificarEmpleado">
            <div>
                <label>ID Empleado:</label>
                <input type="text" name="ID_Empleado" id="ID_Empleado" value="${param.ID_Empleado}" readonly /><br>
                <label>Nombres:</label>
                <input type="text" name="nombresEmpleado" id="nombresEmpleado" value="${param.nombresEmpleado}" required /><br>
                <label>Apellidos:</label>
                <input type="text" name="apellidosEmpleado" id="apellidosEmpleado" value="${param.apellidosEmpleado}" required /><br>
                <label>DUI:</label>
                <input type="text" name="dui" id="DUI_Empleado" value="${param.dui}" required /><br>
                <label>Número de afiliado ISSS:</label>
                <input type="text" name="isss" id="ISSS_Empleado" value="${param.isss}" required /><br>
                <label>Fecha de nacimiento:</label>
                <input type="date" name="fechaNacEmpleado" id="fechaNacEmpleado" value="${param.fechaNacEmpleado}" required /><br>
                <label>Teléfono:</label>
                <input type="text" name="telefono" id="telefonoEmpleado" value="${param.telefono}" required /><br>
                <label>ID Cargo:</label>
                <input type="text" name="ID_Cargo" id="ID_Cargo" value="${param.ID_Cargo}" required /><br>
                <label>ID Dirección:</label>
                <input type="text" name="ID_Direccion" id="ID_Direccion" value="${param.ID_Direccion}" required /><br><br>           
                <input type="submit" value="Modificar" onclick="return confirm('¿Desea modificar el empleado?')" /><br><br> 
            </div>
            <div>
                <a href="/SistemaWebEscolar/?accion=GestionarEmpleados">Regresar</a><br><br>
            </div>             
        </form>
    </body>
</html>
