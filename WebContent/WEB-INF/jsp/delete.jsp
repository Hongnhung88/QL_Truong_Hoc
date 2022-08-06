<%@page contentType="text/html" pageEncoding="UTF-8"%>

<section class="section-conten padding-y" style="min-height:84vh">
		<div class="card mx-auto" style="max-width: 380px; margin-top:40px;">
      	<div class="card-body">
      	<h4 class="card-title">Xóa lớp học</h4>
      	<sup>Vui lòng điền đầy đủ thông tin</sup>
      	<form class="mt-3">
          <div class="form-group">
          	<label>Mã lớp học:</label>
			<input name="Ma_Lop" class="form-control" placeholder="Malophoc" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Tên lớp học:</label>
			<input name="Ten_Lop" class="form-control" placeholder="Tenlophoc" type="text">
          </div> <!-- form-group// -->

          <div class="form-group">
          	<d>Bạn có chắc chắn muốn xóa không?</d><br>
              <button type="submit" class="btn btn-primary btn-block"> Xóa  </button>
          </div> <!-- form-group// -->    
      </form>
      </div> <!-- card-body.// -->
    </div> <!-- card .// -->

     <p class="text-center mt-4"> Bạn không muốn xóa?  <a href="/Lop_Hoc">Danh sách lớp học</a></p>
     <br>
<!-- ============================ COMPONENT LOGIN  END.// ================================= -->


</section>

