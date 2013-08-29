if (typeof _yuitest_coverage == "undefined"){
    _yuitest_coverage = {};
    _yuitest_coverline = function(src, line){
        var coverage = _yuitest_coverage[src];
        if (!coverage.lines[line]){
            coverage.calledLines++;
        }
        coverage.lines[line]++;
    };
    _yuitest_coverfunc = function(src, objectName, name, line, params){
        var coverage = _yuitest_coverage[src],
            funcId = name + ":" + line;
        if (!coverage.functions[funcId]){
            coverage.calledFunctions++;
        }
        coverage.functions[funcId]++;
    };
}
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp"] = {
    lines: {},
    functions: {},
    coveredLines: 0,
    calledLines: 0,
    coveredFunctions: 0,
    calledFunctions: 0,
    path: "D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\input\\input.js.tmp",
    code: []
};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp"].code=["dojo.provide(\"space.commonUtils\");","","dojo.require(\"rts.core.URLParser\");","dojo.require(\"rts.ccf.ccfcomponent2\");","","space.widgets = {","	testFunc: function(node){","		var y = x;","		x = y;","		y++;","		return y;","	}","}","","space.commonUtils = {","    /*float*/dojoVersionNum: function () {","        return parseFloat(dojo.version.major + \".\" + dojo.version.minor);","    },","","    /*float*/isNewDojo: function () {","        return this.dojoVersionNum() >= 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler","    },","","    /*float*/isOldDojo: function () {","        return this.dojoVersionNum() < 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler","    },","","    replaceEmptyNode: function (node) {","        if (node.nodeType == 3)","            return;","        if ((node.nodeName == \"DIV\" ||","			node.nodeName == \"P\" ||","			node.nodeName == \"<H1>\" ||","			node.nodeName == \"<H2>\" ||","			node.nodeName == \"<H3>\" ||","			node.nodeName == \"<H4>\" ||","			node.nodeName == \"<H5>\" ||","			node.nodeName == \"<H6>\" ||","			node.nodeName == \"B\" ||","			node.nodeName == \"I\" ||","			node.nodeName == \"U\" ||","			node.nodeName == \"PRE\") &&","			node.innerHTML === \"\")//empty","        {","            // Set node.innerHTMLevery to empty string in order to display break-lines correctly.","            node.innerHTML = \"\";","            return;","        }","        if (!node.childNodes)","            return;","        for (var i = 0; i < node.childNodes.length; i++) {","            this.replaceEmptyNode(node.childNodes[i]);","        }","    },","","    /*HTML-encoded string*/htmlEncode: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        var div = document.createElement('div');","        if (div.innerText != undefined) div.innerText = str;","        else div.textContent = str;","        return div.innerHTML;","    },","","    /*HTML-encoded string*/htmlEncodeForHTTPSubmitting: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        var div = document.createElement('div');","        if (div.innerText != undefined) div.innerText = str;","        else div.textContent = str;","        return div.innerHTML.replace(new RegExp(\"<br>\", \"gi\"), \"\\n\");  //htmlEncode and still add <BR>","    },","","    /*HTML-decoded string*/htmlDecode: function (/*string*/str) {","        if (!str || !dojo.isString(str)) return \"\";","        var encodedString = str.replace(/</gi, \"&lt;\");","        encodedString = encodedString.replace(/>/gi, \"&gt;\");","        var htmlNode = document.createElement(\"div\");","        htmlNode.innerHTML = encodedString;","        if (htmlNode.innerText)","            return htmlNode.innerText; // IE","        return htmlNode.textContent; // FF","    },","","    /*XML-encoded string*/xmlEncode: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        return com.reuters.rts.escapeString(str);","    },","","    /*XML-decoded string*/xmlDecode: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        return com.reuters.rts.unescapeString(str);","    },","","    /*string*/breakWords: function (/*string*/str, /*uint*/maxWordLength, /*string*/delimeter) {","        if (str == \"\" || str == null) return \"\";","","        var regex = new RegExp(\"\\\\b\\\\S{\" + maxWordLength + \",}\\\\b\", \"g\");","        var insert = function (word) {","            var ret = new Array();","            for (var i = 0; i < word.length; i += maxWordLength) {","                ret.push(word.substr(i, maxWordLength));","            }","            return ret.join(delimeter);","        };","        return str.replace(regex, insert);","    },","","    getQueryStringParameter: function (/*string*/queryString, /*string*/paramName) {","        /*Summary: Get the specified parameter value from the page's query-string*/","        paramName = paramName.replace(/[\\[]/, \"\\\\\\[\").replace(/[\\]]/, \"\\\\\\]\");","        var regexS = \"[\\\\?&]\" + paramName + \"=([^&#]*)\";","        var regex = new RegExp(regexS);","        var results = regex.exec(queryString);","        if (results == null) {","            return \"\";","        }","        else {","            return results[1];","        }","    },","","	/*string*/addParamsToURL: function(/*string*/url, /*string*/params) {","		return url.match(/[?]/g) ? url + params : url + \"?\" + params;","	},","","    captureInput: function () {","        space.commonUtils._setInputOwner(true);","    },","","    releaseInput: function () {","        space.commonUtils._setInputOwner(false);","    },","","    _setInputOwner: function (/*bool*/value) {","        var ccf = com.reuters.rts.getCCFComponent();","        if (ccf) {","            ccf._inputCapture = !!value;","            console.log(\"_setInputOwner: \", value);","            //if(!value)alert(value);","        }","    },","","    open: function (/*string*/url, target) {","        var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);","        if (!target)","            target = \"_top\";","        if (dojo.global && dojo.global.event && dojo.global.event.shiftKey) //Ctrl + Click is handled automatically, but not Shift+Click","            target = \"_blank\";","        window.open(absUrl, target).focus();","    },","","    openWindow: function (/*string*/url) {","        var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);","","        var ccf = com.reuters.rts.getCCFComponent();","        if (ccf) {","            if (ccf.sendEventToContainer(\"onNavigate\", \"<Navigation url=\\\"\" + space.commonUtils.xmlEncode(absUrl) + \"\\\" target=\\\"tab\\\"></Navigation>\")) {","                return;","            }","        }","","        window.open(absUrl, \"_blank\").focus();","    },","","    /*string*/trim: function (/*string*/str, /*string*/chars) {","        /* Summary: Removes all leading and trailing occurrences of a set of characters","        * specified in 'chars' arg from the 'str' arg","        */","        chars = chars || \"\\\\s\";","        return str.replace(new RegExp(\"[\" + chars + \"]+$\", \"g\"), \"\").replace(new RegExp(\"^[\" + chars + \"]+\", \"g\"), \"\");","    },","","    show: function (domNode) {","        if (domNode && dojo.style(domNode, \"display\"))","            dojo.style(domNode, \"display\", \"\");","    },","","    hide: function (domNode) {","        if (domNode && dojo.style(domNode, \"display\"))","            dojo.style(domNode, \"display\", \"none\");","    },","","    toggle: function (domNode) {","        if (domNode && dojo.style(domNode, \"display\"))","            dojo.style(domNode, \"display\") == \"none\" ? dojo.style(domNode, \"display\", \"\") : dojo.style(domNode, \"display\", \"none\");","    },","","    normaliseNewlines: function (str) {","        return (dojo.isString(str)) ? str.replace(/\\u000d[\\u000a\\u0085]|[\\u0085\\u2028\\u000d\\u000a]/g, '\\u000a') : str;","    },","","    generateGuid: function () {","        var S4 = function () {","            return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);","        };","        return (S4() + S4() + \"-\" + S4() + \"-\" + S4() + \"-\" + S4() + \"-\" + S4() + S4() + S4());","    },","","    addCommas: function (nStr) {","		//addCommas: function () {","        nStr += '';","        x = nStr.split('.');","        x1 = x[0];","        x2 = x.length > 1 ? '.' + x[1] : '';","        var rgx = /(\\d+)(\\d{3})/;","        while (rgx.test(x1)) {","            x1 = x1.replace(rgx, '$1' + ',' + '$2');","        }","        return x1 + x2;","    }","};"];
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp"].lines = {"1":0,"3":0,"4":0,"6":0,"8":0,"9":0,"10":0,"11":0,"15":0,"17":0,"21":0,"25":0,"29":0,"30":0,"31":0,"46":0,"47":0,"49":0,"50":0,"51":0,"52":0,"57":0,"57":0,"58":0,"59":0,"59":0,"60":0,"61":0,"65":0,"65":0,"66":0,"67":0,"67":0,"68":0,"69":0,"73":0,"73":0,"74":0,"75":0,"76":0,"77":0,"78":0,"79":0,"80":0,"84":0,"84":0,"85":0,"89":0,"89":0,"90":0,"94":0,"94":0,"96":0,"97":0,"98":0,"99":0,"100":0,"102":0,"104":0,"109":0,"110":0,"111":0,"112":0,"113":0,"114":0,"117":0,"122":0,"126":0,"130":0,"134":0,"135":0,"136":0,"137":0,"143":0,"144":0,"145":0,"146":0,"147":0,"148":0,"152":0,"154":0,"155":0,"156":0,"157":0,"161":0,"168":0,"169":0,"173":0,"174":0,"178":0,"179":0,"183":0,"184":0,"188":0,"192":0,"193":0,"195":0,"200":0,"201":0,"202":0,"203":0,"204":0,"205":0,"206":0,"208":0,"210":0};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp"].functions = {"testFunc:7":0,"dojoVersionNum:16":0,"isNewDojo:20":0,"isOldDojo:24":0,"replaceEmptyNode:28":0,"htmlEncode:56":0,"htmlEncodeForHTTPSubmitting:64":0,"htmlDecode:72":0,"xmlEncode:83":0,"xmlDecode:88":0,"insert:97":0,"breakWords:93":0,"getQueryStringParameter:107":0,"addParamsToURL:121":0,"captureInput:125":0,"releaseInput:129":0,"_setInputOwner:133":0,"open:142":0,"openWindow:151":0,"trim:164":0,"show:172":0,"hide:177":0,"toggle:182":0,"normaliseNewlines:187":0,"S4:192":0,"generateGuid:191":0,"addCommas:198":0};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp"].coveredLines = 106;
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp"].coveredFunctions = 27;
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 1); 
dojo.provide("space.commonUtils");

