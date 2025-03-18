package kelentong;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConfigDB {
    private static Connection MySQLConfig;
    
    public static Connection config() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3308/db_kelentong";
            String user = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Koneksi ke Database Gagal"
                    + e.getMessage()
                    );
        }
        
        return MySQLConfig;
    }
}

