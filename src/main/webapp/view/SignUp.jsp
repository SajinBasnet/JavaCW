<!DOCTYPE html>
<html>
  <head>
    <title>Sign Up Page</title>
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

      <div class="SignUpform">
        <form method="post" action="../SigningUp" >
          <h2>SignUp Form</h2>

          <label>Name: </label>
          <input type="text" placeholder="input your name" name="name" /><br /><br />
          <label>Address: </label>
          <input type="text" placeholder="input your address" name="address"/><br /><br />
          <label>Contact: </label>
          <input
            type="text"
            placeholder="input your phone number" name="contact"
          /><br /><br />
          <label>Email: </label>
          <input type="email" placeholder="input your email" name="email"/><br /><br />
          <label>Gender: </label>
          <input class="gender" type="radio" value="male" name="gender"/>
          <label>Male</label>
          <input class="gender" type="radio" value="female" name="gender" />
          <label>Female</label><br /><br />
          <label>Create password: </label>
          <input type="password" placeholder="create a password" name="pass"/><br /><br />
          
          <input type="submit" value="SignUp" class="lgbutton">
          
        </form>
        <p>Already have an account? <a href="Login.html">Login</a></p>
        <div class="line"></div>
        <div class="facebookLogin">
          <a href="">
            <img src="../images/facebook.png" alt="Login with facebook" />
          </a>
        </div>

        <div class="GoogleLogin">
          <a href="#">
            <img src="../images/google2.png" />
          </a>
        </div>
      </div>
    </div>
  </body>
</html>
