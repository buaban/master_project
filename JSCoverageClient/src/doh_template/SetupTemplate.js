setUp: function(){
    var xmlhttp;
    xmlhttp=new XMLHttpRequest();
    xmlhttp.open("GET","http://localhost/jstestcoverage-server/test?action=test_start&testId=[TEST_ID]&funcName=[FUNCTION_NAME]&iteration=[ITERATION]",false);
    xmlhttp.send();	
},