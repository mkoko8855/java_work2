<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Register - SB Admin</title>
<link href="css/styles.css" rel="stylesheet" />
<script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js"
	crossorigin="anonymous"></script>
</head>
<body class="bg-primary">
	<div id="layoutAuthentication">
		<div id="layoutAuthentication_content">
			<main>
				<div class="container">
					<div class="row justify-content-center">
						<div class="col-lg-7">
							<div class="card shadow-lg border-0 rounded-lg mt-5">
								<div class="card-header">
									<h3 class="text-center font-weight-light my-4">Create
										Account</h3>
								</div>
								<div class="card-body">



									<!-- form은 post방식으로 서버에 전송이 가능하다! -> 내용은 user_register로 보내라~ -> 서버에서 그 값을 DB에 저장함 -> 이걸 담을 그릇인 VO가 필요하겠지? -->
									<!-- name값으로 VO를 적자 user_id, uname, email, passwd. 이렇게 4개 -->
									<!-- 근데 이사람 회원정보 보여주세요 하면, id가 바깥에 노출되는건 별로 좋은게 아니니 seq가 필요하다. 즉, 5개 -->
									<!-- regdate도 넣어주자..반드시필요한건 날짜니까. 모든데이터가 수정된건 언제 이벤트가 이뤄졌는지 알아야하니 regdate는 필수다 -->
									<!-- com.kosta.sample.user.UserVO로 만들고, UserServlet과 UserDAO도 만들자 -->
									<form method="post"
										action="<%=request.getContextPath()%>/UserServlet">
										<!--P001 데이터를 들고 유저서블릿으로 보내라!!!!  -->
											<input type="hidden" name="pagecode" value="P001">
											<div class="row mb-3">
												<div class="col-md-6">
													<div class="form-floating mb-3 mb-md-0">
														<input name="userid" class="form-control"
															id="inputFirstName" type="text"
															placeholder="Enter your ID" /> <label
															for="inputFirstName">ID</label>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-floating">
														<input name="uname" class="form-control"
															id="inputLastName" type="text"
															placeholder="Enter your last name" /> <label
															for="inputLastName">Name</label>
													</div>
												</div>
											</div>
											<div class="form-floating mb-3">
												<input name="email" class="form-control" id="inputEmail"
													type="email" placeholder="name@example.com" /> <label
													for="inputEmail">Email address</label>
											</div>
											<div class="row mb-3">
												<div class="col-md-6">
													<div class="form-floating mb-3 mb-md-0">
														<input name="passwd" class="form-control"
															id="inputPassword" type="password"
															placeholder="Create a password" /> <label
															for="inputPassword">Password</label>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-floating mb-3 mb-md-0">
														<input name="passwd2" class="form-control"
															id="inputPasswordConfirm" type="password"
															placeholder="Confirm password" /> <label
															for="inputPasswordConfirm">Confirm Password</label>
													</div>
												</div>
											</div>
											<div class="mt-4 mb-0">
												<div class="d-grid">
													<a class="btn btn-primary btn-block">Create Account</a> <input
														type="submit" value="회원가입">
												</div>
											</div>
										</form>
								</div>
								<div class="card-footer text-center py-3">
									<div class="small">
										<a href="login.jsp">Have an account? Go to login</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</main>
		</div>
		<div id="layoutAuthentication_footer">
			<footer class="py-4 bg-light mt-auto">
				<div class="container-fluid px-4">
					<div
						class="d-flex align-items-center justify-content-between small">
						<div class="text-muted">Copyright &copy; Your Website 2023</div>
						<div>
							<a href="#">Privacy Policy</a> &middot; <a href="#">Terms
								&amp; Conditions</a>
						</div>
					</div>
				</div>
			</footer>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		crossorigin="anonymous"></script>
	<script src="js/scripts.js"></script>
</body>
</html>
