define(["doh", "sample/testJS"],
function(doh, testJS){

	doh.register("sample.tests.testJS", [
	{
			// Test formatting and parsing of dates in various locales pre-built in dojo.cldr
			// NOTE: we can't set djConfig.extraLocale before bootstrapping unit tests, so directly
			// load resources here for specific locales:

		name: "test",
		runTest: function(t){
			//var res = testJS.addCommas("this is a test. because of test is my job. yes, it is.");
			var y = 5;
			var res = testJS.test(y);
			doh.assertEqual(res,y+1);
			
		}
	}
	]);
});