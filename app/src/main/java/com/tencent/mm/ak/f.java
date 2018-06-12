package com.tencent.mm.ak;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class f
{
  public static e a(e parame)
  {
    e locale1;
    if (parame == null) {
      locale1 = null;
    }
    e locale2;
    do
    {
      do
      {
        return locale1;
        locale1 = parame;
      } while (!parame.ON());
      locale2 = o.Pf().hQ(parame.dTU);
      locale1 = parame;
    } while (locale2 == null);
    return locale2;
  }
  
  public static boolean b(e parame)
  {
    if (parame == null) {}
    int j;
    int i;
    long l;
    do
    {
      return false;
      j = parame.offset;
      i = parame.dHI;
      l = parame.bYu;
      if (parame.ON())
      {
        parame = o.Pf().hQ(parame.dTU);
        j = parame.offset;
        i = parame.dHI;
        l = parame.bYu;
      }
      if (i == 0) {
        return true;
      }
    } while (((j != i) || (i == 0)) && (l == 0L));
    return true;
  }
  
  public static String c(e parame)
  {
    if (parame == null) {
      return "";
    }
    if (parame.ON())
    {
      parame = o.Pf().hQ(parame.dTU);
      if (parame == null) {
        return "";
      }
      return parame.dTL;
    }
    return parame.dTL;
  }
  
  public static String c(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str = null;
    if (!bi.oW(paramString1)) {
      str = String.format("<appinfo><appid>%s</appid><mediatagname>%s</mediatagname><messageext>%s</messageext><messageaction>%s</messageaction></appinfo>", new Object[] { paramString1, bi.oV(paramString2), bi.oV(paramString3), bi.oV(paramString4) });
    }
    return str;
  }
  
  public static final a lL(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    int i = paramString.indexOf('<');
    Object localObject = paramString;
    if (i > 0) {
      localObject = paramString.substring(i);
    }
    paramString = bl.z((String)localObject, "msg");
    if (paramString == null)
    {
      x.e("MicroMsg.ImgInfoLogic", "parseImg failed");
      return null;
    }
    localObject = new a();
    ((a)localObject).appId = ((String)paramString.get(".msg.appinfo.appid"));
    ((a)localObject).mediaTagName = ((String)paramString.get(".msg.appinfo.mediatagname"));
    ((a)localObject).messageExt = ((String)paramString.get(".msg.appinfo.messageext"));
    ((a)localObject).messageAction = ((String)paramString.get(".msg.appinfo.messageaction"));
    return (a)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ak/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */