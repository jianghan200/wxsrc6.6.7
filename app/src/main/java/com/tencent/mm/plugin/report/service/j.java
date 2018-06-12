package com.tencent.mm.plugin.report.service;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.k;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.platformtools.u;
import com.tencent.mm.platformtools.u.a;
import com.tencent.mm.plugin.report.a.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.List;

public class j
  implements ar
{
  private static HashMap<Integer, h.d> hsC;
  private u.a hsE;
  private c hss = new c() {};
  public boolean mDt = false;
  public HashMap<String, List<d>> mFb;
  public HashMap<String, String> mFc;
  
  static
  {
    HashMap localHashMap = new HashMap();
    hsC = localHashMap;
    localHashMap.put(Integer.valueOf("DUPLICATEKVLOG_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return b.diD;
      }
    });
  }
  
  public static j brV()
  {
    return (j)p.v(j.class);
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    long l = System.currentTimeMillis();
    String str = g.Ei().cachePath + "CommonOneMicroMsg.db";
    this.hsE = u.a(hashCode(), str, hsC, false);
    x.i("MicroMsg.SubCoreReport", "summeranrt onAccountPostReset tid[%d] [%d]ms, stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - l), bi.cjd() });
    com.tencent.mm.sdk.b.a.sFg.b(this.hss);
    this.mFb = new HashMap();
    this.mFc = new HashMap();
    g.Ek();
    g.Em().H(new Runnable()
    {
      public final void run()
      {
        if (!g.Eg().Dx()) {
          return;
        }
        bi.g(g.Ei().cachePath + "logcat/", "temp_", 10800000L);
      }
      
      public final String toString()
      {
        return super.toString() + "|onAccountPostReset";
      }
    });
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    if (brV() != null)
    {
      j localj = brV();
      if (localj.hsE != null)
      {
        localj.hsE.iQ(localj.hashCode());
        localj.hsE = null;
      }
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.hss);
    if (this.mFb != null) {
      this.mFb.clear();
    }
    if (this.mFc != null) {
      this.mFc.clear();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */