Ext.define('sheyuan.view.SheyuanEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.sheyuanEdit',
	title : '编辑社员信息',
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
				name : 'mail',
				fieldLabel : '邮箱'
			}, {
				xtype : 'textfield',
				name : 'useName',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'password',
				fieldLabel : '密码'
			}, {
				xtype : 'textfield',
				name : 'mass',
				fieldLabel : '社团'
			}]
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