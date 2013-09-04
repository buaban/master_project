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
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp"] = {
    lines: {},
    functions: {},
    coveredLines: 0,
    calledLines: 0,
    coveredFunctions: 0,
    calledFunctions: 0,
    path: "D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\input\\input_c.js.tmp",
    code: []
};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp"].code=["function formatPattern(dateObject, bundle, options, pattern){","	return pattern.replace(/([a-z])\\1*/ig, function(match){","		var s, pad,","			c = match.charAt(0),","			l = match.length,","			widthList = [\"abbr\", \"wide\", \"narrow\"];","		switch(c){","			case 'G':","				s = bundle[(l < 4) ? \"eraAbbr\" : \"eraNames\"][dateObject.getFullYear() < 0 ? 0 : 1];","				break;","			case 'y':","				s = dateObject.getFullYear();","				switch(l){","					case 1:","						break;","					case 2:","						if(!options.fullYear){","							s = String(s); s = s.substr(s.length - 2);","							break;","						}","						// fallthrough","					default:","						pad = true;","				}","				break;","			case 'Q':","			case 'q':","				s = Math.ceil((dateObject.getMonth()+1)/3);","//					switch(l){","//						case 1: case 2:","						pad = true;","//							break;","//						case 3: case 4: // unimplemented","//					}","				break;","			case 'M':","			case 'L':","				var m = dateObject.getMonth();","				if(l<3){","					s = m+1; pad = true;","				}else{","					var propM = [","						\"months\",","						c == 'L' ? \"standAlone\" : \"format\",","						widthList[l-3]","					].join(\"-\");","					s = bundle[propM][m];","				}","				break;","			case 'w':","				var firstDay = 0;","				s = exports._getWeekOfYear(dateObject, firstDay); pad = true;","				break;","			case 'd':","				s = dateObject.getDate(); pad = true;","				break;","			case 'D':","				s = exports._getDayOfYear(dateObject); pad = true;","				break;","			case 'e':","			case 'c':","				var d = dateObject.getDay();","				if(l<2){","					s = (d - supplemental.getFirstDayOfWeek(options.locale) + 8) % 7","					break;","				}","				// fallthrough","			case 'E':","				d = dateObject.getDay();","				if(l<3){","					s = d+1; pad = true;","				}else{","					var propD = [","						\"days\",","						c == 'c' ? \"standAlone\" : \"format\",","						widthList[l-3]","					].join(\"-\");","					s = bundle[propD][d];","				}","				break;","			case 'a':","				var timePeriod = dateObject.getHours() < 12 ? 'am' : 'pm';","				s = options[timePeriod] || bundle['dayPeriods-format-wide-' + timePeriod];","				break;","			case 'h':","			case 'H':","			case 'K':","			case 'k':","				var h = dateObject.getHours();","				// strange choices in the date format make it impossible to write this succinctly","				switch (c){","					case 'h': // 1-12","						s = (h % 12) || 12;","						break;","					case 'H': // 0-23","						s = h;","						break;","					case 'K': // 0-11","						s = (h % 12);","						break;","					case 'k': // 1-24","						s = h || 24;","						break;","				}","				pad = true;","				break;","			case 'm':","				s = dateObject.getMinutes(); pad = true;","				break;","			case 's':","				s = dateObject.getSeconds(); pad = true;","				break;","			case 'S':","				s = Math.round(dateObject.getMilliseconds() * Math.pow(10, l-3)); pad = true;","				break;","			case 'v': // FIXME: don't know what this is. seems to be same as z?","			case 'z':","				// We only have one timezone to offer; the one from the browser","				s = exports._getZone(dateObject, true, options);","				if(s){break;}","				l=4;","				// fallthrough... use GMT if tz not available","			case 'Z':","				var offset = exports._getZone(dateObject, false, options);","				var tz = [","					(offset<=0 ? \"+\" : \"-\"),","					string.pad(Math.floor(Math.abs(offset)/60), 2),","					string.pad(Math.abs(offset)% 60, 2)","				];","				if(l==4){","					tz.splice(0, 0, \"GMT\");","					tz.splice(3, 0, \":\");","				}","				s = tz.join(\"\");","				break;","//				case 'Y': case 'u': case 'W': case 'F': case 'g': case 'A':","//					console.log(match+\" modifier unimplemented\");","			default:","				throw new Error(\"dojo.date.locale.format: invalid pattern char: \"+pattern);","		}","		if(pad){ s = string.pad(s, l); }","		return s;","	});","}"];
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp"].lines = {"1":0,"2":0,"3":0,"7":0,"9":0,"10":0,"12":0,"13":0,"15":0,"17":0,"18":0,"19":0,"23":0,"25":0,"28":0,"31":0,"35":0,"38":0,"39":0,"40":0,"42":0,"47":0,"49":0,"51":0,"52":0,"53":0,"55":0,"56":0,"58":0,"59":0,"62":0,"63":0,"64":0,"65":0,"69":0,"70":0,"71":0,"73":0,"78":0,"80":0,"82":0,"83":0,"84":0,"89":0,"91":0,"93":0,"94":0,"96":0,"97":0,"99":0,"100":0,"102":0,"103":0,"105":0,"106":0,"108":0,"109":0,"111":0,"112":0,"114":0,"115":0,"119":0,"120":0,"120":0,"121":0,"124":0,"125":0,"130":0,"131":0,"132":0,"134":0,"135":0,"139":0,"141":0,"141":0,"142":0};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp"].functions = {"(anonymous 2):2":0,"formatPattern:1":0};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp"].coveredLines = 76;
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp"].coveredFunctions = 2;
function formatPattern(dateObject, bundle, options, pattern){
	_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp","", "formatPattern","2:2", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 2); 
return pattern.replace(/([a-z])\1*/ig, function(match){
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp","", "(anonymous 2)","3:142", "match:String");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 3); 
var s, pad,
			c = match.charAt(0),
			l = match.length,
			widthList = ["abbr", "wide", "narrow"];
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 7); 
switch(c){
			case 'G':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 9); 
s = bundle[(l < 4) ? "eraAbbr" : "eraNames"][dateObject.getFullYear() < 0 ? 0 : 1];
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 10); 
break;
			case 'y':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 12); 
s = dateObject.getFullYear();
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 13); 
switch(l){
					case 1:
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 15); 
break;
					case 2:
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 17); 
if(!options.fullYear){
							_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 18); 
