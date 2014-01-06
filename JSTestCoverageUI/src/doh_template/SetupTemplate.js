setUp: function(){
    var xmlhttp;
    xmlhttp=new XMLHttpRequest();
    xmlhttp.open("GET","http://localhost/jstestcoverage-server/test?action=test_start",false);
    xmlhttp.send();	
},