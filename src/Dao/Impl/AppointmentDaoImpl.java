package Dao.Impl;

import Dao.AppointmentDao;
import Entity.Test;

public class AppointmentDaoImpl implements AppointmentDao {
    /**
     * ����ѧ��id������id������ԤԼ��Ϣ�����ҷ�����Ӧ������Ϣ��
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
     * ����ѧ��id������id��ɾ��ԤԼ��Ϣ��
     *
     * @param sid
     * @param testid
     */
    @Override
    public void cancelAppoint(String sid, String testid) {

    }

    /**
     * ����ѧ��id������id����ѯԤԼ��Ϣ�����ҷ�����Ӧ������Ϣ
     *
     * @param sid
     * @param testid
     */
    @Override
    public void getTest(String sid, String testid) {

    }
}
