// JavaScript Document

$(document).ready(function() {
	var id = $_GET["id"];

	$.post(BASE_URL + "dynamic", {id : id}, function(data) {
		console.log(data);
		$("#title").append(data.data.d_title);
		$("#content").append(data.data.d_content);
	});

	// $.ajax({
	// 	type:"POST",
	// 	url:BASE_URL + "dynamic",
	// 	data:{id:id},
	// 	success:function(data) {
	// 		console.log(data);
	// 		var data = JSON.parse(data);
	// 		console.log(data);
	// 		$("#title").append(data.data.d_title);
	// 		$("#content").append(data.data.d_content);
	// 	},
	// 	error:function(){
	// 		alert("error !");
	// 	}
	// });
});