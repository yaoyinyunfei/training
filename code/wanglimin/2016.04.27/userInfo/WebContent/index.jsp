<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>userInfo</title>
</head>
<script type="text/javascript">
	function checkInfo(userform){
		if(userform.name.value == ""){
			alert("姓名不能为空！");
			document.userform.name.focus();
			return false;
		}else if(!(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/).test(userform.email.value)){
			alert("邮箱输入错误！");
			document.userform.email.focus();
			return(false);
		}else if(userform.password.value == ""){
			alert("密码不能为空！");
			document.userform.password.focus();
			return(false);
		}
	}
</script>
<body>
<center>
		<h4>
			用户注册 
		</h4>
	<form name="userform" action="UserInfoServlet" onsubmit="return checkInfo(this)" method="get">
		<table border="1">
		<tr>
			<td>姓名</td>
			<td>
				<input type="text" name="name" maxlength="20"/>
			</td>
		</tr>
		<tr>
			<td>邮箱</td>
			<td>
				<input type="text" name="email" maxlength="30"/>
			</td>
		</tr>
		<tr>
			<td>密码</td>
			<td>
				<input type="password" name="password" maxlength="30"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="提交" />
				<input type="reset" value="取消" />
			</td>
		</tr>
	</table>
	</form>
</center>
</body>
</html>