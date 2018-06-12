package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
{
  private static long pGz = -1L;
  
  public static void H(long paramLong1, long paramLong2)
  {
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    if (localx != null)
    {
      com.tencent.mm.plugin.walletlock.gesture.a.g localg = new com.tencent.mm.plugin.walletlock.gesture.a.g();
      localg.pGZ = paramLong1;
      localg.pHa = paramLong2;
      localx.a(aa.a.sYE, com.tencent.mm.plugin.walletlock.gesture.a.e.aY(localg.toByteArray()));
      localx.lm(true);
    }
  }
  
  private static JSONArray PF(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = new JSONArray(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FingerprintInfoStorage", paramString, "", new Object[0]);
    }
    return null;
  }
  
  public static boolean PG(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerprintInfoStorage", "alvinluo add fid to local: %s", new Object[] { paramString });
    try
    {
      Object localObject2 = PF(bRr());
      HashSet localHashSet = y((JSONArray)localObject2);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FingerprintInfoStorage", "alvinluo list is null");
        localObject1 = new JSONArray();
      }
      localObject2 = localHashSet;
      if (localHashSet == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FingerprintInfoStorage", "alvinluo fidSet is null");
        localObject2 = new HashSet();
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerprintInfoStorage", "alvinluo fidList: %s before add fid", new Object[] { ((JSONArray)localObject1).toString() });
      if (!((HashSet)localObject2).contains(paramString))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FingerprintInfoStorage", "alvinluo fidSet contains fid %s: %b", new Object[] { paramString, Boolean.valueOf(false) });
        localObject2 = new JSONObject();
        ((JSONObject)localObject2).put("fid", paramString);
        ((JSONArray)localObject1).put(localObject2);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerprintInfoStorage", "alvinluo list: %s", new Object[] { ((JSONArray)localObject1).toString() });
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sYB, ((JSONArray)localObject1).toString());
        com.tencent.mm.kernel.g.Ei().DT().lm(true);
        return true;
      }
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FingerprintInfoStorage", paramString, "", new Object[0]);
    }
    return false;
  }
  
  public static boolean PH(String paramString)
  {
    Object localObject = bRr();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerprintInfoStorage", "alvinluo fid: %s, fidInfoList: %s", new Object[] { paramString, localObject });
    localObject = y(PF((String)localObject));
    return (localObject != null) && (((HashSet)localObject).contains(paramString));
  }
  
  private static String bRr()
  {
    return (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYB, null);
  }
  
  public static void bRs()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerprintInfoStorage", "alvinluo clear local fids, stack: %s", new Object[] { bi.cjd() });
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sYB, null);
    com.tencent.mm.kernel.g.Ei().DT().lm(true);
  }
  
  public static boolean bRt()
  {
    return ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYA, Boolean.valueOf(false))).booleanValue();
  }
  
  public static boolean bRu()
  {
    Object localObject = com.tencent.mm.kernel.g.Ei().DT();
    if (localObject == null) {
      localObject = new com.tencent.mm.plugin.walletlock.gesture.a.g();
    }
    while (((com.tencent.mm.plugin.walletlock.gesture.a.g)localObject).pGZ != -1L)
    {
      com.tencent.mm.plugin.walletlock.gesture.a.e.a((com.tencent.mm.plugin.walletlock.gesture.a.g)localObject);
      if (((com.tencent.mm.plugin.walletlock.gesture.a.g)localObject).pHa / 1000L < 30L)
      {
        H(((com.tencent.mm.plugin.walletlock.gesture.a.g)localObject).pGZ, ((com.tencent.mm.plugin.walletlock.gesture.a.g)localObject).pHa);
        return true;
        localObject = (String)((com.tencent.mm.storage.x)localObject).get(aa.a.sYE, null);
        if (localObject == null) {
          localObject = new com.tencent.mm.plugin.walletlock.gesture.a.g();
        } else {
          localObject = new com.tencent.mm.plugin.walletlock.gesture.a.g().aZ(com.tencent.mm.plugin.walletlock.gesture.a.e.PI((String)localObject));
        }
      }
      else
      {
        localObject = com.tencent.mm.kernel.g.Ei().DT();
        if (localObject != null)
        {
          ((com.tencent.mm.storage.x)localObject).a(aa.a.sYE, null);
          ((com.tencent.mm.storage.x)localObject).lm(true);
        }
        return false;
      }
    }
    return false;
  }
  
  public static void bRv()
  {
    pGz = -1L;
  }
  
  public static long bRw()
  {
    return pGz;
  }
  
  public static void fy(long paramLong)
  {
    pGz = paramLong;
  }
  
  public static void jG(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerprintInfoStorage", "alvinluo set fingerprint lock status isOpened: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sYA, Boolean.valueOf(paramBoolean));
    com.tencent.mm.kernel.g.Ei().DT().lm(true);
  }
  
  private static HashSet<String> y(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {
      return null;
    }
    try
    {
      HashSet localHashSet = new HashSet();
      int i = 0;
      while (i < paramJSONArray.length())
      {
        localHashSet.add(paramJSONArray.getJSONObject(i).getString("fid"));
        i += 1;
      }
      return localHashSet;
    }
    catch (Exception paramJSONArray)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FingerprintInfoStorage", paramJSONArray, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/walletlock/fingerprint/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */