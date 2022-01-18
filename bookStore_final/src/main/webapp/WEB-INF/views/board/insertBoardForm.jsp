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
 
</head>
<body>

	 <div class="wrapper">
      <%@ include file="/WEB-INF/views/include/header.jsp" %>
	  	  <article class="content_wrap">
	 	  <div class="content_inner"></div>
	 	  <hr/>
	<center>
		<h1>문의글 등록</h1>
		<hr>
		<form action="insertBoard.do" method="post" enctype="multipart/form-data">
			<table border="1" he cellpadding="0"  cellspacing="0">
				<tr>
					<td style=font:inherit;color:white align="center" bgcolor="#3E7C17" width="80" height="30">제목</td>
					<td align="left" width="150"><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td style=font:inherit;color:white align="center" bgcolor="#3E7C17" height="30">작성자</td>
					<td align="left"><input type="text" name="writer" size="10" /></td>
				</tr>
				<tr>
					<td style=font:inherit;color:white align="center" bgcolor="#3E7C17">내용</td>
					<td align="left"><textarea name="content" cols="40" rows="10"></textarea></td>
				</tr>
			 	<tr>
					<td style=font:inherit;color:white align="center" bgcolor="#3E7C17" height="30">파일첨부</td>
					<td><input type="file" name="uploadFile"></td>
				</tr> 
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value=" 글 등록 " />
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getBoardList.do"> <input type="submit" value="글 목록 가기" /></a>
	</center>
	<br/>
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
	 </div>
</body>
</html>