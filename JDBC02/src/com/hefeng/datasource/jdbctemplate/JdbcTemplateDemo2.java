package com.hefeng.datasource.jdbctemplate;

import com.hefeng.datasource.domain.Emp;
import com.hefeng.datasource.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo2 {

    // Junit单元测试, 可以让方法独立执行
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 1. 修改1号数据的salary为 10000
     */
    @Test
    public void test1() {
        //System.out.println("我被执行了");
        // 1. 获取JDBCTemplate 对象
        //JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        // 2. 定义sql
        String sql = "update emp set salary = 10000 where id = 1001";

        // 3. 执行sql
        int count = template.update(sql);
        System.out.println(count);

    }


    /**
     * 2. 添加一条记录
     */
    @Test
    public void test2() {
        String sql = "insert into emp(id, ename, dept_id) values(?,?,?)";

        int count = template.update(sql, 1015, "郭靖", 10);

        System.out.println(count);

    }


    /**
     * 3. 删除一条记录
     */
    @Test
    public void test3() {
        String sql = "delete from emp where id=?";

        int count = template.update(sql, 1015);

        System.out.println(count);

    }


    /**
     * 4. 查询id为1的记录，将其封装为Map集合
     *  queryForMap(将列名作为key,将值作为value将这条记录封装为一个map集合): 查询的结果集长度只能是1
     */
    @Test
    public void test4() {
        String sql = "select * from emp where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
        // {id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=8000.00, bonus=null, dept_id=20}

    }


    /**
     * 5. 查询所有的记录，将其封装为List集合
     *
     * queryForList : 将每一条记录封装为一个map集合，再将map集合封装到List集合中
     *
     */
    @Test
    public void test5() {
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);

        for ( Map<String, Object> stringObjectMap: list) {
            System.out.println(stringObjectMap);
        }

    }

    /**
     * 6. 查询所有的记录，将其封装为Emp对象的List集合
     */
    @Test
    public void test6() {
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {

            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                return emp;
            }
        });
        // iter
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }


    /**
     * 6_2. 查询所有的记录，将其封装为Emp对象的List集合 (上一个的简化)
     */
    @Test
    public void test6_2() {
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 7. 查询总记录
     */
    @Test
    public void test7() {
        String sql = "select count(id) from emp";
        Long total = template.queryForObject(sql, Long.class);

        System.out.println(total);
    }
}
