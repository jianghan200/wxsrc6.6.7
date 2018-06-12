package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class o
{
  private static void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, int paramInt4)
  {
    a(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramInt3, paramBoolean1, paramString4, paramBoolean2, paramString5, paramString6, paramInt4, false);
  }
  
  public static void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, int paramInt4, boolean paramBoolean3)
  {
    int i;
    if (paramBoolean2)
    {
      i = 1;
      if ((paramInt1 == 1) || (paramInt1 == 10) || (paramInt1 == 12)) {
        i = 0;
      }
      localObject2 = new Object[16];
      localObject2[0] = Integer.valueOf(paramInt1);
      localObject2[1] = Integer.valueOf(paramInt2);
      localObject2[2] = bi.aG(paramString1, "");
      localObject2[3] = bi.aG(paramString2, "");
      if (!TextUtils.isEmpty(paramString3)) {
        break label299;
      }
      localObject1 = "";
      label83:
      localObject2[4] = localObject1;
      localObject2[5] = Integer.valueOf(paramInt3);
      if (!paramBoolean1) {
        break label306;
      }
      j = 1;
      label106:
      localObject2[6] = Integer.valueOf(j);
      localObject2[7] = bi.aG(paramString4, "");
      localObject2[8] = Long.valueOf(System.currentTimeMillis());
      localObject2[9] = bSK();
      localObject2[10] = Integer.valueOf(i);
      localObject2[11] = bi.aG(paramString5, "");
      if (!TextUtils.isEmpty(paramString6)) {
        break label312;
      }
      localObject1 = "";
      label181:
      localObject2[12] = localObject1;
      localObject2[13] = Integer.valueOf(paramInt4);
      if (!zJ(paramInt2)) {
        break label319;
      }
      j = p.zP(0);
      label211:
      localObject2[14] = Integer.valueOf(j);
      if (!paramBoolean3) {
        break label328;
      }
    }
    label299:
    label306:
    label312:
    label319:
    label328:
    for (int j = 1;; j = 0)
    {
      localObject2[15] = Integer.valueOf(j);
      localObject1 = new StringBuilder();
      j = 0;
      while (j < 15)
      {
        ((StringBuilder)localObject1).append(String.valueOf(localObject2[j]).replace(',', ' ')).append(',');
        j += 1;
      }
      i = 2;
      break;
      localObject1 = paramString3;
      break label83;
      j = 0;
      break label106;
      localObject1 = paramString6;
      break label181;
      j = p.zP(1);
      break label211;
    }
    ((StringBuilder)localObject1).append(String.valueOf(localObject2[15]));
    x.i("MicroMsg.WebSearch.WebSearchActionTracer", "reporting 14904 %s ", new Object[] { ((StringBuilder)localObject1).toString() });
    Object localObject1 = f.mDy;
    Object localObject2 = bi.aG(paramString1, "");
    String str = bi.aG(paramString2, "");
    paramString1 = paramString3;
    if (TextUtils.isEmpty(paramString3)) {
      paramString1 = "";
    }
    long l;
    int k;
    if (paramBoolean1)
    {
      j = 1;
      paramString3 = bi.aG(paramString4, "");
      l = System.currentTimeMillis();
      paramString4 = bSK();
      paramString5 = bi.aG(paramString5, "");
      paramString2 = paramString6;
      if (TextUtils.isEmpty(paramString6)) {
        paramString2 = "";
      }
      if (!zJ(paramInt2)) {
        break label606;
      }
      k = p.zP(0);
      label465:
      if (!paramBoolean3) {
        break label615;
      }
    }
    label606:
    label615:
    for (int m = 1;; m = 0)
    {
      ((f)localObject1).h(14904, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), localObject2, str, paramString1, Integer.valueOf(paramInt3), Integer.valueOf(j), paramString3, Long.valueOf(l), paramString4, Integer.valueOf(i), paramString5, paramString2, Integer.valueOf(paramInt4), Integer.valueOf(k), Integer.valueOf(m) });
      return;
      j = 0;
      break;
      k = p.zP(1);
      break label465;
    }
  }
  
  public static void a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2)
  {
    a(10, paramInt1, paramString1, paramString2, "", 0, true, "", true, paramString3, "", paramInt2);
  }
  
  public static void a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean, String paramString4, String paramString5, int paramInt3, String paramString6)
  {
    a(4, paramInt1, paramString1, paramString2, paramString3, paramInt2, paramBoolean, paramString4, true, paramString5, paramString6, paramInt3);
  }
  
  public static void a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean1, String paramString4, boolean paramBoolean2, String paramString5, int paramInt3)
  {
    a(paramInt1, paramString1, paramString2, paramString3, paramInt2, paramBoolean1, paramString4, paramBoolean2, paramString5, paramInt3, "");
  }
  
  public static void a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean1, String paramString4, boolean paramBoolean2, String paramString5, int paramInt3, String paramString6)
  {
    a(7, paramInt1, paramString1, paramString2, paramString3, paramInt2, paramBoolean1, paramString4, paramBoolean2, paramString5, paramString6, paramInt3);
  }
  
  private static String bSK()
  {
    Context localContext = ad.getContext();
    if (!ao.isConnected(localContext))
    {
      x.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, not connected");
      return "fail";
    }
    int i = ao.getNetType(localContext);
    x.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, type = " + i);
    if (ao.is2G(localContext))
    {
      x.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, 2g");
      return "2g";
    }
    if (ao.is3G(localContext))
    {
      x.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, 3g");
      return "3g";
    }
    if (ao.is4G(localContext))
    {
      x.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, 4g");
      return "4g";
    }
    if (ao.isWifi(localContext))
    {
      x.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, wifi");
      return "wifi";
    }
    return "fail";
  }
  
  private static boolean zJ(int paramInt)
  {
    return paramInt != 21;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */