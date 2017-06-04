/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilisateurs.Gestionnaire;

import Utilisateurs.Modeles.Enseignant;
import Utilisateurs.Modeles.Entreprise;
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
  
    public Etudiant creeEtudiant(String firstname, String lastname, String email, String password, String naissance, String miage, String ancien) { 
        Etudiant etudiant = new Etudiant(firstname, lastname,email,password,naissance,miage,ancien) ;
        em.persist(etudiant);  
        return etudiant;  
    }  
    
      public Enseignant creeEnseigant(String firstname, String lastname, String email, String password, String miage) { 
        Enseignant enseignant = new Enseignant(firstname, lastname,email,password,miage)  ;
        enseignant.setValidation("false");
        em.persist(enseignant);  
        return enseignant;  
        
    }  
      
      public Entreprise creeEntreprise(String firstname, String lastname, String email, String password, String fonction, String nom, String adresse, String secteur, String telephone)  { 
        Entreprise entreprise = new Entreprise(firstname,  lastname, email,password,fonction,nom,adresse,secteur,telephone)  ;
        em.persist(entreprise);  
        return entreprise;  
    }  
   
    public Utilisateur isLoginValid(String email, String password) {
     Query q1 = em.createQuery("select e from Etudiant e where e.email= :email and e.password= :password");
     q1.setParameter("email", email);
     q1.setParameter("password", password);
     Query q2 = em.createQuery("select t from Enseignant t where t.email= :email and t.password= :password");
     q2.setParameter("email", email);
     q2.setParameter("password", password);
     Query q3 = em.createQuery("select c from Entreprise c where c.email= :email and c.password= :password");
     q3.setParameter("email", email);
     q3.setParameter("password", password);       
     if(!q1.getResultList().isEmpty()){
         return (Utilisateur) q1.getResultList().get(0);
     }
     else if (!q2.getResultList().isEmpty()) {
         return (Utilisateur) q2.getResultList().get(0);    
     } else if (!q3.getResultList().isEmpty()) {
          return (Utilisateur) q3.getResultList().get(0);    
     } else {
         return null; 
     }
   }
      
   public Collection<Etudiant> getAllStudents() {  
        // Exécution d'une requête équivalente à un select *  
        Query q = em.createQuery("select e from Etudiant e");  
        return q.getResultList();  
    }  

     public Collection<Entreprise> getAllCompanies() {  
        // Exécution d'une requête équivalente à un select *  
        Query q = em.createQuery("select c from Entreprise c");  
        return q.getResultList();  
    }  
     
        public Collection<Enseignant> getAllTeachers() {  
        // Exécution d'une requête équivalente à un select *  
        Query q = em.createQuery("select t from Enseignant t");  
        return q.getResultList();  
    }  

        
        
}
