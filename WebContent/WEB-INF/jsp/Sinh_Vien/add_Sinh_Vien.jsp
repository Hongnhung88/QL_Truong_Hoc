<%@ page pageEncoding="UTF-8" contentType="text/html" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<a href="/Sinh_Vien">Danh Sách</a>
	<section class="section-conten padding-y" style="min-height:84vh">
		<div class="card mx-auto" style="max-width: 380px; margin-top:40px;">
      	<div class="card-body">
      	<h4 class="card-title">Thêm mới sinh viên</h4>
      	<sup>Vui lòng điền đầy đủ thông tin</sup>
      	<form class="mt-3">
          <div class="form-group">
          	<label>Mã sinh viên: </label>
			 			<input name="Ma_SV" class="form-control" placeholder="Masinhvien" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
          	<label>Tên sinh viên:</label>
						<input name="Ten_SV" class="form-control" placeholder="Tensinhvien" type="text">
          </div> <!-- form-group// -->
          <div class="form-group">
				<label>Tên lớp:</label> <select class="form-select"
					name="Ma_Lop" aria-label="select example" required>
					<option value="">Mở để chọn lớp</option>
					<c:forEach var="DataCLass" items="${requestScope.DataClass}">
						<!--m? vòng l?p for -->
						<option value="${DataCLass.Ma_Lop}">${DataCLass.Ten_Lop}</option>
					</c:forEach>
				</select>
          </div> <!-- form-group// -->
          <div class="form-group">
              <br><button type="submit" class="btn btn-primary btn-block"> Lưu </button>
          </div> <!-- form-group// -->    
      </form>
      </div> <!-- card-body.// -->
    </div> <!-- card .// -->
     <br>
<!-- ============================ COMPONENT LOGIN  END.// ================================= -->


</section>
