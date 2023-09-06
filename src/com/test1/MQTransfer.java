package com.test1;

public class MQTransfer {
	private String id;
	private String dataTypeApplicable;
	private String scriptName;
	private String host;
	private String targetHost;
	private String targetLocation;
	private String module;
	private String scriptLocation;
	private int errorCode;
	private String errorSevetiry;
	private String entityState;

	public MQTransfer() {

	}

	public MQTransfer(String id, String dataTypeApplicable, String scriptName, String host, String targetHost,
			String targetLocation, String module, String scriptLocation, int errorCode, String errorSevetiry,
			String entityState) {
		super();
		this.id = id;
		this.dataTypeApplicable = dataTypeApplicable;
		this.scriptName = scriptName;
		this.host = host;
		this.targetHost = targetHost;
		this.targetLocation = targetLocation;
		this.module = module;
		this.scriptLocation = scriptLocation;
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

	public String getDataTypeApplicable() {
		return dataTypeApplicable;
	}

	public void setDataTypeApplicable(String dataTypeApplicable) {
		this.dataTypeApplicable = dataTypeApplicable;
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

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getScriptLocation() {
		return scriptLocation;
	}

	public void setScriptLocation(String scriptLocation) {
		this.scriptLocation = scriptLocation;
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
