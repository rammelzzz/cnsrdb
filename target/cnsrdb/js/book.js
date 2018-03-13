// JavaScript Document

function book(){
	
	var B_Name = $("#B_Name").val();
	var B_Author = $("#B_Author").val();
	
	$.post(BASE_URL + "book", {b_name:B_Name,b_author:B_Author}, function(data) {
		
		$("tr:not(:first)").empty("");

		if(data.code == 1){
			
			for (i = 0; i < data.data.length; i++) {
				console.log("第" + i + "条数据为：" + data.data[i]);
			var tr = $("<tr></tr>"); 
			
			var td = $("<td></td>");
			td.text(data.data[i].b_id);
			tr.append(td);
			
			var td = $("<td></td>");
			td.text(data.data[i].b_name);
			tr.append(td);
			
			var td = $("<td></td>");
			td.text(data.data[i].b_author);
			tr.append(td);
			
			var td = $("<td></td>");
			td.text(data.data[i].b_publicYear);
			tr.append(td);
			
			var td = $("<td></td>");
			td.text(data.data[i].b_in);
			if(data.data[i].b_in == "1") td.text("可借");
			else td.text("已借出");
			tr.append(td);						
									
			$("#table").append(tr);
			}	
		}
		else alert(data.msg);
				
	});
}