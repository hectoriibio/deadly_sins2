/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;
import java.sql.Connection; 
import java.sql.DriverManager;


public class Conexion {
    
    public static Connection getConexion() {
 
        Connection connection = null;
 
        try {
 
           String driverClassName = "org.mariadb.jdbc.Driver";
 
           String driverUrl="jdbc:mariadb://localhost:3306/prueba";
 
           Class.forName(driverClassName);
 
           connection = DriverManager.getConnection(
 
                   driverUrl, "root","");
 
        }catch (Exception e) {
 
            e.printStackTrace();
 
        }
 
        return connection;
 
    }
}
