package org.grassfield.egcli.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Pojo class for Maintenance Policy Associated Elements
 * @author Logesh Chandiran
 */
@JsonInclude(Include.NON_NULL)
public class MaintenancePolicyAssociatedElements {
    private List<String> host = null;
    private List<String> component = null;
    private List<String> test = null;
    private List<String> hostTests = null;
    private List<String> componentTests = null;
    private List<String> testDescriptors = null;
    private List<String> componentDescriptors = null;
    public List<String> getHost() {
        return host;
    }
    public void setHost(List<String> host) {
        this.host = host;
    }
    public List<String> getComponent() {
        return component;
    }
    public void setComponent(List<String> component) {
        this.component = component;
    }
    public List<String> getTest() {
        return test;
    }
    public void setTest(List<String> test) {
        this.test = test;
    }
    public List<String> getHostTests() {
        return hostTests;
    }
    public void setHostTests(List<String> hostTests) {
        this.hostTests = hostTests;
    }
    public List<String> getComponentTests() {
        return componentTests;
    }
    public void setComponentTests(List<String> componentTests) {
        this.componentTests = componentTests;
    }
    public List<String> getTestDescriptors() {
        return testDescriptors;
    }
    public void setTestDescriptors(List<String> testDescriptors) {
        this.testDescriptors = testDescriptors;
    }
    public List<String> getComponentDescriptors() {
        return componentDescriptors;
    }
    public void setComponentDescriptors(List<String> componentDescriptors) {
        this.componentDescriptors = componentDescriptors;
    }    
}