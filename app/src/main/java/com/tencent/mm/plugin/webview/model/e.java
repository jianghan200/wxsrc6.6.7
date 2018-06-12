package com.tencent.mm.plugin.webview.model;

import android.content.ContentValues;
import android.os.HandlerThread;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.c.cg;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.av.b;
import com.tencent.mm.sdk.platformtools.av.c;

public final class e
  implements av.c<Integer, Long>
{
  public static final String[] diD = { i.a(fgt, "JsLogBlockList") };
  private static final c.a fgt = ;
  public final h dCZ;
  public final av<Integer, Long> pRc;
  private long pRd;
  
  public e(h paramh)
  {
    this.dCZ = paramh;
    this.pRc = new av(this, au.Em().lnJ.getLooper(), 100, 20, 300000L, 1000L);
  }
  
  public final boolean Sc()
  {
    if (this.dCZ.inTransaction()) {}
    do
    {
      return false;
      this.pRd = this.dCZ.dO(Thread.currentThread().getId());
    } while (this.pRd <= 0L);
    return true;
  }
  
  public final void Sd()
  {
    if (this.pRd > 0L) {
      this.dCZ.gp(this.pRd);
    }
  }
  
  public final void a(av<Integer, Long> paramav, av.b<Integer, Long> paramb)
  {
    switch (paramb.sIz)
    {
    default: 
      return;
    case 2: 
      this.dCZ.delete("JsLogBlockList", "logId=" + paramb.qSV, null);
      return;
    }
    paramav = new ContentValues(2);
    paramav.put("logId", (Integer)paramb.qSV);
    paramav.put("liftTime", (Long)paramb.values);
    this.dCZ.replace("JsLogBlockList", "logId", paramav);
  }
  
  public final void bTV()
  {
    this.pRc.li(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */