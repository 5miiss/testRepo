package spring.web.config;


import spring.web.DAO.UserDao;
import spring.web.DAO.impl.UserDaoImpl;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.spi.PersistenceProvider;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import  spring.web.models.*;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource("jpa.properties")
@ComponentScan("spring.web")
@EnableTransactionManagement
// @Import(UserConfig.class )
@EnableWebMvc
public class ConfigClass {

    @Bean
    public DataSource getDataSource(@Value("${jdbc.driverClassName}") String drivverclassName, @Value("${jdbc.url}") String url,
                                    @Value("${jdbc.username}") String username, @Value("${jdbc.password}") String Password) {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(drivverclassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(Password);
        return ds;
    }

    @Bean
    public PersistenceProvider getPersistenceProvider() {
        return new HibernatePersistenceProvider();
    }

    @Bean
     public LocalContainerEntityManagerFactoryBean emFactory(DataSource  dataSource , PersistenceProvider pp , Environment env){

         LocalContainerEntityManagerFactoryBean emf=new LocalContainerEntityManagerFactoryBean();
         emf.setDataSource(dataSource);
         emf.setPackagesToScan("spring.web.models");
         emf.setPersistenceProvider(pp);
         Properties props =new Properties() ;
         props.put("hibernate.dialect",env.getRequiredProperty("hibernate.dialect"));
         props.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
         props.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
         props.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
         emf.setJpaProperties(props);
         return emf;
     }

     @Bean
     public TransactionManager transactionManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);
     }

    //  @Bean
    // public User getuser(){
    //     return new User("as1jd","abdullah" ,"asdqw","dasd","asd","abdullah" ,"asdqw","dasd");
    //  }

     @Bean
     public UserDao userDao(){
        return new UserDaoImpl();
     }

     @Bean
     public ContentNegotiationManagerFactoryBean contentNegotiationManager(){
        ContentNegotiationManagerFactoryBean x = new ContentNegotiationManagerFactoryBean();
        x.setDefaultContentType(MediaType.APPLICATION_JSON);
        return x;
     }


}