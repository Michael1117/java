package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

/**
 * 配置类： 和bean.xml一样
 * spring中的新注解
 *     Configuration
 *      作用： 指定当前类是一个配置类
 *     ComponentScan
 *      作用： 用于通过注解指定spring在创建容器时要扫描的包
 * 属性：
 *      value: 它和basePackages的作用是一样的，都是用于指定创建容器时要扫描的包。
 *      我们使用此注解就等同于xml中配置了：@ComponentScan(basePackages = "com.hefeng") 相当于
 *          <context:component-scan base-package="com.hefeng"></context:component-scan>
 * Bean
 *      作用： 用于把当前方法的返回值作为bean对象存入spring的ioc容器中
 *      属性
 *      name: 用于指定bean的id。当不写时，默认值是当前方法的名称
 *      细节：
 *          当我们使用注解配置方法时，如果方法有参数，spring框架会去容器中查找有没有可用的bean对象
 *          查找的方式和Autowired注解是一样的
 *
 */

@Configuration
@ComponentScan(basePackages = "com.hefeng")
public class SpringConfiguration {
    /**
     * 用于创建一个QueryRunner对象
     *
     * @param dataSource
     * @return
     */
    @Bean(name="runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    /**
     * 创建数据源
     *
     * @return
     */
    @Bean(name = "dataSource")
    public DataSource createDataSource() {
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/eesy");
            ds.setUser("root");
            ds.setPassword("12345678");

            return ds;
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
