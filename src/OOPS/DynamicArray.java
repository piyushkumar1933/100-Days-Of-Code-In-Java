package OOPS;

public class DynamicArray {
    private int [] arr;
    private int currentIndex;
    public DynamicArray(){
        arr = new int [5];
        currentIndex = 0;
    }
    public boolean isEmpty(){
        return currentIndex == 0;
    }
    public int getSize(){
        return currentIndex;
    }
    public void doubleCapacity(){
        int [] temp = arr;
        arr = new int[2*temp.length];
        for(int i = 0; i< temp.length;i++){
            arr[i] = temp[i];
        }
    }
    public void add(int element){
        if(currentIndex>=arr.length){
            doubleCapacity();
        }
        arr[currentIndex++] = element;
    }
    public void add(int index,int element){
        if(index<0)
            return;
        if(index>currentIndex){
            System.out.println("Coud Not add the adding at te last ");
            if(currentIndex>=arr.length)
                doubleCapacity();
            arr[currentIndex++] = element;
            return;
        }

        if(currentIndex>=arr.length)
            doubleCapacity();
        for(int i = currentIndex;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        currentIndex++;
    }
    public void set(int index,int element){
        if(index<0){
            System.out.println("Incorrect Index");
            return;
        }
        if(index>=currentIndex){
            add(index,element);
            return;
        }
        arr[index] = element;
    }
    public int get(int index){
        if(index<0 || index>=currentIndex)
            return -1;
        return arr[index];

    }
    public int remove(int index){
        if(this.isEmpty()||index>=currentIndex)
            return -1;
        int element = arr[index];
        for(int i = index;i<currentIndex-1;i++){
            arr[i] = arr[i+1];
        }
        currentIndex--;
        return element;
    }
    public int removeLast(){
        if(this.isEmpty()){
            return -1;
        }
        currentIndex--;
        return arr[currentIndex];


    }
}
