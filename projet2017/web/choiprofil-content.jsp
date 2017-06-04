<%-- 
    Document   : inscription2-content
    Created on : 1 juin 2017, 07:11:02
    Author     : deptinfo
--%>

<form method="post" action="ServletUser?action=choixprofil">
      
    <label for="pays">Vous êtes?</label><br />

       <select name="profil" id="pays">

           <option  value="etudiant" selected="etudiant" onclick="ServletUser?action=choixEtudiant">etudiant</option>

           <option value="enseignant" onclick="ServletUser?action=choixEnseignant">enseignant</option>

           <option value="entreprise" onclick="ServletUser?action=choixEntreprise">entreprise</option>

       </select>
    <input type="submit" value="suivant" name="submit"/> 

</form>
