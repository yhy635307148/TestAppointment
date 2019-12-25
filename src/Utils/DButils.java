package Utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DButils<ds> {

    // �½�c3p0���ӳض���
    private static DataSource ds =null;

    static {ds = new ComboPooledDataSource("mysql");
    }

    /**
     * ������ݿ����Ӷ���
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {

        return ds.getConnection();
    }

    /**
     * ���c3p0���ӳض���
     *
     * @return
     */
    public static DataSource getDataSource() {
        return ds;
    }

    /**
     * �ر����ݿ�����
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