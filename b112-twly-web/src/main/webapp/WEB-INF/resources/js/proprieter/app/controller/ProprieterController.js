/*社长控制器*/
Ext.define('proprieter.controller.ProprieterController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.proprieterController',
	stores : [ 'ProprieterStore' ],
	models : [ 'ProprieterModel' ],
	views : [ 'ProprieterGrid', 'ProprieterEdit' ],
	init : function() {
		this.control({
			'proprieterGrid' : {
				itemdblclick : this.editProprieter
			},
			'proprieterEdit button[action=save]' : {
				click : this.updateProprieter
			}
		});
	},
	editProprieter : function(grid, record) {
		var view = Ext.widget('proprieterEdit');
		view.down('form').loadRecord(record);
	},
	updateProprieter : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
