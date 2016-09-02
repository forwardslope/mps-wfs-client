package com.fsi.geomap.mps.wfsclient;

public interface BaseRequest {
	
	public String getService();
	
	public void setService(String service);
	
	public String getVersion();
	
	public void setVersion(String version);
	
	public String getHandle();
	
	public void setHandle(String handle);
}
