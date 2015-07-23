
package dao;

import coneccion.MySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class usuarioDAO {
    
    public ResultSet Login () throws Exception {
        Connection cn = MySQL.getInstance().getConnection();
        String sql = "SELECT * FROM usuario";
        PreparedStatement ps = cn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    
}
