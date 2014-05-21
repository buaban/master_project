,
tearDown: function(){
    var xmlhttp;
    xmlhttp=new XMLHttpRequest();
    xmlhttp.open("GET","http://localhost/jstestcoverage-server/test?action=test_end&testId=[TEST_ID]&funcName=[FUNCTION_NAME]&iteration=[ITERATION]",false);
    xmlhttp.send();
}