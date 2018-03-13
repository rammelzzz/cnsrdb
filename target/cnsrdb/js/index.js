// JavaScript Document

$(document).ready(function() {
	
	$.post(BASE_URL + "dynamicList", {msg_type:"通知通告"}, function(data) {
		for (i = 0; i < data.data.length; i++) {
			var a = $("<a class='list-group-item'>");
			a.text(data.data[i].d_title);
			a.attr("href", "/dynamic?id=" + data.data[i].d_id);
			$("#info1").append(a);
		}
	});
	
	$.post(BASE_URL + "dynamicList", {msg_type:"新闻动态"}, function(data) {
		for (i = 0; i < data.data.length; i++) {
			var a = $("<a class='list-group-item'>");
			a.text(data.data[i].d_title);
			a.attr("href", "/dynamic?id=" + data.data[i].d_id);
			$("#info2").append(a);
		}
	});
	
	$.post(BASE_URL + "dynamicList", {msg_type:"学术活动"}, function(data) {
		for (i = 0; i < data.data.length; i++) {
			var a = $("<a class='list-group-item'>");
			a.text(data.data[i].d_title);
			a.attr("href", "/dynamic?id=" + data.data[i].d_id);
			$("#info3").append(a);
		}
	});
});