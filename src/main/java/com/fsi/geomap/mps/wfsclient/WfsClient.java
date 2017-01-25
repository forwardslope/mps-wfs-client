package com.fsi.geomap.mps.wfsclient;

import java.util.Map;

import org.geotools.feature.FeatureCollection;
import org.opengis.feature.Feature;
import org.opengis.feature.type.FeatureType;
import org.opengis.feature.type.Name;

public interface WfsClient {
	public Map<Name, FeatureCollection<? extends FeatureType, ? extends Feature>> getFeatureMap(GetFeature getFeature, boolean supportPaging);
	public Map<Name, FeatureCollection<? extends FeatureType, ? extends Feature>> getFeatureMap(GetFeature getFeature);
	public FeatureCollection<? extends FeatureType, ? extends Feature> getFeatures(GetFeature getFeature, boolean supportPaging);
	public FeatureCollection<? extends FeatureType, ? extends Feature> getFeatures(GetFeature getFeature);

}
