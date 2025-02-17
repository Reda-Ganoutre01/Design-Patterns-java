
package Singleton;

class Drive {

    public static void main(String[] args){

        LazySingleton inst1=LazySingleton.getInstance();
        LazySingleton inst2=LazySingleton.getInstance();
        
        System.out.println(inst1.hashCode());
        inst1.printData();
        
        System.out.println(inst2.hashCode());
        inst2.printData();
    }
    
}