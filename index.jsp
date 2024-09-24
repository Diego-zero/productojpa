<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <title>Crear Usuario y Producto</title>
</head>
<body>
<h1>Crear un Usuario</h1>
<form action="crearUsuario" method="post">
    <label for="nombre">Nombre:</label><br>
    <input type="text" name="nombre" id="nombre" required><br>
    <label for="email">Email:</label>
    <input type="email" name="email" id="email" required><br>
    <input type="submit" value="Crear">
</form>

<h1>Agregar un producto</h1>
<form action="crearProducto" method="post">
    <label for="nombreProducto">Nombre del producto:</label><br>
    <input type="text" name="nombreProducto" id="nombreProducto" required><br>
    <label for="precio">Precio:</label>
    <input type="number" name="precio" id="precio" required><br>
    <input type="submit" value="Crear">
</form>

<c:if test="${not empty usuario}">
    <h2>¡Usuario registrado y creado exitosamente!</h2>
    <p>ID: ${usuario.id}</p>
    <p>Nombre: ${usuario.nombre}</p>
    <p>Email: ${usuario.email}</p>
</c:if>

<c:if test="${not empty producto}">
    <h2>¡Producto agregado correctamente!</h2>
    <p>ID: ${producto.id}</p>
    <p>Nombre del Producto: ${producto.nombreProducto}</p>
    <p>Precio: ${producto.precio}</p>
</c:if>

</body>
</html>
