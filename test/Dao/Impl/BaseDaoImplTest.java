package Dao.Impl;

import Dao.BaseDao;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseDaoImplTest {

    private BaseDao baseDao = new BaseDaoImpl();

    @Test
    public void insert() {

        String sql ="insert into yuyue values(?,?)";
        Long id = baseDao.insert(sql,1,1);
        System.out.println(id);

    }
}