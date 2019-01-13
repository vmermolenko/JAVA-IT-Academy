<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

 	<link rel="stylesheet" href="css/modern-business.css"  type="text/css">
    <title>Item</title>
  </head>
  <body>
  <h1>Pages</h1>
${request.param1}

<h1>${pageContext.request.contextPath}</h1>

 <!-- Navigation -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="index.jsp">Car Rental</a>
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
      <h1 class="mt-4 mb-3">Ford Fusion
      </h1>

      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="index.html">Home</a>
        </li>
        <li class="breadcrumb-item active">Portfolio Item</li>
      </ol>

      <!-- Portfolio Item Row -->
      <div class="row">

        <div class="col-md-6">
          <img class="img-fluid" src="http://777-77-77.by/cms/images/2018/11/viber-image-e1542377439385.jpg" alt="">
         
        <br/>
         <br/>
        
         <!-- Contact Form -->
	      <!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
	      <div class="row">
	        <div class="col-lg-12 mb-4">
	          <h3>Форма заказа</h3>
	          <form name="sentMessage" id="contactForm" novalidate>
	            <div class="control-group form-group">
	              <div class="controls">
	                <label for="name">ФИО:</label>
	                <input type="text" class="form-control" id="name" required data-validation-required-message="Please enter your name.">
	                <p class="help-block"></p>
	              </div>
	            </div>
	            <div class="control-group form-group">
	              <div class="controls">
	                <label>Номер телефона:</label>
	                <input type="tel" class="form-control" id="phone" required data-validation-required-message="Please enter your phone number.">
	              </div>
	            </div>
	            <div class="control-group form-group">
	              <div class="controls">
	                <label>Электронная почта:</label>
	                <input type="email" class="form-control" id="email" required data-validation-required-message="Please enter your email address.">
	              </div>
	            </div>
	            <div class="control-group form-group">
	              <div class="controls">
	                <label>Комментарии:</label>
	                <textarea rows="5" cols="100" class="form-control" id="message" required data-validation-required-message="Please enter your message" maxlength="999" style="resize:none"></textarea>
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
            <li><p>1 сутки &nbsp;<span class="life">25$/55 руб</span></p></li>

          </ul>
         
         
          <h3 class="my-3">Технические характеристики</h3>
          <ul>
            <li>Год выпуска - 2015</li>
            <li>Тип КПП: Автоматическая</li>
            <li>Тип топлива: Бензин</li>
          </ul>
          
          
          <h3 class="my-3">Описание</h3>
          <p>Автомобиль Ford Fusion второго поколения – это надежность, стиль, комфорт и впечатляющая отделка салона.

			Легкая претензия на агрессивность в облике авто удачно сочетается с ощущением солидности и стремительности.
			
			Для водителей с небогатым опытом приятным дополнением будет простота в управлении и наличие «умной» бортовой электроники, облегчающей вождение.
			
			Причин выбрать для проката Ford Fusion множество, вот лишь некоторые из них:
			
			Отличный баланс между мощностью и экономичностью;
			Идеальная управляемость;
			6-ступенчатая автоматическая трансмиссия;
			Анатомические сиденья, высокое качество материалов салона;
			Безупречные параметры активной и пассивной безопасности;
			Управление климатом, круиз-контроль;
			Просторное багажное отделение;
			Акустическая система уровня премиум.
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