_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 3); 
dojo.require("rts.core.URLParser");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 4); 
dojo.require("rts.ccf.ccfcomponent2");

_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 6); 
space.widgets = {
	testFunc: function(node){
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.widgets", "testFunc","8:15", "node:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 8); 
var y = x;
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 9); 
x = y;
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 10); 
y++;
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 11); 
return y;
	}
}

_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 15); 
space.commonUtils = {
    /*float*/dojoVersionNum: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "dojoVersionNum","17:17", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 17); 
return parseFloat(dojo.version.major + "." + dojo.version.minor);
    },

    /*float*/isNewDojo: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "isNewDojo","21:21", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 21); 
return this.dojoVersionNum() >= 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler
    },

    /*float*/isOldDojo: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "isOldDojo","25:25", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 25); 
return this.dojoVersionNum() < 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler
    },

    replaceEmptyNode: function (node) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "replaceEmptyNode","29:52", "node:Number");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 29); 
if (node.nodeType == 3)
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 30); 
return;}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 31); 
if ((node.nodeName == "DIV" ||
			node.nodeName == "P" ||
			node.nodeName == "<H1>" ||
			node.nodeName == "<H2>" ||
			node.nodeName == "<H3>" ||
			node.nodeName == "<H4>" ||
			node.nodeName == "<H5>" ||
			node.nodeName == "<H6>" ||
			node.nodeName == "B" ||
			node.nodeName == "I" ||
			node.nodeName == "U" ||
			node.nodeName == "PRE") &&
			node.innerHTML === "")//empty
        {
            // Set node.innerHTMLevery to empty string in order to display break-lines correctly.
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 46); 
node.innerHTML = "";
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 47); 
return;
        }
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 49); 
if (!node.childNodes)
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 50); 
return;}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 51); 
for (var i = 0; i < node.childNodes.length; i++) {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 52); 
this.replaceEmptyNode(node.childNodes[i]);
        }
    },

    /*HTML-encoded string*/htmlEncode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "htmlEncode","57:61", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 57); 
