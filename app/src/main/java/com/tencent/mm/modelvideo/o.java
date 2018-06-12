package com.tencent.mm.modelvideo;

import android.os.HandlerThread;
import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.modelcdntran.f;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.HashMap;

public class o
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private static ah enA = null;
  private static ag enB = null;
  private f enC = null;
  private i enD = null;
  private volatile u ent = new u();
  private volatile s enu;
  private volatile w env;
  private volatile x.a enw = null;
  private volatile l enx = null;
  private volatile k eny = null;
  private volatile m enz = null;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("VIDEOINFO_TABLE".hashCode()), new o.1());
    cVM.put(Integer.valueOf("VIDEOPLAYHISTORY_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return w.diD;
      }
    });
    cVM.put(Integer.valueOf("SIGHTDRAFTSINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return l.diD;
      }
    });
  }
  
  public static o SZ()
  {
    return (o)p.v(o.class);
  }
  
  public static s Ta()
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      throw new com.tencent.mm.model.b();
    }
    if (SZ().enu == null) {
      SZ().enu = new s(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return SZ().enu;
  }
  
  public static f Tb()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (SZ().enC == null) {
      SZ().enC = new f();
    }
    if (com.tencent.mm.modelcdntran.g.NE().dOO == null) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        com.tencent.mm.modelcdntran.g.NE().dOO = SZ().enC;
      }
      return SZ().enC;
    }
  }
  
  public static i Tc()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (SZ().enD == null) {
      SZ().enD = new i();
    }
    return SZ().enD;
  }
  
  public static w Td()
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      throw new com.tencent.mm.model.b();
    }
    if (SZ().env == null) {
      SZ().env = new w(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return SZ().env;
  }
  
  public static l Te()
  {
    try
    {
      if (!com.tencent.mm.kernel.g.Eg().Dx()) {
        throw new com.tencent.mm.model.b();
      }
    }
    finally {}
    if (SZ().enx == null) {
      SZ().enx = new l(com.tencent.mm.kernel.g.Ei().dqq);
    }
    l locall = SZ().enx;
    return locall;
  }
  
  public static x.a Tf()
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      throw new com.tencent.mm.model.b();
    }
    if (SZ().enw == null) {
      SZ().enw = new x.a();
    }
    return SZ().enw;
  }
  
  public static m Tg()
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      throw new com.tencent.mm.model.b();
    }
    if (SZ().enz == null) {
      SZ().enz = new m();
    }
    return SZ().enz;
  }
  
  private static void Th()
  {
    boolean bool2 = false;
    if ((enB != null) && (enA != null)) {
      return;
    }
    boolean bool1;
    if (enB != null)
    {
      bool1 = true;
      if (enA != null) {
        bool2 = true;
      }
      x.w("MicroMsg.SubCoreVideo", "check decoder thread available fail, handler[%B] thread[%B] stack[%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), bi.cjd() });
      if (enB != null) {
        enB.removeCallbacksAndMessages(null);
      }
      if (enA == null) {
        break label114;
      }
      enA.a(null);
    }
    for (;;)
    {
      enB = new ag(enA.lnJ.getLooper());
      return;
      bool1 = false;
      break;
      label114:
      enA = new ah("Short-Video-Decoder-Thread-" + System.currentTimeMillis());
    }
  }
  
  public static boolean d(Runnable paramRunnable, long paramLong)
  {
    if (paramRunnable == null) {
      return false;
    }
    Th();
    if (paramLong > 0L) {
      enB.postDelayed(paramRunnable, paramLong);
    }
    for (;;)
    {
      return true;
      enB.post(paramRunnable);
    }
  }
  
  public static String getAccVideoPath()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Ek();
    return com.tencent.mm.kernel.g.Ei().dqp + "video/";
  }
  
  public static boolean l(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return true;
    }
    Th();
    if (enB == null)
    {
      x.e("MicroMsg.SubCoreVideo", "short video decoder handler is null");
      return false;
    }
    enB.removeCallbacks(paramRunnable);
    return true;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreVideo", "%d onAccountPostReset ", new Object[] { Integer.valueOf(hashCode()) });
    d.c.a(Integer.valueOf(43), this.ent);
    d.c.a(Integer.valueOf(44), this.ent);
    d.c.a(Integer.valueOf(62), this.ent);
    if (enB != null) {
      enB.removeCallbacksAndMessages(null);
    }
    com.tencent.mm.kernel.g.Em().H(new o.4(this));
    File localFile = new File(k.SU());
    if ((!localFile.exists()) || (!localFile.isDirectory())) {
      localFile.mkdirs();
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  /* Error */
  public final void onAccountRelease()
  {
    // Byte code:
    //   0: ldc -66
    //   2: ldc_w 348
    //   5: iconst_1
    //   6: anewarray 4	java/lang/Object
    //   9: dup
    //   10: iconst_0
    //   11: aload_0
    //   12: invokevirtual 302	java/lang/Object:hashCode	()I
    //   15: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: aastore
    //   19: invokestatic 305	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: invokestatic 121	com/tencent/mm/modelvideo/o:SZ	()Lcom/tencent/mm/modelvideo/o;
    //   25: getfield 84	com/tencent/mm/modelvideo/o:enw	Lcom/tencent/mm/modelvideo/x$a;
    //   28: ifnull +69 -> 97
    //   31: invokestatic 121	com/tencent/mm/modelvideo/o:SZ	()Lcom/tencent/mm/modelvideo/o;
    //   34: getfield 84	com/tencent/mm/modelvideo/o:enw	Lcom/tencent/mm/modelvideo/x$a;
    //   37: astore_1
    //   38: aload_1
    //   39: iconst_0
    //   40: putfield 352	com/tencent/mm/modelvideo/x$a:bFj	I
    //   43: aload_1
    //   44: getfield 356	com/tencent/mm/modelvideo/x$a:eox	Lcom/tencent/mm/modelvideo/d;
    //   47: ifnull +13 -> 60
    //   50: invokestatic 360	com/tencent/mm/kernel/g:DF	()Lcom/tencent/mm/ab/o;
    //   53: aload_1
    //   54: getfield 356	com/tencent/mm/modelvideo/x$a:eox	Lcom/tencent/mm/modelvideo/d;
    //   57: invokevirtual 366	com/tencent/mm/ab/o:c	(Lcom/tencent/mm/ab/l;)V
    //   60: aload_1
    //   61: getfield 370	com/tencent/mm/modelvideo/x$a:eoy	Lcom/tencent/mm/modelvideo/g;
    //   64: ifnull +13 -> 77
    //   67: invokestatic 360	com/tencent/mm/kernel/g:DF	()Lcom/tencent/mm/ab/o;
    //   70: aload_1
    //   71: getfield 370	com/tencent/mm/modelvideo/x$a:eoy	Lcom/tencent/mm/modelvideo/g;
    //   74: invokevirtual 366	com/tencent/mm/ab/o:c	(Lcom/tencent/mm/ab/l;)V
    //   77: invokestatic 360	com/tencent/mm/kernel/g:DF	()Lcom/tencent/mm/ab/o;
    //   80: sipush 149
    //   83: aload_1
    //   84: invokevirtual 374	com/tencent/mm/ab/o:b	(ILcom/tencent/mm/ab/e;)V
    //   87: invokestatic 360	com/tencent/mm/kernel/g:DF	()Lcom/tencent/mm/ab/o;
    //   90: sipush 150
    //   93: aload_1
    //   94: invokevirtual 374	com/tencent/mm/ab/o:b	(ILcom/tencent/mm/ab/e;)V
    //   97: invokestatic 121	com/tencent/mm/modelvideo/o:SZ	()Lcom/tencent/mm/modelvideo/o;
    //   100: getfield 90	com/tencent/mm/modelvideo/o:enz	Lcom/tencent/mm/modelvideo/m;
    //   103: ifnull +56 -> 159
    //   106: invokestatic 121	com/tencent/mm/modelvideo/o:SZ	()Lcom/tencent/mm/modelvideo/o;
    //   109: getfield 90	com/tencent/mm/modelvideo/o:enz	Lcom/tencent/mm/modelvideo/m;
    //   112: astore_1
    //   113: aload_1
    //   114: iconst_0
    //   115: putfield 375	com/tencent/mm/modelvideo/m:bFj	I
    //   118: ldc_w 377
    //   121: ldc_w 379
    //   124: iconst_1
    //   125: anewarray 4	java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: aload_1
    //   131: getfield 382	com/tencent/mm/modelvideo/m:emW	Ljava/lang/String;
    //   134: aastore
    //   135: invokestatic 305	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   138: aload_1
    //   139: getfield 382	com/tencent/mm/modelvideo/m:emW	Ljava/lang/String;
    //   142: invokestatic 386	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   145: ifne +14 -> 159
    //   148: invokestatic 390	com/tencent/mm/modelcdntran/g:ND	()Lcom/tencent/mm/modelcdntran/c;
    //   151: aload_1
    //   152: getfield 382	com/tencent/mm/modelvideo/m:emW	Ljava/lang/String;
    //   155: invokevirtual 395	com/tencent/mm/modelcdntran/c:lw	(Ljava/lang/String;)Z
    //   158: pop
    //   159: invokestatic 121	com/tencent/mm/modelvideo/o:SZ	()Lcom/tencent/mm/modelvideo/o;
    //   162: getfield 94	com/tencent/mm/modelvideo/o:enD	Lcom/tencent/mm/modelvideo/i;
    //   165: ifnull +21 -> 186
    //   168: invokestatic 121	com/tencent/mm/modelvideo/o:SZ	()Lcom/tencent/mm/modelvideo/o;
    //   171: getfield 94	com/tencent/mm/modelvideo/o:enD	Lcom/tencent/mm/modelvideo/i;
    //   174: astore_1
    //   175: aload_1
    //   176: invokevirtual 398	com/tencent/mm/modelvideo/i:stopDownload	()V
    //   179: aload_1
    //   180: getfield 402	com/tencent/mm/modelvideo/i:emG	Ljava/util/LinkedList;
    //   183: invokevirtual 407	java/util/LinkedList:clear	()V
    //   186: invokestatic 121	com/tencent/mm/modelvideo/o:SZ	()Lcom/tencent/mm/modelvideo/o;
    //   189: getfield 92	com/tencent/mm/modelvideo/o:enC	Lcom/tencent/mm/modelcdntran/f;
    //   192: ifnull +20 -> 212
    //   195: invokestatic 121	com/tencent/mm/modelvideo/o:SZ	()Lcom/tencent/mm/modelvideo/o;
    //   198: getfield 92	com/tencent/mm/modelvideo/o:enC	Lcom/tencent/mm/modelcdntran/f;
    //   201: astore_1
    //   202: invokestatic 360	com/tencent/mm/kernel/g:DF	()Lcom/tencent/mm/ab/o;
    //   205: sipush 379
    //   208: aload_1
    //   209: invokevirtual 374	com/tencent/mm/ab/o:b	(ILcom/tencent/mm/ab/e;)V
    //   212: bipush 43
    //   214: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   217: aload_0
    //   218: getfield 82	com/tencent/mm/modelvideo/o:ent	Lcom/tencent/mm/modelvideo/u;
    //   221: invokestatic 409	com/tencent/mm/ab/d$c:b	(Ljava/lang/Object;Lcom/tencent/mm/ab/d;)V
    //   224: bipush 44
    //   226: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   229: aload_0
    //   230: getfield 82	com/tencent/mm/modelvideo/o:ent	Lcom/tencent/mm/modelvideo/u;
    //   233: invokestatic 409	com/tencent/mm/ab/d$c:b	(Ljava/lang/Object;Lcom/tencent/mm/ab/d;)V
    //   236: bipush 62
    //   238: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   241: aload_0
    //   242: getfield 82	com/tencent/mm/modelvideo/o:ent	Lcom/tencent/mm/modelvideo/u;
    //   245: invokestatic 409	com/tencent/mm/ab/d$c:b	(Ljava/lang/Object;Lcom/tencent/mm/ab/d;)V
    //   248: getstatic 41	com/tencent/mm/modelvideo/o:enB	Lcom/tencent/mm/sdk/platformtools/ag;
    //   251: ifnull +10 -> 261
    //   254: getstatic 41	com/tencent/mm/modelvideo/o:enB	Lcom/tencent/mm/sdk/platformtools/ag;
    //   257: aconst_null
    //   258: invokevirtual 215	com/tencent/mm/sdk/platformtools/ag:removeCallbacksAndMessages	(Ljava/lang/Object;)V
    //   261: invokestatic 411	com/tencent/mm/modelvideo/o:Tf	()Lcom/tencent/mm/modelvideo/x$a;
    //   264: astore_1
    //   265: ldc_w 413
    //   268: ldc_w 415
    //   271: iconst_1
    //   272: anewarray 4	java/lang/Object
    //   275: dup
    //   276: iconst_0
    //   277: aload_1
    //   278: getfield 418	com/tencent/mm/modelvideo/x$a:eor	Landroid/os/HandlerThread;
    //   281: aastore
    //   282: invokestatic 305	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: aload_1
    //   286: getfield 418	com/tencent/mm/modelvideo/x$a:eor	Landroid/os/HandlerThread;
    //   289: astore_2
    //   290: aload_2
    //   291: ifnull +26 -> 317
    //   294: aload_1
    //   295: getfield 418	com/tencent/mm/modelvideo/x$a:eor	Landroid/os/HandlerThread;
    //   298: invokevirtual 421	android/os/HandlerThread:quit	()Z
    //   301: pop
    //   302: aload_1
    //   303: iconst_0
    //   304: putfield 425	com/tencent/mm/modelvideo/x$a:eot	Z
    //   307: aload_1
    //   308: aconst_null
    //   309: putfield 428	com/tencent/mm/modelvideo/x$a:eos	Lcom/tencent/mm/sdk/platformtools/ag;
    //   312: aload_1
    //   313: aconst_null
    //   314: putfield 418	com/tencent/mm/modelvideo/x$a:eor	Landroid/os/HandlerThread;
    //   317: return
    //   318: astore_1
    //   319: ldc -66
    //   321: aload_1
    //   322: ldc_w 430
    //   325: iconst_0
    //   326: anewarray 4	java/lang/Object
    //   329: invokestatic 434	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   332: goto -120 -> 212
    //   335: astore_1
    //   336: ldc_w 413
    //   339: ldc_w 436
    //   342: iconst_1
    //   343: anewarray 4	java/lang/Object
    //   346: dup
    //   347: iconst_0
    //   348: aload_1
    //   349: invokevirtual 439	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   352: aastore
    //   353: invokestatic 441	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   356: return
    //   357: astore_1
    //   358: ldc -66
    //   360: ldc_w 443
    //   363: iconst_1
    //   364: anewarray 4	java/lang/Object
    //   367: dup
    //   368: iconst_0
    //   369: aload_1
    //   370: invokevirtual 439	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   373: aastore
    //   374: invokestatic 441	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   377: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	378	0	this	o
    //   37	276	1	localObject	Object
    //   318	4	1	localException1	Exception
    //   335	14	1	localException2	Exception
    //   357	13	1	localException3	Exception
    //   289	2	2	localHandlerThread	HandlerThread
    // Exception table:
    //   from	to	target	type
    //   22	60	318	java/lang/Exception
    //   60	77	318	java/lang/Exception
    //   77	97	318	java/lang/Exception
    //   97	159	318	java/lang/Exception
    //   159	186	318	java/lang/Exception
    //   186	212	318	java/lang/Exception
    //   294	317	335	java/lang/Exception
    //   261	290	357	java/lang/Exception
    //   336	356	357	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelvideo/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */