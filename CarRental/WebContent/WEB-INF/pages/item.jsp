<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

 	<link rel="stylesheet" href="css/modern-business.css"  type="text/css">
    <title>Item</title>
  </head>
  <body>

 <!-- Navigation -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="index.jsp">Прокат автомобилей</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="about.html">About</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="services.html">Services</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="contact.html">Contact</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Portfolio
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
                <a class="dropdown-item" href="portfolio-1-col.html">1 Column Portfolio</a>
                <a class="dropdown-item" href="portfolio-2-col.html">2 Column Portfolio</a>
                <a class="dropdown-item" href="portfolio-3-col.html">3 Column Portfolio</a>
                <a class="dropdown-item" href="portfolio-4-col.html">4 Column Portfolio</a>
                <a class="dropdown-item" href="portfolio-item.html">Single Portfolio Item</a>
              </div>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Blog
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
                <a class="dropdown-item" href="blog-home-1.html">Blog Home 1</a>
                <a class="dropdown-item" href="blog-home-2.html">Blog Home 2</a>
                <a class="dropdown-item" href="blog-post.html">Blog Post</a>
              </div>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Other Pages
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
                <a class="dropdown-item" href="full-width.html">Full Width Page</a>
                <a class="dropdown-item" href="sidebar.html">Sidebar Page</a>
                <a class="dropdown-item" href="faq.html">FAQ</a>
                <a class="dropdown-item" href="404.html">404</a>
                <a class="dropdown-item" href="pricing.html">Pricing Table</a>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </nav>


    <!-- Page Content -->
    <div class="container">

      <!-- Page Heading/Breadcrumbs -->
      <h1 class="mt-4 mb-3">${item.marka}
      </h1>

      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="index.jsp">Главная</a>
        </li>
        <li class="breadcrumb-item active">${item.marka}</li>
      </ol>

      <!-- Portfolio Item Row -->
      <div class="row">

        <div class="col-md-6">
          <img class="img-fluid" src="${item.url}" alt="">
         
        <br/>
         <br/>
        
         <!-- Contact Form -->
	      <!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
	      <div class="row">
	        <div class="col-lg-12 mb-4">
	          <h3>Форма заказа</h3>
	          <form name="sentMessage" id="contactForm" action = "MainServlet" method = "POST">
	           <input type="hidden" name="action" value="setorder">
	           <input type="hidden" name="id_car" value="${item.id}">
	           <div class="control-group form-group">
	              <div class="controls">
	                <label>Количество дней аренды:</label>
	                
					<select class="custom-select" name="day" id="day"  aria-label="Example select with button addon">
					  <option value="1">1 Сутки</option>
					  <option value="2">2 Суток</option>
					  <option value="3">3 Суток</option>
					  <option value="4">4 Суток</option>
					  <option value="5">5 Суток</option>
					  <option value="6">6 Суток</option>
					  <option value="7">7 Суток</option>
					  <option value="8">8 Суток</option>
					  <option value="9">9 Суток</option>
					  <option value="10">10 Суток</option>
					</select>
	                  
	                <!-- input type="tel" class="form-control" name="day" id="day" required data-validation-required-message="Please enter count day" -->
	              </div>
	            </div>
	            <div class="control-group form-group">
	              <div class="controls">
	                <label for="name">ФИО:</label>
	                <input type="text" class="form-control" name="fio" id="fio" required data-validation-required-message="Please enter your name.">
	                <p class="help-block"></p>
	              </div>
	            </div>
	            <div class="control-group form-group">
	              <div class="controls">
	                <label>Серия и номер паспорта:</label>
	                <input type="text" class="form-control" name="passport" id="passport" required data-validation-required-message="Please enter your passport.">
	              </div>
	            </div>
	            <div class="control-group form-group">
	              <div class="controls">
	                <label>Номер телефона:</label>
	                <input type="tel" class="form-control" name="phone" id="phone" required data-validation-required-message="Please enter your phone number.">
	              </div>
	            </div>
	            <div class="control-group form-group">
	              <div class="controls">
	                <label>Электронная почта:</label>
	                <input type="email" class="form-control" name="email" id="email" required data-validation-required-message="Please enter your email address.">
	              </div>
	            </div>
	            <div class="control-group form-group">
	              <div class="controls">
	                <label>Создайте пароль :</label>
	                <input type="password" class="form-control" name="password" id="password" required data-validation-required-message="Please enter your email address.">
	              </div>
	            </div>
	            <div class="control-group form-group">
	              <div class="controls">
	                <label>Комментарии:</label>
	                <textarea rows="5" cols="100" class="form-control" name="comments" id="comments" required data-validation-required-message="Please enter your message" maxlength="999" style="resize:none"></textarea>
	              </div>
	            </div>
	            <div id="success"></div>
	            <!-- For success/fail messages -->
	            <button type="submit" class="btn btn-primary" id="sendMessageButton">Заказать</button>
	          </form>
	        </div>
	
	      </div>
	      <!-- /.row -->
        
        </div>

        <div class="col-md-6">
         
          <h3 class="my-3">Цена</h3>
          <ul>
            <li><p>1 сутки &nbsp;<span class="life">${item.price}$/${item.price*2} руб</span></p></li>

          </ul>
         
         
          <h3 class="my-3">Технические характеристики</h3>
          <ul>
            <li>Год выпуска - ${item.year}</li>
            <li>Тип КПП: ${item.transmission}</li>
            <li>Тип топлива: ${item.fuel}</li>
          </ul>
          
          
          <h3 class="my-3">Описание</h3>
          <p>${item.description}
			</p>
        </div>
        

      </div>
      <!-- /.row -->

      <!-- Related Projects Row -->
      <h3 class="my-4">Рекомендованные автомобили </h3>

      <div class="row">

        <div class="col-md-3 col-sm-6 mb-4">
          <a href="#">
            <img class="img-fluid" src="http://placehold.it/500x300" alt="">
          </a>
        </div>

        <div class="col-md-3 col-sm-6 mb-4">
          <a href="#">
            <img class="img-fluid" src="http://placehold.it/500x300" alt="">
          </a>
        </div>

        <div class="col-md-3 col-sm-6 mb-4">
          <a href="#">
            <img class="img-fluid" src="http://placehold.it/500x300" alt="">
          </a>
        </div>

        <div class="col-md-3 col-sm-6 mb-4">
          <a href="#">
            <img class="img-fluid" src="http://placehold.it/500x300" alt="">
          </a>
        </div>

      </div>
      <!-- /.row -->

    </div>
    <!-- /.container -->

    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2018</p>
      </div>
      <!-- /.container -->
    </footer>


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.bundle.js" crossorigin="anonymous"></script>
 
 
  </body>
</html>





