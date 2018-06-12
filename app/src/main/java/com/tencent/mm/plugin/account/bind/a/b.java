package com.tencent.mm.plugin.account.bind.a;

import com.tencent.mm.a.o;
import com.tencent.mm.aa.c;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.hi;
import com.tencent.mm.protocal.c.hj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.w;

public final class b
  extends l
  implements k
{
  private String bQX;
  private String bQZ;
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public long egu = 0L;
  
  public b(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, boolean paramBoolean)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new hi();
    ((b.a)localObject).dIH = new hj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindqq";
    ((b.a)localObject).dIF = 144;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    this.egu = paramLong;
    localObject = (hi)this.diG.dID.dIL;
    ((hi)localObject).rhT = new o(paramLong).intValue();
    ((hi)localObject).rhI = "";
    ((hi)localObject).rhU = "";
    ((hi)localObject).rhV = "";
    ((hi)localObject).rhW = "";
    ((hi)localObject).rhY = new bhz().VO("");
    ((hi)localObject).rhX = 1;
    if (paramBoolean == true) {}
    for (paramString1 = g.Eg().Dp().c(paramLong, paramString3);; paramString1 = g.Eg().Dp().a(paramLong, bi.WO(paramString1), true))
    {
      ((hi)localObject).rgk = new bhy().bq(paramString1);
      String str = bi.oV((String)g.Ei().DT().get(47, null));
      ((hi)localObject).rhZ = new bhy().bq(bi.WP(str));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBindQQ", "init opcode:%d qq:%d  wtbuf:%d img[%s,%s,%s] ksid:%s", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Integer.valueOf(bi.bD(paramString1)), paramString3, paramString2, paramString4, str });
      return;
    }
  }
  
  public b(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean)
  {
    this(paramLong, paramString1, paramString2, paramString3, paramString4, 1, paramBoolean);
    this.bQX = paramString5;
    this.bQZ = paramString6;
    paramString1 = (hi)this.diG.dID.dIL;
    paramString1.rhz = paramString5;
    paramString1.rhA = paramString6;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (hi)this.diG.dID.dIL;
    paramArrayOfByte = (hj)this.diG.dIE.dIL;
    Object localObject = ab.a(paramArrayOfByte.rev);
    if (!bi.bC((byte[])localObject)) {}
    for (boolean bool1 = g.Eg().Dp().a(new o(paramq.rhT).longValue(), (byte[])localObject);; bool1 = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBindQQ", "onGYNetEnd[%d,%d] wtret:%b wtRespBuf:%d imgsid:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(bool1), Integer.valueOf(bi.bD((byte[])localObject)), paramArrayOfByte.rhV });
      boolean bool2;
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        g.Ei().DT().set(9, Integer.valueOf(paramq.rhT));
        if (paramq.rhX == 1) {
          g.Ei().DT().set(17, Integer.valueOf(paramArrayOfByte.raH));
        }
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ();
        String str = paramArrayOfByte.ric;
        if (paramArrayOfByte.rib == 1)
        {
          bool2 = true;
          ((com.tencent.mm.plugin.messenger.foundation.a.a.i)localObject).aF(str, bool2);
          paramInt1 = paramq.rhT;
          if (paramInt1 != 0) {
            ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().bJ(new o(paramInt1) + "@qqim", 3);
          }
          c.d(paramInt1, 3);
          g.Ei().DT().set(32, paramq.rhI);
          g.Ei().DT().set(33, paramq.rhU);
          localObject = bi.bE(g.Eg().Dp().bb(new o(paramq.rhT).longValue()));
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBindQQ", "onGYNetEnd wtret:%b newa2key:%s ", new Object[] { Boolean.valueOf(bool1), bi.Xf((String)localObject) });
          g.Ei().DT().set(72, localObject);
          g.Ei().DT().set(46, bi.bE(ab.a(paramArrayOfByte.reB)));
          localObject = bi.bE(ab.a(paramq.rhZ));
          g.Ei().DT().set(47, localObject);
          g.Ei().dqk.set(18, localObject);
          g.Ei().DT().set(-1535680990, paramArrayOfByte.rid);
        }
      }
      for (;;)
      {
        paramInt1 = paramInt3;
        if (paramq.rhX == 3)
        {
          paramInt1 = paramInt3;
          if (paramInt3 == -3)
          {
            paramInt1 = 10000;
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBindQQ", "onGYNetEnd : retCode = 10000");
          }
        }
        this.diJ.a(paramInt2, paramInt1, paramString, this);
        return;
        bool2 = false;
        break;
        if (paramInt2 == 4)
        {
          g.Ei().DT().set(32, "");
          g.Ei().DT().set(33, "");
        }
      }
    }
  }
  
  public final int getType()
  {
    return 144;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/bind/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */