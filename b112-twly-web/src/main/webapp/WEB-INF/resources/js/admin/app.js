Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'admin',
	appFolder : server_context + '/resources/js/admin/app',
	controllers : [ 'AdminController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'adminGrid'
			} ]
		});
	}
});
