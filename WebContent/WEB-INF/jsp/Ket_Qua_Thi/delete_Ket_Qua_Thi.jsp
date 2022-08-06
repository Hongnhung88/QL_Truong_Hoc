<%@page contentType="text/html" pageEncoding="UTF-8"%>

<section class="section-conten padding-y" style="min-height:84vh">
		<div class="card mx-auto" style="max-width: 380px; margin-top:40px;">
      	<div class="card-body">
      	<h4 class="card-title">Xóa điểm sinh viên</h4>
      	<sup>Vui lòng điền đầy đủ thông tin</sup>
      	<form class="mt-3">
          <div class="form-group">
          	<label>Mã kết quả thi: </label>
			 <input name="Ma_KQT" class="form-control" placeholder="Maketquathi" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Mã sinh viên:</label>
			<input name="Ma_SV" class="form-control" placeholder="Masinhvien" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Mã môn:</label>
			<input name="Ma_Mon" class="form-control" placeholder="Mamonhoc" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Điểm:</label>
			<input name="Diem" class="form-control" placeholder="" type="text">
          </div> <!-- form-group// -->

          <div class="form-group">
          	<br><d>Bạn có chắc chắn muốn xóa không?</d><br>
              <button type="submit" class="btn btn-primary btn-block"> Xóa  </button>
          </div> <!-- form-group// -->    
      </form>
      </div> <!-- card-body.// -->
    </div> <!-- card .// -->

     <p class="text-center mt-4"> Bạn không muốn xóa?  <a href="/Ket_Qua_Thi">Danh Sách Kết Quả Thi</a></p>
     <br>
<!-- ============================ COMPONENT LOGIN  END.// ================================= -->


</section>

<!-- http://localhost/delete?id=15 -->
<form method="post" action="/Xoa_Ket_Qua_Thi?Ma_KQT=${Data.Ma_KQT}">
	<fieldset>
		<legend>Form: Xoá 2022.06.12</legend>
        
        <label>Mã Kết Qủa Thi:</label>
		<input type="text" name="Ma_KQT" value="${Data.Ma_KQT}" disabled/>
		
		<label>Mã Sinh Viên:</label>
		<input type="text" name="Ma_SV" value="${Data.Ma_SV}" disabled/>
		
		<label>Mã Môn:</label>
		<input type="text" name="Ma_Mon" value="${Data.Ma_Mon}" disabled/>
		
		<label>Điểm:</label>
		<input type="text" name="Diem" value="${Data.Diem}" disabled/>
		
                <label style="width: 100%;text-align: left;">Bạn có chắc muốn xóa ?</label>
		<br class="clear_float">
		
		<button>Xoá</button>
	</fieldset>

	<!--
	<div class="error_msg">
		Lỗi có thể xảy ra ...
	</div>
	-->
</form>
