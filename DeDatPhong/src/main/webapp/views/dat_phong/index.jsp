<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Quan ly dat phong</h2>

<%--<form action="/dat-phong/search">--%>
<%--    <label>Tim kiem</label>--%>
<%--    <input name="keyword" value="${keyword}" placeholder="nhap ma dat phong">--%>
<%--    <button>Tim kiem</button>--%>
<%--</form>--%>
<%--<br>--%>
<%--&lt;%&ndash;<form action="/dat-phong/update/${data.id}" method="post">&ndash;%&gt;--%>
<%--<form action="/dat-phong/add" method="post">--%>
<%--    <label>Ghi chu</label>--%>
<%--    <input name="gc" value="${data.gc}">--%>
<%--    <c:if test="${not empty error['gc']}">--%>
<%--        <small style="color: red">${error['gc']}</small>--%>
<%--    </c:if>--%>
<%--    <br>--%>
<%--    <label>Ma dat phong</label>--%>
<%--    <input name="mdp" value="${data.mdp}">--%>
<%--    <c:if test="${not empty error['mdp']}">--%>
<%--        <small style="color: red">${error['mdp']}</small>--%>
<%--    </c:if>--%>
<%--    <br>--%>
<%--    <label>Ngay gio dat</label>--%>
<%--    <input type="date" name="ngd" value="${data.ngd}">--%>
<%--    <c:if test="${not empty error['ngd']}">--%>
<%--        <small style="color: red">${error['ngd']}</small>--%>
<%--    </c:if>--%>
<%--    <br>--%>
<%--    <label>so luong khach</label>--%>
<%--    <input name="slk" value="${data.slk}">--%>
<%--    <c:if test="${not empty error['slk']}">--%>
<%--        <small style="color: red">${error['slk']}</small>--%>
<%--    </c:if>--%>
<%--    <br>--%>
<%--    <label>so luong phong dat</label>--%>
<%--    <input name="slp" value="${data.slp}">--%>
<%--    <c:if test="${not empty error['slp']}">--%>
<%--        <small style="color: red">${error['slp']}</small>--%>
<%--    </c:if>--%>
<%--    <br>--%>
<%--    <label>Thoi gian luu tru</label>--%>
<%--    <input name="tglt" value="${data.tglt}">--%>
<%--    <c:if test="${not empty error['tglt']}">--%>
<%--        <small style="color: red">${error['tglt']}</small>--%>
<%--    </c:if>--%>
<%--    <br>--%>
<%--    <label>ID loai phong</label>--%>
<%--    <input name="idlp" value="${data.idlp}">--%>
<%--    <c:if test="${not empty error['idlp']}">--%>
<%--        <small style="color: red">${error['idlp']}</small>--%>
<%--    </c:if>--%>
<%--    <br>--%>
<%--    <label>Trang thai</label>--%>
<%--    <input name="trangThai" value="${data.trangThai}">--%>
<%--    <c:if test="${not empty error['trangThai']}">--%>
<%--        <small style="color: red">${error['trangThai']}</small>--%>
<%--    </c:if>--%>
<%--    <br>--%>
<%--    <label>Ma khach hang</label>--%>
<%--    <select name="kh.id">--%>
<%--        <c:forEach var="dp" items="${listKH}">--%>
<%--            <option value="${dp.id}" ${dp.id==data.kh.id ? 'selected':''}>${dp.makh}</option>--%>
<%--        </c:forEach>--%>
<%--    </select>--%>
<%--    <br>--%>
<%--    <label>Ten khach hang</label>--%>
<%--    <select name="kh.id">--%>
<%--        <c:forEach var="dp" items="${listKH}">--%>
<%--            <option value="${dp.id}" ${dp.id==data.kh.id ? 'selected':''}>${dp.tenkh}</option>--%>
<%--        </c:forEach>--%>
<%--    </select>--%>

<%--    <br>--%>
<%--    <button>Add</button>--%>
<%--</form>--%>
<%--<table border="1">--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--        <th>#</th>--%>
<%--        <th>Ghi chu</th>--%>
<%--        <th>Ma dat phong</th>--%>
<%--        <th>Ngay gio dat</th>--%>
<%--        <th>So luong khach</th>--%>
<%--        <th>So luong phong dat</th>--%>
<%--        <th>Thoi gian luu tru</th>--%>
<%--        <th>Ma kh</th>--%>
<%--        <th>Ten kh</th>--%>
<%--        <th>ID loai phong</th>--%>
<%--        <th>Trang thai</th>--%>
<%--        <th>Hanh dong</th>--%>
<%--    </tr>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <c:forEach var="dp" items="${listDP}" varStatus="i">--%>
<%--        <tr>--%>
<%--            <td>${dp.id}</td>--%>
<%--            <td>${dp.gc}</td>--%>
<%--            <td>${dp.mdp}</td>--%>
<%--            <td>${dp.ngd}</td>--%>
<%--            <td>${dp.slk}</td>--%>
<%--            <td>${dp.slp}</td>--%>
<%--            <td>${dp.tglt}</td>--%>
<%--            <td>${dp.kh.makh}</td>--%>
<%--            <td>${dp.kh.tenkh}</td>--%>
<%--            <td>${dp.idlp}</td>--%>
<%--            <td>${dp.trangThai}</td>--%>
<%--            <td>--%>
<%--                <a href="/dat-phong/detail/${dp.id}">--%>
<%--                    <button>Detail</button>--%>
<%--                </a>--%>

