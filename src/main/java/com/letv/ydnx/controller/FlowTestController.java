package com.letv.ydnx.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.letv.ydnx.controller.bean.TestFlowBean.BaseBean;
import com.letv.ydnx.controller.bean.TestFlowBean.NetNumber;
import com.letv.ydnx.controller.bean.TestFlowBean.OrderFlow;
import com.letv.ydnx.controller.bean.TestFlowBean.Registers;
import com.letv.ydnx.controller.bean.TestFlowBean.SearchNetworkEnvironment;
import com.letv.ydnx.controller.bean.TestFlowBean.SearchNetworkEnvironment4;
import com.letv.ydnx.controller.bean.TestFlowBean.UserIsHasValidProduct;
import com.letv.ydnx.controller.bean.TestFlowBean.ValidProductStatus;
import com.letv.ydnx.controller.bean.TestFlowBean.VideoCheck;
import com.letv.ydnx.controller.bean.TestFlowBean.VideoUrl;


@Controller
public class FlowTestController{
	final static String base="/api/Flow";
	protected static final Log log = LogFactory.getLog(FlowTestController.class);	

	public static class Config{
    	public String canGetMobileBySms ="y";
    	public String canSendClientLog="y";
    	public String isShowSDKLog="y";
		public String isIOSGetMobileBySms="n";
    	public Integer sendClientLogTimeMillis= 1000;
    	public String network="0";
    	public String netpwd=null;
    	public String phoneNum="13100000000";
    	public String phoneNumLianTong="15100000000";
    	public String hasCanOrderProductStatus="1";
    	public String hasCanUseProductStatus="1";
    	public String hasValidProduct="1";
    	public String isHasCanOrderProduct="1";
    	public Boolean getPhoneNumberFail=false;
		public Boolean urlTimeOut=false;
		public Boolean retrunJsonError=false;
    	public int orderedProductStatus=4;
    	public int playUrlType=0;
    	public String getPlayUrlType() {
			return playUrlType+",(0:all ok;1:main:ok add:no;2main:no add:no;3needOrder:yes)";
		}
    	public String getOrderedProductStatus() {
			return orderedProductStatus+",(<3 ok，0 未订购，1 已订购，2 退订，3 错误)";
		}
	}
	public static Config config=new Config();
	@RequestMapping(value = base+"/canSendClientLog")
    @ResponseBody
    public Object canSendClientLog(){
		config.canSendClientLog=(config.canSendClientLog=="y"?"n":"y");
    	return config;
    }
	@RequestMapping(value = base+"/canGetMobileBySms")
    @ResponseBody
    public Object canGetMobileBySms(){
		config.canGetMobileBySms=(config.canGetMobileBySms=="y"?"n":"y");
    	return config;
    }
	@RequestMapping(value = base+"/isShowSDKLog")
    @ResponseBody
    public Object isShowSDKLog(){
		config.isShowSDKLog=(config.isShowSDKLog=="y"?"n":"y");
    	return config;
    }
	@RequestMapping(value = base+"/isIOSGetMobileBySms")
    @ResponseBody
    public Object isIOSGetMobileBySms(){
		config.isIOSGetMobileBySms=(config.isIOSGetMobileBySms=="y"?"n":"y");
    	return config;
    }
	@RequestMapping(value = base+"/netpwd")
    @ResponseBody
    public Object netpwd(){
		config.netpwd=config.netpwd==null?"netpwd":null;
		return config;
    }
	@RequestMapping(value = base+"/phoneNum")
    @ResponseBody
    public Object phoneNum(){
		config.phoneNum=(config.phoneNum==null?getNum():null);
    	return config;
    }
	@RequestMapping(value = base+"/getPhoneNumberFail")
    @ResponseBody
    public Object getPhoneNumberFail(){
		config.getPhoneNumberFail= !config.getPhoneNumberFail;
    	return config;
    }
	@RequestMapping(value = base+"/network")
    @ResponseBody
    public Object changeNet(){
		config.network=(config.network=="0"?"1":"0");
    	return config;
    }
	@RequestMapping(value = base+"/hasCanOrderProductStatus")
    @ResponseBody
    public Object hasCanOrderProductStatus(){
		config.hasCanOrderProductStatus=(config.hasCanOrderProductStatus=="0"?"1":"0");
    	return config;
    }
	@RequestMapping(value = base+"/hasCanUseProductStatus")
    @ResponseBody
    public Object hasCanUseProductStatus(){
		config.hasCanUseProductStatus=(config.hasCanUseProductStatus=="1"?"0":"1");
    	return config;
    }
	@RequestMapping(value = base+"/hasValidProduct")
    @ResponseBody
    public Object hasValidProduct(){
		config.hasValidProduct=(config.hasValidProduct=="1"?"0":"1");
    	return config;
    }
	@RequestMapping(value = base+"/isHasCanOrderProduct")
    @ResponseBody
    public Object isHasCanOrderProduct(){
		config.isHasCanOrderProduct=(config.isHasCanOrderProduct=="1"?"0":"1");
    	return config;
    }
	@RequestMapping(value = base+"/sendClientLogTimeMillis")
    @ResponseBody
    public Object sendClientLogTimeMillis(){
		config.sendClientLogTimeMillis=(config.sendClientLogTimeMillis==60000?1000:60000);
    	return config;
    }
	private String getNum() {
		return config.network=="0"?"13100000000":"13900000000";
	}
	@RequestMapping(value = base+"/phoneNumLianTong")
    @ResponseBody
    public Object phoneNumLianTong(){
		config.phoneNumLianTong=(config.phoneNumLianTong==null?"15300000000":null);
    	return config;
    }
	@RequestMapping(value = base+"/urlTimeOut")
    @ResponseBody
    public Object urlTimeOut(){
		config.urlTimeOut=!config.urlTimeOut;
		return config;
    }
	@RequestMapping(value = base+"/retrunJsonError")
    @ResponseBody
    public Object retrunJsonError(){
		config.retrunJsonError=!config.retrunJsonError;
		return config;
    }
	@RequestMapping(value = base+"/playUrlType")
    @ResponseBody
    public Object changeUrl(){
		config.playUrlType=(++config.playUrlType)%4;
    	return config;
    }
	@RequestMapping(value = base+"/orderedProductStatus")
    @ResponseBody
    public Object orderedProductStatus(){
		config.orderedProductStatus= (++config.orderedProductStatus)%5;
    	return config;
    }


    @RequestMapping(value = base+"/netNumber")
    @ResponseBody
    public Object netNumber(){
    	//{"flowwarn":"1","errorinfo":"","userid":null,"resultcode":"0"}
//    	return new NetNumber("0","msg",phoneNumLianTong,"");
    	if(config.getPhoneNumberFail){
    		return "getNumberfail";
    	}else{
        	return new NetNumber("0",""/*errorinfo*/,config.phoneNumLianTong,"1"/*flowwarn*/);
    	}
    }
	
	
	
	
	
	


    @RequestMapping(value = base+"/sdk/flow/searchNetworkEnvironment")
    @ResponseBody
    public Object searchNetworkEnvironment(HttpServletRequest request){
		if(config.retrunJsonError){return "no json";}
    	_doTimeout();
    	return new SearchNetworkEnvironment("0000","msg",config.network,"operatorId",config.phoneNum==null?null:getNum(),config.hasCanOrderProductStatus, config.hasCanUseProductStatus,
    			getPhoneUrl(request),config.netpwd,config.isIOSGetMobileBySms);
    }
	private String getPhoneUrl(HttpServletRequest request) {
    	String phoneUrl="http://"+request.getLocalAddr()+":"+request.getLocalPort()+base+"/netNumber.shtml";
		return config.phoneNum==null?phoneUrl:null;
	}

    
    @RequestMapping(value = base+"/sdk/flow/register")
    @ResponseBody
    public Registers getRegister(){
    	return new Registers(3000, 4000, 5000, 6000, 7000, 8000, 9000, 8000, 7000, 6000, 5000);
    }
	@RequestMapping(value = base+"/sdk/order/checkUserIsHasValidProduct")
    @ResponseBody
    public Object checkUserIsHasValidProduct(){
    	return new UserIsHasValidProduct("0000","msg",config.hasValidProduct);
    }
    @RequestMapping(value = base+"/sdk/flow/checkBusinessSideAndOperatorIsHasCanOrderProduct")
    @ResponseBody
    public Object checkBusinessSideAndOperatorIsHasCanOrderProduct(){
    	return new SearchNetworkEnvironment4("0000","msg",config.isHasCanOrderProduct);
    } 
	@RequestMapping(value = base+"/sdk/order/validProductStatus")
    @ResponseBody
    public Object validProductStatus(){
    	return new ValidProductStatus(config.orderedProductStatus>3?"1111":"0000","成功",config.orderedProductStatus>2?null:(""+config.orderedProductStatus));
    }

