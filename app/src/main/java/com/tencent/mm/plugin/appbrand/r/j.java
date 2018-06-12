package com.tencent.mm.plugin.appbrand.r;

public final class j
  implements l
{
  final l gBL;
  int gBM = 0;
  int gBN = -1;
  int gBO = -1;
  Object gBP = null;
  
  public j(l paraml)
  {
    this.gBL = paraml;
  }
  
  public final void aoz()
  {
    if (this.gBM == 0) {
      return;
    }
    switch (this.gBM)
    {
    }
    for (;;)
    {
      this.gBP = null;
      this.gBM = 0;
      return;
      this.gBL.bR(this.gBN, this.gBO);
      continue;
      this.gBL.bS(this.gBN, this.gBO);
      continue;
      this.gBL.d(this.gBN, this.gBO, this.gBP);
    }
  }
  
  public final void bR(int paramInt1, int paramInt2)
  {
    if ((this.gBM == 1) && (paramInt1 >= this.gBN) && (paramInt1 <= this.gBN + this.gBO))
    {
      this.gBO += paramInt2;
      this.gBN = Math.min(paramInt1, this.gBN);
      return;
    }
    aoz();
    this.gBN = paramInt1;
    this.gBO = paramInt2;
    this.gBM = 1;
  }
  
  public final void bS(int paramInt1, int paramInt2)
  {
    if ((this.gBM == 2) && (this.gBN >= paramInt1) && (this.gBN <= paramInt1 + paramInt2))
    {
      this.gBO += paramInt2;
      this.gBN = paramInt1;
      return;
    }
    aoz();
    this.gBN = paramInt1;
    this.gBO = paramInt2;
    this.gBM = 2;
  }
  
  public final void bT(int paramInt1, int paramInt2)
  {
    aoz();
    this.gBL.bT(paramInt1, paramInt2);
  }
  
  public final void d(int paramInt1, int paramInt2, Object paramObject)
  {
    if ((this.gBM == 3) && (paramInt1 <= this.gBN + this.gBO) && (paramInt1 + paramInt2 >= this.gBN) && (this.gBP == paramObject))
    {
      int i = this.gBN;
      int j = this.gBO;
      this.gBN = Math.min(paramInt1, this.gBN);
      this.gBO = (Math.max(i + j, paramInt1 + paramInt2) - this.gBN);
      return;
    }
    aoz();
    this.gBN = paramInt1;
    this.gBO = paramInt2;
    this.gBP = paramObject;
    this.gBM = 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/r/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */