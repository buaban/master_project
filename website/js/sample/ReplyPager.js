dojo.provide("space.widget.ReplyPager");

dojo.require("dijit._Widget");
dojo.require("space.widget.Templated");
dojo.require("space.commonUtils");
dojo.require("dojo.i18n");
dojo.requireLocalization("messages", "SpacePagerMessages");

dojo.declare("space.widget.ReplyPager", [dijit._Widget, space.widget.Templated], {
	templateString: "<p class=\"pagination\"></p>",
	itemTemplate: "&nbsp;<a href='javascript:void(0)' onclick='${Click}'>${Text}</a>",
	currentItemTemplate: "&nbsp;<strong>${Text}</strong>",
	errorEventName: "space.widget.Pager.Error",
	alertOnError: false,
	onItemClick: null,
	pagesRange: 4,
	firstItemText: '',
	prevItemText: '',
	nextItemText: '',
	lastItemText: '',
	pageLabel: '',
	totalPages: 0,
	currentPageIndex: 0,
	labels: {},

	preamble: function() {
		this.labels = dojo.mixin(this.labels, dojo.i18n.getLocalization("messages", "SpacePagerMessages"));

		this.firstItemText = this.labels.firstNewItemText;
		this.prevItemText = this.labels.prevNewItemText;
		this.nextItemText = this.labels.nextNewItemText;
		this.lastItemText = this.labels.lastNewItemText;
		this.pageLabel = this.labels.pageLabel;

	},

	show: function(show) {
		if (show) {
			this.domNode.style.display = 'block';
		}
		else {
			this.domNode.style.display = 'none';
		}
	},

	calcItems: function(totalItems, pageStart, pageSize) {
		try {
			if (totalItems > 0) {
				totalPages = Math.floor((totalItems - 1) / pageSize + 1);
			}

			if (pageStart < 0) {
				currentPageIndex = Math.floor(Math.max(pageStart + totalItems, 0) / pageSize);
			}
			else {
				currentPageIndex = Math.floor(Math.min(pageStart, totalItems) / pageSize);
			}

			this.updateDom(totalItems, pageStart, pageSize)
		}
		catch (exc) {
			this.reportError('unexpected exception in "space.widget.Pager.calcItems", the name is: ' + exc.name + ', the message is: ' + exc.message);
		}
	},

	updateDom: function(totalItems, pageStart, pageSize) {
		try {
			this.clear();

			if (totalItems > pageSize) {
				var pagerItems = this.calcPagerItems(totalItems, pageStart, pageSize);

				var pagerString = "";

				
					var indexSpan = "<span>" + this.pageLabel + "</span>";
					pagerString += indexSpan;

					for (var i = 0; i < pagerItems.length; i++) {
						//var node = document.createElement("td");
						//node.innerHTML = items[i];
						//this.rootNode.appendChild(node);
						pagerString += pagerItems[i];
						//this.rootNode.appendChild(items[i]);
					}

					pagerString += "<img class=\"itemloadingImg\" src=\"/controls/images/space/loading_16x16.gif\" alt=\"Loading\" style=\"display:none;\" />";
				
				dojo.place(pagerString, this.domNode);
			}
		}
		catch (exc) {
			this.reportError('unexpected exception in "space.widget.Pager.updateDom", the name is: ' + exc.name + ', the message is: ' + exc.message);
		}
	},

	calcPagerItems: function(totalItems, pageStart, pageSize) {
		var pagingItems = new Array();
		var arrayIndex = 0;

		if (totalItems <= 0)
			return pagingItems;

		if (pageSize <= 0)
			throw { message: "The 'PageSize' value is less then '0'." };

		var lastPage = Math.floor((totalItems - 1) / pageSize);
		var rangeBefore = Math.floor(this.pagesRange / 2);
		var rangeAfter = this.pagesRange - rangeBefore;
		var addToEnd = (rangeBefore > currentPageIndex) ? rangeBefore - currentPageIndex : 0;
		var addToStart = (rangeAfter + currentPageIndex > lastPage) ? rangeAfter + currentPageIndex - lastPage : 0;
		var pStart = (currentPageIndex > rangeBefore + addToStart) ? currentPageIndex - rangeBefore - addToStart : 0;
		var pEnd = (currentPageIndex + rangeAfter + addToEnd < lastPage) ? currentPageIndex + rangeAfter + addToEnd : lastPage;

		if (currentPageIndex > 1) {
			pagingItems[arrayIndex++] = dojo.string.substitute(this.itemTemplate, { Text: this.firstItemText, Click: 'dijit.byId("' + this.id + '").internalClickHandler(' + (0 * pageSize) + ');' });

		}

		if (currentPageIndex > pStart) {
			pagingItems[arrayIndex++] = dojo.string.substitute(this.itemTemplate, { Text: this.prevItemText, Click: 'dijit.byId("' + this.id + '").internalClickHandler(' + ((currentPageIndex - 1) * pageSize) + ');' });

		}

		for (var i = pStart; i <= pEnd; i++) {
			if (i == currentPageIndex) {
				pagingItems[arrayIndex++] = dojo.string.substitute(this.currentItemTemplate, { Text: i + 1, Click: 'javascript:void(0)' }); // SELECTED ITEM CLASS!!!
			}
			else {
				pagingItems[arrayIndex++] = dojo.string.substitute(this.itemTemplate, { Text: i + 1, Click: 'dijit.byId("' + this.id + '").internalClickHandler(' + (i * pageSize) + ');' });
			}
		}

		if (currentPageIndex < lastPage) {

			pagingItems[arrayIndex++] = dojo.string.substitute(this.itemTemplate, { Text: this.nextItemText, Click: 'dijit.byId("' + this.id + '").internalClickHandler(' + ((currentPageIndex + 1) * pageSize) + ');' });
			//pagingItems[arrayIndex++] = {Text: this.lastItemText, Click: 'dijit.byId("'+ this.id + '").internalClickHandler(' + (lastPage * pageSize) + ');' };
		}

		return pagingItems;
	},

	clear: function() {
		try {
			dojo.query("*", this.domNode).orphan();
		}
		catch (exc) {
			this.reportError('unexpected exception in "space.widget.Pager.clear",the name is: ' + exc.name + ', the message is: ' + exc.message);
		}
	},

	internalClickHandler: function(start) {
		try {
			if (this.onItemClick) {
				this.onItemClick(start);
			}
		}
		catch (exc) {
			this.reportError('unexpected exception in "space.widget.Pager.internalClickHandler", the name is: ' + exc.name + ', the message is: ' + exc.message);
		}
	},

	reportError: function(msg) {
		try {
			if (this.errorEventName) {
				dojo.publish(this.errorEventName, [{
					message: 'CommentariesSearchBrief: ' + msg,
					type: 'Error',
					duration: this.displayErrorMsc
}]);
				}

				if (this.alertOnError) {
					alert(msg);
				}
			}
			catch (exc) {
				this.reportError('unexpected exception in "reportError: function(msg)",the name is: ' + exc.name + ', the message is: ' + exc.message);

				if (this.alertOnError) {
					alert('Unexpected exception in "space.widget.Pager.reportError", the name is: ' + exc.name + ', the message is:' + exc.message);
				}
			}
		}
	});