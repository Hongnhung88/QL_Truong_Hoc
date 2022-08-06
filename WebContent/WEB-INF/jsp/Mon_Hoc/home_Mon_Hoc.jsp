
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

<a href="/them_mon_hoc">Thêm Mới Môn Học</a>
<div class="card-body">
	<table id="datatablesSimple">
	<thead>
	<tr>
		<th>Mã Môn Học</th>
		<th>Tên Môn Học</th>
		<th>Thao Tác</th>
	</tr>
	</thead>
		<tfoot>
	<tr>
		<th>Mã Môn Học</th>
		<th>Tên Môn Học</th>
		<th>Thao Tác</th>
	</tr>
		</tfoot>
	<tbody>
	<c:forEach var="Data" items="${requestScope.DataTable}">
		<!--m? vòng l?p for -->
		<tr>
			<td>${Data.Ma_Mon}</td>
			<td>${Data.Ten_Mon}</td>
			<!-- hoặc Pet["Ten"] cũng OK-->

			<td><a href="/Sua_Mon_Hoc?Ma_Mon=${Data.Ma_Mon}">Sửa | </a> <a
				href="/Xoa_Mon_Hoc?Ma_Mon=${Data.Ma_Mon}">Xóa</a></td>
		</tr>
	</c:forEach>
		<!-- ?óng vòng l?p for -->
	</tbody>
	</table>
</div>

