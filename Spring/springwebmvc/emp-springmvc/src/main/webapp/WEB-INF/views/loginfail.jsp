<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="..css/style.css">
</head>
<body>

	<div class="main">

		<section class="signup">
			<!-- <img src="images/signup-bg.jpg" alt=""> -->
			<div class="container">
				<div class="signup-content">
					<div style="align: center; color: red; margin-left: 100px">
						<span>${msg }</span>
					</div>
					<form method="POST" id="signup-form" class="signup-form"
						action="/emp/login">
						<h2 class="form-title">EMP</h2>

						<div class="form-group">
							<input type="number" class="form-input" name="id" id="id"
								placeholder="Your Employee ID" />
						</div>
						<div class="form-group">
							<input type="text" class="form-input" name="password"
								id="password" placeholder="Password" /> <span
								toggle="#password"
								class="zmdi zmdi-eye field-icon toggle-password"></span>
						</div>

						<div class="form-group">
							<input type="checkbox" name="agree-term" id="agree-term"
								class="agree-term" /> <label for="agree-term"
								class="label-agree-term"><span><span></span></span>I
								agree all statements in <a href="#" class="term-service">Terms
									of service</a></label>
						</div>
						<div class="form-group">
							<input type="submit" name="submit" id="submit"
								class="form-submit" value="Login" />
						</div>
					</form>
					<p class="loginhere">
						New Employee? <a href="Employee information.html"
							class="loginhere-link">Create Account</a>
					</p>
				</div>
			</div>
		</section>

	</div>

	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
</body>
</html>