package com.tencent.mm.plugin.subapp.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.c;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aji;
import com.tencent.mm.protocal.c.ajj;
import com.tencent.mm.protocal.c.bxj;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public final class a
  extends l
  implements k
{
  private al dHa = new al(new a.1(this), true);
  final b diG;
  private com.tencent.mm.ab.e diJ;
  int oqY = 0;
  
  public a()
  {
    au.HU();
    int j = bi.f((Integer)c.DT().get(66052, null));
    if (am.a.dBt.gZ(j))
    {
      au.HU();
      i = bi.f((Integer)c.DT().get(66053, null));
    }
    Object localObject = new StringBuilder("init: allfileid:").append(Integer.toBinaryString(j)).append(" inver:");
    au.HU();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetVUserInfo", bi.f((Integer)c.DT().get(66053, null)) + " reqver:" + i);
    localObject = new b.a();
    ((b.a)localObject).dIG = new aji();
    ((b.a)localObject).dIH = new ajj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getvuserinfo";
    ((b.a)localObject).dIF = 167;
    ((b.a)localObject).dII = 60;
    ((b.a)localObject).dIJ = 1000000060;
    this.diG = ((b.a)localObject).KT();
    ((aji)this.diG.dID.dIL).hcD = i;
  }
  
  /* Error */
  static boolean a(int paramInt, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: new 165	java/io/FileOutputStream
    //   5: dup
    //   6: getstatic 65	com/tencent/mm/model/am$a:dBt	Lcom/tencent/mm/model/am$c;
    //   9: iload_0
    //   10: iload_1
    //   11: invokeinterface 169 3 0
    //   16: invokespecial 170	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   19: astore 5
    //   21: aload 5
    //   23: astore 4
    //   25: aload 5
    //   27: aload_2
    //   28: invokevirtual 174	java/io/FileOutputStream:write	([B)V
    //   31: aload 5
    //   33: astore 4
    //   35: aload 5
    //   37: invokevirtual 177	java/io/FileOutputStream:close	()V
    //   40: aload 5
    //   42: invokevirtual 177	java/io/FileOutputStream:close	()V
    //   45: iconst_1
    //   46: istore_1
    //   47: iload_1
    //   48: ireturn
    //   49: astore 6
    //   51: aconst_null
    //   52: astore_2
    //   53: aload_2
    //   54: astore 4
    //   56: ldc 91
    //   58: aload 6
    //   60: ldc -77
    //   62: iconst_0
    //   63: anewarray 181	java/lang/Object
    //   66: invokestatic 185	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: iload_3
    //   70: istore_1
    //   71: aload_2
    //   72: ifnull -25 -> 47
    //   75: aload_2
    //   76: invokevirtual 177	java/io/FileOutputStream:close	()V
    //   79: iconst_0
    //   80: ireturn
    //   81: astore_2
    //   82: iconst_0
    //   83: ireturn
    //   84: astore_2
    //   85: aconst_null
    //   86: astore 4
    //   88: aload 4
    //   90: ifnull +8 -> 98
    //   93: aload 4
    //   95: invokevirtual 177	java/io/FileOutputStream:close	()V
    //   98: aload_2
    //   99: athrow
    //   100: astore_2
    //   101: goto -56 -> 45
    //   104: astore 4
    //   106: goto -8 -> 98
    //   109: astore_2
    //   110: goto -22 -> 88
    //   113: astore 6
    //   115: aload 5
    //   117: astore_2
    //   118: goto -65 -> 53
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	paramInt	int
    //   0	121	1	paramBoolean	boolean
    //   0	121	2	paramArrayOfByte	byte[]
    //   1	69	3	bool	boolean
    //   23	71	4	localObject	Object
    //   104	1	4	localException1	Exception
    //   19	97	5	localFileOutputStream	java.io.FileOutputStream
    //   49	10	6	localException2	Exception
    //   113	1	6	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   2	21	49	java/lang/Exception
    //   75	79	81	java/lang/Exception
    //   2	21	84	finally
    //   40	45	100	java/lang/Exception
    //   93	98	104	java/lang/Exception
    //   25	31	109	finally
    //   35	40	109	finally
    //   56	69	109	finally
    //   25	31	113	java/lang/Exception
    //   35	40	113	java/lang/Exception
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetVUserInfo", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (ajj)((b)paramq).dIE.dIL;
    paramArrayOfByte = new StringBuilder("onGYNetEnd new version:").append(paramq.hcD).append(" old version:");
    au.HU();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetVUserInfo", bi.f((Integer)c.DT().get(66053, null)) + " Count:" + paramq.rMl.size());
    au.HU();
    c.DT().set(66053, Integer.valueOf(paramq.hcD));
    if (paramq.rMl.size() <= 0)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    int i = 0;
    paramInt1 = 0;
    while (paramInt1 < paramq.rMl.size())
    {
      i |= ((bxj)paramq.rMl.get(paramInt1)).bzI;
      paramInt1 += 1;
    }
    au.HU();
    c.DT().set(66052, Integer.valueOf(i));
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    this.oqY = (paramq.rMl.size() - 1);
    this.dHa.J(50L, 50L);
  }
  
  public final int getType()
  {
    return 167;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/subapp/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */