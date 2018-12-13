package Program;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuKoneksi {

    Connection connection;
    PreparedStatement preparedStatement;
    MenuNode MenuModel;
    List<MenuNode> Menu_Model = new ArrayList<MenuNode>();

    public MenuKoneksi(Connection koneksi) {
        this.connection = koneksi;
    }

    public List<MenuNode> getAllmenumodel() throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT * FROM pilihanmenu");
        ResultSet RS = preparedStatement.executeQuery();
        while (RS.next()) {
            MenuModel = new MenuNode();
            MenuModel.setMenu(RS.getString("menu"));
            MenuModel.setHargaSatuan(RS.getInt("hargasatuan"));
            Menu_Model.add(MenuModel);
        }
        return Menu_Model;
    }

}
