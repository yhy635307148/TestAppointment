package Dao;

import Entity.Test;

/**
 * @author Demilich
 */
public interface AppointmentDao {

        /**
        *   根据学生id，考试id，插入预约信息，并且返回相应考试信息。
        *
        */
        public abstract Test appoint(String sid, String testid );

        /**
         *   根据学生id，考试id，删除预约信息。
         *
         */
        public abstract void cancelAppoint(String sid, String testid);

        /**
         *   根据学生id，考试id，查询预约信息，并且返回相应考试信息
         *
         */
        public abstract void getTest(String sid, String testid);



}
