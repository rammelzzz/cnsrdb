// JavaScript Document

var BASE_URL = "http://localhost:8888/";

var U_ID;
var U_ChName;
var U_Type;

$.post = function(a, b, c) {
	$.ajax({
		url: a,
		type: 'post',
		data: typeof(b) == 'object' ? b : {},
		dataType: 'json',
		cache: false,
		traditional: true,
		success: typeof(b) == 'function' ? b :
				typeof(c) == 'function' ? c : function() {}
	});
};

$_GET = (function(){
    var url = window.document.location.href.toString();
    var u = url.split("?");
    if(typeof(u[1]) == "string"){
        u = u[1].split("&");
        var get = {};
        for(var i in u){
            var j = u[i].split("=");
            get[j[0]] = j[1];
        }
        return get;
    } else {
        return {};
    }
})();

$(document).ready(function() {
	$("#header").load("header.html");
	$("#menu").load("menu.html");
	$("#footer").load("footer.html");
	
	$.post(BASE_URL + "session", {}, function(data) {
		var code = data.code;
		// console.log(code);
		// console.log(data);
		
		if (code == 1) {
			U_ID = data.data.u_id;
			U_ChName = data.data.u_name;
			U_Type = data.data.u_type;
			$("#logout h5").text(U_ChName);
			
			$("#login").css("display", "none");
			$("#logout").css("display", "block");
			$(".hidden_menu").css("visibility","hidden")
			if(U_Type != "系统管理员"){
				$("#manager_menu").css("visibility","hidden")
			}
		}
		
		else if (code == 0) {
			$("#login").css("display", "block");
			$("#logout").css("display", "none");
			$(".hidden_menu").css("visibility","hidden")
		}
	});
});

function goHome() {
	window.location.href = "index.html";
}

function goLogin() {
	window.location.href = "/html/login.html";
}

function goLogout() {
	$.post(BASE_URL + "logout", {}, function(data) {
		goLogin();
	});
}