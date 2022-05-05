<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products List</title>

<style type="text/css">
  button {
	cursor: pointer;
}
th, td {
  padding-top: 10px;
  padding-bottom: 20px;
  padding-left: 30px;
  padding-right: 40px;
}

</style>
</head>
<body bgcolor="cyan">

 <center>
   <h4>*** Products List ****</h4>
   
   <table border="2px solid green">
     <tr>
     
      <th>Id</th>
      <th>Name</th>
      <th>Price</th>
      <th>Quantity</th>
      <th colspan="2">Action</th>
      
     </tr>
     
     <c:forEach items="${products}" var="product">
       <tr>
       
         <td>${product.productId}</td>
         <td>${product.productName}</td>
         <td>${product.productPrice}</td>
         <td>${product.productQuantity}</td>
         <td><a href="../edit/${product.productId}"><button>Edit</button></a></td>
         <td><a href="../delete/${product.productId}"><button>Delete</button></a></td>
         
       </tr>
     </c:forEach>
   </table>
   <br><br>
   <a href="../"><button>Back TO Home Page</button></a>
 </center>

</body>
</html>