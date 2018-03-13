// JavaScript Document

function addDynamic(){
	
	var msg_type = $("#msg_type").val();
	var title = $("#title").val();
	var msg_content = $("#msg_content").val();
	
	if(msg_type == ""|| title == ""|| msg_content == "")
		alert("请输入完整信息");
	else 
		$.post(BASE_URL + "addDynamic", {d_type:msg_type, d_title:title ,d_content:msg_content}, function(data) {
			alert(data.msg);
		});
}