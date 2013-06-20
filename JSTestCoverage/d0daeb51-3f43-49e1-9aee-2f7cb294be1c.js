if (typeof _yuitest_coverage == "undefined"){
    _yuitest_coverage = {};
    _yuitest_coverline = function(src, line){
        var coverage = _yuitest_coverage[src];
        if (!coverage.lines[line]){
            coverage.calledLines++;
        }
        coverage.lines[line]++;
    };
    _yuitest_coverfunc = function(src, name, line){
        var coverage = _yuitest_coverage[src],
            funcId = name + ":" + line;
        if (!coverage.functions[funcId]){
            coverage.calledFunctions++;
        }
        coverage.functions[funcId]++;
    };
}
_yuitest_coverage["D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp"] = {
    lines: {},
    functions: {},
    coveredLines: 0,
    calledLines: 0,
    coveredFunctions: 0,
    calledFunctions: 0,
    path: "D:\\Boxes\\Dropbox\\workspace\\JSTestCoverage\\input\\input_b.js.tmp",
    code: []
};
_yuitest_coverage["D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp"].code=["dojo.provide(\"space.commonUtils\");","","dojo.require(\"rts.core.URLParser\");","dojo.require(\"rts.ccf.ccfcomponent2\");","","space.commonUtils = {","    /*float*/dojoVersionNum: function () {","        return parseFloat(dojo.version.major + \".\" + dojo.version.minor);","    },","","    /*float*/isNewDojo: function () {","        return this.dojoVersionNum() >= 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler","    },","","    /*float*/isOldDojo: function () {","        return this.dojoVersionNum() < 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler","    },","","    replaceEmptyNode: function (node) {","        if (node.nodeType == 3)","            return;","        if ((node.nodeName == \"DIV\" ||","			node.nodeName == \"P\" ||","			node.nodeName == \"<H1>\" ||","			node.nodeName == \"<H2>\" ||","			node.nodeName == \"<H3>\" ||","			node.nodeName == \"<H4>\" ||","			node.nodeName == \"<H5>\" ||","			node.nodeName == \"<H6>\" ||","			node.nodeName == \"B\" ||","			node.nodeName == \"I\" ||","			node.nodeName == \"U\" ||","			node.nodeName == \"PRE\") &&","			node.innerHTML === \"\")//empty","        {","            // Set node.innerHTMLevery to empty string in order to display break-lines correctly.","            node.innerHTML = \"\";","            return;","        }","        if (!node.childNodes)","            return;","        for (var i = 0; i < node.childNodes.length; i++) {","            this.replaceEmptyNode(node.childNodes[i]);","        }","    },","","    /*HTML-encoded string*/htmlEncode: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        var div = document.createElement('div');","        if (div.innerText != undefined) div.innerText = str;","        else div.textContent = str;","        return div.innerHTML;","    },","","    /*HTML-encoded string*/htmlEncodeForHTTPSubmitting: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        var div = document.createElement('div');","        if (div.innerText != undefined) div.innerText = str;","        else div.textContent = str;","        return div.innerHTML.replace(new RegExp(\"<br>\", \"gi\"), \"\\n\");  //htmlEncode and still add <BR>","    },","","    /*HTML-decoded string*/htmlDecode: function (/*string*/str) {","        if (!str || !dojo.isString(str)) return \"\";","        var encodedString = str.replace(/</gi, \"&lt;\");","        encodedString = encodedString.replace(/>/gi, \"&gt;\");","        var htmlNode = document.createElement(\"div\");","        htmlNode.innerHTML = encodedString;","        if (htmlNode.innerText)","            return htmlNode.innerText; // IE","        return htmlNode.textContent; // FF","    },","","    /*XML-encoded string*/xmlEncode: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        return com.reuters.rts.escapeString(str);","    },","","    /*XML-decoded string*/xmlDecode: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        return com.reuters.rts.unescapeString(str);","    },","","    /*string*/breakWords: function (/*string*/str, /*uint*/maxWordLength, /*string*/delimeter) {","        if (str == \"\" || str == null) return \"\";","","        var regex = new RegExp(\"\\\\b\\\\S{\" + maxWordLength + \",}\\\\b\", \"g\");","        var insert = function (word) {","            var ret = new Array();","            for (var i = 0; i < word.length; i += maxWordLength) {","                ret.push(word.substr(i, maxWordLength));","            }","            return ret.join(delimeter);","        };","        return str.replace(regex, insert);","    },","","    getQueryStringParameter: function (/*string*/queryString, /*string*/paramName) {","        /*Summary: Get the specified parameter value from the page's query-string*/","        paramName = paramName.replace(/[\\[]/, \"\\\\\\[\").replace(/[\\]]/, \"\\\\\\]\");","        var regexS = \"[\\\\?&]\" + paramName + \"=([^&#]*)\";","        var regex = new RegExp(regexS);","        var results = regex.exec(queryString);","        if (results == null) {","            return \"\";","        }","        else {","            return results[1];","        }","    },","","	/*string*/addParamsToURL: function(/*string*/url, /*string*/params) {","		return url.match(/[?]/g) ? url + params : url + \"?\" + params;","	},","","    captureInput: function () {","        space.commonUtils._setInputOwner(true);","    },","","    releaseInput: function () {","        space.commonUtils._setInputOwner(false);","    },","","    _setInputOwner: function (/*bool*/value) {","        var ccf = com.reuters.rts.getCCFComponent();","        if (ccf) {","            ccf._inputCapture = !!value;","            console.log(\"_setInputOwner: \", value);","            //if(!value)alert(value);","        }","    },","","    open: function (/*string*/url, target) {","        var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);","        if (!target)","            target = \"_top\";","        if (dojo.global && dojo.global.event && dojo.global.event.shiftKey) //Ctrl + Click is handled automatically, but not Shift+Click","            target = \"_blank\";","        window.open(absUrl, target).focus();","    },","","    openWindow: function (/*string*/url) {","        var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);","","        var ccf = com.reuters.rts.getCCFComponent();","        if (ccf) {","            if (ccf.sendEventToContainer(\"onNavigate\", \"<Navigation url=\\\"\" + space.commonUtils.xmlEncode(absUrl) + \"\\\" target=\\\"tab\\\"></Navigation>\")) {","                return;","            }","        }","","        window.open(absUrl, \"_blank\").focus();","    },","","    /*string*/trim: function (/*string*/str, /*string*/chars) {","        /* Summary: Removes all leading and trailing occurrences of a set of characters","        * specified in 'chars' arg from the 'str' arg","        */","        chars = chars || \"\\\\s\";","        return str.replace(new RegExp(\"[\" + chars + \"]+$\", \"g\"), \"\").replace(new RegExp(\"^[\" + chars + \"]+\", \"g\"), \"\");","    },","","    show: function (domNode) {","        if (domNode && dojo.style(domNode, \"display\"))","            dojo.style(domNode, \"display\", \"\");","    },","","    hide: function (domNode) {","        if (domNode && dojo.style(domNode, \"display\"))","            dojo.style(domNode, \"display\", \"none\");","    },","","    toggle: function (domNode) {","        if (domNode && dojo.style(domNode, \"display\"))","            dojo.style(domNode, \"display\") == \"none\" ? dojo.style(domNode, \"display\", \"\") : dojo.style(domNode, \"display\", \"none\");","    },","","    normaliseNewlines: function (str) {","        return (dojo.isString(str)) ? str.replace(/\\u000d[\\u000a\\u0085]|[\\u0085\\u2028\\u000d\\u000a]/g, '\\u000a') : str;","    },","","    generateGuid: function () {","        var S4 = function () {","            return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);","        };","        return (S4() + S4() + \"-\" + S4() + \"-\" + S4() + \"-\" + S4() + \"-\" + S4() + S4() + S4());","    },","","    addCommas: function (nStr) {","		//addCommas: function () {","        nStr += '';","        x = nStr.split('.');","        x1 = x[0];","        x2 = x.length > 1 ? '.' + x[1] : '';","        var rgx = /(\\d+)(\\d{3})/;","        while (rgx.test(x1)) {","            x1 = x1.replace(rgx, '$1' + ',' + '$2');","        }","        return x1 + x2;","    }","};"];
_yuitest_coverage["D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp"].lines = {"1":0,"3":0,"4":0,"6":0,"8":0,"12":0,"16":0,"20":0,"21":0,"22":0,"37":0,"38":0,"40":0,"41":0,"42":0,"43":0,"48":0,"49":0,"50":0,"51":0,"52":0,"56":0,"57":0,"58":0,"59":0,"60":0,"64":0,"65":0,"66":0,"67":0,"68":0,"69":0,"70":0,"71":0,"75":0,"76":0,"80":0,"81":0,"85":0,"87":0,"88":0,"89":0,"90":0,"91":0,"93":0,"95":0,"100":0,"101":0,"102":0,"103":0,"104":0,"105":0,"108":0,"113":0,"117":0,"121":0,"125":0,"126":0,"127":0,"128":0,"134":0,"135":0,"136":0,"137":0,"138":0,"139":0,"143":0,"145":0,"146":0,"147":0,"148":0,"152":0,"159":0,"160":0,"164":0,"165":0,"169":0,"170":0,"174":0,"175":0,"179":0,"183":0,"184":0,"186":0,"191":0,"192":0,"193":0,"194":0,"195":0,"196":0,"197":0,"199":0};
_yuitest_coverage["D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp"].functions = {"dojoVersionNum:7":0,"isNewDojo:11":0,"isOldDojo:15":0,"replaceEmptyNode:19":0,"htmlEncode:47":0,"htmlEncodeForHTTPSubmitting:55":0,"htmlDecode:63":0,"xmlEncode:74":0,"xmlDecode:79":0,"insert:88":0,"breakWords:84":0,"getQueryStringParameter:98":0,"addParamsToURL:112":0,"captureInput:116":0,"releaseInput:120":0,"_setInputOwner:124":0,"open:133":0,"openWindow:142":0,"trim:155":0,"show:163":0,"hide:168":0,"toggle:173":0,"normaliseNewlines:178":0,"S4:183":0,"generateGuid:182":0,"addCommas:189":0};
_yuitest_coverage["D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp"].coveredLines = 92;
_yuitest_coverage["D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp"].coveredFunctions = 26;
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 1); 
dojo.provide("space.commonUtils");

_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 3); 
dojo.require("rts.core.URLParser");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 4); 
dojo.require("rts.ccf.ccfcomponent2");

_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 6); 
space.commonUtils = {
    /*float*/dojoVersionNum: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "dojoVersionNum","7:8", "");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 8); 
return parseFloat(dojo.version.major + "." + dojo.version.minor);
    },

    /*float*/isNewDojo: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "isNewDojo","11:12", "");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 12); 
return this.dojoVersionNum() >= 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler
    },

    /*float*/isOldDojo: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "isOldDojo","15:16", "");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 16); 
return this.dojoVersionNum() < 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler
    },

    replaceEmptyNode: function (node) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "replaceEmptyNode","19:43", "node:Number");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 20); 
if (node.nodeType == 3)
            {_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 21); 
return;}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 22); 
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
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 37); 
node.innerHTML = "";
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 38); 
return;
        }
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 40); 
if (!node.childNodes)
            {_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 41); 
return;}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 42); 
for (var i = 0; i < node.childNodes.length; i++) {
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 43); 
this.replaceEmptyNode(node.childNodes[i]);
        }
    },

    /*HTML-encoded string*/htmlEncode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "htmlEncode","47:52", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 48); 
if (str == "" || str == null) {return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 49); 
var div = document.createElement('div');
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 50); 
if (div.innerText != undefined) {div.innerText = str;}
        else {_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 51); 
div.textContent = str;}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 52); 
return div.innerHTML;
    },

    /*HTML-encoded string*/htmlEncodeForHTTPSubmitting: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "htmlEncodeForHTTPSubmitting","55:60", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 56); 
if (str == "" || str == null) {return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 57); 
var div = document.createElement('div');
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 58); 
if (div.innerText != undefined) {div.innerText = str;}
        else {_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 59); 
div.textContent = str;}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 60); 
return div.innerHTML.replace(new RegExp("<br>", "gi"), "\n");  //htmlEncode and still add <BR>
    },

    /*HTML-decoded string*/htmlDecode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "htmlDecode","63:71", "str:String");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 64); 
if (!str || !dojo.isString(str)) {return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 65); 
var encodedString = str.replace(/</gi, "&lt;");
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 66); 
encodedString = encodedString.replace(/>/gi, "&gt;");
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 67); 
var htmlNode = document.createElement("div");
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 68); 
htmlNode.innerHTML = encodedString;
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 69); 
if (htmlNode.innerText)
            {_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 70); 
return htmlNode.innerText;} // IE
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 71); 
return htmlNode.textContent; // FF
    },

    /*XML-encoded string*/xmlEncode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "xmlEncode","74:76", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 75); 
if (str == "" || str == null) {return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 76); 
return com.reuters.rts.escapeString(str);
    },

    /*XML-decoded string*/xmlDecode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "xmlDecode","79:81", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 80); 
if (str == "" || str == null) {return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 81); 
return com.reuters.rts.unescapeString(str);
    },

    /*string*/breakWords: function (/*string*/str, /*uint*/maxWordLength, /*string*/delimeter) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "breakWords","84:88", "str:String|maxWordLength:Number|delimeter:String");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 85); 
if (str == "" || str == null) {return "";}

        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 87); 
var regex = new RegExp("\\b\\S{" + maxWordLength + ",}\\b", "g");
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 88); 
var insert = function (word) {
            _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "insert","88:95", "word:String");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 89); 
var ret = new Array();
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 90); 
for (var i = 0; i < word.length; i += maxWordLength) {
                _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 91); 
