package com.tencent.mm.plugin.report.b;

import com.tencent.b.a.a.i;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;

public final class d
{
  private static i mDM = i.aF(ad.getContext());
  private static int mDN = 2;
  
  /* Error */
  public static void KE(String paramString)
  {
    // Byte code:
    //   0: getstatic 24	com/tencent/mm/plugin/report/b/d:mDM	Lcom/tencent/b/a/a/i;
    //   3: astore_1
    //   4: getstatic 35	com/tencent/b/a/a/i:mContext	Landroid/content/Context;
    //   7: ifnull +68 -> 75
    //   10: invokestatic 41	java/lang/System:currentTimeMillis	()J
    //   13: putstatic 45	com/tencent/b/a/a/i:bvB	J
    //   16: ldc2_w 46
    //   19: putstatic 52	com/tencent/b/a/a/n:bvM	J
    //   22: getstatic 35	com/tencent/b/a/a/i:mContext	Landroid/content/Context;
    //   25: invokestatic 58	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   28: invokeinterface 64 1 0
    //   33: astore_2
    //   34: aload_2
    //   35: ldc 66
    //   37: getstatic 45	com/tencent/b/a/a/i:bvB	J
    //   40: invokeinterface 72 4 0
    //   45: pop
    //   46: aload_2
    //   47: invokeinterface 76 1 0
    //   52: pop
    //   53: getstatic 80	com/tencent/b/a/a/i:mHandler	Landroid/os/Handler;
    //   56: ifnull +19 -> 75
    //   59: getstatic 80	com/tencent/b/a/a/i:mHandler	Landroid/os/Handler;
    //   62: new 82	com/tencent/b/a/a/i$1
    //   65: dup
    //   66: aload_1
    //   67: aload_0
    //   68: invokespecial 86	com/tencent/b/a/a/i$1:<init>	(Lcom/tencent/b/a/a/i;Ljava/lang/String;)V
    //   71: invokevirtual 92	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   74: pop
    //   75: ldc 94
    //   77: ldc 96
    //   79: iconst_1
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: getstatic 24	com/tencent/mm/plugin/report/b/d:mDM	Lcom/tencent/b/a/a/i;
    //   88: invokevirtual 100	com/tencent/b/a/a/i:tP	()Ljava/lang/String;
    //   91: aastore
    //   92: invokestatic 106	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: return
    //   96: astore_0
    //   97: ldc 94
    //   99: ldc 108
    //   101: iconst_1
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: aload_0
    //   108: invokestatic 113	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   111: aastore
    //   112: invokestatic 116	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: return
    //   116: astore_2
    //   117: goto -64 -> 53
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	paramString	String
    //   3	64	1	locali	i
    //   33	14	2	localEditor	android.content.SharedPreferences.Editor
    //   116	1	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	22	96	java/lang/Exception
    //   53	75	96	java/lang/Exception
    //   75	95	96	java/lang/Exception
    //   22	53	116	java/lang/Exception
  }
  
  public static String brJ()
  {
    try
    {
      i.a(new d.1());
      String str = mDM.tO();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MidHelper", "QueryMid try Get Now getMid:%s getLocalMid:%s", new Object[] { str, mDM.tP() });
      return str;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MidHelper", "QueryMid Error e:%s", new Object[] { bi.i(localException) });
    }
    return "";
  }
  
  public static int n(int paramInt1, int paramInt2, String paramString)
  {
    int i = 0;
    if (!g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MidHelper", "checkReportMid acc not ready");
      i = -1;
    }
    long l;
    do
    {
      return i;
      l = bi.VE();
    } while ((paramInt1 == 3) && (bi.a((Long)g.Ei().DT().get(331778, null), 0L) >= l));
    if (ao.is2G(ad.getContext())) {
      i = 1;
    }
    for (;;)
    {
      String str = brJ();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MidHelper", "querymid checkReportMid moment:%d mid[%s]", new Object[] { Integer.valueOf(paramInt1), str });
      f.mDy.h(11402, new Object[] { str, Integer.valueOf(paramInt1), Integer.valueOf(i), q.zz(), Integer.valueOf(paramInt2), paramString, ao.getISPName(ad.getContext()), Integer.valueOf(0), q.getDeviceID(ad.getContext()) });
      g.Ei().DT().set(331778, Long.valueOf(259200L + l));
      return 0;
      if (ao.isWifi(ad.getContext())) {
        i = 3;
      } else if (ao.is3G(ad.getContext())) {
        i = 2;
      } else {
        i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */