<%@ include file="header.jsp"%>
	<div class="container">
		<div class="row justify-content-center">
			<!--Custom Material form -->
			<div class="card min-w">
				<h5
					class="card text-white bg-danger mb-3 card-header text-center py-4">
					<strong>Delete Employee Employee</strong>
				</h5>
				<!--Card content-->
				<div class="card-body px-lg-5 pt-0">
					<!-- Form -->
					<form class="text-center" style="color: #757575;" action="delete"
						autocomplete="off">
						<!-- ID -->
						<div class="md-form">
							<input type="text" class="form-control" id="employeeId" name="id"
								placeholder="Enter ID here"> <label for="employeeId">Employee
								ID</label>
						</div>
						<!-- button -->
						<button
							class="btn btn-outline-danger btn-rounded btn-block my-4 waves-effect z-depth-0"
							type="submit">Delete</button>
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

<%@ include file="footer.jsp"%>