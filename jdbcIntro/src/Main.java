import javax.lang.model.element.Name;
import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;

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
            ArrayList<Country> country=new ArrayList<Country>();
            while (resultSet.next()){//tek tek yaz anlamina geliyor.
                country.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(country.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }


    }
}
