package com.katalyst.util;

public class Configuration{

	public static String qaurl = PropertyManager.getInstance().getQaurl();
	public static String uaturl = PropertyManager.getInstance().getUaturl();
	public static String suite = PropertyManager.getInstance().getSuite();

	public static String getURL()
	{
		String URL_INFO = null;
		if(suite.equalsIgnoreCase("SmokeTest"))
		{
			URL_INFO = qaurl;
		}
		if(suite.equalsIgnoreCase("UATTest"))
		{
			URL_INFO = uaturl;
		}
		return URL_INFO;
	}
}