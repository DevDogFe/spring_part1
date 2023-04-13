<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<style type="text/css">

  @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap');

	*{
		margin: 0;
		padding: 0;
		box-sizing: border-box;
		font-family: 'Noto Sans KR', sans-serif;
	}
	body{
		width:1080px;
		margin: auto;
	}
	a{
		text-decoration: none;
		color: black;
	}
	header{
		display: flex;
		border: 3px solid black;
		justify-content: space-between;
		margin: 5px;
	}
	
	header h1{
		margin: 30px;
	}
	
	.header-menu-container{
		display: flex;
		justify-content: space-around;
		margin-top: 60px;
	}
	.header-menu{
		margin: 10px;
		padding: 5px 10px;
		border-radius: 5px;
		font-weight: bold;
		font-size: 17px;
	}
	.header-menu:hover{
		cursor: pointer;
		color: white;
		background-color: black;
	}
	
	section{
		display: flex;
		align-items: flex-start;
	}
	article{
		flex: 2;
		margin: 5px;
		padding: 5px;
		border: 3px solid black;
		height: 700px;
		
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: space-around;
		
	}
	
	aside{
		height: 700px;
		display: flex;
		flex-direction: column;
	}
	
	aside label{
		font-weight: bold;
	}
	.login-box{
		margin: 5px;
		padding: 10px;
		border: 3px solid black;
		height: 165px;
	}
	.login-items{
		display:flex;
		flex-direction: column;
	}
	
	.input-box{
		border: 2px solid black;
		border-radius: none;
		padding: 3px;
	}
	
	.input-box:focus{
		border-radius: none;
		border-color: #222;
		background-color: #f3f3f3;
	}
	
	
	aside button{
		border: 2px solid black;
		border-radius: none;
		padding: 3px 5px;
		background: white;
		margin-top: 5px;
		font-weight: bold;
		font-size: 15px;
	}
	
	aside button:hover{
		background-color: black;
		color:white;
	}
	.button-box{
		display: flex;
		justify-content: space-between;
	}
	.week-rank{
		flex: 1;
		margin: 5px;
		padding: 10px;
		border: 3px solid black;
		margin-bottom: -5px;
	}
	
	
</style>
</head>
<body>
	<header>
		<div class="header-title-container">
			<h1>
				<a href="#">Time Killer</a>
			</h1>
		</div>
		<div class="header-menu-container">
			<div onclick="location.href='#'" class="header-menu">숫자야구</div>
			<div onclick="location.href='#'" class="header-menu">행맨</div>
			<div onclick="location.href='#'" class="header-menu">블랙잭</div>
			<div onclick="location.href='#'" class="header-menu">게시판</div>
			<div onclick="location.href='#'" class="header-menu">순위</div>
		</div>
	</header>
	<section>
		<article class="notice">
			<div>
				<h2>📢공지</h2>
				<div>
					<p>css가 너무 힘들다</p>
					<p>css가 너무 힘들다</p>
					<p>css가 너무 힘들다</p>
					<p>css가 너무 힘들다</p>
				</div>
			</div>
			<div>
				<h2>📢공지</h2>
				<div>
					<p>css가 너무 힘들다</p>
					<p>css가 너무 힘들다</p>
					<p>css가 너무 힘들다</p>
					<p>css가 너무 힘들다</p>
				</div>
			</div>
		</article>
		<article class="freeboard">
			<div class= "freeboard-container">
				<h2>많이 조회된 글</h2>
				<div>
				<p>css가 너무 힘들다</p>
				<p>css가 너무 힘들다</p>
				<p>css가 너무 힘들다</p>
				<p>css가 너무 힘들다</p>
				<p>css가 너무 힘들다</p>
				</div>
			</div>
			<div class= "freeboard-container">
				<h2>댓글이 많은 글</h2>
				<div>
				<p>css가 너무 힘들다</p>
				<p>css가 너무 힘들다</p>
				<p>css가 너무 힘들다</p>
				<p>css가 너무 힘들다</p>
				<p>css가 너무 힘들다</p>
				</div>
			</div>
		
		</article>
		<aside>
			<div class="login-box">
			<form action="" method="post">
				<div class="login-items">
					<label for="id">ID</label> <input type="text" id="id" name="username" class="input-box">
				</div>
				<div class="login-items">
					<label for="pw">PW</label> <input type="password" id="pw" name="password" class="input-box">
				</div>
				<div class="button-box">
					<button type="submit">Login</button>
					<button type="button">회원가입</button>
				</div>
			</form>
			</div>
			<div class="week-rank">
				<h2>주간 랭킹</h2>
			</div>
		</aside>
	</section>
</body>
</html>