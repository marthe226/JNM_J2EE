<%-- 
    Document   : inscription3-content
    Created on : 4 juin 2017, 20:12:13
    Author     : deptinfo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        
         <form method="POST" action="ServletUsers?action=creerEntreprise">
                    Nom : <input type="text" name="nom"/><br>  
                    Prénom : <input type="text"  name="prenom"/><br> 
                    Email : <input type="text"  name="email"/><br> 
                    Password : <input type="password"  name="pass"/><br> 
                    Votre fonction : <input type="text"  name="fct"/><br> 
                    Nom de l'entreprise : <input type="text"  name="entreprise"/><br> 
                    Téléphone : <input type="text"  name="tel"/><br> 
                    Adresse : <input type="text"  name="adr"/><br> 
                    Secteur d'activité : <select name="elementSelecte">
<option valeur="Informatique">Informatique</option>
<option valeur="Service">Service</option>
<option valeur="Industrie">Industrie</option>
</select>
          

         
                    <input type="hidden" name="action" value="creerEntreprise"/>  
                    <input type="submit" value="suivant" name="submit"/>  
                </form>  
