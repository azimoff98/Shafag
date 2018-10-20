package az.shafag.testapp.conf;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@MapperScan("az.shafag.testapp.dao.mapper")
public class MyBatisConf {

    @Autowired
    DataSource dataSource;

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(){
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-conf.xml"));
        return sessionFactoryBean;
    }

}
