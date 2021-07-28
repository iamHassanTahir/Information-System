package com.uog.project.model;

public class AcademicsCalendar {

	private long ACADEMICSCALENDAR_ID;
	
	private AcademicsYear ACADEMICSYEAR_ID;
	
	private String ACADEMICSCALENDAR_DESC;
	
	private String ACADEMICSCALENDAR_STARTDATE;
	
	private String ACADEMICSCALENDAR_ENDDATE;
	
	private String ISACTIVE;
	
	private Long MODIFIED_BY;
	
	private String MODIFIED_WHEN;
	
	private String MODIFIED_WORKSTATION;

	public long getACADEMICSCALENDAR_ID() {
		return ACADEMICSCALENDAR_ID;
	}

	public void setACADEMICSCALENDAR_ID(long aCDCALENDAR_ID) {
		ACADEMICSCALENDAR_ID = aCDCALENDAR_ID;
	}

	public AcademicsYear getACADEMICSYEAR_ID() {
		return ACADEMICSYEAR_ID;
	}

	public void setACADEMICSYEAR_ID(AcademicsYear aCDYEAR_ID) {
		ACADEMICSYEAR_ID = aCDYEAR_ID;
	}

	public String getACADEMICSCALENDAR_DESC() {
		return ACADEMICSCALENDAR_DESC;
	}

	public void setACADEMICSCALENDAR_DESC(String aCDCALENDAR_DESC) {
		ACADEMICSCALENDAR_DESC = aCDCALENDAR_DESC;
	}

	public String getACADEMICSCALENDAR_STARTDATE() {
		return ACADEMICSCALENDAR_STARTDATE;
	}

	public void setACADEMICSCALENDAR_STARTDATE(String aCDCALENDAR_STARTDATE) {
		ACADEMICSCALENDAR_STARTDATE = aCDCALENDAR_STARTDATE;
	}

	public String getACADEMICSCALENDAR_ENDDATE() {
		return ACADEMICSCALENDAR_ENDDATE;
	}

	public void setACADEMICSCALENDAR_ENDDATE(String aCDCALENDAR_ENDDATE) {
		ACADEMICSCALENDAR_ENDDATE = aCDCALENDAR_ENDDATE;
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
		return (long) 1;
	}

}