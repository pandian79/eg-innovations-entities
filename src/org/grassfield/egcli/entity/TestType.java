package org.grassfield.egcli.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an POJO class for the Test Type
 * @author Logesh Chandiran
 * 
 */

public class TestType {
    private List<TestDetails> performance = new ArrayList<TestDetails>();
    private List<TestDetails> configuration = new ArrayList<TestDetails>();
    
    public List<TestDetails> getPerformance() {
        return performance;
    }
    public void setPerformance(List<TestDetails> performance) {
        this.performance = performance;
    }
    public List<TestDetails> getConfiguration() {
        return configuration;
    }
    public void setConfiguration(List<TestDetails> configuration) {
        this.configuration = configuration;
    }
    
    public void addPerformanceTest(TestDetails td) {
        performance.add(td);
    }
    public void addConfigurationTest(TestDetails td) {
        configuration.add(td);
    }
}