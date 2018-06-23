Ext.define('teacher.view.TeacherEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.teacherEdit',
	title : '编辑教师信息',
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
				name : 'TeacherName',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'Teacherpassword',
				fieldLabel : '密码'
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
