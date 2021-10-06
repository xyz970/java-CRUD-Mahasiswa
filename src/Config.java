
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author adi_sptro
 */
public class Config {
    public static Connection mysqlConf;
    
    public static Connection MyConfig() throws SQLException{
        try {
            String uri = "jdbc:mysql://localhost:3306/mhs";
            String user = "adi_sptro";
            String pass = "12345678";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlConf = DriverManager.getConnection(uri, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Error","Error",JOptionPane.ERROR_MESSAGE);
        }
        return mysqlConf;
    }
}
