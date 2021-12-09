/*
 *  Nama : Mizwar Zulfachri
 *  NIM : 1908107010087
 *  UAS : 4 Desember 2021
 * 
 *  Topik Kasus : Menebak
 */
import java.util.Random;

class main {

    public static void main(String[] args) {
        int i = 0;  
        Answers ans = new Answers();
        Random rand = new Random();

        //Pembuka
        System.out.println("\nSelamat datang di permainan tebak kucing atau bukan!");

        //Permainan dimulai
        do { 
            //Bilangan acak akan menentukan apakah kucing atau kucing liar
            int num = rand.nextInt(3) + 1;
            //System.out.println(num);

            switch (num) {
                case 1:
                    //kucing
                    Size domesticSize = new domesticSize();
                    catBehavior dCat = new Domestic(domesticSize);

                    System.out.println("    ~~~ Kucing "+ (i+1) +" ~~~");
                    //perilaku kucing akan dipanggil
                    dCat.catSize();
                    dCat.food();
                    dCat.cry();
                                        
                    ans.dAnswers(i);
                    break;

                case 2:
                    //kucing liar
                    Size wild = new wildcatSize();
                    wildBehavior wCat = new WildCat(wild);

                    System.out.println("    ~~~ Kucing "+ (i+1) +" ~~~");

                    wCat.catSize();
                    wCat.food();
                    wCat.cry();

                    ans.wAnswers(i);
                    break;

                case 3:
                    //kucing liar yang mengadaptasi perilaku domestik
                    Size domestik1 = new domesticSize();
                    WildCat wCat1 = new WildCat(domestik1);
                    AdapterBehavior tinyWildCat = new AdapterBehavior(wCat1);

                    System.out.println("    ~~~ Kucing "+ (i+1) +" ~~~");

                    wCat1.catSize();
                    tinyWildCat.food();
                    tinyWildCat.cry();

                    ans.wAnswers(i);
                    break;
                
                default:
                    System.out.println("Eeh kok kucingnya hilang?\n");
            }

            ans.Score();
            i++;
        } while (i < 5);
        
    }

}