class Main {
  public static void main(String[] args) {
    String[] names = {"Jamal", "Hayden", "Anthony", "Ian", "Gabby", "Dimitrius Damarcus Bartholomew James the Third Jr", "Jaquavious", "Marquavious", "Jumar", "Reeda", "Jeffery"};

    for(int i = 0; i < 10; i++){
      System.out.println( names[i]);
    }

    names[1] = "Andrew";

    System.out.println("\n Here is my updated array:\n");
    for(int i = 0; i < 10; i++){
      System.out.println( names[i]);
    }
  }
}