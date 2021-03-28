
<%@page import="com.map.SetValue"%>
<%@page import="com.map.FetchValue"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% SetValue.DpFunction(); %>
<button onclick="initMap()">View users</button>
<div id="map"></div>
	<style>
  #map {
    height: 100%;
  }
  html, body {
    height: 100%;
    margin: 0;
    padding: 0;
  }
</style>
<script
    src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
<script>

//onclick="initMap()"
//map center
function initMap() {
  map = new google.maps.Map(document.getElementById("map"), {
    center: { lat: 10.963784, lng: 76.9434811 },
    zoom: 10,
  });
  

  <% for(int i = 0; i < 3; i+=1) { %>
	  var x =<%= FetchValue.getXvalue() %>;
	  var y =<%=FetchValue.getYvalue()%>;
	 var marker = new google.maps.Marker({
	  	position:{lat:x,lng:y},
	  	map:map,
	  	});
  
	  <%}  %>
}
</script>
</body>
</html>