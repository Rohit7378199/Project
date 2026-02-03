<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="../component/allcss.jsp"%>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>

</head>
<body>
	<%@include file="navbar.jsp"%>


	<c:if test="${empty adminobj}">
		<c:redirect url="../admin_login.jsp"></c:redirect>
	</c:if>

	<div class="container p-5">
		<p class="text-center fs-3">Admin Dashboard</p>

		<%-- Success Message --%>
		<c:if test="${not empty sucMsg}">
			<p class="fs-3 text-center text-success fs-3">${sucMsg}</p>
			<c:remove var="sucMsg" scope="session" />
		</c:if>

		<%-- Error Message --%>
		<c:if test="${not empty errorMsg}">
			<p class="fs-3 text-center text-danger fs-3" role="alert">${errorMsg}</p>
			<c:remove var="errorMsg" scope="session" />
		</c:if>

		<div class="row">
			<div class="col-md-4">
				<div class="card paint-card">
					<div class="card-body text-center text-success">
						<i class="fa-solid fa-user-doctor fa-4x"></i></i><br>
						<p class="fs-4 text-center">
							Doctor <br>5
						</p>
					</div>
				</div>
			</div>


			<div class="col-md-4">
				<div class="card paint-card">
					<div class="card-body text-center text-success">
						<i class="fa-solid fa-user fa-4x"></i><br>
						<p class="fs-4 text-center">
							User <br>556
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card paint-card">
					<div class="card-body text-center text-success">
						<i class="fa-solid fa-calendar-check fa-4x"></i></i><br>
						<p class="fs-4 text-center">
							Total Appoinment <br>4556
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4 mt-2">
				<div class="card paint-card" data-bs-toggle="modal"
					data-bs-target="#exampleModal">
					<div class="card-body text-center text-success">
						<i class="fa-solid fa-calendar-check fa-4x"></i><br>
						<p class="fs-4 text-center">
							Specialist <br>46
						</p>
					</div>
				</div>
			</div>



		</div>
	</div>



	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<form action="../addSpecialist" method="post">
						<div class="form-group">
							<label>Enter Specialist Name</label> <input type="text"
								name="specName" class="form-control">
						</div>
						<div class="text-center mt-5">
							<button type="submit" class="btn btn-primary btn-lg">
								Add</button>
						</div>




					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>