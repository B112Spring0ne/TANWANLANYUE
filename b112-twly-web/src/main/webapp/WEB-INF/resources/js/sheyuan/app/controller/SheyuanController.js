Ext.define('sheyuan.controller.SheyuanController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.sheyuanController',
	stores : [ 'SheyuanStore' ],
	models : [ 'SheyuanModel' ],
	views : [ 'SheyuanGrid', 'SheyuanEdit' ],
	init : function() {
		this.control({
			'sheyuanGrid' : {
				itemdblclick : this.editSheyuan
			},
			'sheyuanEdit button[action=save]' : {
				click : this.updateSheyuan
			}
		});
	},
	editSheyuan : function(grid, record) {
		var view = Ext.widget('sheyuanEdit');
		view.down('form').loadRecord(record);
	},
	updateSheyuan : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
