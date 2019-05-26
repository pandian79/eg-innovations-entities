package org.grassfield.eg;

/**
 * This an entity class for External agent. This is the subclass of Agent.
 * @author Murugapandian
 *
 */
public class ExternalAgent extends Agent {
	String clientEmulation="no";

	public ExternalAgent(String line) {
		String[] tokens = line.split(",");
		super.agentName=tokens[0];
		super.hostIp=tokens[1];
		try {
			this.clientEmulation=tokens[2];
		} catch (Exception e) {
			//suppressing this exception as cli does not give client emulation status
		}
	}

	public ExternalAgent() {
		super();
	}

	public String getClientEmulation() {
		return clientEmulation;
	}

	public void setClientEmulation(String clientEmulation) {
		this.clientEmulation = clientEmulation;
	}

	@Override
	public String toString() {
		return "ExternalAgent [clientEmulation=" + clientEmulation + ", agentName=" + agentName + ", hostIp=" + hostIp
				+ "]";
	}
}
