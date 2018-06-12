package com.tencent.mm.plugin.location.ui.impl;

import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.protocal.c.ays;

public final class f
{
  public double bhC;
  public double bhD;
  public String kJA;
  public String kJB;
  public String kJC;
  public String kJD;
  public Addr kJE;
  public String kJF;
  public String kJG;
  public int kJH = -1;
  public String kJu;
  public String kJv;
  public String kJw;
  public String kJx;
  public String kJy;
  public String kJz;
  public String mName;
  public int type;
  
  public f() {}
  
  public f(ays paramays, String paramString)
  {
    this.mName = paramays.jPe;
    this.kJu = paramays.sbw;
    this.bhD = paramays.rji;
    this.bhC = paramays.rjj;
    this.kJv = paramays.sbx;
    this.kJw = paramays.lCN;
    this.kJx = paramays.sby;
    this.kJy = paramays.eJI;
    this.kJz = paramays.eJJ;
    this.kJA = paramays.ruY;
    this.kJB = paramays.ruZ;
    this.kJC = paramays.sbz;
    this.kJF = paramString;
    this.kJE = new Addr();
    this.kJE.dRH = this.kJu;
    this.kJE.dRJ = this.kJz;
    this.kJE.dRK = this.kJz;
    this.kJE.dRL = this.kJA;
    this.kJE.dRN = this.kJC;
    this.kJE.dRQ = this.mName;
    this.kJE.dRI = this.kJy;
    this.kJE.dRT = ((float)paramays.rji);
    this.kJE.dRS = ((float)paramays.rjj);
    this.type = 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/location/ui/impl/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */