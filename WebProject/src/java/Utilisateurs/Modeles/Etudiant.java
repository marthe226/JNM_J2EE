/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilisateurs.Modeles;

import java.io.Serializable;
import java.rmi.RemoteException;
import javax.ejb.EJBMetaData;
import javax.ejb.Handle;
import javax.ejb.HomeHandle;
import javax.ejb.RemoveException;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author deptinfo
 */
@Entity
public class Etudiant implements Serializable, Utilisateur {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom, prenom,email, password,naissance, miage, ancien ; 

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String email, String password, String naissance, String miage, String ancien) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.naissance = naissance;
        this.miage = miage;
        this.ancien = ancien;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNaissance() {
        return naissance;
    }

    public String getMiage() {
        return miage;
    }

    public String getAncien() {
        return ancien;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNaissance(String naissance) {
        this.naissance = naissance;
    }

    public void setMiage(String miage) {
        this.miage = miage;
    }

    public void setAncien(String ancien) {
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
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Utilisateurs.Modeles.Etudiant[ id=" + id + " ]";
    }

    @Override
    public void remove(Handle handle) throws RemoteException, RemoveException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Object primaryKey) throws RemoteException, RemoveException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EJBMetaData getEJBMetaData() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HomeHandle getHomeHandle() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
