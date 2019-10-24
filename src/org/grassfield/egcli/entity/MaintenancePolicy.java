package org.grassfield.egcli.entity;

/**
 * Pojo class for Maintenance Policy
 * @author Ramaiah Murugapandian
 *
 */
public class MaintenancePolicy {
	/**
	 * Maintenance policy name
	 */
	private String name;

	public MaintenancePolicy(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
