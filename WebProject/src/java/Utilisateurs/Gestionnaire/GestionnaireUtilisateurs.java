/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilisateurs.Gestionnaire;

import Utilisateurs.Modeles.Enseignant;
import Utilisateurs.Modeles.Entreprise;
import Utilisateurs.Modeles.Etudiant;
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
        Enseignant enseigant = new Enseignant(firstname, lastname,email,password,miage)  ;
        em.persist(enseigant);  
        return enseigant;  
        
    }  
      
      public Entreprise creeEntreprise(String firstname, String lastname, String email, String password, String fonction, String nom, String adresse, String secteur, String telephone)  { 
        Entreprise entreprise = new Entreprise(firstname,  lastname, email,password,fonction,nom,adresse,secteur,telephone)  ;
        em.persist(entreprise);  
        return entreprise;  
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
