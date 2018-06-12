package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.util.SparseArray;
import com.tencent.mm.plugin.webview.modelcache.q;
import com.tencent.mm.plugin.webview.modelcache.q.a;
import com.tencent.mm.sdk.platformtools.x;

public final class h
{
  private static final SparseArray<g> qkh = new SparseArray();
  private static volatile g qki = null;
  
  public static g Bh(int paramInt)
  {
    try
    {
      if (qkh.get(paramInt) == null)
      {
        localg = new g(paramInt);
        qkh.put(paramInt, localg);
      }
      g localg = (g)qkh.get(paramInt);
      qki = localg;
      return localg;
    }
    finally {}
  }
  
  @Deprecated
  public static g bYs()
  {
    if (qki == null) {
      qki = new g(0);
    }
    return qki;
  }
  
  public static void detach()
  {
    x.i("MicroMsg.MsgHandlerHolder", "detach");
    int i = 0;
    for (;;)
    {
      try
      {
        if (i < qkh.size())
        {
          g localg = (g)qkh.valueAt(i);
          int j = qkh.keyAt(i);
          if (localg != null) {
            q.a.bUL().Ar(j);
          }
        }
        else
        {
          qkh.clear();
          if (qki != null)
          {
            q.a.bUL().Ar(0);
            qki = null;
          }
          return;
        }
      }
      finally {}
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/jsapi/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */