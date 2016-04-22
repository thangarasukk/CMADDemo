<html>

<head>
	<script src = "scripts/jquery-2.1.3.js"> </script>
	<script>
	$.get("rest/user", function(data){
			var rowTemplate = $("#usertemplates table").html();
			console.log(rowTemplate);
			for(index in data){
				var row = rowTemplate.replace("User_id",data[index].user_id)
							.replace("Name",data[index].username)
							.replace("password",data[index].password);
				$("#Userdata").append(row);
			}
		});

	$.get("rest/blog", function(data){
			var rowTemplate2 = $("#blogtemplates table").html();
			console.log(rowTemplate2);
			for(index in data){
				var row = rowTemplate2.replace("Blog_id",data[index].blog_id)
							.replace("User_id",data[index].user_id)
							.replace("title",data[index].title)
							.replace("data",data[index].data);
				$("#Blogdata").append(row);
			}
		});
	</script>
</head>

<body>
	<div id="usertemplates" style="display: none;">
		<table>
			<tr><td>User_id</td><td>Name</td><td>password</td></tr>
		</table>
	</div>
	
	<div id="blogtemplates" style="display: none;" >
		<table>
			<tr><td>Blog_id</td><td>User_id</td><td>title</td><td>data</td></tr>
		</table>
	</div>
	
	<h2>User data</h2>
	<table id="Userdata"  border="1">
		<tr><td>User_id</td><td>Name</td><td>password</td></tr>
	</table>

	<br><h2>Blog data</h2>
	<table id="Blogdata" border="1">
		<tr><td>Blog_id</td><td>User_id</td><td>title</td><td>data</td></tr>
	</table>

</body>
</html>
