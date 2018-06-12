package com.tencent.mm.plugin.ipcall.a.c;

import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public String countryCode = "";
  public String eNQ = "";
  public long koa = 0L;
  public int kpo = 0;
  public long kpp = 0L;
  public int kpr = 0;
  public int kqE = 0;
  public int kqF = 0;
  public int kqG = 0;
  public int kqH = 0;
  public int kqI = 0;
  public long kqJ = 0L;
  public long kqK = 0L;
  public int kqL = 0;
  public long kqM = 0L;
  public int kqN = 0;
  public long kqO = 0L;
  public int kqP = 0;
  public String kqQ = "";
  public long kqR = 0L;
  public long kqS = 0L;
  public long kqT = 0L;
  public long kqU = 0L;
  public String kqV = "";
  public String kqW = "";
  public String kqX = "";
  public long kqY = 0L;
  public long kqZ = 0L;
  public long kra = 0L;
  public int krb = 0;
  public int krc = 0;
  public int krd = 0;
  public int kre = 0;
  
  public final void aXM()
  {
    x.i("MicroMsg.IPCallReportHelper", "selfShutdown");
    this.kqI = 1;
  }
  
  public final void aXN()
  {
    x.i("MicroMsg.IPCallReportHelper", "selfCancel");
    this.kqH = 1;
    if ((this.kra == 0L) && (this.kqR != 0L))
    {
      this.kra = (System.currentTimeMillis() - this.kqR);
      x.d("MicroMsg.IPCallReportHelper", "cancelTime: %d", new Object[] { Long.valueOf(this.kra) });
    }
  }
  
  public final void aXO()
  {
    x.i("MicroMsg.IPCallReportHelper", "channelConnect");
    this.kqL = 1;
  }
  
  public final void aXP()
  {
    if (this.krd == 0) {
      this.krd = 1;
    }
  }
  
  public final void aXQ()
  {
    x.d("MicroMsg.IPCallReportHelper", "markConnect");
    if (this.kqY == 0L)
    {
      this.kqY = System.currentTimeMillis();
      this.kqZ = (this.kqY - this.kqR);
      x.d("MicroMsg.IPCallReportHelper", "connectTime: %d", new Object[] { Long.valueOf(this.kqZ) });
    }
  }
  
  public final void aXR()
  {
    x.d("MicroMsg.IPCallReportHelper", "markStartTalk");
    if (this.kqT == 0L) {
      this.kqT = System.currentTimeMillis();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */