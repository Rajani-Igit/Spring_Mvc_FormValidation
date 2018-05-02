<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="./scripts/test.js"></script>
</head>

<body>
  <div class="container">
  <form:form commandName="cmd">
    <div class="row">
      <div class="form-group col-xs-6">
        <div class="inner-addon left-addon">
          <i class="glyphicon glyphicon-user"></i>
          <form:input path="userId" type="text" class="form-control"  placeholder="Username" />
        </div>
      </div>
      <div class="form-group col-xs-6">
       <span style="color:red"><form:errors path="userId" /></span>
       </div>
    </div>
    
    <div class="row">
    <div class="form-group col-xs-6">
        <div class="inner-addon right-addon">
          <i class="glyphicon glyphicon-search"></i>
          <form:input path="pwd" type="text" class="form-control" placeholder="Search" />
        </div>
        <label><form:errors path="pwd" /></label>
      </div>
    </div>
    <div class="row">
    <div class="form-group col-xs-6">
    <input class="btn" type="submit" value="Submit"/>
    </div>
    </div>
</form:form>
  </div>
</body>
</html>