    @RequestMapping(value = base+"/sdk/flow/video/url")
    @ResponseBody
    public VideoUrl url(@RequestParam int tag,@RequestParam String videourl){
		System.out.println("tag:"+tag+","+"url:"+config.playUrlType+",0:all ok;1:main:ok add:no;2main:no add:no;3needOrder:yes");
    	VideoUrl vc= new VideoUrl("n","0000", "-1", "", "3322905", "10.74.2.22", "34676992", "false", "ok", "0",videourl+"&object=object", "1", "", "13683365847", ""+tag,null);
    	if(config.playUrlType==0){
        	 
    	}else if(config.playUrlType==1){//main:ok add:no
    		if(tag>2){
           	 vc = getErrorBean(videourl);
    		}
	   	}else if(config.playUrlType==2){//2main:no add:no
			if(tag==0||tag>1){
	       	 vc = getErrorBean(videourl);
			}
		}else{//needOrder:yes
			if(tag>1){
		       	 vc = new VideoUrl("y","6002", "-1", "", "3322905", "10.74.2.22", "34676992", "false", "无可用的专场产品，无可用的通用流量产品", "0", null, "1", "", "13683365847", ""+tag,videourl+"&object=nonFreeFlowVideoUrl");
			}
    	}
    	return vc;
    }
	private VideoUrl getErrorBean(String videourl) {
		_doTimeout();
		return new VideoUrl("n","6002", "-1", "", "3322905", "10.74.2.22", "34676992", "false", "无可用的专场产品，无可用的通用流量产品", "0",null, "1", "", "13683365847", "0",videourl+"&object=nonFreeFlowVideoUrl");
	}

    @RequestMapping(value =base+"/sdk/flow/orderFlow")
    @ResponseBody
    public BaseBean orderFlow(@RequestParam String productCode,@RequestParam String productCount,@RequestParam String startDate,@RequestParam String isCostFree){
		log.info("orderFlow,productCode:"+productCode+",productCount:"+productCount+",startDate:"+startDate+",isCostFree:"+isCostFree);
    	return new OrderFlow("0000","ok","1122334",4444L);
	}
    @RequestMapping(value =base+"/sdk/vip")
    @ResponseBody
    public BaseBean vip(@RequestParam String vipLetvUid,@RequestParam String flowUId,@RequestParam String flowProductInstanceId){
		log.info("vip,vipLetvUid:"+vipLetvUid+",flowUId:"+flowUId+",flowProductInstanceId:"+flowProductInstanceId);
    	return new BaseBean("0000","ok");
	}
    


    @RequestMapping(value = base+"/sdk/flow/updateMobileuuidtel")
    @ResponseBody
    public Object setNum(@RequestParam String phoneNumber){
    	log.info("phoneNumber:"+phoneNumber);
    	return new BaseBean("0000","ok");
    }
    @RequestMapping(value = base+"/sdk/pho2")
    @ResponseBody
    public Object pho2(@RequestParam String a,@RequestParam String b){
    	log.info("phoneNumber:"+a+",b:"+b);
    	return new BaseBean("0000",a);
    }
    
    @RequestMapping(value = base+"/sdk/flow/video/check")
    @ResponseBody
    public VideoCheck getJson(){
    	return new VideoCheck("0000","ok","1","136863696547","0","2","false");
    }


    @RequestMapping(value =base+"/sdk/page/updatePhone")
    public String updatePhone(HttpServletRequest request){
    	return "flowTest";
	}
    @RequestMapping(value =base+"/sdk/page/checkPhone")
    public String checkPhone(HttpServletRequest request){
    	return "flowTest";
	}
    @RequestMapping(value =base+"/sdk/page/vip/orderSure")
    public String orderSure(HttpServletRequest request){
    	return "flowTest";
	}
    @RequestMapping(value =base+"/sdk/myflow/index")
    public String myflow(HttpServletRequest request){
    	return "flowTest";
	}
    @RequestMapping(value =base+"/sdk/order/popup")
    public String order(HttpServletRequest request){
    	_doTimeout();
    	return "flowTest";
	}
    @RequestMapping(value =base+"/sdk/ddd")
    public String ddd(HttpServletRequest request){
    	return "config";
	}
    
    static Boolean timeout;
	private void _doTimeout() {
		if(config.urlTimeOut){
			log.info("11");
	    	try {
				Thread.sleep(12*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	log.info("22");
		}
	}
}
