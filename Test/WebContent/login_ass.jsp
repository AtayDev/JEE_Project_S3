<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style_sans_slider.css">
</head>
<body>
	<div class="container">
		<div class="header">
		<img class="logo" src="images/logoHero.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="hey.register_dona">Espace Donneur</a></li>
					<li><a href="hey.sign_up_ass">Espace Association</a></li>
					<li><a href="#">About</a></li>
				</ul>
			</nav>
			<a class="contact" href="#"><button>Contact</button></a>
		</div>
		
		<div class="content">
			<div class="login-form">
				<form  action="Yes.login_ass" method="post">
						<h1>Bienvenue!</h1>
						<input type="text" name="email" class="input-box" placeholder="Email">
						<input type="text" name="password" class="input-box" placeholder="Password">
						<button type="submit" class="login-btn">Sign In</button>
				</form>
			</div>
		</div>
		<div class="footer">Footer</div>
	</div>	
</body>
</html>