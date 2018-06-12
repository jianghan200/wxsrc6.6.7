package com.tencent.mm.plugin.sns.ui;

import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class aj
{
  String iKw = "";
  long nQT = 0L;
  String nQU = "";
  int nQV = 0;
  long nro = 0L;
  int position = 0;
  
  public final boolean bCB()
  {
    long l = bi.bI(this.nQT);
    x.i("MicroMsg.ResumeSnsControl", "resume time %d", new Object[] { Long.valueOf(l) });
    x.i("MicroMsg.ResumeSnsControl", "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s", new Object[] { Long.valueOf(this.nQT), this.iKw, this.nQU, Long.valueOf(this.nro), Integer.valueOf(this.position), Integer.valueOf(this.nQV) });
    if ((l < 180000L) && (this.position > 0))
    {
      x.i("MicroMsg.ResumeSnsControl", "timeLastId is %d ", new Object[] { Long.valueOf(this.nro) });
      if (this.nro != 0L) {}
    }
    else
    {
      return false;
    }
    af.bye().z(this.nro, -1);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */