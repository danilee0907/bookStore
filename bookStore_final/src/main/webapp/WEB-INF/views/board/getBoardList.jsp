<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Heaven Bookstore</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&family=Noto+Sans:ital,wght@0,400;0,700;1,400;1,700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css"/>
    <link rel="stylesheet" href="./resources/css/clear.css">
    <link rel="stylesheet" href="./resources/css/header.css">
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script src='main.js'></script>
   
</head>
 
<body>
	 <div class="wrapper">
      <%@ include file="/WEB-INF/views/include/header.jsp" %>
	 	  <hr/>
	<center>
		<h3>${sessionScope.userName}님! 여기는 고객센터 게시판입니다.</h3>
		<hr/>
			<div class="cscenter_shortcut">
				<h3>주요 FAQ</h3>
				<ul>
					<li ><a href="javascript:goFaq2('2','04',115,1);">주문/결제</a> &nbsp;
					<a href="javascript:goFaq2('2','07',114, 1);">배송/수령일 안내</a> &nbsp;
					<a href="javascript:goFaq2('2','08-02',116, 3);">반품/교환/환불</a> &nbsp;
					<a href="javascript:goFaq2('2','21',112,1);">중고장터</a> &nbsp;
					<a href="javascript:goFaq2('2','14',108, 1);">eBook</a></li>
				</ul>				
			</div>
			<hr>
			
		<!-- 검색 시작 -->
		<h3>문의하기</h3>
		<form action="getBoardList.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right">
					<select name="searchCondition">
						<c:forEach items="${conditionMap}" var="option">
							<option value="${option.value}">${option.key}
						</c:forEach>							
					</select> 
					<input type="text" name="searchKeyword"/> 
					<input type="submit" value="검색"/></td>
				</tr>
			</table>
		</form>
		<!-- 검색 종료 -->
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="#3E7C17" style=font:inherit;color:white width="100">번호</th>
				<th bgcolor="#3E7C17" style=font:inherit;color:white width="200">제목</th>
				<th bgcolor="#3E7C17" style=font:inherit;color:white width="150">작성자</th>
				<th bgcolor="#3E7C17" style=font:inherit;color:white width="150">등록일</th>
				<th bgcolor="#3E7C17" style=font:inherit;color:white width="100">조회수</th>
			</tr>
			<c:forEach items="${boardList}" var="board">
				<tr>
					<td align="center">${board.seq}</td>
					<td align="left">
						<a href="getBoard.do?seq=${board.seq}">${board.title}</a>
					</td>
					<td align="center">${board.writer}</td>
					<td align="center">${board.regdate}</td>
					<td align="center">${board.cnt}</td>
				</tr>
			</c:forEach>
		</table>
		<div style="display: block; text-align: center;">		
		<c:if test="${paging.startPage != 1 }">
			<a href="getBoardList.do?nowPage=${paging.startPage - 1 }&cntPerPage=${paging.cntPerPage}">&lt;</a>
		</c:if>
		<c:forEach begin="${paging.startPage }" end="${paging.endPage }" var="p">
			<c:choose>
				<c:when test="${p == paging.nowPage }">
					<b>${p }</b>
				</c:when>
			<c:when test="${p != paging.nowPage }">
				<a href="getBoardList.do?nowPage=${p }&cntPerPage=${paging.cntPerPage}">${p }</a> 
				</c:when>
			</c:choose>
		</c:forEach>
		<c:if test="${paging.endPage != paging.lastPage}">
			<a href="getBoardList.do?nowPage=${paging.endPage+1 }&cntPerPage=${paging.cntPerPage}">&gt;</a>
		</c:if>
	</div>
		
		<br> <a href="insertBoard.do"><input type="submit" value="문의글 등록"> </a>
	</center>
	<br/>
	
          <%@ include file="/WEB-INF/views/include/footer.jsp" %>
	 </div>
</body>
</html>