<%--                <a onclick="return confirm('ban co muon xoa khong ?')" href="/dat-phong/delete/${dp.id}">--%>
<%--                    <button>Remove</button>--%>
<%--                </a>--%>
<%--                <a href="/dat-phong/edit/${dp.id}"><button>Edit</button></a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--    </tbody>--%>
<%--</table>--%>
<form action="/dat-phong/search">
    <label>Dat phong</label>
    <input name="keyword" value="${keyword}" placeholder="nhap ma dat phong">
    <button>Search</button>
</form>
<form action="/dat-phong/add" method="post">
    <label>Gi chu</label>
    <input name="gc" value="${data.gc}">
    <c:if test="${not empty error['gc']}">
        <small style="color:red">${error['gc']}</small>
    </c:if>
    <br>
    <label>Ma dat phong</label>
    <input name="mdp" value="${data.mdp}">
    <c:if test="${not empty error['mdp']}">
        <small style="color:red">${error['mdp']}</small>
    </c:if>
    <br>
    <label>Ngay gio dat</label>
    <input type="date" name="ngd" value="${data.ngd}">
    <c:if test="${not empty error['ngd']}">
        <small style="color: red">${error['ngd']}</small>
    </c:if>
    <br>
    <label>Sl luong khach</label>
    <input name="slk" value="${data.slk}">
    <c:if test="${not empty error['slk']}">
        <small style="color: red">${error['slk']}</small>
    </c:if>
    <br>
    <label>So luong phong dat</label>
    <input name="slp" value="${data.slp}">
    <c:if test="${not empty error['slp']}">
        <small style="color: red">${error['slp']}</small>
    </c:if>
    <br>
    <label>Thoi gian luu tru</label>
    <input name="tglt" value="${data.tglt}">
    <c:if test="${not empty error['tglt']}">
        <small style="color: red">${error['tglt']}</small>
    </c:if>
    <br>
    <label>ID loai phong</label>
    <input name="idlp" value="${data.idlp}">
    <c:if test="${not empty error['idlp']}">
        <small style="color: red">${error['idlp']}</small>
    </c:if>
    <br>
    <label>Trang thai</label>
    <input name="trangThai" value="${data.trangThai}">
    <c:if test="${not empty error['trangThai']}">
        <small style="color: red">${error['trangThai']}</small>
    </c:if>
    <br>
    <label>Ten kh</label>
    <select name="kh.id">
        <c:forEach var="dp" items="${listKH}">
            <option value="${dp.id}" ${dp.id==data.kh.id ? 'checked' : ''}>${dp.tenkh}</option>
        </c:forEach>
    </select>
    <br>
    <label>Ma kh</label>
    <select name="kh.id">
        <c:forEach var="dp" items="${listKH}">
            <option value="${dp.id}" ${dp.id==data.kh.id ? 'checked' : ''}>${dp.makh}</option>
        </c:forEach>
    </select>
    <br>
    <%--    <select name="nxb">--%>
    <%--        <c:forEach items="${listNXB}" var="nxb">--%>
    <%--            <option value="${nxb.id}" ${s.nxb.id == nxb.id ? "selected" : ""}>${nxb.ten1}</option>--%>
    <%--        </c:forEach>--%>
    <%--    </select>--%>
    <button>Add</button>
</form>
<table border="1">
    <thead>
    <tr>
        <th>#</th>
        <th>Ghi chu</th>
        <th>Ma dat phong</th>
        <th>Ngay gio dat</th>
        <th>so luong khach</th>
        <th>so luong phong dat</th>
        <th>thoi gian luu tru</th>
        <th>id loai phong</th>
        <th>trang thai</th>
        <th>ten kh</th>
        <th>Ma kh</th>
        <th>Thao tac</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="dp" items="${listDP}">
        <tr>
            <td>${dp.id}</td>
            <td>${dp.gc}</td>
            <td>${dp.mdp}</td>
            <td>${dp.ngd}</td>
            <td>${dp.slk}</td>
            <td>${dp.slp}</td>
            <td>${dp.tglt}</td>
            <td>${dp.idlp}</td>
            <td>${dp.trangThai}</td>
            <td>${dp.kh.tenkh}</td>
            <td>${dp.kh.makh}</td>
            <td>
                <a onclick="return confirm('ban co chac chan muon xoa khong ?')" href="/dat-phong/remove/${dp.id}">
                    <button>Delete</button>
                </a>
                <a href="/dat-phong/detail/${dp.id}">
                    <button>Detail</button>
                </a>
                <a href="/dat-phong/edit/${dp.id}">
                    <button>Update</button>
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
