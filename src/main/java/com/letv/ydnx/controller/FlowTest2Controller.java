package com.letv.ydnx.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;

public class FlowTest2Controller {
	final static String base="/api/Flow";
	protected static final Log log = LogFactory.getLog(FlowTestController.class);	

    @RequestMapping(value = base+"/sdk/client/log/save")
    public void clientLogSave2(HttpServletRequest request, HttpServletResponse response){
    	log.info("post1");
    	try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	BufferedReader reader = null;
    	String dd=request.getHeader("Content-Length");
    	log.info(dd);
    	try{
    		request.setCharacterEncoding("UTF-8");
            int size = request.getContentLength();
            log.info(size);

            InputStream is = request.getInputStream();

            byte[] reqBodyBytes = readBytes(is, size);

            String res = new String(reqBodyBytes);

            log.info(res);
    	}catch(Exception e){
    		log.error(e.getMessage(), e);
    	}finally{    		
    		try {
    			if(reader!=null){
					reader.close();
    			}
			} catch (IOException e) {
				log.error(e.getMessage(), e);
			}    	
    	}
    	log.info("post2");
	}

	final byte[] readBytes(InputStream is, int contentLen) {
		if (contentLen > 0) {
			int readLen = 0;
			int readLengthThisTime = 0;
			byte[] message = new byte[contentLen];
			try {
				while (readLen != contentLen) {
					readLengthThisTime = is.read(message, readLen, contentLen - readLen);
					if (readLengthThisTime == -1) {// Should not happen.
						break;
					}
					readLen += readLengthThisTime;
				}
				return message;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return new byte[] {};
	}
}
