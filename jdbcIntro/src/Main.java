import javax.lang.model.element.Name;
import java.net.ConnectException;
import java.sql.*;

public class Main {


    public static void main(String[] args) throws SQLException {
        dbHelper helper = new dbHelper();
        Statement statement = null;//sql cumlecigini tutuyoruz..
        ResultSet resultSet;//sql sonucu Resultset olarak javada karsilanioyr.Yani sonuc burda tutuluyor.


        Connection connection = null;
        try {

            connection = helper.getConnection();
            statement=connection.createStatement();//gonderilecek sorgu bu baglantiya gidecek.
            resultSet=statement.executeQuery("Select Code,Name,Continent,Region from country");//sorguyu calistiracak.
            while (resultSet.next()){//tek tek yaz anlamina geliyor.
                System.out.println(resultSet.getString("Name"));//name alanini bas
            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }


    }
}
