<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: -PC-
  Date: 6/14/2024
  Time: 6:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Quan ly phong</h2>
<form action="/phong/search">
    <label>Tim kiem</label>
    <input name="keyword" value="${keyword}" placeholder="nhap ten phong">
    <br>
    <button>Search</button>
</form>
<br>
<form action="/phong/add" method="post">
    <label>IDCS</label>
    <input name="idcs" value="${data.idcs}">
    <c:if test="${not empty error['idcs']}">
        <small style="color: red">${error['idcs']}</small>
    </c:if>
    <br>
    <label>ID lau</label>
    <input name="idlau" value="${data.idlau}">
    <c:if test="${not empty error['idlau']}">
        <small style="color: red">${error['idlau']}</small>
    </c:if>
    <br>
    <label>Ghi chu</label>
    <input name="ghichu" value="${data.ghichu}">
    <c:if test="${not empty error['ghichu']}">
        <small style="color: red">${error['ghichu']}</small>
    </c:if>
    <br>
    <label>so luong phong</label>
    <input name="slp" value="${data.slp}">
    <c:if test="${not empty error['slp']}">
        <small style="color: red">${error['slp']}</small>
    </c:if>
    <br>
    <label>Ten phong</label>
    <input name="tenp" value="${data.tenp}">
    <c:if test="${not empty error['tenp']}">
        <small style="color: red">${error['tenp']}</small>
    </c:if>
    <br>
    <label>Trang thai</label>
    <input name="trangThai" value="${data.trangThai}">
    <c:if test="${not empty error['trangThai']}">
        <small style="color: red">${error['trangThai']}</small>
    </c:if>
    <br>
    <label>Ten loai phong</label>
    <select name="lp">
        <c:forEach var="p" items="${listLP}">
            <option value="${p.id}" ${p.id==data.lp.id ? 'checked' : ''}>${p.tenlp}</option>
        </c:forEach>
    </select>
    <br>

    <button>Add</button>

</form>
<table border="1">
    <thead>
    <tr>
        <th>#</th>
        <th>ID co so</th>
        <th>ID lau</th>
        <th>ten loai phong</th>
        <th>Ghi chu</th>
        <th>So luong phong</th>
        <th>Ten phong</th>
        <th>Trang thai</th>
        <th>Thao tac</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="p" items="${listP}">
        <tr>
            <td>${p.id}</td>
            <td>${p.idcs}</td>
            <td>${p.idlau}</td>
            <td>${p.lp.tenlp}</td>
            <td>${p.ghichu}</td>
            <td>${p.slp}</td>
            <td>${p.tenp}</td>
            <td>${p.trangThai}</td>
            <td>
                <a onclick="return confirm('ban co chac chan muon xoa khong ?')" href="/phong/remove/${p.id}">
                    <button>Delete</button>
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
