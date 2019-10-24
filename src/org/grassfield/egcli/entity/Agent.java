package org.grassfield.egcli.entity;

/**
 * This is an entity class for the eG Agent. 
 * This is the parent class for other agent classes.
 * @author Ramaiah Murugapandian
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
	 * @param line agentname,hostIp format
	 */
	public Agent(String line) {
		String[] tokens = line.split(",");
		this.agentName=tokens[0];
		this.hostIp=tokens[1];
	}
	/**
	 * @param line agent details in agentname,hostIp format. 
	 * @param delimiter Specify the delimiter to be used to split the line parameter
	 */
	public Agent(String line, String delimiter) {
		String[] tokens = line.split(delimiter);
		if (tokens.length<2) {
			throw new UnrecognizedAgentException(line+" and "+delimiter+" looks invalid");
		}
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
	@Override
	public String toString() {
		return "Agent [agentName=" + agentName + ", hostIp=" + hostIp + "]";
	}
	
}
