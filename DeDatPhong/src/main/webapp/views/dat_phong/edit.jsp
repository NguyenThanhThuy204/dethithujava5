<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="/dat-phong/update/${data.id}" method="post">--%>
<%--    <label>Ghi chu</label>--%>
<%--    <input name="gc" value="${data.gc}">--%>
<%--&lt;%&ndash;    <c:if test="${not empty error['gc']}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <small style="color: red">${error['gc']}</small>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:if>&ndash;%&gt;--%>
<%--    <br>--%>
<%--    <label>Ma dat phong</label>--%>
<%--    <input name="mdp" value="${data.mdp}">--%>
<%--&lt;%&ndash;    <c:if test="${not empty error['mdp']}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <small style="color: red">${error['mdp']}</small>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:if>&ndash;%&gt;--%>
<%--    <br>--%>
<%--    <label>Ngay gio dat</label>--%>
<%--    <input type="date" name="ngd" value="${data.ngd}">--%>
<%--&lt;%&ndash;    <c:if test="${not empty error['ngd']}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <small style="color: red">${error['ngd']}</small>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:if>&ndash;%&gt;--%>
<%--    <br>--%>
<%--    <label>so luong khach</label>--%>
<%--    <input name="slk" value="${data.slk}">--%>
<%--&lt;%&ndash;    <c:if test="${not empty error['slk']}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <small style="color: red">${error['slk']}</small>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:if>&ndash;%&gt;--%>
<%--    <br>--%>
<%--    <label>so luong phong dat</label>--%>
<%--    <input name="slp" value="${data.slp}">--%>
<%--&lt;%&ndash;    <c:if test="${not empty error['slp']}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <small style="color: red">${error['slp']}</small>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:if>&ndash;%&gt;--%>
<%--    <br>--%>
<%--    <label>Thoi gian luu tru</label>--%>
<%--    <input name="tglt" value="${data.tglt}">--%>
<%--&lt;%&ndash;    <c:if test="${not empty error['tglt']}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <small style="color: red">${error['tglt']}</small>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:if>&ndash;%&gt;--%>
<%--    <br>--%>
<%--    <label>ID loai phong</label>--%>
<%--    <input name="idlp" value="${data.idlp}">--%>
<%--&lt;%&ndash;    <c:if test="${not empty error['idlp']}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <small style="color: red">${error['idlp']}</small>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:if>&ndash;%&gt;--%>
<%--    <br>--%>
<%--    <label>Trang thai</label>--%>
<%--    <input name="trangThai" value="${data.trangThai}">--%>
<%--&lt;%&ndash;    <c:if test="${not empty error['trangThai']}">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <small style="color: red">${error['trangThai']}</small>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </c:if>&ndash;%&gt;--%>
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
<%--    <button>Update</button>--%>
<%--</form>--%>

<form action="/dat-phong/update/${data.id}" method="post">
    <label>Gi chu</label>
    <input name="gc" value="${data.gc}">
    <br>
    <label>Ma dat phong</label>
    <input name="mdp" value="${data.mdp}">
    <br>
    <label>Ngay gio dat</label>
    <input type="date" name="ngd" value="${data.ngd}">
    <br>
    <label>Sl luong khach</label>
    <input name="slk" value="${data.slk}">
    <br>
    <label>So luong phong dat</label>
    <input name="slp" value="${data.slp}">
    <br>
    <label>Thoi gian luu tru</label>
    <input name="tglt" value="${data.tglt}">
    <br>
    <label>ID loai phong</label>
    <input name="idlp" value="${data.idlp}">
    <br>
    <label>Trang thai</label>
    <input name="trangThai" value="${data.trangThai}">
    <br>
    <label>Ten kh</label>
    <select name="kh.id">
        <c:forEach var="dp" items="${listKH}">
            <option value="${dp.id}" ${dp.id==data.kh.id ? 'selected' : ''}>${dp.tenkh}</option>
        </c:forEach>
    </select>
    <br>
    <label>Ma kh</label>
    <select name="kh.id">
        <c:forEach var="dp" items="${listKH}">
            <option value="${dp.id}" ${dp.id==data.kh.id ? 'selected' : ''}>${dp.makh}</option>
        </c:forEach>
    </select>
    <br>
    <%--    <select name="nxb">--%>
    <%--        <c:forEach items="${listNXB}" var="nxb">--%>
    <%--            <option value="${nxb.id}" ${s.nxb.id == nxb.id ? "selected" : ""}>${nxb.ten1}</option>--%>
    <%--        </c:forEach>--%>
    <%--    </select>--%>
    <button>Update</button>
</form>
</body>
</html>
