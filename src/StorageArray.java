public class StorageArray {
    private String[] fruitArray = new String[3];
    private int count = 0;



    public void addFruit (String fruit){
        fruitArray[count++] = fruit;
    }

    public void printFruit(){
        for (int i = 0; i < fruitArray.length; i++) {
            System.out.println(fruitArray[i]);
        }
    }
}
