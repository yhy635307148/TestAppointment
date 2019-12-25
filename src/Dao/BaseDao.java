package Dao;

import java.util.List;

/**
 * @author yhy
 * Dao�ӿ�,����BaseDao�Ļ�������,��BaseDaoImpl�ṩʵ��.
 * @param<T>:Dao ʵ�ʲ����ķ�������
 * */
public interface BaseDao<T> {

    /*
     * ִ��insert����,���ز����ļ�¼��ID
     * @param sql:��ִ�е�SQL���
     * @param args:���ռλ���Ŀɱ����
     * @return:�����¼�¼��id
     */
    long insert(String sql, Object ... args );

    /*
     * ִ��UPDATE����,����INSERT(��û�з���ֵ),UPDATE,DELETE
     * @param sql:��ִ�е�SQL���
     * @param args:���ռλ���Ŀɱ����
     * */
    void update(String sql, Object ... args);

    /*
     * ִ�е�����¼�Ĳ�ѯ����,�������¼��Ӧ�����һ������
     * @param sql:��ִ�е�sql���
     * @param args:���ռλ���Ŀɱ����
     *@return:���¼��Ӧ�����һ������
     * */
    T query(String sql, Object ... args);

    /*
     * ִ�ж�����¼�Ĳ�ѯ����,�������¼��Ӧ�����һ��List
     * @param sql:��ִ�е�SQL���
     * @param args:���ռλ���Ŀɱ����
     * @return:���¼��Ӧ�����һ��List
     * */
    List<T> queryForList(String sql, Object ... args);

    /*
     * ִ��һ�����Ի�ֵ�ò�ѯ����,�����ѯĳһ����¼��ĳһ���ֶ�
     * @param sql:��ִ�е�SQL���
     * @param args:���ռλ���Ŀɱ����
     * @return:����Ҫ��ѯ���ֶε�ֵ
     * */
    <V> V getSingleVal(String sql, Object ... args);

    /*
     * ִ���������²���
     * @param sql: ��ִ�е�SQL���
     * @param params: ���ռλ���Ŀɱ����
     * */
    void batch(String sql, Object[] ... params);

}