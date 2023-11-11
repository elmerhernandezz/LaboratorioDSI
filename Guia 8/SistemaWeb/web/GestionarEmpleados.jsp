<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Empleados</title>
    </head>
    <body>
        <h1>Gestión de Empleados</h1>
        <h2>Listado de Empleados</h2>

        <h1>Conexion: ${mensaje_conexion}</h1>
        
        <a href="/SistemaWeb?accion=AgregarEmpleado">Agregar empleado</a><br><br>

        <table border="1">
            <thead>
                <tr>
                    <th>ID_Empleado</th>
                    <th>Nombres_Empleado</th>
                    <th>Apellidos_Empleado</th>
                    <th>DUI</th>
                    <th>ISSS</th>
                    <th>FechaNacEmpleado</th>
                    <th>Telefono</th>
                    <th>ID_Cargo</th>
                    <th>ID_Direccion</th>
                </tr>
            </thead>
            <tbody>
                    <c:forEach items="${listaEmpleados}" var="item">
                    <tr>
                        <td><c:out value="${item.ID_Empleado}" /></td>
                        <td><c:out value="${item.nombresEmpleado}" /></td>
                        <td><c:out value="${item.apellidosEmpleado}" /></td>
                        <td><c:out value="${item.dui}" /></td>
                        <td><c:out value="${item.isss}" /></td>                        
                        <td><c:out value="${item.fechaNacEmpleado}" /></td>
                        <td><c:out value="${item.telefono}" /></td>                     
                        <td><c:out value="${item.ID_Cargo}" /></td>
                        <td><c:out value="${item.ID_Direccion}" /></td>
                        
                        <td>
                            <form method="POST" action="/SistemaWeb/ModificarEmpleado.jsp">
                                <input type="hidden" name="ID_Empleado" value="${item.ID_Empleado}" />
                                <input type="hidden" name="nombresEmpleado" value="${item.nombresEmpleado}" />
                                <input type="hidden" name="apellidosEmpleado" value="${item.apellidosEmpleado}" />
                                <input type="hidden" name="dui" value="${item.dui}" />
                                <input type="hidden" name="isss" value="${item.isss}" />
                                <input type="hidden" name="fechaNacEmpleado" value="${item.fechaNacEmpleado}" />
                                <input type="hidden" name="telefono" value="${item.telefono}" />
                                <input type="hidden" name="ID_Cargo" value="${item.ID_Cargo}" />
                                <input type="hidden" name="ID_Direccion" value="${item.ID_Direccion}" />
                                <input type="submit" value="Modificar" />
                            </form>    
                            <form method="POST" action="/SistemaWeb/EliminarEmpleado.jsp">
                                <input type="hidden" name="ID_Empleado" value="${item.ID_Empleado}" />
                                <input type="hidden" name="nombresEmpleado" value="${item.nombresEmpleado}" />
                                <input type="hidden" name="apellidosEmpleado" value="${item.apellidosEmpleado}" />
                                <input type="hidden" name="dui" value="${item.dui}" />
                                <input type="hidden" name="isss" value="${item.isss}" />
                                <input type="hidden" name="fechaNacEmpleado" value="${item.fechaNacEmpleado}" />
                                <input type="hidden" name="telefono" value="${item.telefono}" />
                                <input type="hidden" name="ID_Cargo" value="${item.ID_Cargo}" />
                                <input type="hidden" name="ID_Direccion" value="${item.ID_Direccion}" />
                                <input type="submit" value="Eliminar" />
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>            
        </table>
    </body>
</html>