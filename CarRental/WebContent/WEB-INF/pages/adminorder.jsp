<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminOrder</title>
 <!-- Bootstrap core CSS-->
    <!-- link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" -->
     <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Page level plugin CSS-->
    <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin.css" rel="stylesheet">

</head>

  <body id="page-top">

    <nav class="navbar navbar-expand navbar-dark bg-dark static-top">

      <a class="navbar-brand mr-1" href="index.jsp">Start Bootstrap</a>

      <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
        <i class="fas fa-bars"></i>
      </button>

      <!-- Navbar Search -->
      <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
        <div class="input-group">
          <input type="text" class="form-control" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
          <div class="input-group-append">
            <button class="btn btn-primary" type="button">
              <i class="fas fa-search"></i>
            </button>
          </div>
        </div>
      </form>

      <!-- Navbar -->
      <ul class="navbar-nav ml-auto ml-md-0">
        <li class="nav-item dropdown no-arrow mx-1">
          <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-bell fa-fw"></i>
            <span class="badge badge-danger">9+</span>
          </a>
          <div class="dropdown-menu dropdown-menu-right" aria-labelledby="alertsDropdown">
            <a class="dropdown-item" href="#">Action</a>
            <a class="dropdown-item" href="#">Another action</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">Something else here</a>
          </div>
        </li>
        <li class="nav-item dropdown no-arrow mx-1">
          <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-envelope fa-fw"></i>
            <span class="badge badge-danger">7</span>
          </a>
          <div class="dropdown-menu dropdown-menu-right" aria-labelledby="messagesDropdown">
            <a class="dropdown-item" href="#">Action</a>
            <a class="dropdown-item" href="#">Another action</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">Something else here</a>
          </div>
        </li>
        <li class="nav-item dropdown no-arrow">
          <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-user-circle fa-fw"></i>
          </a>
          <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
            <a class="dropdown-item" href="#">Settings</a>
            <a class="dropdown-item" href="#">Activity Log</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">Logout</a>
          </div>
        </li>
      </ul>

    </nav>

    <div id="wrapper">

      <!-- Sidebar -->
      <ul class="sidebar navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="index.html">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Dashboard</span>
          </a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-fw fa-folder"></i>
            <span>Pages</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">Login Screens:</h6>
            <a class="dropdown-item" href="login.html">Login</a>
            <a class="dropdown-item" href="register.html">Register</a>
            <a class="dropdown-item" href="forgot-password.html">Forgot Password</a>
            <div class="dropdown-divider"></div>
            <h6 class="dropdown-header">Other Pages:</h6>
            <a class="dropdown-item" href="404.html">404 Page</a>
            <a class="dropdown-item" href="blank.html">Blank Page</a>
          </div>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="charts.html">
            <i class="fas fa-fw fa-chart-area"></i>
            <span>Charts</span></a>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="MainServlet?action=admin">
            <i class="fas fa-fw fa-table"></i>
            <span>Cars</span></a>
        </li>
      </ul>

      <div id="content-wrapper">

        <div class="container-fluid">

          <!-- Breadcrumbs-->
          <ol class="breadcrumb">
            <li class="breadcrumb-item">
              <a href="#">Dashboard</a>
            </li>
            <li class="breadcrumb-item active">Cars</li>
          </ol>

          <!-- DataTables Example -->
          <div class="card mb-3">
            <div class="card-header">
              <i class="fas fa-table"></i>
              Cars Table
              <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#insertModal">
				Insert new car
			  </button>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>id</th>
                      <th>marka</th>
                      <th>year</th>
                      <th>transmission</th>
                      <th>fuel</th>
                      <th>price</th>
                      <th>description</th>
                      <th>image</th>
                      <th>action</th>
                      
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                      <th>id</th>
                      <th>marka</th>
                      <th>year</th>
                      <th>transmission</th>
                      <th>fuel</th>
                      <th>price</th>
                      <th>description</th>
                      <th>image</th>
                      <th>action</th>
                    </tr>
                  </tfoot>
                  <tbody>
                  
	                  <c:forEach var="elem" items="${lst}" varStatus="status">
	                   <tr>
	                      <td>${ elem.id }</td>
	                      <td>${ elem.marka }</td>
	                      <td>${ elem.year }</td>
	                      <td>${ elem.transmission }</td>
	                      <td>${ elem.fuel }</td>
	                      <td>${ elem.price }</td>
	                      <td>${ elem.description }</td>
	                      <td><img height="100" src="<c:out value="${ elem.url }" />"></td>
	                      <td>
	                      <button type="button" class="btn btn-success" data-toggle="modal" data-target="#updateModal" 
			                      data-id="${ elem.id }"
			                      data-marka="${ elem.marka }"
			                      data-year="${ elem.year }"
			                      data-transmission="${ elem.transmission }"
			                      data-fuel="${ elem.fuel }"
			                      data-price="${ elem.price }"
			                      data-description="${ elem.description }"
			                      data-url="${ elem.url }">
							  Update
						  </button>
			              <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteModal" data-id="${ elem.id }">
							  Delete
						  </button>

	                      </td>
	                    </tr>
	                  
	                  </c:forEach>
                 </tbody>
                </table>
              </div>
            </div>
            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
          </div>

          <p class="small text-center text-muted my-5">
            <em>More table examples coming soon...</em>
          </p>

        </div>
        <!-- /.container-fluid -->

        <!-- Sticky Footer -->
        <footer class="sticky-footer">
          <div class="container my-auto">
            <div class="copyright text-center my-auto">
              <span>Copyright © Your Website 2018</span>
            </div>
          </div>
        </footer>

      </div>
      <!-- /.content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.html">Logout</a>
          </div>
        </div>
      </div>
    </div>
    
    
    <!-- DeleteModal -->
	<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="deleteModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="deleteModalLabel">Удалить</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        Do you want delete car №
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
	        
	         <form name="sentMessage" id="contactForm" action = "MainServlet" method = "POST">
	         	<input type="hidden" name="action" value="admin">
	         	<input type="hidden" name="operation" value="delete">
	            <input type="hidden" id="id_car" name="id_car" value="">
	         <button type="submit" class="btn btn-danger" id="sendMessageButton">Delete</button>
	        </form>
	      </div>
	    </div>
	  </div>
	</div>
	
	
	<!-- UpdateModal -->
	<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="updateModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	     <form name="sentMessage" id="contactForm" action = "MainServlet" method = "POST">
     			<input type="hidden" name="action" value="admin">
	         	<input type="hidden" name="operation" value="update">
	            <input type="hidden" name="id_car" id="id_car" value="">

		      <div class="modal-header">
		        <h5 class="modal-title" id="updateModalLabel">Редактирование </h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		         <div class="form-group">
		            <label for="modal_marka" class="col-form-label">Car marka:</label>
		            <input type="text"  class="form-control" id="modal_marka" name="modal_marka">
		         </div>
		         <div class="form-group">
		            <label for="modal_year" class="col-form-label">Car year:</label>
		            <input type="text"  class="form-control" id="modal_year" name="modal_year">
		         </div>
		         <div class="form-group">
		            <label for="modal_transmission" class="col-form-label">Car transmission:</label>
		            <input type="text"  class="form-control" id="modal_transmission" name="modal_transmission">
		         </div>
		         <div class="form-group">
		            <label for="modal_fuel" class="col-form-label">Car fuel:</label>
		            <input type="text"  class="form-control" id="modal_fuel" name="modal_fuel">
		         </div>
		         <div class="form-group">
		            <label for="modal_price" class="col-form-label">Car price:</label>
		            <input type="text"  class="form-control" id="modal_price" name="modal_price">
		         </div>
		         <div class="form-group">
		            <label for="modal_description" class="col-form-label">Car description:</label>
		            <input type="textarea"  class="form-control" id="modal_description" name="modal_description">
		         </div>
		         <div class="form-group">
		            <label for="modal_url" class="col-form-label">Car url:</label>
		            <input type="text"  class="form-control" id="modal_url" name="modal_url">
		         </div>
		      </div>
		      <div class="modal-footer">
		         <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		         <button type="submit" class="btn btn-success" id="modalUpdateButton">Update</button>
		      </div>
	       </form>
	    </div>
	  </div>
	</div>
	
	
	<!-- insertModal -->
	<div class="modal fade" id="insertModal" tabindex="-1" role="dialog" aria-labelledby="insertModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	     <form name="sentMessage" id="contactForm" action = "MainServlet" method = "POST">
     			<input type="hidden" name="action" value="admin">
	         	<input type="hidden" name="operation" value="insert">

		      <div class="modal-header">
		        <h5 class="modal-title" id="updateModalLabel">New car </h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		         <div class="form-group">
		            <label for="modal_marka" class="col-form-label">Car marka:</label>
		            <input type="text"  class="form-control" id="modal_marka" name="modal_marka" placeholder="Sample: Ferrari">
		         </div>
		         <div class="form-group">
		            <label for="modal_year" class="col-form-label">Car year:</label>
		            <input type="text"  class="form-control" id="modal_year" name="modal_year" placeholder="Sample: 2018">
		         </div>
		         <div class="form-group">
		            <label for="modal_transmission" class="col-form-label">Car transmission:</label>
		            <input type="text"  class="form-control" id="modal_transmission" name="modal_transmission" placeholder="Sample: Автоматическая">
		         </div>
		         <div class="form-group">
		            <label for="modal_fuel" class="col-form-label">Car fuel:</label>
		            <input type="text"  class="form-control" id="modal_fuel" name="modal_fuel" placeholder="Sample: Бензин">
		         </div>
		         <div class="form-group">
		            <label for="modal_price" class="col-form-label">Car price:</label>
		            <input type="text"  class="form-control" id="modal_price" name="modal_price" placeholder="Sample: 40">
		         </div>
		         <div class="form-group">
		            <label for="modal_description" class="col-form-label">Car description:</label>
		            <input type="textarea"  class="form-control" id="modal_description" name="modal_description" placeholder="Sample: Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.">
		         </div>
		         <div class="form-group">
		            <label for="modal_url" class="col-form-label">Car url:</label>
		            <input type="text"  class="form-control" id="modal_url" name="modal_url" placeholder="Sample: https://mydriftfun.com/wp-content/uploads/2017/07/20-Interesting-Facts-about-Ferrari.jpg">
		         </div>
		      </div>
		      <div class="modal-footer">
		         <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		         <button type="submit" class="btn btn-primary" id="modalInsertButton">Insert</button>
		      </div>
	       </form>
	    </div>
	  </div>
	</div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Page level plugin JavaScript-->
    <script src="vendor/datatables/jquery.dataTables.js"></script>
    <script src="vendor/datatables/dataTables.bootstrap4.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin.min.js"></script>

    <!-- Demo scripts for this page-->
    <script src="js/demo/datatables-demo.js"></script>

	<script type="text/javascript">
		$('#deleteModal').on('show.bs.modal', function (event) {
		  var button = $(event.relatedTarget) // Button that triggered the modal
		  var recipient = button.data('id') // Extract info from data-* attributes
		  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
		  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
		  var modal = $(this)
		  modal.find('.modal-title').text('Delete: Car №' + recipient)
		  modal.find('.modal-body').text('Do you want delete car №' + recipient)
		  modal.find('#id_car').val(recipient)
		})
				
		$('#updateModal').on('show.bs.modal', function (event) {
		  var button = $(event.relatedTarget) // Button that triggered the modal
		  var id = button.data('id') // Extract info from data-* attributes
		  var marka = button.data('marka')
		  var year = button.data('year')
		  var transmission = button.data('transmission')
		  var fuel = button.data('fuel')
		  var price = button.data('price')
		  var description = button.data('description')
		  var url = button.data('url')
		  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
		  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
		  var modal = $(this)
		  modal.find('.modal-title').text('Update: Car №' + id)
		  modal.find('#id_car').val(id)
		  modal.find('#modal_marka').val(marka)
		  modal.find('#modal_year').val(year)
		  modal.find('#modal_transmission').val(transmission)
		  modal.find('#modal_fuel').val(fuel)
		  modal.find('#modal_price').val(price)
		  modal.find('#modal_description').val(description)
		  modal.find('#modal_url').val(url)
		})
		
		$('#insertModal').on('show.bs.modal', function (event) {
			 var button = $(event.relatedTarget) // Button that triggered the modal
			  var marka = button.data('marka')
			  var year = button.data('year')
			  var transmission = button.data('transmission')
			  var fuel = button.data('fuel')
			  var price = button.data('price')
			  var description = button.data('description')
			  var url = button.data('url')
			  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
			  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
			  var modal = $(this)
			  modal.find('.modal-title').text('Insert: New car')
			  modal.find('#modal_marka').val(marka)
			  modal.find('#modal_year').val(year)
			  modal.find('#modal_transmission').val(transmission)
			  modal.find('#modal_fuel').val(fuel)
			  modal.find('#modal_price').val(price)
			  modal.find('#modal_description').val(description)
			  modal.find('#modal_url').val(url)
		})
	</script>
  </body>

</html>
