package com.tencent.matrix.resource.a.a;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipFile;

public final class c
{
  public static void a(File paramFile, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte['က'];
    try
    {
      paramFile = new BufferedInputStream(new FileInputStream(paramFile));
      try
      {
        for (;;)
        {
          int i = paramFile.read(arrayOfByte);
          if (i <= 0) {
            break;
          }
          paramOutputStream.write(arrayOfByte, 0, i);
        }
        ar(paramOutputStream);
      }
      finally
      {
        paramOutputStream = paramFile;
        paramFile = (File)localObject;
      }
    }
    finally
    {
      for (;;)
      {
        paramOutputStream = null;
      }
    }
    throw paramFile;
    paramOutputStream.flush();
    ar(paramFile);
  }
  
  public static void ar(Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return;
      try
      {
        if ((paramObject instanceof Closeable))
        {
          ((Closeable)paramObject).close();
          return;
        }
        if ((paramObject instanceof ZipFile))
        {
          ((ZipFile)paramObject).close();
          return;
        }
      }
      catch (Throwable paramObject) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */