<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>


<main>
	<h3>단일 상품 조회</h3>
	<div class="item">
		<div class="img">
			<img src="${cpath }/resources/image/${dto.img}">
		</div>
		<div class="name">${dto.name }</div>
		<div class="memo">${dto.memo }</div>
		<div class="price">
			\<fmt:formatNumber value="${dto.price }" />
		</div>
	</div>
	
	<div class="sb">
		<div class="left">
			<button onclick="history.go(-1)">뒤로가기</button>
		</div>
		<div class="right">
			<a href="${cpath }/modify/${dto.idx}"><button>수정</button></a>
			<button class="deleteBtn" idx="${dto.idx }">삭제</button>
		</div>
	</div>
</main>

<script>
	const deleteBtn = document.querySelector('.deleteBtn')
	
	deleteBtn.onclick = function(event) {
		const idx = event.target.getAttribute('idx')
		const url = '${cpath}/delete/' + idx
		const flag = confirm(idx + '번 상품을 삭제하시겠습니까?')
		if(flag) {
			location.href = url
		}
	}
</script>




</body>
</html>