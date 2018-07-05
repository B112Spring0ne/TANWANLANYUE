Ext.define('finance.view.FinanceEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.financeEdit',
	title : '编辑经济分配者信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [  {
				xtype : 'textfield',
				name : 'finance_name',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'finance_pass',
				fieldLabel : '密码'
			}, ]
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
