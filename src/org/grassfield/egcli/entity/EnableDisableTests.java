package org.grassfield.egcli.entity;

import java.util.List;

/**
 * This is an POJO class for the Enabled & Disabled tests. 
 *
 * @author   
 */
public class EnableDisableTests {

    List<String> enableTests;
    List<String> disableTests;

    public List<String> getEnableTests() {
        return enableTests;
    }
    public void setEnableTests(List<String> enableTests) {
        this.enableTests = enableTests;
    }
    public List<String> getDisableTests() {
        return disableTests;
    }
    public void setDisableTests(List<String> disableTests) {
        this.disableTests = disableTests;
    }
    @Override
    public String toString() {
        return "EnableDisableTests [enableTests=" + enableTests + ", disableTests=" + disableTests + "]";
    }
    
}