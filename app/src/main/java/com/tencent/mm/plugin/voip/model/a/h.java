package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.plugin.voip.model.j;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.byy;
import com.tencent.mm.protocal.c.cai;
import com.tencent.mm.protocal.c.caj;
import com.tencent.mm.protocal.c.cal;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class h
  extends n<cai, caj>
{
  public h(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new cai();
    ((b.a)localObject).dIH = new caj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipRedirect";
    ((b.a)localObject).dIF = 678;
    ((b.a)localObject).dII = 240;
    ((b.a)localObject).dIJ = 1000000240;
    this.diG = ((b.a)localObject).KT();
    localObject = (cai)this.diG.dID.dIL;
    ((cai)localObject).rxG = paramInt1;
    ((cai)localObject).rxH = paramLong;
    ((cai)localObject).seq = paramInt2;
    ((cai)localObject).swG = paramInt3;
    ((cai)localObject).swH = paramInt4;
    paramInt1 = 0;
    paramInt2 = 0;
    while (paramInt1 < paramInt4)
    {
      cal localcal = new cal();
      paramInt3 = paramInt2 + 1;
      localcal.swR = paramArrayOfInt[paramInt2];
      paramInt2 = paramInt3 + 1;
      localcal.swS = paramArrayOfInt[paramInt3];
      paramInt3 = paramInt2 + 1;
      localcal.swT = paramArrayOfInt[paramInt2];
      int j = paramInt3 + 1;
      localcal.swU = paramArrayOfInt[paramInt3];
      paramInt2 = j + 1;
      localcal.swV = paramArrayOfInt[j];
      ((cai)localObject).swI.add(localcal);
      paramInt1 += 1;
    }
    paramInt1 = i;
    if (this.oKs.oJX.oPS.oLr != 0L) {
      paramInt1 = (int)((System.currentTimeMillis() - this.oKs.oJX.oPS.oLr) / 1000L);
    }
    ((cai)localObject).swJ = paramInt1;
  }
  
  public final e bLm()
  {
    new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
      {
        a.eU("MicroMsg.Voip.Redirect", "Redirect response:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2 + " status:" + h.this.oKs.mStatus);
        if (paramAnonymousInt2 != 0)
        {
          a.eT("MicroMsg.Voip.Redirect", " redirect response with error code:" + paramAnonymousInt2);
          return;
        }
        paramAnonymousString = (caj)h.this.bLq();
        a.eU("MicroMsg.Voip.Redirect", "room " + paramAnonymousString.rxG + " member " + paramAnonymousString.seq + " key " + paramAnonymousString.rxH + " relay addr cnt " + paramAnonymousString.swK + " RedirectThreshold " + paramAnonymousString.swP + " RedirectDecision " + paramAnonymousString.swQ);
        paramAnonymousl = new byy();
        byy localbyy1 = new byy();
        byy localbyy2 = new byy();
        paramAnonymousl.suW = paramAnonymousString.swK;
        paramAnonymousl.suX = paramAnonymousString.swL;
        localbyy1.suW = paramAnonymousString.swM;
        localbyy1.suX = paramAnonymousString.swN;
        localbyy2.suW = paramAnonymousString.swO;
        localbyy2.suX = paramAnonymousString.svB;
        h.this.oKs.oJX.a(paramAnonymousl, localbyy1, localbyy2, paramAnonymousString.swP, paramAnonymousString.swQ);
      }
    };
  }
  
  public final void dP(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      caj localcaj = (caj)this.diG.dIE.dIL;
      if (localcaj != null) {
        x.i("MicroMsg.Voip.Redirect", "roomId:%d, roomKey:%s, member:%d", new Object[] { Integer.valueOf(localcaj.rxG), Long.valueOf(localcaj.rxH), Integer.valueOf(localcaj.seq) });
      }
      return;
    }
    x.i("MicroMsg.Voip.Redirect", "Redirect error");
  }
  
  public final int getType()
  {
    return 678;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */