package pe.edu.vallegrande.floreria.db;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("classpath:application.properties")
public class AccesoDb {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AccesoDb.class);
        AccesoDb accesoDb = context.getBean(AccesoDb.class);
        accesoDb.probarConexion();
    }

    private void probarConexion() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        dataSource.setDriverClassName("org.postgresql.Driver");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        try {
            jdbcTemplate.execute("SELECT 1"); // Probar conexión
            System.out.println("Conexión exitosa a la base de datos Neon (PostgreSQL).");
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos Neon: " + e.getMessage());
        }
    }
}
