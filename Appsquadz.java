class Appsquadz {

}

public class Demo

{
    public static void main(String... s) {
        Appsquadz ap =new Appsquadz;  //default reference or strong reference
        System.out.println(ap);
        ap = null;  // now object ap pointing to null and is avallable for garbage collection
        System.out.println(ap);
    }
}

