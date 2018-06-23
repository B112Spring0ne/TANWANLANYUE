Ext.define('admin.model.AdminModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.adminModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'num',
		type : 'string',
		sortable : true
	}, {
		name : 'password',
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