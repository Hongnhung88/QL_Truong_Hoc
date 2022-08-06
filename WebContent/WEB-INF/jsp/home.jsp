
<%@ page pageEncoding="UTF-8" contentType="text/html" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
        
        <c:if test="${sessionScope.SUCCESS_MSG != null}">
            <div style="background: green;">
		${sessionScope.SUCCESS_MSG}
		<% session.setAttribute("SUCCESS_MSG", null); %>
            </div>
        </c:if>

    <a href="/them_lop_hoc">Thêm Mới Lớp Học</a>

	
	
<div class="card-body">
	<table id="datatablesSimple">
	<thead>
		<tr>
			<th>Mã Lớp Học</th>
			<th>Tên Lớp Học</th>
			<th>Thao Tác</th>
		</tr>
	</thead>
		<tfoot>
		<tr>
			<th>Mã Lớp Học</th>
			<th>Tên Lớp Học</th>
			<th>Thao Tác</th>
		</tr>
		</tfoot>
	<tbody>
		<c:forEach var="Data" items="${requestScope.DataTable}" > <!--m? vòng l?p for -->
		<tr>
			<td>${Data.Ma_Lop}</td>
			<td>${Data.Ten_Lop}</td> <!-- hoặc Pet["Ten"] cũng OK-->
			 
			<td> 
				<a href="/Sua_Lop_Hoc?Ma_Lop=${Data.Ma_Lop}">Sửa</a> 
				<a href="/Xoa_Lop_Hoc?Ma_Lop=${Data.Ma_Lop}">Xóa</a> 
				
			</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
</div>