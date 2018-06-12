package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.cam;
import com.tencent.mm.protocal.c.can;
import com.tencent.mm.protocal.c.cas;

public final class i
  extends n<cam, can>
{
  String TAG = "MicroMsg.NetSceneVoipShutDown";
  
  public i(int paramInt, long paramLong, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new cam();
    ((b.a)localObject).dIH = new can();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipshutdown";
    ((b.a)localObject).dIF = 173;
    ((b.a)localObject).dII = 66;
    ((b.a)localObject).dIJ = 1000000066;
    this.diG = ((b.a)localObject).KT();
    localObject = (cam)this.diG.dID.dIL;
    ((cam)localObject).rxG = paramInt;
    ((cam)localObject).rxH = paramLong;
    cas localcas = new cas();
    bhz localbhz = new bhz();
    localbhz.VO(paramString);
    localcas.spT = localbhz;
    ((cam)localObject).svJ = localcas;
    ((cam)localObject).suO = System.currentTimeMillis();
  }
  
  public final e bLm()
  {
    return new i.1(this);
  }
  
  public final int getType()
  {
    return 173;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */