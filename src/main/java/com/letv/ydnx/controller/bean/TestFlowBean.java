package com.letv.ydnx.controller.bean;

import com.letv.ydnx.controller.FlowTestController;

public class TestFlowBean {
	public static class BaseBean{
		public BaseBean(String code, String msg) {
			super();
			this.code = code;
			this.msg = msg;
		}

    	private String code;
    	private String msg;
		public String getCode() {
			return code;
		}
		public String getMsg() {
			return msg;
		}
	}
    
    static public class Registers extends BaseBean{
    	Integer requestRegisterTimeout;
    	Integer requestOrderFlowTimeout;
    	Integer requestCancelOrderFlowTimeout;
    	Integer requestSearchOrderRelationTimeout;
    	Integer requestSearchSurplusFlowTimeout;
    	Integer requestIdentifyWoVideoSDKTimeout;
    	Integer requestSearchNetworkEnvironmentTimeout;
    	Integer requestGetNetNumberTimeout;
    	Integer requestUpdateMobileUuidTelTimeout;
    	Integer requestBindPhoneNumberTimeout;
    	Integer requestPlayingSurplusFlowTimeout;
    	Integer businessSideKeyId = 745;
    	String lditafl ="123";
        String md5Key ="5e82ece42c27d11898ba8a143bf2a9df";

		 
		public Registers(Integer requestRegisterTimeout,
				Integer requestOrderFlowTimeout,
				Integer requestCancelOrderFlowTimeout,
				Integer requestSearchOrderRelationTimeout,
				Integer requestSearchSurplusFlowTimeout,
				Integer requestIdentifyWoVideoSDKTimeout,
				Integer requestSearchNetworkEnvironmentTimeout,
				Integer requestGetNetNumberTimeout,
				Integer requestUpdateMobileUuidTelTimeout,
				Integer requestBindPhoneNumberTimeout,
				Integer requestPlayingSurplusFlowTimeout) {
			super("0000","成功");
			this.requestRegisterTimeout = requestRegisterTimeout;
			this.requestOrderFlowTimeout = requestOrderFlowTimeout;
			this.requestCancelOrderFlowTimeout = requestCancelOrderFlowTimeout;
			this.requestSearchOrderRelationTimeout = requestSearchOrderRelationTimeout;
			this.requestSearchSurplusFlowTimeout = requestSearchSurplusFlowTimeout;
			this.requestIdentifyWoVideoSDKTimeout = requestIdentifyWoVideoSDKTimeout;
			this.requestSearchNetworkEnvironmentTimeout = requestSearchNetworkEnvironmentTimeout;
			this.requestGetNetNumberTimeout = requestGetNetNumberTimeout;
			this.requestUpdateMobileUuidTelTimeout = requestUpdateMobileUuidTelTimeout;
			this.requestBindPhoneNumberTimeout = requestBindPhoneNumberTimeout;
			this.requestPlayingSurplusFlowTimeout = requestPlayingSurplusFlowTimeout;
		}
		
		
		public Integer getSendClientLogTimeMillis() {
			return FlowTestController.config.sendClientLogTimeMillis;
		}
		public Integer getBusinessSideKeyId() {
			return businessSideKeyId;
		}

		public String getCanGetMobileBySms() {
			return FlowTestController.config.canGetMobileBySms;
		}
		public String getCanSendClientLog() {
			return FlowTestController.config.canSendClientLog;
		}
		public String getIsShowSDKLog() {
			return FlowTestController.config.isShowSDKLog;
		}
		public String getLditafl() {
			return lditafl;
		}
		public String getMd5Key() {
			return md5Key;
		}
		public Integer getRequestRegisterTimeout() {
			return requestRegisterTimeout;
		}
		public Integer getRequestOrderFlowTimeout() {
			return requestOrderFlowTimeout;
		}
		public Integer getRequestCancelOrderFlowTimeout() {
			return requestCancelOrderFlowTimeout;
		}
		public Integer getRequestSearchOrderRelationTimeout() {
			return requestSearchOrderRelationTimeout;
		}
		public Integer getRequestSearchSurplusFlowTimeout() {
			return requestSearchSurplusFlowTimeout;
		}
		public Integer getRequestIdentifyWoVideoSDKTimeout() {
			return requestIdentifyWoVideoSDKTimeout;
		}
		public Integer getRequestSearchNetworkEnvironmentTimeout() {
			return requestSearchNetworkEnvironmentTimeout;
		}
		public Integer getRequestGetNetNumberTimeout() {
			return requestGetNetNumberTimeout;
		}
		public Integer getRequestUpdateMobileUuidTelTimeout() {
			return requestUpdateMobileUuidTelTimeout;
		}
		public Integer getRequestBindPhoneNumberTimeout() {
			return requestBindPhoneNumberTimeout;
		}
		public Integer getRequestPlayingSurplusFlowTimeout() {
			return requestPlayingSurplusFlowTimeout;
		}
    	
    	
    }
    static public class ValidProductStatus extends BaseBean{
    	String validProductStatus;
		public ValidProductStatus(String code, String msg, String validProductStatus) {
			super(code,msg);
			this.validProductStatus = validProductStatus;
		}
		public String getValidProductStatus() {
			return validProductStatus;
		}
    }
    
    static public class VideoCheck extends BaseBean{
    	String operatorId;
    	String phoneNumber;
    	String flowType;
    	String orderModel;
    	String limitFlow;
    	
    	
    	
		public VideoCheck(String code, String msg, String operatorId,
				String phoneNumber, String flowType, String orderModel,
				String limitFlow) {
			super(code,msg);
			this.operatorId = operatorId;
			this.phoneNumber = phoneNumber;
			this.flowType = flowType;
			this.orderModel = orderModel;
			this.limitFlow = limitFlow;
		}
		public String getOperatorId() {
			return operatorId;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public String getFlowType() {
			return flowType;
		}
		public String getOrderModel() {
			return orderModel;
		}
		public String getLimitFlow() {
			return limitFlow;
		}
    }
    static public class SearchNetworkEnvironment4   extends BaseBean     {
    	public SearchNetworkEnvironment4(String code, String msg ,String isHasCanOrderProduct) {
			super(code,msg);
			this.isHasCanOrderProduct = isHasCanOrderProduct;
		}
    	public String isHasCanOrderProduct;
    }
    static public class UserIsHasValidProduct   extends BaseBean     {
    	public UserIsHasValidProduct(String code, String msg ,String hasValidProduct) {
			super(code,msg);
			this.hasValidProduct = hasValidProduct;
		}
    	public String hasValidProduct;
    }
    static public class SearchNetworkEnvironment extends BaseBean{
    	public SearchNetworkEnvironment(String code, String msg,String network, String operatorId, String phoneNumber, String hasCanOrderProductStatus,
    			String hasCanUseProductStatus,String unicomNetNumberUrl,String netpwd,String isIOSGetMobileBySms) {
			super(code,msg);
			this.network = network;
			this.operatorId = operatorId;
			this.phoneNumber = phoneNumber;
			this.hasCanOrderProductStatus=hasCanOrderProductStatus;
			this.hasCanUseProductStatus=hasCanUseProductStatus;
			this.unicomNetNumberUrl=unicomNetNumberUrl;
			this.netpwd=netpwd;
			this.isIOSGetMobileBySms=isIOSGetMobileBySms;
		}
    	String network;
    	String netpwd;
		String operatorId;
    	String phoneNumber;
    	String hasCanOrderProductStatus;
    	String hasCanUseProductStatus;
    	String unicomNetNumberUrl;
    	String isIOSGetMobileBySms;

		public String getIsIOSGetMobileBySms() {
			return isIOSGetMobileBySms;
		}
		public String getHasCanOrderProductStatus() {
			return hasCanOrderProductStatus;
		}
		public String getHasCanUseProductStatus() {
			return hasCanUseProductStatus;
		}
    	public String getNetpwd() {
			return netpwd;
		}
		public String getUnicomNetNumberUrl() {
			return unicomNetNumberUrl;
		}
		public String getNetwork() {
			return network;
		}
		public String getOperatorId() {
			return operatorId;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
    }
    public static class OrderFlow extends BaseBean {
    	public OrderFlow(String code, String msg, String flowProductInstanceIds, Long flowUId) {
			super(code, msg);
			this.flowUId=flowUId;
			this.flowProductInstanceIds=flowProductInstanceIds;
		}
    	public String getFlowProductInstanceIds() {
			return flowProductInstanceIds;
		}
		public Long getFlowUId() {
			return flowUId;
		}
		String flowProductInstanceIds;
		Long flowUId;
    }
    static public class NetNumber{

		String resultcode;
    	String errorinfo;
    	String userid;
    	String flowwarn;
		public NetNumber(String resultcode, String errorinfo, String userid, String flowwarn) {
			super();
			this.resultcode = resultcode;
			this.errorinfo = errorinfo;
			this.userid = userid;
			this.flowwarn = flowwarn;
		}
		public String getResultcode() {
			return resultcode;
		}
		public String getErrorinfo() {
			return errorinfo;
		}
		public String getUserid() {
			return userid;
		}
		public String getFlowwarn() {
			return flowwarn;
		}

    }

    static public class VideoUrl extends BaseBean{
    	String needOrder;
    	String dxllPlayType;
    	String nonFreeFlowVideoUrl;
    	String flowType;
    	String lditcid;
    	String lditcip ;
    	String ldituid;
    	String limitFlow;
    	String networkEnv;
    	String object;
    	String operatorId;
    	String orderModel;
    	String phoneNumber;
    	String type;
		public VideoUrl(String needOrder,String code, String dxllPlayType, String flowType,
				String lditcid, String lditcip, String ldituid,
				String limitFlow, String msg, String networkEnv, String object,
				String operatorId, String orderModel, String phoneNumber,
				String type,String nonFreeFlowVideoUrl) {
			super(code,msg);
			this.needOrder=needOrder;
			this.dxllPlayType = dxllPlayType;
			this.flowType = flowType;
			this.lditcid = lditcid;
			this.lditcip = lditcip;
			this.ldituid = ldituid;
			this.limitFlow = limitFlow;
			this.networkEnv = networkEnv;
			this.object = object;
			this.operatorId = operatorId;
			this.orderModel = orderModel;
			this.phoneNumber = phoneNumber;
			this.type = type;
			this.nonFreeFlowVideoUrl=nonFreeFlowVideoUrl;
		}
		public String getNonFreeFlowVideoUrl() {
			return nonFreeFlowVideoUrl;
		}
		public String getNeedOrder() {
			return needOrder;
		}
		public String getDxllPlayType() {
			return dxllPlayType;
		}
		public String getFlowType() {
			return flowType;
		}
		public String getLditcid() {
			return lditcid;
		}
		public String getLditcip() {
			return lditcip;
		}
		public String getLdituid() {
			return ldituid;
		}
		public String getLimitFlow() {
			return limitFlow;
		}
		public String getNetworkEnv() {
			return networkEnv;
		}
		public String getObject() {
			return object;
		}
		public String getOperatorId() {
			return operatorId;
		}
		public String getOrderModel() {
			return orderModel;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public String getType() {
			return type;
		}
    	
    	
    }
}
