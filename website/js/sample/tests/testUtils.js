define(["doh", "sample/commonUtils"],

function(doh, commonUtils){	
		
	doh.register("sample.tests.testUtils", [
	{
		name: "test breakWords",
		runTest: function(t){
			//var res = testJS.addCommas("this is a test. because of test is my job. yes, it is.");
			var y = 5;
			var str = commonUtils.breakWords("This is a test. This is not real, truth.",2,"-");
			
			doh.assertEqual("Th-is is a te-st. Th-is is no-t re-al, tr-ut-h.", str);
			
		}
	},
	{
		name: "test addCommas",
		runTest: function(t){
			//var res = testJS.addCommas("this is a test. because of test is my job. yes, it is.");
			var y = 5;
			var str = commonUtils.addCommas("This is a test. This is not real, truth.");
			
			doh.assertEqual("This is a test. This is not real, truth", str);
			
		}
	}
	
	]
	
	);
});