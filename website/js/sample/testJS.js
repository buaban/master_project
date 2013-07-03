dojo.provide("sample.testJS");

sample.testJS = {
	/*string*/addParamsToURL: function(/*string*/url, /*string*/params) {
		return url.match(/[?]/g) ? url + params : url + "?" + params;
	},
	/*string*/trim: function (/*string*/str, /*string*/chars) {
        /* Summary: Removes all leading and trailing occurrences of a set of characters
        * specified in 'chars' arg from the 'str' arg
        */
        chars = chars || "\\s";
        return str.replace(new RegExp("[" + chars + "]+$", "g"), "").replace(new RegExp("^[" + chars + "]+", "g"), "");
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
	test: function(num){
		return num+1;
	} 
}