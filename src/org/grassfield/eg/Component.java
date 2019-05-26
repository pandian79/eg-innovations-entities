package org.grassfield.eg;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.grassfield.eg.entity.util.Utilities;

/**
 * This is an entity class that represents the eG Component.
 * @author Murugapandian
 *
 */
public class Component implements Comparable<Component>{
	private Logger logger = LogManager.getLogger(Component.class);
	protected String type;
	protected String ip;
	protected String hostname;
	protected String componentName;
	protected String port;
	protected String sid;
	protected String mtsEnabled;
	protected String isPassive;
	protected String agentLess;
	protected String internalAgentAssignment;
	protected String internalAgent;
	protected String os;
	protected String mode;
	protected String encryptType;
	protected String keyFileName;
	protected String remotePort;
	protected String remoteUser;
	protected String remotePwd;
	protected String remoteAgent;
	protected String externalAgents;
	protected String asset;
	protected String location;
	protected String reportingManager;
	protected String zone;
	String group;
	
	public Component() {
		super();
	}
	@Deprecated
	protected Component(String line, boolean fromCli) {
		String[] tokens = line.split(Constants.COMMA);
		this.logger.info("Token count:"+tokens.length);
		this.type=tokens[0];
		if (fromCli) {
			//AIX,10.247.122.37,HISBKPPPMED01,-,-
			this.hostname=tokens[2];
			this.ip=tokens[1];
		}else {
			this.hostname=tokens[1];
			this.ip=tokens[2];
		}
		this.port=tokens[3];
		if (tokens.length>4) {
			try {
				this.sid=tokens[4];
				this.mtsEnabled=tokens[5];
				this.isPassive=tokens[6];
				this.agentLess=tokens[7];
				this.internalAgentAssignment=tokens[8];
				this.internalAgent=tokens[9];
				this.os=tokens[10];
				this.mode=tokens[11];
				this.encryptType=tokens[12];
				this.keyFileName=tokens[13];
				this.remotePort=tokens[14];
				this.remoteUser=tokens[15];
				this.remotePwd=tokens[16];
				this.remoteAgent=tokens[17];
				this.externalAgents=tokens[18];
				this.asset=tokens[19];
				this.location=tokens[20];
				this.reportingManager=tokens[21];
				this.zone=tokens[22];
			} catch (Exception e) {
				logger.error("Ignored Exception while parsing line "+line, e);
			}
		}
	}
	public Component(String type, String hostname, String port) {
		if (type==null || type.equalsIgnoreCase("null")) {
			String message = "Type can not be null "+type;
			logger.error(message);
			throw new IllegalArgumentException(message);
		}
		if (hostname==null || hostname.equalsIgnoreCase("null")) {
			String message = "hostname can not be null "+hostname;
			logger.error(message);
			throw new IllegalArgumentException(message);
		}
		if (port==null) {
			String message = "Port can not be null "+port;
			logger.error(message);
			throw new IllegalArgumentException(message);
		}
		this.type = type;
		this.hostname = hostname;
		this.componentName=hostname;
		this.port = port;
		
		logger.info(this.type+" "+this.hostname+" "+this.port);
	}
	public Component(String type, String hostname, String port, String sid) {
		this.type = type;
		this.hostname = hostname;
		this.port = port;
		this.sid = sid;
	}
	/**
	 * Instantiate component with a record and its header list
	 * @param line
	 * @param headers
	 */
	public Component(String line, List<String> headers) {
		String [] toks = line.split(Constants.CSV_SPLIT_WITH_QUOTE);
		for (int i=0; i<toks.length; i++) {
			String tok = toks[i];
			String string = headers.get(i);
			string = string.toUpperCase();
			logger.info("Tokens: "+string+" "+tok);
			switch(string) {
			case "COMPONENTTYPE":
				this.type=tok;
				break;
			case "COMPONENT TYPE":
				this.type=tok;
				break;
			case "COMPONENTNAME":
				this.componentName=tok;
				this.hostname=tok;
				break;
			case "COMPONENT NAME":
				this.componentName=tok;
				this.hostname=tok;
				break;
			case "HOSTIP":
				this.ip=tok;
				break;
			case "HOSTNAME":
				this.hostname=tok;
				break;
			case "HOSTIP/NAME":
				if (Utilities.isIp(tok))
					this.ip=tok;
				else
					this.hostname=tok;
				break;
			case "PORT":
				this.port=tok;
				break;
			case "SID":
				this.sid=tok;
				break;
			case "MTSENABLED":
				this.mtsEnabled=tok;
				break;
			case "ISPASSIVE":
				this.isPassive=tok;
				break;
			case "AGENTLESS":
				this.agentLess=tok;
				break;
			case "INTERNALAGENTASSIGNMENT":
				this.internalAgentAssignment=tok;
				break;
			case "INTERNALAGENT":
				this.internalAgent=tok;
				break;
			case "OS":
				this.os=tok;
				break;
			case "MODE":
				this.mode=tok;
				break;
			case "ENCRYPTTYPE":
				this.encryptType=tok;
				break;
			case "KEYFILENAME":
				this.keyFileName=tok;
				break;
			case "REMOTEPORT":
				this.remotePort=tok;
				break;
			case "REMOTEUSER":
				this.remoteUser=tok;
				break;
			case "REMOTEPWD":
				this.remotePwd=tok;
				break;
			case "REMOTEAGENT":
				this.remoteAgent=tok;
				break;
			case "EXTERNALAGENTS":
				this.externalAgents=tok;
				break;
			case "ASSET NAME":
				this.asset=tok;
				break;
			case "ASSET LOCATION":
				this.location=tok;
				break;
			case "REPORTING MANAGER":
				this.reportingManager=tok;
				break;
			case "ZONES":
				this.zone=tok;
				break;
			default:
					throw new RuntimeException("Unknown header received "+string);
			}
			
		}
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getHostname() {
		return this.hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		try {
			Integer.parseInt(port);
			this.port=port;
		} catch (NumberFormatException e) {
			//hiphen or null received. ignore
		}
	}
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getMtsEnabled() {
		return mtsEnabled;
	}
	public void setMtsEnabled(String mtsEnabled) {
		this.mtsEnabled = mtsEnabled;
	}
	public String getIsPassive() {
		return isPassive;
	}
	public void setIsPassive(String isPassive) {
		this.isPassive = isPassive;
	}
	public String getAgentLess() {
		return agentLess;
	}
	public void setAgentLess(String agentLess) {
		this.agentLess = agentLess;
	}
	public String getInternalAgentAssignment() {
		return internalAgentAssignment;
	}
	public void setInternalAgentAssignment(String internalAgentAssignment) {
		this.internalAgentAssignment = internalAgentAssignment;
	}
	public String getInternalAgent() {
		return internalAgent;
	}
	public void setInternalAgent(String internalAgent) {
		this.internalAgent = internalAgent;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getEncryptType() {
		return encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}
	public String getKeyFileName() {
		return keyFileName;
	}
	public void setKeyFileName(String keyFileName) {
		this.keyFileName = keyFileName;
	}
	public String getRemotePort() {
		return remotePort;
	}
	public void setRemotePort(String remotePort) {
		this.remotePort = remotePort;
	}
	public String getRemoteUser() {
		return remoteUser;
	}
	public void setRemoteUser(String remoteUser) {
		this.remoteUser = remoteUser;
	}
	public String getRemotePwd() {
		return remotePwd;
	}
	public void setRemotePwd(String remotePwd) {
		this.remotePwd = remotePwd;
	}
	public String getRemoteAgent() {
		return remoteAgent;
	}
	public void setRemoteAgent(String remoteAgent) {
		this.remoteAgent = remoteAgent;
	}
	public String getExternalAgents() {
		return externalAgents;
	}
	public void setExternalAgents(String externalAgents) {
		this.externalAgents = externalAgents;
	}
	public String getAsset() {
		return asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setHeader(String[] header) {
		throw new RuntimeException("this operation not supported");
	}
	public String getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
	
	@Override
	public String toString() {
		return "Component ["+this.getComponentNameInEgFormat()+"]";
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	/**
	 * This returns the component name in type:name:port format
	 * 
	 */
	public String getComponentNameInEgFormat() {
		return (
					this.port==null || 
					this.port.trim().equals("")||
					this.port.trim().equals("-")
				)?
				this.type+":"+this.componentName+":NULL"
				:this.type+":"+this.componentName+":"+this.port;
	}
	@Override
	public int compareTo(Component arg0) {
		logger.info("compareTo :"+arg0.getComponentNameInEgFormat()+" => "+this.getComponentNameInEgFormat());
		int compareToIgnoreCase = arg0.getComponentNameInEgFormat().compareToIgnoreCase(this.getComponentNameInEgFormat());
		logger.info("Returning "+compareToIgnoreCase);
		return compareToIgnoreCase;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		String componentNameInEgFormat = this.getComponentNameInEgFormat();
		result = prime * result + ((componentNameInEgFormat == null) ? 0 : componentNameInEgFormat.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		logger.info("equals "+obj);
		if (this == obj) {
			logger.info("returns true");
			return true;
		}
		if (obj == null) {
			logger.info("returns false");
			return false;
		}
		/*if (getClass() != obj.getClass()) {
			logger.info("native class: "+getClass()+" comparable class:"+obj.getClass());
			logger.info("returns false");
			return false;
		}*/
		Component other = (Component) obj;
		String componentNameInEgFormat = this.getComponentNameInEgFormat();
		logger.info("Compare equals :"+other.getComponentNameInEgFormat()+" => "+this.getComponentNameInEgFormat());
		
		if (componentNameInEgFormat == null) {
			if (other.getComponentNameInEgFormat() != null) {
				logger.info("returns false");
				return false;
			}
		} else if (!componentNameInEgFormat.equals(other.getComponentNameInEgFormat())) {
			logger.info("returns false");
			return false;
		}
		logger.info("returns true finally");
		return true;
	}
	
	

}
