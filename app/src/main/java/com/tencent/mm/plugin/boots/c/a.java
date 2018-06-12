package com.tencent.mm.plugin.boots.c;

import com.tencent.mm.plugin.boots.a.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class a
  implements f
{
  public static a hjJ;
  private com.tencent.mm.plugin.boots.c.a.a hjK;
  
  public a(com.tencent.mm.plugin.boots.c.a.a parama)
  {
    this.hjK = parama;
  }
  
  public final List<com.tencent.mm.plugin.boots.a.a> aua()
  {
    if (this.hjK != null) {
      return this.hjK.aua();
    }
    return null;
  }
  
  public final void c(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i = 255;
    if (this.hjK != null)
    {
      com.tencent.mm.plugin.boots.a.a locala = this.hjK.nf(paramInt1);
      paramInt1 = this.hjK.ne(paramInt1);
      if ((paramBoolean) && (locala.field_dau != paramInt1))
      {
        if (paramInt1 <= 255) {
          break label67;
        }
        paramInt1 = i;
      }
      label67:
      for (;;)
      {
        h.mEJ.a(paramInt2, paramInt1, 1L, false);
        return;
      }
    }
    x.w("MicroMsg.Boots.TinkerLogic", "storage is null.");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/boots/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */