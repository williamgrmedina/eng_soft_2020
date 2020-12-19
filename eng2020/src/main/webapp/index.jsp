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

            <form
                class="form"
                action="${pageContext.servletContext.contextPath}/user/create"
                enctype="multipart/form-data"
                method="POST">

				<div class="form-header">
					<span id="cadastro">Novo cadastro</span>
				</div>

                <div class="form-content">
					<div class="form-group">
						<label class="control-label" for="cliente-nome"></label>
						<input class="form-control" type="text" 
							   name="nome" placeholder="nome" required autofocus/>
					</div>


					<div class="form-group">
						<label class="control-label" for="cliente-sobrenome"></label>
						<input class="form-control" type="text" 
							   name="sobrenome" placeholder="sobrenome" required/>
					</div>

					<div class="form-group">
						<label class="control-label" for="cliente-email"></label>
						<input class="form-control" type="email" 
							   name="email" placeholder="e-mail" required/>
					</div>

					<div class="form-group">
						<label class="control-label" for="cliente-UF"></label>
						<input class="form-control" type="text" 
							   name="UF" placeholder="UF" required/>
					</div>
					
					<div class="form-group">
						<label class="control-label" for="cliente-cidade"></label>
						<input class="form-control" type="text" 
							   name="cidade" placeholder="cidade" required/>
					</div>
					
					<div class="form-group">
						<label class="control-label" for="cliente-rua"></label>
						<input class="form-control" type="text" 
							   name="rua" placeholder="rua" required/>
					</div>
					
					<div class="form-group">
						<label class="control-label" for="cliente-complemento"></label>
						<input class="form-control" type="text" 
							   name="compl" placeholder="complemento" required/>
					</div>
					
					<div class="form-group">
						<label class="control-label" for="cliente-numero"></label>
						<input class="form-control" type="number" 
							   name="numero" placeholder="numero" required/>
					</div>
					
					<div class="form-group">
						<label class="control-label" for="cliente-login"></label>
						<input class="form-control" type="text" 
							   name="login" placeholder="login" required/>
					</div>
					
					<div class="form-group">
						<label class="control-label" for="cliente-senha"></label>
						<input class="form-control" type="password" 
							   name="senha" placeholder="senha" required/>
					</div>

					<div class="text-center submit">
						<button class="submit_button" type="submit">Crie sua conta</button>
					</div>
				</div>
            </form>
        </div>

        <%@include file="/view/include/scripts.jsp" %>
    </body>
</html>