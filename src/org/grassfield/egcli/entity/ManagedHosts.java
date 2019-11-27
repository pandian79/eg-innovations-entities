package org.grassfield.egcli.entity;

import java.util.List;

/**
 * This is an POJO class for the ManagedHosts by agent
 *
 * @author   
 */
public class ManagedHosts {
    
    String agentName;
    List<String> managedHost;
    
    public String getAgentName() {
        return agentName;
    }
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }
    public List<String> getManagedHost() {
        return managedHost;
    }
    public void setManagedHost(List<String> managedHost) {
        this.managedHost = managedHost;
    }
    
}