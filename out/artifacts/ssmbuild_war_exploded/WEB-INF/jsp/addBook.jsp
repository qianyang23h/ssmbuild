<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 —— 新增书籍</small>
                </h1>
            </div>
        </div>

        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            书籍名称：<input type="text" name="bookName" required><br><br><br>
            书籍数量：<input type="text" name="bookCounts" required><br><br><br>
            书籍详情：<input type="text" name="detail" required><br><br><br>
            <input type="submit" value="添加">
        </form>
    </div>


</div>
</body>
</html>
