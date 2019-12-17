package org.grassfield.egcli.entity;

import java.util.List;

/**
 * Pojo class for Maintenance Policy
 * @author Ramaiah Murugapandian
 *
 */
public class MaintenancePolicy {
    /**
     * Maintenance policy name
     */
    private List<String> policyName;

    public List<String> getPolicyName() {
        return policyName;
    }

    public void setPolicyName(List<String> policyName) {
        this.policyName = policyName;
    }
}