if (str == "" || str == null) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 57); 
return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 58); 
var div = document.createElement('div');
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 59); 
if (div.innerText != undefined) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 59); 
div.innerText = str;}
        else {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 60); 
div.textContent = str;}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 61); 
return div.innerHTML;
    },

    /*HTML-encoded string*/htmlEncodeForHTTPSubmitting: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "htmlEncodeForHTTPSubmitting","65:69", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 65); 
if (str == "" || str == null) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 65); 
return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 66); 
var div = document.createElement('div');
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 67); 
if (div.innerText != undefined) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 67); 
div.innerText = str;}
        else {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 68); 
div.textContent = str;}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 69); 
return div.innerHTML.replace(new RegExp("<br>", "gi"), "\n");  //htmlEncode and still add <BR>
    },

    /*HTML-decoded string*/htmlDecode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "htmlDecode","73:80", "str:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 73); 
if (!str || !dojo.isString(str)) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 73); 
return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 74); 
var encodedString = str.replace(/</gi, "&lt;");
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 75); 
encodedString = encodedString.replace(/>/gi, "&gt;");
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 76); 
var htmlNode = document.createElement("div");
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 77); 
htmlNode.innerHTML = encodedString;
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 78); 
if (htmlNode.innerText)
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 79); 
return htmlNode.innerText;} // IE
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 80); 
return htmlNode.textContent; // FF
    },

    /*XML-encoded string*/xmlEncode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "xmlEncode","84:85", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 84); 
