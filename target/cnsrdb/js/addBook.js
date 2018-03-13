// JavaScript Document
function add(){
	
	var book_no = $("#book_no").val();
	var book_name = $("#book_name").val();
	var book_author = $("#book_author").val();
	var book_publish_year= $("#book_publish_year").val();

	console.log(book_no);

	console.log("开始调用post方法");

	$.post(BASE_URL + "addBook", {book_no:book_no,book_name:book_name,book_author:book_author,book_publish_year:book_publish_year}, function(data) {
		alert(data.msg);
	});
}