<%-- 
    Document   : index
    Created on : 12 de dez. de 2020, 15:26:54
    Author     : Medina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/view/include/head.jsp" %>
        <link rel="stylesheet" href="style.css" /> 
        <title>Novo cliente</title>
    </head>
    <body>

        <div class="container">           
            <div>
                <img class="bookshelf" src="img/bookshelf.webp" alt="bookshelf" id="bookshelf-left"/>
            </div>

            <div>
                <img class="bookshelf" src="img/bookshelf.webp" alt="bookshelf" id="bookshelf-right"/>
            </div>
            
            <form
                class="form"
                action="${pageContext.servletContext.contextPath}/user/create"
                enctype="multipart/form-data"
                method="POST">

                <div class="form-header">
                    <span id="cadastro">Novo cadastro</span>
                </div>

                <div class="form-content">

                    <div class="form-group col-8">
                        <label class="control-label" for="cliente-nome"></label>
                        <input class="form-control" type="text" 
                               name="nome" placeholder="nome" required autofocus/>
                    </div>


                    <div class="form-group col-8">
                        <label class="control-label" for="cliente-sobrenome"></label>
                        <input class="form-control" type="text" 
                               name="sobrenome" placeholder="sobrenome" required/>
                    </div>

                    <div class="form-group col-8">
                        <label class="control-label" for="cliente-email"></label>
                        <input class="form-control" type="email" 
                               name="email" placeholder="e-mail" required/>
                    </div>


                    <div class="form-group col-8 row uf_city">
                        <div class="col-3">
                            <label class="control-label" for="cliente-UF"></label>
                            <select class="form-control" id="uf-select" disabled required>
                                <option value="undefined">UF</option>
                            </select>
                        </div>

                        <div class="col-9 ">
                            <label class="control-label" for="cliente-cidade"></label>
                            <select class="form-control" id="city-select" disabled required> 
                                <option value="undefined">Cidade</option>
                            </select>
                        </div>
                    </div>


                    <div class="form-group col-8 row rua_num">
                        <div class="col-9">
                            <label class="control-label" for="cliente-rua"></label>
                            <input class="form-control" type="text" 
                                   name="rua" placeholder="rua" required/>
                        </div>

                        <div class="col-3">
                            <label class="control-label" for="cliente-numero"></label>
                            <input class="form-control" type="text" 
                                   name="numero" placeholder="numero" required/>
                        </div>
                    </div>   

                    <div class="form-group col-8 ">
                        <label class="control-label" for="cliente-complemento"></label>
                        <input class="form-control" type="text" 
                               name="compl" placeholder="complemento"/>
                    </div> 

                    <div class="form-group col-8">
                        <label class="control-label" for="cliente-telefone"></label>
                        <input class="form-control" type="text" 
                               id="cliente-telefone" name="telef" placeholder="telefone"/>
                    </div> 

                    <div class="form-group col-8">
                        <label class="control-label" for="cliente-login"></label>
                        <input class="form-control" type="text" 
                               name="login" placeholder="login" required/>
                    </div>

                    <div class="form-group col-8">
                        <label class="control-label" for="cliente-senha"></label>
                        <input class="form-control" type="password" 
                               name="senha" placeholder="senha" required/>
                    </div>

                    <div class="text-center submit col-8">
                        <button class="submit_button" type="submit">Crie sua conta</button>
                    </div>
                </div>
            </form>
        </div>

    </div>


    <%@include file="/view/include/scripts.jsp" %>
    <script src="assets/js/usuario/create.js"></script>
</body>
</html>