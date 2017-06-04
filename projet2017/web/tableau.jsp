    <%--  
        Document   : tableau
        Created on : 16 sept. 2009, 16:54:32  
        Author     : michel buffa  
    --%>  
      
    <%@page contentType="text/html" pageEncoding="UTF-8"%>  
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
        "http://www.w3.org/TR/html4/loose.dtd">  
      
    <!-- Ne pas oublier cette ligne sinon tous les tags de la JSTL seront ignorés ! -->  
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
      
    <html>  
        <head>  
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
            <title>Gestionnaire d'utilisateurs</title>  
        </head>  
        <body>  
            <h1>Gestionnaire d'utilisateurs</h1>  
      
     
    
                <h2>Liste des utilisateurs</h2>  
      
                <table border="10">  
                    <!-- La ligne de titre du tableau des comptes -->  
                    <tr>  
                        <td><b>Login</b></td>  
                        <td><b>Nom</b></td>  
                        <td><b>Prénom</b></td>  
                    </tr>  
      
                    <!-- Ici on affiche les lignes, une par utilisateur -->  
                    <!-- cette variable montre comment on peut utiliser JSTL et EL pour calculer -->  
                    <c:set var="total" value="0"/>  
      
                    <c:forEach var="u" items="${requestScope['listeDesUsers']}">  
                        <tr>  
                            <td>${u.email}</td>  
                            <td>${u.firstname}</td>  
                            <td>${u.lastname}</td>  
                            <!-- On compte le nombre de users -->  
                            <c:set var="total" value="${total+1}"/>  
                        </tr>  
                    </c:forEach>  
      
                    <!-- Affichage du solde total dans la dernière ligne du tableau -->  
                    <tr><td><b>TOTAL</b></td><td></td><td><b>${total}</b></td><td></td></tr>  
                </table>  
      
        </body>  
    </html>  