package com.tencent.mm.plugin.appbrand.config;

import android.content.ContentValues;
import android.os.HandlerThread;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.a.kz;
import com.tencent.mm.plugin.appbrand.appusage.k;
import com.tencent.mm.plugin.appbrand.appusage.l;
import com.tencent.mm.protocal.c.dh;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.d;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class q
  extends j
{
  private static volatile q frF;
  
  public static k a(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    WxaAttributes localWxaAttributes = com.tencent.mm.plugin.appbrand.app.e.aba().e(paramString2, new String[] { "appId", "nickname", "brandIconURL", "appInfo" });
    String str3 = String.valueOf(paramString1);
    String str1;
    label56:
    String str2;
    if (localWxaAttributes == null)
    {
      paramString1 = "";
      if (localWxaAttributes != null) {
        break label117;
      }
      str1 = "";
      if (localWxaAttributes != null) {
        break label127;
      }
      str2 = "";
      label65:
      if (localWxaAttributes != null) {
        break label137;
      }
    }
    label117:
    label127:
    label137:
    for (int i = 0;; i = localWxaAttributes.aej().dCn)
    {
      return new k(str3, paramString2, paramString1, str1, str2, i, paramInt, com.tencent.mm.plugin.appbrand.app.e.aba().rS(paramString2), com.tencent.mm.plugin.appbrand.app.e.abh().aq(paramString2, paramInt), paramLong);
      paramString1 = localWxaAttributes.field_appId;
      break;
      str1 = localWxaAttributes.field_nickname;
      break label56;
      str2 = localWxaAttributes.field_brandIconURL;
      break label65;
    }
  }
  
  public static q aei()
  {
    if (frF == null) {}
    try
    {
      if (frF == null) {
        frF = new q();
      }
      return frF;
    }
    finally {}
  }
  
  public static boolean h(String paramString, int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    Object localObject1 = com.tencent.mm.plugin.appbrand.app.e.aba();
    if (bi.oW(paramString)) {
      return false;
    }
    Object localObject2 = ((p)localObject1).e(paramString, new String[] { "appOpt" });
    if (localObject2 == null) {
      return false;
    }
    int i = ((WxaAttributes)localObject2).field_appOpt;
    if (!paramBoolean) {}
    for (paramInt = i & (paramInt ^ 0xFFFFFFFF);; paramInt = i | paramInt)
    {
      localObject2 = new ContentValues(1);
      ((ContentValues)localObject2).put("appOpt", Integer.valueOf(paramInt));
      paramBoolean = bool;
      if (((p)localObject1).dCZ.update("WxaAttributesTable", (ContentValues)localObject2, String.format("%s=?", new Object[] { "username" }), new String[] { paramString }) > 0) {
        paramBoolean = true;
      }
      if (paramBoolean)
      {
        localObject1 = new kz();
        ((kz)localObject1).bVk.bGy = paramString;
        ((kz)localObject1).bVk.bVl = paramInt;
        com.tencent.mm.sdk.b.a.sFg.m((b)localObject1);
      }
      return paramBoolean;
    }
  }
  
  public static long rS(String paramString)
  {
    return com.tencent.mm.plugin.appbrand.app.e.aba().rS(paramString);
  }
  
  public static t rT(String paramString)
  {
    if ((bi.oW(paramString)) || (!com.tencent.mm.kernel.g.Eg().Dx())) {}
    WxaAttributes localWxaAttributes;
    do
    {
      return null;
      localWxaAttributes = com.tencent.mm.plugin.appbrand.app.e.aba().e(paramString, new String[] { "appId", "nickname", "signature", "brandIconURL", "dynamicInfo", "versionInfo", "appInfo", "registerSource", "bindWxaInfo" });
    } while (localWxaAttributes == null);
    t localt = new t();
    localt.username = paramString;
    localt.appId = localWxaAttributes.field_appId;
    localt.nickname = localWxaAttributes.field_nickname;
    localt.signature = localWxaAttributes.field_signature;
    localt.fsq = localWxaAttributes.field_brandIconURL;
    localt.fsc = localWxaAttributes.aek().fsc;
    int i;
    if (localWxaAttributes.ael() == null)
    {
      i = -1;
      localt.fsi = i;
      localt.frQ = localWxaAttributes.aem();
      localt.bGM = localWxaAttributes.aej().dCn;
    }
    for (;;)
    {
      try
      {
        if (!bi.oW(localWxaAttributes.field_registerSource)) {
          continue;
        }
        paramString = "";
        localt.dLS = paramString;
      }
      catch (Exception paramString)
      {
        continue;
      }
      return localt;
      i = localWxaAttributes.ael().fsi;
      break;
      paramString = new JSONObject(localWxaAttributes.field_registerSource).optString("RegisterBody", "");
    }
  }
  
  public static AppBrandSysConfig rU(String paramString)
  {
    Object localObject = null;
    boolean bool2 = false;
    WxaAttributes localWxaAttributes = com.tencent.mm.plugin.appbrand.app.e.aba().f(paramString, new String[0]);
    paramString = (String)localObject;
    if (localWxaAttributes != null)
    {
      if (localWxaAttributes == null) {
        break label620;
      }
      paramString = new AppBrandSysConfig();
      paramString.bGy = localWxaAttributes.field_username;
      paramString.bKC = localWxaAttributes.field_nickname;
      paramString.fqJ = localWxaAttributes.field_brandIconURL;
      paramString.appId = localWxaAttributes.field_appId;
      paramString.fqK = localWxaAttributes.aej().dzQ;
      paramString.fqR = localWxaAttributes.aek().fsb.fqR;
      paramString.fqS = localWxaAttributes.aek().fsb.fqS;
      paramString.fqV = localWxaAttributes.aek().fsb.fqV;
      paramString.fqW = localWxaAttributes.aek().fsb.fqW;
      paramString.fqX = localWxaAttributes.aek().fsb.fqX;
      paramString.fqY = localWxaAttributes.aek().fsb.fqY;
      paramString.fqU = localWxaAttributes.aek().fsb.fqU;
      paramString.fqT = localWxaAttributes.aek().fsb.fqT;
      paramString.fqZ = localWxaAttributes.aek().fsb.fsf;
      paramString.fra = localWxaAttributes.aek().fsb.fsg;
      paramString.frd = ((ArrayList)com.tencent.mm.plugin.appbrand.q.e.d(new ArrayList(), localWxaAttributes.aej().frU));
      paramString.fre = ((ArrayList)com.tencent.mm.plugin.appbrand.q.e.d(new ArrayList(), localWxaAttributes.aej().frV));
      paramString.frg = ((ArrayList)com.tencent.mm.plugin.appbrand.q.e.d(new ArrayList(), localWxaAttributes.aej().frX));
      paramString.frf = ((ArrayList)com.tencent.mm.plugin.appbrand.q.e.d(new ArrayList(), localWxaAttributes.aej().frW));
      paramString.fro = new dh();
      paramString.fro.rdx = localWxaAttributes.aej().fmc;
      paramString.fro.rdE = localWxaAttributes.aej().frS;
      paramString.frh = localWxaAttributes.aek().fsb.frh;
      paramString.fri = localWxaAttributes.aek().fsb.fri;
      paramString.frj = localWxaAttributes.aek().fsb.frj;
      paramString.frk = localWxaAttributes.aek().fsb.frk;
      paramString.frl = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getInt("ClientBenchmarkLevel", -1);
    }
    for (;;)
    {
      if (paramString != null)
      {
        localObject = paramString.appId;
        if ((!bi.oW((String)localObject)) && (com.tencent.mm.plugin.appbrand.app.e.abf() != null)) {
          break label584;
        }
      }
      label584:
      for (boolean bool1 = false;; bool1 = Boolean.parseBoolean(com.tencent.mm.plugin.appbrand.app.e.abf().get((String)localObject + "_AppDebugEnabled", "false")))
      {
        paramString.fqL = bool1;
        localObject = com.tencent.mm.model.c.c.Jx().fJ("100216");
        bool1 = bool2;
        if (((com.tencent.mm.storage.c)localObject).isValid())
        {
          bool1 = bool2;
          if ("1".equals(((com.tencent.mm.storage.c)localObject).ckq().get("isOpenJSCore"))) {
            bool1 = true;
          }
        }
        paramString.frb = bool1;
        paramString.fqM = "1".equals(com.tencent.mm.plugin.appbrand.app.e.abf().get(paramString.appId + "_PerformancePanelEnabled", "0"));
        return paramString;
      }
      label620:
      paramString = null;
    }
  }
  
  public static String[] rV(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return null;
      paramString = com.tencent.mm.plugin.appbrand.app.e.aba().e(paramString, new String[] { "roundedSquareIconURL", "bigHeadURL" });
    } while (paramString == null);
    return new String[] { paramString.field_roundedSquareIconURL, paramString.field_bigHeadURL };
  }
  
  public static String rW(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return null;
      paramString = com.tencent.mm.plugin.appbrand.app.e.aba().e(paramString, new String[] { "appId" });
    } while (paramString == null);
    return paramString.field_appId;
  }
  
  public static String rX(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return null;
      paramString = com.tencent.mm.plugin.appbrand.app.e.aba().f(paramString, new String[] { "nickname" });
    } while (paramString == null);
    return paramString.field_nickname;
  }
  
  public static String rY(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return null;
      paramString = com.tencent.mm.plugin.appbrand.app.e.aba().f(paramString, new String[] { "username" });
    } while (paramString == null);
    return paramString.field_username;
  }
  
  public static void rZ(String paramString)
  {
    if (bi.oW(paramString)) {}
    p localp;
    do
    {
      return;
      localp = com.tencent.mm.plugin.appbrand.app.e.aba();
    } while (bi.oW(paramString));
    ContentValues localContentValues = new ContentValues(2);
    localContentValues.put("syncVersion", "");
    localContentValues.put("syncTimeSecond", Long.valueOf(0L));
    localp.dCZ.update("WxaAttributesTable", localContentValues, String.format(Locale.US, "%s=?", new Object[] { "username" }), new String[] { paramString });
  }
  
  public static void release()
  {
    try
    {
      frF = null;
      return;
    }
    finally {}
  }
  
  public static void sa(String paramString)
  {
    if (bi.oW(paramString)) {
      return;
    }
    WxaAttributes localWxaAttributes = new WxaAttributes();
    localWxaAttributes.field_username = paramString;
    com.tencent.mm.plugin.appbrand.app.e.aba().a(localWxaAttributes, new String[] { "username" });
  }
  
  public final void b(String paramString, int paramInt, Object paramObject)
  {
    super.b(paramString, paramInt, paramObject);
    ((com.tencent.mm.plugin.appbrand.appusage.g)com.tencent.mm.plugin.appbrand.app.e.x(com.tencent.mm.plugin.appbrand.appusage.g.class)).b(paramString, paramInt, paramObject);
  }
  
  public final void c(j.a parama)
  {
    super.a(parama, com.tencent.mm.plugin.appbrand.r.c.Em().lnJ.getLooper());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */