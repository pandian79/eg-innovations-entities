package org.grassfield.eg;

/**
 * This is an entity class for the eG Agent. 
 * This is the parent class for other agent classes.
 * @author Murugapandian
 *
 */
public class Agent {
	/**
	 * host name or nick name or FQDN
	 */
	String agentName;
	/**
	 * IP of the agent
	 */
	String hostIp;
	/**
	 * To eG manager the agent is reporting
	 */
	String reportingManager;
	/**
	 * @param line agentname,hostIp format
	 */
	public Agent(String line) {
		String[] tokens = line.split(",");
		this.agentName=tokens[0];
		this.hostIp=tokens[1];
	}
	public Agent() {
		super();
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getHostIp() {
		return hostIp;
	}
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}
	public String getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
}
