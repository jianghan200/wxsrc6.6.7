package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;

public final class n
  extends e
{
  final boolean qsT;
  public final boolean qsU;
  
  public n(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, paramInt2);
    this.qsT = paramBoolean1;
    this.qsU = paramBoolean2;
  }
  
  public final boolean a(e parame)
  {
    if (parame == null) {}
    label83:
    label86:
    do
    {
      for (;;)
      {
        return false;
        if (!parame.isEmpty()) {
          break;
        }
        int i;
        if ((parame.Tw >= this.Tw) && (parame.tK < this.tK))
        {
          i = 1;
          if ((parame.Tw < this.Tw) || (parame.tK > this.tK)) {
            break label83;
          }
        }
        for (int j = 1;; j = 0)
        {
          if ((i == 0) && ((j == 0) || (!this.qsU))) {
            break label86;
          }
          return true;
          i = 0;
          break;
        }
      }
    } while (Math.max(this.Tw, parame.Tw) >= Math.min(this.tK, parame.tK));
    return true;
  }
  
  public final int caK()
  {
    return Math.abs(this.tK - this.Tw);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */