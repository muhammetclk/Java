import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        dbHelper helper=new dbHelper();
        Connection connection=null;
        try{

            connection=helper.getConnection();
            System.out.println("Baglanti olustu");
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }


    }
}
