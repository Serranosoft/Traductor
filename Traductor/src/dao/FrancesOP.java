
package dao;

import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import vo.Frances;
import vo.Ingles;

/**
 * Clase donde indicamos todos los tipos de operaciones de la tabla Frances de la base de datos
 * @version 1.0
 * @author manue
 */
public class FrancesOP {

    /**
     * Función para obtener en objetos todos los valores de la tabla frances de la base de datos
     * @return Devuelve un ArrayList con los distintos objetos
     */
    public ArrayList<Frances> selectFrances() {
        ArrayList<Frances> palabras_frances = new ArrayList<Frances>();
        DBConnection conex = new DBConnection();
        String sql = "SELECT * FROM frances";

        try {
            Statement st = conex.getConnection().createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Frances fr = new Frances();
                fr.setOriginal(rs.getString("original"));
                fr.setTraduccion(rs.getString("traduccion"));
                fr.setLetra(rs.getString("letra"));

                palabras_frances.add(fr);
            }
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conex.desconectar();
        }
        return palabras_frances;

    }
/**
 * Función para insertar en la base de datos registros en frances, la palabra original y traducida pasadas por parametro y la letra obtenida de la palabra original con el metodo charAt(0) para obtener la primera letra
 * @param palabra_original Cadena de texto que hace referencia a la palabra en frances
 * @param palabra_traducida Cadena de texto que hace referencia a la palabra traducida al español
 * @return Devuelve booleano true si se ha logrado la inserción en la base de datos
 */
    public boolean crearPalabraFrances(String palabra_original, String palabra_traducida) {

        DBConnection conex = new DBConnection();
        String sql = "INSERT INTO Frances VALUES('" + palabra_original + "','" + palabra_traducida + "','" + palabra_original.charAt(0) + "')";

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
