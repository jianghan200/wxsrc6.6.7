package com.tencent.mm.plugin.order.a;

import android.os.Looper;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.p;
import com.tencent.mm.sdk.platformtools.ag;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class b
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private bv.a hTD = new b.3(this);
  private List<WeakReference<Object>> htB = new ArrayList();
  com.tencent.mm.plugin.order.model.b lNk = null;
  private com.tencent.mm.plugin.order.b.b lNl;
  private com.tencent.mm.plugin.order.model.c lNm = null;
  private bv.a lNn = new b.2(this);
  private ag mHandler = new ag(Looper.getMainLooper());
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("ORDERCOMMONMSGXML_TABLE".hashCode()), new b.1());
    com.tencent.mm.wallet_core.a.i("ShowOrdersInfoProcess", a.class);
  }
  
  public static String bav()
  {
    if (g.Eg().Dx()) {
      return com.tencent.mm.plugin.p.c.Gb() + "order";
    }
    return "";
  }
  
  public static b bmn()
  {
    return (b)p.v(b.class);
  }
  
  public static com.tencent.mm.plugin.order.b.b bmp()
  {
    g.Eg().Ds();
    if (bmn().lNl == null)
    {
      b localb = bmn();
      g.Ek();
      localb.lNl = new com.tencent.mm.plugin.order.b.b(g.Ei().dqq);
    }
    return bmn().lNl;
  }
  
  public static com.tencent.mm.plugin.order.model.c bmq()
  {
    g.Eg().Ds();
    if (bmn().lNm == null) {
      bmn().lNm = new com.tencent.mm.plugin.order.model.c();
    }
    return bmn().lNm;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void auM()
  {
    if (this.htB == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.htB.size())
      {
        WeakReference localWeakReference = (WeakReference)this.htB.get(i);
        if (localWeakReference != null) {
          localWeakReference.get();
        }
        i += 1;
      }
    }
  }
  
  public final void bmo()
  {
    if (this.htB == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.htB.size())
      {
        WeakReference localWeakReference = (WeakReference)this.htB.get(i);
        if (localWeakReference != null) {
          localWeakReference.get();
        }
        i += 1;
      }
    }
  }
  
  public final void bn(boolean paramBoolean)
  {
    this.lNk = null;
    this.lNm = null;
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */