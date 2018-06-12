package com.tencent.mm.plugin.shake.d.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.model.au;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bmn;
import com.tencent.mm.protocal.c.bmo;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public final class f
  extends e
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public f(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    super(paramLong);
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bmn();
    ((b.a)localObject).dIH = new bmo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shakemusic";
    ((b.a)localObject).dIF = 367;
    ((b.a)localObject).dII = 177;
    ((b.a)localObject).dIJ = 1000000177;
    this.diG = ((b.a)localObject).KT();
    localObject = (bmn)this.diG.dID.dIL;
    ((bmn)localObject).rtW = new bhy().bq(paramArrayOfByte);
    ((bmn)localObject).skI = paramInt2;
    if (paramBoolean)
    {
      paramInt2 = 1;
      ((bmn)localObject).rgC = paramInt2;
      ((bmn)localObject).skJ = paramInt1;
      if (!ab.bU(ad.getContext())) {
        break label302;
      }
      paramInt1 = 1;
      label151:
      ((bmn)localObject).rth = paramInt1;
      ((bmn)localObject).rdn = paramInt3;
    }
    for (;;)
    {
      try
      {
        au.HU();
        f2 = bi.getFloat((String)com.tencent.mm.model.c.DT().get(aa.a.sPK, null), 0.0F);
      }
      catch (Exception paramArrayOfByte)
      {
        label302:
        f1 = 0.0F;
        float f2 = 0.0F;
      }
      for (;;)
      {
        try
        {
          au.HU();
          f1 = bi.getFloat((String)com.tencent.mm.model.c.DT().get(aa.a.sPL, null), 0.0F);
        }
        catch (Exception paramArrayOfByte)
        {
          f1 = 0.0F;
          continue;
        }
        try
        {
          au.HU();
          paramInt1 = bi.WU((String)com.tencent.mm.model.c.DT().get(aa.a.sSf, null));
          ((bmn)localObject).rms = f2;
          ((bmn)localObject).skK = f1;
          if (!com.tencent.mm.an.c.Qh()) {
            continue;
          }
          paramInt2 = 0;
          ((bmn)localObject).rKg = paramInt2;
          if (!com.tencent.mm.an.c.Qg()) {
            continue;
          }
          paramInt2 = i;
          ((bmn)localObject).rKh = paramInt2;
          o.a(2014, ((bmn)localObject).skK, ((bmn)localObject).rms, paramInt1);
          return;
        }
        catch (Exception paramArrayOfByte) {}
      }
      paramInt2 = 0;
      break;
      paramInt1 = 2;
      break label151;
      paramInt1 = 0;
      continue;
      paramInt2 = 1;
      continue;
      paramInt2 = 0;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    bmn localbmn = (bmn)this.diG.dID.dIL;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneShakeMusic", "MusicFingerPrintRecorder doscene dataid:%d data:%d endflag:%d voice:%f nettype:%d ver:%d", new Object[] { Integer.valueOf(localbmn.skI), Integer.valueOf(localbmn.rtW.siI), Integer.valueOf(localbmn.rgC), Float.valueOf(localbmn.skJ), Integer.valueOf(localbmn.rth), Integer.valueOf(localbmn.rdn) });
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (bmn)this.diG.dID.dIL;
    paramArrayOfByte = (bmo)this.diG.dIE.dIL;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneShakeMusic", "MusicFingerPrintRecorder onGYNetEnd [%d,%d] dataid:%d endflag:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramq.skI), Integer.valueOf(paramArrayOfByte.rgC) });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.rgC == 1)) {
      this.mYF = true;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final bhp bvf()
  {
    return (bmo)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 367;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */