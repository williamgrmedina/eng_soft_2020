/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sun.rmi.server.Dispatcher;

/**
 *
 * @author Medina
 */
@WebServlet(name = "LoginController",
        urlPatterns = {
            ""
        })
public class LoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        
        HttpSession session;
        RequestDispatcher dispatcher;
        
        switch (request.getServletPath()) {
            case "": {
                session = request.getSession(false);
                if (session != null) {
                    if (session.getAttribute("usuario") != null) {
                        dispatcher = request.getRequestDispatcher("/view/usuario/welcome.jsp");
                    } else if (session.getAttribute("funcionario") != null) {
                        dispatcher = request.getRequestDispatcher("/view/funcionario/welcome.jsp");
                    } else if (session.getAttribute("escola") != null) {
                        dispatcher = request.getRequestDispatcher("/view/escola/welcome.jsp");
                    } else {
                        dispatcher = request.getRequestDispatcher("/index.jsp");
                    }
                } else {
                    dispatcher = request.getRequestDispatcher("/index.jsp");
                }
                
                dispatcher.forward(request, response);
                break;
            }
        }
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
        
        HttpSession session;
        RequestDispatcher dispatcher = null;
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
