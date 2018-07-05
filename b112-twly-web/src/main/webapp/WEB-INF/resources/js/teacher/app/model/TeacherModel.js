/*对应表中数据*/
Ext.define('teacher.model.TeacherModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.teacherModel',
	fields : [ {
		/*教师id*/
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		/*教师名字*/
		name : 'teacherName',
		type : 'string',
		sortable : true
	}, {
		/*教师密码*/
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