package Controller;

import Config.Conexion;
import Entidad.cortes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller       
public class Controlador {
    Conexion con = new Conexion(); // instanciar la calse  conexion
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());  // variable parameter la conexion conectar
    ModelAndView mav = new ModelAndView();                // 
    int id; // se declarar la var 
    List datos; // lista de vetas realizadas  
    List datosCorteCaja; // cortes
    String fecha = "02-06-2020";
    String hora = "11:23:20";     
    int usuario = 4;
    int aper;      // id apertura
    double gastos; // SUM(total) from egreso
    double ventas; // SUM(importe) from descripcion_de_venta
    double diferencia;
        Date date = new Date(); // CAPTURANDO LA FECHA Y JHORA DEL SISTEMA
        DateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd"); 
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");   
    
// CREANDO UN METODO PARA LISTAR LOS DATOS DE LA DB 
    @RequestMapping("index.htm") // NOTACION
public ModelAndView Listar(){
    //String sql = "select * from persona";  
String sql = "SELECT distinct venta.id_venta, pacientes.nombre,venta.subtotal, venta.descuento,venta.total,venta.fecha_reporte FROM venta inner join descripcion_de_venta on venta.id_venta = descripcion_de_venta.id_venta inner join pacientes on descripcion_de_venta.id_paciente = pacientes.id_paciente WHERE venta.estado_venta in('Realizada') AND venta.fecha_reporte = CURDATE()";      
// LOS DATOS K CONTIENE LA VARIABLE DATOS SE DEBE MOSTRAR EN LA INTERFAZ EN LA TABLA FORMULARIO JSP    
    datos = this.jdbcTemplate.queryForList(sql); 
   mav.addObject("lista", datos); // para enviar lista la var datos  contien los registro sde la tabla db
  ListarCorteCaja().addObject("listaco", datosCorteCaja);
   System.out.println("obtengo el corte cajaja desde el indexLISTAR consulta ==" + datosCorteCaja);  
   System.out.println("obtengo select lista ventas this ==" + datos); 
   mav.setViewName("index"); //
    return mav;
}

 
// CREANDO UN METODO PARA LISTAR LOS DATOS DE L corte de caja
    //@RequestMapping("index.htm") // NOTACION
public ModelAndView ListarCorteCaja(){
    String sql = "SELECT monto_entregado, gastos, ventas, diferencia, fecha  FROM cortes";  
//String sql = "SELECT distinct venta.id_venta, pacientes.nombre,venta.subtotal, venta.descuento,venta.total,venta.fecha_reporte FROM venta inner join descripcion_de_venta on venta.id_venta = descripcion_de_venta.id_venta inner join pacientes on descripcion_de_venta.id_paciente = pacientes.id_paciente WHERE venta.estado_venta in('Realizada') AND venta.fecha_reporte = CURDATE()";      
// LOS DATOS K CONTIENE LA VARIABLE DATOS SE DEBE MOSTRAR EN LA INTERFAZ EN LA TABLA FORMULARIO JSP    
    datosCorteCaja = this.jdbcTemplate.queryForList(sql); 
   mav.addObject("listaco", datosCorteCaja); // para enviar lista la var datos  contien los registro sde la tabla db
   //System.out.println("obtengo select el corte cajaja this ==" + datosCorteCaja);  
   mav.setViewName("index"); //
    return mav;
}


// select id apertura
@RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
public ModelAndView Agregar(){
    String sql = "select id_apertura from apertura where fecha= CURDATE()";
    aper = this.jdbcTemplate.queryForInt(sql);
    mav.addObject("id_apertura", aper);  
     AgregarGastos().addObject("sumatotalgastos", gastos); // llamo el metodo donde hago la consultga de la suma total de los gastos
     AgregarVentas().addObject("sumatotalventas", ventas);
     mav.addObject("dif", diferencia=ventas-gastos);          
          System.out.println("obtengo select el id apertura this ==" + aper);
          System.out.println("obtengoel total$ gastos this ==" + gastos);
          System.out.println("obtengo total ventas this ==" + ventas); 
          System.out.println("obtengo select diferencia this ==" + diferencia);
               System.out.println("obtengo FECHA ==" + dateFormat.format(date));
               System.out.println("obtengo HORA ==" + hourFormat.format(date)); 
    mav.setViewName("agregar");
    return mav;
}



// select suma total de gastos
//@RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
public ModelAndView AgregarGastos(){
    String sql = "select SUM(total) from egreso where fecha= CURDATE()";
    gastos = this.jdbcTemplate.queryForInt(sql);
    //mav.addObject("sumatotal", gastos);
    //System.out.println("obtengo select el id total$ this ==" + gastos);
    mav.setViewName("agregar");
    return mav;
}

public ModelAndView AgregarVentas(){
    String sql = "select SUM(importe) from descripcion_de_venta where estado in ('Realizada') and fecha= CURDATE()";
    ventas = this.jdbcTemplate.queryForInt(sql);
    //mav.addObject("sumatotal", tt);
    //System.out.println("obtengo select el id total$ this ==" + tt);
    mav.setViewName("agregar");
    return mav;
}



/* con esta si inserta bien dandole el idapertura k si exista*/
@RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
public ModelAndView Agregar(cortes p){
    String sql = "INSERT INTO cortes(id_apertura, monto_entregado, gastos, ventas, diferencia, fecha, hora) values (?,?,?,?,?,?,?)";
 //   this.jdbcTemplate.update(sql, aper,p.getMonto_entregado(),gastos,ventas,diferencia);      CURDATE(), CURTIME()
 this.jdbcTemplate.update(sql, aper,p.getMonto_entregado(),p.getGastos(),p.getVentas(),diferencia,dateFormat.format(date),hourFormat.format(date));        
 System.out.println("datos ==" + aper+p.getMonto_entregado()+p.getGastos()+p.getVentas()+diferencia+dateFormat.format(date)+hourFormat.format(date));   
 return new ModelAndView("redirect:/index.htm");
}

/*
INSERT INTO cortes(id_apertura, monto_entregado, gastos, ventas, diferencia, fecha, hora, usuario)  
VALUES 
(500, 550, 1000, 5000, 50050, CURDATE(), CURTIME(), 1)
*/




}


