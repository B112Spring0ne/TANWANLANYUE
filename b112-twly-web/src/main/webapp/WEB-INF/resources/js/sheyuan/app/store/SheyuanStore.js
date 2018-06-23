var pageSize = 20;

Ext.define('sheyuan.store.SheyuanStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.sheyuanStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'sheyuan.model.SheyuanModel',
	proxy : {
		url : server_context + '/sheyuan/.json',
		type : 'ajax',
		api : {
			read : server_context + '/sheyuan/.json',
			update : server_context + '/sheyuan/.json'
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