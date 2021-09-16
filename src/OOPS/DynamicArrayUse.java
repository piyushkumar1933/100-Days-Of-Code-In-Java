package OOPS;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(1);
//       da.add(0,2);
//        da.add(5,3);
//        System.out.println(da.getSize());
//        System.out.println(da.get(0));
//        System.out.println(da.get(2));
//        da.add(3,6);
//        da.add(4,9);
//        System.out.println(da.remove(0));
//        da.add(0,19);
//        System.out.println(da.remove(0));
        for(int i = 0;i<50;i++){
            da.add(i,i*2);
        }
        while (!da.isEmpty()){
            System.out.println(da.removeLast());
        }
    }
}
