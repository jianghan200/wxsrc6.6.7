package com.tencent.mm.plugin.location.model;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.location.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class j
  implements com.tencent.mm.pluginsdk.location.a
{
  int h = 300;
  HashMap<Long, WeakReference<ImageView>> kCU = new HashMap();
  HashMap<Long, bd.b> kCV = new HashMap();
  HashMap<Long, WeakReference<ProgressBar>> kCW = new HashMap();
  HashMap<Long, WeakReference<ImageView>> kCX = new HashMap();
  HashMap<bd.b, bd> kCY = new HashMap();
  HashMap<Long, Integer> kCZ = new HashMap();
  HashSet<Long> kDa = new HashSet();
  int w = 300;
  
  public j()
  {
    start();
  }
  
  public final void a(b paramb)
  {
    if (paramb == null) {}
    label4:
    do
    {
      do
      {
        do
        {
          break label4;
          do
          {
            return;
          } while (!this.kCV.containsKey(Long.valueOf(paramb.qyC)));
          paramb = (bd.b)this.kCV.get(Long.valueOf(paramb.qyC));
          paramb = (bd)this.kCY.remove(paramb);
        } while (paramb == null);
        this.kCU.get(Long.valueOf(paramb.field_msgId));
      } while ((paramb == null) || ((paramb.cGH >= 0) && (paramb.cGH <= 5)));
      paramb.fj(0);
      paramb.fj(paramb.cGH + 1);
    } while (!com.tencent.mm.kernel.g.Eg().Dx());
    ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(paramb.field_msgId, paramb);
    x.i("MicroMsg.StaticMapMsgLogic", "on error count %d", new Object[] { Integer.valueOf(paramb.cGH) });
  }
  
  public final void a(String paramString, b paramb)
  {
    if (paramb == null) {}
    label4:
    WeakReference localWeakReference;
    do
    {
      do
      {
        break label4;
        do
        {
          return;
        } while (!this.kCV.containsKey(Long.valueOf(paramb.qyC)));
        paramb = (bd.b)this.kCV.get(Long.valueOf(paramb.qyC));
        paramb = (bd)this.kCY.remove(paramb);
      } while (paramb == null);
      localWeakReference = (WeakReference)this.kCU.get(Long.valueOf(paramb.field_msgId));
    } while ((localWeakReference == null) || (localWeakReference.get() == null) || (!this.kCZ.containsKey(Long.valueOf(paramb.field_msgId))));
    int i = ((Integer)this.kCZ.remove(Long.valueOf(paramb.field_msgId))).intValue();
    if (paramb.field_isSend == 0) {}
    for (boolean bool = true;; bool = false)
    {
      ((ImageView)localWeakReference.get()).setImageBitmap(o.Pf().a(paramb.field_msgId, paramString, i, this.w, this.h, bool));
      paramString = (WeakReference)this.kCW.remove(Long.valueOf(paramb.field_msgId));
      if ((paramString != null) && (paramString.get() != null)) {
        ((ProgressBar)paramString.get()).setVisibility(8);
      }
      paramString = (WeakReference)this.kCX.remove(Long.valueOf(paramb.field_msgId));
      if ((paramString == null) || (paramString.get() == null)) {
        break;
      }
      ((ImageView)paramString.get()).setVisibility(0);
      return;
    }
  }
  
  public final void start()
  {
    k localk = l.aZg();
    if (this != null)
    {
      Iterator localIterator = localk.cWy.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!equals((com.tencent.mm.pluginsdk.location.a)localIterator.next()));
    }
    do
    {
      return;
      localk.cWy.add(this);
      x.i("MicroMsg.StaticMapServer", "addMapCallBack " + localk.cWy.size());
    } while (localk.cWy.size() != 1);
    localk.start();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/location/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */