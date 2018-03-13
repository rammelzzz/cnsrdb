// JavaScript Document

var TYPE = new Array("在读学生","毕业学生");
var NOW = new Array("学号","姓名","性别","类别","国籍","导师");
var GRA = new Array("学号","姓名","性别","类别","入学时间","毕业时间","初次就业单位");

$(document).ready(function() {
	var type = $_GET["t"];
	$("title").text(TYPE[type]);
	$("#title").text(TYPE[type]);
	$("#active").text(TYPE[type]);

	var div = document.getElementById('student'+ type);
	div.className = 'active';

	if (type == 0) {
		for (i = 0; i < NOW.length; i++) {
			var th = $("<th>" + NOW[i] + "</th>");
			$("#thead").append(th);
		}
	}
	
	else if (type == 1) {
		for (i = 0; i < GRA.length; i++) {
			var th = $("<th>" + GRA[i] + "</th>");
			$("#thead").append(th);
		}
	}
	
	$.post(BASE_URL + "student", {type:type}, function(data) {
		for (i = 0; i < data.data.length; i++) {
			var tr = $("<tr></tr>"); 
			
			var td = $("<td></td>");
			if(data.data[i].s_id == null || data.data[i].s_id == "") {
				td.text("无");
			}
			 else td.text(data.data[i].s_id);
			tr.append(td);
			
			var td = $("<td></td>");
			if(data.data[i].s_chineseName == null || data.data[i].s_chineseName == "")
			{
				td.text("无");
			}
			else td.text(data.data[i].s_chineseName);
			tr.append(td);
			
			var td = $("<td></td>");
			if(data.data[i].s_gender == null || data.data[i].s_gender == "") {
				td.text("无");
			}
			else td.text(data.data[i].s_gender);
			tr.append(td);
				
			var td = $("<td></td>");
			if(data.data[i].s_type == null || data.data[i].s_type == "") {
				td.text("无");
			}
			else td.text(data.data[i].s_type);
			tr.append(td);
			
			if (type == 0) {
				var td = $("<td></td>");
				if(data.data[i].s_country == null || data.data[i].s_country == "") {
					td.text("无");
				}
				else td.text(data.data[i].s_country);
				tr.append(td);
				
				var td = $("<td></td>");
				if(data.data[i].s_tuto == null || data.data[i].s_tuto == "") {
					td.text("无");
				}
				else td.text(data.data[i].s_tutor);
				tr.append(td);
			}
			
			else if (type == 1) {
				var td = $("<td></td>");
				if(data.data[i].s_enrollTime == null || data.data[i].s_enrollTime == "") {
					td.text("无");
				}
				else td.text(data.data[i].s_enrollTime);
				tr.append(td);
				
				var td = $("<td></td>");
				if(data.data[i].s_graduateTime == null || data.data[i].s_graduateTime == "") {
					td.text("无");
				}
				else td.text(data.data[i].s_graduateTime);
				tr.append(td);
				
				var td = $("<td></td>");
				if(data.data[i].s_firseWorkPlace == null || data.data[i].s_firseWorkPlace == "") {
					td.text("无");
				}
				else td.text(data.data[i].s_firseWorkPlace);
				tr.append(td);
			}
			
			$("#table").append(tr);
		}
	});
});