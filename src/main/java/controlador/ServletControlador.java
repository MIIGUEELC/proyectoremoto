package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.sql.DataSource;
import data.DaoPais;
import data.Pais;

@WebServlet(name="ServletControlador", urlPatterns={"/ServletControlador"})
public class ServletControlador extends HttpServlet {

    @Resource(name="jdbc/Paloma")
    DataSource dataSource;
   
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         DaoPais daoPais = new DaoPais();
         List<Pais> paises = new ArrayList();
         try {
         paises = daoPais.obtenerTodos(dataSource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
         

       
        request.setAttribute("paises", paises);

        
        request.getRequestDispatcher("usuarios/mostrarPaises.jsp").forward(request, response);}
        
      
     
    
          
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
