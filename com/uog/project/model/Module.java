package com.uog.project.model;

public class Module {

    private long MODULE_ID;
    
	private Department DEPARTMENT_ID;

    private long MODULE_NO;

    private String MODULE_CODE;

    private String MODULE_TITLE;

    private String MODULE_INTRODUCTION;

    private long MODULE_LEVEL;

    private long CREDIT_HOURS;

    private long GUIDEDLEARNING_HOURS;

	private String ISACTIVE;

	private Long MODIFIED_BY;
    
	private String MODIFIED_WHEN;
    
	private String MODIFIED_WORKSTATION;

	public long getMODULE_ID() {
		return MODULE_ID;
	}

	public void setMODULE_ID(long mODULE_ID) {
		MODULE_ID = mODULE_ID;
	}

	
	public Department getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}

	public void setDEPARTMENT_ID(Department dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}

	public long getMODULE_NO() {
		return MODULE_NO;
	}

	public void setMODULE_NO(long mODULE_NO) {
		MODULE_NO = mODULE_NO;
	}

	public String getMODULE_CODE() {
		return MODULE_CODE;
	}

	public void setMODULE_CODE(String mODULE_CODE) {
		MODULE_CODE = mODULE_CODE;
	}

	public String getMODULE_TITLE() {
		return MODULE_TITLE;
	}

	public void setMODULE_TITLE(String mODULE_TITLE) {
		MODULE_TITLE = mODULE_TITLE;
	}

	public String getMODULE_INTRODUCTION() {
		return MODULE_INTRODUCTION;
	}

	public void setMODULE_INTRODUCTION(String mODULE_INTRODUCTION) {
		MODULE_INTRODUCTION = mODULE_INTRODUCTION;
	}

	public long getMODULE_LEVEL() {
		return MODULE_LEVEL;
	}

	public void setMODULE_LEVEL(long mODULE_LEVEL) {
		MODULE_LEVEL = mODULE_LEVEL;
	}

	public long getCREDIT_HOURS() {
		return CREDIT_HOURS;
	}

	public void setCREDIT_HOURS(long cREDIT_HOURS) {
		CREDIT_HOURS = cREDIT_HOURS;
	}

	public long getGUIDEDLEARNING_HOURS() {
		return GUIDEDLEARNING_HOURS;
	}

	public void setGUIDEDLEARNING_HOURS(long gUIDEDLEARNING_HOURS) {
		GUIDEDLEARNING_HOURS = gUIDEDLEARNING_HOURS;
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
		return (long) 13;
	}

}

