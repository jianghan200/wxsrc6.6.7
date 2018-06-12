package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.k.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class ab
  extends com.tencent.mm.l.a
  implements Cloneable
{
  public CharSequence sNQ;
  public String taj = null;
  
  public ab() {}
  
  public ab(String paramString)
  {
    super(paramString);
  }
  
  public static boolean Dk(int paramInt)
  {
    return (paramInt & 0x8) > 0;
  }
  
  public static boolean XO(String paramString)
  {
    if (paramString != null) {
      return paramString.endsWith("@t.qq.com");
    }
    return false;
  }
  
  public static boolean XP(String paramString)
  {
    if (paramString != null) {
      return paramString.endsWith("@qr");
    }
    return false;
  }
  
  public static boolean XQ(String paramString)
  {
    if (paramString != null) {
      return paramString.endsWith("@qqim");
    }
    return false;
  }
  
  public static boolean XR(String paramString)
  {
    if (paramString != null) {
      return paramString.endsWith("@openim");
    }
    return false;
  }
  
  public static boolean XS(String paramString)
  {
    if (paramString != null) {
      return paramString.endsWith("@fb");
    }
    return false;
  }
  
  public static boolean XT(String paramString)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.Contact", "Contact invisibleUsername username == null or nil");
    }
    for (;;)
    {
      return false;
      if (XR(paramString)) {
        return true;
      }
      Object localObject = ((com.tencent.mm.plugin.zero.b.a)g.l(com.tencent.mm.plugin.zero.b.a.class)).AU().G("HideWechatID", "idprefix");
      if (localObject != null)
      {
        localObject = ((String)localObject).split(";");
        int i = 0;
        while (i < localObject.length)
        {
          if ((localObject[i] != null) && (paramString.startsWith(localObject[i]))) {
            return true;
          }
          i += 1;
        }
      }
    }
  }
  
  public static boolean XU(String paramString)
  {
    if (bi.oW(paramString)) {
      return true;
    }
    String[] arrayOfString = "wx_;wxid_;gh_;a0;a1;a2;a3;a4;a5;a6;a7;a8;a9;q0;q1;q2;q3;q4;q5;q6;q7;q8;q9;qq0;qq1;qq2;qq3;qq4;qq5;qq6;qq7;qq8;qq9;f0;f1;f2;f3;f4;f5;f6;f7;f8;f9;F0;F1;F2;F3;F4;F5;F6;F7;F8;F9;".split(";");
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label56;
      }
      String str = arrayOfString[i];
      if ((!bi.oW(str)) && (paramString.startsWith(str))) {
        break;
      }
      i += 1;
    }
    label56:
    return false;
  }
  
  public static String XV(String paramString)
  {
    if (gY(paramString))
    {
      String[] arrayOfString = paramString.split(":");
      if ((arrayOfString == null) || (arrayOfString.length <= 0)) {
        return paramString;
      }
      return arrayOfString[0];
    }
    if ((paramString != null) && (paramString.contains("@"))) {
      return "";
    }
    return paramString + "@bottle";
  }
  
  public static boolean ckV()
  {
    return false;
  }
  
  public static int ckX()
  {
    return 16;
  }
  
  public static int ckY()
  {
    return 8;
  }
  
  public static boolean gY(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null) {
      if (!paramString.contains("@bottle:"))
      {
        bool1 = bool2;
        if (!paramString.endsWith("@bottle")) {}
      }
      else
      {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public static boolean gr(String paramString)
  {
    if (paramString != null) {
      return paramString.endsWith("@app");
    }
    return false;
  }
  
  public static String o(Cursor paramCursor)
  {
    return paramCursor.getString(paramCursor.getColumnIndex("username"));
  }
  
  public final boolean ckW()
  {
    return (this.field_verifyFlag & 0x8) > 0;
  }
  
  public final boolean ckZ()
  {
    return (int)bi.VE() - this.csR > 86400L;
  }
  
  public final String cla()
  {
    Object localObject = this.csQ;
    if (bi.oW((String)localObject)) {
      return "";
    }
    localObject = ((String)localObject).split("_");
    if ((localObject == null) || (localObject.length < 2)) {
      return "";
    }
    return bi.oV(localObject[1]);
  }
  
  public final void clb()
  {
    Object localObject = this.csQ;
    if (bi.oW((String)localObject)) {}
    do
    {
      return;
      localObject = ((String)localObject).split("_");
    } while (localObject.length <= 0);
    if (localObject.length > 2)
    {
      if (RegionCodeDecoder.Zh(localObject[0]))
      {
        RegionCodeDecoder.cmS();
        super.dN(RegionCodeDecoder.ga(localObject[0], localObject[1]));
      }
      for (;;)
      {
        RegionCodeDecoder.cmS();
        super.dO(RegionCodeDecoder.ar(localObject[0], localObject[1], localObject[2]));
        return;
        RegionCodeDecoder.cmS();
        super.dN(RegionCodeDecoder.Zi(localObject[0]));
      }
    }
    if (localObject.length == 2)
    {
      RegionCodeDecoder.cmS();
      super.dN(RegionCodeDecoder.Zi(localObject[0]));
      RegionCodeDecoder.cmS();
      super.dO(RegionCodeDecoder.ga(localObject[0], localObject[1]));
      return;
    }
    RegionCodeDecoder.cmS();
    super.dN(RegionCodeDecoder.Zi(localObject[0]));
    super.dO("");
  }
  
  public final ab clc()
  {
    try
    {
      ab localab = (ab)super.clone();
      return localab;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Contact", localException, "", new Object[0]);
      x.e("MicroMsg.Contact", "clone Contact error. e: " + localException.toString());
    }
    return null;
  }
  
  @Deprecated
  public final void dN(String paramString)
  {
    super.dN(paramString);
  }
  
  @Deprecated
  public final void dO(String paramString)
  {
    super.dO(paramString);
  }
  
  public final void dS(String paramString)
  {
    super.dS(paramString);
    clb();
  }
  
  public final String getCity()
  {
    return super.getCity();
  }
  
  public final String getCityCode()
  {
    Object localObject = this.csQ;
    if (bi.oW((String)localObject)) {
      return "";
    }
    localObject = ((String)localObject).split("_");
    if ((localObject == null) || (localObject.length < 3)) {
      return "";
    }
    return bi.oV(localObject[2]);
  }
  
  public final String getCountryCode()
  {
    Object localObject = this.csQ;
    if (bi.oW((String)localObject)) {
      return "";
    }
    localObject = ((String)localObject).split("_");
    if ((localObject == null) || (localObject.length <= 0)) {
      return "";
    }
    return bi.oV(localObject[0]);
  }
  
  public final String getProvince()
  {
    return super.getProvince();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */