public class GwangjuBusDTO {
	
	
	
	private String DIR_DOWN_NAME,LAST_RUN_TIME,FIRST_RUN_TIME,DIR_UP_NAME,LINE_NAME;
	private int RUN_INTERVAL,LINE_NUM,LINE_ID,LINE_KIND;
	
	public GwangjuBusDTO() {}
	
	public GwangjuBusDTO(String dIR_DOWN_NAME, int rUN_INTERVAL,String lAST_RUN_TIME, String lINE_NAME, 
			String fIRST_RUN_TIME, int lINE_NUM, int lINE_ID, int lINE_KIND, String dIR_UP_NAME) {
		super();
		DIR_DOWN_NAME = dIR_DOWN_NAME;
		RUN_INTERVAL = rUN_INTERVAL;
		LINE_NAME = lINE_NAME;
		LAST_RUN_TIME = lAST_RUN_TIME;
		FIRST_RUN_TIME = fIRST_RUN_TIME;
		DIR_UP_NAME = dIR_UP_NAME;
		LINE_NUM = lINE_NUM;
		LINE_ID = lINE_ID;
		LINE_KIND = lINE_KIND;
	}
	public String getDIR_DOWN_NAME() {
		return DIR_DOWN_NAME;
	}
	public void setDIR_DOWN_NAME(String dIR_DOWN_NAME) {
		DIR_DOWN_NAME = dIR_DOWN_NAME;
	}
	public String getLAST_RUN_TIME() {
		return LAST_RUN_TIME;
	}
	public void setLAST_RUN_TIME(String lAST_RUN_TIME) {
		LAST_RUN_TIME = lAST_RUN_TIME;
	}
	public String getFIRST_RUN_TIME() {
		return FIRST_RUN_TIME;
	}
	public void setFIRST_RUN_TIME(String fIRST_RUN_TIME) {
		FIRST_RUN_TIME = fIRST_RUN_TIME;
	}
	public String getDIR_UP_NAME() {
		return DIR_UP_NAME;
	}
	public void setDIR_UP_NAME(String dIR_UP_NAME) {
		DIR_UP_NAME = dIR_UP_NAME;
	}
	public String getLINE_NAME() {
		return LINE_NAME;
	}
	public void setLINE_NAME(String lINE_NAME) {
		LINE_NAME = lINE_NAME;
	}
	public int getRUN_INTERVAL() {
		return RUN_INTERVAL;
	}
	public void setRUN_INTERVAL(int rUN_INTERVAL) {
		RUN_INTERVAL = rUN_INTERVAL;
	}
	public int getLINE_NUM() {
		return LINE_NUM;
	}
	public void setLINE_NUM(int lINE_NUM) {
		LINE_NUM = lINE_NUM;
	}
	public int getLINE_ID() {
		return LINE_ID;
	}
	public void setLINE_ID(int lINE_ID) {
		LINE_ID = lINE_ID;
	}
	public int getLINE_KIND() {
		return LINE_KIND;
	}
	public void setLINE_KIND(int lINE_KIND) {
		LINE_KIND = lINE_KIND;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
