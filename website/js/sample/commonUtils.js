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
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp"] = {
    lines: {},
    functions: {},
    coveredLines: 0,
    calledLines: 0,
    coveredFunctions: 0,
    calledFunctions: 0,
    path: "D:\\Boxes\\Dropbox\\GIT\\master_project\\website\\js\\sample\\commonUtils.js.tmp",
    code: []
};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp"].code=["dojo.provide(\"sample.commonUtils\");","","sample.commonUtils = {","    /*float*/dojoVersionNum: function () {","        return parseFloat(dojo.version.major + \".\" + dojo.version.minor);","    },","","    /*float*/isNewDojo: function () {","        return this.dojoVersionNum() >= 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler","    },","","    /*float*/isOldDojo: function () {","        return this.dojoVersionNum() < 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler","    },","","    replaceEmptyNode: function (node) {","        if (node.nodeType == 3)","            return;","        if ((node.nodeName == \"DIV\" ||","			node.nodeName == \"P\" ||","			node.nodeName == \"<H1>\" ||","			node.nodeName == \"<H2>\" ||","			node.nodeName == \"<H3>\" ||","			node.nodeName == \"<H4>\" ||","			node.nodeName == \"<H5>\" ||","			node.nodeName == \"<H6>\" ||","			node.nodeName == \"B\" ||","			node.nodeName == \"I\" ||","			node.nodeName == \"U\" ||","			node.nodeName == \"PRE\") &&","			node.innerHTML === \"\")//empty","        {","            // Set node.innerHTMLevery to empty string in order to display break-lines correctly.","            node.innerHTML = \"\";","            return;","        }","        if (!node.childNodes)","            return;","        for (var i = 0; i < node.childNodes.length; i++) {","            this.replaceEmptyNode(node.childNodes[i]);","        }","    },","","    /*HTML-encoded string*/htmlEncode: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        var div = document.createElement('div');","        if (div.innerText != undefined) div.innerText = str;","        else div.textContent = str;","        return div.innerHTML;","    },","","    /*HTML-encoded string*/htmlEncodeForHTTPSubmitting: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        var div = document.createElement('div');","        if (div.innerText != undefined) div.innerText = str;","        else div.textContent = str;","        return div.innerHTML.replace(new RegExp(\"<br>\", \"gi\"), \"\\n\");  //htmlEncode and still add <BR>","    },","","    /*HTML-decoded string*/htmlDecode: function (/*string*/str) {","        if (!str || !dojo.isString(str)) return \"\";","        var encodedString = str.replace(/</gi, \"&lt;\");","        encodedString = encodedString.replace(/>/gi, \"&gt;\");","        var htmlNode = document.createElement(\"div\");","        htmlNode.innerHTML = encodedString;","        if (htmlNode.innerText)","            return htmlNode.innerText; // IE","        return htmlNode.textContent; // FF","    },","","    /*XML-encoded string*/xmlEncode: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        return com.reuters.rts.escapeString(str);","    },","","    /*XML-decoded string*/xmlDecode: function (/*string*/str) {","        if (str == \"\" || str == null) return \"\";","        return com.reuters.rts.unescapeString(str);","    },","","    /*string*/breakWords: function (/*string*/str, /*uint*/maxWordLength, /*string*/delimeter) {","        if (str == \"\" || str == null) return \"\";","","        var regex = new RegExp(\"\\\\b\\\\S{\" + maxWordLength + \",}\\\\b\", \"g\");","        var insert = function (word) {","            var ret = new Array();","            for (var i = 0; i < word.length; i += maxWordLength) {","                ret.push(word.substr(i, maxWordLength));","            }","            return ret.join(delimeter);","        };","        return str.replace(regex, insert);","    },","","    getQueryStringParameter: function (/*string*/queryString, /*string*/paramName) {","        /*Summary: Get the specified parameter value from the page's query-string*/","        paramName = paramName.replace(/[\\[]/, \"\\\\\\[\").replace(/[\\]]/, \"\\\\\\]\");","        var regexS = \"[\\\\?&]\" + paramName + \"=([^&#]*)\";","        var regex = new RegExp(regexS);","        var results = regex.exec(queryString);","        if (results == null) {","            return \"\";","        }","        else {","            return results[1];","        }","    },","","	/*string*/addParamsToURL: function(/*string*/url, /*string*/params) {","		return url.match(/[?]/g) ? url + params : url + \"?\" + params;","	},","","    captureInput: function () {","        space.commonUtils._setInputOwner(true);","    },","","    releaseInput: function () {","        space.commonUtils._setInputOwner(false);","    },","","    _setInputOwner: function (/*bool*/value) {","        var ccf = com.reuters.rts.getCCFComponent();","        if (ccf) {","            ccf._inputCapture = !!value;","            console.log(\"_setInputOwner: \", value);","            //if(!value)alert(value);","        }","    },","","    open: function (/*string*/url, target) {","        var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);","        if (!target)","            target = \"_top\";","        if (dojo.global && dojo.global.event && dojo.global.event.shiftKey) //Ctrl + Click is handled automatically, but not Shift+Click","            target = \"_blank\";","        window.open(absUrl, target).focus();","    },","","    openWindow: function (/*string*/url) {","        var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);","","        var ccf = com.reuters.rts.getCCFComponent();","        if (ccf) {","            if (ccf.sendEventToContainer(\"onNavigate\", \"<Navigation url=\\\"\" + space.commonUtils.xmlEncode(absUrl) + \"\\\" target=\\\"tab\\\"></Navigation>\")) {","                return;","            }","        }","","        window.open(absUrl, \"_blank\").focus();","    },","","    /*string*/trim: function (/*string*/str, /*string*/chars) {","        /* Summary: Removes all leading and trailing occurrences of a set of characters","        * specified in 'chars' arg from the 'str' arg","        */","        chars = chars || \"\\\\s\";","        return str.replace(new RegExp(\"[\" + chars + \"]+$\", \"g\"), \"\").replace(new RegExp(\"^[\" + chars + \"]+\", \"g\"), \"\");","    },","","    show: function (domNode) {","        if (domNode && dojo.style(domNode, \"display\"))","            dojo.style(domNode, \"display\", \"\");","    },","","    hide: function (domNode) {","        if (domNode && dojo.style(domNode, \"display\"))","            dojo.style(domNode, \"display\", \"none\");","    },","","    toggle: function (domNode) {","        if (domNode && dojo.style(domNode, \"display\"))","            dojo.style(domNode, \"display\") == \"none\" ? dojo.style(domNode, \"display\", \"\") : dojo.style(domNode, \"display\", \"none\");","    },","","    normaliseNewlines: function (str) {","        return (dojo.isString(str)) ? str.replace(/\\u000d[\\u000a\\u0085]|[\\u0085\\u2028\\u000d\\u000a]/g, '\\u000a') : str;","    },","","    generateGuid: function () {","        var S4 = function () {","            return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);","        };","        return (S4() + S4() + \"-\" + S4() + \"-\" + S4() + \"-\" + S4() + \"-\" + S4() + S4() + S4());","    },","","    addCommas: function (nStr) {","        nStr += '';","        x = nStr.split('.');","        x1 = x[0];","        x2 = x.length > 1 ? '.' + x[1] : '';","        var rgx = /(\\d+)(\\d{3})/;","        while (rgx.test(x1)) {","            x1 = x1.replace(rgx, '$1' + ',' + '$2');","        }","        return x1 + x2;","    }","};"];
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp"].lines = {"1":0,"3":0,"5":0,"9":0,"13":0,"17":0,"18":0,"19":0,"34":0,"35":0,"37":0,"38":0,"39":0,"40":0,"45":0,"45":0,"46":0,"47":0,"47":0,"48":0,"49":0,"53":0,"53":0,"54":0,"55":0,"55":0,"56":0,"57":0,"61":0,"61":0,"62":0,"63":0,"64":0,"65":0,"66":0,"67":0,"68":0,"72":0,"72":0,"73":0,"77":0,"77":0,"78":0,"82":0,"82":0,"84":0,"85":0,"86":0,"87":0,"88":0,"90":0,"92":0,"97":0,"98":0,"99":0,"100":0,"101":0,"102":0,"105":0,"110":0,"114":0,"118":0,"122":0,"123":0,"124":0,"125":0,"131":0,"132":0,"133":0,"134":0,"135":0,"136":0,"140":0,"142":0,"143":0,"144":0,"145":0,"149":0,"156":0,"157":0,"161":0,"162":0,"166":0,"167":0,"171":0,"172":0,"176":0,"180":0,"181":0,"183":0,"187":0,"188":0,"189":0,"190":0,"191":0,"192":0,"193":0,"195":0,"197":0};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp"].functions = {"dojoVersionNum:4":0,"isNewDojo:8":0,"isOldDojo:12":0,"replaceEmptyNode:16":0,"htmlEncode:44":0,"htmlEncodeForHTTPSubmitting:52":0,"htmlDecode:60":0,"xmlEncode:71":0,"xmlDecode:76":0,"insert:85":0,"breakWords:81":0,"getQueryStringParameter:95":0,"addParamsToURL:109":0,"captureInput:113":0,"releaseInput:117":0,"_setInputOwner:121":0,"open:130":0,"openWindow:139":0,"trim:152":0,"show:160":0,"hide:165":0,"toggle:170":0,"normaliseNewlines:175":0,"S4:180":0,"generateGuid:179":0,"addCommas:186":0};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp"].coveredLines = 99;
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp"].coveredFunctions = 26;
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 1); 
dojo.provide("sample.commonUtils");

_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 3); 
sample.commonUtils = {
    /*float*/dojoVersionNum: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "dojoVersionNum","5:5", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 5); 
return parseFloat(dojo.version.major + "." + dojo.version.minor);
    },

    /*float*/isNewDojo: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "isNewDojo","9:9", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 9); 
return this.dojoVersionNum() >= 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler
    },

    /*float*/isOldDojo: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "isOldDojo","13:13", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 13); 
return this.dojoVersionNum() < 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler
    },

    replaceEmptyNode: function (node) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "replaceEmptyNode","17:40", "node:Number");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 17); 
if (node.nodeType == 3)
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 18); 
return;}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 19); 
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
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 34); 
node.innerHTML = "";
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 35); 
return;
        }
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 37); 
if (!node.childNodes)
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 38); 
return;}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 39); 
for (var i = 0; i < node.childNodes.length; i++) {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 40); 
this.replaceEmptyNode(node.childNodes[i]);
        }
    },

    /*HTML-encoded string*/htmlEncode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "htmlEncode","45:49", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 45); 
if (str == "" || str == null) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 45); 
return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 46); 
var div = document.createElement('div');
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 47); 
if (div.innerText != undefined) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 47); 
div.innerText = str;}
        else {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 48); 
div.textContent = str;}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 49); 
return div.innerHTML;
    },

    /*HTML-encoded string*/htmlEncodeForHTTPSubmitting: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "htmlEncodeForHTTPSubmitting","53:57", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 53); 
if (str == "" || str == null) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 53); 
return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 54); 
var div = document.createElement('div');
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 55); 
if (div.innerText != undefined) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 55); 
div.innerText = str;}
        else {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 56); 
div.textContent = str;}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 57); 
return div.innerHTML.replace(new RegExp("<br>", "gi"), "\n");  //htmlEncode and still add <BR>
    },

    /*HTML-decoded string*/htmlDecode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "htmlDecode","61:68", "str:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 61); 
if (!str || !dojo.isString(str)) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 61); 
return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 62); 
var encodedString = str.replace(/</gi, "&lt;");
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 63); 
encodedString = encodedString.replace(/>/gi, "&gt;");
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 64); 
var htmlNode = document.createElement("div");
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 65); 
htmlNode.innerHTML = encodedString;
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 66); 
if (htmlNode.innerText)
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 67); 
return htmlNode.innerText;} // IE
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 68); 
return htmlNode.textContent; // FF
    },

    /*XML-encoded string*/xmlEncode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "xmlEncode","72:73", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 72); 
if (str == "" || str == null) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 72); 
return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 73); 
return com.reuters.rts.escapeString(str);
    },

    /*XML-decoded string*/xmlDecode: function (/*string*/str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "xmlDecode","77:78", "str:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 77); 
if (str == "" || str == null) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 77); 
return "";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 78); 
return com.reuters.rts.unescapeString(str);
    },

    /*string*/breakWords: function (/*string*/str, /*uint*/maxWordLength, /*string*/delimeter) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "breakWords","82:85", "str:String|maxWordLength:Number|delimeter:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 82); 
if (str == "" || str == null) {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 82); 
return "";}

        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 84); 
var regex = new RegExp("\\b\\S{" + maxWordLength + ",}\\b", "g");
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 85); 
var insert = function (word) {
            _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "insert","86:92", "word:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 86); 
var ret = new Array();
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 87); 
for (var i = 0; i < word.length; i += maxWordLength) {
                _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 88); 
ret.push(word.substr(i, maxWordLength));
            }
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 90); 
return ret.join(delimeter);
        };
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 92); 
return str.replace(regex, insert);
    },

    getQueryStringParameter: function (/*string*/queryString, /*string*/paramName) {
        /*Summary: Get the specified parameter value from the page's query-string*/
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "getQueryStringParameter","97:105", "queryString:String|paramName:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 97); 
paramName = paramName.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 98); 
var regexS = "[\\?&]" + paramName + "=([^&#]*)";
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 99); 
var regex = new RegExp(regexS);
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 100); 
var results = regex.exec(queryString);
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 101); 
if (results == null) {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 102); 
return "";
        }
        else {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 105); 
return results[1];
        }
    },

	/*string*/addParamsToURL: function(/*string*/url, /*string*/params) {
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "addParamsToURL","110:110", "url:String|params:Number");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 110); 
return url.match(/[?]/g) ? url + params : url + "?" + params;
	},

    captureInput: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "captureInput","114:114", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 114); 
space.commonUtils._setInputOwner(true);
    },

    releaseInput: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "releaseInput","118:118", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 118); 
space.commonUtils._setInputOwner(false);
    },

    _setInputOwner: function (/*bool*/value) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "_setInputOwner","122:125", "value:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 122); 
var ccf = com.reuters.rts.getCCFComponent();
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 123); 
if (ccf) {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 124); 
ccf._inputCapture = !!value;
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 125); 
console.log("_setInputOwner: ", value);
            //if(!value)alert(value);
        }
    },

    open: function (/*string*/url, target) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "open","131:136", "url:null|target:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 131); 
var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 132); 
if (!target)
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 133); 
target = "_top";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 134); 
if (dojo.global && dojo.global.event && dojo.global.event.shiftKey) //Ctrl + Click is handled automatically, but not Shift+Click
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 135); 
target = "_blank";}
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 136); 
window.open(absUrl, target).focus();
    },

    openWindow: function (/*string*/url) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "openWindow","140:149", "url:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 140); 
var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);

        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 142); 
var ccf = com.reuters.rts.getCCFComponent();
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 143); 
if (ccf) {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 144); 
if (ccf.sendEventToContainer("onNavigate", "<Navigation url=\"" + space.commonUtils.xmlEncode(absUrl) + "\" target=\"tab\"></Navigation>")) {
                _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 145); 
return;
            }
        }

        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 149); 
window.open(absUrl, "_blank").focus();
    },

    /*string*/trim: function (/*string*/str, /*string*/chars) {
        /* Summary: Removes all leading and trailing occurrences of a set of characters
        * specified in 'chars' arg from the 'str' arg
        */
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "trim","156:157", "str:String|chars:Number");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 156); 
chars = chars || "\\s";
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 157); 
return str.replace(new RegExp("[" + chars + "]+$", "g"), "").replace(new RegExp("^[" + chars + "]+", "g"), "");
    },

    show: function (domNode) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "show","161:162", "domNode:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 161); 
if (domNode && dojo.style(domNode, "display"))
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 162); 
dojo.style(domNode, "display", "");}
    },

    hide: function (domNode) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "hide","166:167", "domNode:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 166); 
if (domNode && dojo.style(domNode, "display"))
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 167); 
dojo.style(domNode, "display", "none");}
    },

    toggle: function (domNode) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "toggle","171:172", "domNode:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 171); 
if (domNode && dojo.style(domNode, "display"))
            {_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 172); 
dojo.style(domNode, "display") == "none" ? dojo.style(domNode, "display", "") : dojo.style(domNode, "display", "none");}
    },

    normaliseNewlines: function (str) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "normaliseNewlines","176:176", "str:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 176); 
return (dojo.isString(str)) ? str.replace(/\u000d[\u000a\u0085]|[\u0085\u2028\u000d\u000a]/g, '\u000a') : str;
    },

    generateGuid: function () {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "generateGuid","180:180", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 180); 
var S4 = function () {
            _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "S4","181:183", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 181); 
return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
        };
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 183); 
return (S4() + S4() + "-" + S4() + "-" + S4() + "-" + S4() + "-" + S4() + S4() + S4());
    },

    addCommas: function (nStr) {
        _yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp","sample.commonUtils", "addCommas","187:197", "nStr:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 187); 
nStr += '';
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 188); 
x = nStr.split('.');
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 189); 
x1 = x[0];
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 190); 
x2 = x.length > 1 ? '.' + x[1] : '';
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 191); 
var rgx = /(\d+)(\d{3})/;
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 192); 
while (rgx.test(x1)) {
            _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 193); 
x1 = x1.replace(rgx, '$1' + ',' + '$2');
        }
        _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 195); 
return x1 + x2;
    }
}_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\website\js\sample\commonUtils.js.tmp", 197); 
;
