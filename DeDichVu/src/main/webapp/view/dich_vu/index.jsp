<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page pageEncoding="UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Document</title>
</head>
<body>
<div class="container">
    <h3>Quản lý dịch vụ</h3>
    <form action="/dich-vu/add" method="post">
        <div class="row">
            <div class="col-6">
                <label class="form-label">Tên dịch vụ: </label>
                <input type="text" name="tenDichVu" class="form-control" placeholder="Nhập tên dịch vụ"
                       value="${data.tenDichVu}">
            </div>
            <div class="col-6">
                <label class="form-label">Đơn giá: </label>
                <input type="text" name="donGia" class="form-control" placeholder="Nhập đơn giá" value="${data.donGia}">
            </div>
            <div class="col-6 mt-2">
                <label class="form-label">Đơn vị tiền: </label>
                <input type="text" name="donViTien" class="form-control" placeholder="Nhập đơn vị tiền"
                       value="${data.donViTien}">
            </div>
            <div class="col-6 mt-2">
                <label class="form-label">Tên loại dịch vụ: </label>
                <select name="loaiDichVu.id" id="" class="form-control">
                    <c:forEach var="loaidichvu" items="${loaiDichVuList}">
                        <option value="${loaidichvu.id}" ${loaidichvu.id == data.loaiDichVu.id ? 'selected' : ''}>${loaidichvu.tenLoaiDichVu}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="mt-2">
            <button class="btn btn-primary">Add</button>
        </div>
    </form>
    <div class="mt-4"></div>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Tên dịch vụ</th>
            <th>Đơn giá</th>
            <th>Đơn vị tiền</th>
            <th>Tên loại dịch vụ</th>
            <th>Mô tả loại dịch vụ</th>
            <th>Hành động</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${dichVuList}" var="dichvu">
            <tr>
                <td>${dichvu.tenDichVu}</td>
                <td>${dichvu.donGia}</td>
                <td>${dichvu.donViTien}</td>
                <td>${dichvu.loaiDichVu.tenLoaiDichVu}</td>
                <td>${dichvu.loaiDichVu.moTa}</td>
                <td>
                    <a href="/dich-vu/detail/${dichvu.id}" class="btn btn-warning">Detail</a>
                </td>
                <td>
                    <a onclick="return confirm('ban co chac chan muon xoa khong ?')" href="/dich-vu/remove/${dichvu.id}"
                       class="btn btn-danger">Remove</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>