<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>나무커뮤니티</title>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
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
                    <p><a href="./view/community/create.jsp" class="btn btn-warning btn-lg">커뮤니티 개설하기</a></p>
                </div>
            </div>
        </div>
    </div>
</header>

<!-- Container ======================================================================================= -->
<div class="container">
    <div class="row">
d        <div class="col-lg-12">
            <!-- ★★★ Tab Menu -->
            <ul class="nav nav-tabs" style="margin-bottom: 15px;">
                <li class="active"><a href="#joined" data-toggle="tab">가입 커뮤니티</a></li>
                <li class=""><a href="#unjoinded" data-toggle="tab">미가입 커뮤니티</a></li>
            </ul>


            <!-- ★★★ Tab Panel -->
            <div id="communityList" class="tab-content">
                <!-- ★★★ 가입 커뮤니티 -->
                <div class="tab-pane fade active in" id="joined">
                    <div class="page-header">
                        <h2 id="container">가입 커뮤니티</h2>
                    </div>

                    <ul class="list-group">
                    <c:forEach var="mycommunity" items="${myList}">
                        <li class="list-group-item">
                            <span class="badge">2011.03.21</span>
                            <h4><a href="../club/index.html">${mycommunity.name}</a></h4>
                            <p>${mycommunity.description}</p>
                            <button type="button" onclick="location.href='${ctx}/communitywithdrawctrol.do?communityId=${mycommunity.id}'" class="btn btn-default btn-sm">멤버탈퇴 신청하기</button>
                        </li>
                     </c:forEach>
                    </ul>

                    <button type="button" class="btn btn-default btn-lg btn-block">커뮤니티 목록 더보기</button>
                </div>

                <!-- ★★★ 미가입 커뮤니티 -->
                <div class="tab-pane fade" id="unjoinded">
                    <div class="page-header">
                        <h2 id="container">미가입 커뮤니티</h2>
                    </div>

                    <ul class="list-group">
                    
                    <c:forEach var="community" items="${list}">
                        <li class="list-group-item">
                            <span class="badge">2011.03.21</span>
                            <h4><span class="label label-info">추천</span>&nbsp;${community.name}</h4>
                            <p>${community.description}</p>
                            <button type="button" onclick="location.href='${ctx}/communityjoinpagectrol.do?communityId=${community.id}'" class="btn btn-default btn-sm">멤버가입</button>
                        </li>
                     </c:forEach>

                    </ul>

                    <button type="button" class="btn btn-default btn-lg btn-block">커뮤니티 목록 더보기</button>
                </div>
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