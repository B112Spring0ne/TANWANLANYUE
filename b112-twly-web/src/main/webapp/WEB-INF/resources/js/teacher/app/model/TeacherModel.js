Ext.define('teacher.model.TeacherModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.teacherModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'teacherName',
		type : 'string',
		sortable : true
	}, {
		name : 'teacherpassword',
		type : 'string',
		sortable : true
	}, {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});