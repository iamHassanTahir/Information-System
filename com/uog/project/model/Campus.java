package com.uog.project.model;

public class Campus {

	private long CAMPUS_ID;

	private University UNIVERSITY_ID;

	private String CAMPUS_CODE;

	private String CAMPUS_NAME;

	private String CAMPUS_DESCRIPTION;

	private String ADDRESS_LINE1;

	private String ADDRESS_LINE2;

	private String ADDRESS_LINE3;

	private String ADDRESS_LINE4;

	private String ADDRESS_LINE5;

	private String ADDRESS_POSTCODE;

	private Lookup ADDRESSCOUNTRY_ID;

	private String TELEPHONE;

	private String FAXNO;

	private String EMAIL;

	private String ISACTIVE;

	private Long MODIFIED_BY;

	private String MODIFIED_WHEN;

	private String MODIFIED_WORKSTATION;

	public long getCAMPUS_ID() {
		return CAMPUS_ID;
	}

	public void setCAMPUS_ID(long cAMPUS_ID) {
		CAMPUS_ID = cAMPUS_ID;
	}

	public University getUNIVERSITY_ID() {
		return UNIVERSITY_ID;
	}

	public void setUNIVERSITY_ID(University uNIVERSITY_ID) {
		UNIVERSITY_ID = uNIVERSITY_ID;
	}

	public String getCAMPUS_CODE() {
		return CAMPUS_CODE;
	}

	public void setCAMPUS_CODE(String cAMPUS_CODE) {
		CAMPUS_CODE = cAMPUS_CODE;
	}

	public String getCAMPUS_NAME() {
		return CAMPUS_NAME;
	}

	public void setCAMPUS_NAME(String cAMPUS_NAME) {
		CAMPUS_NAME = cAMPUS_NAME;
	}

	public String getCAMPUS_DESCRIPTION() {
		return CAMPUS_DESCRIPTION;
	}

	public void setCAMPUS_DESCRIPTION(String cAMPUS_DESCRIPTION) {
		CAMPUS_DESCRIPTION = cAMPUS_DESCRIPTION;
	}

	public String getADDRESS_LINE1() {
		return ADDRESS_LINE1;
	}

	public void setADDRESS_LINE1(String aDDRESS_LINE1) {
		ADDRESS_LINE1 = aDDRESS_LINE1;
	}

	public String getADDRESS_LINE2() {
		return ADDRESS_LINE2;
	}

	public void setADDRESS_LINE2(String aDDRESS_LINE2) {
		ADDRESS_LINE2 = aDDRESS_LINE2;
	}

	public String getADDRESS_LINE3() {
		return ADDRESS_LINE3;
	}

	public void setADDRESS_LINE3(String aDDRESS_LINE3) {
		ADDRESS_LINE3 = aDDRESS_LINE3;
	}

	public String getADDRESS_LINE4() {
		return ADDRESS_LINE4;
	}

	public void setADDRESS_LINE4(String aDDRESS_LINE4) {
		ADDRESS_LINE4 = aDDRESS_LINE4;
	}

	public String getADDRESS_LINE5() {
		return ADDRESS_LINE5;
	}

	public void setADDRESS_LINE5(String aDDRESS_LINE5) {
		ADDRESS_LINE5 = aDDRESS_LINE5;
	}

	public String getADDRESS_POSTCODE() {
		return ADDRESS_POSTCODE;
	}

	public void setADDRESS_POSTCODE(String aDDRESS_POSTCODE) {
		ADDRESS_POSTCODE = aDDRESS_POSTCODE;
	}

	public Lookup getADDRESSCOUNTRY_ID() {
		return ADDRESSCOUNTRY_ID;
	}

	public void setADDRESSCOUNTRY_ID(Lookup aDDRESSCOUNTRY_ID) {
		ADDRESSCOUNTRY_ID = aDDRESSCOUNTRY_ID;
	}

	public String getTELEPHONE() {
		return TELEPHONE;
	}

	public void setTELEPHONE(String tELEPHONE) {
		TELEPHONE = tELEPHONE;
	}

	public String getFAXNO() {
		return FAXNO;
	}

	public void setFAXNO(String fAXNO) {
		FAXNO = fAXNO;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
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
		return (long) 4;
	}

}