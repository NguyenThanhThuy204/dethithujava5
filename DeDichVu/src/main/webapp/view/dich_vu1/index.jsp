<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: -PC-
  Date: 6/13/2024
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dich-vu1/add" method="post">
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
    <button>Add</button>
</form>
<table border="1">
    <thead>
    <th>STT</th>
    <th>Don gia</th>
    <th>Ten loai dv</th>
    <th>Don vi tien</th>
    <th>Don vi tinh</th>
    <th>Mo ta</th>
    <th>Ten dich vu</th>
    <th>Trang thai</th>
    <th>Thao tac</th>
    </thead>
    <tbody>
    <c:forEach var="dv" items="${listDV}" varStatus="i">
        <tr>
            <td>${i.index+1}</td>
            <td>${dv.dg}</td>
            <td>${dv.ldv.tenldv}</td>
            <td>${dv.dvtien}</td>
            <td>${dv.dvtinh}</td>
            <td>${dv.mt}</td>
            <td>${dv.tendv}</td>
            <td>${dv.trangThai}</td>
            <td>
                <a href="/dich-vu1/edit/${dv.id}">
                    <button>Update</button>
                </a>
                <a onclick="return confirm('ban co chac chan muon xoa khong ?')" href="/dich-vu1/delete/${dv.id}">
                    <button>Delete</button>
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
