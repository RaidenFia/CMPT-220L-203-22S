package base;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class plant{

    boolean needsWatering;
    String plantFamily;
    String plantName;
    int[] array;
    ArrayList<String> favoritePlantArray = new ArrayList<String>();
    LinkedList<String> wateringInstruction = new LinkedList<>();
    Queue<String> instructionQueue = new LinkedList<String>();
    Stack<String> soilStack = new Stack<String>();
    public PlantFile(boolean needsWatering, String plantFamily, String plantName){

        this.needsWatering = needsWatering;
        this.plantFamily = plantFamily;
        this.plantName = plantName;



    }
    public void addLinkedInstruction(String instruction) {
        wateringInstruction.add(instruction);

        
    }
    public void addArray(int numbers){
        array = new int[3];
        int array = numbers;
    }
    public void addArrayList(String favoritePlant){
        favoritePlantArray.add(favoritePlant);
    }
    public void addQueue(String instruction){
        instructionQueue.add(instruction);
    }
    public void addStack(String instruction){
        soilStack.add(instruction);
    }
    }