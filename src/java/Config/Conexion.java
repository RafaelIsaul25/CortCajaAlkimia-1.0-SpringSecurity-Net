
package Config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conexion {
       public DriverManagerDataSource Conectar(){  
           DriverManagerDataSource datasource = new DriverManagerDataSource();
          datasource.setDriverClassName("com.mysql.jdbc.Driver");
          datasource.setUrl("jdbc:mysql://localhost/inventariostore_alkimia_test");
          datasource.setUsername("root");
          datasource.setPassword("");
          return datasource;               
       }   
}






