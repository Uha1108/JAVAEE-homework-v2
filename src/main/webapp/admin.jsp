<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2021/5/27
  Time: 2:39 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <title>Admin Dashboard</title>
    <!-- Bootstrap core CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <link rel="icon" href="assets/image/logo.png" type="image/png">
    <style>
        .container {
            max-width: 960px;
        }
    </style>
    <!-- Custom styles for this template -->
</head>
<body>
<div class="container">
    <header class="d-flex flex-column flex-md-row align-items-center pb-3 mb-4 border-bottom">
        <a href="#" class="d-flex align-items-center text-dark text-decoration-none">
            <span class="fs-4">Admin Dashboard</span>
        </a>

        <nav class="flex-*-row-reverse mt-2 mt-md-0 ms-md-auto">
            <a class="btn btn-outline-success my-2 my-sm-0" href="add-song">Add New Song</a>
            <a class="btn btn-outline-success my-2 my-sm-0" href="delete-song">Delete Songs</a>
        </nav>
    </header>
    <!--
    forEach songs in the <table></table>. Each song is also inside a <form></form>, whose request is to delete it.
    -->
</div>
</body>
</html>