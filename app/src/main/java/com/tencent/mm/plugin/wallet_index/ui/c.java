package com.tencent.mm.plugin.wallet_index.ui;

import com.tencent.mm.plugin.wallet_index.c.g;
import com.tencent.mm.protocal.c.anm;
import com.tencent.mm.protocal.c.ann;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  String iiv = null;
  int lQa;
  public int mCount = 1;
  public String pCK = null;
  public String pCL = null;
  public anm pCP;
  public ann pCQ;
  public String pDh = null;
  public ArrayList<String> pDk = new ArrayList();
  public ArrayList<String> pDl = new ArrayList();
  public String pDm = null;
  public int pDn = 0;
  List<String> pDo = new ArrayList();
  boolean pDp = false;
  public String pDq;
  public String pDr;
  
  public final com.tencent.mm.ab.l a(com.tencent.mm.plugin.wallet_index.b.a.c paramc, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 2; this.pDp; i = 1)
    {
      if (!bRe())
      {
        this.pCP.rQk = paramc.ogj;
        this.pCP.rQh = paramc.pCI;
        this.pCP.lPj = paramc.pCL;
        this.pCP.rFe = paramc.pCK;
        this.pCP.lRl = paramc.iiv;
        this.pCP.rQj = paramc.pCJ;
      }
      return new g(this.lQa, i, paramc.iiv, this.pCQ, this.pCP);
    }
    return new com.tencent.mm.wallet_core.c.l(paramc.iiv, i, this.lQa, this.mCount, paramc.pCI, paramc.pCJ, paramc.ogj, paramc.pCK, paramc.pCL);
  }
  
  public final boolean bRe()
  {
    return this.lQa == 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */