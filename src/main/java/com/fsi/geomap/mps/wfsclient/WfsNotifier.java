package com.fsi.geomap.mps.wfsclient;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.opengis.feature.Feature;
import org.opengis.feature.type.Name;
import org.opengis.filter.Filter;
import org.xml.sax.SAXException;

public interface WfsNotifier {
	public void processNotification(Name name,  Feature feature) throws IOException, SAXException, ParserConfigurationException, FeatureException;
	public void processDeleteNotification(Name name, Filter filter);

}
