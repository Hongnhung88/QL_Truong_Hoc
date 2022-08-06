
<%@ page pageEncoding="UTF-8" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${sessionScope.SUCCESS_MSG != null}">
	<div style="background: green;">
		${sessionScope.SUCCESS_MSG}
		<%
			session.setAttribute("SUCCESS_MSG", null);
		%>
	</div>
</c:if>
<a href="/them_sinh_vien">Thêm Mới Sinh Viên</a>
<div class="card-body">
	<table id="datatablesSimple">
	<thead>
		<tr>
			<th>Mã Sinh Viên</th>
			<th>Tên Sinh Viên3333</th>
			<th>Tên Lớp</th>
			<th>Thao Tác</th>
		</tr>
	</thead>
		<tfoot>
		<tr>
			<th>Mã Sinh Viên</th>
			<th>Tên Sinh Viên3333</th>
			<th>Tên Lớp</th>
			<th>Thao Tác</th>
		</tr>
		</tfoot>
	<tbody>
		<c:forEach var="Data" items="${requestScope.DataTable}">
			<!--m? vòng l?p for -->
			<tr>
				<td>${Data.Ma_SV}</td>
				<td>${Data.Ten_SV}</td>
				<!-- hoặc Pet["Ten"] cũng OK-->
				<td>${Data.Ma_Lop}</td>
				<td><a href="/Sua_Sinh_Vien?Ma_SV=${Data.Ma_SV}">Sửa</a> <a
					href="/Xoa_Sinh_Vien?Ma_SV=${Data.Ma_SV}">Xóa</a></td>
			</tr>
		</c:forEach>
		<!-- ?óng vòng l?p for -->
	</tbody>
	</table>
</div>


