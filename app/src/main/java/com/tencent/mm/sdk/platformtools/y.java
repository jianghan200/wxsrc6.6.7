package com.tencent.mm.sdk.platformtools;

import android.util.Base64;
import com.tencent.mm.a.k;
import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

public final class y
{
  private static final Pattern sGn;
  private byte[] key;
  private final aa<String, String> sGo = new aa(256);
  public final bf sGp;
  
  static
  {
    char c = (char)("⍆[0-9]+@".charAt(0) ^ 0xDCBA);
    sGn = Pattern.compile(c + "⍆[0-9]+@".substring(1));
  }
  
  public y(String paramString)
  {
    try
    {
      this.key = paramString.getBytes("UTF-8");
      this.sGp = new bf(paramString);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        this.key = paramString.getBytes();
      }
    }
  }
  
  public final String cV(String paramString, int paramInt)
  {
    String str = paramString.substring(0, paramInt);
    if (this.sGo.ce(str)) {
      return (String)this.sGo.get(str);
    }
    paramInt = paramString.indexOf('@', 1);
    int i = paramInt + 1;
    paramString = paramString.substring(i, Integer.parseInt(paramString.substring(1, paramInt)) + i);
    try
    {
      paramString = new String(k.a(Base64.decode(paramString, 0), this.key), "UTF-8");
      this.sGo.put(str, paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.LogDecryptor", paramString, "", new Object[0]);
    }
    return "[TD]" + str;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */