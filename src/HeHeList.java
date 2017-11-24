public class HeHeList{
    public int i = 0;
    Object[] objects = new Object[10];
    public void add(Object o){
        if (i == objects.length){
            Object[] newObjects = new Object[objects.length*3];
            objects = newObjects;
        }
        objects[i] = o;
        i ++;
    }public int size(){
        return i;
    }

public  void delete(int b ){   Object[] newObjects = new Object[objects.length-1];
        for (int x=1;x<objects.length;x++){
    if (i<b){ newObjects[i]=objects[i]; }
    else if (i>b){newObjects[i]=objects[i-1];}

}

i--;





}}
