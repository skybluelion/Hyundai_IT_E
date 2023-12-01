<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" ></script>
<script type="text/javascript">
// Assign handlers immediately after making the request,
// and remember the jqxhr object for this request
var jqxhr = $.get( "example.php", function() {
  alert( "success" );
})
  .done(function() {
    alert( "second success" );
  })
  .fail(function() {
    alert( "error" );
  })
  .always(function() {
    alert( "finished" );
  });
 
// Perform other work here ...
 
// Set another completion function for the request above
jqxhr.always(function() {
  alert( "second finished" );
});
</script>
</head>
<body>

</body>
</html>