package com.tencent.mm.platformtools;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class SpellMap
{
  public static HashMap<String, String> eww = new HashMap();
  
  public static String g(char paramChar)
  {
    Object localObject = null;
    int j = h(paramChar);
    if (j < 65536) {
      localObject = String.valueOf(paramChar);
    }
    for (;;)
    {
      return (String)localObject;
      int i = j >> 16;
      j &= 0xFF;
      String str;
      if ((i < 129) || (i > 253)) {
        str = null;
      }
      while (str != null)
      {
        localObject = str.split(",");
        if ((localObject != null) && (localObject.length >= 2)) {
          break label110;
        }
        return str;
        if ((j < 63) || (j > 254)) {
          str = null;
        } else {
          str = spellGetJni(i - 129, j - 63);
        }
      }
    }
    label110:
    return localObject[0];
  }
  
  private static int h(char paramChar)
  {
    if (paramChar <= '') {
      return paramChar;
    }
    try
    {
      byte[] arrayOfByte = String.valueOf(paramChar).getBytes("GBK");
      if ((arrayOfByte == null) || (arrayOfByte.length > 2) || (arrayOfByte.length <= 0)) {
        return 0;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return 0;
    }
    if (localUnsupportedEncodingException.length == 1) {
      return localUnsupportedEncodingException[0];
    }
    if (localUnsupportedEncodingException.length == 2) {
      return (localUnsupportedEncodingException[0] + 256 << 16) + (localUnsupportedEncodingException[1] + 256);
    }
    return 0;
  }
  
  public static native String spellGetJni(int paramInt1, int paramInt2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/platformtools/SpellMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */