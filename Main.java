import java.util.Scanner;

/**
 * Determines what an animal is using a dichotomous key
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // input scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user if the animal has feathers
    System.out.println("Does the animal have feathers?");
    String featherAnswer = input.nextLine();
    
    //if the user answers yes to feathers
    if(featherAnswer.equals ("yes")){
      //ask if the animal swims'
      System.out.println("Does the animal swim?");
      String swimAnswer = input.nextLine();

      //if the user answered yes to the animal swimming
      if(swimAnswer.equals ("yes")){
        System.out.println("This is a duck");
      }else{
        //if the user answered no to the animal swimming
        System.out.println("This is a hen");
      }

    //if the user answered no to feathers
    }else{
      //ask the user if the animal has legs
      System.out.println("Does the animal have legs?");
      String legAnswer = input.nextLine();

      //if the user answered yes to legs
      if(legAnswer.equals ("yes")){
        System.out.println("This is a lizard");
      }else{
        //if the user answered no to legs
        System.out.println("This is a snake");
      }
    }
  }
}
