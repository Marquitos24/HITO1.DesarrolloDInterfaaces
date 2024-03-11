package es.hherramientasoftware.conexionBBDD;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
public class Conexion {

    @Bean
    public DataSource ds(){
        DriverManagerDataSource drivers = new DriverManagerDataSource();

        drivers.setDriverClassName("org.postgresql.Driver");
        drivers.setUrl("jdbc:postgresql://localhost:5432/renta");
        drivers.setUsername("postgres");
        drivers.setPassword("MarcosGuapo1");
        return drivers;
    }
}
