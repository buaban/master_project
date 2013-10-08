

function startRunner(doc){
	var iframeElement = doc.getElementById("doh-runner");
	var testUrl = getParameterByName("testUrl");
	iframeElement.contentWindow.location = testUrl;
	//iframeElement.reload();
	var done = isFinished(doc);
	
	if(done){
		window.console.log("Test done.");
	}
}

function isFinished(doc){
	setTimeout(function() {
		var statusElement = doc.getElementById("pausedMsg");
		if(statusElement.innerText === "Stopped"){
			return true;
		} else {
			window.console.log("Not done.");
		}
	},100);
	
	return false;	
}

function isErrorTest(){
	var errorCase = iframeElement.getElementByClass("failure")[0];
	var erroNum = errorCase.InnerText;
}

function getParameterByName(name) {
    name = name.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
	results = regex.exec(location.search);
    return results == null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
}


