package com.tencent.mm.plugin.appbrand.launching.a;

import com.tencent.mm.ab.a.a;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.appbrand.appcache.u;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.protocal.c.aqk;
import com.tencent.mm.protocal.c.aql;
import com.tencent.mm.protocal.c.cgg;
import com.tencent.mm.protocal.c.chd;
import com.tencent.mm.protocal.c.chh;
import com.tencent.mm.protocal.c.chx;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.g.c.a;

public final class a
  extends com.tencent.mm.ab.a<aql>
{
  final b diG;
  final String fdE;
  public volatile com.tencent.mm.plugin.appbrand.launching.t ggV;
  public volatile boolean ggm = false;
  
  public a(String paramString1, cgg paramcgg, String paramString2, int paramInt)
  {
    this(paramString1, false, paramcgg, null, null, paramString2, paramInt);
  }
  
  public a(String paramString1, boolean paramBoolean, cgg paramcgg, chx paramchx, chh paramchh, String paramString2, int paramInt)
  {
    this.fdE = paramString2;
    paramString2 = new aqk();
    paramString2.jQb = paramString1;
    paramString2.rSN = paramcgg;
    int i;
    if (paramBoolean) {
      i = 1;
    }
    for (;;)
    {
      paramString2.rKO = i;
      paramString2.rSQ = paramchx;
      paramString2.rSR = paramchh;
      paramString1 = new chd();
      paramString1.rUD = paramInt;
      if (paramInt > 0)
      {
        paramcgg = com.tencent.mm.plugin.appbrand.app.e.abn();
        if (paramcgg != null)
        {
          paramchx = new com.tencent.mm.plugin.appbrand.appcache.t();
          paramchx.field_key = "@LibraryAppId";
          paramchx.field_version = paramInt;
          if (paramcgg.b(paramchx, new String[] { "key", "version" }))
          {
            paramString1.rca = ((int)paramchx.field_updateTime);
            paramString1.sBh = paramchx.field_scene;
          }
        }
      }
      paramString2.rSP = paramString1;
      try
      {
        if (q.deU.dbw) {
          x.i("MicroMsg.AppBrand.CgiLaunchWxaApp", "DeviceInfo isLimit benchmarkLevel");
        }
        for (paramString2.rST = -2;; paramString2.rST = g.AT().getInt("ClientBenchmarkLevel", 0))
        {
          paramString1 = new b.a();
          paramString1.dIF = 1122;
          paramString1.uri = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
          paramString1.dIG = paramString2;
          paramString1.dIH = new aql();
          paramString1 = paramString1.KT();
          this.diG = paramString1;
          this.diG = paramString1;
          return;
          i = 2;
          break;
        }
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.AppBrand.CgiLaunchWxaApp", paramString1, "read performanceLevel", new Object[0]);
        }
      }
    }
  }
  
  private int aan()
  {
    return ((aqk)this.diG.dID.dIL).rSN.otY;
  }
  
  private int akO()
  {
    return ((aqk)this.diG.dID.dIL).rSN.rRb;
  }
  
  private boolean akP()
  {
    return ((aqk)this.diG.dID.dIL).rSN.rUB > 0;
  }
  
  private aqk akQ()
  {
    return (aqk)this.diG.dID.dIL;
  }
  
  private String getAppId()
  {
    return ((aqk)this.diG.dID.dIL).jQb;
  }
  
  /* Error */
  public final com.tencent.mm.by.f<a.a<aql>> KM()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc -41
    //   4: invokestatic 219	com/tencent/mm/plugin/appbrand/app/e:x	(Ljava/lang/Class;)Ljava/lang/Object;
    //   7: checkcast 215	com/tencent/mm/plugin/appbrand/appcache/a/d/e
    //   10: aload_0
    //   11: invokespecial 221	com/tencent/mm/plugin/appbrand/launching/a/a:getAppId	()Ljava/lang/String;
    //   14: aload_0
    //   15: invokespecial 223	com/tencent/mm/plugin/appbrand/launching/a/a:aan	()I
    //   18: invokevirtual 227	com/tencent/mm/plugin/appbrand/appcache/a/d/e:am	(Ljava/lang/String;I)Landroid/util/Pair;
    //   21: astore_2
    //   22: aload_2
    //   23: getfield 233	android/util/Pair:first	Ljava/lang/Object;
    //   26: ifnull +68 -> 94
    //   29: ldc 119
    //   31: ldc -21
    //   33: iconst_2
    //   34: anewarray 176	java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: aload_0
    //   40: invokespecial 221	com/tencent/mm/plugin/appbrand/launching/a/a:getAppId	()Ljava/lang/String;
    //   43: aastore
    //   44: dup
    //   45: iconst_1
    //   46: aload_0
    //   47: invokespecial 223	com/tencent/mm/plugin/appbrand/launching/a/a:aan	()I
    //   50: invokestatic 241	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: aastore
    //   54: invokestatic 244	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   57: getstatic 249	com/tencent/mm/plugin/appbrand/appcache/a/c/a:fiY	I
    //   60: istore_1
    //   61: aload_2
    //   62: getfield 252	android/util/Pair:second	Ljava/lang/Object;
    //   65: checkcast 254	java/lang/Long
    //   68: invokevirtual 258	java/lang/Long:longValue	()J
    //   71: ldc2_w 259
    //   74: invokestatic 264	com/tencent/mm/plugin/appbrand/appcache/a/c/a:n	(JJ)V
    //   77: new 266	com/tencent/mm/plugin/appbrand/launching/a/a$2
    //   80: dup
    //   81: aload_0
    //   82: aload_2
    //   83: invokespecial 269	com/tencent/mm/plugin/appbrand/launching/a/a$2:<init>	(Lcom/tencent/mm/plugin/appbrand/launching/a/a;Landroid/util/Pair;)V
    //   86: invokestatic 275	com/tencent/mm/by/g:c	(Lcom/tencent/mm/vending/g/c$a;)Lcom/tencent/mm/by/f;
    //   89: astore_2
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_2
    //   93: areturn
    //   94: aload_0
    //   95: getfield 30	com/tencent/mm/plugin/appbrand/launching/a/a:ggm	Z
    //   98: ifne +103 -> 201
    //   101: ldc_w 277
    //   104: invokestatic 219	com/tencent/mm/plugin/appbrand/app/e:x	(Ljava/lang/Class;)Ljava/lang/Object;
    //   107: checkcast 277	com/tencent/mm/plugin/appbrand/appcache/a/d/b
    //   110: aload_0
    //   111: invokespecial 221	com/tencent/mm/plugin/appbrand/launching/a/a:getAppId	()Ljava/lang/String;
    //   114: iconst_2
    //   115: aload_0
    //   116: invokespecial 223	com/tencent/mm/plugin/appbrand/launching/a/a:aan	()I
    //   119: invokevirtual 281	com/tencent/mm/plugin/appbrand/appcache/a/d/b:w	(Ljava/lang/String;II)Landroid/util/Pair;
    //   122: astore_2
    //   123: aload_2
    //   124: getfield 233	android/util/Pair:first	Ljava/lang/Object;
    //   127: checkcast 283	java/lang/Boolean
    //   130: invokevirtual 286	java/lang/Boolean:booleanValue	()Z
    //   133: ifeq +68 -> 201
    //   136: getstatic 249	com/tencent/mm/plugin/appbrand/appcache/a/c/a:fiY	I
    //   139: istore_1
    //   140: aload_2
    //   141: getfield 252	android/util/Pair:second	Ljava/lang/Object;
    //   144: checkcast 237	java/lang/Integer
    //   147: invokevirtual 289	java/lang/Integer:intValue	()I
    //   150: i2l
    //   151: ldc2_w 290
    //   154: invokestatic 264	com/tencent/mm/plugin/appbrand/appcache/a/c/a:n	(JJ)V
    //   157: ldc 119
    //   159: ldc_w 293
    //   162: iconst_2
    //   163: anewarray 176	java/lang/Object
    //   166: dup
    //   167: iconst_0
    //   168: aload_0
    //   169: invokespecial 221	com/tencent/mm/plugin/appbrand/launching/a/a:getAppId	()Ljava/lang/String;
    //   172: aastore
    //   173: dup
    //   174: iconst_1
    //   175: aload_0
    //   176: invokespecial 223	com/tencent/mm/plugin/appbrand/launching/a/a:aan	()I
    //   179: invokestatic 241	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   182: aastore
    //   183: invokestatic 244	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: new 9	com/tencent/mm/plugin/appbrand/launching/a/a$3
    //   189: dup
    //   190: aload_0
    //   191: invokespecial 296	com/tencent/mm/plugin/appbrand/launching/a/a$3:<init>	(Lcom/tencent/mm/plugin/appbrand/launching/a/a;)V
    //   194: invokestatic 275	com/tencent/mm/by/g:c	(Lcom/tencent/mm/vending/g/c$a;)Lcom/tencent/mm/by/f;
    //   197: astore_2
    //   198: goto -108 -> 90
    //   201: aload_0
    //   202: invokespecial 298	com/tencent/mm/ab/a:KM	()Lcom/tencent/mm/by/f;
    //   205: astore_2
    //   206: goto -116 -> 90
    //   209: astore_2
    //   210: aload_0
    //   211: monitorexit
    //   212: aload_2
    //   213: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	214	0	this	a
    //   60	80	1	i	int
    //   21	185	2	localObject1	Object
    //   209	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	90	209	finally
    //   94	198	209	finally
    //   201	206	209	finally
  }
  
  public final void akR()
  {
    c.Em().H(new Runnable()
    {
      public final void run()
      {
        a.this.ggm = false;
        a.this.KM();
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */