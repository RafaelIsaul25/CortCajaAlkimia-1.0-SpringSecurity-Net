<%-- 
    Document   : agregar
    Created on : 10/05/2020, 05:54:02 PM
    Author     : COMIMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>REALIZAR CORTE CAJA .: Alkhemy :.</title>
        <style>                    
           .back-fondo{
                        background-image:url(img/backk.png);
                        background-size: 45%;                        
                        background-repeat:no-repeat;
                        background-position: center;
                        background-position-y: 55px; /*desde arriba le da espacio*/
                        background-attachment:fixed;
                      }                   
                </style>
    </head>
    <body class="back-fondo">
        
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
                        <a class="dropdown-item" href="">
                            <img src="img/LOGOLIMPIO.PNG" alt="150" width="150"/>
                        </a>                        
                        <div class="dropdown-divider"></div>
                        
                            <button name="accion"  value="Salir" class="dropdown-item" href="#">Salir</button>
                                                
                    </div>
                </div>
        </nav> 
<!--- aki termina el menu nav-->                 
        
            <div class="container mt-4 col-lg-4">
                <div class="card border-info">
                    <div class="card-header bg-info">
                        <h4 class="text-white"><center>Realizar Corte de Caja</center></h4>
                    </div>
                        <div class="card-body">
                            <form method="POST" action="agregar.htm">
                                <!---label>Id_Apertura:</label>                                
                                <input type="text" name="apertura" value="${id_apertura}" class="form-control" readonly="readonly"--->
                                <label>Monto entregar :</label>
                                <input type="text" name="monto_entregado" class="form-control" required="" placeholder="Ingrese monto total">
                                <label>Gastos :</label>
                                      <input type="text" name="gastos" value="${sumatotalgastos}0" class="form-control" readonly="readonly">
                                <label>Ventas :</label>
                                      <input type="text" name="ventas" value="${sumatotalventas}0" class="form-control" readonly="readonly">
                                <label>Diferencia :</label>
                                      <input type="text" name="dife" value="${dif}0" class="form-control" readonly="readonly"><br>                                                                                                                                                                      
                                  <input type="submit" value="Agregar" class="btn btn-success">
                                  <a href="index.htm" class="btn btn-danger">Regresar</a>
                                
                            </form>
                        </div>
                </div>
            </div>
                          
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>


















