public class Static {
    public static int sharedCount = 0;
    public static void incrementShared() {
        sharedCount++;
    }
    public int instanceValue = 0;
    public void incrementInstance() {
        instanceValue++;
    }
    public static void main(String[] args) {
        Static a = new Static();
        Static b = new Static();
        a.incrementInstance();
        b.incrementInstance();
        Static.incrementShared();
        Static.incrementShared();
        System.out.println("a.instanceValue = " + a.instanceValue);
        System.out.println("b.instanceValue = " + b.instanceValue);
        System.out.println("Static.sharedCount = " + Static.sharedCount);
    }
}
