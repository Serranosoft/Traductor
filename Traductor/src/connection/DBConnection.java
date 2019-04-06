
package connection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase con la configuración y protocolos para la conexion a la base de datos
 * MySQL
 * @version 1.0
 * @author marodal
 */
public class DBConnection {

    /**
     * Parametros de conexion
     */
    
    
    
    static String bd = "";
    static String login = "";
    static String password = "";
    static String url = "jdbc:mysql://localhost/" /*+ bd*/;

    Connection connection = null;

    /**
     * Constructor de la conexión para inicializar la conexion pasandole los
     * distintos atributos de la conexión
     */
    public DBConnection() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("config.txt"));
            
            Class.forName("org.mariadb.jdbc.Driver");
            bd = br.readLine();
            login = br.readLine();
            password = br.readLine();
            connection = DriverManager.getConnection(url+bd, login, password);

            if (connection != null) {
                System.out.println("Conexión a base de datos " + bd + " OK\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Permite retornar la conexión
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Permite desconectarse de la conexión
     */
    public void desconectar() {
        connection = null;
    }
}
