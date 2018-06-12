package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bzr;
import com.tencent.mm.protocal.c.bzs;
import com.tencent.mm.protocal.c.cas;

public final class c
  extends n<bzr, bzs>
{
  public c(int paramInt1, long paramLong, String paramString1, String paramString2, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bzr();
    ((b.a)localObject).dIH = new bzs();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipcancelinvite";
    ((b.a)localObject).dIF = 171;
    ((b.a)localObject).dII = 64;
    ((b.a)localObject).dIJ = 1000000064;
    this.diG = ((b.a)localObject).KT();
    localObject = (bzr)this.diG.dID.dIL;
    ((bzr)localObject).rxG = paramInt1;
    ((bzr)localObject).rxH = paramLong;
    ((bzr)localObject).jTu = paramString1;
    ((bzr)localObject).sef = paramInt2;
    paramString1 = new cas();
    bhz localbhz = new bhz();
    localbhz.VO(paramString2);
    paramString1.spT = localbhz;
    ((bzr)localObject).svJ = paramString1;
    ((bzr)localObject).suO = System.currentTimeMillis();
  }
  
  public final e bLm()
  {
    return new c.1(this);
  }
  
  public final int bLn()
  {
    bzr localbzr = (bzr)bLr();
    if ((localbzr.rxG == 0) && (localbzr.sef == 0)) {
      return -1;
    }
    return 0;
  }
  
  public final int getType()
  {
    return 171;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */