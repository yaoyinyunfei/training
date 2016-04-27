<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>query userInfo</title>
</head>
<script type="text/javascript">
function Querycheck(queryForm){
	if(queryForm.name.value == ""){
		if(!(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/).test(queryForm.email.value)){
			alert("邮箱输入错误！");
			document.queryForm.email.focus();
			return(false);
		}
	}
}
</script>
<body>
<center>
	<p>
		用户信息查询
	</p>
	<form name="queryForm" action="QueryInfo" onsubmit="return Querycheck(queryForm)" method="get">
	<div>
		按照姓名查询用户信息<input type="text" name="name" maxlength="30"/>
	</div>
	<div>
		按照邮箱查询用户信息<input type="text" name="email" maxlength="30"/>
	</div>
		<input type="submit" value="查询" />
		<input type="reset" value="重置" />
	</form>
</center>
</body>
</html>