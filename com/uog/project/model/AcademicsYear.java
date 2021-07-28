package com.uog.project.model;

public class AcademicsYear {

	private long ACADEMICSYEAR_ID;

	private University UNIVERSITY_ID;

	private String ACADEMICSYEAR_DESC;

	private String ACADEMICSYEAR_STARTDATE;

	private String ACADEMICSYEAR_ENDDATE;

	private String ISACTIVE;

	private Long MODIFIED_BY;

	private String MODIFIED_WHEN;

	private String MODIFIED_WORKSTATION;

	public long getACADEMICSYEAR_ID() {
		return ACADEMICSYEAR_ID;
	}

	public void setACADEMICSYEAR_ID(long aCDYEAR_ID) {
		ACADEMICSYEAR_ID = aCDYEAR_ID;
	}

	public University getUNIVERSITY_ID() {
		return UNIVERSITY_ID;
	}

	public void setUNIVERSITY_ID(University uNIVERSITY_ID) {
		UNIVERSITY_ID = uNIVERSITY_ID;
	}

	public String getACADEMICSYEAR_DESC() {
		return ACADEMICSYEAR_DESC;
	}

	public void setACADEMICSYEAR_DESC(String ACADEMICSYEAR_DESC) {
		this.ACADEMICSYEAR_DESC = ACADEMICSYEAR_DESC;
	}

	public String getACADEMICSYEAR_STARTDATE() {
		return ACADEMICSYEAR_STARTDATE;
	}

	public void setACADEMICSYEAR_STARTDATE(String ACADEMICSYER_STARTDATE) {
		this.ACADEMICSYEAR_STARTDATE = ACADEMICSYER_STARTDATE;
	}

	public String getACADEMICSYEAR_ENDDATE() {
		return ACADEMICSYEAR_ENDDATE;
	}

	public void setACADEMICSYEAR_ENDDATE(String ACCDYEAR_ENDDATE) {
		this.ACADEMICSYEAR_ENDDATE = ACCDYEAR_ENDDATE;
	}

	public String getISACTIVE() {
		return ISACTIVE;
	}

	public void setISACTIVE(String ISACTIVE) {
		this.ISACTIVE = ISACTIVE;
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
		return (long) 2;
	}

}
