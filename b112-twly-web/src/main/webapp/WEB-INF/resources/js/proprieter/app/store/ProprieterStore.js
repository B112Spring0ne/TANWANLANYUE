var pageSize = 20;

Ext.define('proprieter.store.ProprieterStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.proprieterStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'proprieter.model.ProprieterModel',
	proxy : {
		/*社长的url*/
		url : server_context + '/proprieter/.json',
		type : 'ajax',
		api : {
			read : server_context + '/proprieter/.json',
			update : server_context + '/proprieter/.json'
		},
		/*社长的reader*/
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		/*社长的writer*/
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});