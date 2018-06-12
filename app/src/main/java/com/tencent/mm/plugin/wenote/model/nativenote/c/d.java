package com.tencent.mm.plugin.wenote.model.nativenote.c;

import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;

public final class d
{
  public int dHJ = -1;
  public int endPos = -1;
  public int qsa = -1;
  public int startOffset = -1;
  
  public d()
  {
    set(-1, -1, -1, -1);
  }
  
  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    set(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final int cao()
  {
    int i = 1;
    if ((this.dHJ < 0) || (this.startOffset < 0) || (this.endPos < 0) || (this.qsa < 0) || (this.dHJ > this.endPos) || ((this.dHJ == this.endPos) && (this.startOffset > this.qsa))) {
      i = 0;
    }
    b localb1;
    do
    {
      return i;
      localb1 = c.bZD().Bv(this.dHJ);
      b localb2 = c.bZD().Bv(this.endPos);
      if ((localb1 == null) || (localb2 == null)) {
        return 0;
      }
    } while ((this.dHJ == this.endPos) && (this.startOffset == this.qsa));
    if ((this.dHJ == this.endPos) && (localb1.getType() == 1)) {
      return 2;
    }
    return 3;
  }
  
  public final void set(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.dHJ = paramInt1;
    this.startOffset = paramInt2;
    this.endPos = paramInt3;
    this.qsa = paramInt4;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */