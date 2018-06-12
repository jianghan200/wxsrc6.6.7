package com.tencent.mm.wallet_core.f;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class b
{
  public static boolean cDu()
  {
    StringBuilder localStringBuilder = new StringBuilder(8);
    int i = 0;
    for (;;)
    {
      char c;
      if (i < 6) {
        c = (char)(int)(57497235128533601L >> (5 - i) * 8 & 0xFF);
      }
      try
      {
        localStringBuilder.append(c);
        i += 1;
      }
      finally
      {
        String str2;
        do
        {
          String str1;
          str2 = localStringBuilder.toString();
          localStringBuilder.delete(0, localStringBuilder.length());
          localStringBuilder.append((b.class.hashCode() >>> 31 | 0x1) ^ 0x1);
        } while (!localStringBuilder.toString().equals(dZ(str2, localStringBuilder.toString())));
      }
    }
    str1 = localStringBuilder.toString();
    localStringBuilder.delete(0, localStringBuilder.length());
    localStringBuilder.append((b.class.hashCode() >>> 31 | 0x1) ^ 0x1);
    return !localStringBuilder.toString().equals(dZ(str1, localStringBuilder.toString()));
    return false;
  }
  
  public static boolean cDv()
  {
    StringBuilder localStringBuilder = new StringBuilder(8);
    int i = 0;
    for (;;)
    {
      char c;
      if (i < 6) {
        c = (char)(int)(57778710156427883L >> (5 - i) * 8 & 0xFF);
      }
      try
      {
        localStringBuilder.append(c);
        i += 1;
      }
      finally
      {
        String str2;
        do
        {
          String str1;
          str2 = localStringBuilder.toString();
          localStringBuilder.delete(0, localStringBuilder.length());
          localStringBuilder.append((b.class.hashCode() >>> 31 | 0x1) ^ 0x1);
        } while (!localStringBuilder.toString().equals(dZ(str2, localStringBuilder.toString())));
      }
    }
    str1 = localStringBuilder.toString();
    localStringBuilder.delete(0, localStringBuilder.length());
    localStringBuilder.append((b.class.hashCode() >>> 31 | 0x1) ^ 0x1);
    return !localStringBuilder.toString().equals(dZ(str1, localStringBuilder.toString()));
    return false;
  }
  
  public static boolean cDw()
  {
    StringBuilder localStringBuilder = new StringBuilder(8);
    int i = 0;
    for (;;)
    {
      char c;
      if (i < 6) {
        c = (char)(int)(65941484396629365L >> (5 - i) * 8 & 0xFF);
      }
      try
      {
        localStringBuilder.append(c);
        i += 1;
      }
      finally
      {
        String str2;
        do
        {
          String str1;
          str2 = localStringBuilder.toString();
          localStringBuilder.delete(0, localStringBuilder.length());
          localStringBuilder.append((b.class.hashCode() >>> 31 | 0x1) ^ 0x1);
        } while (!localStringBuilder.toString().equals(dZ(str2, localStringBuilder.toString())));
      }
    }
    str1 = localStringBuilder.toString();
    localStringBuilder.delete(0, localStringBuilder.length());
    localStringBuilder.append((b.class.hashCode() >>> 31 | 0x1) ^ 0x1);
    return !localStringBuilder.toString().equals(dZ(str1, localStringBuilder.toString()));
    return false;
  }
  
  private static String dZ(String paramString1, String paramString2)
  {
    Object localObject = com.tencent.mm.model.c.c.Jx().fJ("100327");
    if (!((com.tencent.mm.storage.c)localObject).isValid()) {
      x.w("MicroMsg.WalletPayHelper", "check point 1, explained by src code.");
    }
    do
    {
      return paramString2;
      localObject = ((com.tencent.mm.storage.c)localObject).ckq();
      if (localObject == null)
      {
        x.w("MicroMsg.WalletPayHelper", "check point 2, explained by src code.");
        return paramString2;
      }
      paramString1 = (String)((Map)localObject).get(paramString1);
    } while ((paramString1 == null) || (paramString1.length() <= 0));
    return paramString1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/wallet_core/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */