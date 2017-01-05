function testServlet() {
	var req = new XMLHttpRequest();
	req.onreadystatechange = function() {
		if(req.readyState == 4 && req.status == 200) {
			$("#response").html(req.responseText);
		}
	}
	req.open("GET", "SampleServlet", true);
	req.send()
}