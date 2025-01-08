import java.io.File;
import java.io.FilenameFilter ;

public class FileExp{
public static void main(String a[])
{
File file= new File("/home/itl7/Desktop/OK/");
String[] list = file.list(new FilenameFilter()
{
 public boolean accept(File dir, String name)
 {
  if(name.toLowerCase().endsWith(".java"))
    {
      return true;
    }
  else
  {
   return false;
  }
 }
});
for(String f:list){
System.out.println(f);
}
}
}
