package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

/**
 * 和spring连接数据库相关的配置信息
 */
@Configuration
@ComponentScan(basePackages = "com.hefeng")
public class JdbcConfig {

    public class SpringConfiguration {
        /**
         * 用于创建一个QueryRunner对象
         *
         * @param dataSource
         * @return
         */
        @Bean(name = "runner")
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
}
