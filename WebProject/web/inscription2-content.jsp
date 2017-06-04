<%-- 
    Document   : inscription2-content
    Created on : 4 juin 2017, 20:08:00
    Author     : deptinfo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        
         <form method="POST" action="ServletUsers?action=creerEnseignant">
                    Nom : <input type="text" name="nom"/><br>  
                    Prénom : <input type="text"  name="prenom"/><br> 
                    Email : <input type="text"  name="email"/><br> 
                    Password : <input type="password"  name="pass"/><br> 
                    MIAGE : <select name="elementSelecte">
                    <option valeur="Sophia Antipolis">Sophia Antipolis</option>
                    <option valeur="Paris">Paris</option>
                    <option valeur="Marseille">Marseille</option>
                </select>
                    <input type="hidden" name="action" value="creerEnseignant"/>  
                    <input type="submit" value="suivant" name="submit"/>  
                </form>  
