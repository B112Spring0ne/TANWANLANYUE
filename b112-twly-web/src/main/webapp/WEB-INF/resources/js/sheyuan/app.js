Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'sheyuan',
	appFolder : server_context + '/resources/js/sheyuan/app',
	controllers : [ 'SheyuanController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'sheyuanGrid'
			} ]
		});
	}
});
