/*表信息*/
Ext.define('proprieter.view.ProprieterEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.proprieterEdit',
	title : '编辑社长信息',
	layout : 'fit',
	autoShow : true,
	/*表的设计*/
	initComponent : function() {
		/*表的长宽显示*/
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			/*表的名字与数据库的名字对应操作，fieldLabel为表显示*/
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
		/*按钮为保存取消操作*/
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
