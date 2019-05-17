<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<html lang="en">

<head>
	<title>Home</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<script src="../assets/vendor/jquery/jquery.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="../assets/vendor/jquery/bootstrap-table.js"></script>
	<script src="../assets/vendor/jquery/bootstrap-table-zh-CN.js"></script>
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
<!-- <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script> -->
<script src="https://cdn.bootcss.com/moment.js/2.22.0/moment-with-locales.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>
	<link rel="stylesheet" href="../assets/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="../assets/vendor/bootstrap/css/bootstrap-table.css">
	<link rel="stylesheet" href="../assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="../assets/vendor/linearicons/style.css">
	<link rel="stylesheet" href="../assets/vendor/chartist/css/chartist-custom.css">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href="../assets/css/main.css">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href="../assets/css/demo.css">
	<link rel="stylesheet" href="../assets/css/fileinput.css">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="../assets/img/favicon.png">
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<!-- NAVBAR -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="brand">
				<a href="index.html"><img src="../assets/img/logo-dark.png" alt="Klorofil Logo" class="img-responsive logo"></a>
			</div>
			<div class="container-fluid">
				<div class="navbar-btn">
					<button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
				</div>
				<form class="navbar-form navbar-left">
					<div class="input-group">
						<input type="text" value="" class="form-control" placeholder="Search dashboard...">
						<span class="input-group-btn"><button type="button" class="btn btn-primary">Go</button></span>
					</div>
				</form>
				<div class="navbar-btn navbar-btn-right">
					<a class="btn btn-success update-pro" href="#downloads/klorofil-pro-bootstrap-admin-dashboard-template/?utm_source=klorofil&utm_medium=template&utm_campaign=KlorofilPro" title="Upgrade to Pro" target="_blank"><i class="fa fa-rocket"></i> <span>UPGRADE TO PRO</span></a>
				</div>
				<div id="navbar-menu">
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown">
							<a href="#" class="dropdown-toggle icon-menu" data-toggle="dropdown">
								<i class="lnr lnr-alarm"></i>
								<span class="badge bg-danger">5</span>
							</a>
							<ul class="dropdown-menu notifications">
								<li><a href="#" class="notification-item"><span class="dot bg-warning"></span>System space is almost full</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-danger"></span>You have 9 unfinished tasks</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-success"></span>Monthly report is available</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-warning"></span>Weekly meeting in 1 hour</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-success"></span>Your request has been approved</a></li>
								<li><a href="#" class="more">See all notifications</a></li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="lnr lnr-question-circle"></i> <span>Help</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
							<ul class="dropdown-menu">
								<li><a href="#">Basic Use</a></li>
								<li><a href="#">Working With Data</a></li>
								<li><a href="#">Security</a></li>
								<li><a href="#">Troubleshooting</a></li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="../assets/img/user.png" class="img-circle" alt="Avatar"> <span>Samuel</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
							<ul class="dropdown-menu">
								<li><a href="#"><i class="lnr lnr-user"></i> <span>My Profile</span></a></li>
								<li><a href="#"><i class="lnr lnr-envelope"></i> <span>Message</span></a></li>
								<li><a href="#"><i class="lnr lnr-cog"></i> <span>Settings</span></a></li>
								<li><a href="#"><i class="lnr lnr-exit"></i> <span>Logout</span></a></li>
							</ul>
						</li>
						<!-- <li>
							<a class="update-pro" href="#downloads/klorofil-pro-bootstrap-admin-dashboard-template/?utm_source=klorofil&utm_medium=template&utm_campaign=KlorofilPro" title="Upgrade to Pro" target="_blank"><i class="fa fa-rocket"></i> <span>UPGRADE TO PRO</span></a>
						</li> -->
					</ul>
				</div>
			</div>
		</nav>
		<!-- END NAVBAR -->
		<!-- LEFT SIDEBAR -->
		<div id="sidebar-nav" class="sidebar">
			<div class="sidebar-scroll">
				<nav>
					<ul class="nav">
						<li><a href="goods.jsp" class="active"><i class="lnr lnr-home"></i> <span>商品管理</span></a></li>
						<li><a href="elements.html" class=""><i class="lnr lnr-code"></i> <span>订单管理</span></a></li>
						<li><a href="charts.html" class=""><i class="lnr lnr-chart-bars"></i> <span>收入统计</span></a></li>
						<li><a href="panels.html" class=""><i class="lnr lnr-cog"></i> <span>代理管理</span></a></li>
						<li><a href="notifications.html" class=""><i class="lnr lnr-alarm"></i> <span>Notifications</span></a></li>
						<li>
							<a href="#subPages" data-toggle="collapse" class="collapsed"><i class="lnr lnr-file-empty"></i> <span>Pages</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
							<div id="subPages" class="collapse ">
								<ul class="nav">
									<li><a href="page-profile.html" class="">Profile</a></li>
									<li><a href="page-login.html" class="">Login</a></li>
									<li><a href="page-lockscreen.html" class="">Lockscreen</a></li>
								</ul>
							</div>
						</li>
						<li><a href="tables.html" class=""><i class="lnr lnr-dice"></i> <span>Tables</span></a></li>
						<li><a href="typography.html" class=""><i class="lnr lnr-text-format"></i> <span>Typography</span></a></li>
						<li><a href="icons.html" class=""><i class="lnr lnr-linearicons"></i> <span>Icons</span></a></li>
					</ul>
				</nav>
			</div>
		</div>
		<!-- END LEFT SIDEBAR -->
		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="mainhead">
		<div class="row">
	<form class="" role="form" id="sousuo">
        <div class="container">
            <div class="row">
                <!--前缀-->
                <div class="form-group col-lg-3">
                    <div class="input-group">
                        <span class="input-group-addon">关键词</span>
                        <input class="form-control" type="text" name="text">
                    </div>
                </div>
                <div class="form-group col-lg-3">
                    <div class='input-group date'  id='datetimepicker1'>
                <input type='text' class="form-control" name="date"/>
                <span class="input-group-addon">日期
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            		</div>
                </div>
                <div class="form-group col-lg-3">
                    <div class="input-group">
                        <span class="input-group-addon">最低价</span>
                        <input class="form-control" type="text" name="minPrice">
                    </div>
                </div>
                <div class="form-group col-lg-3">
                    <div class="input-group">
                        <span class="input-group-addon">最高价</span>
                        <input class="form-control" type="text" name="maxPrice">
                    </div>
                </div>
                <div class="form-group col-lg-3">
                    <div><button type="button" class="btn btn-primary" onclick="sousuo()">搜索</button></div>
                </div>
                <div class="form-group col-lg-3">
                    <div><button type="button" class="btn btn-primary" onclick="addMall()">添加新品</button></div>
                </div>
                
        </div>
        </div>
    </form>
	<!-- 表格开始 -->
			<div style="margin-left:1%">
			<table class="table table-hover" id="table">
    	<thead>
        <tr>
            <th data-field="mallid">商品ID</th>
            <th data-field="mallnum">编号</th>
            <th data-field="malldes">描述</th>
            <th data-field="price">价格</th>
            <th data-field="cost">原价</th>
            <th data-field="malltype">类型</th>
            <th data-field="mallcolor">颜色</th>
            <th data-field="mallbrand">品牌</th>
            <th data-field="picPath">图片</th>
        </tr>
    	</thead>
			</table>
			</div>
			<!-- 表格结束 -->
</div>
<div>
<!-- <form style="display:none" id="addMall"> -->
<form id="addMall" method="post" enctype="multipart/form-data" style="display:none">
  <div class="form-group">
    <div class="input-group">
    <span class="input-group-addon">编号</span>
    <input class="form-control" type="text" id="mallNum" name="mallnum" style="width:20%">
    </div>
  </div>
  <div class="input-group">
    <span class="input-group-addon">描述</span>
    <input class="form-control" type="text" name="malldes" style="width:20%">
    </div>
    <div class="input-group">
    <span class="input-group-addon">售价</span>
    <input class="form-control" type="text" name="price" style="width:20%">
    </div>
    <div class="input-group">
    <span class="input-group-addon">原价</span>
    <input class="form-control" type="text" name="cost" style="width:20%">
    </div>
    <div class="input-group">
    <span class="input-group-addon">样式类型</span>
    <input class="form-control" type="text" name="malltype" style="width:20%">
    </div>
    <div class="input-group">
    <span class="input-group-addon">颜色</span>
    <input class="form-control" type="text" name="mallcolor" style="width:20%">
    </div>
    <div class="input-group">
    <span class="input-group-addon">品牌</span>
    <input class="form-control" type="text" name="mallbrand" style="width:20%">
    </div>
    <div class="input-group">
    <label class="control-label">图片</label>
<!--     <input multiple class="file" type="file" multiple name="picNames"> -->
<input id="add_bachPic" name="PicArr" type="file" multiple class="file" data-overwrite-initial="false" data-min-file-count="1">
<!--     <input id="add_bachPic" name="commoPicArr" type="file" multiple  class="file-loading"> -->
    </div>
  <button type="button" class="btn btn-primary" onclick="submitForm()">提交</button>
  <button type="button" class="btn btn-primary">取消</button>
</form>

</div>
			</div>
			
			<!-- END MAIN CONTENT -->
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
		<footer>
			<div class="container-fluid">
				<p class="copyright">Copyright &copy; 2017.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
				
			</div>
		</footer>
	</div>
	<!-- END WRAPPER -->
	<!-- Javascript -->
	
	<script src="../assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="../assets/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
<!-- 	<script src="../assets/vendor/chartist/js/chartist.min.js"></script> -->
	<script src="../assets/scripts/klorofil-common.js"></script>
	<script src="../assets/scripts/fileinput.js"></script>
	<script src="../assets/scripts/zh.js"></script>
	<script>
	<!--   -->
		
	$(function () {
        var picker1 = $('#datetimepicker1').datetimepicker({
            format: 'YYYY-MM-DD',
            locale: moment.locale('zh-cn'),
            //minDate: '2016-7-1'
        });
        var picker2 = $('#datetimepicker2').datetimepicker({
            format: 'YYYY-MM-DD',
            locale: moment.locale('zh-cn')
        });
        //动态设置最小值
        picker1.on('dp.change', function (e) {
            picker2.data('DateTimePicker').minDate(e.date);
        });
        //动态设置最大值
        picker2.on('dp.change', function (e) {
            picker1.data('DateTimePicker').maxDate(e.date);
        });
        initTable();
    });
	
	function tableHeight() {
        return $(window).height() - 50;
    };
	function initTable() {
// 		alert(1);
		$(window).resize(function() {
            $('#mytab').bootstrapTable('resetView', {
                height: tableHeight()
            })
        })

		$('#table').bootstrapTable({
            url: 'http://localhost:8888/shoes/mall/mallTable',         //请求后台的URL（*）
            method: 'post',                      //请求方式（*）
            toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
//             queryParams: oTableInit.queryParams,//传递参数（*）
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber:1,                       //初始化加载第一页，默认第一页
            pageSize: 10,                       //每页的记录行数（*）
            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
            search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "mallid",                     //每一行的唯一标识，一般为主键列
            showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            columns: [
            	{
                field: 'mallid',
                title: '商品ID'
            }, {
                field: 'mallnum',
                title: '编号'
            }, {
                field: 'malldes',
                title: '描述'
            }, {
                field: 'price',
                title: '价格'
            },  {
                field: 'cost',
                title: '原价'
            }, {
                field: 'malltype',
                title: '类型'
            }, {
                field: 'mallcolor',
                title: '颜色'
            }, {
                field: 'mallbrand',
                title: '品牌'
            }, {
                field: 'picPath',
                title: '图片',
                formatter:function (value,row,index)
                {
                    return '<img  src='+value+' width="100" height="100" class="img-rounded" >';
                }
            },]
        });
	}
	function sousuo() {
		alert(1);
		var data=$('#sousuo').serialize();
		$.ajax({
		    url:'http://localhost:8888/shoes/test/test',
		    data:data,
		    cache:false,//false是不缓存，true为缓存
		    async:true,//true为异步，false为同步
// 		    type:'post',
		    beforeSend:function(){
// 		        alert(2);
		    },
		    success:function(result){
		        //请求成功时
		    	alert("成功");
		    },
		    complete:function(){
		        //请求结束时
		    }
	});
	};
// 	添加
	function addMall() {
		$('#addMall').show();
	};
	$("#add_bachPic").fileinput({
// 		var commId = $('#mallNum').val();
		language: 'zh', 
        uploadUrl: 'http://localhost:8888/shoes/pic/upload', // you must set a valid URL here else you will get an error
        allowedFileExtensions : ['jpg', 'png','gif'],
        overwriteInitial: false,
        showUpload: false,				//不显示上传按钮
    	showCaption: false,
        maxFileSize: 1000,
        maxFilesNum: 10,
        uploadAsync:false,
        uploadExtraData: function(previewId, index) {   //额外参数 返回json数组
            return {
                    'mallId':mallId
                   };
            },
        allowedFileTypes: ['image', 'video', 'flash'],
        slugCallback: function(filename) {
            return filename.replace('(', '_').replace(']', '_');
        }
	});
	var mallId;
	function submitForm(){
	 	alert(11);
	 	
		if($('#add_bachPic').fileinput("getFilesCount")<=0){          //获取文件个数
			alert("请至少上传一张详情图片!");
			return;
		}
			$.ajax({
            //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: 'http://localhost:8888/shoes/mall/add' ,//url
                data: $('#addMall').serialize(),
                success: function (result) {
                    console.log(result);//打印服务端返回的数据(调试用)
                    if (result.code == 0) {
                    	 mallId = result.data;
                    	 $('#add_bachPic').fileinput('upload');
                        
                    }
                    ;
                },
                error : function() {
                    alert("异常！");
                }
            });
	}


	</script>
</body>

</html>
