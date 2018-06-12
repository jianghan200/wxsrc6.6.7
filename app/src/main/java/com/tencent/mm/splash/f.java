package com.tencent.mm.splash;

import com.tencent.mm.sdk.platformtools.x;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public static final boolean lY = F(System.getProperty("java.vm.version"));
  
  private static boolean F(String paramString)
  {
    bool2 = false;
    bool1 = bool2;
    if (paramString != null)
    {
      localObject = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      bool1 = bool2;
      if (!((Matcher)localObject).matches()) {}
    }
    try
    {
      int i = Integer.parseInt(((Matcher)localObject).group(1));
      int j = Integer.parseInt(((Matcher)localObject).group(2));
      if (i <= 2)
      {
        bool1 = bool2;
        if (i == 2)
        {
          bool1 = bool2;
          if (j <= 0) {}
        }
      }
      else
      {
        bool1 = true;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        bool1 = bool2;
      }
    }
    Object localObject = new StringBuilder("VM with version ").append(paramString);
    if (bool1) {}
    for (paramString = " has multidex support";; paramString = " does not have multidex support")
    {
      x.i("MicroMsg.MultiDex", paramString);
      return bool1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/splash/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */