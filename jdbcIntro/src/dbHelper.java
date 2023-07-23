import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class dbHelper {

    private String userName="root";
    private String password="12345";
    private String dbUrl="jdbc:mysql://localhost:3306/world";
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);//DriverManager class i bizi connector e bagliyor ve baglanti islemlerini yapiyor.
    }
    public void showErrorMessage(SQLException sqlException){
        System.out.println("Error: "+sqlException.getMessage());
        System.out.println("Error code : "+sqlException.getErrorCode());
    }
}
