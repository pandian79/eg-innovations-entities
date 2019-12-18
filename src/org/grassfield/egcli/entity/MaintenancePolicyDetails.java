package org.grassfield.egcli.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Pojo class for Maintenance Policy Details
 * @author Logesh Chandiran
 */
@JsonInclude(Include.NON_NULL)
public class MaintenancePolicyDetails {
    private String policyName = null;
    private String policyStatus = null;
    private List<String> policySchedule = null;
    private String nextScheduleDate = null;
    private MaintenancePolicyAssociatedElements associatedElements = null;
    
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
    public MaintenancePolicyAssociatedElements getAssociatedElements() {
        return associatedElements;
    }
    public void setAssociatedElements(MaintenancePolicyAssociatedElements associatedElements) {
        this.associatedElements = associatedElements;
    }
}