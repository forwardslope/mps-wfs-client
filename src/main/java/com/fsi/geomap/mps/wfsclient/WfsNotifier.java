package com.fsi.geomap.mps.wfsclient;

import org.opengis.feature.Feature;
import org.opengis.feature.type.Name;
import org.opengis.filter.Filter;

public interface WfsNotifier {
	public void processNotification(Name name,  Feature feature) throws Exception;
	public void processDeleteNotification(Name name, Filter filter);

}
