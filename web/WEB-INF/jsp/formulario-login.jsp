<%-- 
    Document   : formulario-login
    Created on : 15/06/2017, 15:30:20
    Author     : cassi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
  <body>
    <h2>Página de Login </h2>
    <form action="efetuaLogin" method="post">
      Login: <input type="text" name="nome" /> <br /> 
      Senha: <input type="password" name="senha" /> <br />
      <input type="submit" value="Efetuar Login" /> 
    </form>
  </body>
</html>