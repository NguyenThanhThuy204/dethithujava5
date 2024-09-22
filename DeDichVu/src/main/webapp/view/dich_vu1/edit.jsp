<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dich-vu1/update/${data.id}" method="post">
    <label>don gia</label>
    <input name="dg" value="${data.dg}">
    <br>
    <label>don vi tien</label>
    <input name="dvtien" value="${data.dvtien}">
    <br>
    <label>don vi tinh</label>
    <input name="dvtinh" value="${data.dvtinh}">
    <br>
    <label>Mo ta</label>
    <input name="mt" value="${data.mt}">
    <br>
    <label>ten dich vu</label>
    <input name="tendv" value="${data.tendv}">
    <br>
    <label>Trang thai</label>
    <input name="trangThai" value="${data.trangThai}">
    <br>
    <label>ten loai dich vu</label>
    <select name="ldv.id">
        <c:forEach var="dv" items="${listLoaiDV}">
            <option value="${dv.id}" ${dv.id==data.ldv.id ? 'selected' : ''}>${dv.tenldv}</option>
        </c:forEach>
    </select>
    <br>
    <button>Update</button>
</form>
</body>
</html>
