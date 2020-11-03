class Main {
  public static void main(String[] args) {
    String[] names = {"Jamal", "Hayden", "Anthony", "Ian", "Gabby", "Dimitrius Damarcus Bartholomew James the Third Jr", "Jaquavious", "Marquavious", "Jumar", "Reeda", "Jeffary"};

    for(int i = 0; i < 11; i++){
      System.out.println( names[i]);
    }

    names[1] = "Andrew";

    System.out.println("\n Here is the updated reverse array:\n");
    for(int i = 9; i < 11 && i >= 0; i--){
      System.out.println( names[i]);
    }
  }
}