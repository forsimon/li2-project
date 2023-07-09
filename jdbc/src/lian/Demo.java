package lian;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author li
 * @description
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        try (Connection conn= lian.conn.getConnection();
        )
        {
           query(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 将查询结果封装成Product对象列表返回
     *
     * @param conn
     *            连接
     */
    private static void query(Connection conn) {
        double price=5000;
        String sql="select pname,price from product where price>?";
        try(
                PreparedStatement pstm=conn.prepareStatement(sql);)
        {
            pstm.setDouble(1,price);
            ResultSet rs=pstm.executeQuery();
         while (rs.next()){
             System.out.println(rs.getString(1)+"\t"+rs.getDouble(2));
         }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
