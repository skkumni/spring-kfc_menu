<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>
	<h3>전체 목록</h3>
	
	<div class="wrap">
	
		<c:forEach var="dto" items="${list }">
		<div class="item">
			<div class="img">
				<a href="${cpath }/view/${dto.idx}">
					<img src="${cpath }/resources/image/${dto.img}">
				</a>
			</div>
			<div class="name">${dto.name }</div>
			<div class="memo">${dto.memo }</div>
			<div class="price">
				\ <fmt:formatNumber value="${dto.price }"/>
			</div>
		</div>
		</c:forEach>
		
	</div>
</main>

</body>
</html>