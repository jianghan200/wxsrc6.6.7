package com.tencent.mm.sdk.platformtools;

import com.tencent.mm.a.g;
import java.io.File;
import java.io.IOException;

public final class h
{
  public static boolean Ey(String paramString)
  {
    try
    {
      File localFile = new File(paramString);
      if (!localFile.exists())
      {
        localFile.mkdirs();
        paramString = new File(paramString + ".nomedia");
        boolean bool = paramString.exists();
        if (bool) {}
      }
      try
      {
        paramString.createNewFile();
        return true;
      }
      catch (IOException paramString)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.FilePathGenerator", paramString, "", new Object[0]);
        }
      }
      return false;
    }
    catch (Exception paramString) {}
  }
  
  private static String Wc(String paramString)
  {
    if (bi.oW(paramString)) {}
    while (paramString.length() <= 4) {
      return null;
    }
    return paramString.substring(0, 2) + "/" + paramString.substring(2, 4) + "/";
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, boolean paramBoolean)
  {
    if (bi.oW(paramString1)) {}
    label139:
    for (;;)
    {
      return null;
      if (paramString1.endsWith("/"))
      {
        String str = "";
        if (paramInt == 1) {
          str = Wc(paramString3);
        }
        for (;;)
        {
          if (bi.oW(str)) {
            break label139;
          }
          paramString1 = paramString1 + str;
          if ((paramBoolean) && (!Ey(paramString1))) {
            break;
          }
          return paramString1 + bi.oV(paramString2) + paramString3 + bi.oV(paramString4);
          if (paramInt == 2) {
            if (bi.oW(paramString3)) {
              str = null;
            } else {
              str = Wc(g.u(paramString3.getBytes()));
            }
          }
        }
      }
    }
  }
  
  public static String b(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    return a(paramString1, paramString2, paramString3, paramString4, paramInt, true);
  }
  
  public static String b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean)
  {
    String str = paramString1 + paramString3 + paramString4 + paramString5;
    paramString2 = a(paramString2, paramString3, paramString4, paramString5, 1, paramBoolean);
    if ((bi.oW(str)) || (bi.oW(paramString2))) {
      paramString1 = null;
    }
    do
    {
      do
      {
        return paramString1;
        paramString3 = new File(paramString2);
        paramString4 = new File(str);
        paramString1 = paramString2;
      } while (paramString3.exists());
      paramString1 = paramString2;
    } while (!paramString4.exists());
    j.q(str, paramString2, false);
    return paramString2;
  }
  
  public static String f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return b(paramString1, paramString2, paramString3, paramString4, paramString5, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */