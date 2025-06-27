import java.util.Scanner;
import java.io.*;
public class AppNote {
  public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      
      while(true){
          System.out.println("\n====Enter User Choice====");
          System.out.println("1. Write  in file :");
          System.out.println("2. Read from file :");
          System.out.println("3. Exit :");
          System.out.println("Enter user choice :");
          int choice=sc.nextInt();
          sc.nextLine();
          
          switch(choice){
              case 1:
                  try{
                  FileOutputStream fout=new FileOutputStream(".\\Task4.txt",true);
                  System.out.println("Enter note ..");
                  String note=sc.nextLine();
                  for(int i=0; i<note.length(); i++)
                  {
                      fout.write(note.charAt(i));
                  }
                  fout.close();
                  System.out.println("Data Saved SuccessFully");
                  }catch(IOException e){
                      System.out.println(e.getMessage());
                  }
                  break;
                  
              case 2:
                  try{
                  String Temp;
                  FileReader file=new FileReader (".\\Task4.txt");
                  BufferedReader reader=new BufferedReader(file);
                  while((Temp=reader.readLine())!=null)
                  {
                      System.out.println(Temp);
                  }
                  file.close();
                  }catch(IOException e){
                      System.out.println(e.getMessage());
                  }
                  break;
                 
              case 3:
                  System.exit(0);
              
              default :
                  System.out.println("Invalid User choice..");                  
          }   
      }
  }  
   
}
