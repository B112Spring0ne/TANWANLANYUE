Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'proprieter',
	appFolder : server_context + '/resources/js/proprieter/app',
	controllers : [ 'ProprieterController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'proprieterGrid'
			} ]
		});
	}
});
