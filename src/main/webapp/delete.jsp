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
		<c:if test="${isDeleted}">
			 <div class="row justify-content-center">
					<div class="alert alert-danger alert-dismissible fade show"
						role="alert">
						<strong>Deleted successfully!</strong>  <a href="viewAll">click here</a> to view employees
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
				</div>
		</c:if>
		
		<c:if test="${hasError}">
			 <div class="row justify-content-center">
					<div class="alert alert-warning alert-dismissible fade show"
						role="alert">
						<strong>Error deleting employee: </strong> Employee not found with given ID.
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
</c:if>
<%@ include file="footer.jsp"%>