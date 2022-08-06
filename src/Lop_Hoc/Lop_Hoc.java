package Lop_Hoc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Lop_Hoc 
{
    /**
     * Lấy ra nhi�?u dòng bản ghi dữ liệu
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static List<HashMap<String, String>> List() 
            throws SQLException, ClassNotFoundException
    {
        String sql = 
        		"SELECT * FROM `lop_hoc`";
        DB.open(); // Mở kết nối tới CSDL
        ResultSet rs = DB.q(sql);
            
        // Dữ liệu trả v�?
        List<HashMap<String,String>> list = new ArrayList<>();
        
        // �?ẩy dữ liệu bảng MySQL sang Java List
        while(rs.next())
        {
            HashMap<String,String> row = new HashMap<>();
            row.put("Ma_Lop", rs.getString("Ma_Lop")) ;
            row.put("Ten_Lop",rs.getString("Ten_Lop")) ;
            
                
            list.add(row);             
        }
        
        DB.close(); // �?óng kết nối sau khi dữ liệu ResultSet đã chạy sang List
                    // Khi đóng DB thì ResultSet cũng chết theo !!!
        
        return list;
    }
    
    /**
     * Lấy ra chi tiết của 1 dòng bản ghi dữ liệu
     * @param id
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static HashMap<String,String> Details(String Ma_Lop) 
            throws SQLException, ClassNotFoundException
    {
        //String sql = "SELECT * FROM `ThuCung` ");
        String sql =  
        		"SELECT * FROM `lop_hoc` WHERE `Ma_Lop`='"+Ma_Lop+"'";
        
        DB.open(); // Mở kết nối tới CSDL
        ResultSet rs = DB.q(sql);
            
        // Dữ liệu trả v�?
        HashMap<String,String> row  = new HashMap<>();
        
        // �?ẩy dữ liệu bảng MySQL sang Java List
        while(rs.next())
        {
            row.put("Ma_Lop", rs.getString("Ma_Lop")) ;
            row.put("Ten_Lop",rs.getString("Ten_Lop")) ;
            
                
            break; // Lấy xong dữ liệu 1 dòng bản ghi rồi thì thôi        
        }
        
        DB.close(); // �?óng kết nối sau khi dữ liệu ResultSet đã chạy sang List
                    // Khi đóng DB thì ResultSet cũng chết theo !!!
        
        return row;
    }
    
    /**
     * Thêm mới 1 dòng bản ghi
     * @param params
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void Add(HashMap<Integer,String> params) 
            throws SQLException, ClassNotFoundException
    {
        // Câu này paste trực tiếp vào XAMPP PHP MySQL lại ko việc gì 
            //INSERT INTO ThuCung SET `Ten`='Doremon',`Tuoi`='3',`CanNang`='3.5',`NhomMau`='A',`GioiTinh`= '1'
            
        // the mysql insert statement
        // �?ừng có đặt dấu ? trong nháy đơn, Java làm hộ mình rồi nhé !
        String sql = " INSERT INTO `lop_hoc`(`Ma_Lop`, `Ten_Lop`) VALUES (?,?) ";
                   
        // Thực thi câu SQL INSERT
        DB.exec(sql, params);
    }
    
    /**
     * Sửa 1 dòng bản ghi theo khoá chính: id
     * @param params
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void Edit(HashMap<Integer,String> params) 
            throws SQLException, ClassNotFoundException
    {
        // Câu này paste trực tiếp vào XAMPP PHP MySQL lại ko việc gì 
            //INSERT INTO ThuCung SET `Ten`='Doremon',`Tuoi`='3',`CanNang`='3.5',`NhomMau`='A',`GioiTinh`= '1'
            
        // the mysql insert statement
        // �?ừng có đặt dấu ? trong nháy đơn, Java làm hộ mình rồi nhé !
        // �?ừng có đặt dấu ? trong nháy đơn, Java làm hộ mình rồi nhé !
        String sql = "UPDATE `lop_hoc` SET `Ten_Lop`=? WHERE `Ma_Lop`=?" ;               
                       
        // Thực thi câu SQL UPDATE
        DB.exec(sql, params);
    }
    
    /**
     * Xoá 1 dòng bản ghi theo khoá chính id
     * @param params
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void Delete(HashMap<Integer,String> params) 
            throws SQLException, ClassNotFoundException
    {
        // Câu này paste trực tiếp vào XAMPP PHP MySQL lại ko việc gì 
            //INSERT INTO ThuCung SET `Ten`='Doremon',`Tuoi`='3',`CanNang`='3.5',`NhomMau`='A',`GioiTinh`= '1'
            
        // the mysql insert statement
        // �?ừng có đặt dấu ? trong nháy đơn, Java làm hộ mình rồi nhé !
        // �?ừng có đặt dấu ? trong nháy đơn, Java làm hộ mình rồi nhé !
        // Câu này paste trực tiếp vào XAMPP PHP MySQL lại ko việc gì 
            //INSERT INTO ThuCung SET `Ten`='Doremon',`Tuoi`='3',`CanNang`='3.5',`NhomMau`='A',`GioiTinh`= '1'
            

        String sql = " DELETE FROM `lop_hoc`  WHERE `Ma_Lop` = ?";
                       
        // Thực thi câu SQL 
        DB.exec(sql, params);
    }
}// end class
