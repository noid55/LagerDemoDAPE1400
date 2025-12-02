import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //Enkelt, men begrenset
        System.out.println("Array: ");
        String[] arrayStorage = {"Pære", "Appelsin", "Eple", "Banan"};

//        arrayStorage[0] = "Banan";
//        arrayStorage[1] = "Eple";
//        arrayStorage[2] = "Pære";
//        arrayStorage[3] = "Appelsin";
        for (int i = 0; i < arrayStorage.length; i++) {
            System.out.println(arrayStorage[i]);
        }

        //Dynamisk liste
        System.out.println("ArrayList: ");
        ArrayList<String> listStorage = new ArrayList<>();
        listStorage.add("Lettmelk");
        listStorage.add("Helmelk");
        listStorage.add("Gulost");

        for (int i = 0; i < 5; i++) {
            listStorage.add("Item number "+ i);
        }
        for (int i = 0; i < listStorage.size(); i++) {
            System.out.println(listStorage.get(i));
        }

        //Key - value pair
        //Bruk punktum bak mapStorage for å se hvilke metoder dere kan bruke hvis dere ikke husker/er usikre.
        //mapStorage. også vil intelliJ gi dere forslag, kan hjelpe hvis dere ikke husker en spesifikk metode
        System.out.println("HashMap: ");
        HashMap<String, Integer> mapStorage = new HashMap<>();
        mapStorage.put("Kjøttdeig", 99);
        mapStorage.put("Biff", 300);
        mapStorage.put("Kyllingfillet", 150);
        mapStorage.put("Kyllingfillet", 180);

        //HashMap lagrer ikke på indekser, dermed kan vi ikke bruke en vanlig for loop for å hente ut verdiene.
        //Her kunne man også bare gjort en System.out.println(mapStorage); og fått ut alt som inneholder.
        for(String i : mapStorage.keySet()){
            System.out.println("Key name " + i + " and the value(price in this case) that belongs to it "+ mapStorage.get(i));
        }

        int[] intArray = new int[5];
        ArrayList<Integer> intList = new ArrayList<>();
        HashMap<Integer, Integer> intMap = new HashMap<>();

        //java gjør magi i bakgrunnen slik at selv om vi legger inn ints, så blir de gjort om til Objekter
        //Høyreklikk på add biten, Go-to -> Declaration or usages for å se hvordan denne metoden fungerer,
        intList.add(11);


        //Implementasjon av klasser i lagersystemet
        System.out.println();
        System.out.println("ArrayList lager tjeneste: ");
        StorageList coop = new StorageList();
        coop.addDairy("Helmelk");
        coop.addDairy("Lettmelk");
        coop.addDairy("Ost");
        coop.printDairy();

        System.out.println();
        System.out.println("Array lager implementasjon");
        StorageArray kiwi = new StorageArray();
        kiwi.addFruit("Banan");
        kiwi.addFruit("Eple");
        kiwi.addFruit("Appelsin");
        kiwi.printFruit();

        System.out.println();
        System.out.println("HashMap lager implementasjon");
        StorageHashMap meny = new StorageHashMap();
        meny.addMeat("Kjøttdeig", 99);
        meny.addMeat("Kyllingfillet", 150);
        meny.addMeat("Biff", 300);
        meny.addMeat("Biff", 350);
        meny.printMeat();

    }
}
