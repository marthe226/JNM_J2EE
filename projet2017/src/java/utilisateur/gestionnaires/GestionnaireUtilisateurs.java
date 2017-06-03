/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilisateur.gestionnaires;

import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import utilisateurs.modele.Etudiant;

/**
 *
 * @author deptinfo
 */
@Stateless
public class GestionnaireUtilisateurs {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
     // Ici injection de code : on n'initialise pas. L'entity manager sera créé  
    // à partir du contenu de persistence.xml  
    @PersistenceContext  
    private EntityManager em;
    
      public void creerEtudiant(String nom,String prenom,String email,String pass){
       Etudiant etu = new  Etudiant();
       etu.setNom(nom);
       etu.setPrenom(prenom);
       etu.setEmail(email);
       etu.setPass(pass);
       em.persist(etu);
      // return (Etudiant) etu;
   }
     
      public Collection<Etudiant> getAllStudent() {  
        // Exécution d'une requête équivalente à un select *  
        Query q = em.createQuery("select e from Etudiant e");  
        return q.getResultList();  
    }  
 
}
