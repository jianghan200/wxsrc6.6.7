package com.tencent.mm.plugin.game.model;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class an
{
  private static String fMk = null;
  private static String jOh = "";
  
  public static String D(Map<String, String> paramMap)
  {
    if (paramMap.size() == 0) {
      return "";
    }
    JSONObject localJSONObject = new JSONObject();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      try
      {
        localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
      }
      catch (Exception paramMap)
      {
        x.e("MicroMsg.GameReportUtil", paramMap.getMessage());
        return "";
      }
    }
    try
    {
      paramMap = URLEncoder.encode(localJSONObject.toString(), "UTF-8");
      return paramMap;
    }
    catch (Exception paramMap)
    {
      x.e("MicroMsg.GameReportUtil", paramMap.getMessage());
    }
    return "";
  }
  
  public static String Dx(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    try
    {
      paramString = URLEncoder.encode(paramString, "UTF-8");
      return paramString;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.GameReportUtil", paramString.getMessage());
    }
    return "";
  }
  
  public static void Dy(String paramString)
  {
    jOh = paramString;
  }
  
  public static void P(String paramString1, String paramString2, String paramString3)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)))
    {
      x.e("MicroMsg.GameReportUtil", "null open or null username");
      return;
    }
    h.mEJ.h(10738, new Object[] { paramString1, paramString2, paramString1, paramString3 });
  }
  
  public static String Q(String paramString1, String paramString2, String paramString3)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(paramString2, paramString3);
      paramString2 = localJSONObject;
    }
    catch (Exception paramString2)
    {
      for (;;)
      {
        x.e("MicroMsg.GameReportUtil", paramString2.getMessage());
        paramString2 = null;
      }
    }
    paramString3 = paramString1;
    if (paramString2 != null) {
      paramString3 = db(paramString1, paramString2.toString());
    }
    return Dx(paramString3);
  }
  
  public static void T(String paramString, int paramInt1, int paramInt2)
  {
    x.d("MicroMsg.GameReportUtil", "reportGameDetail, appId = " + paramString + ", scene = " + paramInt1);
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.GameReportUtil", "reportGameDetail fail, appId is null");
      return;
    }
    h.mEJ.h(10700, new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, long paramLong1, String paramString1, String paramString2, long paramLong2, long paramLong3)
  {
    paramString1 = am.a.g(14683, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(paramLong1), paramString1, null, paramString2, Long.valueOf(paramLong2), Long.valueOf(paramLong3), null });
    ((b)com.tencent.mm.kernel.g.l(b.class)).aSg().a(paramString1);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
  {
    a(paramContext, paramInt1, paramInt2, paramInt3, paramInt4, 0, null, paramInt5, 0, null, null, paramString);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString1, int paramInt6, int paramInt7, String paramString2, String paramString3, String paramString4)
  {
    paramContext = am.a.g(12909, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), paramString1, Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), paramString2, Integer.valueOf(bi.getInt(paramString3, 0)), Integer.valueOf(getNetworkType(paramContext)), paramString4 });
    ((b)com.tencent.mm.kernel.g.l(b.class)).aSg().a(paramContext);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, int paramInt5, String paramString2)
  {
    a(paramContext, paramInt1, paramInt2, paramInt3, paramInt4, 0, paramString1, paramInt5, 0, null, null, paramString2);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, int paramInt5, String paramString2, String paramString3)
  {
    a(paramContext, paramInt1, paramInt2, paramInt3, paramInt4, 0, paramString1, paramInt5, 0, null, paramString2, paramString3);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    paramContext = am.a.g(12909, new Object[] { Integer.valueOf(18), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(2), Integer.valueOf(0), null, Integer.valueOf(paramInt3), Integer.valueOf(0), null, Integer.valueOf(0), Integer.valueOf(getNetworkType(paramContext)), paramString });
    GameCrossProcessReportReceiver.H(paramContext.eiF, paramContext.jOg);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString1, int paramInt4, String paramString2)
  {
    x.i("MicroMsg.GameReportUtil", "reportExposureInfo : " + paramInt1 + " , " + paramInt2 + " , " + paramInt3 + " , 1 , 0 , " + bi.oV(paramString1) + " , " + paramInt4 + " , 0 , " + bi.oV(null) + " , " + bi.oV(null) + " , " + bi.oV(paramString2));
    h.mEJ.h(13384, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(1), Integer.valueOf(0), paramString1, Integer.valueOf(paramInt4), Integer.valueOf(0), null, Integer.valueOf(bi.getInt(null, 0)), Integer.valueOf(getNetworkType(paramContext)), paramString2 });
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, long paramLong, String paramString5)
  {
    x.d("MicroMsg.GameReportUtil", "reportMsgClick 10531, appId = %s, pkgName = %s, msgSvrId:%d, snsOgjId:%s", new Object[] { paramString1, paramString2, Long.valueOf(paramLong), paramString5 });
    if (bi.oW(paramString1))
    {
      x.e("MicroMsg.GameReportUtil", "reportMsgClick fail, appId is null");
      return;
    }
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    paramContext = com.tencent.mm.pluginsdk.model.app.g.bl(paramString1, false);
    if (paramContext == null)
    {
      x.e("MicroMsg.GameReportUtil", "reportMsgClick fail, appinfo is null");
      return;
    }
    ((b)com.tencent.mm.kernel.g.l(b.class)).aSg().a(am.a.g(10531, new Object[] { paramString1, Integer.valueOf(al(localContext, paramString2)), aUA(), paramString3, Integer.valueOf(paramInt1), paramString4, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(getNetworkType(localContext)), bi.oV(paramContext.field_packageName), bi.oV(paramContext.field_signature), Long.toString(paramLong), "", paramString5 }));
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2)
  {
    x.d("MicroMsg.GameReportUtil", "reportMsgClick, appId = " + paramString1 + ", pkgName = " + paramString2);
    if (bi.oW(paramString1))
    {
      x.e("MicroMsg.GameReportUtil", "reportDelGameMsg fail, appId is null");
      return;
    }
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    paramContext = am.a.g(10583, new Object[] { paramString1, Integer.valueOf(al(localContext, paramString2)), aUA(), paramString3, Integer.valueOf(paramInt1), paramString4, Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(getNetworkType(localContext)) });
    ((b)com.tencent.mm.kernel.g.l(b.class)).aSg().a(paramContext);
  }
  
  public static void a(String paramString1, int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, String paramString2, int paramInt3, int paramInt4, String paramString3, long paramLong4, int paramInt5, long paramLong5, String paramString4)
  {
    x.i("MicroMsg.GameReportUtil", "reportGameDownloadState, appId = %s, scene = %d, opId = %d, startSize = %d, downloadedSize = %d, totalSize = %d, downloadUrl = %s, errCode = %d, downloaderType = %d, chanelId = %s, costTime = %d, startState = %d, downloadId = %d", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3), paramString2, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString3, Long.valueOf(paramLong4), Integer.valueOf(paramInt5), Long.valueOf(paramLong5) });
    switch (paramInt3)
    {
    }
    for (;;)
    {
      am.a locala = am.a.g(14567, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong2), Long.valueOf(paramLong3), Dx(paramString2), Integer.valueOf(getNetworkType(ad.getContext())), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString3, Long.valueOf(paramLong4), Integer.valueOf(paramInt5), Long.valueOf(paramLong5), paramString4, aUB(), Long.valueOf(paramLong1) });
      ((b)com.tencent.mm.kernel.g.l(b.class)).aSg().a(locala);
      h.mEJ.h(15015, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong2), Long.valueOf(paramLong3), Dx(paramString2), Integer.valueOf(getNetworkType(ad.getContext())), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString3, Long.valueOf(paramLong4), Integer.valueOf(paramInt5), Long.valueOf(paramLong5), paramString4 });
      return;
      h.mEJ.a(860L, 10L, 1L, false);
      continue;
      h.mEJ.a(860L, 11L, 1L, false);
      continue;
      h.mEJ.a(860L, 12L, 1L, false);
      continue;
      h.mEJ.a(860L, 13L, 1L, false);
      continue;
      h.mEJ.a(860L, 14L, 1L, false);
      continue;
      h.mEJ.a(860L, 15L, 1L, false);
    }
  }
  
  public static void a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2)
  {
    a(paramString1, paramInt1, paramInt2, 0L, 0L, 0L, "", 0, 0, paramString2, 0L, 0, paramLong, null);
  }
  
  public static void a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    long l = System.currentTimeMillis();
    paramString1 = am.a.g(10737, new Object[] { Long.valueOf(l), Long.valueOf(l), Integer.valueOf(1), paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(0), paramString2, "", paramString3, Integer.valueOf(getNetworkType(ad.getContext())), Integer.valueOf(0), Integer.valueOf(1), paramString4, paramString5 });
    ((b)com.tencent.mm.kernel.g.l(b.class)).aSg().a(paramString1);
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, int paramInt3)
  {
    x.d("MicroMsg.GameReportUtil", "rejectGameMsg, fromUserName = " + paramString1 + ", appId = " + paramString2 + ", msgType = " + paramInt1 + ", scene = " + paramInt2 + ", actionName = " + paramString3);
    if (bi.oW(paramString2))
    {
      x.e("MicroMsg.GameReportUtil", "rejectGameMsg fail, appId is null");
      return;
    }
    h.mEJ.h(10546, new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), aUA(), Integer.valueOf(paramInt2), paramString3, Integer.valueOf(paramInt3) });
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, long paramLong)
  {
    x.d("MicroMsg.GameReportUtil", "reportReadMsg, appId = " + paramString1);
    if (bi.oW(paramString1))
    {
      x.e("MicroMsg.GameReportUtil", "reportReadMsg fail, appId is null");
      return;
    }
    String str = new BigInteger("00FFFFFFFFFFFFFFFF", 16).and(BigInteger.valueOf(paramLong)).toString();
    x.d("MicroMsg.GameReportUtil", "reportReadMsg, unsignedlonglong = " + str);
    h.mEJ.h(10532, new Object[] { paramString1, str, paramString2, Integer.valueOf(paramInt1), paramString3, Integer.valueOf(paramInt2) });
  }
  
  private static String aUA()
  {
    if (fMk == null)
    {
      String str = q.zz();
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      while (i < str.length() - 1)
      {
        localStringBuilder.append(Integer.toHexString(str.charAt(i)));
        i += 1;
      }
      localStringBuilder.append("00");
      fMk = localStringBuilder.toString();
    }
    return fMk;
  }
  
  private static String aUB()
  {
    String str1 = q.zy();
    String str2 = q.zB();
    String str3 = zG();
    String str4 = q.zJ();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("IMEI", str1);
      localJSONObject.put("MAC_ADDRESS", str2);
      localJSONObject.put("BLUETOOTH_ADDRESS", str3);
      localJSONObject.put("IMSI", str4);
      return Dx(localJSONObject.toString());
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        x.e("MicroMsg.GameReportUtil", "getDeviceInfo: " + localJSONException.getMessage());
      }
    }
  }
  
  private static int al(Context paramContext, String paramString)
  {
    paramContext = p.getPackageInfo(paramContext, paramString);
    if (paramContext == null) {
      return 0;
    }
    return paramContext.versionCode;
  }
  
  public static void ao(int paramInt, String paramString)
  {
    am.a locala = new am.a();
    locala.eiF = paramInt;
    locala.jOg = paramString;
    ((b)com.tencent.mm.kernel.g.l(b.class)).aSg().a(locala);
  }
  
  public static String da(String paramString1, String paramString2)
  {
    if (paramString2 == null) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("function_type", paramString1);
      localJSONObject.put("function_value", paramString2);
      return Dx(localJSONObject.toString());
    }
    catch (JSONException paramString1)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.GameReportUtil", paramString1, "", new Object[0]);
      }
    }
  }
  
  private static String db(String paramString1, String paramString2)
  {
    if (bi.oW(paramString1)) {
      return paramString2;
    }
    Iterator localIterator = null;
    try
    {
      paramString1 = new JSONObject(paramString1);
      try
      {
        paramString2 = new JSONObject(paramString2);
        if (paramString1 != null)
        {
          localIterator = paramString1.keys();
          for (;;)
          {
            if (localIterator.hasNext()) {
              try
              {
                String str = (String)localIterator.next();
                paramString2.put(str, paramString1.opt(str));
              }
              catch (Exception paramString1)
              {
                return "";
              }
            }
          }
        }
        return paramString2.toString();
      }
      catch (JSONException paramString1)
      {
        return "";
      }
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        paramString1 = localIterator;
      }
    }
  }
  
  public static int getNetworkType(Context paramContext)
  {
    if (ao.is3G(paramContext)) {
      return 4;
    }
    if (ao.is4G(paramContext)) {
      return 5;
    }
    switch (ao.getNetType(paramContext))
    {
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    default: 
      return 6;
    case -1: 
      return 255;
    case 0: 
      return 1;
    case 5: 
      return 2;
    }
    return 3;
  }
  
  public static void q(Context paramContext, String paramString1, String paramString2)
  {
    x.d("MicroMsg.GameReportUtil", "reportRegToWx, appId = " + paramString1 + ", pkgName = " + paramString2);
    if (bi.oW(paramString1))
    {
      x.e("MicroMsg.GameReportUtil", "reportRegToWx fail, appId is null");
      return;
    }
    h.mEJ.h(10534, new Object[] { paramString1, Integer.valueOf(al(paramContext, paramString2)), aUA(), Long.valueOf(System.currentTimeMillis() / 1000L) });
  }
  
  private static String zG()
  {
    try
    {
      String str = bi.oV(BluetoothAdapter.getDefaultAdapter().getAddress());
      return str;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.GameReportUtil", "getBlueToothAddress failed: %s", new Object[] { bi.i(localException) });
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/model/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */