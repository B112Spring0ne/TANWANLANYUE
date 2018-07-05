/*模型方法*/
Ext.define('sheyuan.model.SheyuanModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.sheyuanModel',
	/*与表中数据一一对应，名字和类型*/
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		name : 'password',
		type : 'string',
		sortable : true
	}, {
		name : 'email',
		type : 'string',
		sortable : true
	}, {
		name : 'post',
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