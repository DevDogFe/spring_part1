<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body{
            width: 1000px;
            padding: 10px;
            margin: 0 auto;
        }

        header{
            font-weight: bold;
            background-color: aquamarine;
            padding: 20px;
        }
        section{
            display: flex;
            align-items: flex-start;
        }
        nav{
            width: 170px;
            margin: 25px;
            border: 2px solid #aaa;
            border-radius: 10px;
            padding:15px;
        }
        article{
            width: 730px;
            margin: 25px;
        }

        ul{
            list-style: none;
        }
        li{
        	white-space: nowrap;
        }
        a{
            text-decoration: none;
        }
        nav a{
            color: #aaa;
        }
        nav a:focus{
        	color: black;
        	font-weight: bolder;
        }

        .nav-header{
            margin-bottom: 15px;
            display: flex;
            justify-content: space-between;
        }
        .article-header{
        	display: flex;
        	justify-content: space-between;
        }
        .article-header a{
        	color: #555;
        }
        
        .article-row{
        	display: flex;
        	justify-content: space-between;
        }
        .article-container{
        	padding: 5px;
        }
        img{
        	width: 170px;
        }
        .article-title{
        	font-weight: bolder;
        	padding: 5px;
        }
        .article-date{
        	font-size: 15px;
        	color: #888;
        	padding: 5px;
        	margin-top: 10px;
        }
        .pages-box{
        	display: flex;
        	justify-content: space-around;
        }
        .pages-container{
        	display: flex;
        	justify-content: space-between;
        }
        .page{
        	margin-left: 15px;
        }
        .pages-box a {
        	font-weight: border !important;
        	color: black;
        }
        
    </style>
</head>

<body>
    <header>
        <h1>Green's Blog</h1>
    </header>
    <section>
        <nav>
            <div class="nav-header">
                <a href="#">전체보기</a> <a href="#"><span class="material-symbols-outlined">settings</span></a>
            </div>
            <div class="nav-content">
                <ul>
                    <li><a href="#">Python(12)</a></li>
                    <li><a href="#">Java(2)</a></li>
                    <li><a href="#">IOS(8)</a></li>
                    <li><a href="#">소프트웨어 자료(26)</a></li>
                    <li><a href="#">자료구조(8)</a></li>
                    <li><a href="#">리눅스(8)</a></li>
                    <li><a href="#">Git(4)</a></li>
                    <li><a href="#">자기계발(3)</a></li>
                    <li><a href="#">경영전략(20)</a></li>
                    <li><a href="#">리더십(7)</a></li>
                </ul>
            </div>
        </nav>
        <article>
            <div class="article-header">
                <span style="font-weight: bolder;">경영전략 <span style="color: aqua;">20</span></span>
                <a href="#"><span class="material-symbols-outlined">edit_square</span></a>
            </div>
            <!-- 경영전략 밑에 큰 div -->
            <div class="article-box">
                <div class="article-row">
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                </div>
                <div class="article-row">
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                </div>
                <div class="article-row">
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                </div>
                <div class="article-row">
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                    <div class="article-container">
                        <div class="article-image"><img src="images/image.png" alt=""></div>
                        <div class="article-title">팬덤 확보에 성공한 4세대 걸그룹의 차별화 전략</div>
                        <div class="article-date">2023. 04. 12</div>
                    </div>
                </div>
            </div>
            <div class ="pages-box">
                <div class="pages-container">
                    <div class="page"><a href="#">1</a></div>
                    <div class="page"><a href="#">2</a></div>
                    <div class="page"><a href="#">3</a></div>
                    <div class="page"><a href="#">4</a></div>
                    <div class="page"><a href="#">5</a></div>
                    <div class="page"><a href="#">6</a></div>
                    <div class="page"><a href="#">7</a></div>
                    <div class="page"><a href="#">8</a></div>
                    <div class="page"><a href="#">9</a></div>
                    <div class="page"><a href="#">10</a></div>
                </div>
                <div class="next">
                    <a href="#">다음 ></a>
                </div>
            </div>
        </article>
    </section>
</body>

</html>