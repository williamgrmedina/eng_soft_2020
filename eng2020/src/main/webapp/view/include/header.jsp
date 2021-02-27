<%-- 
    Document   : header
    Created on : 26 de fev. de 2021, 18:57:31
    Author     : Medina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/view/include/head.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../../assets/css/header.css"/>
    </head>
    <body>
        <div class="container">
            <div class="header">
                <div id="book_logo">
                    <img src="../../img/header/book_logo.png" alt="book-logo"/>
                </div>
                <div id="company_title">
                    SISTEMAS CSOMENSI
                </div>
                <div class="search_bar">
                    <input type="text" id="search_bar_text" placeholder="O que você procura?"/>
                    <i class="fas fa-search form-control-feedback" id="search_icon"></i>
                </div>
            </div>
        </div>
    </body>
</html>
