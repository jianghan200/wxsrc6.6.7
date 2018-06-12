package com.tencent.mm.modelcontrol;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class b
{
  public static boolean M(String paramString, int paramInt)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return false;
      try
      {
        int j = NK();
        paramString = paramString.split(";");
        int i = 0;
        while (i < paramString.length)
        {
          String[] arrayOfString1 = paramString[i].split("-");
          String[] arrayOfString2 = arrayOfString1[0].split(":");
          int k = bi.WU(arrayOfString2[0]);
          int m = bi.WU(arrayOfString2[1]);
          arrayOfString1 = arrayOfString1[1].split(":");
          int n = bi.WU(arrayOfString1[0]);
          boolean bool = y(m + k * 60, bi.WU(arrayOfString1[1]) + n * 60 + paramInt, j);
          if (bool) {
            return true;
          }
          i += 1;
        }
        return false;
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.BusyTimeControlLogic", paramString, "", new Object[0]);
        x.e("MicroMsg.BusyTimeControlLogic", "checkNeedToControl error : " + paramString.toString());
      }
    }
  }
  
  private static int NK()
  {
    String[] arrayOfString = new SimpleDateFormat("HH:mm").format(new Date()).split(":");
    int i = bi.WU(arrayOfString[0]);
    int j = bi.WU(arrayOfString[1]) + i * 60 - ((int)NL() - 8) * 60;
    if (j < 0) {
      i = j + 1440;
    }
    do
    {
      return i;
      i = j;
    } while (j < 1440);
    return j - 1440;
  }
  
  public static long NL()
  {
    return (int)(TimeZone.getDefault().getRawOffset() / 60000L) / 60L;
  }
  
  public static boolean lz(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return false;
      try
      {
        int j = NK();
        paramString = paramString.split(";");
        int i = 0;
        while (i < paramString.length)
        {
          String[] arrayOfString1 = paramString[i].split("-");
          String[] arrayOfString2 = arrayOfString1[0].split(":");
          int k = bi.WU(arrayOfString2[0]);
          int m = bi.WU(arrayOfString2[1]);
          arrayOfString1 = arrayOfString1[1].split(":");
          int n = bi.WU(arrayOfString1[0]);
          boolean bool = y(m + k * 60, bi.WU(arrayOfString1[1]) + n * 60, j);
          if (bool) {
            return true;
          }
          i += 1;
        }
        return false;
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.BusyTimeControlLogic", paramString, "", new Object[0]);
        x.e("MicroMsg.BusyTimeControlLogic", "checkNeedToControl error : " + paramString.toString());
      }
    }
  }
  
  private static boolean y(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2) {
      if ((paramInt3 >= paramInt2) || (paramInt3 < paramInt1)) {}
    }
    while (((paramInt3 <= 1440) && (paramInt3 >= paramInt1)) || ((paramInt3 < paramInt2) && (paramInt3 >= 0)))
    {
      return true;
      return false;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/modelcontrol/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */