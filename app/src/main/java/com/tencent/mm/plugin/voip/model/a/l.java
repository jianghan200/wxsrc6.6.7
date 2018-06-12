package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.cas;
import com.tencent.mm.protocal.c.cat;
import com.tencent.mm.protocal.c.cau;

public final class l
  extends n<cat, cau>
{
  public l(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new cat();
    ((b.a)localObject).dIH = new cau();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipstatreport";
    ((b.a)localObject).dIF = 320;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (cat)this.diG.dID.dIL;
    cas localcas = new cas();
    bhz localbhz = new bhz();
    localbhz.VO(paramString1);
    localcas.spT = localbhz;
    paramString1 = new cas();
    localbhz = new bhz();
    localbhz.VO(paramString2);
    paramString1.spT = localbhz;
    paramString2 = new cas();
    localbhz = new bhz();
    localbhz.VO(paramString3);
    paramString2.spT = localbhz;
    paramString3 = new cas();
    localbhz = new bhz();
    localbhz.VO(paramString4);
    paramString3.spT = localbhz;
    paramString4 = new cas();
    localbhz = new bhz();
    localbhz.VO(paramString5);
    paramString4.spT = localbhz;
    ((cat)localObject).svJ = localcas;
    ((cat)localObject).sxe = paramString1;
    ((cat)localObject).sxd = paramString2;
    ((cat)localObject).sxf = paramString3;
    ((cat)localObject).sxg = paramString4;
  }
  
  public final e bLm()
  {
    return new l.1(this);
  }
  
  public final int getType()
  {
    return 320;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */