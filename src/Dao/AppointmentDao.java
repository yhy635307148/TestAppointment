package Dao;

import Entity.Test;

/**
 * @author Demilich
 */
public interface AppointmentDao {

        /**
        *   ����ѧ��id������id������ԤԼ��Ϣ�����ҷ�����Ӧ������Ϣ��
        *
        */
        public abstract Test appoint(String sid, String testid );

        /**
         *   ����ѧ��id������id��ɾ��ԤԼ��Ϣ��
         *
         */
        public abstract void cancelAppoint(String sid, String testid);

        /**
         *   ����ѧ��id������id����ѯԤԼ��Ϣ�����ҷ�����Ӧ������Ϣ
         *
         */
        public abstract void getTest(String sid, String testid);



}
