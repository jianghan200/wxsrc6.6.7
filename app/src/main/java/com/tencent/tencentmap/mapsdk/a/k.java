package com.tencent.tencentmap.mapsdk.a;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Stack;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class k
{
  public static final void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  public static void a(File paramFile, String paramString)
  {
    Object localObject1 = new File(paramString);
    if (!((File)localObject1).exists()) {
      ((File)localObject1).mkdirs();
    }
    paramFile = new ZipFile(paramFile);
    localObject1 = new byte['က'];
    Enumeration localEnumeration = paramFile.entries();
    while (localEnumeration.hasMoreElements())
    {
      Object localObject3 = (ZipEntry)localEnumeration.nextElement();
      Object localObject2 = ((ZipEntry)localObject3).getName();
      if ((localObject2 == null) || (!((String)localObject2).contains("../"))) {
        if (((ZipEntry)localObject3).isDirectory())
        {
          new File(paramString + File.separator + ((ZipEntry)localObject3).getName()).mkdir();
        }
        else
        {
          localObject2 = paramFile.getInputStream((ZipEntry)localObject3);
          localObject3 = new File(paramString + File.separator + ((ZipEntry)localObject3).getName());
          if (!((File)localObject3).exists())
          {
            File localFile = ((File)localObject3).getParentFile();
            if (!localFile.exists()) {
              localFile.mkdirs();
            }
            ((File)localObject3).createNewFile();
          }
          localObject3 = new FileOutputStream((File)localObject3);
          for (;;)
          {
            int i = ((InputStream)localObject2).read((byte[])localObject1);
            if (i <= 0) {
              break;
            }
            ((OutputStream)localObject3).write((byte[])localObject1, 0, i);
          }
          ((OutputStream)localObject3).flush();
          ((InputStream)localObject2).close();
          ((OutputStream)localObject3).close();
        }
      }
    }
    paramFile.close();
  }
  
  public static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    Stack localStack = new Stack();
    localStack.push(paramString);
    while (!localStack.isEmpty())
    {
      File localFile = new File((String)localStack.peek());
      if (localFile.exists())
      {
        if (localFile.isDirectory())
        {
          paramString = localFile.listFiles();
          if ((paramString == null) || (paramString.length == 0))
          {
            localFile.delete();
            localStack.pop();
          }
          else
          {
            int j = paramString.length;
            int i = 0;
            label96:
            if (i < j)
            {
              localFile = paramString[i];
              if (!localFile.isDirectory()) {
                break label131;
              }
              localStack.push(localFile.getAbsolutePath());
            }
            for (;;)
            {
              i += 1;
              break label96;
              break;
              label131:
              localFile.delete();
            }
          }
        }
        else
        {
          localFile.delete();
          localStack.pop();
        }
      }
      else {
        localStack.pop();
      }
    }
    return true;
  }
  
  public static boolean b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    try
    {
      paramString = new File(paramString);
      if ((paramString.exists()) && (paramString.isDirectory())) {
        return true;
      }
      if ((paramString.exists()) && (paramString.isFile())) {
        paramString.delete();
      }
      boolean bool = paramString.mkdirs();
      return bool;
    }
    catch (Exception paramString) {}
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */