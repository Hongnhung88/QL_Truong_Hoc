
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<a href="/Lop_Hoc">Danh Sách Lớp Học</a>

<!-- http://localhost/edit?id=15 -->

<section class="section-conten padding-y" style="min-height:84vh">
		<div class="card mx-auto" style="max-width: 380px; margin-top:40px;">
      	<div class="card-body">
      	<h4 class="card-title">Sửa thông tin lớp hoc</h4>
      	<sup>Vui lòng điền đầy đủ thông tin</sup>
      	<form class="mt-3">
          <div class="form-group">
          	<label>Mã lớp học:</label>
			<input name="Ma_Lop" class="form-control" placeholder="Malophoc" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Tên lớp:</label>
			<input name="Ten_Lop" class="form-control" placeholder="Tenlophoc" type="text"><br>
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
