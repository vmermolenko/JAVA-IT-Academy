<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>

	<div class="card" style="width: 18rem;">
	  <div class="card-body">
	    <h5 class="card-title">Add</h5>
	    <h6 class="card-subtitle mb-2 text-muted">Add ne author</h6>
	
	
	
		<form action = "MySecondServlet" method = "POST">
	
		<input type="hidden" name="action" value="add_author">
		 
		  <div class="input-group mb-3">
		  <div class="input-group-prepend">
		    <span class="input-group-text" id="basic-addon1">Name</span>
		  </div>
		  <input type="text" name="author_name" class="form-control" placeholder="name" aria-label="action" aria-describedby="basic-addon1"/>
		  </div>
		  <br />
		  
		  <div class="input-group mb-3">
		  <div class="input-group-prepend">
		    <span class="input-group-text" id="basic-addon1">Email</span>
		  </div>
		  <input type="email" name="author_email" class="form-control" placeholder="email" aria-label="action" aria-describedby="basic-addon1"/>
		   </div>
		  <br />
		  
		  <div class="input-group mb-3">
		  <div class="input-group-prepend">
		    <span class="input-group-text" id="basic-addon1">Date</span>
		  </div>
		  <input type="date" name="author_birthday" class="form-control" placeholder="date" aria-label="action" aria-describedby="basic-addon1"/>
		 </div>
		  <br />
		
	
		<input type="submit" class="btn btn-primary" data-toggle="input" autocomplete="off" value="Add Author "/>
		</form>
	 
	  </div>
	</div>
		
	
	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
 

</body>
</html>