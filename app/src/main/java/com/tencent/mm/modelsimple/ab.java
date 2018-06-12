package com.tencent.mm.modelsimple;

import com.tencent.mm.a.o;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bxv;
import com.tencent.mm.protocal.c.bxw;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.w;

public final class ab
  extends l
  implements k
{
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public long egu = 0L;
  
  public ab(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, int paramInt2)
  {
    this(paramInt1, paramString1, paramString2, paramString3, paramString4, paramBoolean, paramInt2, true);
  }
  
  public ab(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bxv();
    ((b.a)localObject).dIH = new bxw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/newverifypasswd";
    ((b.a)localObject).dIF = 384;
    ((b.a)localObject).dII = 182;
    ((b.a)localObject).dIJ = 1000000182;
    this.diG = ((b.a)localObject).KT();
    localObject = (bxv)this.diG.dID.dIL;
    ((bxv)localObject).qZc = paramInt1;
    ((bxv)localObject).skH = paramInt2;
    ((bxv)localObject).stV = bi.WO(paramString1);
    ((bxv)localObject).rhU = bi.WN(paramString1);
    ((bxv)localObject).rMn = new bhz().VO(paramString2);
    ((bxv)localObject).stW = new bhz().VO(paramString3);
    ((bxv)localObject).rhY = new bhz().VO(paramString4);
    if ((paramInt1 == 5) || (paramInt1 == 2))
    {
      this.egu = new o(com.tencent.mm.model.q.GE()).longValue();
      if (paramBoolean1)
      {
        paramString1 = g.Eg().Dp().c(this.egu, paramString3);
        ((bxv)localObject).rgk = new bhy().bq(paramString1);
      }
    }
    else
    {
      paramString1 = bi.oV((String)g.Ei().DT().get(47, null));
      ((bxv)localObject).rhZ = new bhy().bq(bi.WP(paramString1));
      paramInt2 = ((bxv)localObject).qZc;
      if (((bxv)localObject).rgk != null) {
        break label377;
      }
      paramInt1 = -1;
      label296:
      if (((bxv)localObject).rgk != null) {
        break label389;
      }
    }
    label377:
    label389:
    for (paramString1 = "null";; paramString1 = bi.Xf(bi.bB(((bxv)localObject).rgk.siK.lR)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneVerifyPswd", "summerauth opCode[%d], hasSecCode[%b], isManualAuth[%b], len:%d, content:[%s]", new Object[] { Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt1), paramString1 });
      return;
      paramString1 = g.Eg().Dp().a(this.egu, bi.WO(paramString1), paramBoolean2);
      break;
      paramInt1 = ((bxv)localObject).rgk.siI;
      break label296;
    }
  }
  
  public ab(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this(1, paramString1, paramString2, paramString3, paramString4, false, 0);
  }
  
  public final String Oj()
  {
    try
    {
      String str = ((bxw)this.diG.dIE.dIL).rwj;
      return str;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneVerifyPswd", localException, "", new Object[0]);
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (bxv)this.diG.dID.dIL;
    paramq = (bxw)this.diG.dIE.dIL;
    if ((paramq.rev != null) && (paramq.rev.siI > 0)) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneVerifyPswd", "summerauth parseRet[%b], len[%d]", new Object[] { Boolean.valueOf(g.Eg().Dp().a(this.egu, com.tencent.mm.platformtools.ab.a(paramq.rev))), Integer.valueOf(paramq.rev.siI) });
    }
    int i;
    label258:
    int j;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      g.Ei().DT().set(77830, paramq.rwj);
      g.Ei().DT().set(32, paramArrayOfByte.stV);
      g.Ei().DT().set(33, paramArrayOfByte.rhU);
      g.Ei().DT().set(46, bi.bE(com.tencent.mm.platformtools.ab.a(paramq.reB)));
      paramArrayOfByte = bi.bE(com.tencent.mm.platformtools.ab.a(paramArrayOfByte.rhZ));
      g.Ei().DT().set(47, paramArrayOfByte);
      g.Ei().dqk.set(18, paramArrayOfByte);
      g.Ei().DT().set(-1535680990, paramq.reA);
      if (paramq.reB == null)
      {
        paramInt1 = 0;
        if (paramq.reA != null) {
          break label331;
        }
        i = 0;
        if (paramq.rwj != null) {
          break label344;
        }
        j = 0;
        label269:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneVerifyPswd", "A2Key.len %d, authKey.len: %d, ticketLen:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(j) });
      }
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      paramInt1 = paramq.reB.siI;
      break;
      label331:
      i = paramq.reA.length();
      break label258;
      label344:
      j = paramq.rwj.length();
      break label269;
      if (paramInt2 == 4)
      {
        g.Ei().DT().set(32, "");
        g.Ei().DT().set(33, "");
      }
    }
  }
  
  public final int getType()
  {
    return 384;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelsimple/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */