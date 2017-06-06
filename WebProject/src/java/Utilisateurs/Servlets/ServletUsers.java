/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilisateurs.Servlets;

import Utilisateurs.Gestionnaire.GestionnaireUtilisateurs;
import Utilisateurs.Modeles.Enseignant;
import Utilisateurs.Modeles.Etudiant;
import Utilisateurs.Modeles.Utilisateur;
import java.io.IOException;
import java.util.Collection;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author deptinfo
 */
@WebServlet(name = "ServletUsers", urlPatterns = {"/ServletUsers"})  
public class ServletUsers extends HttpServlet {  

    @EJB
    private GestionnaireUtilisateurs gestionnaireUtilisateurs;
    // ici injection de code ! On n'initialise pas !  
    
   
  
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods. 
     * @param request servlet request 
     * @param response servlet response 
     * @throws ServletException if a servlet-specific error occurs 
     * @throws IOException if an I/O error occurs 
     */  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        // Pratique pour décider de l'action à faire  
        String action = request.getParameter("action");  
        HttpSession session = request.getSession(true);
        String forwardTo = "";  
        String message = "";  
  if (!action.equalsIgnoreCase("connexion") && !action.equalsIgnoreCase("creerEntreprise") && !action.equalsIgnoreCase("creerEnseignant") 
          && !action.equalsIgnoreCase("creerEtudiant") && session.getAttribute("user") == null) 
  {
                forwardTo = "connect.jsp?action=connexion";
                message = "veuillez vous connecter";
            } 
  else 
  {  
            switch (action) {
                case "listerLesUtilisateurs":
                    {
                        Collection<Etudiant> liste = gestionnaireUtilisateurs.getAllStudents();
                        request.setAttribute("listeDesUsers", liste);
                        forwardTo = "index.jsp?action=listerLesUtilisateurs";
                        message = "Liste des utilisateurs";
                        break;
                    }
                case "ListerProf":
                    {
                        Collection<Enseignant> liste = gestionnaireUtilisateurs.getAllTeachers();
                        request.setAttribute("listeDesProfs", liste);
                        forwardTo = "index.jsp?action=listerLesProfs";
                        message = "Liste des utilisateurs";
                        break;
                    }
                case "creerEtudiant":
                {
                    gestionnaireUtilisateurs.creeEtudiant(request.getParameter("nom"), request.getParameter("prenom"), request.getParameter("pass"),request.getParameter("email"), request.getParameter("naissance"),request.getParameter("elementSelecte"), request.getParameter("miage"));
                    forwardTo = "index.jsp?action=listerLesUtilisateurs";
                    message = "Utilisateur crée !";
                    break;
                }
                case "creerEnseignant":
                {
                    gestionnaireUtilisateurs.creeEnseigant(request.getParameter("nom"), request.getParameter("prenom"), request.getParameter("pass"),request.getParameter("email"),request.getParameter("elementSelecte"));
                    forwardTo = "index.jsp?action=listerLesUtilisateurs";
                    message = "Utilisateur crée !";
                    break;
                }
                case "creerEntreprise":
                {
                    gestionnaireUtilisateurs.creeEntreprise(request.getParameter("nom"), request.getParameter("prenom"), request.getParameter("pass"),request.getParameter("email"),request.getParameter("fct"), request.getParameter("entreprise"),request.getParameter("adr"),request.getParameter("elementSelecte"),request.getParameter("tel"));
                    forwardTo = "index.jsp?action=listerLesUtilisateurs";
                    message = "Utilisateur crée !";
                    break;
                }
                case "connexion":{
                    Utilisateur utilisateur = gestionnaireUtilisateurs.isLoginValid(request.getParameter("email"), request.getParameter("password"));
                    if (utilisateur != null) {
                        session.setAttribute("user", utilisateur);
                        message = "vous êtes connecté, bienvenue "  +utilisateur.getNom();
                        forwardTo= "informations.jsp?action=packetu";
                    } else {
                        message = "login ou username erroné";  
                    }       forwardTo = "connect.jsp?action=connexion";
                    break;
                }
                case  "choixprofil":
                {
                    if("etudiant".equals(request.getParameter("profil"))){
                        message= "vous êtes etudiant";
                        forwardTo="inscription1.jsp?action=creerEtudiant";
                    }
                    break;
                }
                case "packetu":
                {
                     message= "bienvenue dans le pack etudiant";
                     forwardTo= "packetudiant.jsp?action=payer";
                   /* if(request.getParameter("packetu")!=null){
                       
                    }*/
                    break;
                }
                case "deconnexion":
                {
                    session.invalidate();
                    message = "deconnecté";
                    forwardTo = "index.jsp?action=listerLesUtilisateurs";
                    break;
                }
                default:
                    forwardTo = "index.jsp?action=todo";
                    message = "La fonctionnalité pour le paramètre " + action + " est à implémenter !";
                    break;
            }
        }  
  
        RequestDispatcher dp = request.getRequestDispatcher(forwardTo + "&message=" + message);  
        dp.forward(request, response);  
        // Après un forward, plus rien ne peut être exécuté après !  
    }  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}  
