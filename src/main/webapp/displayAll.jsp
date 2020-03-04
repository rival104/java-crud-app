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
	<div class="row justify-content-center">
	
		<div class="card border-primary mb-3" style="width: 60rem;">
			<div class="card-body">
				<h5
					class="card-header text-center py-4">
					<strong>Display All Employee</strong>
				</h5>
			</div>
		</div>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Salary</th>
				</tr>
			</thead>
			<tbody>
				 <c:forEach items="${empList}" var = "emp" varStatus="loop">
        			<tr>
						<th scope="row">${loop.index + 1}</th>
						<td>${emp.getId()}</td>
						<td>${emp.name}</td>
						<td>${emp.sal}</td>
					</tr>
      			</c:forEach>
			</tbody>
		</table>
		<a class="btn btn-secondary" href="index.jsp" role="button">Go Back</a>
		
	</div>

</div>
</c:if>
<%@ include file="footer.jsp"%>