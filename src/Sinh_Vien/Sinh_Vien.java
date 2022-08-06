package Sinh_Vien;

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
public class Sinh_Vien 
{
    /**
     * Láº¥y ra nhiá»?u dÃ²ng báº£n ghi dá»¯ liá»‡u
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static List<HashMap<String, String>> List() 
            throws SQLException, ClassNotFoundException
    {
        String sql = 
        		"SELECT sinh_vien.Ma_SV, sinh_vien.Ten_SV, lop_hoc.Ten_Lop FROM `sinh_vien` LEFT JOIN lop_hoc ON sinh_vien.Ma_Lop=lop_hoc.Ma_Lop ";
        DB.open(); // Má»Ÿ káº¿t ná»‘i tá»›i CSDL
        ResultSet rs = DB.q(sql);
            
        // Dá»¯ liá»‡u tráº£ vá»?
        List<HashMap<String,String>> list = new ArrayList<>();
        
        // Ä?áº©y dá»¯ liá»‡u báº£ng MySQL sang Java List
        while(rs.next())
        {
            HashMap<String,String> row = new HashMap<>();//cần lưu ý
            row.put("Ma_SV", rs.getString("Ma_SV")) ;
            row.put("Ten_SV",rs.getString("Ten_SV")) ;
            row.put("Ma_Lop",rs.getString("lop_hoc.Ten_Lop")) ;
                
            list.add(row);             
        }
        
        DB.close(); // Ä?Ã³ng káº¿t ná»‘i sau khi dá»¯ liá»‡u ResultSet Ä‘Ã£ cháº¡y sang List
                    // Khi Ä‘Ã³ng DB thÃ¬ ResultSet cÅ©ng cháº¿t theo !!!
        
        return list;
    }
    
    /**
     * Láº¥y ra chi tiáº¿t cá»§a 1 dÃ²ng báº£n ghi dá»¯ liá»‡u
     * @param id
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static HashMap<String,String> Details(String Ma_SV) 
            throws SQLException, ClassNotFoundException
    {
        //String sql = "SELECT * FROM `ThuCung` ");
        String sql =  
        		"SELECT * FROM `sinh_vien` WHERE `Ma_SV`='"+Ma_SV+"'";
        
        DB.open(); // Má»Ÿ káº¿t ná»‘i tá»›i CSDL
        ResultSet rs = DB.q(sql);
            
        // Dá»¯ liá»‡u tráº£ vá»?
        HashMap<String,String> row  = new HashMap<>();
        
        // Ä?áº©y dá»¯ liá»‡u báº£ng MySQL sang Java List
        while(rs.next())
        {
            row.put("Ma_SV", rs.getString("Ma_SV")) ;
            row.put("Ten_SV", rs.getString("Ten_SV")) ;
            row.put("Ma_Lop", rs.getString("Ma_Lop")) ;
                
            break; // Láº¥y xong dá»¯ liá»‡u 1 dÃ²ng báº£n ghi rá»“i thÃ¬ thÃ´i        
        }
        
        DB.close(); // Ä?Ã³ng káº¿t ná»‘i sau khi dá»¯ liá»‡u ResultSet Ä‘Ã£ cháº¡y sang List
                    // Khi Ä‘Ã³ng DB thÃ¬ ResultSet cÅ©ng cháº¿t theo !!!
        
        return row;
    }
    
    /**
     * ThÃªm má»›i 1 dÃ²ng báº£n ghi
     * @param params
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void Add(HashMap<Integer,String> params) 
            throws SQLException, ClassNotFoundException
    {
        // CÃ¢u nÃ y paste trá»±c tiáº¿p vÃ o XAMPP PHP MySQL láº¡i ko viá»‡c gÃ¬ 
            //INSERT INTO ThuCung SET `Ten`='Doremon',`Tuoi`='3',`CanNang`='3.5',`NhomMau`='A',`GioiTinh`= '1'
            
        // the mysql insert statement
        // Ä?á»«ng cÃ³ Ä‘áº·t dáº¥u ? trong nhÃ¡y Ä‘Æ¡n, Java lÃ m há»™ mÃ¬nh rá»“i nhÃ© !
        String sql =" INSERT INTO `sinh_vien`(`Ma_SV`, `Ten_SV`,`Ma_Lop`) VALUES (?,?,?) ";
                   
        // Thá»±c thi cÃ¢u SQL INSERT
        DB.exec(sql, params);
    }
    
    /**
     * Sá»­a 1 dÃ²ng báº£n ghi theo khoÃ¡ chÃ­nh: id
     * @param params
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void Edit(HashMap<Integer,String> params) 
            throws SQLException, ClassNotFoundException
    {
        // CÃ¢u nÃ y paste trá»±c tiáº¿p vÃ o XAMPP PHP MySQL láº¡i ko viá»‡c gÃ¬ 
            //INSERT INTO ThuCung SET `Ten`='Doremon',`Tuoi`='3',`CanNang`='3.5',`NhomMau`='A',`GioiTinh`= '1'
            
        // the mysql insert statement
        // Ä?á»«ng cÃ³ Ä‘áº·t dáº¥u ? trong nhÃ¡y Ä‘Æ¡n, Java lÃ m há»™ mÃ¬nh rá»“i nhÃ© !
        // Ä?á»«ng cÃ³ Ä‘áº·t dáº¥u ? trong nhÃ¡y Ä‘Æ¡n, Java lÃ m há»™ mÃ¬nh rá»“i nhÃ© !
        String sql = "UPDATE `sinh_vien` SET `Ten_SV`=?,`Ma_Lop`=? WHERE `Ma_SV`=?" ;               
                       
        // Thá»±c thi cÃ¢u SQL UPDATE
        DB.exec(sql, params);
    }
    
    /**
     * XoÃ¡ 1 dÃ²ng báº£n ghi theo khoÃ¡ chÃ­nh id
     * @param params
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void Delete(HashMap<Integer,String> params) 
            throws SQLException, ClassNotFoundException
    {
        // CÃ¢u nÃ y paste trá»±c tiáº¿p vÃ o XAMPP PHP MySQL láº¡i ko viá»‡c gÃ¬ 
            //INSERT INTO ThuCung SET `Ten`='Doremon',`Tuoi`='3',`CanNang`='3.5',`NhomMau`='A',`GioiTinh`= '1'
            
        // the mysql insert statement
        // Ä?á»«ng cÃ³ Ä‘áº·t dáº¥u ? trong nhÃ¡y Ä‘Æ¡n, Java lÃ m há»™ mÃ¬nh rá»“i nhÃ© !
        // Ä?á»«ng cÃ³ Ä‘áº·t dáº¥u ? trong nhÃ¡y Ä‘Æ¡n, Java lÃ m há»™ mÃ¬nh rá»“i nhÃ© !
        // CÃ¢u nÃ y paste trá»±c tiáº¿p vÃ o XAMPP PHP MySQL láº¡i ko viá»‡c gÃ¬ 
            //INSERT INTO ThuCung SET `Ten`='Doremon',`Tuoi`='3',`CanNang`='3.5',`NhomMau`='A',`GioiTinh`= '1'
            

        String sql = " DELETE FROM `sinh_vien`  WHERE `Ma_SV` = ?";
                       
        // Thá»±c thi cÃ¢u SQL 
        DB.exec(sql, params);
    }
}// end class
