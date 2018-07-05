/*对应表中数据*/
Ext.define('proprieter.model.ProprieterModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.proprieterModel',
	fields : [ {
		/*社长id*/
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		/*社长姓名*/
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		/*社长密码*/
		name : 'password',
		type : 'string',
		sortable : true
	}, {
		/*社长电子邮件*/
		name : 'email',
		type : 'string',
		sortable : true
	}, {
		/*社长的社团名称*/
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