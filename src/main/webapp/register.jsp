<%@ include file="header.jsp"%>

	<div class="container">
		<div class="row justify-content-center">
			<!--Custom Material form -->
			<div class="card min-w">
				<h5
					class="card text-white bg-info mb-3 card-header text-center py-4">
					<strong>Register New Employee</strong>
				</h5>
				<!--Card content-->
				<div class="card-body px-lg-5 pt-0">
					<!-- Form -->
					<form class="text-center" style="color: #757575;" action="register"
						autocomplete="off">
						<!-- ID -->
						<div class="md-form">
							<input type="text" class="form-control" id="employeeId" name="id"
								placeholder="Enter ID here"> <label for="employeeId">Employee
								ID</label>
						</div>
						<!-- Name -->
						<div class="md-form">
							<input type="text" class="form-control" id="employeeName"
								name="name" placeholder="Enter Name here"> <label
								for="employeeName">Name</label>
						</div>
						<!-- Salary -->
						<div class="md-form">
							<input type="text" class="form-control" id="employeeSal"
								name="sal" placeholder="Enter Salary here"> <label
								for="employeeSal">Salary</label>
						</div>
						<!-- button -->
						<button
							class="btn btn-outline-info btn-rounded btn-block my-4 waves-effect z-depth-0"
							type="submit">Register</button>
						<a
							class="btn btn-outline-secondary btn-rounded btn-block my-4 waves-effect z-depth-0"
							href="index.html" role="button">Go Back</a>
					</form>
					<!-- Form -->
				</div>
			</div>
			<!--Custom Material form -->
		</div>

	</div>

<%@ include file="footer.jsp"%>