var pageSize = 20;

Ext.define('admin.store.AdminStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.adminStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'admin.model.AdminModel',
	proxy : {
		url : server_context + '/admin/.json',
		type : 'ajax',
		api : {
			read : server_context + '/admin/.json',
			update : server_context + '/admin/.json'
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