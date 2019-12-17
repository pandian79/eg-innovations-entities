package org.grassfield.eg.test;

import java.util.ArrayList;
import java.util.List;

public class TestParam {
    List<KeyValue> params = new ArrayList<KeyValue>();

    public List<KeyValue> getParams() {
        return params;
    }

    public void setParams(List<KeyValue> params) {
        this.params = params;
    }

    public void add(KeyValue kv) {
        this.params.add(kv);
    }

    public void add(String key, String value) {
        this.params.add(new KeyValue(key, value));
    }

    public boolean hasParams() {
        return !this.params.isEmpty();
    }

}
