dojo.provide("html5FinancialCharts.ResizingManager");

dojo.declare("html5FinancialCharts.ResizingManager", null, {
	initialized: false,
	readyToResize: true,
	chartsInfo: [],
	onPreResize: function (e) { },
	onPostResize: function (e) { },
	registerChart: function (chart, chartId, chartWidth, chartHeight, minWidth, maxWidth) {
		var that = this;

		var chartInfo = {
			chart: chart,
			chartId: chartId,
			chartWidth: chartWidth,
			chartHeight: chartHeight,
			minWidth: minWidth ? minWidth : 285,
			maxWidth: maxWidth ? maxWidth : 0,
			isAlive: true,
			lastClientWidth: 0,
			lastClientHeight: 0
		};

		var found = false;

		for (var i = 0; i < this.chartsInfo.length; i++) {
			if (this.chartsInfo[i].chartId == chartId) {
				found = true;
				this.chartsInfo[i] = chartInfo;
				break;
			}
		}

		if (!found)
			this.chartsInfo.push(chartInfo);

		if (!this.initialized) {
			dojo.addOnLoad(function () {
				if (!dojo.isIE) {
					dojo.connect(window, 'onresize', function (args) {
						if (that.readyToResize) {
							that.readyToResize = false;
							setTimeout(function () {
								that.resizeInternal(that);
								that.readyToResize = true;
							}, 100);
						}
					});
					setTimeout(function () {
						that.resizeIfChartVisualStateChanged(that);
					}, 100);
				}
			});

			this.initialized = true;
		}

		dojo.addOnLoad(function () {
			if (!dojo.isIE) {
				that.resizeInternal(that);
			}
			else {
				var chartDivHolder = document.getElementById(chartId);
				chartDivHolder.style.width = "100%";
			}
		});
	},
	resize: function () {
		this.resizeInternal(this);
	},
	resizeInternal: function (that) {
		for (var i = 0; i < that.chartsInfo.length; i++) {
			var chartInfo = that.chartsInfo[i];

			if (chartInfo.isAlive && chartInfo.chart) {
				var chartContainer = document.getElementById(chartInfo.chartId);

				if (chartContainer) {
					if (chartContainer.clientWidth != 0 && chartContainer.clientHeight != 0)
						chartInfo.needResize = true;
					else
						continue;

					if (chartInfo.chart.compositeChartLayout && chartInfo.chart.compositeChartLayout.chartHolderId) {
						var chartHolder = document.getElementById(chartInfo.chart.compositeChartLayout.chartHolderId);

						if (chartHolder) {
							chartHolder.style.width = "100%";

							while (chartHolder.firstChild) {
								chartHolder.removeChild(chartHolder.firstChild);
							}
						}
					}
					else {
						that.setSize(that, chartContainer);
					}

					chartContainer.style.width = "100%";
				}
				else {
					chartInfo.isAlive = false;
				}
			}
		}

		var wasChanged;

		do {
			wasChanged = false;

			for (var i = 0; i < that.chartsInfo.length; i++) {
				var chartInfo = that.chartsInfo[i];

				if (chartInfo.isAlive && chartInfo.chart && chartInfo.needResize) {
					var chartContainer = document.getElementById(chartInfo.chartId);

					if (chartContainer.offsetParent) {
						if (chartContainer.offsetParent.offsetWidth < chartInfo.minWidth) {
							chartContainer.style.width = chartInfo.minWidth + "px";
							wasChanged = true;
						}
						else if (chartInfo.maxWidth != 0 && chartContainer.offsetParent.offsetWidth > chartInfo.maxWidth) {
							chartContainer.style.width = chartInfo.maxWidth + "px";
							wasChanged = true;
						}
					}
				}
			}
		} while (wasChanged);

		that.onPreResize();

		for (var i = 0; i < that.chartsInfo.length; i++) {
			var chartInfo = that.chartsInfo[i];

			if (chartInfo.isAlive && chartInfo.chart && chartInfo.needResize) {
				chartInfo.chart.resizeChart();
				chartInfo.needResize = false;
			}
		}

		that.onPostResize();
	},
	setSize: function (that, elem) {
		if (elem) {
			if (elem.width)
				elem.width = "0px";

			if (elem.style.width)
				elem.style.width = "0px";

			if (elem.children) {
				for (var i = 0; i < elem.children.length; i++) {
					that.setSize(that, elem.children[i]);
				}
			}
		}
	},
	resizeIfChartVisualStateChanged: function (that) {
		var needResize = false;

		for (var i = 0; i < that.chartsInfo.length; i++) {
			var chartInfo = that.chartsInfo[i];

			var chartContainer = document.getElementById(chartInfo.chartId);

			if (chartContainer) {
				if (chartInfo.lastClientWidth == 0 && chartInfo.lastClientHeight == 0 && chartContainer.clientWidth != 0 && chartContainer.clientHeight != 0)
					needResize = true;

				chartInfo.lastClientWidth = chartContainer.clientWidth;
				chartInfo.lastClientHeight = chartContainer.clientHeight;
			}
		}

		if (needResize)
			that.resizeInternal(that);

		setTimeout(function () {
			that.resizeIfChartVisualStateChanged(that);
		}, 100);
	},
	clearChartInfo: function () {
		this.chartsInfo = [];
	}
});
