<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: -PC-
  Date: 6/12/2024
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/gio-hang/update/${data.id}" method="post">
    <label>Coc tien</label>
    <input name="coctien" value="${data.coctien}">
    <br>
    <label>giam gia</label>
    <input name="giamgia" value="${data.giamgia}">
    <br>
    <label>id dat phong</label>
    <input name="iddp" value="${data.iddp}">
    <br>
    <label>id giao dich</label>
    <input name="idgd" value="${data.idgd}">
    <br>
    <label>id tai khoan</label>
    <input name="idtk" value="${data.idtk}">
    <br>
    <label>Phu thu</label>
    <input name="phuthu" value="${data.phuthu}">
    <br>
    <label>thue</label>
    <input name="thue" value="${data.thue}">
    <br>
    <label>tien khach dua</label>
    <input name="tienkd" value="${data.tienkd}">
    <br>
    <label>tien tra lai</label>
    <input name="tientl" value="${data.tientl}">
    <br>
    <label>tong tien</label>
    <input name="tt" value="${data.tt}">
    <br>
    <label>ghichu</label>
    <input name="ghichu" value="${data.ghichu}">
    <br>
    <label>ma hoa don</label>
    <input name="mahd" value="${data.mahd}">
    <br>
    <label>trang thai</label>
    <input name="trangThai" value="${data.trangThai}">
    <br>
    <label>Ten kh</label>
    <select name="kh.id">
        <c:forEach var="gh" items="${listKH}">
            <option value="${gh.id}" ${gh.id == data.kh.id ? 'selected' : ''}>${gh.tenkh}</option>
        </c:forEach>
    </select>
    <br>
    <button>Update</button>
</form>
</body>
</html>
