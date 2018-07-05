var pageSize = 20;

Ext.define('teacher.store.TeacherStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.teacherStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'teacher.model.TeacherModel',
	proxy : {
		url : server_context + '/teacher/.json',
		type : 'ajax',
		api : {
			read : server_context + '/teacher/.json',
			update : server_context + '/teacher/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});
