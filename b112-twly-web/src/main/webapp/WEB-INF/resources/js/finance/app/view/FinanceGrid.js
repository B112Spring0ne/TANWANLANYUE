/*显示表*/
var pageSize = 20;

var financeStore = Ext.create('finance.store.FinanceStore');

Ext.define('finance.view.FinanceGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.financeGrid',
	/*我的表标题显示*/
	title : 'Java EE 经济分配者列表',
	store : financeStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "姓名",
		width : 100,
		sortable : true,
		dataIndex : 'financename'
	}, {
		text : "密码",
		width : 150,
		sortable : true,
		dataIndex : 'password'
	}, {
		text : "添加时间",
		width : 150,
		dataIndex : 'dateCreated',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	}, {
		text : "修改时间",
		width : 150,
		dataIndex : 'dateModified',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : financeStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});
