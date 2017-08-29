
public class QuestionWithAnswer {

	private String question;
	private String answer;
	
	public QuestionWithAnswer(String question, String answer){
		System.out.println("it's a question");
		this.setQuestion(question);
		this.setAnswer(answer);
	}
	
	// ************************************************************************
	//				 get the question read from file
	// ************************************************************************
	public String getQuestion() {
		return question;
	}
	
	// ************************************************************************
	//				 set the question read from file
	// ************************************************************************
	public void setQuestion(String question) {
		this.question = question;
	}
	
	// ************************************************************************
	//				 get the answer read from file
	// ************************************************************************
	public String getAnswer() {
		return answer;
	}
	// ************************************************************************
	//				 set the answer for question from file
	// ************************************************************************
	public void setAnswer(String answer) {
		this.answer = answer;
	}
		
	
}

