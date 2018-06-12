package com.tencent.mm.model;

import android.graphics.BitmapFactory.Options;
import com.tencent.mm.a.o;
import com.tencent.mm.aq.k;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class q
{
  public static int GE()
  {
    com.tencent.mm.kernel.g.Ek();
    Integer localInteger = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(9, null);
    if (localInteger == null) {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public static String GF()
  {
    com.tencent.mm.kernel.g.Ek();
    return (String)com.tencent.mm.kernel.g.Ei().DT().get(2, null);
  }
  
  public static String GG()
  {
    com.tencent.mm.kernel.g.Ek();
    return (String)com.tencent.mm.kernel.g.Ei().DT().get(42, null);
  }
  
  public static String GH()
  {
    com.tencent.mm.kernel.g.Ek();
    return (String)com.tencent.mm.kernel.g.Ei().DT().get(4, null);
  }
  
  public static String GI()
  {
    String str = GG();
    if (!bi.oW(str)) {
      return str;
    }
    return GF();
  }
  
  public static int GJ()
  {
    com.tencent.mm.kernel.g.Ek();
    Integer localInteger = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(7, null);
    if (localInteger == null) {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public static long GK()
  {
    com.tencent.mm.kernel.g.Ek();
    Long localLong = (Long)com.tencent.mm.kernel.g.Ei().DT().get(147457, null);
    if (localLong == null) {
      return 0L;
    }
    return localLong.longValue();
  }
  
  public static int GL()
  {
    com.tencent.mm.kernel.g.Ek();
    Integer localInteger = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(40, null);
    if (localInteger == null) {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public static int GM()
  {
    com.tencent.mm.kernel.g.Ek();
    Integer localInteger = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(339975, null);
    if (localInteger == null) {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public static boolean GN()
  {
    return (GL() & 0x4000) != 0;
  }
  
  public static boolean GO()
  {
    return (GL() & 0x8000) != 0;
  }
  
  public static void GP()
  {
    int i = GL();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().set(40, Integer.valueOf(i | 0x8000));
  }
  
  public static int GQ()
  {
    com.tencent.mm.kernel.g.Ek();
    Integer localInteger = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(34, null);
    if (localInteger == null) {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public static boolean GR()
  {
    if ((GJ() & 0x40000) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigStorageLogic", "isGooglePay: %s  User Status: %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(GJ()) });
      return bool;
    }
  }
  
  public static boolean GS()
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().lm(true);
    return GM() == 1;
  }
  
  public static boolean GT()
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().lm(true);
    return GM() == 2;
  }
  
  public static boolean GU()
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().lm(true);
    return GM() == 4;
  }
  
  public static boolean GV()
  {
    return (GQ() & 0x20) == 0;
  }
  
  public static boolean GW()
  {
    return (GJ() & 0x1000) != 0;
  }
  
  public static boolean GX()
  {
    bl localbl = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().Hg("@t.qq.com");
    return (localbl != null) && (localbl.isEnable());
  }
  
  public static boolean GY()
  {
    return (GQ() & 0x2) == 0;
  }
  
  public static boolean GZ()
  {
    return (GQ() & 0x10) == 0;
  }
  
  public static boolean Ha()
  {
    return (GQ() & 0x80) == 0;
  }
  
  public static boolean Hb()
  {
    com.tencent.mm.kernel.g.Ek();
    return bi.d((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(8200, null));
  }
  
  public static boolean Hc()
  {
    return (GQ() & 0x80000) == 0;
  }
  
  public static boolean Hd()
  {
    return (GQ() & 0x40000) == 0;
  }
  
  public static boolean He()
  {
    return (GQ() & 0x2000) == 0;
  }
  
  public static boolean Hf()
  {
    return (GQ() & 0x10000) == 0;
  }
  
  public static boolean Hg()
  {
    com.tencent.mm.kernel.g.Ek();
    String str = (String)com.tencent.mm.kernel.g.Ei().DT().get(65825, null);
    if (bi.oW(str)) {
      return false;
    }
    if (str.equals("0")) {
      return false;
    }
    try
    {
      long l = bi.c(Long.valueOf(bi.getLong(str, 0L)));
      if (l == 0L) {
        return false;
      }
    }
    catch (Exception localException)
    {
      return false;
    }
    return true;
  }
  
  public static boolean Hh()
  {
    return (GQ() & 0x1) == 0;
  }
  
  public static boolean Hi()
  {
    return (GJ() & 0x20000) == 0;
  }
  
  public static int Hj()
  {
    com.tencent.mm.kernel.g.Ek();
    return bi.a((Integer)com.tencent.mm.kernel.g.Ei().DT().get(8201, null), 22);
  }
  
  public static int Hk()
  {
    com.tencent.mm.kernel.g.Ek();
    return bi.a((Integer)com.tencent.mm.kernel.g.Ei().DT().get(8208, null), 8);
  }
  
  public static ab Hl()
  {
    ab localab = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(GF());
    if ((localab != null) && ((int)localab.dhP > 0)) {
      return localab;
    }
    localab = new ab();
    com.tencent.mm.kernel.g.Ek();
    String str1 = (String)com.tencent.mm.kernel.g.Ei().DT().get(2, null);
    com.tencent.mm.kernel.g.Ek();
    String str2 = (String)com.tencent.mm.kernel.g.Ei().DT().get(4, null);
    localab.setUsername(str1);
    localab.dx(str2);
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().T(localab);
    return ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(str1);
  }
  
  public static boolean Hm()
  {
    com.tencent.mm.kernel.g.Ek();
    return new o(bi.f((Integer)com.tencent.mm.kernel.g.Ei().DT().get(9, null))).longValue() != 0L;
  }
  
  public static Boolean Hn()
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ConfigStorageLogic", "mmcore has not ready");
      return Boolean.valueOf(false);
    }
    com.tencent.mm.kernel.g.Ek();
    String str = (String)com.tencent.mm.kernel.g.Ei().DT().get(6, null);
    com.tencent.mm.kernel.g.Ek();
    if ((Boolean.valueOf(bi.d((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(340241, null))).booleanValue() == true) && (!bi.oW(str))) {
      if (!str.startsWith("+")) {
        break label116;
      }
    }
    label116:
    for (str = ap.Fp(str);; str = "86")
    {
      if (str == "86") {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(true);
      return Boolean.valueOf(false);
    }
  }
  
  public static Map<String, String> Ho()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("login_weixin_username", GF());
    com.tencent.mm.kernel.g.Ek();
    localHashMap.put("login_user_name", (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZN, null));
    com.tencent.mm.kernel.g.Ek();
    localHashMap.put("last_avatar_path", (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZO, null));
    com.tencent.mm.kernel.g.Ek();
    localHashMap.put("last_login_bind_mobile", (String)com.tencent.mm.kernel.g.Ei().DT().get(6, null));
    com.tencent.mm.kernel.g.Ek();
    localHashMap.put("last_login_bind_email", (String)com.tencent.mm.kernel.g.Ei().DT().get(5, null));
    com.tencent.mm.kernel.g.Ek();
    localHashMap.put("last_login_bind_qq", String.valueOf(com.tencent.mm.kernel.g.Ei().DT().get(9, null)));
    com.tencent.mm.kernel.g.Ek();
    localHashMap.put("last_login_use_voice", String.valueOf(com.tencent.mm.kernel.g.Ei().DT().get(40, null)));
    return localHashMap;
  }
  
  public static boolean a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((paramString1 == null) || (paramString1.length() == 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ConfigStorageLogic", "canSendRawImage, invalid argument");
    }
    label191:
    do
    {
      do
      {
        return false;
      } while ((paramString2 != null) && (paramString2.length() > 0) && ((ab.XO(paramString2)) || (ab.XQ(paramString2))));
      paramString2 = new BitmapFactory.Options();
      int i;
      if ((paramString1 == null) || (paramString1.length() == 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ConfigStorageLogic", "isSmallImg, invalid argument");
        i = 0;
      }
      for (;;)
      {
        if (i == 0) {
          break label191;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigStorageLogic", "canSendRawImage : true. isSmallImg");
        return true;
        if (com.tencent.mm.a.e.cm(paramString1) < 65536)
        {
          i = 1;
        }
        else
        {
          paramString2.inJustDecodeBounds = true;
          MMBitmapFactory.decodeFile(paramString1, paramString2, null, 0, new int[0]);
          d1 = paramString2.outWidth;
          d2 = paramString2.outHeight;
          if ((d1 >= 100.0D) || (d2 >= 100.0D)) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigStorageLogic", "isSmallImg : true, width = " + d1 + ", height = " + d2);
          i = 1;
        }
      }
      double d1 = paramString2.outWidth;
      double d2 = paramString2.outHeight;
      if ((d1 / d2 >= 2.5D) || (d2 / d1 >= 2.5D))
      {
        i = com.tencent.mm.a.e.cm(paramString1);
        if (i < 26214400)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigStorageLogic", "canSendRawImage : true, width height ratio > %s, imgSize:[%s]", new Object[] { Double.valueOf(2.5D), Integer.valueOf(i) });
          return true;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigStorageLogic", "canSendRawImage : false, width height ratio > %s, imgSize:[%s]", new Object[] { Double.valueOf(2.5D), Integer.valueOf(i) });
        return false;
      }
    } while (paramBoolean);
    return true;
  }
  
  public static boolean gQ(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return false;
    }
    String str = GF();
    if ((str == null) || (str.length() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ConfigStorageLogic", "get userinfo fail");
      return false;
    }
    return str.equals(paramString);
  }
  
  public static boolean gT(int paramInt)
  {
    return (paramInt & 0x2000) != 0;
  }
  
  public static String getUserBindEmail()
  {
    com.tencent.mm.kernel.g.Ek();
    return bi.oV((String)com.tencent.mm.kernel.g.Ei().DT().get(5, null));
  }
  
  public static void p(Map<String, String> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localStringBuilder.append(String.format(Locale.US, "%s\n%s\n", new Object[] { localEntry.getKey(), localEntry.getValue() }));
    }
    com.tencent.mm.kernel.g.Ek();
    if (com.tencent.mm.kernel.g.Ei() != null)
    {
      com.tencent.mm.kernel.g.Ek();
      if (com.tencent.mm.kernel.g.Ei().DT() != null)
      {
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ei().DT().set(327682, localStringBuilder.toString());
      }
    }
  }
  
  public static h.b q(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      paramString = null;
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FQ().b(paramString);
      return paramString;
      paramString = new k(paramString, 2);
      continue;
      paramString = new k(paramString, 1);
    }
  }
  
  public static void q(Map<String, String> paramMap)
  {
    paramMap.clear();
    com.tencent.mm.kernel.g.Ek();
    if (com.tencent.mm.kernel.g.Ei() != null)
    {
      com.tencent.mm.kernel.g.Ek();
      if (com.tencent.mm.kernel.g.Ei().DT() != null) {}
    }
    else
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ConfigStorageLogic", "acc stg is null");
    }
    for (;;)
    {
      return;
      com.tencent.mm.kernel.g.Ek();
      Object localObject = (String)com.tencent.mm.kernel.g.Ei().DT().get(327682, null);
      if (localObject != null)
      {
        localObject = ((String)localObject).split("\n");
        if (localObject.length % 2 != 0)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ConfigStorageLogic", "key and value not match, len: " + String.valueOf(localObject.length));
          return;
        }
        int i = 0;
        while (i < localObject.length)
        {
          paramMap.put(localObject[i], localObject[(i + 1)]);
          i += 2;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */