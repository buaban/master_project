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
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp"] = {
    lines: {},
    functions: {},
    coveredLines: 0,
    calledLines: 0,
    coveredFunctions: 0,
    calledFunctions: 0,
    path: "D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\input\\AutoSave.js.tmp",
    code: []
};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp"].code=["define([","	\"dojo\",","	\"dijit\",	// _scopeName","	\"dojox\",","	\"dijit/_base/manager\",	// getUniqueId()","	\"dijit/_base/popup\",","	\"dijit/_Widget\",","	\"dijit/_TemplatedMixin\",","	\"dijit/_WidgetsInTemplateMixin\",","	\"dijit/Dialog\",","	\"dijit/MenuItem\",","	\"dijit/Menu\",","	\"dijit/form/Button\",","	\"dijit/form/ComboButton\",","	\"dijit/form/ComboBox\",","	\"dijit/form/_TextBoxMixin\",	// selectInputText()","	\"dijit/form/TextBox\",","	\"dijit/TooltipDialog\",","	\"dijit/_editor/_Plugin\",","	\"dojo/_base/connect\",","	\"dojo/_base/declare\",","	\"dojo/date/locale\",","	\"dojo/i18n\",","	\"dojo/string\",","	\"dojox/editor/plugins/Save\",","	\"dojo/i18n!dojox/editor/plugins/nls/AutoSave\"","], function(dojo, dijit, dojox) {","","dojo.experimental(\"dojox.editor.plugins.AutoSave\");","","dojo.declare(\"dojox.editor.plugins._AutoSaveSettingDialog\", [dijit._Widget, dijit._TemplatedMixin, dijit._WidgetsInTemplateMixin], {","	","	// dialogTitle [public] String","	//		The tile of the Auto-Save setting dialog","	dialogTitle: \"\",","	","	// dialogDescription [public] String","	//		The description of the Auto-Save setting dialog","	dialogDescription: \"\",","	","	// paramName [public] String","	//		The name of the parameter (Auto-Save Interval)","	paramName: \"\",","	","	// paramLabel [public] String","	//		Minute","	paramLabel: \"\",","	","	// btnOk [public] String","	//		The label of the OK button","	btnOk: \"\",","	","	// btnCancel [public] String","	//		The label of the Cancel button","	btnCancel: \"\",","	","	widgetsInTemplate: true,","	","	templateString:","		\"<span id='${dialogId}' class='dijit dijitReset dijitInline' tabindex='-1'>\" +","			\"<div dojoType='dijit.Dialog' title='${dialogTitle}' dojoAttachPoint='dialog' \" +","				\"class='dijitEditorAutoSaveSettingDialog'>\" +","				\"<div tabindex='-1'>${dialogDescription}</div>\" +","				\"<div tabindex='-1' class='dijitEditorAutoSaveSettingInputArea'>${paramName}</div>\" +","				\"<div class='dijitEditorAutoSaveSettingInputArea' tabindex='-1'>\" +","					\"<input class='textBox' dojoType='dijit.form.TextBox' id='${textBoxId}' required='false' intermediateChanges='true' \" +","						\"selectOnClick='true' required='true' dojoAttachPoint='intBox' \" +","						\"dojoAttachEvent='onKeyDown: _onKeyDown, onChange: _onChange'/>\" +","					\"<label class='dijitLeft dijitInline boxLabel' \" +","						\"for='${textBoxId}' tabindex='-1'>${paramLabel}</label>\" +","				\"</div>\" +","				\"<div class='dijitEditorAutoSaveSettingButtonArea' tabindex='-1'>\" +","					\"<button dojoType='dijit.form.Button' dojoAttachEvent='onClick: onOk'>${btnOk}</button>\" +","					\"<button dojoType='dijit.form.Button' dojoAttachEvent='onClick: onCancel'>${btnCancel}</button>\" +","				\"</div>\" +","			\"</div>\" +","		\"</span>\",","	","	postMixInProperties: function(){","		this.id = dijit.getUniqueId(this.declaredClass.replace(/\\./g,\"_\"));","		this.dialogId = this.id + \"_dialog\";","		this.textBoxId = this.id + \"_textBox\";","	},","	","	show: function(){","		// summary:","		//		Display the setting dialog. If the internal interval value is \"\"","		//		set it to zero","		// tags:","		//		public","		if(this._value == \"\"){","			this._value = 0;","			this.intBox.set(\"value\", 0);","		}else{","			this.intBox.set(\"value\", this._value);","		}","		this.dialog.show();","		dijit.selectInputText(this.intBox.focusNode);","	},","	","	hide: function(){","		// summray:","		//		Hide the setting dialog.","		// tags:","		//		public","		this.dialog.hide();","	},","	","	onOk: function(){","		// summary:","		//		Handle the OK event and close the dialog.","		// tags:","		//		public","		this.dialog.hide();","	},","	","	onCancel: function(){","		// summary:","		//		Handle the Cancel event and close the dialog.","		// tags:","		//		public","		this.dialog.hide();","	},","	","	_onKeyDown: function(evt){","		// summary:","		//		Handle the keydown event","		//	tags:","		//		private","		if(evt.keyCode == dojo.keys.ENTER){","			this.onOk();","		}","	},","	","	_onChange: function(/*String*/ val){","		// summary:","		//		Check if the value is between 1 - 999.","		// tags:","		//		public","		if(this._isValidValue(val)){","			this._value = val;","		}else{","			this.intBox.set(\"value\", this._value);","		}","	},","	","	_setValueAttr: function(/*String*/ val){","		//	summary:","		//		Set the value attribute if it is acceptable","		// val:","		//		The invertal value","		// tags:","		//		private","		if(this._isValidValue(val)){","			this._value = val;","		}","	},","	","	_getValueAttr: function(){","		// summary:","		//		Get the interval value","		// tags:","		//		protected","		return this._value;","	},","	","	_isValidValue: function(/*String*/ val){","		// summary:","		//		Check if this value between 1- 999","		// tags:","		//		private","		var regExp = /^\\d{0,3}$/,","			_v = String(val);","		return Boolean(_v.match ? _v.match(regExp) : \"\");","	}","});","","dojo.declare(\"dojox.editor.plugins.AutoSave\", dojox.editor.plugins.Save, {","	// summary:","	//		This plugin provides the auto save capability to the editor. The","	//		plugin saves the content of the editor in interval. When","	//		the save action is performed, the document in the editor frame","	//		will be posted to the URL provided, or none, if none provided.","	","	// url [public]	String","	//		The URL to POST the content back to.  Used by the save function.","	url: \"\",","","	// logErrors [public] boolean","	//		Boolean flag to indicate that the default action for save and","	//		error handlers is to just log to console.  Default is true.","	logResults: true,","	","	// interval [public] Number","	//		The interval to perform the save action.","	interval: 0,","	","	// _iconClassPrefix [private] String","	//		This prefix of the CSS class","	_iconClassPrefix: \"dijitEditorIconAutoSave\",","	","	// _MIN [private const] Number","	//		Default 1 minute","	_MIN: 60000,","	","	_setIntervalAttr: function(val){","		// summary:","		//		Set the interval value.","		//		Delay the boundary check to _isValidValue of the dialog class","		// val:","		//		The interval value.","		// tags:","		//		private","		this.interval = val;","	},","	","	_getIntervalAttr: function(){","		// summary:","		//		Get the interval value","		// tags:","		//		private","		return this._interval;","	},","	","	setEditor: function(editor){","		// summary:","		//		Over-ride for the setting of the editor. No toggle button for","		//		this plugin. And start to save the content of the editor in","		//		interval","		// editor: Object","		//		The editor to configure for this plugin to use.","		this.editor = editor;","		this._strings = dojo.i18n.getLocalization(\"dojox.editor.plugins\", \"AutoSave\");","		this._initButton();","		","		this._saveSettingDialog = new dojox.editor.plugins._AutoSaveSettingDialog({","			\"dialogTitle\": this._strings[\"saveSettingdialogTitle\"],","			\"dialogDescription\": this._strings[\"saveSettingdialogDescription\"],","			\"paramName\": this._strings[\"saveSettingdialogParamName\"],","			\"paramLabel\": this._strings[\"saveSettingdialogParamLabel\"],","			\"btnOk\": this._strings[\"saveSettingdialogButtonOk\"],","			\"btnCancel\": this._strings[\"saveSettingdialogButtonCancel\"]","		});","		this.connect(this._saveSettingDialog, \"onOk\", \"_onDialogOk\");","		","		var pd = (this._promDialog = new dijit.TooltipDialog());","		pd.startup();","		pd.set(\"content\", \"\");","	},","	","	_initButton: function(){","		var menu = new dijit.Menu({","				style: \"display: none\"","			}),","			menuItemSave = new dijit.MenuItem({","				iconClass: this._iconClassPrefix + \"Default \" + this._iconClassPrefix,","				label: this._strings[\"saveLabel\"]","			}),","			menuItemAutoSave = (this._menuItemAutoSave = new dijit.MenuItem({","				iconClass: this._iconClassPrefix + \"Setting \" + this._iconClassPrefix,","				label: this._strings[\"saveSettingLabelOn\"]","			}));","			","		menu.addChild(menuItemSave);","		menu.addChild(menuItemAutoSave);","		this.button = new dijit.form.ComboButton({","			label: this._strings[\"saveLabel\"],","			iconClass: this._iconClassPrefix + \"Default \" + this._iconClassPrefix,","			showLabel: false,","			dropDown: menu","		});","		","		this.connect(this.button, \"onClick\", \"_save\");","		this.connect(menuItemSave, \"onClick\", \"_save\");","		this._menuItemAutoSaveClickHandler = dojo.connect(menuItemAutoSave, \"onClick\", this, \"_showAutSaveSettingDialog\");","	},","	","	_showAutSaveSettingDialog: function(){","		// summary:","		//		Show the setting dialog","		// tags:","		//		private","		var dialog = this._saveSettingDialog;","		dialog.set(\"value\", this.interval);","		dialog.show();","	},","	","	_onDialogOk: function(){","		// summary:","		//		If the interval is set (larger than 0), enable auto-save.","		// tags:","		//		private","		var interval = (this.interval = this._saveSettingDialog.get(\"value\") * this._MIN);","		if(interval > 0){","			this._setSaveInterval(interval);","			// Change the menu \"Set Auto-Save Interval...\" to \"Turn off Auto-Save\"","			// Connect it to another handler that terminates the auto-save.","			dojo.disconnect(this._menuItemAutoSaveClickHandler);","			this._menuItemAutoSave.set(\"label\", this._strings[\"saveSettingLabelOff\"]);","			this._menuItemAutoSaveClickHandler = dojo.connect(this._menuItemAutoSave, \"onClick\", this, \"_onStopClick\");","			// Change the icon of the main button to auto-save style","			this.button.set(\"iconClass\", this._iconClassPrefix + \"Setting \" + this._iconClassPrefix);","		}","	},","	","	_onStopClick: function(){","		// summary:","		//		Stop auto-save","		// tags:","		//		private","		this._clearSaveInterval();","		// Change the menu \"Turn off Auto-Save\" to \"Set Auto-Save Interval...\".","		// Connect it to another handler that show the setting dialog.","		dojo.disconnect(this._menuItemAutoSaveClickHandler);","		this._menuItemAutoSave.set(\"label\", this._strings[\"saveSettingLabelOn\"]);","		this._menuItemAutoSaveClickHandler = dojo.connect(this._menuItemAutoSave, \"onClick\", this, \"_showAutSaveSettingDialog\");","		// Change the icon of the main button","		this.button.set(\"iconClass\", this._iconClassPrefix + \"Default \" + this._iconClassPrefix);","	},","	","	_setSaveInterval: function(/*Number*/ interval){","		// summary:","		//		Function to trigger saving of the editor document","		// tags:","		//		private","		if(interval <= 0){","			return;","		}","		this._clearSaveInterval();","		this._intervalHandler = setInterval(dojo.hitch(this,  function(){","									if(!this._isWorking && !this.get(\"disabled\")){","										// If the plugin is not disabled (ViewSource, etc.)","										// and not working. Do saving!","										this._isWorking = true;","										this._save();","									}","								}), interval);","	},","	","	_clearSaveInterval: function(){","		if(this._intervalHandler){","			clearInterval(this._intervalHandler);","			this._intervalHandler = null;","		}","	},","","	onSuccess: function(resp, ioargs){","		// summary:","		//		User over-ridable save success function for editor content.","		// resp:","		//		The response from the server, if any, in text format.","		// tags:","		//		public","		this.button.set(\"disabled\", false);","		// Show the successful message","		this._promDialog.set(\"content\", dojo.string.substitute(","					this._strings[\"saveMessageSuccess\"], {\"0\": dojo.date.locale.format(new Date(), {selector: \"time\"})}));","				dijit.popup.open({popup: this._promDialog, around: this.button.domNode});","				this._promDialogTimeout = setTimeout(dojo.hitch(this, function(){","					clearTimeout(this._promDialogTimeout);","					this._promDialogTimeout = null;","					dijit.popup.close(this._promDialog);","				}), 3000);","		this._isWorking = false;","		if(this.logResults){","			console.log(resp);","		}","	},","","	onError: function(error, ioargs){","		// summary:","		//		User over-ridable save success function for editor content.","		// resp:","		//		The response from the server, if any, in text format.","		// tags:","		//		public","		this.button.set(\"disabled\", false);","		// Show the failure message","		this._promDialog.set(\"content\", dojo.string.substitute(","					this._strings[\"saveMessageFail\"], {\"0\": dojo.date.locale.format(new Date(), {selector: \"time\"})}));","				dijit.popup.open({popup: this._promDialog, around: this.button.domNode});","				this._promDialogTimeout = setTimeout(dojo.hitch(this, function(){","					clearTimeout(this._promDialogTimeout);","					this._promDialogTimeout = null;","					dijit.popup.close(this._promDialog);","				}), 3000);","		this._isWorking = false;","		if(this.logResults){","			console.log(error);","		}","	},","	","	destroy: function(){","		// summary:","		//		Cleanup of our plugin.","		this.inherited(arguments);","		","		this._menuItemAutoSave = null;","		","		if(this._promDialogTimeout){","			clearTimeout(this._promDialogTimeout);","			this._promDialogTimeout = null;","			dijit.popup.close(this._promDialog);","		}","		","		this._clearSaveInterval();","		","		if(this._saveSettingDialog){","			this._saveSettingDialog.destroyRecursive();","			this._destroyRecursive = null;","		}","		","		if(this._menuItemAutoSaveClickHandler){","			dojo.disconnect(this._menuItemAutoSaveClickHandler);","			this._menuItemAutoSaveClickHandler = null;","		}","	}","});","","// Register this plugin.","dojo.subscribe(dijit._scopeName + \".Editor.getPlugin\",null,function(o){","	if(o.plugin){ return; }","	var name = o.args.name.toLowerCase();","	if(name == \"autosave\"){","		o.plugin = new dojox.editor.plugins.AutoSave({","			url: (\"url\" in o.args) ? o.args.url : \"\",","			logResults: (\"logResults\" in o.args) ? o.args.logResults : true,","			interval: (\"interval\" in o.args) ? o.args.interval : 5","		});","	}","});","","return dojox.editor.plugins.AutoSave;","","});"];
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp"].lines = {"1":0,"29":0,"31":0,"80":0,"81":0,"82":0,"91":0,"92":0,"93":0,"95":0,"97":0,"98":0,"106":0,"114":0,"122":0,"130":0,"131":0,"140":0,"141":0,"143":0,"154":0,"155":0,"164":0,"172":0,"174":0,"178":0,"214":0,"222":0,"232":0,"233":0,"234":0,"236":0,"244":0,"246":0,"247":0,"248":0,"252":0,"264":0,"265":0,"266":0,"273":0,"274":0,"275":0,"283":0,"284":0,"285":0,"293":0,"294":0,"295":0,"298":0,"299":0,"300":0,"302":0,"311":0,"314":0,"315":0,"316":0,"318":0,"326":0,"327":0,"329":0,"330":0,"331":0,"334":0,"335":0,"341":0,"342":0,"343":0,"354":0,"356":0,"358":0,"359":0,"360":0,"361":0,"362":0,"364":0,"365":0,"366":0,"377":0,"379":0,"381":0,"382":0,"383":0,"384":0,"385":0,"387":0,"388":0,"389":0,"396":0,"398":0,"400":0,"401":0,"402":0,"403":0,"406":0,"408":0,"409":0,"410":0,"413":0,"414":0,"415":0,"421":0,"422":0,"422":0,"423":0,"424":0,"425":0,"433":0};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp"].functions = {"postMixInProperties:79":0,"show:85":0,"hide:101":0,"onOk:109":0,"onCancel:117":0,"_onKeyDown:125":0,"_onChange:135":0,"_setValueAttr:147":0,"_getValueAttr:159":0,"_isValidValue:167":0,"_setIntervalAttr:206":0,"_getIntervalAttr:217":0,"setEditor:225":0,"_initButton:251":0,"_showAutSaveSettingDialog:278":0,"_onDialogOk:288":0,"_onStopClick:306":0,"(anonymous 7):330":0,"_setSaveInterval:321":0,"_clearSaveInterval:340":0,"(anonymous 8):359":0,"onSuccess:347":0,"(anonymous 9):382":0,"onError:370":0,"destroy:393":0,"(anonymous 10):421":0,"(anonymous 6):27":0};
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp"].coveredLines = 108;
_yuitest_coverage["D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp"].coveredFunctions = 27;
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 1); 
define([
	"dojo",
	"dijit",	// _scopeName
	"dojox",
	"dijit/_base/manager",	// getUniqueId()
	"dijit/_base/popup",
	"dijit/_Widget",
	"dijit/_TemplatedMixin",
	"dijit/_WidgetsInTemplateMixin",
	"dijit/Dialog",
	"dijit/MenuItem",
	"dijit/Menu",
	"dijit/form/Button",
	"dijit/form/ComboButton",
	"dijit/form/ComboBox",
	"dijit/form/_TextBoxMixin",	// selectInputText()
	"dijit/form/TextBox",
	"dijit/TooltipDialog",
	"dijit/_editor/_Plugin",
	"dojo/_base/connect",
	"dojo/_base/declare",
	"dojo/date/locale",
	"dojo/i18n",
	"dojo/string",
	"dojox/editor/plugins/Save",
	"dojo/i18n!dojox/editor/plugins/nls/AutoSave"
], function(dojo, dijit, dojox) {

_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "(anonymous 6)","29:31", "dojo:null|dijit:null|dojox:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 29); 
dojo.experimental("dojox.editor.plugins.AutoSave");

_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 31); 
dojo.declare("dojox.editor.plugins._AutoSaveSettingDialog", [dijit._Widget, dijit._TemplatedMixin, dijit._WidgetsInTemplateMixin], {
	
	// dialogTitle [public] String
	//		The tile of the Auto-Save setting dialog
	dialogTitle: "",
	
	// dialogDescription [public] String
	//		The description of the Auto-Save setting dialog
	dialogDescription: "",
	
	// paramName [public] String
	//		The name of the parameter (Auto-Save Interval)
	paramName: "",
	
	// paramLabel [public] String
	//		Minute
	paramLabel: "",
	
	// btnOk [public] String
	//		The label of the OK button
	btnOk: "",
	
	// btnCancel [public] String
	//		The label of the Cancel button
	btnCancel: "",
	
	widgetsInTemplate: true,
	
	templateString:
		"<span id='${dialogId}' class='dijit dijitReset dijitInline' tabindex='-1'>" +
			"<div dojoType='dijit.Dialog' title='${dialogTitle}' dojoAttachPoint='dialog' " +
				"class='dijitEditorAutoSaveSettingDialog'>" +
				"<div tabindex='-1'>${dialogDescription}</div>" +
				"<div tabindex='-1' class='dijitEditorAutoSaveSettingInputArea'>${paramName}</div>" +
				"<div class='dijitEditorAutoSaveSettingInputArea' tabindex='-1'>" +
					"<input class='textBox' dojoType='dijit.form.TextBox' id='${textBoxId}' required='false' intermediateChanges='true' " +
						"selectOnClick='true' required='true' dojoAttachPoint='intBox' " +
						"dojoAttachEvent='onKeyDown: _onKeyDown, onChange: _onChange'/>" +
					"<label class='dijitLeft dijitInline boxLabel' " +
						"for='${textBoxId}' tabindex='-1'>${paramLabel}</label>" +
				"</div>" +
				"<div class='dijitEditorAutoSaveSettingButtonArea' tabindex='-1'>" +
					"<button dojoType='dijit.form.Button' dojoAttachEvent='onClick: onOk'>${btnOk}</button>" +
					"<button dojoType='dijit.form.Button' dojoAttachEvent='onClick: onCancel'>${btnCancel}</button>" +
				"</div>" +
			"</div>" +
		"</span>",
	
	postMixInProperties: function(){
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "postMixInProperties","80:82", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 80); 
this.id = dijit.getUniqueId(this.declaredClass.replace(/\./g,"_"));
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 81); 
this.dialogId = this.id + "_dialog";
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 82); 
this.textBoxId = this.id + "_textBox";
	},
	
	show: function(){
		// summary:
		//		Display the setting dialog. If the internal interval value is ""
		//		set it to zero
		// tags:
		//		public
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "show","91:98", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 91); 
if(this._value == ""){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 92); 
this._value = 0;
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 93); 
this.intBox.set("value", 0);
		}else{
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 95); 
this.intBox.set("value", this._value);
		}
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 97); 
this.dialog.show();
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 98); 
dijit.selectInputText(this.intBox.focusNode);
	},
	
	hide: function(){
		// summray:
		//		Hide the setting dialog.
		// tags:
		//		public
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "hide","106:106", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 106); 
this.dialog.hide();
	},
	
	onOk: function(){
		// summary:
		//		Handle the OK event and close the dialog.
		// tags:
		//		public
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "onOk","114:114", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 114); 
this.dialog.hide();
	},
	
	onCancel: function(){
		// summary:
		//		Handle the Cancel event and close the dialog.
		// tags:
		//		public
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "onCancel","122:122", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 122); 
this.dialog.hide();
	},
	
	_onKeyDown: function(evt){
		// summary:
		//		Handle the keydown event
		//	tags:
		//		private
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_onKeyDown","130:131", "evt:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 130); 
if(evt.keyCode == dojo.keys.ENTER){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 131); 
this.onOk();
		}
	},
	
	_onChange: function(/*String*/ val){
		// summary:
		//		Check if the value is between 1 - 999.
		// tags:
		//		public
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_onChange","140:143", "val:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 140); 
if(this._isValidValue(val)){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 141); 
this._value = val;
		}else{
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 143); 
this.intBox.set("value", this._value);
		}
	},
	
	_setValueAttr: function(/*String*/ val){
		//	summary:
		//		Set the value attribute if it is acceptable
		// val:
		//		The invertal value
		// tags:
		//		private
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_setValueAttr","154:155", "val:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 154); 
if(this._isValidValue(val)){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 155); 
this._value = val;
		}
	},
	
	_getValueAttr: function(){
		// summary:
		//		Get the interval value
		// tags:
		//		protected
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_getValueAttr","164:164", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 164); 
return this._value;
	},
	
	_isValidValue: function(/*String*/ val){
		// summary:
		//		Check if this value between 1- 999
		// tags:
		//		private
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_isValidValue","172:178", "val:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 172); 
var regExp = /^\d{0,3}$/,
			_v = String(val);
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 174); 
return Boolean(_v.match ? _v.match(regExp) : "");
	}
});

_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 178); 
dojo.declare("dojox.editor.plugins.AutoSave", dojox.editor.plugins.Save, {
	// summary:
	//		This plugin provides the auto save capability to the editor. The
	//		plugin saves the content of the editor in interval. When
	//		the save action is performed, the document in the editor frame
	//		will be posted to the URL provided, or none, if none provided.
	
	// url [public]	String
	//		The URL to POST the content back to.  Used by the save function.
	url: "",

	// logErrors [public] boolean
	//		Boolean flag to indicate that the default action for save and
	//		error handlers is to just log to console.  Default is true.
	logResults: true,
	
	// interval [public] Number
	//		The interval to perform the save action.
	interval: 0,
	
	// _iconClassPrefix [private] String
	//		This prefix of the CSS class
	_iconClassPrefix: "dijitEditorIconAutoSave",
	
	// _MIN [private const] Number
	//		Default 1 minute
	_MIN: 60000,
	
	_setIntervalAttr: function(val){
		// summary:
		//		Set the interval value.
		//		Delay the boundary check to _isValidValue of the dialog class
		// val:
		//		The interval value.
		// tags:
		//		private
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_setIntervalAttr","214:214", "val:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 214); 
this.interval = val;
	},
	
	_getIntervalAttr: function(){
		// summary:
		//		Get the interval value
		// tags:
		//		private
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_getIntervalAttr","222:222", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 222); 
return this._interval;
	},
	
	setEditor: function(editor){
		// summary:
		//		Over-ride for the setting of the editor. No toggle button for
		//		this plugin. And start to save the content of the editor in
		//		interval
		// editor: Object
		//		The editor to configure for this plugin to use.
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "setEditor","232:248", "editor:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 232); 
this.editor = editor;
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 233); 
this._strings = dojo.i18n.getLocalization("dojox.editor.plugins", "AutoSave");
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 234); 
this._initButton();
		
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 236); 
this._saveSettingDialog = new dojox.editor.plugins._AutoSaveSettingDialog({
			"dialogTitle": this._strings["saveSettingdialogTitle"],
			"dialogDescription": this._strings["saveSettingdialogDescription"],
			"paramName": this._strings["saveSettingdialogParamName"],
			"paramLabel": this._strings["saveSettingdialogParamLabel"],
			"btnOk": this._strings["saveSettingdialogButtonOk"],
			"btnCancel": this._strings["saveSettingdialogButtonCancel"]
		});
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 244); 
this.connect(this._saveSettingDialog, "onOk", "_onDialogOk");
		
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 246); 
var pd = (this._promDialog = new dijit.TooltipDialog());
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 247); 
pd.startup();
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 248); 
pd.set("content", "");
	},
	
	_initButton: function(){
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_initButton","252:275", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 252); 
var menu = new dijit.Menu({
				style: "display: none"
			}),
			menuItemSave = new dijit.MenuItem({
				iconClass: this._iconClassPrefix + "Default " + this._iconClassPrefix,
				label: this._strings["saveLabel"]
			}),
			menuItemAutoSave = (this._menuItemAutoSave = new dijit.MenuItem({
				iconClass: this._iconClassPrefix + "Setting " + this._iconClassPrefix,
				label: this._strings["saveSettingLabelOn"]
			}));
			
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 264); 
menu.addChild(menuItemSave);
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 265); 
menu.addChild(menuItemAutoSave);
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 266); 
this.button = new dijit.form.ComboButton({
			label: this._strings["saveLabel"],
			iconClass: this._iconClassPrefix + "Default " + this._iconClassPrefix,
			showLabel: false,
			dropDown: menu
		});
		
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 273); 
this.connect(this.button, "onClick", "_save");
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 274); 
this.connect(menuItemSave, "onClick", "_save");
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 275); 
this._menuItemAutoSaveClickHandler = dojo.connect(menuItemAutoSave, "onClick", this, "_showAutSaveSettingDialog");
	},
	
	_showAutSaveSettingDialog: function(){
		// summary:
		//		Show the setting dialog
		// tags:
		//		private
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_showAutSaveSettingDialog","283:285", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 283); 
var dialog = this._saveSettingDialog;
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 284); 
dialog.set("value", this.interval);
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 285); 
dialog.show();
	},
	
	_onDialogOk: function(){
		// summary:
		//		If the interval is set (larger than 0), enable auto-save.
		// tags:
		//		private
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_onDialogOk","293:302", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 293); 
var interval = (this.interval = this._saveSettingDialog.get("value") * this._MIN);
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 294); 
if(interval > 0){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 295); 
this._setSaveInterval(interval);
			// Change the menu "Set Auto-Save Interval..." to "Turn off Auto-Save"
			// Connect it to another handler that terminates the auto-save.
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 298); 
dojo.disconnect(this._menuItemAutoSaveClickHandler);
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 299); 
this._menuItemAutoSave.set("label", this._strings["saveSettingLabelOff"]);
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 300); 
this._menuItemAutoSaveClickHandler = dojo.connect(this._menuItemAutoSave, "onClick", this, "_onStopClick");
			// Change the icon of the main button to auto-save style
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 302); 
this.button.set("iconClass", this._iconClassPrefix + "Setting " + this._iconClassPrefix);
		}
	},
	
	_onStopClick: function(){
		// summary:
		//		Stop auto-save
		// tags:
		//		private
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_onStopClick","311:318", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 311); 
this._clearSaveInterval();
		// Change the menu "Turn off Auto-Save" to "Set Auto-Save Interval...".
		// Connect it to another handler that show the setting dialog.
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 314); 
dojo.disconnect(this._menuItemAutoSaveClickHandler);
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 315); 
this._menuItemAutoSave.set("label", this._strings["saveSettingLabelOn"]);
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 316); 
this._menuItemAutoSaveClickHandler = dojo.connect(this._menuItemAutoSave, "onClick", this, "_showAutSaveSettingDialog");
		// Change the icon of the main button
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 318); 
this.button.set("iconClass", this._iconClassPrefix + "Default " + this._iconClassPrefix);
	},
	
	_setSaveInterval: function(/*Number*/ interval){
		// summary:
		//		Function to trigger saving of the editor document
		// tags:
		//		private
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_setSaveInterval","326:330", "interval:Number");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 326); 
if(interval <= 0){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 327); 
return;
		}
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 329); 
this._clearSaveInterval();
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 330); 
this._intervalHandler = setInterval(dojo.hitch(this,  function(){
									_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "(anonymous 7)","331:335", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 331); 
if(!this._isWorking && !this.get("disabled")){
										// If the plugin is not disabled (ViewSource, etc.)
										// and not working. Do saving!
										_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 334); 
this._isWorking = true;
										_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 335); 
this._save();
									}
								}), interval);
	},
	
	_clearSaveInterval: function(){
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "_clearSaveInterval","341:343", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 341); 
if(this._intervalHandler){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 342); 
clearInterval(this._intervalHandler);
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 343); 
this._intervalHandler = null;
		}
	},

	onSuccess: function(resp, ioargs){
		// summary:
		//		User over-ridable save success function for editor content.
		// resp:
		//		The response from the server, if any, in text format.
		// tags:
		//		public
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "onSuccess","354:359", "resp:null|ioargs:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 354); 
this.button.set("disabled", false);
		// Show the successful message
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 356); 
this._promDialog.set("content", dojo.string.substitute(
					this._strings["saveMessageSuccess"], {"0": dojo.date.locale.format(new Date(), {selector: "time"})}));
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 358); 
dijit.popup.open({popup: this._promDialog, around: this.button.domNode});
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 359); 
this._promDialogTimeout = setTimeout(dojo.hitch(this, function(){
					_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "(anonymous 8)","360:366", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 360); 
clearTimeout(this._promDialogTimeout);
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 361); 
this._promDialogTimeout = null;
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 362); 
dijit.popup.close(this._promDialog);
				}), 3000);
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 364); 
this._isWorking = false;
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 365); 
if(this.logResults){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 366); 
console.log(resp);
		}
	},

	onError: function(error, ioargs){
		// summary:
		//		User over-ridable save success function for editor content.
		// resp:
		//		The response from the server, if any, in text format.
		// tags:
		//		public
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "onError","377:382", "error:null|ioargs:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 377); 
this.button.set("disabled", false);
		// Show the failure message
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 379); 
this._promDialog.set("content", dojo.string.substitute(
					this._strings["saveMessageFail"], {"0": dojo.date.locale.format(new Date(), {selector: "time"})}));
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 381); 
dijit.popup.open({popup: this._promDialog, around: this.button.domNode});
				_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 382); 
this._promDialogTimeout = setTimeout(dojo.hitch(this, function(){
					_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "(anonymous 9)","383:389", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 383); 
clearTimeout(this._promDialogTimeout);
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 384); 
this._promDialogTimeout = null;
					_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 385); 
dijit.popup.close(this._promDialog);
				}), 3000);
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 387); 
this._isWorking = false;
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 388); 
if(this.logResults){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 389); 
console.log(error);
		}
	},
	
	destroy: function(){
		// summary:
		//		Cleanup of our plugin.
		_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "destroy","396:421", "");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 396); 
this.inherited(arguments);
		
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 398); 
this._menuItemAutoSave = null;
		
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 400); 
if(this._promDialogTimeout){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 401); 
clearTimeout(this._promDialogTimeout);
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 402); 
this._promDialogTimeout = null;
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 403); 
dijit.popup.close(this._promDialog);
		}
		
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 406); 
this._clearSaveInterval();
		
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 408); 
if(this._saveSettingDialog){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 409); 
this._saveSettingDialog.destroyRecursive();
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 410); 
this._destroyRecursive = null;
		}
		
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 413); 
if(this._menuItemAutoSaveClickHandler){
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 414); 
dojo.disconnect(this._menuItemAutoSaveClickHandler);
			_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 415); 
this._menuItemAutoSaveClickHandler = null;
		}
	}
});

// Register this plugin.
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 421); 
dojo.subscribe(dijit._scopeName + ".Editor.getPlugin",null,function(o){
	_yuitest_coverfunc("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp","", "(anonymous 10)","422:433", "o:null");
_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 422); 
if(o.plugin){ _yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 422); 
return; }
	_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 423); 
var name = o.args.name.toLowerCase();
	_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 424); 
if(name == "autosave"){
		_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 425); 
o.plugin = new dojox.editor.plugins.AutoSave({
			url: ("url" in o.args) ? o.args.url : "",
			logResults: ("logResults" in o.args) ? o.args.logResults : true,
			interval: ("interval" in o.args) ? o.args.interval : 5
		});
	}
});

_yuitest_coverline("D:\Boxes\Dropbox\GIT\master_project\JSTestCoverage\input\AutoSave.js.tmp", 433); 
return dojox.editor.plugins.AutoSave;

});
