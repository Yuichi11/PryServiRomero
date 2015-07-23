package dao;

import coneccion.MySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import to.productoTO;

public class productoDAO {

    //dasd
    public ResultSet BuscarProducto(String Nombre) throws Exception {
        Connection Conexion = MySQL.getInstance().getConnection();
        String SQL = "select * from v_productos where nomb_pro like '%" + Nombre + "%'";
        PreparedStatement ps = Conexion.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public ResultSet CargarMarcas() throws Exception {
        Connection Conexion = MySQL.getInstance().getConnection();
        String SQL = "select * from marca";
        PreparedStatement ps = Conexion.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public ResultSet CargarModelos(int Codigo) throws Exception {
        Connection Conexion = MySQL.getInstance().getConnection();
        String SQL = "select * from modelo where codi_mar ="+Codigo;
        PreparedStatement ps = Conexion.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public void InsertProducto(productoTO objProductoTO) throws Exception {
        Connection Conexion = MySQL.getInstance().getConnection();
        String Consulta = "CALL sp_insert_producto(?,?,?,?,?,?,?,?,?)";
        CallableStatement cs = Conexion.prepareCall(Consulta);
        cs.setString(1, objProductoTO.getNomb_pro());
        cs.setString(2, objProductoTO.getPres_pro());
        cs.setString(3, objProductoTO.getUnme_pro());
        cs.setDouble(4, objProductoTO.getPrev_pro());
        cs.setDouble(5, objProductoTO.getPrcu_pro());
        cs.setInt(6, objProductoTO.getStto_pro());
        cs.setInt(7, objProductoTO.getStun_pro());
        cs.setDouble(8, objProductoTO.getPrct_pro());
        cs.setString(9, objProductoTO.getSeri_pro());
        cs.execute();
    }

    public void UpdateProducto(productoTO objProductoTO) throws Exception {
        Connection Conexion = MySQL.getInstance().getConnection();
        String Consulta = "CALL sp_update_producto(?,?,?,?,?,?,?,?,?,?)";
        CallableStatement cs = Conexion.prepareCall(Consulta);
        cs.setInt(1, objProductoTO.getCodi_pro());
        cs.setString(2, objProductoTO.getNomb_pro());
        cs.setString(3, objProductoTO.getPres_pro());
        cs.setString(4, objProductoTO.getUnme_pro());
        cs.setDouble(5, objProductoTO.getPrev_pro());
        cs.setDouble(6, objProductoTO.getPrcu_pro());
        cs.setInt(7, objProductoTO.getStto_pro());
        cs.setInt(8, objProductoTO.getStun_pro());
        cs.setDouble(9, objProductoTO.getPrct_pro());
        cs.setString(10, objProductoTO.getSeri_pro());
        cs.execute();
    }
}
