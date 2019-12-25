package Dao;

import java.util.List;

/**
 * @author yhy
 * Dao接口,定义BaseDao的基本操作,由BaseDaoImpl提供实现.
 * @param<T>:Dao 实际操作的泛型类型
 * */
public interface BaseDao<T> {

    /*
     * 执行insert操作,返回插入后的记录的ID
     * @param sql:待执行的SQL语句
     * @param args:填充占位符的可变参数
     * @return:插入新纪录的id
     */
    long insert(String sql, Object ... args );

    /*
     * 执行UPDATE操作,包括INSERT(但没有返回值),UPDATE,DELETE
     * @param sql:待执行的SQL语句
     * @param args:填充占位符的可变参数
     * */
    void update(String sql, Object ... args);

    /*
     * 执行单条记录的查询操作,返回与记录对应的类的一个对象
     * @param sql:待执行的sql语句
     * @param args:填充占位符的可变参数
     *@return:与记录对应的类的一个对象
     * */
    T query(String sql, Object ... args);

    /*
     * 执行多条记录的查询操作,返回与记录对应的类的一个List
     * @param sql:待执行的SQL语句
     * @param args:填充占位符的可变参数
     * @return:与记录对应的类的一个List
     * */
    List<T> queryForList(String sql, Object ... args);

    /*
     * 执行一个属性或值得查询操作,列入查询某一条记录的某一个字段
     * @param sql:待执行的SQL语句
     * @param args:填充占位符的可变参数
     * @return:返回要查询的字段的值
     * */
    <V> V getSingleVal(String sql, Object ... args);

    /*
     * 执行批量更新操作
     * @param sql: 待执行的SQL语句
     * @param params: 填充占位符的可变参数
     * */
    void batch(String sql, Object[] ... params);

}