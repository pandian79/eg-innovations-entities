package org.grassfield.egcli.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is an entity class that represents the eG Component.
 * @author Murugapandian
 *
 */
public class Component implements Comparable<Component>{
	static Logger logger = LoggerFactory.getLogger(Component.class);
	protected String type;
	protected String ip;
	protected String hostname;
	protected String port;
	protected String sid;
	
	public Component() {
		super();
	}
	public Component(String type, String line, String delimiter) {
		this.type=type;
		String[] tokens = line.split(delimiter);
		if (tokens.length<2) {
			throw new UnrecognizedComponentException(line+" and "+delimiter+" looks invalid");
		}
		this.ip=tokens[0];
		if (tokens[1].indexOf(Constants.COLON)==-1) {
			//no port component
			this.hostname=tokens[1];
		}else {
			//port component
			String[] split = tokens[1].split(Constants.COLON);
			this.hostname = split[0];
			this.port = split[1];
		}
	}
	public Component(String type, String hostname, String port, String sid) {
		this.type = type;
		this.hostname = hostname;
		this.port = port;
		this.sid = sid;
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
	
	@Override
	public String toString() {
		return "Component ["+this.getComponentNameInEgFormat()+"]";
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
				this.type+":"+this.hostname+":NULL"
				:this.type+":"+this.hostname+":"+this.port;
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
