package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.v.a;
import com.tencent.mm.protocal.c.bvi;
import com.tencent.mm.protocal.c.bvj;

public final class s
  extends a<bvj>
{
  private final String fdE;
  private final bvi fmA;
  private final b fmB;
  public volatile v.a fmC;
  
  public s(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, String paramString1, int paramInt5, String paramString2)
  {
    this.fdE = paramString2;
    b.a locala = new b.a();
    bvi localbvi = new bvi();
    int i = paramInt1;
    if (paramInt1 == 0) {
      i = 1000;
    }
    localbvi.scene = i;
    if (paramBoolean) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      localbvi.srW = paramInt1;
      localbvi.rka = paramInt2;
      localbvi.srX = paramInt3;
      localbvi.srY = paramInt4;
      localbvi.username = paramString1;
      localbvi.aAk = paramInt5;
      localbvi.srZ = paramString2;
      this.fmA = localbvi;
      locala.dIG = localbvi;
      locala.dIH = new bvj();
      locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/updatewxausagerecord";
      locala.dIF = 1149;
      paramString1 = locala.KT();
      this.fmB = paramString1;
      this.diG = paramString1;
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */