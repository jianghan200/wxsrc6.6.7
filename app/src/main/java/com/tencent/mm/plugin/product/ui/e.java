package com.tencent.mm.plugin.product.ui;

import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  int lSC;
  int lSD;
  
  public e(int paramInt1, int paramInt2)
  {
    this.lSD = paramInt1;
    this.lSC = paramInt2;
  }
  
  public final boolean bne()
  {
    if ((this.lSD & 0x1) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.MallProductConfig", "isFreePost, ret = " + bool);
      return bool;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/product/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */