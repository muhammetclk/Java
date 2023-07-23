import javax.lang.model.element.Name;
import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws SQLException {
        dbHelper helper = new dbHelper();
        PreparedStatement statement = null;//insert islemleri PreparedStatemnt ile yapiliyor.Kullanci veriyi kendi girdigi icin.
        ResultSet resultSet;


        Connection connection = null;
        try {
            connection = helper.getConnection();
            String sql="insert into city(name,CountryCode,District,Population) values(?,?,?,?)";
            //soru isareti olan yerlere assagida belirttigimiz degerler gelir.
            statement=connection.prepareStatement(sql);
            statement.setString(1,"Duzce 2");
            statement.setString(2,"Tur");
            statement.setString(3,"Turkey");
            statement.setInt(4,700000);
            statement.executeUpdate();//calistirir ve etkilenen kayit sayisini dondurur.
            System.out.println("Kayit eklendi.");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }



    }
    public static void selectDemo() throws SQLException{
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
