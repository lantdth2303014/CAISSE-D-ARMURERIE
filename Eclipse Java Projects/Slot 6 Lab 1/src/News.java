import java.util.Scanner;

public class News implements INews {
	
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float avgRate;
	private int[] rateList = new int[10];
		
	// get && set for "id": 
	public int getId() {
        return id;
    }
	
	public void setId(int id) {
        this.id = id;
    }
	
	// get && set for "title":
	public String getTitle() {
        return title;
    }
	
	public void setTitle(String title) {
        this.title = title;
    }
	
	// get && set for "publishDate":
	public String getPublishDate() {
        return publishDate;
    }
	
	public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
	
	// get && set for "author":
	public String getAuthor() {
        return author;
    }
	
	public void setAuthor(String author) {
        this.author = author;
    }
	
	// get && set for "content":
	public String getContent() {
        return content;
    }
	
	public void setContent(String content) {
        this.content = content;
    }
	
	// getter for "avgRate":
	public float getAvgRate() {
        return avgRate;
    }
	
	// Implemented Display Method:
	@Override
	public void Display() {
		System.out.println("Title: " + title);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average Rate: " + avgRate);
	}
	
	// Method: Calculate AverageRate based on rateList
    public void Calculate() {
        float sum = 0;
        for (int rate : rateList) {
            sum += rate;
        }
        if (rateList.length > 0) {
            avgRate = sum / rateList.length;
        }
    }
	
 // Method: Input rates and recalculate AverageRate
    public void InputRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ratings (1-5) for the news:");

        for (int i = 0; i < rateList.length; i++) {
            System.out.print("Rating " + (i + 1) + ": ");
            int rate = scanner.nextInt();

            // Validate rating input
            if (rate < 1 || rate > 5) {
                System.out.println("Invalid rating. Please enter a rating between 1 and 5.");
                i--; // Decrement i to re-enter the current rating
            } 
            else {
                rateList[i] = rate;
            }
        }

        // Recalculate AverageRate
        Calculate();
    }
	
}
