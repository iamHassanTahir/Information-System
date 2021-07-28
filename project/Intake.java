package com.uog.project;

public class Intake {

	private long INTAKE_ID;

	private AcademicsYear ACADEMICSYEAR_ID;

	private String INTAKE_DESC;

	private String ISADMISSIONOPEN;

	private String ISACTIVE;

	private Long MODIFIED_BY;
	
	private String MODIFIED_WHEN;
	
	private String MODIFIED_WORKSTATION;

	public long getINTAKE_ID() {
		return INTAKE_ID;
	}

	public void setINTAKE_ID(long iNTAKE_ID) {
		INTAKE_ID = iNTAKE_ID;
	}

	public AcademicsYear getACADEMICSYEAR_ID() {
		return ACADEMICSYEAR_ID;
	}

	public void setACADEMICSYEAR_ID(AcademicsYear aCDYEAR_ID) {
		ACADEMICSYEAR_ID = aCDYEAR_ID;
	}

	public String getINTAKE_DESC() {
		return INTAKE_DESC;
	}

	public void setINTAKE_DESC(String iNTAKE_DESC) {
		INTAKE_DESC = iNTAKE_DESC;
	}

	public String getISADMISSIONOPEN() {
		return ISADMISSIONOPEN;
	}

	public void setISADMISSIONOPEN(String iSADMISSIONOPEN) {
		ISADMISSIONOPEN = iSADMISSIONOPEN;
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
		return (long) 11;
	}

}

