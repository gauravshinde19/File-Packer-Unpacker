import java.util.*;
import java.io.*;

class Packer
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("------- Marvellous Packer Unpacker CUI Module -------");
        System.out.println("-----------------------------------------------------");

        System.out.println("----------------- Packing Activity ------------------");
        System.out.println();

        System.out.println("Enter the name of Directory that you want to open for packing : ");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        System.out.println("Enter the name of packed file that you want to create : ");
        String PackedFile = sobj.nextLine();

        File Packobj = new File(PackedFile);
        
        boolean bret = Packobj.createNewFile();
        if(bret == false)
        {
            System.out.println("Unable to create packed file");
            return;
        }

        FileOutputStream foobj = new FileOutputStream(Packobj);

        if(fobj.exists())
        {
            int i = 0, j = 0;
            int iCount = 0;

            File Arr[] = fobj.listFiles();

            
            String Header = null;
            int iRet = 0;
            byte Buffer[] = new byte[1024];
            FileInputStream fiobj = null;
            
            for(i = 0; i < Arr.length; i++)
            {
                Header = Arr[i].getName();
                
                if(Header.endsWith(".txt"))
                {
                    System.out.println("File packed with name : "+Header);
                    
                    Header = Header + " " + Arr[i].length();

                    for(j = Header.length(); j < 100; j++)
                    {
                        Header = Header + " ";
                    }

                    foobj.write(Header.getBytes(),0,100);

                    fiobj = new FileInputStream(Arr[i]);

                    while((iRet = fiobj.read(Buffer))!= -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }

                    fiobj.close();
                    iCount++;
                }
            }

            System.out.println("-----------------------------------------------------");
            System.out.println("Packing activity completed..");
            System.out.println("Number of files scan : "+Arr.length);
            System.out.println("Number of files packed : "+iCount);
            System.out.println("-----------------------------------------------------");

            System.out.println("Thank you for using Marvellous Packer Unpacker tool");
            foobj.close();
        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}