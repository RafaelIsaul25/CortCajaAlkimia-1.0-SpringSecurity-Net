<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Corte de Caja .: Alkhemy :.</title>
        <style>                    
           body{
                        background-image:url(img/backk.png);
                        background-size: 45%;
                        background-repeat:no-repeat;
                        background-position: center;
                        background-position-y: 55px; /*desde arriba le da espacio*/
                        background-attachment:fixed;
                      }                   
                </style>
    </head>
    <body>
        <!--- aki empieza el menu nav-->        
          <nav class="navbar navbar-expand-lg navbar-light bg-info">            
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="text-white" href="">Corte de Caja .: Alkhemy :.</a>
                    </li>                   
                </ul>
                
            </div>
            <div class="dropdown">
                <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                         Usuario Ingresado  <%--  ${usuario.getNom()} --%>
                    </button>
                    <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="#">
                            <img src="img/LOGOLIMPIO.PNG" alt="150" width="150"/>
                        </a>                        
                        <div class="dropdown-divider"></div>
                        
                            <button name="accion"  value="Salir" class="dropdown-item" href="#">Salir</button>
                                                
                    </div>
                </div>
        </nav> 
<!--- aki termina el menu nav-->                                       
        
        <div class="container mt-4">
            <div class="card border-info">
               
                <div class="card-header bg-info text-white">  
                    <a class="btn btn-light" href="agregar.htm">CORTE DE CAJA</a> 
                    <a style="margin-left:350px">VENTAS REALIZADAS</a>
                </div>    
                              <div class="card-body">
                                  <table class="table table_hover">
                                      <thead>
                                          <tr>
                                              <th>VENTA</th>
                                              <th>PACIENTE</th>
                                              <th>SUBTOTAL</th>
                                              <th>DESCUENTO</th>
                                              <th>TOTAL</th>
                                              <th>FECHA</th>
                                          </tr>
                                      </thead>
                                      <tbody>
                                          <c:forEach var="dato" items="${lista}">
                                                <tr>    
                                                    <td>${dato.id_venta}</td>
                                                    <td>${dato.nombre}</td>
                                                    <td>$${dato.subtotal}0</td>
                                                    <td>$${dato.descuento}0</td>
                                                    <td>$${dato.total}0</td>
                                                    <td>${dato.fecha_reporte}</td>                                                    
                                                </tr>                                                
                                          </c:forEach>                                               
                                      </tbody>
                                  </table>

                              </div>
                
            </div>                        
        </div>


         <div class="container mt-4">
                                          <div class="card border-info">

                                              <div class="card-header bg-info">
                                                  <h4 class="text-white"><center>CORTE CAJA REALIZADO</center></h4>
                                              </div>   
                                              <div class="card-body">
                                                  <table class="table table_hover">
                                                      <thead>
                                                          <tr>
                                                              <th>MONTO</th>
                                                              <th>GASTOS</th>
                                                              <th>VENTAS</th>
                                                              <th>DIFERENCIA</th>
                                                              <th>FECHA</th>
                                                          </tr>
                                                      </thead>
                                                      <tbody>
                                                      <c:forEach var="datosss" items="${listaco}">
                                                          <tr>    
                                                              <td>$${datosss.monto_entregado}0</td>
                                                              <td>${datosss.gastos}</td>
                                                              <td>$${datosss.ventas}0</td>
                                                              <td>$${datosss.diferencia}0</td>
                                                              <td>${datosss.fecha}</td>
                                                          </tr>                                                
                                                      </c:forEach>                                               
                                                      </tbody>
                                                  </table>

                                              </div>

                                          </div>                        
                                      </div>


    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>













