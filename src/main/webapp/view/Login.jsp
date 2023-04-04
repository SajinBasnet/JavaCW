<!DOCTYPE html>
<html>
  <head>
    <title>Login Page</title>
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link rel="stylesheet" href="all.css" />
  </head>
  <body>
    <div class="main">
      <div class="header">
        <div class="logo">
          <h1>Luga</h1>
        </div>
        <div class="navbar">
          <nav>
            <ul>
              <li><a href="Home.html"> Home</a></li>
              <li><a href="SignUp.html">SignUp</a></li>
              <li><a href="Login.html">Login</a></li>
              <li><a href="AboutUs.html">AboutUs</a></li>
            </ul>
          </nav>
        </div>
        <div class="searchbar">
          <input type="text" placeholder="search here" />
        </div>
        <div class="searchlogo">
          <i class="fa fa-search"></i>
        </div>
      </div>
       <div class="Loginform">
      <form>
          <h2>Login Form</h2> 
          <label>Email: </label>
        
          <input type="email" placeholder="input your email" /><br /><br />
          
          <label>Password: </label>
          <input type="password" placeholder="input your password" /><br /><br />
           <button class="lgbutton">Login</button>
        </form>
        <p>Don't have an account? <a href="SignUp.html">SignUp</a></p>
        <div class="line"></div>
        <div class="facebookLogin">
          <a href="">
            <img src="./images/facebook.png" alt="SignUp with facebook" />
          </a>
        </div>

        <div class="GoogleLogin">
          <a href="#">
            <img src="./images/google2.png" />
            
          </a>
        </div>
         </div>
    </div>
  </body>
</html>
