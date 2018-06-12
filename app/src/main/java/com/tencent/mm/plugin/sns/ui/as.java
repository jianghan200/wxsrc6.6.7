package com.tencent.mm.plugin.sns.ui;

import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.ap.b;

public final class as
{
  public String bNH;
  public String bSZ;
  public boolean nZw = false;
  public boolean nZx = false;
  public int scene;
  
  public as(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    this.bSZ = paramString1;
    this.nZw = paramBoolean1;
    this.nZx = paramBoolean2;
    this.scene = paramInt;
    this.bNH = paramString2;
  }
  
  public final boolean bDG()
  {
    int i = 2;
    if (this.scene == 1) {}
    for (;;)
    {
      ap.b localb = ap.Mq(this.bSZ);
      if ((localb != null) && (localb.dDR) && (!localb.dHC) && ((i & localb.csE) != 0))
      {
        return true;
        if (this.scene == 2) {
          i = 4;
        }
      }
      else
      {
        return false;
      }
      i = -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */