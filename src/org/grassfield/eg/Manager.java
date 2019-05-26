package org.grassfield.eg;

/**
 * This is an entity class for eG primary/secondary managers.
 * @author Murugapandian
 *
 */
public class Manager {
	private static final String EQUAL = "=";
	String name;
	String ip;
	String redundancyType;
	/**
	 * @param rline 192.168.1.115=192.168.1.115
	 */
	public Manager(String rline) {
		String[] split = rline.split(EQUAL);
		this.name=split[0];
		this.ip=split[1];
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getRedundancyType() {
		return redundancyType;
	}
	public void setRedundancyType(String redundancyType) {
		this.redundancyType = redundancyType;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", ip=" + ip + "]";
	}
}
