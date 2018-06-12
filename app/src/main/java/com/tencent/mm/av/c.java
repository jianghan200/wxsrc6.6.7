package com.tencent.mm.av;

import android.os.HandlerThread;
import com.tencent.map.swlocation.api.INetworkApi;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  implements INetworkApi, e
{
  private float bSx;
  private float bUg;
  private int bUh;
  private int bUi;
  private String bUj;
  private String bUk;
  private a eem;
  private byte[] een;
  private al eeo;
  private int eep;
  private Object lock = new Object();
  private int scene;
  
  public c(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, int paramInt4)
  {
    g.Ek();
    this.eeo = new al(g.Em().lnJ.getLooper(), new c.1(this), false);
    this.bUg = paramFloat1;
    this.bSx = paramFloat2;
    this.bUh = paramInt1;
    this.bUi = paramInt2;
    this.bUj = paramString1;
    this.bUk = paramString2;
    this.eep = paramInt3;
    this.scene = paramInt4;
    g.Eh().dpP.a(752, this);
  }
  
  /* Error */
  public final void a(int paramInt1, int paramInt2, String arg3, com.tencent.mm.ab.l paraml)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 68	com/tencent/mm/av/c:eeo	Lcom/tencent/mm/sdk/platformtools/al;
    //   4: invokevirtual 117	com/tencent/mm/sdk/platformtools/al:SO	()V
    //   7: iload_1
    //   8: ifne +137 -> 145
    //   11: iload_2
    //   12: ifne +133 -> 145
    //   15: aload 4
    //   17: instanceof 119
    //   20: ifeq +110 -> 130
    //   23: aload 4
    //   25: checkcast 119	com/tencent/mm/av/a
    //   28: getfield 122	com/tencent/mm/av/a:edM	Ljava/lang/String;
    //   31: ldc 124
    //   33: invokestatic 130	com/tencent/mm/sdk/platformtools/bi:aG	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   36: astore_3
    //   37: ldc -124
    //   39: new 134	java/lang/StringBuilder
    //   42: dup
    //   43: ldc -120
    //   45: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   48: aload_3
    //   49: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokestatic 152	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: aload_0
    //   59: aload_3
    //   60: ldc -102
    //   62: invokevirtual 160	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   65: putfield 109	com/tencent/mm/av/c:een	[B
    //   68: aload_0
    //   69: getfield 34	com/tencent/mm/av/c:lock	Ljava/lang/Object;
    //   72: astore_3
    //   73: aload_3
    //   74: monitorenter
    //   75: aload_0
    //   76: getfield 34	com/tencent/mm/av/c:lock	Ljava/lang/Object;
    //   79: invokevirtual 163	java/lang/Object:notifyAll	()V
    //   82: aload_3
    //   83: monitorexit
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 104	com/tencent/mm/av/c:eem	Lcom/tencent/mm/av/a;
    //   89: return
    //   90: astore_3
    //   91: ldc -124
    //   93: aload_3
    //   94: ldc 124
    //   96: iconst_0
    //   97: anewarray 4	java/lang/Object
    //   100: invokestatic 167	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: ldc -124
    //   105: new 134	java/lang/StringBuilder
    //   108: dup
    //   109: ldc -87
    //   111: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   114: aload_3
    //   115: invokevirtual 170	java/lang/Exception:toString	()Ljava/lang/String;
    //   118: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: invokestatic 173	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   127: goto -59 -> 68
    //   130: aload_0
    //   131: aconst_null
    //   132: putfield 109	com/tencent/mm/av/c:een	[B
    //   135: goto -67 -> 68
    //   138: astore 4
    //   140: aload_3
    //   141: monitorexit
    //   142: aload 4
    //   144: athrow
    //   145: ldc -124
    //   147: ldc -81
    //   149: iconst_3
    //   150: anewarray 4	java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: iload_1
    //   156: invokestatic 181	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   159: aastore
    //   160: dup
    //   161: iconst_1
    //   162: iload_2
    //   163: invokestatic 181	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   166: aastore
    //   167: dup
    //   168: iconst_2
    //   169: aload_3
    //   170: aastore
    //   171: invokestatic 185	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   174: aload_0
    //   175: aconst_null
    //   176: putfield 109	com/tencent/mm/av/c:een	[B
    //   179: aload_0
    //   180: getfield 34	com/tencent/mm/av/c:lock	Ljava/lang/Object;
    //   183: astore_3
    //   184: aload_3
    //   185: monitorenter
    //   186: aload_0
    //   187: getfield 34	com/tencent/mm/av/c:lock	Ljava/lang/Object;
    //   190: invokevirtual 163	java/lang/Object:notifyAll	()V
    //   193: aload_3
    //   194: monitorexit
    //   195: invokestatic 191	com/tencent/mm/av/b:Qv	()Lcom/tencent/mm/av/b;
    //   198: invokevirtual 194	com/tencent/mm/av/b:Qx	()V
    //   201: getstatic 200	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   204: ldc2_w 201
    //   207: ldc2_w 203
    //   210: lconst_1
    //   211: iconst_0
    //   212: invokevirtual 207	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   215: goto -131 -> 84
    //   218: astore 4
    //   220: aload_3
    //   221: monitorexit
    //   222: aload 4
    //   224: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	c
    //   0	225	1	paramInt1	int
    //   0	225	2	paramInt2	int
    //   0	225	4	paraml	com.tencent.mm.ab.l
    // Exception table:
    //   from	to	target	type
    //   58	68	90	java/lang/Exception
    //   75	84	138	finally
    //   140	142	138	finally
    //   186	195	218	finally
    //   220	222	218	finally
  }
  
  public final void finish()
  {
    this.eeo.SO();
    if (this.eem != null) {
      g.Eh().dpP.c(this.eem);
    }
    this.eem = null;
    this.een = null;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      g.Eh().dpP.b(752, this);
      return;
    }
  }
  
  public final byte[] httpRequest(String paramString, byte[] paramArrayOfByte)
  {
    x.w("MicroMsg.SenseWhereHttpUtil", "why use this method? sense where sdk has something warn.");
    return new byte[0];
  }
  
  public final byte[] httpRequest(byte[] arg1)
  {
    for (;;)
    {
      try
      {
        ??? = new String(???, "UTF-8");
        x.d("MicroMsg.SenseWhereHttpUtil", "sense where http request content : " + ???);
        this.een = null;
        this.eem = new a(this.bUg, this.bSx, this.bUh, this.bUi, this.bUj, this.bUk, this.eep, this.scene, ???);
        g.Eh().dpP.a(this.eem, 0);
        this.eeo.J(60000L, 60000L);
      }
      catch (Exception ???)
      {
        x.printErrStackTrace("MicroMsg.SenseWhereHttpUtil", ???, "", new Object[0]);
        x.e("MicroMsg.SenseWhereHttpUtil", "sense where http request error: " + ???.toString());
        continue;
      }
      synchronized (this.lock)
      {
        this.lock.wait();
        x.i("MicroMsg.SenseWhereHttpUtil", "upload sense where info finish. it is response is null? %b", new Object[] { Boolean.valueOf(bi.bC(this.een)) });
        return this.een;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/av/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */