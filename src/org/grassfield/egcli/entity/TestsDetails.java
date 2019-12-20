package org.grassfield.egcli.entity;

/**
 * POJO class for the Tests Details.
 * @author Logesh Chandiran
 * 
 */

public class TestsDetails {
    private String componentType;
    private String componentName;
    private TestType testType;
    
    public String getComponentType() {
        return componentType;
    }
    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }
    public String getComponentName() {
        return componentName;
    }
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }
    public TestType getTestType() {
        return testType;
    }
    public void setTestType(TestType testType) {
        this.testType = testType;
    }
}