s = String(s); s = s.substr(s.length - 2);
							_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 19); 
break;
						}
						// fallthrough
					default:
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 23); 
pad = true;
				}
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 25); 
break;
			case 'Q':
			case 'q':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 28); 
s = Math.ceil((dateObject.getMonth()+1)/3);
//					switch(l){
//						case 1: case 2:
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 31); 
pad = true;
//							break;
//						case 3: case 4: // unimplemented
//					}
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 35); 
break;
			case 'M':
			case 'L':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 38); 
var m = dateObject.getMonth();
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 39); 
if(l<3){
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 40); 
s = m+1; pad = true;
				}else{
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 42); 
var propM = [
						"months",
						c == 'L' ? "standAlone" : "format",
						widthList[l-3]
					].join("-");
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 47); 
s = bundle[propM][m];
				}
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 49); 
break;
			case 'w':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 51); 
var firstDay = 0;
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 52); 
s = exports._getWeekOfYear(dateObject, firstDay); pad = true;
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 53); 
break;
			case 'd':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 55); 
s = dateObject.getDate(); pad = true;
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 56); 
break;
			case 'D':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 58); 
s = exports._getDayOfYear(dateObject); pad = true;
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 59); 
break;
			case 'e':
			case 'c':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 62); 
var d = dateObject.getDay();
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 63); 
if(l<2){
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 64); 
s = (d - supplemental.getFirstDayOfWeek(options.locale) + 8) % 7
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 65); 
break;
				}
				// fallthrough
			case 'E':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 69); 
d = dateObject.getDay();
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 70); 
if(l<3){
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 71); 
s = d+1; pad = true;
				}else{
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 73); 
var propD = [
						"days",
						c == 'c' ? "standAlone" : "format",
						widthList[l-3]
					].join("-");
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 78); 
s = bundle[propD][d];
				}
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 80); 
break;
			case 'a':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 82); 
var timePeriod = dateObject.getHours() < 12 ? 'am' : 'pm';
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 83); 
s = options[timePeriod] || bundle['dayPeriods-format-wide-' + timePeriod];
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 84); 
break;
			case 'h':
			case 'H':
			case 'K':
			case 'k':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 89); 
var h = dateObject.getHours();
				// strange choices in the date format make it impossible to write this succinctly
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 91); 
switch (c){
					case 'h': // 1-12
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 93); 
s = (h % 12) || 12;
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 94); 
break;
					case 'H': // 0-23
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 96); 
s = h;
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 97); 
break;
					case 'K': // 0-11
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 99); 
s = (h % 12);
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 100); 
break;
					case 'k': // 1-24
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 102); 
s = h || 24;
						_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 103); 
break;
				}
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 105); 
pad = true;
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 106); 
break;
			case 'm':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 108); 
s = dateObject.getMinutes(); pad = true;
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 109); 
break;
			case 's':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 111); 
s = dateObject.getSeconds(); pad = true;
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 112); 
break;
			case 'S':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 114); 
s = Math.round(dateObject.getMilliseconds() * Math.pow(10, l-3)); pad = true;
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 115); 
break;
			case 'v': // FIXME: don't know what this is. seems to be same as z?
			case 'z':
				// We only have one timezone to offer; the one from the browser
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 119); 
s = exports._getZone(dateObject, true, options);
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 120); 
if(s){_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 120); 
break;}
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 121); 
l=4;
				// fallthrough... use GMT if tz not available
			case 'Z':
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 124); 
var offset = exports._getZone(dateObject, false, options);
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 125); 
var tz = [
					(offset<=0 ? "+" : "-"),
					string.pad(Math.floor(Math.abs(offset)/60), 2),
					string.pad(Math.abs(offset)% 60, 2)
				];
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 130); 
if(l==4){
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 131); 
tz.splice(0, 0, "GMT");
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 132); 
tz.splice(3, 0, ":");
				}
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 134); 
s = tz.join("");
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 135); 
break;
//				case 'Y': case 'u': case 'W': case 'F': case 'g': case 'A':
//					console.log(match+" modifier unimplemented");
			default:
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 139); 
throw new Error("dojo.date.locale.format: invalid pattern char: "+pattern);
		}
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 141); 
if(pad){ _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 141); 
s = string.pad(s, l); }
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\input_c.js.tmp", 142); 
return s;
	});
}
