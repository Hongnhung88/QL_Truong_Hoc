package Ket_Qua_Thi;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 * https://stackoverflow.com/questions/28961525/set-session-attribute-using-expression-language
 * https://stackoverflow.com/questions/20597043/in-jsp-how-can-i-check-using-jstl-if-certain-session-attribute-exists-in-requ
 * https://stackoverflow.com/questions/24222845/how-can-i-set-a-session-variable-in-a-servlet-and-get-it-in-a-jsp
 * https://stackoverflow.com/questions/17419727/how-to-use-session-in-jsp-pages-to-get-information
 */
@WebServlet(urlPatterns = {"/Ket_Qua_Thi", "/ket_qua_thi", "/ketquathi"})
public class Ket_Qua_Thi_Servlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HomeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HomeServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
            throws ServletException, IOException 
    {
        //processRequest(request, response);
        
        try {
            
            // Gửi dữ liệu từ Controller sang View
            request.setAttribute("DataTable",Ket_Qua_Thi.List());
            request.setAttribute("web_title","Trang Chủ");
            request.setAttribute("web_content","Ket_Qua_Thi/home_Ket_Qua_Thi.jsp");
            request.getRequestDispatcher("/WEB-INF/jsp/layout.jsp").forward(request, response);
        } 
        catch (Exception ex) 
        {
            //ex.printStackTrace();
            System.out.println("SQL Error: "+ex.getMessage());
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
