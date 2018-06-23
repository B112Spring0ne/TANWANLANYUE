Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'teacher',
	appFolder : server_context + '/resources/js/teacher/app',
	controllers : [ 'TeacherController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'teacherGrid'
			} ]
		});
	}
});
