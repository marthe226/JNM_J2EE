/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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
import utilisateur.gestionnaires.GestionnaireUtilisateurs;
import utilisateurs.modele.Etudiant;

/**
 *
 * @author deptinfo
 */
@WebServlet(name = "ServletUser", urlPatterns = {"/ServletUser"})
public class ServletUser extends HttpServlet {

    @EJB
    private GestionnaireUtilisateurs gestionnaireUtilisateurs;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
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
        
         if("creerEtudiant".equals(action)){
            
            
            if(request.getParameter("pass").equals(request.getParameter("confirmepass"))){
            gestionnaireUtilisateurs.creerEtudiant(request.getParameter("nom"), request.getParameter("prenom"), request.getParameter("email"), request.getParameter("pass"));
            Collection <Etudiant> liste= gestionnaireUtilisateurs.getAllStudent();
            request.setAttribute("listeEtu", liste);
            forwardTo = "afficheEtudiant.jsp?action=listerEtudiant";      
            message = "Etudiant crée !";
            }
            else{
                 forwardTo = "connect.jsp?action=listerEtudiant";      
                 message = "mot de passe non identique !";
            }
        }
         else 
             if ("etapeinscription".equals(action) || "choixprofil".equals(action)){
                
                 String nom=request.getParameter("nom");
                 String prenom=request.getParameter("prenom");
                 String email=request.getParameter("email");
                 String pass=request.getParameter("pass");
                 request.setAttribute("etudiant", request.getParameter("etudiant"));
                 forwardTo = "inscription2.jsp?action=choixprofil";
                 
       
             }
            else if (action.equals("creerUtilisateursDeTest")) {  
                gestionnaireUtilisateurs.creerUtilisateursDeTest();  
                forwardTo = "inscription2.jsp?action=choixprofil" ;  
              
             }

           System.out.println("Forward to "+forwardTo);
        RequestDispatcher dp = request.getRequestDispatcher(forwardTo + "&message=" + message);
        dp.forward(request, response);
        // Après un forward, plus rien ne peut être exécuté après !  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
