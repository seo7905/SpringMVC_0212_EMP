<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25. 2. 12.
  Time: 오후 4:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    /* 기본 스타일 */
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 20px;
    }

    h1 {
        color: #333;
        font-size: 24px;
        margin-bottom: 20px;
    }

    hr {
        border: 0;
        border-top: 1px solid #ccc;
        margin: 20px 0;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }

    /* 테이블 헤더 스타일 */
    th {
        background-color: #4CAF50;
        color: white;
        padding: 12px 15px;
        text-align: center;
        font-size: 16px;
    }

    /* 테이블 데이터 셀 스타일 */
    td {
        background-color: #fff;
        padding: 12px 15px;
        text-align: center;
        font-size: 14px;
        border: 1px solid #ddd;
    }

    /* 테이블 행 hover 효과 */
    tr:hover {
        background-color: #f1f1f1;
    }

    /* 테이블에서 홀수, 짝수 행 배경 색을 다르게 설정 */
    tr:nth-child(odd) {
        background-color: #f9f9f9;
    }

    tr:nth-child(even) {
        background-color: #ffffff;
    }

    /* 모바일 대응을 위한 반응형 설정 */
    @media (max-width: 600px) {
        table {
            font-size: 12px;
        }

        th, td {
            padding: 8px;
        }
    }
</style>
<body>
    <h1>회원목록</h1>
    <hr/>
    <table>

        <thead>
        <th>사번</th>
        <th>이름</th>
        <th>직책</th>
        <th>관리자</th>
        <th>입사일</th>
        <th>급여</th>
        <th>보너스</th>
        <th>부서코드</th>
        </thead>
        <c:forEach var="vo" items="${emp}">
        <tbody>
            <tr>
                <td>${vo.empno}</td>
                <td>${vo.ename}</td>
                <td>${vo.job}</td>
                <td>${vo.mgr}</td>
                <td>${vo.hiredate}</td>
                <td>${vo.sal}</td>
                <td>${vo.comm}</td>
                <td>${vo.deptno}</td>
            </tr>
        </tbody>
        </c:forEach>
    </table>
</body>
</html>
