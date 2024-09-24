package com.example.servlet;

import com.example.model.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/crearProducto")
public class ProductoServlet extends HttpServlet {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersistencia");

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombreProducto = req.getParameter("nombreProducto");
        String precioStr = req.getParameter("precio");

        double precio = Double.parseDouble(precioStr);

        Producto producto = new Producto(nombreProducto, precio);


        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
        em.close();

        
        req.setAttribute("producto", producto);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}


