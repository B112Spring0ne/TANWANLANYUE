Ext.define('finance.model.FinanceModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.financeModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'financename',
		type : 'string',
		sortable : true
	}, {
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