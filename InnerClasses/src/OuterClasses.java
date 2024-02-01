public class OuterClasses {

    public static void main(String[] args){
        Hastane hastane = new Hastane()
        {
            void record()
            {
                System.out.println("This method is defined in anonymous class");
            }
        };
       // hastane.record();
        Integer i=20;
        String a="12";
        Integer ax=Integer.parseInt(a);
        System.out.println(ax+i);
    }
}