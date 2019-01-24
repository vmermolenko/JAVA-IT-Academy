<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en" >

<head>
	<meta charset="UTF-8">
	<title>Simple Payment Form use Bootstrap</title>
	  
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
	<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css'>
	<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
	<link rel="stylesheet" href="css/stylecredicard.css"> 
</head>

<body>


<div class="container">
	<div class="row">
		<!-- You can make it whatever width you want. I'm making it full width
		on <= small devices and 4/12 page width on >= medium devices -->
		<div class="col-xs-12 col-md-4">
		
			<!-- CREDIT CARD FORM STARTS HERE -->
			<div class="panel panel-default credit-card-box">
				<div class="panel-heading display-table" >
					<div class="row display-tr" >
						<h3 class="panel-title display-td" >Заказ №<c:out value="${ id_order }" /></h3>
						<div class="display-td" >                            
						<img class="img-responsive pull-right" src="http://i76.imgup.net/accepted_c22e0.png">
						</div>
					</div>                    
				</div>
			<div class="panel-body">
				<form action="" role="form" id="payment-form">
				    <input type="hidden" name="action" value="creditcard">
				    <input type="hidden" name="operation" value="pay">
	           		<input type="hidden" name="id_order" value="${id_order}">
				
					<div class="row">
						<div class="col-xs-12">
							<div class="form-group">
								<label for="cardnumber">Номер карты</label>
								<div class="input-group">
									<input 
									type="tel"
									class="form-control"
									name="cardnumber"
									placeholder="Действительный номер карты"
									autocomplete="cc-number"
									required autofocus 
									/>
									<span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
								</div>
							</div>                            
						</div>
					</div>
					<div class="row">
						<div class="col-xs-7 col-md-7">
							<div class="form-group">
								<label for="cardexpiry"><span class="hidden-xs">Дата окончания срока</span></label>
									<input 
									type="tel" 
									class="form-control" 
									name="cardexpiry"
									placeholder="MM / YY"
									autocomplete="cc-exp"
									required 
									/>
							</div>
						</div>
						<div class="col-xs-5 col-md-5 pull-right">
							<div class="form-group">
								<label for="cardcvc">CV CODE</label>
									<input 
									type="tel" 
									class="form-control"
									name="cardcvc"
									placeholder="CVC"
									autocomplete="cc-csc"
									required
									/>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-12">
							<div class="form-group">
								<label for="couponCode">Сумма к оплате</label>
								<input type="text" class="form-control" name="total" value="<c:out value="${ total }" />"/>
							</div>
						</div>                        
					</div>
					<div class="row">
						<div class="col-xs-12">
							<button class="btn btn-success btn-lg btn-block" type="submit">Оплатить</button>
						</div>
					</div>
					<div class="row" style="display:none;">
						<div class="col-xs-12">
							<p class="payment-errors"></p>
						</div>
					</div>		
					</form>
				</div>
			</div>            
			<!-- CREDIT CARD FORM ENDS HERE -->
		</div>
	</div>
</div>


<!-- If you're using Stripe for payments -->
<script type="text/javascript" src="https://js.stripe.com/v2/"></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js'></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery.payment/1.2.3/jquery.payment.min.js'></script>
<script  src="js/credicard.js"></script>


</body>

</html>
