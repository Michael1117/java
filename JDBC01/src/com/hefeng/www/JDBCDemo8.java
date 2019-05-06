package com.hefeng.www;


import com.hefeng.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个方法， 查询emp表的数据将其封装为对象，然后装载集合， 返回。
 */
public class JdbcDemo8 {
    public static void main(String[] args) {
        List<Emp> list = new JdbcDemo8().findAll();

        System.out.println(list);
        System.out.println(list.size());
    }

    /**
     * 查询所有emp对象
     *
     * @return
     */

    public List<Emp> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "12345678");
            // 3. 定义sql语句
            String sql = "select * from emp";

            // 4. 获取操作sql对象
            stmt = conn.createStatement();

            // 5. 执行sql
            rs = stmt.executeQuery(sql);

            // 6. 遍历结果集，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<Emp>();

            while (rs.next()) {
                // 获取数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                // 创建emp对象，并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                // 转载集合
                list.add(emp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }
        return list;
    }
}
