/*社员类显示的编辑*/
Ext.define('sheyuan.view.SheyuanEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.sheyuanEdit',
	title : '编辑社员信息',
	layout : 'fit',
	autoShow : true,
	/*定义表的基本属性如长300宽300*/
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			/*表头名字*/
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
		/*保存取消按钮*/
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
