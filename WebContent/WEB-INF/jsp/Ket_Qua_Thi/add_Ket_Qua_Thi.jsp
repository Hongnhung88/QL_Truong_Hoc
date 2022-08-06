<%@ page pageEncoding="UTF-8" contentType="text/html" %>
<a href="/Ket_Qua_Thi">Danh Sách</a>

<section class="section-conten padding-y" style="min-height:84vh">
		<div class="card mx-auto" style="max-width: 380px; margin-top:40px;">
      	<div class="card-body">
      	<h4 class="card-title">Nhập kết quả thi mới</h4>
      	<sup>Vui lòng điền đầy đủ thông tin</sup>
      	<form class="mt-3">
          <div class="form-group">
          	<label>Mã kết quả thi: </label>
			 			<input name="Ma_KQT" class="form-control" placeholder="Maketquathi" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Mã sinh viên: </label>
			 			<input name="Ma_SV" class="form-control" placeholder="Masinhvien" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Mã môn học:</label>
						<input name="Ma_Mon" class="form-control" placeholder="Mamonhoc" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Điểm:</label>
						<input name="Diem" class="form-control" placeholder="" type="text"><br>
          </div> <!-- form-group// -->
          <div class="form-group">
              <button type="submit" class="btn btn-primary btn-block"> Lưu </button>
          </div> <!-- form-group// -->    
      </form>
      </div> <!-- card-body.// -->
    </div> <!-- card .// -->
     <br>
<!-- ============================ COMPONENT LOGIN  END.// ================================= -->


</section>
