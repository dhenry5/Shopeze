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
      font-size: 100px;
      color: white;

    }

    #login, #guest {
    padding: 16px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s;
    transition-duration: 0.4s;
    cursor: pointer;
    float: bottom;
    }

    #login{
      background-color: white;
      border:2px solid lightblue;
      color:lightblue;
    }
    #guest{
      background-color: lightblue;
      border:2px solid white;
      color: white;
    }

    #login:hover{
    background-color: lightblue;
    border:2px solid white;
    color: white;
    }
     #guest:hover{
       background-color: white;
       border:2px solid lightblue;
       color: lightblue;
     }
    </style>
  </head>
  <body>
    <div id="container">
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
          Find your Fastest Route!</br>
          <button id="login" onclick="login()">Login</button>
          <button id="guest" onclick="guest()">Continue as Guest</button>
      </div>
      <div id="footer">

      </div>
    </div>
    <script>
    
    </script>
  </body>
</html>
