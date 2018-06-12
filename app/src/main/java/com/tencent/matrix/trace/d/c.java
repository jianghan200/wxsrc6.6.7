package com.tencent.matrix.trace.d;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;
import com.tencent.matrix.trace.c.a.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends a
  implements ViewTreeObserver.OnDrawListener, a.a
{
  private final com.tencent.matrix.trace.a.a bsS;
  private com.tencent.matrix.trace.c.a btJ;
  private boolean bum = false;
  private HashMap<String, Integer> bun;
  private SparseArray<String> buo;
  private LinkedList<Integer> bup;
  private SparseArray<LinkedList<Integer>> buq;
  
  public c(com.tencent.matrix.trace.a parama, com.tencent.matrix.trace.a.a parama1)
  {
    super(parama);
    this.bsS = parama1;
    this.bup = new LinkedList();
    this.bun = new HashMap();
    this.buo = new SparseArray();
    this.buq = new SparseArray();
    this.btJ = new com.tencent.matrix.trace.c.a(com.tencent.matrix.d.a.tJ(), parama1.bte);
  }
  
  protected final String getTag()
  {
    return "Trace_FPS";
  }
  
  public final void h(long paramLong1, long paramLong2)
  {
    String str;
    boolean bool;
    if ((!this.isBackground) && (this.bum))
    {
      ??? = this.bsS;
      str = this.btH;
      if (((com.tencent.matrix.trace.a.a)???).bsZ != null) {
        break label131;
      }
      bool = true;
    }
    for (;;)
    {
      int i;
      if (bool)
      {
        ??? = this.btH;
        if (!this.bun.containsKey(???)) {
          break label146;
        }
        i = ((Integer)this.bun.get(???)).intValue();
        i = (int)((i | 0x0) << 22 | (paramLong2 - paramLong1) / 10000L & 0x3FFFFF);
      }
      synchronized (this.bup)
      {
        this.bup.add(Integer.valueOf(i));
        this.bum = false;
        return;
        label131:
        bool = ((com.tencent.matrix.trace.a.a)???).bsZ.contains(str);
        continue;
        label146:
        i = this.bun.size() + 1;
        this.bun.put(???, Integer.valueOf(i));
        this.buo.put(i, ???);
      }
    }
  }
  
  public final void onActivityCreated(Activity paramActivity)
  {
    super.onActivityCreated(paramActivity);
  }
  
  public final void onBackground(Activity paramActivity)
  {
    super.onBackground(paramActivity);
    if (this.btJ != null)
    {
      this.btJ.cancel();
      this.btJ.a(this, false);
    }
  }
  
  public final void onChange(final Activity paramActivity, Fragment paramFragment)
  {
    super.onChange(paramActivity, paramFragment);
    com.tencent.matrix.d.b.i("Matrix.FPSTracer", "[onChange] activity:%s", new Object[] { paramActivity.getClass().getSimpleName() });
    paramActivity.getWindow().getDecorView().post(new Runnable()
    {
      public final void run()
      {
        paramActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(c.this);
        paramActivity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(c.this);
      }
    });
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    if (this.btJ != null)
    {
      this.btJ.cancel();
      this.btJ = null;
    }
    if (this.bun != null)
    {
      this.bun.clear();
      this.bun = null;
    }
    if (this.buo != null)
    {
      this.buo.clear();
      this.buo = null;
    }
    if (this.bup != null)
    {
      this.bup.clear();
      this.bup = null;
    }
    if (this.buq != null)
    {
      this.buq.clear();
      this.buq = null;
    }
  }
  
  public final void onDraw()
  {
    this.bum = true;
  }
  
  public final void onFront(Activity paramActivity)
  {
    super.onFront(paramActivity);
    if (this.btJ != null)
    {
      this.btJ.cancel();
      this.btJ.a(this, true);
    }
  }
  
  public final void tG()
  {
    Object localObject4;
    Object localObject5;
    int i;
    int j;
    synchronized (this.bup)
    {
      if (this.bup.isEmpty()) {
        return;
      }
      localObject4 = this.bup;
      this.bup = new LinkedList();
      localObject5 = ((LinkedList)localObject4).iterator();
      if (((Iterator)localObject5).hasNext())
      {
        i = ((Integer)((Iterator)localObject5).next()).intValue();
        j = i >> 22;
        LinkedList localLinkedList = (LinkedList)this.buq.get(j);
        ??? = localLinkedList;
        if (localLinkedList == null)
        {
          ??? = new LinkedList();
          this.buq.put(j, ???);
        }
        ((LinkedList)???).add(Integer.valueOf(0x3FFFFF & i));
      }
    }
    ((LinkedList)localObject4).clear();
    int k = 0;
    if (k < this.buq.size())
    {
      int i3 = this.buq.keyAt(k);
      localObject5 = (LinkedList)this.buq.get(i3);
      i = 0;
      int m = 0;
      int n = 0;
      Object localObject3 = new int[a.values().length];
      ??? = new int[a.values().length];
      Iterator localIterator = ((LinkedList)localObject5).iterator();
      label220:
      int i2;
      int i1;
      if (localIterator.hasNext())
      {
        localObject4 = (Integer)localIterator.next();
        i2 = i + ((Integer)localObject4).intValue();
        n += 1;
        i1 = ((Integer)localObject4).intValue() / 1600 - 1;
        if (i1 >= 42)
        {
          i = a.bus.index;
          localObject3[i] += 1;
          j = a.bus.index;
          i = ???[j];
        }
      }
      label306:
      label993:
      for (;;)
      {
        localObject4 = ???;
        localObject4[j] = (i + i1);
        float f;
        if (i2 >= this.bsS.bta * 100L)
        {
          f = Math.min(60.0F, 100000.0F * (n - m) / i2);
          com.tencent.matrix.d.b.i("Matrix.FPSTracer", "scene:%s fps:%s sumTime:%s [%s:%s]", new Object[] { this.buo.get(i3), Float.valueOf(f), Integer.valueOf(i2), Integer.valueOf(n), Integer.valueOf(m) });
        }
        for (;;)
        {
          try
          {
            localObject4 = new JSONObject();
            ((JSONObject)localObject4).put(a.but.name(), localObject3[a.but.index]);
            ((JSONObject)localObject4).put(a.buu.name(), localObject3[a.buu.index]);
            ((JSONObject)localObject4).put(a.buv.name(), localObject3[a.buv.index]);
            ((JSONObject)localObject4).put(a.buw.name(), localObject3[a.buw.index]);
            localObject3 = new JSONObject();
            ((JSONObject)localObject3).put(a.but.name(), ???[a.but.index]);
            ((JSONObject)localObject3).put(a.buu.name(), ???[a.buu.index]);
            ((JSONObject)localObject3).put(a.buv.name(), ???[a.buv.index]);
            ((JSONObject)localObject3).put(a.buw.name(), ???[a.buw.index]);
            ??? = new JSONObject();
            ((JSONObject)???).put("machine", this.bsS.aA(this.btG.application));
            ((JSONObject)???).put("scene", this.buo.get(i3));
            ((JSONObject)???).put("dropLevel", localObject4);
            ((JSONObject)???).put("dropSum", localObject3);
            ((JSONObject)???).put("fps", f);
            b((JSONObject)???);
            localObject3 = new int[a.values().length];
            ??? = new int[a.values().length];
            i = 0;
            j = n;
            m = j;
            break label220;
            if (i1 >= 12)
            {
              i = a.but.index;
              localObject3[i] += 1;
              j = a.but.index;
              i = ???[j];
              break label306;
            }
            if (i1 >= 6)
            {
              i = a.buu.index;
              localObject3[i] += 1;
              j = a.buu.index;
              i = ???[j];
              break label306;
            }
            if (i1 >= 2)
            {
              i = a.buv.index;
              localObject3[i] += 1;
              j = a.buv.index;
              i = ???[j];
              break label306;
            }
            i = a.buw.index;
            localObject3[i] += 1;
            j = a.buw.index;
            i = ???[j];
            if (i1 >= 0) {
              break label993;
            }
            i1 = 0;
            localObject4 = ???;
          }
          catch (JSONException localJSONException)
          {
            com.tencent.matrix.d.b.e("Matrix.FPSTracer", "json error", new Object[] { localJSONException });
            continue;
          }
          if (m > 0)
          {
            j = 0;
            while (j < m)
            {
              ((LinkedList)localObject5).removeFirst();
              j += 1;
            }
          }
          if (!((LinkedList)localObject5).isEmpty()) {
            com.tencent.matrix.d.b.d("Matrix.FPSTracer", "[doReport] sumTime:[%sms < %sms], scene:[%s]", new Object[] { Integer.valueOf(i / 100), Long.valueOf(this.bsS.bta), this.buo.get(i3) });
          }
          k += 1;
          break;
          i = i2;
          j = m;
        }
      }
    }
  }
  
  private static enum a
  {
    int index;
    
    private a(int paramInt)
    {
      this.index = paramInt;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */