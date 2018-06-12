package com.tencent.c.d.a;

import com.tencent.c.f.h;
import java.io.File;
import java.io.IOException;

public final class a
{
  public static boolean aco(String paramString)
  {
    if (!new File(paramString).exists()) {
      return true;
    }
    try
    {
      boolean bool = com.tencent.c.d.b.a.aco(paramString);
      if (!bool) {
        h.i("BootScriptChecker found no-elf file : " + paramString);
      }
      return bool;
    }
    catch (IOException paramString)
    {
      h.k(paramString);
    }
    return true;
  }
  
  public static boolean acp(String paramString)
  {
    boolean bool2 = true;
    Object localObject = new File(paramString);
    boolean bool1 = bool2;
    if (((File)localObject).exists())
    {
      if (((File)localObject).length() <= 51200L) {
        break label35;
      }
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      try
      {
        label35:
        localObject = new String(com.tencent.c.d.b.a.acq(((File)localObject).getAbsolutePath()));
        bool2 = ((String)localObject).contains("applypatch ");
        h.d("BootScriptChecker script (" + paramString + ") content : \n" + (String)localObject);
        bool1 = bool2;
        if (!bool2)
        {
          h.i("BootScriptChecker found unofficial file : " + paramString);
          return bool2;
        }
      }
      catch (Exception paramString)
      {
        h.k(paramString);
      }
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/c/d/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */