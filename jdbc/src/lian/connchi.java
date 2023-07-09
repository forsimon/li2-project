package lian;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @author li
 * @description
 * 连接工具
 */
public class connchi {
    //数据库连接四大属性
    private  static final  String DRIVER="com.mysql.jdbc.Driver";
    private  static final String URL="jdbc:mysql://11.138.24.83:3306/lili?useSSL=false";
    private  static  final  String USERNAME="root";
    private static  final  String PASSWORD="hainiu";
    //初始化 druid 连接池
    private static DruidDataSource dataSource=null;
    static {
        dataSource=new DruidDataSource();
        dataSource.setDriverClassName(DRIVER);
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
    }

    /**
     * 获取数据库连接
     * @return
     * @throws SQLException
     *
     */
    public static Connection getConnection()  {
        DruidPooledConnection conn=null;
        try {
            conn=dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭结果集、SQL处理对象和连接
     * @param resultSet
     * @param statement
     * @param connection
     * @throws SQLException
     */
    public static void close(ResultSet resultSet, Statement statement,Connection connection) throws SQLException {
        if(resultSet !=null){
            resultSet.close();
        }

        if(statement !=null){
            statement.close();
        }

        if(connection !=null){
            connection.close();
        }
    }

    /**
     * 关闭SQL处理对象和连接
     * @param statement
     * @param connection
     * @throws SQLException
     */
    public static void close(Statement statement,Connection connection) throws SQLException {
        close(null,statement,connection);
    }
}
