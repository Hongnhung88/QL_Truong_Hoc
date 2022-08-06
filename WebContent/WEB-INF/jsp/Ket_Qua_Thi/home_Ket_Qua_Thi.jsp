
<%@ page pageEncoding="UTF-8" contentType="text/html" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
        
        <c:if test="${sessionScope.SUCCESS_MSG != null}">
            <div style="background: green;">
		${sessionScope.SUCCESS_MSG}
		<% session.setAttribute("SUCCESS_MSG", null); %>
            </div>
        </c:if>

    <a href="/them_ket_qua_thi">Thêm Mới Kết Qủa</a>
    <table id="datatablesSimple">
    <caption>Danh Sách Kết Qủa Thi</caption>
	<thead>
		<tr>
			<th>Mã Kết Qủa Thi</th>
			<th>Mã Sinh Viên</th>
			<th>Mã Môn</th>
			<th>Điểm</th>
			<th>Thao Tác</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="Data" items="${requestScope.DataTable}" > <!--m? vòng l?p for -->
		<tr>
			<td>${Data.Ma_KQT}</td>
			<td>${Data.Ma_SV}</td> <!-- hoặc Pet["Ten"] cũng OK-->
			<td>${Data.Ma_Mon}</td>
			<td>${Data.Diem}</td>
			<td>
				<a href="/Sua_Ket_Qua_Thi?Ma_KQT=${Data.Ma_KQT}">Sửa | </a> 
				<a href="/Xoa_Ket_Qua_Thi?Ma_KQT=${Data.Ma_KQT}">Xóa</a> 
				
			</td>
		</tr>
		</c:forEach> <!-- ?óng vòng l?p for -->
	</tbody>
	</table>
    
    
    
    <table>
		
		<tr>
			
		</tr>
		
		
		
	</table>
