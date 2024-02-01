
    abstract class Hastane{
        abstract void record();
        String hastane_ismi;
        int x=5;
         class Poliklinik{
         int x=20;
        String poliklinik_ismi;


        void xDon(int x){
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Hastane.this.x);
        }
        }
    }
