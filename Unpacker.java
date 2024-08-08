// Unpacking Activity

import java.util.*;
import java.io.*;

class Unpacker
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        
        byte Header[] = new byte[100];
        int iRet = 0;
        String HeaderX = null;
        File obj = null;
        int FileSize = 0;
        FileOutputStream foobj = null;
        int iCount = 0;
        
        System.out.println("-----------------------------------------------------");
        System.out.println("------- Marvellous Packer Unpacker CUI Module -------");
        System.out.println("-----------------------------------------------------");

        System.out.println("---------------- Unpacking Activity -----------------");
        System.out.println();

        System.out.println("Enter the name of Packed that you want to open : ");
        String PackedFile = sobj.nextLine();

        File fobj = new File(PackedFile);

        if(!fobj.exists())
        {
            System.out.println("Unable to proceed as Packed file is missing...");
            return;
        }  

        FileInputStream fiobj = new FileInputStream(fobj);

        while((iRet = fiobj.read(Header,0,100)) > 0)
        {
            HeaderX = new String(Header);
            HeaderX = HeaderX.trim();

            String Tokens[] = HeaderX.split(" ");

            obj = new File(Tokens[0]);
            System.out.println("File drop with name : "+Tokens[0]);

            obj.createNewFile();

            FileSize = Integer.parseInt(Tokens[1]);
            byte Buffer[] = new byte[FileSize];

            fiobj.read(Buffer,0,FileSize);

            foobj = new FileOutputStream(obj);
            foobj.write(Buffer,0,FileSize);

            foobj.close();
            iCount++;
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Unpacking activity completed..");
        System.out.println("Number of files unpacked : "+iCount);
        System.out.println("-----------------------------------------------------");

        System.out.println("Thank you for using Marvellous Packer Unpacker tool");
        
        fiobj.close();
    }
}