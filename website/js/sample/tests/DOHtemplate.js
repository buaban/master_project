define(["doh", "[MODULE_PATH]"],
function(doh, [MODULE_LOADER]){

	doh.register("[TEST_PATH].[MODULE_LOADER]", [
	{
		name: "[ITERATION]",
		runTest: function(t){
			//var res = testJS.addCommas("this is a test. because of test is my job. yes, it is.");
			//var y = 5;
			var res = [MODULE_LOADER].[FUNCTIONNAME]([PARAMETERS]);
			//doh.assertEqual(res,y+1);
			
		}
	}
	]);
});