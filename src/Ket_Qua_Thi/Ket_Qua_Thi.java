package Ket_Qua_Thi;

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
public class Ket_Qua_Thi 
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
        		"SELECT ket_qua_thi.Ma_KQT, sinh_vien.Ten_SV, mon_hoc.Ten_Mon, ket_qua_thi.Diem FROM `ket_qua_thi` LEFT JOIN sinh_vien on ket_qua_thi.Ma_SV = sinh_vien.Ma_SV LEFT JOIN mon_hoc on ket_qua_thi.Ma_Mon= mon_hoc.Ma_Mon;";
        DB.open(); // Mở kết nối tới CSDL
        ResultSet rs = DB.q(sql);
            
        // Dữ liệu trả v�?
        List<HashMap<String,String>> list = new ArrayList<>();
        
        // �?ẩy dữ liệu bảng MySQL sang Java List
        while(rs.next())
        {
            HashMap<String,String> row = new HashMap<>();
            row.put("Ma_KQT", rs.getString("Ma_KQT")) ;
            row.put("Ma_SV",rs.getString("sinh_vien.Ten_SV")) ;
            row.put("Ma_Mon",rs.getString("mon_hoc.Ten_Mon")) ;
            row.put("Diem",rs.getString("Diem")) ;    
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
    public static HashMap<String,String> Details(String Ma_KQT) 
            throws SQLException, ClassNotFoundException
    {
        //String sql = "SELECT * FROM `ThuCung` ");
        String sql =  
        		"SELECT * FROM `ket_qua_thi` WHERE `Ma_KQT`='"+Ma_KQT+"'";
        
        DB.open(); // Mở kết nối tới CSDL
        ResultSet rs = DB.q(sql);
            
        // Dữ liệu trả v�?
        HashMap<String,String> row  = new HashMap<>();
        
        // �?ẩy dữ liệu bảng MySQL sang Java List
        while(rs.next())
        {
            row.put("Ma_KQT", rs.getString("Ma_KQT")) ;
            row.put("Ma_SV", rs.getString("Ma_SV")) ;
            row.put("Ma_Mon", rs.getString("Ma_Mon")) ;
            row.put("Diem", rs.getString("Diem")) ;    
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
        String sql ="INSERT INTO `ket_qua_thi`(`Ma_KQT`, `Ma_SV`, `Ma_Mon`, `Diem`) VALUES (?,?,?,?)";
                   
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
        String sql = "UPDATE `ket_qua_thi` SET `Ma_SV`= ? ,`Ma_Mon`=?,`Diem`=? WHERE `Ma_KQT`=?" ;               
                       
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
            

        String sql = " DELETE FROM `ket_qua_thi`  WHERE `Ma_KQT` = ?";
                       
        // Thực thi câu SQL 
        DB.exec(sql, params);
    }
}// end class
