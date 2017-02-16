<#-- 这里定义了在模板中可以使用的变量  -->
<#escape x as x?html>
<#assign ctxPath = "${request.getContextPath()}">
<#assign currTime = "${.now?string('yyyyMMddHHmmssSSS')}" />
</#escape>
<link href="${ctxPath }/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
<script type="text/javascript" src="${ctxPath }/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${ctxPath }/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	var ctxPath = "${ctxPath }";
</script>