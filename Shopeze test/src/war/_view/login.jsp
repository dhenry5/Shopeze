<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Shopeze Login</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		td.label {
			text-align: right;
		}
		</style>
	</head>

	<body>
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
	
		<form action="${pageContext.servletContext.contextPath}/login" method="post">
			<table>
				<tr>
					<td class="label">Username:</td>
					<td><input type="text" name="username" size="12" value="${username}" /></td>
				</tr>
				<tr>
					<td class="label">Password:</td>
					<td><input type="text" name="password" size="12" value="${password}" /></td>
				</tr>
			</table>
			<input type="Submit" name="submit" value="Login">
		</form>
	</body>
</html>




<!DOCTYPE html>
<html>
  <head>
    <title> Shopeze </title>
    <style>
    body{
      background-image: url("https://i.imgur.com/tnhC0DF.jpg");
      background-repeat: no-repeat;
      background-size: cover;
    }
    #header{
      background-color: white;
      border: 1px solid black;
      padding: 10px 30px;
      background-color: white;
      font-style: italic;

    }
    #logo{
      color: black;
      font-size: 80px;
      text-align: left;
    }
    #nav{
      text-align: right;
    }
    .button{
      float: right;
    }

    #content{
      float: top;
      text-align: center;
      font-size: 40px;
      color: black;
      width: 800;
      margin-left: auto;
      margin-right: auto;
      padding: 100px 200px;
    }
    #existing {
      width: 500px;
      height: 500px;
      background-color: lightblue;
      border-style: outset;
      border-width: 5px;
      float: left;
    }
    #existing .button{
      background-color: white;
      color:lightblue;
      margin-left: 150px;
      margin-right: 150px;
      margin-top: 10px;
      width: 200px;
      font-size: 25px;
      padding: 10px;
    }
    #existing .label{


    }
    #create {
      width: 500px;
      height: 500px;
      background-color: white;
      border-style: inset;
      border-width: 5px;
      border-color: lightblue;
      float: right;
    }
    #create .button{
      background-color: lightblue;
      color:white;
      margin-left: 150px;
      margin-right: 150px;
      margin-top: 10px;
      width: 200px;
      font-size: 25px;
      padding: 10px;
    }
    #footer {
      clear: both;
    }
    </style>
  </head>
  <body>
      <div id="header">
        <div id="logo">
        SHOP-EZE
        <img src="shoppingCart.png" alt="SHOPEZE.png" style="width:50px;height:50px;">
        </div>
        <div id="nav">
          <button class="button" onclick="myFunction()">Login</button>
          <button class="button" onclick="myFunction()">About</button>
          <button class="button" onclick="myFunction()">Help</button>
        </div>
      </div>
      <div id="content">
        <div id="existing">
          <h3>Existing User</h3>
          </br>
            <tr>
					   <td class="label">Email:</td>
					   <td><input type="text" name="Email" value=""/></td>
				    </tr>
            </br>
				   <tr>
					  <td class="label">Password:</td>
					  <td><input type="text" name="Password" value="" /></td>
				   </tr>
           </br>
           <button class="button" onclick="signIn()">Sign In</button>
           </br>
           <button class="button" onclick="forgot()">Forgot Password</button>
          </div>
          <div id="create">
            <h3>Create an Account</h3>
          </br>
            <tr>
					   <td class="label">Email:</td>
					   <td><input type="text" name="Email" value="${username}"/></td>
				    </tr>
            </br>
				   <tr>
					  <td class="label">Password:</td>
					  <td><input type="text" name="Password" value="${password}" /></td>
				   </tr>
           </br>
           <tr>
           <td class="label">Confirm Password:</td>
           <td><input type="text" name="Confirm Password" value="${confirm_password}" /></td>
          </tr>
          </br>
          <button class="button" onclick="signUp()">Sign Up</button>
          </div>
      </div>
      <div id="footer">

      </div>
    <script>
    funtion signUp(){

    }
    funtion signIn(){

    }

    funtion forgot(){

    }
    </script>
  </body>
</html>
