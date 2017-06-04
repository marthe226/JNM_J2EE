<%-- 
    Document   : connect-content
    Created on : 26 mai 2017, 20:05:34
    Author     : deptinfo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        
        <form method="POST"  action="ServletUser?action=creerEtudiant">
     <label>Vous êtes etudiant</label><br>
    Nom : <input type="text" name="nom" id="nom"/><br>  
    Prénom : <input type="text"  name="prenom" id="prenom"/><br> 
    Email : <input type="text"  name="email" id="email"/><br> 
    Password : <input type="password"  name="pass" id="pass"/><br> 
    Confirme Password : <input type="password"  name="confirmepass" id="confirmepass"/><br> 
    date de naissance: <input type="text" name="dates" id="date" /><br>
    Miage:<input type="text" name="miage" id="miage"/> <br>
    <input type="hidden" name="action" value="creerEtudiant"/>  
    <input type="submit" value="suivant" name="submit"/>  
</form> 
