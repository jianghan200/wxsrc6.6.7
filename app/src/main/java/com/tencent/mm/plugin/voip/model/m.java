package com.tencent.mm.plugin.voip.model;

import com.tencent.mm.plugin.voip.b.a;

public final class m
{
  long beginTime = 0L;
  public int oKQ;
  public int oKR;
  public int oKS;
  public int oKT;
  byte oKU;
  byte oKV;
  byte oKW;
  byte oKX;
  byte oKY;
  byte oKZ;
  long oLA;
  byte oLa;
  int oLb;
  public int oLc;
  public int oLd;
  public int oLe;
  public int oLf;
  public int oLg;
  public int oLh;
  public int oLi;
  int oLj;
  int oLk;
  int oLl;
  int oLm;
  int oLn;
  int oLo;
  int oLp;
  int oLq;
  public long oLr;
  long oLs;
  long oLt;
  long oLu;
  long oLv;
  public long oLw;
  long oLx;
  long oLy;
  long oLz;
  
  public m()
  {
    reset();
    bKg();
  }
  
  public final void bKf()
  {
    if (this.oLw == 0L) {}
    for (this.oLm = 0;; this.oLm = ((int)(System.currentTimeMillis() - this.oLw)))
    {
      a.eU("MicroMsg.VoipDailReport", "devin:answerInvite current:" + System.currentTimeMillis());
      a.eU("MicroMsg.VoipDailReport", "devin:answerInvite:" + this.oLm);
      return;
    }
  }
  
  public final void bKg()
  {
    this.oLr = 0L;
    this.oLv = 0L;
    this.oLw = 0L;
    this.oLx = 0L;
    this.oLy = 0L;
    this.oLz = 0L;
    this.oLs = 0L;
    this.oLt = 0L;
    this.oLu = 0L;
    this.oLc = 0;
    this.oLd = 0;
    this.oLe = 0;
    this.oLf = 0;
    this.oLg = 0;
    this.oLh = 0;
    this.oLi = 0;
    this.oLj = 0;
    this.oLk = 0;
    this.oLl = 0;
    this.oLm = 0;
    this.oLn = 0;
    this.oLo = 0;
    this.oLp = 0;
    this.oLq = 0;
  }
  
  public final String bKh()
  {
    return "," + this.oLa;
  }
  
  public final void reset()
  {
    this.beginTime = 0L;
    this.oKQ = 0;
    this.oKR = 0;
    this.oKS = 0;
    this.oKT = 0;
    this.oKU = 0;
    this.oKV = 0;
    this.oKW = 0;
    this.oKX = 0;
    this.oKY = 0;
    this.oKZ = 0;
    this.oLa = 0;
    this.oLb = 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */