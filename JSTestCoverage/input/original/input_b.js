dojo.provide("space.commonUtils");

dojo.require("rts.core.URLParser");
dojo.require("rts.ccf.ccfcomponent2");

space.commonUtils = {
    /*float*/dojoVersionNum: function () {
        return parseFloat(dojo.version.major + "." + dojo.version.minor);
    },

    /*float*/isNewDojo: function () {
        return this.dojoVersionNum() >= 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler
    },

    /*float*/isOldDojo: function () {
        return this.dojoVersionNum() < 1.5; //dojo 1.5 does not have dojox.editor.plugins.GlobalTableHandler
    },

    replaceEmptyNode: function (node) {
        if (node.nodeType == 3)
            return;
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
            node.innerHTML = "";
            return;
        }
        if (!node.childNodes)
            return;
        for (var i = 0; i < node.childNodes.length; i++) {
            this.replaceEmptyNode(node.childNodes[i]);
        }
    },

    /*HTML-encoded string*/htmlEncode: function (/*string*/str) {
        if (str == "" || str == null) return "";
        var div = document.createElement('div');
        if (div.innerText != undefined) div.innerText = str;
        else div.textContent = str;
        return div.innerHTML;
    },

    /*HTML-encoded string*/htmlEncodeForHTTPSubmitting: function (/*string*/str) {
        if (str == "" || str == null) return "";
        var div = document.createElement('div');
        if (div.innerText != undefined) div.innerText = str;
        else div.textContent = str;
        return div.innerHTML.replace(new RegExp("<br>", "gi"), "\n");  //htmlEncode and still add <BR>
    },

    /*HTML-decoded string*/htmlDecode: function (/*string*/str) {
        if (!str || !dojo.isString(str)) return "";
        var encodedString = str.replace(/</gi, "&lt;");
        encodedString = encodedString.replace(/>/gi, "&gt;");
        var htmlNode = document.createElement("div");
        htmlNode.innerHTML = encodedString;
        if (htmlNode.innerText)
            return htmlNode.innerText; // IE
        return htmlNode.textContent; // FF
    },

    /*XML-encoded string*/xmlEncode: function (/*string*/str) {
        if (str == "" || str == null) return "";
        return com.reuters.rts.escapeString(str);
    },

    /*XML-decoded string*/xmlDecode: function (/*string*/str) {
        if (str == "" || str == null) return "";
        return com.reuters.rts.unescapeString(str);
    },

    /*string*/breakWords: function (/*string*/str, /*uint*/maxWordLength, /*string*/delimeter) {
        if (str == "" || str == null) return "";

        var regex = new RegExp("\\b\\S{" + maxWordLength + ",}\\b", "g");
        var insert = function (word) {
            var ret = new Array();
            for (var i = 0; i < word.length; i += maxWordLength) {
                ret.push(word.substr(i, maxWordLength));
            }
            return ret.join(delimeter);
        };
        return str.replace(regex, insert);
    },

    getQueryStringParameter: function (/*string*/queryString, /*string*/paramName) {
        /*Summary: Get the specified parameter value from the page's query-string*/
        paramName = paramName.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
        var regexS = "[\\?&]" + paramName + "=([^&#]*)";
        var regex = new RegExp(regexS);
        var results = regex.exec(queryString);
        if (results == null) {
            return "";
        }
        else {
            return results[1];
        }
    },

	/*string*/addParamsToURL: function(/*string*/url, /*string*/params) {
		return url.match(/[?]/g) ? url + params : url + "?" + params;
	},

    captureInput: function () {
        space.commonUtils._setInputOwner(true);
    },

    releaseInput: function () {
        space.commonUtils._setInputOwner(false);
    },

    _setInputOwner: function (/*bool*/value) {
        var ccf = com.reuters.rts.getCCFComponent();
        if (ccf) {
            ccf._inputCapture = !!value;
            console.log("_setInputOwner: ", value);
            //if(!value)alert(value);
        }
    },

    open: function (/*string*/url, target) {
        var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);
        if (!target)
            target = "_top";
        if (dojo.global && dojo.global.event && dojo.global.event.shiftKey) //Ctrl + Click is handled automatically, but not Shift+Click
            target = "_blank";
        window.open(absUrl, target).focus();
    },

    openWindow: function (/*string*/url) {
        var absUrl = new com.reuters.rts.URLParser(document.location.href).URItoAbsolute(url);

        var ccf = com.reuters.rts.getCCFComponent();
        if (ccf) {
            if (ccf.sendEventToContainer("onNavigate", "<Navigation url=\"" + space.commonUtils.xmlEncode(absUrl) + "\" target=\"tab\"></Navigation>")) {
                return;
            }
        }

        window.open(absUrl, "_blank").focus();
    },

    /*string*/trim: function (/*string*/str, /*string*/chars) {
        /* Summary: Removes all leading and trailing occurrences of a set of characters
        * specified in 'chars' arg from the 'str' arg
        */
        chars = chars || "\\s";
        return str.replace(new RegExp("[" + chars + "]+$", "g"), "").replace(new RegExp("^[" + chars + "]+", "g"), "");
    },

    show: function (domNode) {
        if (domNode && dojo.style(domNode, "display"))
            dojo.style(domNode, "display", "");
    },

    hide: function (domNode) {
        if (domNode && dojo.style(domNode, "display"))
            dojo.style(domNode, "display", "none");
    },

    toggle: function (domNode) {
        if (domNode && dojo.style(domNode, "display"))
            dojo.style(domNode, "display") == "none" ? dojo.style(domNode, "display", "") : dojo.style(domNode, "display", "none");
    },

    normaliseNewlines: function (str) {
        return (dojo.isString(str)) ? str.replace(/\u000d[\u000a\u0085]|[\u0085\u2028\u000d\u000a]/g, '\u000a') : str;
    },

    generateGuid: function () {
        var S4 = function () {
            return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
        };
        return (S4() + S4() + "-" + S4() + "-" + S4() + "-" + S4() + "-" + S4() + S4() + S4());
    },

    addCommas: function (nStr) {
        nStr += '';
        x = nStr.split('.');
        x1 = x[0];
        x2 = x.length > 1 ? '.' + x[1] : '';
        var rgx = /(\d+)(\d{3})/;
        while (rgx.test(x1)) {
            x1 = x1.replace(rgx, '$1' + ',' + '$2');
        }
        return x1 + x2;
    }
};