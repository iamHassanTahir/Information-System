package com.uog.project.model;

public class ModuleLearningOutcome {

	private long LEARNINGOUTCOME_ID;
	
	private Module MODULE_ID;

	private long LEARNINGOUTCOME_NO;
	
	private String LEARNINGOUTCOME_CODE;
	
	private String LEARNINGOUTCOME_DESC;
	
	private String LEARNINGOUTCOME_INTRODUCTION;
	
	private String LEARNINGOUTCOME_CONTENTLINK;
	
	private String ISACTIVE;
	
	private Long MODIFIED_BY;
	
	private String MODIFIED_WHEN;
	
	private String MODIFIED_WORKSTATION;

	public long getLEARNINGOUTCOME_ID() {
		return LEARNINGOUTCOME_ID;
	}

	public void setLEARNINGOUTCOME_ID(long lEARNINGOUTCOME_ID) {
		LEARNINGOUTCOME_ID = lEARNINGOUTCOME_ID;
	}

	public Module getMODULE_ID() {
		return MODULE_ID;
	}

	public void setMODULE_ID(Module mODULE_ID) {
		MODULE_ID = mODULE_ID;
	}

	public long getLEARNINGOUTCOME_NO() {
		return LEARNINGOUTCOME_NO;
	}

	public void setLEARNINGOUTCOME_NO(long lEARNINGOUTCOME_NO) {
		LEARNINGOUTCOME_NO = lEARNINGOUTCOME_NO;
	}

	public String getLEARNINGOUTCOME_CODE() {
		return LEARNINGOUTCOME_CODE;
	}

	public void setLEARNINGOUTCOME_CODE(String lEARNINGOUTCOME_CODE) {
		LEARNINGOUTCOME_CODE = lEARNINGOUTCOME_CODE;
	}

	public String getLEARNINGOUTCOME_DESC() {
		return LEARNINGOUTCOME_DESC;
	}

	public void setLEARNINGOUTCOME_DESC(String lEARNINGOUTCOME_DESC) {
		LEARNINGOUTCOME_DESC = lEARNINGOUTCOME_DESC;
	}

	public String getLEARNINGOUTCOME_INTRODUCTION() {
		return LEARNINGOUTCOME_INTRODUCTION;
	}

	public void setLEARNINGOUTCOME_INTRODUCTION(String lEARNINGOUTCOME_INTRODUCTION) {
		LEARNINGOUTCOME_INTRODUCTION = lEARNINGOUTCOME_INTRODUCTION;
	}

	public String getLEARNINGOUTCOME_CONTENTLINK() {
		return LEARNINGOUTCOME_CONTENTLINK;
	}

	public void setLEARNINGOUTCOME_CONTENTLINK(String lEARNINGOUTCOME_CONTENTLINK) {
		LEARNINGOUTCOME_CONTENTLINK = lEARNINGOUTCOME_CONTENTLINK;
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
		return (long) 15;
	}

}

