<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: -PC-
  Date: 6/12/2024
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/gio-hang/add" method="post">
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
    <button>Add</button>
</form>
<table border="1">
    <thead>
    <tr>
        <th>#</th>
        <th>coc tien</th>
        <th>giam gia</th>
        <th>id dat phong</th>
        <th>id giao dich</th>
        <th>ten khach hang</th>
        <th>id tai khoan</th>
        <th>phu thu</th>
        <th>thue</th>
        <th>tien khach dua</th>
        <th>tien tra lai</th>
        <th>tong tien</th>
        <th>ghi chu</th>
        <th>ma hoa don</th>
        <th>trang thai</th>
        <th>thao tac</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="gh" items="${listHD}" varStatus="i">
        <tr>
            <td>${i.index+1}</td>
            <td>${gh.coctien}</td>
            <td>${gh.giamgia}</td>
            <td>${gh.iddp}</td>
            <td>${gh.idgd}</td>
            <td>${gh.kh.tenkh}</td>
            <td>${gh.idtk}</td>
            <td>${gh.phuthu}</td>
            <td>${gh.thue}</td>
            <td>${gh.tienkd}</td>
            <td>${gh.tientl}</td>
            <td>${gh.tt}</td>
            <td>${gh.ghichu}</td>
            <td>${gh.mahd}</td>
            <td>${gh.trangThai}</td>
            <td>
                <a href="/gio-hang/edit/${gh.id}">
                    <button>Update</button>
                </a>
            </td>
            <td>
                <a href="/gio-hang/detail/${gh.id}">
                    <button>Detail</button>
                </a>
            </td>
            <td>
                <a onclick="return confirm('ban co chac chan muon xoa khong ?')" href="/gio-hang/remove/${gh.id}">
                    <button>Remove</button>
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
