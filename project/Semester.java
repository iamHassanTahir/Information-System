package com.uog.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Semester {
	
    private long SEMESTER_ID;

	private AcademicsYear ACADEMICSYEAR_ID;
	
	private String SEMESTER_DESC;
	
	private String SEMESTER_STARTDATE;
	
	private String SEMESTER_ENDDATE;

	private String ISACTIVE;

	private Long MODIFIED_BY;
	
	private String MODIFIED_WHEN;
	
	private String MODIFIED_WORKSTATION;

	public long getSEMESTER_ID() {
		return SEMESTER_ID;
	}

	public void setSEMESTER_ID(long sEMESTER_ID) {
		SEMESTER_ID = sEMESTER_ID;
	}

	public AcademicsYear getACADEMICSYEAR_ID() {
		return ACADEMICSYEAR_ID;
	}

	public void setACADEMICSYEAR_ID(AcademicsYear aCDYEAR_ID) {
		ACADEMICSYEAR_ID = aCDYEAR_ID;
	}

	public String getSEMESTER_DESC() {
		return SEMESTER_DESC;
	}

	public void setSEMESTER_DESC(String sEMESTER_DESC) {
		SEMESTER_DESC = sEMESTER_DESC;
	}

	public String getSEMESTER_STARTDATE() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(dateFormat.parse(SEMESTER_STARTDATE));
	}

	public void setSEMESTER_STARTDATE(String sEMESTER_STARTDATE) {
		SEMESTER_STARTDATE = sEMESTER_STARTDATE;
	}

	public String getSEMESTER_ENDDATE() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(dateFormat.parse(SEMESTER_ENDDATE));
	}

	public void setSEMESTER_ENDDATE(String sEMESTER_ENDDATE) {
		SEMESTER_ENDDATE = sEMESTER_ENDDATE;
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
		return (long) 25;
	}

}

