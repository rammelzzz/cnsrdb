// JavaScript Document

function changePassword(){
	
	var Old_Password = $("#Old_Password").val();
	var New_Password = $("#New_Password").val();
	var New_Password2 = $("#New_Password2").val();
	if(Old_Password == ""||New_Password == ""||New_Password2 == ""){
		alert("请输入完整信息");
	}
	else if(New_Password == New_Password2){
		$.post(BASE_URL + "changePassword", {old_password:Old_Password,new_password:New_Password}, function(data) {
			if(data.code == 1) alert(data.msg);
			else alert("修改密码失败");
		});
	}
	else{	
		alert("两次密码不相同");
	}
}