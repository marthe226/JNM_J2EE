/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilisateurs.Modeles;

import javax.ejb.EJBHome;

/**
 *
 * @author deptinfo
 */
public interface Utilisateur extends EJBHome  {
 
    
    public String getNom() ;

    public String getPrenom() ;
 
    public String getEmail() ;

    public String getPassword() ;
    
}
