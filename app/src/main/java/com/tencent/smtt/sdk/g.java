package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.c;
import java.util.UnknownFormatConversionException;

public class g
{
  static int a = 5;
  static int b = 16;
  static char[] c = new char[16];
  static String d = "dex2oat-cmdline";
  static long e = 4096L;
  
  public static String a(Context paramContext, String paramString)
  {
    boolean bool = true;
    paramContext = new c(paramString);
    paramContext.a(c);
    if (c[a] == '\001') {}
    for (;;)
    {
      paramContext.a(bool);
      paramContext.a(e);
      return a(new String(a(paramContext)));
      bool = false;
    }
  }
  
  private static String a(String paramString)
  {
    paramString = paramString.split(new String("\000"));
    int i = 0;
    while (i < paramString.length)
    {
      int j = i + 1;
      Object localObject = paramString[i];
      i = j + 1;
      String str = paramString[j];
      if (((String)localObject).equals(d)) {
        return str;
      }
    }
    return "";
  }
  
  public static char[] a(c paramc)
  {
    char[] arrayOfChar1 = new char[4];
    char[] arrayOfChar2 = new char[4];
    paramc.a(arrayOfChar1);
    if ((arrayOfChar1[0] != 'o') || (arrayOfChar1[1] != 'a') || (arrayOfChar1[2] != 't')) {
      throw new UnknownFormatConversionException(String.format("Invalid art magic %c%c%c", new Object[] { Character.valueOf(arrayOfChar1[0]), Character.valueOf(arrayOfChar1[1]), Character.valueOf(arrayOfChar1[2]) }));
    }
    paramc.a(arrayOfChar2);
    paramc.a();
    paramc.a();
    paramc.a();
    paramc.a();
    paramc.a();
    paramc.a();
    paramc.a();
    paramc.a();
    if (arrayOfChar2[1] <= '4')
    {
      paramc.a();
      paramc.a();
      paramc.a();
    }
    paramc.a();
    paramc.a();
    paramc.a();
    paramc.a();
    paramc.a();
    paramc.a();
    paramc.a();
    arrayOfChar1 = new char[paramc.a()];
    paramc.a(arrayOfChar1);
    return arrayOfChar1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/smtt/sdk/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */