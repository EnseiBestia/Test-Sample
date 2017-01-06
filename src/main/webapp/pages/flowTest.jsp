<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order</title>
<script>
function orderVipCallBack(dd){
	document.getElementById("lyz").innerHTML="orderVipCallBack(code:"+dd.code+","+dd.msg+")";
}
function orderFinish(dd){
	document.getElementById("lyz").innerHTML=
		"orderFinish({code:"+dd.code+",msg:"+dd.msg+",<br/>flowProductInstanceIds:"+dd.flowProductInstanceIds+",flowUId:"+dd.flowUId+")";
}
</script>
</head>
<body style="height: 100%;background-color: #FFF;">
<div style="padding: 10px; font-size:32px;" id="lyz">dddddddddddd</div>

<br/><br/><button onclick="ios_cancel()"                                     style="width:900px;height:70px;"><font size="12" >cancel()</font></button>
<div style="padding: 10px;font-size:32px;">更改手机号</div>
<br/><br/><button onclick="ios_changePhoneNumber(13912345678)"               style="width:900px;height:70px;"><font size="12" >ios_changePhoneNumber(13912345678)</font></button>
<br/><br/><button onclick="ios_changePhoneNumberAndGetPlayUrl(13122310036)"  style="width:900px;height:70px;"><font size="6" >ios_changePhoneNumberAndGetPlayUrl<br/>(13122310036)</font></button>

<div style="padding: 10px;font-size:32px;">提示</div>
<br/><br/><button onclick="ios_noShowHasFlowDialog(true)"                    style="width:900px;height:70px;"><font size="12" >ios_noShowHasFlowDialog(true)</font></button>
<br/><br/><button onclick="ios_noShowHasFlowDialog(false)"                   style="width:900px;height:70px;"><font size="12" >ios_noShowHasFlowDialog(false)</font></button>

<div style="padding: 10px;font-size:32px;">order</div>
<br/><br/><button onclick="ios_noShowOrderDialog()"                          style="width:900px;height:70px;"><font size="12" >ios_noShowOrderDialog()</font></button>
<br/><br/><button onclick="ios_returnOrderResult('1111','ddddd')"            style="width:900px;height:70px;"><font size="12" >ios_returnOrderResult('1111','ddddd')</font></button>
<br/><br/><button onclick="ios_order(13931173731,222,33,1)"                  style="width:900px;height:70px;"><font size="12" >ios_order(13931173731,222,33,1)</font></button>
<br/><br/><button onclick="ios_loginOrderVip(8888,9999,1)"                   style="width:900px;height:70px;"><font size="12" >ios_loginOrderVip(8888,9999,1)</font></button>
<br/><br/><button onclick="ios_loginOrderVip(8888,9999,0)"                   style="width:900px;height:70px;"><font size="12" >ios_loginOrderVip(8888,9999,0)</font></button>
<br/><br/><button onclick="ios_orderVip(8888,9999,7777,1)"                   style="width:900px;height:70px;"><font size="12" >ios_orderVip(8888,9999,7777,1)</font></button>
<br/><br/><button onclick="ios_orderVip(8888,9999,7777,0)"                   style="width:900px;height:70px;"><font size="12" >ios_orderVip(8888,9999,7777,0)</font></button>
<br/><br/><button onclick="orderVipCallBack({code:'111',msg:'pl'})"          style="width:900px;height:70px;"><font size="12" >orderVipCallBack()</font></button>

</div>

</body>
</html>