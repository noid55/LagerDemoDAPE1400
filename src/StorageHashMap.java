import java.util.HashMap;

public class StorageHashMap {
    HashMap<String, Integer> meatMap = new HashMap<>();

    public void addMeat(String meatType, int price){
        meatMap.put(meatType, price);
    }

    public void printMeat(){
        for(String i : meatMap.keySet()){
            System.out.println("Type kjøtt: "+ i + "  - Price: " + meatMap.get(i));
        }
    }
}
