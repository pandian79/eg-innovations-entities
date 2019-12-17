package org.grassfield.egcli.entity;

import java.util.List;

/**
 * Pojo class for Maintenance Policy Details
 *
 */
public class MaintenancePolicyDetails {
    
    private String policyName;
    private String policyStatus;
    private List<String> policySchedule;
    private String nextScheduleDate;
    private List<String> associatedElements;
    private List<String> components;
    
    public String getPolicyName() {
        return policyName;
    }
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    public String getPolicyStatus() {
        return policyStatus;
    }
    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }
    public List<String> getPolicySchedule() {
        return policySchedule;
    }
    public void setPolicySchedule(List<String> policySchedule) {
        this.policySchedule = policySchedule;
    }
    public String getNextScheduleDate() {
        return nextScheduleDate;
    }
    public void setNextScheduleDate(String nextScheduleDate) {
        this.nextScheduleDate = nextScheduleDate;
    }
    public List<String> getAssociatedElements() {
        return associatedElements;
    }
    public void setAssociatedElements(List<String> associatedElements) {
        this.associatedElements = associatedElements;
    }
    public List<String> getComponents() {
        return components;
    }
    public void setComponents(List<String> components) {
        this.components = components;
    }
    
}