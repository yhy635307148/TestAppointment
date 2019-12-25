package Dao.Impl;

import Dao.AppointmentDao;
import Entity.Test;

public class AppointmentDaoImpl implements AppointmentDao {
    /**
     * 根据学生id，考试id，插入预约信息，并且返回相应考试信息。
     *
     * @param sid
     * @param testid
     */
    @Override
    public Test appoint(String sid, String testid) {
        String sql = "INSERT INTO yuyue VALUES(?,?)";
        return null;
    }

    /**
     * 根据学生id，考试id，删除预约信息。
     *
     * @param sid
     * @param testid
     */
    @Override
    public void cancelAppoint(String sid, String testid) {

    }

    /**
     * 根据学生id，考试id，查询预约信息，并且返回相应考试信息
     *
     * @param sid
     * @param testid
     */
    @Override
    public void getTest(String sid, String testid) {

    }
}
