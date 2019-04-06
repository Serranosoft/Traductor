
package dao;

import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import vo.Ingles;

/**
 * Clase donde indicamos todos los tipos de operaciones de la tabla Ingles de la base de datos
 * @version 1.0
 * @author manue
 */
public class InglesOP {
    /**
     * Función para obtener en objetos todos los valores de la tabla ingles de la base de datos
     * @return Devuelve un ArrayList con los distintos objetos
     */
     public ArrayList<Ingles> selectIngles() {
        ArrayList<Ingles> palabras_ingles = new ArrayList<Ingles>();
        DBConnection conex = new DBConnection();
        String sql = "SELECT * FROM Ingles";

        try {
            Statement st = conex.getConnection().createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Ingles ing = new Ingles();
                ing.setOriginal(rs.getString("original"));
                ing.setTraduccion(rs.getString("traduccion"));
                ing.setLetra(rs.getString("letra"));

                palabras_ingles.add(ing);
            }
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conex.desconectar();
        }
        return palabras_ingles;

    }
     /**
       Función para insertar en la base de datos registros en ingles, la palabra original y traducida pasadas por parametro y la letra obtenida de la palabra original con el metodo charAt(0) para obtener la primera letra
     * @param palabra_original Cadena de texto que hace referencia a la palabra en ingles
     * @param palabra_traducida Cadena de texto que hace referencia a la palabra traducida al español
     * @return Devuelve booleano true si se ha logrado la inserción en la base de datos
      */
     public boolean crearPalabraIngles(String palabra_original, String palabra_traducida) {

        DBConnection conex = new DBConnection();
        String sql = "INSERT INTO Ingles VALUES('" + palabra_original + "','" + palabra_traducida + "','" + palabra_original.charAt(0) + "')";

        try {
            Statement st = conex.getConnection().createStatement();
            st.executeQuery(sql);
            st.close();
            System.out.println("Se ha insertado");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conex.desconectar();
        }
        return true;
    }
    
}
