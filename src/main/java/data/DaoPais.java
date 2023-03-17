
package data;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoPais {
 
   

   
    public List<Pais> obtenerTodos(Connection con) throws SQLException{
        List<Pais> paises = new ArrayList<>();
		Statement st = null; 
		ResultSet rs = null;

        try { 
	    st= con.createStatement();
            String sql = "SELECT * FROM COUNTRY";
            
            rs = st.executeQuery(sql);

            while (rs.next()) {
                
                String nombre = rs.getString("NAME");
                
                int population = rs.getInt("POPULATION");
                String continent = rs.getString("continent");
                int indepyear = rs.getInt("indepyear");
                
                paises.add(new Pais(nombre,continent,population,indepyear));
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return paises;
    }

}