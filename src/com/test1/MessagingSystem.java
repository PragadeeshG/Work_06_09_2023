package com.test1;

public class MessagingSystem {
	private String id;
	private String refld;
	private String meassageType;
	private String dataType;
	private String transferTime;
	private String downstreamName;
	private boolean autoTransfer;
	private String transferType;
	private int errorCode;
	private String errorSevetiry;
	private String entityState;

	public MessagingSystem() {

	}

	public MessagingSystem(String id, String refld, String meassageType, String dataType, String transferTime,
			String downstreamName, boolean autoTransfer, String transferType, int errorCode, String errorSevetiry,
			String entityState) {
		super();
		this.id = id;
		this.refld = refld;
		this.meassageType = meassageType;
		this.dataType = dataType;
		this.transferTime = transferTime;
		this.downstreamName = downstreamName;
		this.autoTransfer = autoTransfer;
		this.transferType = transferType;
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

	public String getRefld() {
		return refld;
	}

	public void setRefld(String refld) {
		this.refld = refld;
	}

	public String getMeassageType() {
		return meassageType;
	}

	public void setMeassageType(String meassageType) {
		this.meassageType = meassageType;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getTransferTime() {
		return transferTime;
	}

	public void setTransferTime(String transferTime) {
		this.transferTime = transferTime;
	}

	public String getDownstreamName() {
		return downstreamName;
	}

	public void setDownstreamName(String downstreamName) {
		this.downstreamName = downstreamName;
	}

	public boolean isAutoTransfer() {
		return autoTransfer;
	}

	public void setAutoTransfer(boolean autoTransfer) {
		this.autoTransfer = autoTransfer;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
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
