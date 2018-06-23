Ext.define('admin.view.AdminEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.adminEdit',
	title : '管理员信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'num',
				fieldLabel : '管理员账号'
			},{
				xtype : 'textfield',
				name : 'password',
				fieldLabel : '密码'
			} ]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});