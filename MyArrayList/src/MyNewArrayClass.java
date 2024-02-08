public class MyNewArrayClass {
    public Object[]array;
    private int size;
    private int capacity;
     public MyNewArrayClass(){
         capacity=10;
         size=0;
         array=new Object[capacity];
     }
     private void grow(){
         capacity =(int)(capacity*1.5+1);
         Object []arrayClone= new Object[capacity];
        for(int i=0;i<array.length;i++){
            arrayClone[i]=array[i];
        }
        array = arrayClone;


     }
     public void add(Object obj){
         if(size==capacity){
             grow();
         }
         array[size]=obj;
         size++;
     }

}
