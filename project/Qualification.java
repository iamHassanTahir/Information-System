package com.uog.project;

public class Qualification {

	private long QUALIFICATION_ID;

	private University UNIVERSITY_ID;

	private String QUALIFICATION_CODE;

	private String QUALIFICATION_NAME;

	private String QUALIFICATION_DESCRIPTION;

	private String ISACTIVE;

	private Long MODIFIED_BY;
	
	private String MODIFIED_WHEN;
	
	private String MODIFIED_WORKSTATION;

	public long getQUALIFICATION_ID() {
		return QUALIFICATION_ID;
	}

	public void setQUALIFICATION_ID(long qUALIFICATION_ID) {
		QUALIFICATION_ID = qUALIFICATION_ID;
	}

	public University getUNIVERSITY_ID() {
		return UNIVERSITY_ID;
	}

	public void setUNIVERSITY_ID(University uNIVERSITY_ID) {
		UNIVERSITY_ID = uNIVERSITY_ID;
	}

	public String getQUALIFICATION_CODE() {
		return QUALIFICATION_CODE;
	}

	public void setQUALIFICATION_CODE(String qUALIFICATION_CODE) {
		QUALIFICATION_CODE = qUALIFICATION_CODE;
	}

	public String getQUALIFICATION_NAME() {
		return QUALIFICATION_NAME;
	}

	public void setQUALIFICATION_NAME(String qUALIFICATION_NAME) {
		QUALIFICATION_NAME = qUALIFICATION_NAME;
	}

	public String getQUALIFICATION_DESCRIPTION() {
		return QUALIFICATION_DESCRIPTION;
	}

	public void setQUALIFICATION_DESCRIPTION(String qUALIFICATION_DESCRIPTION) {
		QUALIFICATION_DESCRIPTION = qUALIFICATION_DESCRIPTION;
	}

	public String getISACTIVE() {
		return ISACTIVE;
	}

	public void setISACTIVE(String iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}
	
	public Long getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(Long mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}
	
	public String getMODIFIED_WHEN() {
		return MODIFIED_WHEN;
	}

	public void setMODIFIED_WHEN(String mODIFIED_WHEN) {
		MODIFIED_WHEN = mODIFIED_WHEN;
	}
	
	public String getMODIFIED_WORKSTATION() {
		return MODIFIED_WORKSTATION;
	}

	public void setMODIFIED_WORKSTATION(String mODIFIED_WORKSTATION) {
		MODIFIED_WORKSTATION = mODIFIED_WORKSTATION;
	}

	public static long getDatabaseTableID() {
		return (long) 16;
	}

}