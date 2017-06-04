/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilisateurs.modele;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author deptinfo
 */
@Entity
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
<<<<<<< HEAD
    private String naissance, miage ;
    private boolean ancien ; 
=======
    @Column(nullable = true)
    private String nom,prenom,pass,email,datenaissance;

    public Etudiant() {
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public Etudiant(String nom, String prenom, String email, String pass,String datenaissance) {
        this.datenaissance = datenaissance;
        this.nom = nom;
        this.prenom = prenom;
        this.pass = pass;
        this.email = email;
    }
    

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
>>>>>>> 86e8ca7d1ca344511c8aefe782a078f879740730

    public String getNaissance() {
        return naissance;
    }

    public String getMiage() {
        return miage;
    }

    public boolean isAncien() {
        return ancien;
    }

    public void setNaissance(String naissance) {
        this.naissance = naissance;
    }

    public void setMiage(String miage) {
        this.miage = miage;
    }

    public void setAncien(boolean ancien) {
        this.ancien = ancien;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "utilisateurs.modele.Etudiant[ id=" + id + " ]";
    }
    
}
