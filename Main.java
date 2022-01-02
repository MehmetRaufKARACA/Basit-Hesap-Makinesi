import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
     /*
        // Değişkenleri tanımla
       int n1,n2,select;

       // Scanner sınıfını tanımla ve girdileri al   
       Scanner inp = new Scanner(System.in);
       System.out.print("İlk sayıyı giriniz : ");
       n1 = inp.nextInt();
       System.out.print("İkinci sayıyı giriniz : ");
       n2 = inp.nextInt();
       
       // Kullanıcan yapılacak işlemi iste 
       System.out.println("1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme");
       System.out.print("Yapılacak işlemi seçiniz : ");
       select = inp.nextInt();

       if(select == 1){
            System.out.println("İşlemin sonucu : "+ (n1 + n2));     
       }else if(select == 2){
            System.out.println("İşlemin sonucu : "+ (n1 - n2));
       }else if(select == 3){
           System.out.println("İşlemin sonucu : "+ (n1 * n2));
       }else if(select == 4){
           if(n2 != 0){
            System.out.println("İşlemin sonucu : "+ (n1 / n2));
           }else{
            System.out.println("Bölen 0 olamaz geçerli bir sayı giriniz");         
           }
       }else{
           System.out.println("Geçerli olmayan bir seçim yaptınız.");
       }
       */
       
       // Değişkenleri tanımla
       int n1,n2,select;

       // Scanner sınıfını tanımla
       Scanner inp = new Scanner(System.in);

       // Kullanıcıdan değerleri al
       System.out.print("İlk sayıyı giriniz : ");
       n1 = inp.nextInt();
       System.out.print("İkinci sayıyı giriniz : ");
       n2 = inp.nextInt();

       // Kullanıcıdan yapılacak işlemi iste
       System.out.print("1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme  : ");
       System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
       select = inp.nextInt();

       switch(select){
           case 1:
                System.out.print("İşlemin sonucu : "+ (n1 + n2));
                break;
           case 2:
                System.out.print("İşlemin sonucu : "+ (n1 - n2));
                break;
           case 3:
                System.out.print("İşlemin sonucu : "+ (n1 * n2));
                break;
           case 4:
                if(n2 != 0){
                    System.out.print("İşlemin sonucu : "+ (n1 / n2));     
                }else{
                    System.out.print("Bölen 0 olamaz.");
                }
                break;
           default:
                System.out.print("Yaptığınız seçim geçersizdir.");



       }



       


        
    }
}