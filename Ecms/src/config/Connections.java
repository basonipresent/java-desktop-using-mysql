package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author bason
 */
public class Connections {
    public Connection connection;
    public Statement statement;
    String driver = "jdbc:mysql://";
    String hostname = "localhost/";
    String database_name = "e-cms";
    String username = "root";
    String password = "";
    
    public void configuration(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(driver + hostname + database_name, username, password);
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed connect to database" + e.getMessage());
        }
    }
}
