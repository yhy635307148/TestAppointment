package Utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DButils<ds> {

    // 新建c3p0连接池对象
    private static DataSource ds =null;

    static {ds = new ComboPooledDataSource("mysql");
    }

    /**
     * 获得数据库连接对象
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {

        return ds.getConnection();
    }

    /**
     * 获得c3p0连接池对象
     *
     * @return
     */
    public static DataSource getDataSource() {
        return ds;
    }

    /**
     * 关闭数据库连接
     */
    public static void close(ResultSet rs, Statement sta, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }
            if (sta != null) {
                sta.close();
                sta = null;
            }
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}