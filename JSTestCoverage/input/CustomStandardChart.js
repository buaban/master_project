dojo.provide("html5FinancialCharts.CustomStandardChart");

dojo.declare("html5FinancialCharts.CustomStandardChart", null, {
	drawChart: function (chartObj, customData) {
		if (!chartObj)
			return;

		this.chartObj = chartObj;

		if (customData && customData.length) {
			this.seriesParamList = this.fillSeriesParamList(customData);
		}
		else {
			chartObj.drawChart();
			return;
		}

		var dataGatherer = chartObj.getDataGatherer();

		if (dataGatherer.ricList.length && dataGatherer.ricList[0] != '') {
			var that = this;
			window.setTimeout(function () { that.chartObj.showHideSpinner(true); }, 100);
			this.getDataGatherer().doDataRequest();
		}
		else {
			var compositeChartParam = new TRWebchart_Fin.CompositeChartParam([this.seriesParamList], [1], [chartObj.getDataGatherer().yAxisOptionsList], null);

			chartObj.setCompositeChartParam(compositeChartParam);
			chartObj.useDataGatherer = false;
			chartObj.drawChart();
		}
	},
	fillSeriesParamList: function (customData) {
		var seriesParamList = [];

		for (var i = 0; i < customData.length; i++) {
			var dataItem = customData[i];

			for (var j = 0; j < dataItem.Columns.length; j++) {
				if (dataItem.Columns[j].Name == 'Date') {
					for (var k = 0; k < dataItem.Columns[j].Values.length; k++) {
						dataItem.Columns[j].Values[k] = new Date(dataItem.Columns[j].Values[k]);
					}
				}
			}

			var seriesParam = new TRWebchart_Shared.SeriesParam(
				dataItem.Symbol,
				new TRWebchart_Bus.SeriesData(dataItem.Columns),
				TRWebchart_Shared.ChartType.FilledLine,
				'Date',
				['Close'],
				'1',
				TRWebchart_Shared.LineStyle.Solid,
				false);

			seriesParamList.push(seriesParam);
		}

		return seriesParamList;
	},
	dataLoaded: function (compositeChartParam, displayRange) {
		for (var i = 0; i < this.seriesParamList.length; i++) {
			compositeChartParam.arrayOfSeriesParamList[0].push(this.seriesParamList[i]);
		}

		this.chartObj.setCompositeChartParam(compositeChartParam);
		this.chartObj.setDisplayRange(this.chartObj.getNewDisplayRange(compositeChartParam, displayRange));
		this.chartObj.useDataGatherer = false;
		this.chartObj.setExpandDatesEnabled(true);
		this.chartObj.drawChart();
	},
	getDataGatherer: function () {
		if (!this.dataGatherer) {
			this.dataGatherer = this.chartObj.getDataGatherer();
			var that = this;
			this.dataGatherer.onDataReady = function (compositeChartParam, displayRange) {
				that.dataGatherer.hasDataComeBack = true;
				that.chartObj.showHideSpinner(false);
				that.dataLoaded(compositeChartParam, displayRange);
			};
		}

		return this.dataGatherer;
	}
});
