define(["doh", "[MODULE_PATH]"],
function(doh, [MODULE_LOADER]){

	doh.register("[MODULE_LOADER]", [
	{
		name: "[ITERATION]",
		runTest: function(t){
			//var res = testJS.addCommas("this is a test. because of test is my job. yes, it is.");
			//var y = 5;
			var res = [MODULE_LOADER].[FUNCTION_NAME]([PARAMETERS]);
			//doh.assertEqual(res,y+1);
			
		}
	}
	]);
});