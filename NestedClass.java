public class NestedClass {
    private int b=20;
    
    public class Inner
    {
        void output()
        {
            System.out.println("\nWe're in the inner class right now.\nOutput is "+b+"\n\n");
        }
    }

    public static void main(String args[])
    {
        NestedClass nclass=new NestedClass();
        System.out.println("\nDemonstrating use of Nested Classes...\n.\n. ");
        NestedClass.Inner Iclass=nclass.new Inner();
        Iclass.output();
    }
}
