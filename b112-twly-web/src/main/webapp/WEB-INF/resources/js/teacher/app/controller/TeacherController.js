/*教师控制器*/
Ext.define('teacher.controller.TeacherController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.teacherController',
	stores : [ 'TeacherStore' ],
	models : [ 'TeacherModel' ],
	views : [ 'TeacherGrid', 'TeacherEdit' ],
	init : function() {
		this.control({
			'teacherGrid' : {
				itemdblclick : this.editTeacher
			},
			'teacherEdit button[action=save]' : {
				click : this.updateTeacher
			}
		});
	},
	editTeacher : function(grid, record) {
		var view = Ext.widget('teacherEdit');
		view.down('form').loadRecord(record);
	},
	updateTeacher : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});

