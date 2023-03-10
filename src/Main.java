public class Main {
    public static void main(String[] args) {


        Pet p1 = new Pet("dog","baron","av","chernyi",3);
        Pet p2 = new Pet("koshka","mila","svinks","belaya",5);
        Pet p3 = new Pet("popugai","petya","ptiza","siniyi",2);
        Pet p6 = new Pet("fofo","kesha","ptiza","belaya",1);
        Pet p4 = new Pet("kuriza","kuka","ptizi","chernyi",3);
        Pet p5= new Pet("chinok","tima","tila","chernyi",3);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p6.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        String[]name={p1.getName(), p2.getName(), p3.getName(),p6.getName(),p4.getName(),p5.getName()};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
//
//        Kurs gh = new Kurs();
//        gh.setName("Mirlan");
//        gh.setImyaughetelya("Nurjan");
//        gh.setNaghalokursa(17);
//        gh.setOkonchaniekursa(19);
//        System.out.println(gh.getName());
//        System.out.println(gh.getimyaughetelya());
//        System.out.println(gh.getNaghalokursa());
//        System.out.println(gh.getOkonchaniekursa());
//
//      Student li =new Student();
//       li.setname("Andrei");
//       li.setfamilia("ivanov");
//       li.setdataRojdenie(1971);
//       li.setdenRojdenie(12);
//        System.out.println(li.getname());
//        System.out.println(li.getfamilia());
//        System.out.println(li.getdataRojdenie());
//        System.out.println(li.getdenRojdenie());


    }

}