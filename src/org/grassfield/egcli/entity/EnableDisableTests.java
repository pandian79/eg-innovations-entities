package org.grassfield.egcli.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * POJO class for the Enabled & Disabled tests. 
 * @author Logesh Chandiran
 * 
 */

@JsonInclude(Include.NON_NULL)
public class EnableDisableTests {
    List<String> enabledTests = null;
    List<String> disabledTests = null;
    
    public List<String> getEnabledTests() {
        return enabledTests;
    }
    public void setEnabledTests(List<String> enabledTests) {
        this.enabledTests = enabledTests;
    }
    public List<String> getDisabledTests() {
        return disabledTests;
    }
    public void setDisabledTests(List<String> disabledTests) {
        this.disabledTests = disabledTests;
    }
}