if (str == "" || str == null) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 84); 
return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 85); 
return com.reuters.rts.escapeString(str);
    },

    /*XML-decoded string*/xmlDecode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "xmlDecode","89:90", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 89); 
if (str == "" || str == null) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 89); 
return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 90); 
return com.reuters.rts.unescapeString(str);
    },

    /*string*/breakWords: function (/*string*/str, /*uint*/maxWordLength, /*string*/delimeter) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "breakWords","94:97", "str:String|maxWordLength:Number|delimeter:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 94); 
if (str == "" || str == null) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 94); 
return "";}

        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 96); 
var regex = new RegExp("\\b\\S{" + maxWordLength + ",}\\b", "g");
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 97); 
var insert = function (word) {
            _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "insert","98:104", "word:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 98); 
var ret = new Array();
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 99); 
for (var i = 0; i < word.length; i += maxWordLength) {
                _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 100); 
ret.push(word.substr(i, maxWordLength));
            }
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 102); 
return ret.join(delimeter);
        };
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 104); 
return str.replace(regex, insert);
    },

    getQueryStringParameter: function (/*string*/queryString, /*string*/paramName) {
        /*Summary: Get the specified parameter value from the page's query-string*/
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "getQueryStringParameter","109:117", "queryString:String|paramName:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 109); 
paramName = paramName.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 110); 
var regexS = "[\\?&]" + paramName + "=([^&#]*)";
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 111); 
var regex = new RegExp(regexS);
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 112); 
var results = regex.exec(queryString);
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 113); 
if (results == null) {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 114); 
return "";
        }
        else {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 117); 
