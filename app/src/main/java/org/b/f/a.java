package org.b.f;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.b.g.c;

public final class a
  implements b
{
  public final String aw(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      org.b.g.d.gE(paramString1, "Base string cant be null or empty string");
      org.b.g.d.gE(paramString2, "Api secret cant be null or empty string");
      paramString2 = new SecretKeySpec((c.encode(paramString2) + '&' + c.encode(paramString3)).getBytes("UTF-8"), "HmacSHA1");
      paramString3 = Mac.getInstance("HmacSHA1");
      paramString3.init(paramString2);
      paramString2 = new String(org.b.g.a.ci(paramString3.doFinal(paramString1.getBytes("UTF-8")))).replace("\r\n", "");
      return paramString2;
    }
    catch (Exception paramString2)
    {
      throw new org.b.b.d(paramString1, paramString2);
    }
  }
  
  public final String cKD()
  {
    return "HMAC-SHA1";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/org/b/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */