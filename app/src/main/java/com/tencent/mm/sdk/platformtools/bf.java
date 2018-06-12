package com.tencent.mm.sdk.platformtools;

import com.tencent.mm.a.d;

public final class bf
{
  private final d sJh;
  private aa<String, String> sJi = new aa(256);
  
  public bf(String paramString)
  {
    this.sJh = new d(paramString);
  }
  
  public final String decryptTag(String paramString)
  {
    String str1 = paramString;
    try
    {
      if (!paramString.startsWith("!")) {
        break label182;
      }
      if (this.sJi.bb(paramString)) {
        return (String)this.sJi.get(paramString);
      }
      str1 = paramString.substring(1);
      Object localObject2;
      String str2;
      int i;
      x.printErrStackTrace("MicroMsg.TagDecrypter", localException1, "", new Object[0]);
    }
    catch (Exception localException1)
    {
      try
      {
        localObject2 = str1.split("@");
        if (localObject2.length <= 1) {
          break label194;
        }
        str2 = localObject2[0];
        i = Integer.valueOf(localObject2[0]).intValue();
        localObject2 = str1.substring(str2.length() + 1, str2.length() + 1 + i);
        str2 = str1.substring(i + (str2.length() + 1));
        str2 = this.sJh.cl((String)localObject2) + str2;
        this.sJi.put(paramString, str2);
        return str2;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          paramString = (String)localObject1;
          Object localObject1 = localException2;
        }
      }
      localException1 = localException1;
    }
    localObject1 = "[td]" + paramString;
    label182:
    return (String)localObject1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */