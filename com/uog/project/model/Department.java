package com.uog.project.model;

public class Department{

    private long DEPARTMENT_ID;
    
    private College COLLEGE_ID;

    private String DEPARTMENT_CODE;

    private String DEPARTMENT_NAME;

    private String DEPARTMENT_DESCRIPTION;

	private String ISACTIVE;

	private Long MODIFIED_BY;
    
	private String MODIFIED_WHEN;
    
	private String MODIFIED_WORKSTATION;

	public long getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}

	public void setDEPARTMENT_ID(long dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}

	public College getCOLLEGE_ID() {
		return COLLEGE_ID;
	}

	public void setCOLLEGE_ID(College cOLLEGE_ID) {
		COLLEGE_ID = cOLLEGE_ID;
	}

	public String getDEPARTMENT_CODE() {
		return DEPARTMENT_CODE;
	}

	public void setDEPARTMENT_CODE(String dEPARTMENT_CODE) {
		DEPARTMENT_CODE = dEPARTMENT_CODE;
	}

	public String getDEPARTMENT_NAME() {
		return DEPARTMENT_NAME;
	}

	public void setDEPARTMENT_NAME(String dEPARTMENT_NAME) {
		DEPARTMENT_NAME = dEPARTMENT_NAME;
	}

	public String getDEPARTMENT_DESCRIPTION() {
		return DEPARTMENT_DESCRIPTION;
	}

	public void setDEPARTMENT_DESCRIPTION(String dEPARTMENT_DESCRIPTION) {
		DEPARTMENT_DESCRIPTION = dEPARTMENT_DESCRIPTION;
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
		return (long) 10;
	}

}
