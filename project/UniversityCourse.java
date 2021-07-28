package com.uog.project;

public class UniversityCourse {

    private long UNIVERSITYCOURSE_ID;

	private Course COURSE_ID;
	
	private Department DEPARTMENT_ID;
	
	private Qualification QUALIFICATION_ID;
	
	private Lookup AWARDINGBODY_ID;
	
    private String ISACTIVE;

	private Long MODIFIED_BY;
    
	private String MODIFIED_WHEN;
    
	private String MODIFIED_WORKSTATION;

	public long getUNIVERSITYCOURSE_ID() {
		return UNIVERSITYCOURSE_ID;
	}

	public void setUNIVERSITYCOURSE_ID(long uNIVERSITYCOURSE_ID) {
		UNIVERSITYCOURSE_ID = uNIVERSITYCOURSE_ID;
	}

	public Course getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(Course cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public Department getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}

	public void setDEPARTMENT_ID(Department dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}

	public Qualification getQUALIFICATION_ID() {
		return QUALIFICATION_ID;
	}

	public void setQUALIFICATION_ID(Qualification qUALIFICATION_ID) {
		QUALIFICATION_ID = qUALIFICATION_ID;
	}

	public Lookup getAWARDINGBODY_ID() {
		return AWARDINGBODY_ID;
	}

	public void setAWARDINGBODY_ID(Lookup aWARDINGBODY_ID) {
		AWARDINGBODY_ID = aWARDINGBODY_ID;
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
		return (long) 28;
	}

}

