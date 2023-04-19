<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>
	<h3>메뉴 수정</h3>
	
	<form method="POST">
		<p><input type="text" name="name" value="${dto.name }" placeholder="상품이름" required autofocus></p>
		
		<p>
			<select name="category" required>
				<option value="">=== 카테고리 ===</option>
				<option ${dto.category == '치킨세트' ? 'selected' : '' } value="치킨세트">치킨&세트</option>
				<option ${dto.category == '버거세트' ? 'selected' : '' } value="버거세트">버거&세트</option>
				<option ${dto.category == '스낵사이드' ? 'selected' : '' } value="스낵사이드">스낵&사이드</option>
				<option ${dto.category == '음료' ? 'selected' : '' } value="음료">음료</option>
			</select>
		</p>
		<p><input type="number" name="price" value="${dto.price }" placeholder="가격"></p>
		<p>
			<select name="img" required>
				<option value="">=== 이미지 선택 ===</option>
				<c:forEach var="name" items="${arr }">
					<option ${dto.img == name ? 'selected' : '' } value="${name }">${name }</option>
				</c:forEach>
			</select>
		</p>
		<p>
			<textarea name="memo" placeholder="상품 설명을 작성하세요">${dto.memo }</textarea>
		</p>
		<p>
			<input type="submit" value="수정">
		</p>
	</form>
</main>

</body>
</html>