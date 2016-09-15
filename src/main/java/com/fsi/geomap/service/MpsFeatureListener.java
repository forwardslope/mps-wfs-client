package com.fsi.geomap.service;

import java.io.IOException;

import org.geotools.data.FeatureListener;
import org.opengis.feature.type.Name;

import com.fsi.geomap.mps.wfsclient.WfsNotifier;

public interface MpsFeatureListener {
	public FeatureListener registerListenerForFeature(final Name name, final WfsNotifier notifier) throws IOException, FeatureListenerException;
	public FeatureListener removeListenerForFeature(Name name);
}
