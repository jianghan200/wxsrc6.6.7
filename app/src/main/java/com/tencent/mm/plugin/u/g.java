package com.tencent.mm.plugin.u;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;

public final class g
{
  public long aeq = 0L;
  private boolean hEj;
  public long lcT = 0L;
  public long lcU = 0L;
  public long lcV = -1L;
  public long lcW = 0L;
  public long lcX = 0L;
  public long lcY = 0L;
  public long lcZ = 10L;
  public boolean lda = true;
  public boolean ldb = true;
  public boolean ldc = false;
  public boolean ldd = false;
  boolean lde = false;
  boolean ldf = false;
  
  public g(boolean paramBoolean)
  {
    this.hEj = paramBoolean;
  }
  
  public final void Hl(String paramString)
  {
    if (!this.lda) {
      return;
    }
    h.mEJ.a(354L, 152L, 1L, false);
    h.mEJ.h(13836, new Object[] { Integer.valueOf(500), Long.valueOf(bi.VE()), paramString });
  }
  
  public final void Hm(String paramString)
  {
    if (!this.lda) {
      return;
    }
    h.mEJ.a(354L, 153L, 1L, false);
    h.mEJ.h(13836, new Object[] { Integer.valueOf(501), Long.valueOf(bi.VE()), paramString });
  }
  
  public final String avA()
  {
    return hashCode();
  }
  
  public final void bdv()
  {
    if (!this.lda) {
      return;
    }
    h.mEJ.a(354L, 155L, 1L, false);
    h.mEJ.h(13836, new Object[] { Integer.valueOf(503), Long.valueOf(bi.VE()), "" });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/u/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */