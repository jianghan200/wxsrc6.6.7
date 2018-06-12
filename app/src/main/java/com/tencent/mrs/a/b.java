package com.tencent.mrs.a;

import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.ag;
import com.tencent.mm.protocal.c.ys;
import com.tencent.mm.protocal.c.yt;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  private static boolean bgH = false;
  private static Object lock = new Object();
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private ys mDS = null;
  
  public b(byte[] paramArrayOfByte)
  {
    hs(true);
    ag localag = new ag();
    this.mDS = new ys();
    try
    {
      localag.aG(paramArrayOfByte);
      this.mDS.rEW = localag;
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      x.e("Matrix.NetSceneGetMrsStrategy", "parse data error");
      g.Ek();
      g.Em().H(new Runnable()
      {
        public final void run()
        {
          MatrixReport.with().onStrategyResp(3, -1, null);
        }
      });
    }
  }
  
  private static void hs(boolean paramBoolean)
  {
    synchronized (lock)
    {
      bgH = paramBoolean;
      return;
    }
  }
  
  public static boolean isRunning()
  {
    synchronized (lock)
    {
      boolean bool = bgH;
      return bool;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int j = -1;
    this.diJ = parame1;
    int i;
    if (!bi.bC(g.Eh().DE()))
    {
      i = 1;
      if (i != 0) {
        break label43;
      }
      x.w("Matrix.NetSceneGetMrsStrategy", "get mrs strategy must go after login");
      i = j;
    }
    label43:
    do
    {
      return i;
      i = 0;
      break;
      parame1 = new b.a();
      parame1.dIK = false;
      parame1.dIG = this.mDS;
      parame1.dIH = new yt();
      parame1.uri = "/cgi-bin/micromsg-bin/getapmstrategy";
      parame1.dIF = 914;
      this.diG = parame1.KT();
      j = a(parame, this.diG, this);
      i = j;
    } while (j >= 0);
    x.i("Matrix.NetSceneGetMrsStrategy", "mark all failed. do scene %d", new Object[] { Integer.valueOf(j) });
    try
    {
      MatrixReport.with().onStrategyResp(3, -1, null);
      hs(false);
      return j;
    }
    catch (Exception parame)
    {
      x.e("Matrix.NetSceneGetMrsStrategy", "onStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bi.i(parame) });
    }
    return j;
  }
  
  /* Error */
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: invokestatic 93	com/tencent/mm/kernel/g:Eh	()Lcom/tencent/mm/kernel/b;
    //   3: getfield 183	com/tencent/mm/kernel/b:dpP	Lcom/tencent/mm/ab/o;
    //   6: ifnull +15 -> 21
    //   9: invokestatic 93	com/tencent/mm/kernel/g:Eh	()Lcom/tencent/mm/kernel/b;
    //   12: getfield 183	com/tencent/mm/kernel/b:dpP	Lcom/tencent/mm/ab/o;
    //   15: getfield 189	com/tencent/mm/ab/o:dJs	Lcom/tencent/mm/network/e;
    //   18: ifnonnull +29 -> 47
    //   21: ldc 56
    //   23: ldc -65
    //   25: invokestatic 194	com/tencent/mm/sdk/platformtools/x:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   28: aload_0
    //   29: getfield 89	com/tencent/mrs/a/b:diJ	Lcom/tencent/mm/ab/e;
    //   32: iload_2
    //   33: iload_3
    //   34: aload 4
    //   36: aload_0
    //   37: invokeinterface 199 5 0
    //   42: iconst_0
    //   43: invokestatic 40	com/tencent/mrs/a/b:hs	(Z)V
    //   46: return
    //   47: iload_2
    //   48: ifeq +61 -> 109
    //   51: ldc 56
    //   53: new 201	java/lang/StringBuilder
    //   56: dup
    //   57: ldc -53
    //   59: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   62: iload_2
    //   63: invokevirtual 210	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   66: ldc -44
    //   68: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: iload_3
    //   72: invokevirtual 210	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   75: invokevirtual 219	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokestatic 64	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: invokestatic 163	com/tencent/matrix/mrs/core/MatrixReport:with	()Lcom/tencent/matrix/mrs/core/MatrixReport;
    //   84: iload_2
    //   85: iload_3
    //   86: aconst_null
    //   87: invokevirtual 167	com/tencent/matrix/mrs/core/MatrixReport:onStrategyResp	(II[B)V
    //   90: aload_0
    //   91: getfield 89	com/tencent/mrs/a/b:diJ	Lcom/tencent/mm/ab/e;
    //   94: iload_2
    //   95: iload_3
    //   96: aload 4
    //   98: aload_0
    //   99: invokeinterface 199 5 0
    //   104: iconst_0
    //   105: invokestatic 40	com/tencent/mrs/a/b:hs	(Z)V
    //   108: return
    //   109: ldc 56
    //   111: ldc -35
    //   113: invokestatic 224	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   116: aload_0
    //   117: getfield 142	com/tencent/mrs/a/b:diG	Lcom/tencent/mm/ab/b;
    //   120: getfield 230	com/tencent/mm/ab/b:dIE	Lcom/tencent/mm/ab/b$c;
    //   123: getfield 235	com/tencent/mm/ab/b$c:dIL	Lcom/tencent/mm/bk/a;
    //   126: checkcast 122	com/tencent/mm/protocal/c/yt
    //   129: astore 5
    //   131: invokestatic 163	com/tencent/matrix/mrs/core/MatrixReport:with	()Lcom/tencent/matrix/mrs/core/MatrixReport;
    //   134: iconst_0
    //   135: iconst_0
    //   136: aload 5
    //   138: getfield 239	com/tencent/mm/protocal/c/yt:rEX	Lcom/tencent/mm/protocal/c/ah;
    //   141: invokevirtual 244	com/tencent/mm/protocal/c/ah:toByteArray	()[B
    //   144: invokevirtual 167	com/tencent/matrix/mrs/core/MatrixReport:onStrategyResp	(II[B)V
    //   147: aload_0
    //   148: getfield 89	com/tencent/mrs/a/b:diJ	Lcom/tencent/mm/ab/e;
    //   151: iload_2
    //   152: iload_3
    //   153: aload 4
    //   155: aload_0
    //   156: invokeinterface 199 5 0
    //   161: iconst_0
    //   162: invokestatic 40	com/tencent/mrs/a/b:hs	(Z)V
    //   165: return
    //   166: astore 5
    //   168: ldc 56
    //   170: ldc -10
    //   172: iconst_2
    //   173: anewarray 24	java/lang/Object
    //   176: dup
    //   177: iconst_0
    //   178: aload_0
    //   179: invokevirtual 173	java/lang/Object:hashCode	()I
    //   182: invokestatic 153	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   185: aastore
    //   186: dup
    //   187: iconst_1
    //   188: aload 5
    //   190: invokestatic 176	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   193: aastore
    //   194: invokestatic 178	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   197: goto -50 -> 147
    //   200: astore 4
    //   202: iconst_0
    //   203: invokestatic 40	com/tencent/mrs/a/b:hs	(Z)V
    //   206: aload 4
    //   208: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	this	b
    //   0	209	1	paramInt1	int
    //   0	209	2	paramInt2	int
    //   0	209	3	paramInt3	int
    //   0	209	4	paramString	String
    //   0	209	5	paramq	com.tencent.mm.network.q
    //   0	209	6	paramArrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   131	147	166	java/lang/Exception
    //   0	21	200	finally
    //   21	42	200	finally
    //   51	104	200	finally
    //   109	131	200	finally
    //   131	147	200	finally
    //   147	161	200	finally
    //   168	197	200	finally
  }
  
  public final int getType()
  {
    return 914;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mrs/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */