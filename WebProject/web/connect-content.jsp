<%-- 
    Document   : connect-content
    Created on : 8 mai 2017, 21:34:51
    Author     : deptinfo
--%>

 <!DOCTYPE html>
<html>
<body>

              <form method="POST" action="ServletUsers?action=connexion">
                    E-mail : <input type="text" name="email"/><br>  
                    Password : <input type="password"  name="password"/><br>  
                    <input type="hidden" name="action" value="connexion"/>  
                    <input type="submit" value="Se Connecter" name="submit"/>  
                </form>  
</body>
</html>


      