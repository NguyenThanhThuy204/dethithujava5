<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: -PC-
  Date: 6/11/2024
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Document</title>
</head>
<body>
<form action="/phong/add" method="post">
    <label>ID co so</label>
    <input name="idcs" value="${data.idcs}">
    <br>
    <br>
    <label>ID lau</label>
    <input name="idlau" value="${data.idlau}">
    <br>
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
    <input name="ten" value="${data.trangthai}">
    <br>
    <label>Tên loại phong: </label>
    <select name="lp.id" id="" class="form-control">
        <c:forEach var="p" items="${listLP}">
            <option value="${p.id}" ${p.id == data.lp.id ? 'selected' : ''}>${p.tenlp}</option>
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
        <th>Id lau</th>
        <th>ten loai phong</th>
        <th>ghi chu</th>
        <th>so luong phong</th>
        <th>ten phong</th>
        <th>trang thai</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listPhong.content}" var="p" varStatus="i">
        <tr>
            <td>${i.index+1}</td>
            <td>${p.idcs}</td>
            <td>${p.idlau}</td>
            <td>${p.lp.tenlp}</td>
            <td>${p.ghichu}</td>
            <td>${p.soluong}</td>
            <td>${p.ten}</td>
            <td>${p.trangthai}</td>
            <td>
                <a href="/phong/detail/${p.id}">
                    <button>Detail</button>
                </a>
            </td>
            <td>
                <a href="/phong/view-update/${p.id}">
                    <button>Update</button>
                </a>
            </td>
            <td>
                <a onclick="return confirm('ban co chac chan muon xoa khong ?')" href="/phong/remove/${p.id}">
                    <button>Remove</button>
                </a>
            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>

</body>
</html>
