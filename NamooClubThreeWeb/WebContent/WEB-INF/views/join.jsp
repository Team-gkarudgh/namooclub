<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>나무커뮤니티</title>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
    <script src='${ctx}/resources/js/script.js' type='text/javascript'></script>
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
                <h2 id="container">회원 가입하기</h2>
            </div>

            <div class="well">
                <p>회원가입을 위해 아래 내용들을 작성해 주세요.</p>
                <form class="form-horizontal" action="${ctx}/join.do" method="post">
                    <fieldset>
                        <div class="form-group">
                            <label class="col-lg-2 control-label">이름</label>

                            <div class="col-lg-10">
                                <input type="text" class="form-control" placeholder="이름" name="name">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-2 control-label">이메일</label>

                            <div class="col-lg-10">
                                <input type="text" class="form-control" placeholder="이메일" name="email">
                                <span class="help-block">입력하신 이메일은 회원ID로 사용됩니다.</span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-2 control-label">비밀번호</label>

                            <div class="col-lg-10">
                                <input type="password" class="form-control" placeholder="비밀번호" name="password">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-lg-10 col-lg-offset-2">
                                <button type="submit" class="btn btn-primary">확인</button>
                               <button class="btn btn-large btn-default" onclick='modify(); return false;' >취소</button>
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


</body>
</html>