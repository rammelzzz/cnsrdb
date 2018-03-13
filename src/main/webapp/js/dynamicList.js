// JavaScript Document

function dynamicList(){
	
	var D_Type = $('input:radio[name="D_Type"]:checked').val();
	
	if(D_Type == undefined) alert("请选择动态信息类型");
	else{
	$.post(BASE_URL + "dynamicList", {msg_type:D_Type}, function(data) {
		
		$("tr:not(:first)").empty("");
				
		if(data.code == 1){
			
			for (i = 0; i < data.data.length; i++) {
			var tr = $("<tr></tr>"); 
			
			var td = $("<td></td>");
			td.text(data.data[i].d_id);
			tr.append(td);
			
			var td = $("<td></td>");
			td.text(data.data[i].d_title);
			tr.append(td);
			
			var td = $("<td></td>");
			td.text(data.data[i].d_type);
			tr.append(td);
									
			$("#table").append(tr);
			}	
		}
		else alert(data.msg);
				
	});
	}
}