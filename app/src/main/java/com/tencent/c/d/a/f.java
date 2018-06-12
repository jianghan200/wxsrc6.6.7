package com.tencent.c.d.a;

import com.tencent.c.d.b.a;
import com.tencent.c.d.b.c;
import com.tencent.c.f.h;
import java.io.File;
import java.io.IOException;

public final class f
{
  private static boolean X(File paramFile)
  {
    boolean bool = false;
    try
    {
      int i = c.acr(paramFile.getAbsolutePath());
      if ((i & 0x800) > 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramFile)
    {
      h.k(paramFile);
    }
    return false;
  }
  
  public static boolean cFg()
  {
    if (com.tencent.c.d.b.f.cFi()) {
      h.i("SetuidBitChecker : SELinux is enforcing");
    }
    int j;
    int i;
    label57:
    File localFile;
    for (;;)
    {
      return false;
      try
      {
        Object localObject = new String(a.acq("/proc/mounts"));
        h.d("SetuidBitChecker mounts : " + (String)localObject);
        localObject = ((String)localObject).split("\n");
        j = localObject.length;
        i = 0;
        if (i < j)
        {
          localFile = localObject[i];
          if (localFile.contains(" /system "))
          {
            if (!localFile.contains(",nosuid")) {
              break label115;
            }
            h.i("SetuidBitChecker : nosuid found");
          }
        }
        label115:
        for (i = 1; i == 0; i = 0)
        {
          if (c.isAvailable()) {
            break label127;
          }
          h.i("SetuidBitChecker : OsUtil isn't available");
          return false;
          i += 1;
          break label57;
        }
        arrayOfFile = new File("/system/bin").listFiles();
      }
      catch (IOException localIOException)
      {
        h.k(localIOException);
        return false;
      }
    }
    label127:
    if (arrayOfFile != null)
    {
      j = arrayOfFile.length;
      i = 0;
      while (i < j)
      {
        localFile = arrayOfFile[i];
        if ((!"run-as".equals(localFile.getName())) && (X(localFile)))
        {
          h.i("SetuidBitChecker s-bit found : " + localFile.getAbsolutePath());
          return true;
        }
        i += 1;
      }
    }
    File[] arrayOfFile = new File("/system/xbin").listFiles();
    if (arrayOfFile != null)
    {
      j = arrayOfFile.length;
      i = 0;
      while (i < j)
      {
        localFile = arrayOfFile[i];
        if (X(localFile))
        {
          h.i("SetuidBitChecker s-bit found : " + localFile.getAbsolutePath());
          return true;
        }
        i += 1;
      }
    }
    h.i("SetuidBitChecker s-bit not found");
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/c/d/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */