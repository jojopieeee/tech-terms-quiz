import java.util.Scanner;
public class techquiz
{
    // 
    public static void main (String [] args)
    {
        techquiz prog = new techquiz();
        prog.runMyprogram();
    }
    
    public void runMyprogram() 
    {
      //
      Scanner reader = new Scanner(System.in);
      String[] Questions = 
      {
      """
      1. What does “AI” stand for in the tech industry?
      A) Automated Integration
      B) Algorithmic Innovation
      C) Advanced Interface
      D) Artificial Intelligence
      
        """,
        """
      2. Which of the following is a programming language?
      A) Python
      B) HTML
      C) Photoshop
      D) Windows   
        """,
       """
      3. What does “cloud computing” primarily allow users to do?
      A) Store data locally only
      B) Run programs without electricity
      C) Access and store data over the internet
      D) Transfer files via Bluetooth
      """,
      """
      4. Which company developed the Android operating system?
      A) Apple
      B) Microsoft
      C) Google 
      D) Samsung
      """,
      """
      5. In cybersecurity, what does “phishing” refer to?
      A) Using fake websites or emails to steal information
      B) Downloading games from the internet
      C) Sending spam messages
      D) Scanning computer viruses
      """,
      """
      6. What is the main purpose of GitHub?
      A) Sharing photos and videos
      B) Selling computer parts
      C) Hosting online meetings
      D) Managing and sharing code projects
      """,
      """
      7. Which of these is an example of cloud storage?
      A) Microsoft Word
      B) Dropbox 
      C) Google Chrome
      D) WhatsApp
      """,
      """
      8. What does “UI/UX” design focus on?
      A) Hardware maintenance
      B) User interface and experience
      C) Software security
      D) Data analysis
      """,
      """
      9. What is the function of a database?
      A) To connect devices wirelessly
      B) To browse the internet
      C) To design websites
      D) To organize, store, and manage information
      """,
      """
      10. Which of these best describes “machine learning”?
      A) A type of AI that learns from data to make predictions
      B) A robot doing human chores
      C) The process of fixing computer hardware
      D) A manual coding method for websites
      """};
      
     String[] correctAnswer = {"D", "A", "C", "C", "A", "D", "B", "B", "D", "A"};
     
     int index = 0;
     int target = 10;
     int score = 0;
     while (index < Questions.length) 
     {
      System.out.println(" ");
      System.out.println(Questions[index]);
       System.out.println("Please enter A, B, C or D.");
      System.out.println("\nEnter your answer");
      String answer = reader.nextLine();
      if (answer.equalsIgnoreCase(correctAnswer[index]))
      {System.out.println("You are correct!");
      score = score + 10;
      }
      else
      {System.out.println("You are Wrong!");
      score = score - 10;   
      }
      index++;
    }
    
    System.out.println("You have answered all the questions");
    System.out.println("\nYour total Score is :" + score);
    System.out.println("\nThank you");
    
    reader.close();
}
     }
    
     
     

    
             
