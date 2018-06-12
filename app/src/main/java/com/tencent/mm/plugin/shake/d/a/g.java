package com.tencent.mm.plugin.shake.d.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bmr;
import com.tencent.mm.protocal.c.bms;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public final class g
  extends e
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public g(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    super(paramLong);
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bmr();
    ((b.a)localObject).dIH = new bms();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shaketv";
    ((b.a)localObject).dIF = 408;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bmr)this.diG.dID.dIL;
    ((bmr)localObject).rtW = new bhy().bq(paramArrayOfByte);
    ((bmr)localObject).skI = paramInt2;
    if (paramBoolean) {
      paramInt2 = 1;
    }
    for (;;)
    {
      ((bmr)localObject).rgC = paramInt2;
      ((bmr)localObject).skJ = paramInt1;
      if (ab.bU(ad.getContext()))
      {
        paramInt1 = j;
        label152:
        ((bmr)localObject).rth = paramInt1;
        ((bmr)localObject).rdn = paramInt3;
      }
      try
      {
        au.HU();
        f2 = bi.getFloat((String)c.DT().get(aa.a.sPK, null), 0.0F);
      }
      catch (Exception paramArrayOfByte)
      {
        try
        {
          au.HU();
          f1 = bi.getFloat((String)c.DT().get(aa.a.sPL, null), 0.0F);
        }
        catch (Exception paramArrayOfByte)
        {
          try
          {
            float f2;
            float f1;
            au.HU();
            paramInt1 = bi.WU((String)c.DT().get(aa.a.sSf, null));
            for (;;)
            {
              ((bmr)localObject).rms = f2;
              ((bmr)localObject).skK = f1;
              o.a(2009, ((bmr)localObject).skK, ((bmr)localObject).rms, paramInt1);
              return;
              paramInt2 = 0;
              break;
              paramInt1 = 2;
              break label152;
              paramArrayOfByte = paramArrayOfByte;
              f1 = 0.0F;
              f2 = 0.0F;
              paramInt1 = i;
              continue;
              paramArrayOfByte = paramArrayOfByte;
              f1 = 0.0F;
              paramInt1 = i;
            }
          }
          catch (Exception paramArrayOfByte)
          {
            for (;;)
            {
              paramInt1 = i;
            }
          }
        }
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    bmr localbmr = (bmr)this.diG.dID.dIL;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneShakeTV", "MusicFingerPrintRecorder doscene dataid:%d data:%d endflag:%d voice:%f nettype:%d ver:%d", new Object[] { Integer.valueOf(localbmr.skI), Integer.valueOf(localbmr.rtW.siI), Integer.valueOf(localbmr.rgC), Float.valueOf(localbmr.skJ), Integer.valueOf(localbmr.rth), Integer.valueOf(localbmr.rdn) });
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (bmr)this.diG.dID.dIL;
    paramArrayOfByte = (bms)this.diG.dIE.dIL;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneShakeTV", "MusicFingerPrintRecorder onGYNetEnd [%d,%d] dataid:%d endflag:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramq.skI), Integer.valueOf(paramArrayOfByte.rgC) });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.rgC == 1)) {
      this.mYF = true;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final bhp bvf()
  {
    return (bms)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 408;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */