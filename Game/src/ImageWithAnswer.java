
public class ImageWithAnswer {

	private String answer;
	private String imagePath;
	
	public ImageWithAnswer(String imagePath, String answer){
		System.out.println("it's an image");
		this.setImagePath(imagePath);
		this.setAnswer(answer);
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
	private void setAnswer(String answer) {
		this.answer = answer;
	}
	// ************************************************************************
	//				 get image path if it was image
	// ************************************************************************
	public String getImagePath() {
		return imagePath;
	}
	// ************************************************************************
	//				 set the path of image if it was an image
	// ************************************************************************
	private void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