return results[1];
        }
    },

	/*string*/addParamsToURL: function(/*string*/url, /*string*/params) {
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "addParamsToURL","122:122", "url:String|params:Number");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 122); 
return url.match(/[?]/g) ? url + params : url + "?" + params;
	},

    captureInput: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "captureInput","126:126", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 126); 
space.commonUtils._setInputOwner(true);
    },

    releaseInput: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "releaseInput","130:130", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 130); 
space.commonUtils._setInputOwner(false);
    },

    _setInputOwner: function (/*bool*/value) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "_setInputOwner","134:137", "value:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 134); 
var ccf = com.reuters.rts.getCCFComponent();
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 135); 
if (ccf) {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 136); 
ccf._inputCapture = !!value;
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 137); 
console.log("_setInputOwner: ", value);
            //if(!value)alert(value);
        }
    },

    open: function (/*string*/url, target) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "open","143:148", "url:null|target:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 143); 
var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 144); 
if (!target)
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 145); 
target = "_top";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 146); 
if (dojo.global && dojo.global.event && dojo.global.event.shiftKey) //Ctrl + Click is handled automatically, but not Shift+Click
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 147); 
target = "_blank";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 148); 
window.open(absUrl, target).focus();
    },

    openWindow: function (/*string*/url) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "openWindow","152:161", "url:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 152); 
var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);

        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 154); 
var ccf = com.reuters.rts.getCCFComponent();
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 155); 
if (ccf) {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 156); 
if (ccf.sendEventToContainer("onNavigate", "<Navigation url=\"" + space.commonUtils.xmlEncode(absUrl) + "\" target=\"tab\"></Navigation>")) {
                _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 157); 
return;
            }
        }

        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 161); 
window.open(absUrl, "_blank").focus();
    },

    /*string*/trim: function (/*string*/str, /*string*/chars) {
        /* Summary: Removes all leading and trailing occurrences of a set of characters
        * specified in 'chars' arg from the 'str' arg
        */
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "trim","168:169", "str:String|chars:Number");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 168); 
chars = chars || "\\s";
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 169); 
return str.replace(new RegExp("[" + chars + "]+$", "g"), "").replace(new RegExp("^[" + chars + "]+", "g"), "");
    },

    show: function (domNode) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "show","173:174", "domNode:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 173); 
if (domNode && dojo.style(domNode, "display"))
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 174); 
dojo.style(domNode, "display", "");}
    },

    hide: function (domNode) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "hide","178:179", "domNode:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 178); 
if (domNode && dojo.style(domNode, "display"))
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 179); 
dojo.style(domNode, "display", "none");}
    },

    toggle: function (domNode) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "toggle","183:184", "domNode:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 183); 
if (domNode && dojo.style(domNode, "display"))
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 184); 
dojo.style(domNode, "display") == "none" ? dojo.style(domNode, "display", "") : dojo.style(domNode, "display", "none");}
    },

    normaliseNewlines: function (str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "normaliseNewlines","188:188", "str:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 188); 
return (dojo.isString(str)) ? str.replace(/\u000d[\u000a\u0085]|[\u0085\u2028\u000d\u000a]/g, '\u000a') : str;
    },

    generateGuid: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "generateGuid","192:192", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 192); 
var S4 = function () {
            _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "S4","193:195", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 193); 
return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
        };
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 195); 
return (S4() + S4() + "-" + S4() + "-" + S4() + "-" + S4() + "-" + S4() + S4() + S4());
    },

    addCommas: function (nStr) {
		//addCommas: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp","space.commonUtils", "addCommas","200:210", "nStr:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 200); 
nStr += '';
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 201); 
x = nStr.split('.');
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 202); 
x1 = x[0];
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 203); 
x2 = x.length > 1 ? '.' + x[1] : '';
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 204); 
var rgx = /(\d+)(\d{3})/;
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 205); 
while (rgx.test(x1)) {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 206); 
x1 = x1.replace(rgx, '$1' + ',' + '$2');
        }
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 208); 
return x1 + x2;
    }
}_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input.js.tmp", 210); 
;
