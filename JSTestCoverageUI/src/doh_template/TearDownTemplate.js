,
tearDown: function(){
    var xmlhttp;
    xmlhttp=new XMLHttpRequest();
    xmlhttp.open("GET","http://localhost/jstestcoverage-server/test?action=test_end",false);
    xmlhttp.send();
}