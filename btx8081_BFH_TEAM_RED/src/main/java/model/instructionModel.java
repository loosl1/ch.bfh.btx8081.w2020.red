package main.java.model;




public class instructionModel<InstruktionSql> {
	
	
	
	private String instructionTitle; 
	private String instructionText;
	private int instructionID;
	
	
	public instructionModel(int instructionID, String instructionTitle, String instructionText) {
		this.instructionTitle = instructionTitle;
		this.instructionText = instructionText;
		this.instructionID = instructionID;
		
	}
	
	public int creatInstruction( String title, String txt) {
		instructionID ++; 
		instructionText = txt; 
		instructionTitle = title; 
		return instructionID;
		
			}
	
	public String getInstructionFromDB (int ID, String title) {
		if (instructionID == ID && title.equals(instructionTitle)){
			
		}return getInstructionText();
	}
	
	public String changeInstruction(int ID, String title, String txt) {
		getInstructio(ID, title); 
		creatInstruction(txt, title);
		return instructionText; 
	}
	
	public String deleteInstruction (int ID, String title) {
		openInstruction (ID, title); 
		instructionID = 0; 
		instructionText = null; 
		instructionTitle = null; 
		return "instruction deleted"; 
	}

	public void saveToDB() {
		
	}
	public void 
	public String getInstructionTitle() {
		return instructionTitle;
	}


	public void setInstructionTitle(String instructionTitle) {
		this.instructionTitle = instructionTitle;
	}


	public String getInstructionText() {
		return instructionText;
	}


	public void setInstructionText(String instructionText) {
		this.instructionText = instructionText;
	}


	@Override
	public String toString() {
		return "instructionModel [instructionTitle=" + instructionTitle + ", instructionText=" + instructionText + "]";
	} 
	
	
	
	
}