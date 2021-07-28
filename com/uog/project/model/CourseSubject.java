package com.uog.project.model;

public class CourseSubject {

    private long COURSESUBJECT_ID;

	private Course COURSE_ID;
	
	private Lookup SUBJECT_ID;
	
    private long SUBJECT_PERCENTAGE;

	private String ISACTIVE;

	private Long MODIFIED_BY;
    
	private String MODIFIED_WHEN;
    
	private String MODIFIED_WORKSTATION;

	public long getCOURSESUBJECT_ID() {
		return COURSESUBJECT_ID;
	}

	public void setCOURSESUBJECT_ID(long cOURSESUBJECT_ID) {
		COURSESUBJECT_ID = cOURSESUBJECT_ID;
	}

	public Course getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(Course cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public Lookup getSUBJECT_ID() {
		return SUBJECT_ID;
	}

	public void setSUBJECT_ID(Lookup sUBJECT_ID) {
		SUBJECT_ID = sUBJECT_ID;
	}

	public long getSUBJECT_PERCENTAGE() {
		return SUBJECT_PERCENTAGE;
	}

	public void setSUBJECT_PERCENTAGE(long sUBJECT_PERCENTAGE) {
		SUBJECT_PERCENTAGE = sUBJECT_PERCENTAGE;
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
		return (long) 9;
	}

}
