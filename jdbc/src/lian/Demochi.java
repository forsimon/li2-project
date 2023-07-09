package lian;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author li
 * @description
 */
public class Demochi {
    public static void main(String[] args) throws Exception {
        Connection conn = lian.connchi.getConnection();
        String sql="insert into product(pname,price) values(?,?)";
        PreparedStatement ps=null;
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,"cherry");
            ps.setDouble(2,80.80);
            int num=ps.executeUpdate();
            System.out.println(num);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connchi.close(ps,conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
