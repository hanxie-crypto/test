package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.codehaus.xfire.client.Client;


public class HelloInvoke {
	public static void main(String[] args) throws MalformedURLException, Exception {
//		org.codehaus.xfire.client.Client client=new Client(new URL("http://www.webxml.com.cn/WebServices/TrainTimeWebService.asmx?wsdl"));
//        //����java�ķ�����ƿ���Զ�̵صõ��Ѿ���wsdl�������Ķ���  
//        Object[] results = client.invoke("getDetailInfoByTrainCode", new Object[]{"����"});  
//        System.out.println("results[0] " + results[0]);  
		Client c = new Client(new URL("http://www.webxml.com.cn/WebServices/TrainTimeWebService.asmx?wsdl"));
		Object[] results = c.invoke("getStationName", new Object[]{null});
		for (Object object : results) {
			System.out.println(object);
			System.out.println("nihaollll");
		}
	}
}
