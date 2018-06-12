package com.tencent.mm.plugin.game.gamewebview.d;

import com.tencent.mm.plugin.game.gamewebview.e.b;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public d jGU;
  private String jIl;
  private int jIm;
  private int jIn;
  public int jIo;
  public boolean jIp;
  public long jIq;
  public long jIr;
  public long jIs;
  public long jIt;
  public long jIu;
  
  public a(d paramd)
  {
    this.jGU = paramd;
    this.jIm = ao.getNetType(ad.getContext());
    if (paramd.getWebView().getIsX5Kernel()) {}
    for (int i = 1;; i = 2)
    {
      this.jIn = i;
      this.jIq = System.currentTimeMillis();
      this.jIl = this.jGU.getRawUrl();
      return;
    }
  }
  
  public final void a(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    h.mEJ.h(14531, new Object[] { this.jGU.getCacheAppId(), an.Dx(this.jIl), an.Dx(paramString), Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(this.jIm), Integer.valueOf(this.jIn), Integer.valueOf(paramInt3) });
  }
  
  public final void fn(boolean paramBoolean)
  {
    int i = 1;
    long l = System.currentTimeMillis() - this.jIt;
    x.d("MicroMsg.GameWebViewReportManager", "getA8keyTime = %d, success = %b", new Object[] { Long.valueOf(l), Boolean.valueOf(paramBoolean) });
    Object localObject = this.jGU.getCurrentURL();
    if (paramBoolean)
    {
      a((String)localObject, 3, l, i, 0);
      localObject = h.mEJ;
      if (!paramBoolean) {
        break label89;
      }
    }
    label89:
    for (l = 2L;; l = 1L)
    {
      ((h)localObject).a(607L, l, 1L, false);
      return;
      i = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */