package com.test1;

public class MessagingSystemType {
	private String id;
	private String type;
	private String effectiveStartDate;
	private String transferMechanism;
	private boolean fastTransfer;
	private boolean secureTransfer;
	private int errorCode;
	private String errorSevetiry;
	private String entityState;

	public MessagingSystemType() {

	}

	public MessagingSystemType(String id, String type, String effectiveStartDate, String transferMechanism,
			boolean fastTransfer, boolean secureTransfer, int errorCode, String errorSevetiry, String entityState) {
		super();
		this.id = id;
		this.type = type;
		this.effectiveStartDate = effectiveStartDate;
		this.transferMechanism = transferMechanism;
		this.fastTransfer = fastTransfer;
		this.secureTransfer = secureTransfer;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEffectiveStartDate() {
		return effectiveStartDate;
	}

	public void setEffectiveStartDate(String effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getTransferMechanism() {
		return transferMechanism;
	}

	public void setTransferMechanism(String transferMechanism) {
		this.transferMechanism = transferMechanism;
	}

	public boolean isFastTransfer() {
		return fastTransfer;
	}

	public void setFastTransfer(boolean fastTransfer) {
		this.fastTransfer = fastTransfer;
	}

	public boolean isSecureTransfer() {
		return secureTransfer;
	}

	public void setSecureTransfer(boolean secureTransfer) {
		this.secureTransfer = secureTransfer;
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
