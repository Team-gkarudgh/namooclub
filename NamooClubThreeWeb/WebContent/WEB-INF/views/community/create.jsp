<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>나무커뮤니티</title>
    <link href="./././resources/css/bootstrap.css" rel="stylesheet">
    <link href="./././resources/css/bootswatch.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<!-- Main Navigation ========================================================================================== -->
<div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="./index.html">나무커뮤니티</a>
        </div>
        <div class="navbar-collapse collapse navbar-responsive-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="./index.html">커뮤니티 홈</a></li>
                <li><a href="#">인기 커뮤니티</a></li>
                <li><a href="#">랭킹</a></li>
                <li><a href="#">공지사항</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="../login.html">로그아웃</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">관리 <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="../management/commMemberList.html">커뮤니티 관리센터</a></li>
                        <li><a href="../management/clubMemberList.html">클럽 관리센터</a></li>
                        <li><a href="../management/teamMemberList.html">팀 관리센터</a></li>
                        <li class="divider"></li>
                        <li><a href="#">홍보</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">설정 <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">개인정보</a></li>
                        <li><a href="#">모바일 환경설정</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>

<!-- Header ========================================================================================== -->
<header>
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="jumbotron">
                    <h1>나무 커뮤니티와 함께!</h1>
                    <p>나무 커뮤니티와 함께 특정 취미와 관심사, 특정 그룹 또는 조직에 관한 대화를 시작하세요.</p>
                </div>
            </div>
        </div>
    </div>
</header>

<!-- Container ======================================================================================= -->
<div class="container">
    <div class="row">
        <div class="col-lg-12">

            <div class="page-header">
                <h2 id="container">커뮤니티 개설하기</h2>
            </div>

            <div class="well">
                <p>나와 같은 관심사를 가진 멤버를 모집하고 열심히 운영하여 커뮤니티를 성장시켜 보세요.</p>
                <form class="form-horizontal" action="./index.html">
                    <fieldset>
                        <div class="form-group">
                            <label class="col-lg-2 control-label">커뮤니티명</label>

                            <div class="col-lg-10">
                                <input type="text" class="form-control" placeholder="커뮤니티명">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-2 control-label">커뮤니티 성격</label>

                            <div class="col-lg-10">
                                <div class="radio">
                                    <label>
                                        <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked="">
                                        공개 커뮤니티
                                    </label>
                                </div>
                                <div class="radio">
                                    <label>
                                        <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
                                        비공개 커뮤니티
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="textArea" class="col-lg-2 control-label">커뮤니티 대표문구</label>

                            <div class="col-lg-10">
                                <textarea class="form-control" rows="3" id="textArea"></textarea>
                                <span class="help-block">커뮤니티를 소개하는 대표문구를 입력해 주세요. 커뮤니티 홈화면에 입력하신 문구가 출력됩니다.</span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-2 control-label">커뮤니티 검색어</label>

                            <div class="col-lg-10">
                                <input type="text" class="form-control" placeholder="검색어 1">
                                <input type="text" class="form-control" placeholder="검색어 2">
                                <input type="text" class="form-control" placeholder="검색어 3">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-2 control-label">클럽 카테고리</label>

                            <div class="col-lg-10">
                                <input type="text" class="form-control" placeholder="카테고리 1">
                                <input type="text" class="form-control" placeholder="카테고리 2">
                                <input type="text" class="form-control" placeholder="카테고리 3">
                                <input type="text" class="form-control" placeholder="카테고리 4">
                                <input type="text" class="form-control" placeholder="카테고리 5">
                                <input type="text" class="form-control" placeholder="카테고리 6">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-2 control-label">커뮤니티 멤버 가입을 위한 질문내용</label>

                            <div class="col-lg-10">
                                <input type="text" class="form-control" placeholder="질문내용 1">
                                <input type="text" class="form-control" placeholder="질문내용 2">
                                <input type="text" class="form-control" placeholder="질문내용 3">
                                <input type="text" class="form-control" placeholder="질문내용 4">
                                <input type="text" class="form-control" placeholder="질문내용 5">
                                <input type="text" class="form-control" placeholder="질문내용 6">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-lg-10 col-lg-offset-2">
                                <button type="submit" class="btn btn-primary">확인</button>
                                <button class="btn btn-default">취소</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>

    </div>

<!-- Footer ========================================================================================== -->
    <footer>
        <div class="row">
            <div class="col-lg-12">
                <ul class="list-unstyled">
                    <li class="pull-right"><a href="#top">위로 이동</a></li>
                    <li><a href="#">커뮤니티 홈</a>
                    </li>
                    <li><a href="#">RSS</a></li>
                    <li><a href="#">이용약관</a></li>
                    <li><a href="#">도움말</a></li>
                    <li><a href="#">회원탈퇴</a></li>
                </ul>
                <p>© NamooSori 2014.</p>
            </div>
        </div>
    </footer>
</div>

<script src="../js/jquery-2.1.0.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/bootswatch.js"></script>
</body>
</html>