import java.io.*;

public class BinnaryInput {
    public static void main(String[] args)throws IOException{
    System.out.println("***** BINARY SEARCH INPUT KEYBOARD *****"+"\n" );
    System.out.println("Data: 12, 22, 24, 34, 54, 65");
    System.out.println("Cari Data: 34"+"\n");
    
      BufferedReader br;
	   br = new BufferedReader(new InputStreamReader(System.in));
	  
        //Pendeklarasian Variabel
        //int data[] = {12, 22, 24, 34, 54, 65};
        int N = 6;
        int batasbawah = N - 1;
        int batasatas = 0;
        boolean ketemu = false;
        int tengah = 0;
        
        int data[]= new int[6];
         System.out.print("Data ke-1:");
         	data[0]=Integer.parseInt(br.readLine());
         System.out.print("Data ke-2:");
         	data[1]=Integer.parseInt(br.readLine());
         System.out.print("Data ke-3:");
         	data[2]=Integer.parseInt(br.readLine());
         System.out.print("Data ke-4:");
         	data[3]=Integer.parseInt(br.readLine());
         System.out.print("Data ke-5:");
         	data[4]=Integer.parseInt(br.readLine());
         System.out.print("Data ke-6:");
         	data[5]=Integer.parseInt(br.readLine());
         	
            

        //Menampilkan Data Array
        System.out.print("isi data adalah ");
         for (int i = 0; i < data.length; i++) 
          {
           System.out.print(data[i] + " ");
          }
        System.out.println("");
        
        // Input data yang dicari   
            System.out.print("Data yang dicari= ");
           	int key = Integer.parseInt(br.readLine());
        
        
        
       //Proses Searching Binnary
       while ((batasatas < batasbawah) && (!ketemu)) 
       	{ //perulangan dua kondisi dimana batasatas < batas bawah dan nilai boolean tidak ketemu
         tengah = (batasatas + batasbawah) / 2; //mencari nilai tengah dengan cara batasatas+batasbawah dibagi 2
            if (data[tengah] == key) 
              { //koondisi nilai tengah sama dengan data yang dicari
                ketemu = true; //maka kondisi ketemu adalah true
              } else 
              	{
                  if (data[tengah] < key) 
                  	{ //sebaliknya jika nilai tengah <dari yng dicari
                    batasatas = tengah++; //maka batas atas = nilai tengah + 1
                    } else 
                      { //kondisi sebaliknya maka nilai atas = nilai tengah - 1
                        batasatas = tengah--;
                      }
               }
        }

        //Cetak hasil pencarian
         if (ketemu) 
          {
            System.out.println("Data " + key + " Telah ditemukan pada index ke " +(tengah + " beris ke " + (tengah + 1)));
          } else 
          	{
              System.out.println("Data " + key + " Tidak ditemukan");
            }
         System.out.println("\n");
         System.out.println(" ***** Terima Kasih ***** ");
         
         
        
    }
}
