package com.uog.project.model;

public class SemesterTimeSlot {

	private long TIMESLOT_ID;
	
	private Campus CAMPUS_ID;
	
	private Semester SEMESTER_ID;
	
	private Lookup WEEKDAY_ID;
	
	private String TIMESLOT_START;
	
	private String TIMESLOT_END;
	

	private String ISACTIVE;
	
	private Long MODIFIED_BY;
	
	private String MODIFIED_WHEN;
	
	private String MODIFIED_WORKSTATION;

	public long getTIMESLOT_ID() {
		return TIMESLOT_ID;
	}

	public void setTIMESLOT_ID(long tIMESLOT_ID) {
		TIMESLOT_ID = tIMESLOT_ID;
	}

	public Campus getCAMPUS_ID() {
		return CAMPUS_ID;
	}

	public void setCAMPUS_ID(Campus cAMPUS_ID) {
		CAMPUS_ID = cAMPUS_ID;
	}

	public Semester getSEMESTER_ID() {
		return SEMESTER_ID;
	}

	public void setSEMESTER_ID(Semester sEMESTER_ID) {
		SEMESTER_ID = sEMESTER_ID;
	}

	public Lookup getWEEKDAY_ID() {
		return WEEKDAY_ID;
	}

	public void setWEEKDAY_ID(Lookup wEEKDAY_ID) {
		WEEKDAY_ID = wEEKDAY_ID;
	}

	public String getTIMESLOT_START() {
		return TIMESLOT_START;
	}

	public void setTIMESLOT_START(String tIMESLOT_START) {
		TIMESLOT_START = tIMESLOT_START;
	}

	public String getTIMESLOT_END() {
		return TIMESLOT_END;
	}

	public void setTIMESLOT_END(String tIMESLOT_END) {
		TIMESLOT_END = tIMESLOT_END;
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
		return (long) 26;
	}

}

