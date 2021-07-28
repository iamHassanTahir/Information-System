package com.uog.project.model;

public class IntakeCourse {

	private long INTAKECOURSE_ID;

	private Intake INTAKE_ID;

	private Course COURSE_ID;

	private Lookup COURSEMODE_ID;

	private Campus CAMPUS_ID;

	private Lookup LOCATIONSTUDY_ID;

	private String INTAKECOURSE_STARTDATE;

	private String INTAKECOURSE_ENDDATE;

	private Lookup COURSEFEEPLAN_ID;

	private Long NET_FEE;

	private Long GROSS_FEE;

	private Long SELFFINANCE_FEE;

	private Long HOURS_PERWEEK;

	private Long WEEKS_PERYEAR;

	private Lookup INTAKESTATUS_ID;
	
	private Long AGE_LIMIT;

	private String ISACTIVE;

	private Long MODIFIED_BY;
	
	private String MODIFIED_WHEN;
	
	private String MODIFIED_WORKSTATION;

	public long getINTAKECOURSE_ID() {
		return INTAKECOURSE_ID;
	}

	public void setINTAKECOURSE_ID(long iNTAKECOURSE_ID) {
		INTAKECOURSE_ID = iNTAKECOURSE_ID;
	}

	public Intake getINTAKE_ID() {
		return INTAKE_ID;
	}

	public void setINTAKE_ID(Intake iNTAKE_ID) {
		INTAKE_ID = iNTAKE_ID;
	}

	public Course getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(Course cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public Lookup getCOURSEMODE_ID() {
		return COURSEMODE_ID;
	}

	public void setCOURSEMODE_ID(Lookup cOURSEMODE_ID) {
		COURSEMODE_ID = cOURSEMODE_ID;
	}

	public Campus getCAMPUS_ID() {
		return CAMPUS_ID;
	}

	public void setCAMPUS_ID(Campus cAMPUS_ID) {
		CAMPUS_ID = cAMPUS_ID;
	}

	public Lookup getLOCATIONSTUDY_ID() {
		return LOCATIONSTUDY_ID;
	}

	public void setLOCATIONSTUDY_ID(Lookup lOCATIONSTUDY_ID) {
		LOCATIONSTUDY_ID = lOCATIONSTUDY_ID;
	}

	public String getINTAKECOURSE_STARTDATE() {
		return INTAKECOURSE_STARTDATE;
	}

	public void setINTAKECOURSE_STARTDATE(String iNTAKECOURSE_STARTDATE) {
		INTAKECOURSE_STARTDATE = iNTAKECOURSE_STARTDATE;
	}

	public String getINTAKECOURSE_ENDDATE() {
		return INTAKECOURSE_ENDDATE;
	}

	public void setINTAKECOURSE_ENDDATE(String iNTAKECOURSE_ENDDATE) {
		INTAKECOURSE_ENDDATE = iNTAKECOURSE_ENDDATE;
	}

	public Lookup getCOURSEFEEPLAN_ID() {
		return COURSEFEEPLAN_ID;
	}

	public void setCOURSEFEEPLAN_ID(Lookup cOURSEFEEPLAN_ID) {
		COURSEFEEPLAN_ID = cOURSEFEEPLAN_ID;
	}

	public Long getNET_FEE() {
		return NET_FEE;
	}

	public void setNET_FEE(Long nET_FEE) {
		NET_FEE = nET_FEE;
	}

	public Long getGROSS_FEE() {
		return GROSS_FEE;
	}

	public void setGROSS_FEE(Long gROSS_FEE) {
		GROSS_FEE = gROSS_FEE;
	}

	public Long getSELFFINANCE_FEE() {
		return SELFFINANCE_FEE;
	}

	public void setSELFFINANCE_FEE(Long sELFFINANCE_FEE) {
		SELFFINANCE_FEE = sELFFINANCE_FEE;
	}

	public Long getHOURS_PERWEEK() {
		return HOURS_PERWEEK;
	}

	public void setHOURS_PERWEEK(Long hOURS_PERWEEK) {
		HOURS_PERWEEK = hOURS_PERWEEK;
	}

	public Long getWEEKS_PERYEAR() {
		return WEEKS_PERYEAR;
	}

	public void setWEEKS_PERYEAR(Long wEEKS_PERYEAR) {
		WEEKS_PERYEAR = wEEKS_PERYEAR;
	}

	public Lookup getINTAKESTATUS_ID() {
		return INTAKESTATUS_ID;
	}

	public void setINTAKESTATUS_ID(Lookup iNTAKESTATUS_ID) {
		INTAKESTATUS_ID = iNTAKESTATUS_ID;
	}

	public Long getAGE_LIMIT() {
		return AGE_LIMIT;
	}

	public void setAGE_LIMIT(Long aGE_LIMIT) {
		AGE_LIMIT = aGE_LIMIT;
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
		return (long) 12;
	}

}

