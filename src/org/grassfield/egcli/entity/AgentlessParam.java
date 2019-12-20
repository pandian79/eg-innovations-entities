package org.grassfield.egcli.entity;

/**
 * Parameters needed for a component monitored without an internal agent
 * @author Ramaiah Murugapandian
 *
 */
public class AgentlessParam {
    /**
     * Username to monitor the server
     */
    String user;
    /**
     * Password of user to monitor the server
     */
    String password;
    /**
     * Method of monitoring. SNMP or JMX or WMI etc
     */
    String mode;
    /**
     * Operating System of the target server to be monitored
     */
    String os;
    /**
     * Port of the application/server to be monitored
     */
    String remotePort;
    /**
     * If any encryption is needed, the type will be mentioned here
     */
    String encryptionType;
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public String getRemotePort() {
        return remotePort;
    }
    public void setRemotePort(String remotePort) {
        this.remotePort = remotePort;
    }
    public String getEncryptionType() {
        return encryptionType;
    }
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }
    @Override
    public String toString() {
        return "AgentlessParam [user=" + user + ", password=" + password + ", mode=" + mode + ", os=" + os
                + ", remotePort=" + remotePort + ", encryptionType=" + encryptionType + "]";
    }

}
