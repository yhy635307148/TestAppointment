package Dao.Impl;

import Dao.BaseDao;
import Utils.DButils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class BaseDaoImpl<T> implements BaseDao<T> {

    private QueryRunner queryRunner = new QueryRunner();

    //���ڻ�ȡĳ�������
    private Class<T> tClass;


    @Override
    public long insert(String sql, Object... args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        long id = 0;

        try {
            connection = DButils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            if (args != null) {
                for (int i = 0; i < args.length; i++) {
                    preparedStatement.setObject(i + 1, args[i]);
                }
            }
            preparedStatement.executeUpdate();
            //��ȡ���ɵ�����ֵ
            resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                id = resultSet.getLong(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButils.close(resultSet, preparedStatement, connection);
        }
        return id;
    }

    @Override
    public void update(String sql, Object... args) {

        Connection connection = null;

        try {
            connection=DButils.getConnection();
            queryRunner.update(connection,sql,args);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButils.close(null,null,connection);
        }

    }

    @Override
    public T query(String sql, Object... args) {
        Connection connection = null;

        try {
            connection = DButils.getConnection();
            return queryRunner.query(connection,sql,new BeanHandler<>(tClass),args);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButils.close(null,null,connection);
        }
        return null;
    }

    @Override
    public List<T> queryForList(String sql, Object... args) {
        Connection connection = null;

        try {
            connection = DButils.getConnection();
            return queryRunner.query(connection,sql,new BeanListHandler<>(tClass),args);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButils.close(null,null,connection);
        }
        return null;
    }

    @Override
    public <V> V getSingleVal(String sql, Object... args) {
        Connection connection = null;

        try {
            connection=DButils.getConnection();
            return  (V) queryRunner.query(connection,sql,new ScalarHandler(),args);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButils.close(null,null,connection);
        }
        return null;
    }

    @Override
    public void batch(String sql, Object[]... params) {
        Connection connection = null;

        try {
            connection=DButils.getConnection();
            queryRunner.batch(connection,sql,params);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButils.close(null,null,connection);
        }
    }

}


