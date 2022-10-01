<%-- 
    Document   : Controlador
    Created on : 29/09/2022, 07:33:21 PM
    Author     : johan
--%>

<%@page import="logica.Paciente"%>
<%@page import="logica.Medico"%>
<%@page import="logica.CentrosSalud"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hospital de Patio Bonito</title>
        
    </head>

    <body>
        <% 
            Persona pad = new Persona();
            out.println(pad.Imprimir());
            Paciente p = new Paciente();
            out.println(pad.Imprimir());
            Medico m = new Medico();
            out.println(m.Imprimir());
            CentrosSalud c = new CentrosSalud();
            out.println(c.Imprimir());
            
                
        
        %>
    </body>
</html>
