<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<!doctype html>
<html>
<head>
<title>手机号码</title>
<script type="text/javascript" src="/pages/js/jquery.min.js"></script>
<script type="text/javascript">

	function ddd(url_){
		$.ajax({
			url:url_,
			dataType:"json",
			success: function(data) {
				$("#sendClientLogTimeMillis ").html(data.sendClientLogTimeMillis );
				$("#canGetMobileBySms       ").html(data.canGetMobileBySms       );
				$("#canSendClientLog        ").html(data.canSendClientLog        );
				$("#isShowSDKLog            ").html(data.isShowSDKLog            );
				$("#phoneNum                ").html(data.phoneNum                );
				$("#phoneNumLianTong        ").html(data.phoneNumLianTong        );
				$("#network                 ").html(data.network                 );
				$("#netpwd                  ").html(data.netpwd                  );
				$("#hasCanOrderProductStatus").html(data.hasCanOrderProductStatus);
				$("#hasCanUseProductStatus  ").html(data.hasCanUseProductStatus  );
				$("#hasValidProduct         ").html(data.hasValidProduct         );
				$("#isHasCanOrderProduct    ").html(data.isHasCanOrderProduct    );
				$("#orderedProductStatus    ").html(data.orderedProductStatus    );
				$("#urlTimeOut              ").html(data.urlTimeOut              );
				$("#getPhoneNumberFail      ").html(data.getPhoneNumberFail      );
				$("#playUrlType             ").html(data.playUrlType             );
			}
		});
	}
	

</script>

</head>
<body >
	<table>
	<tr><td>sendClientLogTimeMillis </td><td><div id="sendClientLogTimeMillis" ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/sendClientLogTimeMillis.shtml' )" ><font >sendClientLogTimeMillis </font></button></td></tr>
	<tr><td>canGetMobileBySms       </td><td><div id="canGetMobileBySms"       ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/canGetMobileBySms.shtml      ' )" ><font >canGetMobileBySms       </font></button></td></tr>
	<tr><td>canSendClientLog        </td><td><div id="canSendClientLog"        ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/canSendClientLog.shtml'        )" ><font >canSendClientLog        </font></button></td></tr>
	<tr><td>isShowSDKLog            </td><td><div id="isShowSDKLog"            ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/isShowSDKLog.shtml'            )" ><font >isShowSDKLog            </font></button></td></tr>
	<tr><td>phoneNum                </td><td><div id="phoneNum"                ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/phoneNum.shtml'                )" ><font >phoneNum                </font></button></td></tr>
	<tr><td>phoneNumLianTong        </td><td><div id="phoneNumLianTong"        ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/phoneNumLianTong.shtml'        )" ><font >phoneNumLianTong        </font></button></td></tr>
	<tr><td>network                 </td><td><div id="network"                 ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/network.shtml'                 )" ><font >network                 </font></button></td></tr>
	<tr><td>netpwd                  </td><td><div id="netpwd"                  ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/netpwd.shtml'                  )" ><font >netpwd                  </font></button></td></tr>
	<tr><td>hasCanOrderProductStatus</td><td><div id="hasCanOrderProductStatus"></h5></td><td><button onclick="ddd('${ctx}/api/Flow/hasCanOrderProductStatus.shtml')" ><font >hasCanOrderProductStatus</font></button></td></tr>
	<tr><td>hasCanUseProductStatus  </td><td><div id="hasCanUseProductStatus"  ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/hasCanUseProductStatus.shtml'  )" ><font >hasCanUseProductStatus  </font></button></td></tr>
	<tr><td>hasValidProduct         </td><td><div id="hasValidProduct"         ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/hasValidProduct.shtml'         )" ><font >hasValidProduct         </font></button></td></tr>
	<tr><td>isHasCanOrderProduct    </td><td><div id="isHasCanOrderProduct"    ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/isHasCanOrderProduct.shtml'    )" ><font >isHasCanOrderProduct    </font></button></td></tr>
	<tr><td>orderedProductStatus    </td><td><div id="orderedProductStatus"    ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/orderedProductStatus.shtml'    )" ><font >orderedProductStatus    </font></button></td></tr>
	<tr><td>urlTimeOut              </td><td><div id="urlTimeOut"              ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/urlTimeOut.shtml'              )" ><font >urlTimeOut              </font></button></td></tr>
	<tr><td>getPhoneNumberFail      </td><td><div id="getPhoneNumberFail"      ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/getPhoneNumberFail.shtml'      )" ><font >getPhoneNumberFail      </font></button></td></tr>
	<tr><td>playUrlType             </td><td><div id="playUrlType"             ></h5></td><td><button onclick="ddd('${ctx}/api/Flow/playUrlType.shtml'             )" ><font >playUrlType             </font></button></td></tr>
	</table>


</div>

</body>
</html>
