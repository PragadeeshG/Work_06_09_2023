package com.test1;

public class FMTransfer {
	private String id;
	private String fileTypeApplicable;
	private String scriptName;
	private String host;
	private String targetHost;
	private String targetLocation;
	private boolean secureCopy;
	private String scriptLocation;
	private boolean encryptData;
	private String encryptionKey;
	private int errorCode;
	private String errorSevetiry;
	private String entityState;

	public FMTransfer() {

	}

	public FMTransfer(String id, String fileTypeApplicable, String scriptName, String host, String targetHost,
			String targetLocation, boolean secureCopy, String scriptLocation, boolean encryptData, String encryptionKey,
			int errorCode, String errorSevetiry, String entityState) {
		super();
		this.id = id;
		this.fileTypeApplicable = fileTypeApplicable;
		this.scriptName = scriptName;
		this.host = host;
		this.targetHost = targetHost;
		this.targetLocation = targetLocation;
		this.secureCopy = secureCopy;
		this.scriptLocation = scriptLocation;
		this.encryptData = encryptData;
		this.encryptionKey = encryptionKey;
		this.errorCode = errorCode;
		this.errorSevetiry = errorSevetiry;
		this.entityState = entityState;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileTypeApplicable() {
		return fileTypeApplicable;
	}

	public void setFileTypeApplicable(String fileTypeApplicable) {
		this.fileTypeApplicable = fileTypeApplicable;
	}

	public String getScriptName() {
		return scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getTargetHost() {
		return targetHost;
	}

	public void setTargetHost(String targetHost) {
		this.targetHost = targetHost;
	}

	public String getTargetLocation() {
		return targetLocation;
	}

	public void setTargetLocation(String targetLocation) {
		this.targetLocation = targetLocation;
	}

	public boolean isSecureCopy() {
		return secureCopy;
	}

	public void setSecureCopy(boolean secureCopy) {
		this.secureCopy = secureCopy;
	}

	public String getScriptLocation() {
		return scriptLocation;
	}

	public void setScriptLocation(String scriptLocation) {
		this.scriptLocation = scriptLocation;
	}

	public boolean isEncryptData() {
		return encryptData;
	}

	public void setEncryptData(boolean encryptData) {
		this.encryptData = encryptData;
	}

	public String getEncryptionKey() {
		return encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSevetiry() {
		return errorSevetiry;
	}

	public void setErrorSevetiry(String errorSevetiry) {
		this.errorSevetiry = errorSevetiry;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
