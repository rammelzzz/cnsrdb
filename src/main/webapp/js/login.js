// JavaScript Document
function login() {
	var account = $("#account").val();
	var password = $("#password").val();

$.post(BASE_URL + "login", {U_ID:account, U_Password:password}, function(data) {
	console.log(data.code);
	var code = data.code;

	if (code == 1) goHome();
	else alert(data.msg);
});
// 	$.get(BASE_URL + "dologin?U_ID=" + account +"&U_Password=" + password, function(data) {
// 		console.log(data.code);
// 		var code = data.code;
//
// 		if (code == 1) goHome();
// 		else alert(data.msg);
// 	});
}