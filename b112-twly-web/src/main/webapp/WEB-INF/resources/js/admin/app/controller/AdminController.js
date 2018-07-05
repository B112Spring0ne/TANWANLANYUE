Ext.define('admin.controller.AdminController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.adminController',
	stores : [ 'AdminStore' ],
	models : [ 'AdminModel' ],
	views : [ 'AdminGrid', 'AdminEdit' ],
	init : function() {
		this.control({
			'adminGrid' : {
				itemdblclick : this.editAdmin
			},
			'adminEdit button[action=save]' : {
				click : this.updateAdmin
			}
		});
	},
	editAdmin : function(grid, record) {
		var view = Ext.widget('adminEdit');
		view.down('form').loadRecord(record);
	},
	updateAdmin : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
