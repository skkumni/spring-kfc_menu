<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath">${pageContext.request.contextPath }</c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day09 - KFC</title>
<style>
	a {
		text-decoration: none;
		color: inherit;
	}
	header {
		display: flex;
		justify-content: center;
	}
	nav > ul {
		padding-left: 0;
		width: 800px;
		margin: 0 auto;
		display: flex;
		justify-content: space-around;
		list-style: none;
	}
	nav > ul > li {
		display: flex;
		justify-content: center;
		border-bottom: 2px solid white;
		font-size: 20px;
		padding: 5px 10px;
	}
	nav > ul > li:hover {
		border-bottom: 2px solid black;
		background-color: lightpink;
	}
	main {
		width: 850px;
		border-top: 3px solid black;
		margin: 10px auto;
	}
	
	/* list.jsp 에서 목록을 처리하는 스타일 */
	.wrap {
		width: 850px;
		display: flex;
		flex-flow: wrap;
	}
	.wrap > .item {
		width: 200px;
		height: 270px;
		margin: 5px;
		text-align: center;
	}
	.wrap > .item img {
		width: 190px;
		transition-duration: 0.3s;
	}
	.wrap > .item img:hover {
		transform: scale(120%);
		cursor: pointer;
		transition-duration: 0.3s;
	}
	.wrap > .item > .name { 
		font-weight: bold;
		min-height: 42px;
	}
	.wrap > .item > .memo {
		color: grey;
		min-height: 50px;
	}
	.wrap > .item > .price {
		color: red;
		font-size: 17px;
		font-weight: bold;
	}
	/* 단일 정보 조회*/
	.sb {
		margin: 20px auto;
		width: 850px;
		display: flex;
		justify-content: space-between;
	}
</style>
</head>
<body>

<header>
	<h1><a href="${cpath }">day09 - KFC</a></h1>
</header>

<nav>
	<ul>
		<li><a href="${cpath }/list">전체목록</a></li>
		<li><a href="${cpath }/list/치킨세트/">치킨</a></li>
		<li><a href="${cpath }/list/버거세트/">버거</a></li>
		<li><a href="${cpath }/list/스낵사이드/">스낵</a></li>
		<li><a href="${cpath }/list/음료/">음료</a></li>
		<li><a href="${cpath }/add">추가</a></li>
	</ul>
</nav>

