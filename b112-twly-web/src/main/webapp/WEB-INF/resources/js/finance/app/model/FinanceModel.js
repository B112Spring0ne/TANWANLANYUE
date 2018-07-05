/*对应表中数据*/
Ext.define('finance.model.FinanceModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.financeModel',
	fields : [ {
		/*财务管理员id*/
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		/*财务管理员名字*/
		name : 'financename',
		type : 'string',
		sortable : true
	}, {
		/*登录密码*/
		name : 'password',
		type : 'string',
		sortable : true
	},  {
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