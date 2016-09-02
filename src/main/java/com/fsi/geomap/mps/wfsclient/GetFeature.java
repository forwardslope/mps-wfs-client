package com.fsi.geomap.mps.wfsclient;

import java.util.List;


public interface GetFeature extends BaseRequest {
	
	   public List<Query> getQueries();

	    public ResultType getResultType();

	    public String getOutputFormat();

	    public long getMaxFeatures();

	    public int getTraverseXlinkDepth();

	    public int getTraverseXlinkExpiry();

	    public void setResultType(ResultType resultType);

	    public void setOutputFormat(String outputFormat);

	    public void setMaxFeatures(long maxFeatures);

	    public void setTraverseXlinkDepth(int traverseXlinkDepth);

	    public void setTraverseXlinkExpiry(int traverseXlinkExpiry);

}
