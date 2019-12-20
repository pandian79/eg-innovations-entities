package org.grassfield.eg.test;

public class HttpTest {
    private String url;
    private String id;
    private String timeout;
    private String systemProperties;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTimeout() {
        return timeout;
    }
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
    public String getSystemProperties() {
        return systemProperties;
    }
    public void setSystemProperties(String systemProperties) {
        this.systemProperties = systemProperties;
    }
    @Override
    public String toString() {
        return "HttpTest [url=" + url + "]";
    }
}
