package com.tencent.mm.sandbox.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.c.i;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.mm.protocal.c.aiu;
import com.tencent.mm.protocal.c.aiv;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class a
  extends l
  implements k, com.tencent.mm.plugin.y.b
{
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aiu();
    ((b.a)localObject).dIH = new aiv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getupdateinfo";
    ((b.a)localObject).dIF = 113;
    ((b.a)localObject).dII = 35;
    ((b.a)localObject).dIJ = 1000000035;
    this.diG = ((b.a)localObject).KT();
    localObject = (aiu)this.diG.dID.dIL;
    ((aiu)localObject).rLv = paramInt;
    ((aiu)localObject).qZe = com.tencent.mm.sdk.platformtools.e.bxk;
    if ((10012 == af.exm) && (af.exn > 0)) {
      ((aiu)localObject).qZe = af.exn;
    }
    switch (paramInt)
    {
    }
    for (;;)
    {
      x.i("MicroMsg.NetSceneGetUpdateInfo", "summerupdate dkchan NetSceneGetUpdateInfo updateType:%d channel:%d release:%d, stack[%s]", new Object[] { Integer.valueOf(((aiu)localObject).rLv), Integer.valueOf(((aiu)localObject).qZe), Integer.valueOf(com.tencent.mm.sdk.platformtools.e.bxk), bi.cjd() });
      return;
      h.mEJ.a(405L, 3L, 1L, true);
      continue;
      h.mEJ.a(405L, 4L, 1L, true);
      continue;
      h.mEJ.a(405L, 5L, 1L, true);
      continue;
      h.mEJ.a(405L, 6L, 1L, true);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken GetUpdateInfo onGYNetEnd errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      h.mEJ.a(405L, 7L, 1L, true);
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      paramString = cgJ();
      if (paramString == null) {
        break label266;
      }
      paramq = i.cG(paramString);
      if (paramq == null) {
        break;
      }
      paramInt1 = paramq.versionCode;
      x.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchVersionCode[%d]", new Object[] { Integer.valueOf(paramInt1) });
      au.DF().a(new com.tencent.mm.modelsimple.ad(com.tencent.mm.sdk.platformtools.ad.getPackageName(), paramInt1), 0);
      h.mEJ.a(405L, 13L, 1L, true);
      return;
      h.mEJ.a(405L, 8L, 1L, true);
      if (paramInt2 == 4)
      {
        h.mEJ.a(405L, 9L, 1L, true);
        if (paramInt3 == -16) {
          h.mEJ.a(405L, 10L, 1L, true);
        } else if (paramInt3 == -17) {
          h.mEJ.a(405L, 11L, 1L, true);
        } else if (paramInt3 == -18) {
          h.mEJ.a(405L, 12L, 1L, true);
        }
      }
    }
    x.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchInfo is null patchXml[%s]", new Object[] { paramString });
    return;
    label266:
    x.w("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchXml is null!");
    h.mEJ.a(405L, 14L, 1L, true);
  }
  
  public final int bfw()
  {
    return ((aiv)this.diG.dIE.dIL).rLw;
  }
  
  public final String[] bfx()
  {
    aiv localaiv = (aiv)this.diG.dIE.dIL;
    String[] arrayOfString = new String[localaiv.rLB.size()];
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      arrayOfString[i] = ((bhz)localaiv.rLB.get(i)).siM;
      i += 1;
    }
    return arrayOfString;
  }
  
  public final aiv bfy()
  {
    int i = 1;
    aiv localaiv;
    if (SubCoreSandBox.mFe)
    {
      localaiv = (aiv)this.diG.dIE.dIL;
      localaiv.rLD = 1;
      localaiv.rLE = "http://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
      if (!SubCoreSandBox.mFf) {
        break label58;
      }
    }
    for (;;)
    {
      localaiv.rLF = i;
      return (aiv)this.diG.dIE.dIL;
      label58:
      i = 0;
    }
  }
  
  public final int cgH()
  {
    return ((aiv)this.diG.dIE.dIL).rLy;
  }
  
  public final String cgI()
  {
    return ((aiv)this.diG.dIE.dIL).rLx;
  }
  
  public final String cgJ()
  {
    aiv localaiv = (aiv)this.diG.dIE.dIL;
    x.d("MicroMsg.NetSceneGetUpdateInfo", "summertoken getPatchInfo[%s], stack[%s]", new Object[] { localaiv.rLC, bi.cjd() });
    return localaiv.rLC;
  }
  
  public final int getType()
  {
    return 11;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/sandbox/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */