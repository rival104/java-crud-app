<%@ include file="header.jsp"%>
<c:if test="${!isLoggedIn}">
	<div class="row justify-content-center">
		<div class="alert alert-danger alert-dismissible fade show"
			role="alert">
			<strong>Error need to login first</strong> <a href="login.html">click
				here</a> to login.
			<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
		</div>
	</div>
</c:if>
<c:if test="${isLoggedIn}">
	<div class="container">
		<c:if test="${isUpdated}">
			 <div class="row justify-content-center">
					<div class="alert alert-success alert-dismissible fade show"
						role="alert">
						<strong>Updated successfully!</strong>  <a href="viewAll">click here</a> to view employees
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
				</div>
		</c:if>
		
		<c:if test="${hasError}">
			 <div class="row justify-content-center">
					<div class="alert alert-danger alert-dismissible fade show"
						role="alert">
						<strong>Error updating employee! </strong> check input and try again.
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
				</div>
		</c:if>
		
		<div class="row justify-content-center">
			<!--Custom Material form -->
			<div class="card min-w">
				<h5
					class="card text-black bg-warning mb-3 card-header text-center py-4">
					<strong>Update Employee Salary</strong>
				</h5>
				<!--Card content-->
				<div class="card-body px-lg-5 pt-0">
					<!-- Form -->
					<form class="text-center" style="color: #757575;" action="update"
						autocomplete="off">
						<!-- ID -->
						<div class="md-form">
							<input type="text" class="form-control" id="employeeId" name="id"
								placeholder="Enter ID here"> <label for="employeeId">Employee
								ID</label>
						</div>
						<!-- Salary -->
						<div class="md-form">
							<input type="text" class="form-control" id="employeeSal"
								name="sal" placeholder="Enter Salary here"> <label
								for="employeeSal">Salary</label>
						</div>
						<!-- button -->
						<button
							class="btn btn-outline-warning btn-rounded btn-block my-4 waves-effect z-depth-0"
							type="submit">Update</button>
						<a
							class="btn btn-outline-secondary btn-rounded btn-block my-4 waves-effect z-depth-0"
							href="index.jsp" role="button">Go Back</a>
					</form>
					<!-- Form -->
				</div>
			</div>
			<!--Custom Material form -->
		</div>
	</div>
</c:if>
<%@ include file="footer.jsp"%>