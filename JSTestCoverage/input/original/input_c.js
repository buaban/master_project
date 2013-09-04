function formatPattern(dateObject, bundle, options, pattern){
	return pattern.replace(/([a-z])\1*/ig, function(match){
		var s, pad,
			c = match.charAt(0),
			l = match.length,
			widthList = ["abbr", "wide", "narrow"];
		switch(c){
			case 'G':
				s = bundle[(l < 4) ? "eraAbbr" : "eraNames"][dateObject.getFullYear() < 0 ? 0 : 1];
				break;
			case 'y':
				s = dateObject.getFullYear();
				switch(l){
					case 1:
						break;
					case 2:
						if(!options.fullYear){
							s = String(s); s = s.substr(s.length - 2);
							break;
						}
						// fallthrough
					default:
						pad = true;
				}
				break;
			case 'Q':
			case 'q':
				s = Math.ceil((dateObject.getMonth()+1)/3);
//					switch(l){
//						case 1: case 2:
						pad = true;
//							break;
//						case 3: case 4: // unimplemented
//					}
				break;
			case 'M':
			case 'L':
				var m = dateObject.getMonth();
				if(l<3){
					s = m+1; pad = true;
				}else{
					var propM = [
						"months",
						c == 'L' ? "standAlone" : "format",
						widthList[l-3]
					].join("-");
					s = bundle[propM][m];
				}
				break;
			case 'w':
				var firstDay = 0;
				s = exports._getWeekOfYear(dateObject, firstDay); pad = true;
				break;
			case 'd':
				s = dateObject.getDate(); pad = true;
				break;
			case 'D':
				s = exports._getDayOfYear(dateObject); pad = true;
				break;
			case 'e':
			case 'c':
				var d = dateObject.getDay();
				if(l<2){
					s = (d - supplemental.getFirstDayOfWeek(options.locale) + 8) % 7
					break;
				}
				// fallthrough
			case 'E':
				d = dateObject.getDay();
				if(l<3){
					s = d+1; pad = true;
				}else{
					var propD = [
						"days",
						c == 'c' ? "standAlone" : "format",
						widthList[l-3]
					].join("-");
					s = bundle[propD][d];
				}
				break;
			case 'a':
				var timePeriod = dateObject.getHours() < 12 ? 'am' : 'pm';
				s = options[timePeriod] || bundle['dayPeriods-format-wide-' + timePeriod];
				break;
			case 'h':
			case 'H':
			case 'K':
			case 'k':
				var h = dateObject.getHours();
				// strange choices in the date format make it impossible to write this succinctly
				switch (c){
					case 'h': // 1-12
						s = (h % 12) || 12;
						break;
					case 'H': // 0-23
						s = h;
						break;
					case 'K': // 0-11
						s = (h % 12);
						break;
					case 'k': // 1-24
						s = h || 24;
						break;
				}
				pad = true;
				break;
			case 'm':
				s = dateObject.getMinutes(); pad = true;
				break;
			case 's':
				s = dateObject.getSeconds(); pad = true;
				break;
			case 'S':
				s = Math.round(dateObject.getMilliseconds() * Math.pow(10, l-3)); pad = true;
				break;
			case 'v': // FIXME: don't know what this is. seems to be same as z?
			case 'z':
				// We only have one timezone to offer; the one from the browser
				s = exports._getZone(dateObject, true, options);
				if(s){break;}
				l=4;
				// fallthrough... use GMT if tz not available
			case 'Z':
				var offset = exports._getZone(dateObject, false, options);
				var tz = [
					(offset<=0 ? "+" : "-"),
					string.pad(Math.floor(Math.abs(offset)/60), 2),
					string.pad(Math.abs(offset)% 60, 2)
				];
				if(l==4){
					tz.splice(0, 0, "GMT");
					tz.splice(3, 0, ":");
				}
				s = tz.join("");
				break;
//				case 'Y': case 'u': case 'W': case 'F': case 'g': case 'A':
//					console.log(match+" modifier unimplemented");
			default:
				throw new Error("dojo.date.locale.format: invalid pattern char: "+pattern);
		}
		if(pad){ s = string.pad(s, l); }
		return s;
	});
}