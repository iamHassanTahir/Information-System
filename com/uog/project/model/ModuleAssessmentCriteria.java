package com.uog.project.model;

public class ModuleAssessmentCriteria {

	private long ASSESSMENTCRITERIA_ID;
	
	private Module MODULE_ID;
	
	private ModuleLearningOutcome LEARNINGOUTCOME_ID;
	
	    private long ASSESSMENTCRITERIA_NO;
	 
	    private String ASSESSMENTCRITERIA_CODE;
	 
	    private String ASSESSMENTCRITERIA_DESC;

		private String ISACTIVE;

	private Long MODIFIED_BY;
	
	private String MODIFIED_WHEN;
	
	private String MODIFIED_WORKSTATION;

		public long getASSESSMENTCRITERIA_ID() {
			return ASSESSMENTCRITERIA_ID;
		}

		public void setASSESSMENTCRITERIA_ID(long aSSESSMENTCRITERIA_ID) {
			ASSESSMENTCRITERIA_ID = aSSESSMENTCRITERIA_ID;
		}

		public Module getMODULE_ID() {
			return MODULE_ID;
		}

		public void setMODULE_ID(Module mODULE_ID) {
			MODULE_ID = mODULE_ID;
		}

		public ModuleLearningOutcome getLEARNINGOUTCOME_ID() {
			return LEARNINGOUTCOME_ID;
		}

		public void setLEARNINGOUTCOME_ID(ModuleLearningOutcome lEARNINGOUTCOME_ID) {
			LEARNINGOUTCOME_ID = lEARNINGOUTCOME_ID;
		}

		public long getASSESSMENTCRITERIA_NO() {
			return ASSESSMENTCRITERIA_NO;
		}

		public void setASSESSMENTCRITERIA_NO(long aSSESSMENTCRITERIA_NO) {
			ASSESSMENTCRITERIA_NO = aSSESSMENTCRITERIA_NO;
		}

		public String getASSESSMENTCRITERIA_CODE() {
			return ASSESSMENTCRITERIA_CODE;
		}

		public void setASSESSMENTCRITERIA_CODE(String aSSESSMENTCRITERIA_CODE) {
			ASSESSMENTCRITERIA_CODE = aSSESSMENTCRITERIA_CODE;
		}

		public String getASSESSMENTCRITERIA_DESC() {
			return ASSESSMENTCRITERIA_DESC;
		}

		public void setASSESSMENTCRITERIA_DESC(String aSSESSMENTCRITERIA_DESC) {
			ASSESSMENTCRITERIA_DESC = aSSESSMENTCRITERIA_DESC;
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
			return (long) 14;
		}
	
	
	
	
}
