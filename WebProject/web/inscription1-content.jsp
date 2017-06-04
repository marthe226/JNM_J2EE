<%-- 
    Document   : connect-content
    Created on : 26 mai 2017, 20:05:34
    Author     : deptinfo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        
         <form method="POST" action="ServletUsers?action=creerEtudiant">
                    Nom : <input type="text" name="nom"/><br>  
                    Prénom : <input type="text"  name="prenom"/><br> 
                    Email : <input type="text"  name="email"/><br> 
                    Password : <input type="password"  name="pass"/><br> 
                    Date de Naissance : <input type="Text"  name="naissance"/><br> 
                    MIAGE : <select name="elementSelecte">
<option valeur="Sophia Antipolis">Sophia Antipolis</option>
<option valeur="Paris">Paris</option>
<option valeur="Marseille">Marseille</option>
</select>
             Ancien Miagiste  :  
             <input type="radio" name=miage value="true"/>Oui
             <input type="radio" name=miage value="false"/>Non


         
                    <input type="hidden" name="action" value="creerEtudiant"/>  
                    <input type="submit" value="suivant" name="submit"/>  
                </form>  
