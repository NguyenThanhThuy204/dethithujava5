<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: -PC-
  Date: 6/11/2024
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/phong/update/${data.id}" method="post">
    <label>ID co so</label>
    <input name="idcs" value="${data.idcs}">

    <br>
    <label>ID lau</label>
    <input name="idlau" value="${data.idlau}">
    <br>

    <label>ghi chu</label>
    <input name="ghichu" value="${data.ghichu}">
    <br>
    <label>so luong</label>
    <input name="soluong" value="${data.soluong}">
    <br>
    <label>ten phong</label>
    <input name="ten" value="${data.ten}">
    <br>
    <label>trang thai</label>
    <input name="trangthai" value="${data.trangthai}">
    <br>
    <label>Tên loại phong: </label>
    <select name="lp.id" id="" class="form-control">
        <c:forEach var="p" items="${listLP}">
            <option value="${p.id}" ${p.id == data.lp.id ? 'selected' : ''}>${p.tenlp}</option>
        </c:forEach>
    </select>
    <br>
    <button>Update</button>
</form>
</body>
</html>
