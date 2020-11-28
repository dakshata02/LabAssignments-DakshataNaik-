package com.cg.training.lab10.exe2;
import java.io.File;

public class FileDetails {

	public static void p(String str)
    {
           System.out.println(str);
    }
    public static void analyze(String s)
    {
           File file=new File(s);
           if(file.exists())
           {
           p(file.getName()+" is a file");
           p(file.canRead()?" is readable":" is not readable");
           p(file.canWrite()?" is writable":" is not writable");
           p("Filesize:"+file.length()+" bytes");
           p("File last mdified:"+file.lastModified());
           }
           if(file.isDirectory())
           {
           p(file.getName()+" is directory");
            p("List of files");
            String dir[]=file.list();
           for(int i=0;i<dir.length;i++)
           p(dir[i]);
           }
    }
}
