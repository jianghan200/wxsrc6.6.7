package com.tencent.mm.modelcdntran;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.mm.a.g;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

public final class d
{
  public static int dPg = 1;
  public static int dPh = 2;
  public static int dPi = 3;
  public static int dPj = -1;
  public static int dPk = 3;
  public static int dPl = 4;
  public static int dPm = 5;
  public static int dPn = 1;
  public static int dPo = 2;
  public static int dPp = 55535;
  public static int dPq = 55534;
  public static int dPr = 55533;
  public static int dPs = 55532;
  
  public static String a(String paramString1, long paramLong, String paramString2, String paramString3)
  {
    Object localObject2 = null;
    x.d("MicroMsg.CdnUtil", "cdntra genClientId prefix[%s] createtime:%d talker[%s] suffix:[%s] stack[%s]", new Object[] { paramString1, Long.valueOf(paramLong), paramString2, paramString3, bi.cjd() });
    Object localObject1;
    if (bi.oW(ly(paramString1))) {
      localObject1 = localObject2;
    }
    do
    {
      do
      {
        do
        {
          return (String)localObject1;
          localObject1 = localObject2;
        } while (bi.oW(paramString2));
        localObject1 = localObject2;
      } while (paramLong <= 0L);
      paramString3 = bi.oV(ly(paramString3));
      paramString2 = g.u((q.GF() + "-" + paramString2).getBytes());
      paramString1 = "a" + paramString1 + "_" + paramString2.substring(0, 16) + "_" + paramLong;
      localObject1 = paramString1;
    } while (bi.oW(paramString3));
    return paramString1 + "_" + paramString3;
  }
  
  public static void b(byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (bi.bC(paramArrayOfByte)) {
      arrayOfByte = new byte[0];
    }
    paramArrayOfByte = new String(arrayOfByte);
    if (paramInt == 4) {
      x.e(paramString, paramArrayOfByte);
    }
    do
    {
      return;
      if (paramInt == 3)
      {
        x.w(paramString, paramArrayOfByte);
        return;
      }
      if (paramInt == 2)
      {
        x.i(paramString, paramArrayOfByte);
        return;
      }
      if (paramInt == 1)
      {
        x.d(paramString, paramArrayOfByte);
        return;
      }
    } while (paramInt != 0);
    x.v(paramString, paramArrayOfByte);
  }
  
  public static int bK(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null) {
        return dPg;
      }
      if (paramContext.getType() == 1) {
        return dPi;
      }
      if (paramContext.getSubtype() == 1) {
        return dPg;
      }
      if (paramContext.getSubtype() == 2) {
        return dPg;
      }
      if (paramContext.getSubtype() >= 3) {
        return dPh;
      }
      int i = dPg;
      return i;
    }
    catch (NullPointerException paramContext)
    {
      x.e("MicroMsg.CdnUtil", "exception:%s", new Object[] { bi.i(paramContext) });
    }
    return dPg;
  }
  
  public static int bL(Context paramContext)
  {
    int i = ao.getNetType(paramContext);
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (paramContext == null) {
      return dPj;
    }
    if (paramContext.getType() == 1) {
      return dPn;
    }
    if ((paramContext.getSubtype() == 1) || (paramContext.getSubtype() == 2)) {
      return dPk;
    }
    if (paramContext.getSubtype() >= 13) {
      return dPm;
    }
    if (paramContext.getSubtype() >= 3) {
      return dPl;
    }
    if (ao.isWap(i)) {
      return dPo;
    }
    return dPk;
  }
  
  public static int c(HttpURLConnection paramHttpURLConnection)
  {
    try
    {
      paramHttpURLConnection = (List)paramHttpURLConnection.getHeaderFields().get("cache-control");
      if ((paramHttpURLConnection != null) && (paramHttpURLConnection.size() != 0))
      {
        if (!bi.oW(paramHttpURLConnection.toString()))
        {
          boolean bool = paramHttpURLConnection.toString().contains("no-cache");
          if (bool) {}
        }
        else
        {
          return 0;
        }
        return -1;
      }
    }
    catch (Exception paramHttpURLConnection)
    {
      x.e("MicroMsg.CdnUtil", "exception:%s", new Object[] { bi.i(paramHttpURLConnection) });
      return -2;
    }
    return 0;
  }
  
  private static String ly(String paramString)
  {
    String str = paramString;
    int i;
    if (!bi.oW(paramString)) {
      i = 0;
    }
    for (;;)
    {
      str = paramString;
      if (i < paramString.length())
      {
        char c = paramString.charAt(i);
        if ((!bi.o(c)) && (!bi.p(c))) {
          str = null;
        }
      }
      else
      {
        return str;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/modelcdntran/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */