package Lop_Hoc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
@WebServlet(urlPatterns = {"/Them_Lop_Hoc", "/them_lop_hoc"})
public class Them_Servlet extends HttpServlet {

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
            out.println("<title>Servlet AddServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddServlet at " + request.getContextPath() + "</h1>");
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
//        if (request.getCharacterEncoding() == null) {
//            request.setCharacterEncoding("utf-8");
//           }
//           response.setContentType("text/json; charset=UTF-8");
//           PrintWriter out = response.getWriter();
//           String raw = request.getParameter("q");
//           if (raw == null || "".equals(raw)) {
//            out.println("{ok:false, entailments:[], triples=[], msg=\"\"}");
//           } else {
//            doGet(out, raw);
//           }
//           out.close();
        
        request.setAttribute("web_title","Thêm Mới"); // Tựa đ�? Web
        request.setAttribute("web_content","add.jsp"); // Nội dung Web
        
        try {
            request.getRequestDispatcher("/WEB-INF/jsp/layout.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * https://stackoverflow.com/questions/4971877/how-to-transfer-data-from-jsp-to-servlet-when-submitting-html-form
     * https://ofstack.com/Java/7547/a-java-utility-class-that-connects-to-a-mysql-database.html
     * https://www.vogella.com/tutorials/MySQLJava/article.html
     * https://ict.iitk.ac.in/forum/topic/java-sql-sqlexception-parameter-index-out-of-range-1-number-of-parameters-which-is-0/
     * https://alvinalexander.com/java/java-mysql-insert-example-preparedstatement/
     * https://www.tabnine.com/code/java/methods/javax.servlet.http.HttpServletRequest/setCharacterEncoding
     * https://stackoverflow.com/questions/16527576/httpservletrequest-utf-8-encoding
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        // Chỉ rõ lược đồ mã hoá font chữ, trước khi 
        // lưu dữ liệu Form vào SQL
        request.setCharacterEncoding("UTF-8");
        
        try 
        {
            // Bắt lấy dữ liệu gửi lên từ Form
            String Ma_Lop      = request.getParameter("Ma_Lop");
            String Ten_Lop     = request.getParameter("Ten_Lop");
            
        
            HashMap<Integer,String> data = new HashMap();
            data.put(1,Ma_Lop);
            data.put(2,Ten_Lop);
            
            
            // Thêm mới dòng bản ghi vào CSDL
            Lop_Hoc.Add(data);
            
            HttpSession session = request.getSession();
            session.setAttribute("SUCCESS_MSG", "�?ã hoàn tất việc thêm mới !");
            
            response.sendRedirect("/Lop_Hoc");
        } catch (Exception ex) {
            
            System.out.println("SQL Error: "+ex.getMessage());
            
        }
        
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
