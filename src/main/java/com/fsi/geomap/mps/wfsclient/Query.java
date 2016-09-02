package com.fsi.geomap.mps.wfsclient;

import java.util.List;

import org.opengis.feature.type.Name;
import org.opengis.filter.Filter;
import org.opengis.filter.expression.Function;
import org.opengis.filter.sort.SortBy;

public interface Query {
    public static class PropertySelection {}

    public static class PropertyName extends PropertySelection {
        public final String name;

        public PropertyName(String name) {
            this.name = name;
        }
    }

    public static class XlinkPropertyName extends PropertyName {
        public final int traverseXlinkDepth;
        public final int traverseXlinkExpiry;

        public XlinkPropertyName(int traverseXlinkDepth, int traverseXlinkExpiry, String name) {
            super(name);
            this.traverseXlinkDepth = traverseXlinkDepth;
            this.traverseXlinkExpiry = traverseXlinkExpiry;
        }
    }

    public static class FunctionProperty extends PropertySelection {
        public final Function function;

        public FunctionProperty(Function function) {
            this.function = function;
        }
    }

    public static class TypeName {
        private final Name name;
        private final String alias;

        public TypeName(Name name) {
            this(name, null);
        }

        public TypeName(Name name, String alias) {
            this.name = name;
            this.alias = alias;
        }

        public Name getName() {
            return name;
        }

        public String getAlias() {
            return alias;
        }
    }
    
    public List<PropertySelection> getPropertyNames();

    public Filter getFilter();

    public List<SortBy> getSortBy();

    public String getHandle();

    public List<TypeName> getTypeName();

    public String getFeatureVersion();

    public String getSrsName();

    public void setFilter(Filter filter);

    public void setHandle(String handle);

    public void setFeatureVersion(String featureVersion);

    public void setSrsName(String srsName);


}
