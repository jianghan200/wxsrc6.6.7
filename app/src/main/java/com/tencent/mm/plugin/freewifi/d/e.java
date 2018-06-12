package com.tencent.mm.plugin.freewifi.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.xm;
import com.tencent.mm.protocal.c.xn;
import com.tencent.mm.protocal.c.xo;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class e
  extends c
{
  public e(LinkedList<xm> paramLinkedList)
  {
    aOR();
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0)) {
      ((xn)this.diG.dID.dIL).rDs = paramLinkedList;
    }
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new xn();
    locala.dIH = new xo();
    locala.uri = "/cgi-bin/mmo2o-bin/freewifireport";
    locala.dIF = 1781;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final LinkedList<xm> aPa()
  {
    xo localxo = (xo)this.diG.dIE.dIL;
    if (localxo == null) {
      return null;
    }
    return localxo.rDs;
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    x.i("MicroMsg.FreeWifi.NetSceneFreeWifiReport", "doBeforeCallback. netId=%d, errType=%d, errCode=%d, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (m.cC(paramInt2, paramInt3)) {
      j.aOO().aOv().post(new e.1(this));
    }
  }
  
  public final int getType()
  {
    return 1781;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */