package com.uog.project.model;

public class Course {

    private long COURSE_ID;

    private String COURSE_CODE;

    private String COURSE_TITLE;

    private String COURSE_SHORTTITLE;

	private String COURSE_INTRODUCTION;
	
    private Long COURSE_LEVEL;

    private Double MINIMUM_DURATION;

    private Double MAXIMUM_DURATION;
    
    private Double MINIMUM_CREDITHOURS;

    private Double MAXIMUM_CREDITHOURS;
    
	private String PATHWAY;
	
	private String SLC_COURSECODE;
	
	private String LARA_CODE;
	
	private Lookup QUALIFICATIONTYPE_ID;
	
	private Lookup PROVISIONTYPE_ID;
	
	private Lookup REGULATORYBODY_ID;
	
	private Lookup TEACHERTRAININGCOURSE_ID;
	
    private long MANDATORY_MODULES;

    private long OPTIONAL_MODULES;

    private long STUDYSKILL_MODULES;

	private String ISACTIVE;

	private Long MODIFIED_BY;
    
	private String MODIFIED_WHEN;
    
	private String MODIFIED_WORKSTATION;

	public long getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(long cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public String getCOURSE_CODE() {
		return COURSE_CODE;
	}

	public void setCOURSE_CODE(String cOURSE_CODE) {
		COURSE_CODE = cOURSE_CODE;
	}

	public String getCOURSE_TITLE() {
		return COURSE_TITLE;
	}

	public void setCOURSE_TITLE(String cOURSE_TITLE) {
		COURSE_TITLE = cOURSE_TITLE;
	}

	public String getCOURSE_SHORTTITLE() {
		return COURSE_SHORTTITLE;
	}

	public void setCOURSE_SHORTTITLE(String cOURSE_SHORTTITLE) {
		COURSE_SHORTTITLE = cOURSE_SHORTTITLE;
	}

	public String getCOURSE_INTRODUCTION() {
		return COURSE_INTRODUCTION;
	}

	public void setCOURSE_INTRODUCTION(String cOURSE_INTRODUCTION) {
		COURSE_INTRODUCTION = cOURSE_INTRODUCTION;
	}

	public Long getCOURSE_LEVEL() {
		return COURSE_LEVEL;
	}

	public void setCOURSE_LEVEL(Long cOURSE_LEVEL) {
		COURSE_LEVEL = cOURSE_LEVEL;
	}

	public Double getMINIMUM_DURATION() {
		return MINIMUM_DURATION;
	}

	public void setMINIMUM_DURATION(Double mINIMUM_DURATION) {
		MINIMUM_DURATION = mINIMUM_DURATION;
	}

	public Double getMAXIMUM_DURATION() {
		return MAXIMUM_DURATION;
	}

	public void setMAXIMUM_DURATION(Double mAXIMUM_DURATION) {
		MAXIMUM_DURATION = mAXIMUM_DURATION;
	}

	public Double getMINIMUM_CREDITHOURS() {
		return MINIMUM_CREDITHOURS;
	}

	public void setMINIMUM_CREDITHOURS(Double mINIMUM_CREDITHOURS) {
		MINIMUM_CREDITHOURS = mINIMUM_CREDITHOURS;
	}

	public Double getMAXIMUM_CREDITHOURS() {
		return MAXIMUM_CREDITHOURS;
	}

	public void setMAXIMUM_CREDITHOURS(Double mAXIMUM_CREDITHOURS) {
		MAXIMUM_CREDITHOURS = mAXIMUM_CREDITHOURS;
	}

	public String getPATHWAY() {
		return PATHWAY;
	}

	public void setPATHWAY(String pATHWAY) {
		PATHWAY = pATHWAY;
	}

	public String getSLC_COURSECODE() {
		return SLC_COURSECODE;
	}

	public void setSLC_COURSECODE(String sLC_COURSECODE) {
		SLC_COURSECODE = sLC_COURSECODE;
	}

	public String getLARA_CODE() {
		return LARA_CODE;
	}

	public void setLARA_CODE(String lARA_CODE) {
		LARA_CODE = lARA_CODE;
	}

	public Lookup getQUALIFICATIONTYPE_ID() {
		return QUALIFICATIONTYPE_ID;
	}

	public void setQUALIFICATIONTYPE_ID(Lookup qUALIFICATIONTYPE_ID) {
		QUALIFICATIONTYPE_ID = qUALIFICATIONTYPE_ID;
	}

	public Lookup getPROVISIONTYPE_ID() {
		return PROVISIONTYPE_ID;
	}

	public void setPROVISIONTYPE_ID(Lookup pROVISIONTYPE_ID) {
		PROVISIONTYPE_ID = pROVISIONTYPE_ID;
	}

	public Lookup getREGULATORYBODY_ID() {
		return REGULATORYBODY_ID;
	}

	public void setREGULATORYBODY_ID(Lookup rEGULATORYBODY_ID) {
		REGULATORYBODY_ID = rEGULATORYBODY_ID;
	}

	public Lookup getTEACHERTRAININGCOURSE_ID() {
		return TEACHERTRAININGCOURSE_ID;
	}

	public void setTEACHERTRAININGCOURSE_ID(Lookup tEACHERTRAININGCOURSE_ID) {
		TEACHERTRAININGCOURSE_ID = tEACHERTRAININGCOURSE_ID;
	}

	public long getMANDATORY_MODULES() {
		return MANDATORY_MODULES;
	}

	public void setMANDATORY_MODULES(long mANDATORY_MODULES) {
		MANDATORY_MODULES = mANDATORY_MODULES;
	}

	public long getOPTIONAL_MODULES() {
		return OPTIONAL_MODULES;
	}

	public void setOPTIONAL_MODULES(long oPTIONAL_MODULES) {
		OPTIONAL_MODULES = oPTIONAL_MODULES;
	}

	public long getSTUDYSKILL_MODULES() {
		return STUDYSKILL_MODULES;
	}

	public void setSTUDYSKILL_MODULES(long sTUDYSKILL_MODULES) {
		STUDYSKILL_MODULES = sTUDYSKILL_MODULES;
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
		return (long) 6;
	}

}
