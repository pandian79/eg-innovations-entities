package org.grassfield.egcli.entity;

import java.util.Map;

/**
 * This is an POJO class for single Test details.
 * @author Logesh Chandiran
 * 
 */

public class TestDetails {
    private String testName;
    private Map<String, String> details;
    
    public String getTestName() {
        return testName;
    }
    public void setTestName(String testName) {
        this.testName = testName;
    }
    public Map<String, String> getDetails() {
        return details;
    }
    public void setDetails(Map<String, String> details) {
        this.details = details;
    }
}