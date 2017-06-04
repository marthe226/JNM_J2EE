/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilisateurs.Gestionnaire;

import Utilisateurs.Modeles.Etudiant;
import Utilisateurs.Modeles.Utilisateur;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author deptinfo
 */
@Stateless
public class GestionnaireUtilisateurs {

     @PersistenceContext  
    private EntityManager em;  
  
    public void creerUtilisateursDeTest() {  
        creeUtilisateur("John", "Lennon", "jlennon", "Lennon");  
        creeUtilisateur("Paul", "Mac Cartney", "pmc", "Lennon");  
        creeUtilisateur("Ringo", "Starr", "rstarr", "Lennon");  
        creeUtilisateur("Georges", "Harisson", "georgesH", "Lennon");  
    }  
  
    public Utilisateur creeUtilisateur(String nom, String prenom, String password, String email) {  
        Utilisateur u = new Utilisateur(nom, prenom, password,email) {};  
        em.persist(u);  
        return u;  
    }  
  
    public Collection<Utilisateur> getAllUsers() {  
        // Exécution d'une requête équivalente à un select *  
        Query q = em.createQuery("select u from Utilisateur u");  
        return q.getResultList();  
    }  
}
