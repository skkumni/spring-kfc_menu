<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>
	<h3>메뉴 추가</h3>
	
	<form method="POST">
		<p><input type="text" name="name" placeholder="상품이름" required autofocus></p>
		<p>
			<select name="category" required>
				<option value="">=== 카테고리 ===</option>
				<option value="치킨세트">치킨&세트</option>
				<option value="버거세트">버거&세트</option>
				<option value="스낵사이드">스낵&사이드</option>
				<option value="음료">음료</option>
			</select>
		</p>
		<p><input type="number" name="price" placeholder="가격"></p>
		<p>
			<select name="img" required>
				<option value="">=== 이미지 선택 ===</option>
				<c:forEach var="name" items="${arr }">
					<option value="${name }">${name }</option>
				</c:forEach>
			</select>
		</p>
		<p>
			<textarea name="memo" placeholder="상품 설명을 작성하세요"></textarea>
		</p>
		<p>
			<input type="submit" value="추가">
		</p>
	</form>
</main>

</body>
</html>