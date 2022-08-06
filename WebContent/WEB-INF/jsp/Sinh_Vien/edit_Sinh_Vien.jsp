<%-- 
    Document   : _edit
    Created on : Jun 9, 2022, 6:29:34 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<a href="/Sinh_Vien">Danh Sách Sinh Viên</a>

<section class="section-conten padding-y" style="min-height:84vh">
		<div class="card mx-auto" style="max-width: 380px; margin-top:40px;">
      	<div class="card-body">
      	<h4 class="card-title">Sửa thông tin sinh viên</h4>
      	<sup>Vui lòng điền đầy đủ thông tin</sup>
      	<form class="mt-3">
          <div class="form-group">
          	<label>Mã sinh viên: </label>
			 <input name="Ma_SV" class="form-control" placeholder="Masinvien" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Mã lớp học:</label>
			<input name="Ma_Lop" class="form-control" placeholder="Malophoc" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Tên sinh viên:</label>
			<input name="Ten_SV" class="form-control" placeholder="Tensinhvien" type="text"><br>
          </div> <!-- form-group// -->

          <div class="form-group">
              <button type="submit" class="btn btn-primary btn-block"> Lưu  </button>
          </div> <!-- form-group// -->    
      </form>
      </div> <!-- card-body.// -->
    </div> <!-- card .// -->
     <br>
<!-- ============================ COMPONENT LOGIN  END.// ================================= -->


</section>

<!-- http://localhost/edit?id=15 -->