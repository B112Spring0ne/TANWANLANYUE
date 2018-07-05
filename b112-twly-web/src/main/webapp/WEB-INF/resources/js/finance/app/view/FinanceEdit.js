Ext.define('finance.view.FinanceEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.financeEdit',
	title : '编辑经济分配者信息',
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
