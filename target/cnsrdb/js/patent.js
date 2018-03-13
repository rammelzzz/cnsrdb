// JavaScript Document

$(document).ready(function() {
	$.post(BASE_URL + "patent", {}, function(data) {       
		for (i = 0; i < data.data.length; i++) {
			var tr = $("<tr></tr>"); 
			
			var td = $("<td></td>");
			td.text(data.data[i].p_id);
			tr.append(td);
			
			var td = $("<td></td>");
			td.text(data.data[i].p_people);
			tr.append(td);
			
			var td = $("<td></td>");
			td.text(data.data[i].p_name);
			tr.append(td);
			
			$("#table").append(tr);
		}
	});
});			