ret.push(word.substr(i, maxWordLength));
            }
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 93); 
return ret.join(delimeter);
        };
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 95); 
return str.replace(regex, insert);
    },

    getQueryStringParameter: function (/*string*/queryString, /*string*/paramName) {
        /*Summary: Get the specified parameter value from the page's query-string*/
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "getQueryStringParameter","98:108", "queryString:String|paramName:String");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 100); 
paramName = paramName.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 101); 
var regexS = "[\\?&]" + paramName + "=([^&#]*)";
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 102); 
var regex = new RegExp(regexS);
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 103); 
var results = regex.exec(queryString);
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 104); 
if (results == null) {
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 105); 
return "";
        }
        else {
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 108); 
return results[1];
        }
    },

	/*string*/addParamsToURL: function(/*string*/url, /*string*/params) {
		_yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "addParamsToURL","112:113", "url:String|params:Number");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 113); 
return url.match(/[?]/g) ? url + params : url + "?" + params;
	},

    captureInput: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "captureInput","116:117", "");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 117); 
space.commonUtils._setInputOwner(true);
    },

    releaseInput: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "releaseInput","120:121", "");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 121); 
space.commonUtils._setInputOwner(false);
    },

    _setInputOwner: function (/*bool*/value) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "_setInputOwner","124:128", "value:null");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 125); 
var ccf = com.reuters.rts.getCCFComponent();
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 126); 
if (ccf) {
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 127); 
ccf._inputCapture = !!value;
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 128); 
console.log("_setInputOwner: ", value);
            //if(!value)alert(value);
        }
    },

    open: function (/*string*/url, target) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "open","133:139", "url:null|target:null");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 134); 
var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 135); 
if (!target)
            {_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 136); 
target = "_top";}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 137); 
if (dojo.global && dojo.global.event && dojo.global.event.shiftKey) //Ctrl + Click is handled automatically, but not Shift+Click
            {_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 138); 
target = "_blank";}
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 139); 
window.open(absUrl, target).focus();
    },

    openWindow: function (/*string*/url) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "openWindow","142:152", "url:null");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 143); 
var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);

        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 145); 
var ccf = com.reuters.rts.getCCFComponent();
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 146); 
if (ccf) {
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 147); 
if (ccf.sendEventToContainer("onNavigate", "<Navigation url=\"" + space.commonUtils.xmlEncode(absUrl) + "\" target=\"tab\"></Navigation>")) {
                _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 148); 
return;
            }
        }

        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 152); 
window.open(absUrl, "_blank").focus();
    },

    /*string*/trim: function (/*string*/str, /*string*/chars) {
        /* Summary: Removes all leading and trailing occurrences of a set of characters
        * specified in 'chars' arg from the 'str' arg
        */
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "trim","155:160", "str:String|chars:Number");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 159); 
chars = chars || "\\s";
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 160); 
return str.replace(new RegExp("[" + chars + "]+$", "g"), "").replace(new RegExp("^[" + chars + "]+", "g"), "");
    },

    show: function (domNode) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "show","163:165", "domNode:null");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 164); 
if (domNode && dojo.style(domNode, "display"))
            {_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 165); 
dojo.style(domNode, "display", "");}
    },

    hide: function (domNode) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "hide","168:170", "domNode:null");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 169); 
if (domNode && dojo.style(domNode, "display"))
            {_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 170); 
dojo.style(domNode, "display", "none");}
    },

    toggle: function (domNode) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "toggle","173:175", "domNode:null");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 174); 
if (domNode && dojo.style(domNode, "display"))
            {_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 175); 
dojo.style(domNode, "display") == "none" ? dojo.style(domNode, "display", "") : dojo.style(domNode, "display", "none");}
    },

    normaliseNewlines: function (str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "normaliseNewlines","178:179", "str:String");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 179); 
return (dojo.isString(str)) ? str.replace(/\u000d[\u000a\u0085]|[\u0085\u2028\u000d\u000a]/g, '\u000a') : str;
    },

    generateGuid: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "generateGuid","182:183", "");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 183); 
var S4 = function () {
            _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "S4","183:186", "");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 184); 
return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
        };
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 186); 
return (S4() + S4() + "-" + S4() + "-" + S4() + "-" + S4() + "-" + S4() + S4() + S4());
    },

    addCommas: function (nStr) {
		//addCommas: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", "addCommas","189:199", "nStr:String");
_yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 191); 
nStr += '';
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 192); 
x = nStr.split('.');
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 193); 
x1 = x[0];
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 194); 
x2 = x.length > 1 ? '.' + x[1] : '';
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 195); 
var rgx = /(\d+)(\d{3})/;
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 196); 
while (rgx.test(x1)) {
            _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 197); 
x1 = x1.replace(rgx, '$1' + ',' + '$2');
        }
        _yuitest_coverline("D:\Boxes\Dropbox\workspace\JSTestCoverage\input\input_b.js.tmp", 199); 
return x1 + x2;
    }
};
