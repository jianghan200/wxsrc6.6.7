package com.tencent.mm.ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.widget.BaseAdapter;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public abstract class r<T>
  extends BaseAdapter
  implements j.a, m.b
{
  public Context context;
  public int count;
  private ag msM = new ag(Looper.getMainLooper());
  private Cursor tdV = null;
  public T tlE;
  public Map<Integer, T> tlF = null;
  public a tlG;
  private int tlH = 0;
  private int tlI = 0;
  private int tlJ = 0;
  private Runnable tlK = new r.1(this);
  
  public r(Context paramContext, T paramT)
  {
    this.tlE = paramT;
    this.context = paramContext;
    this.count = -1;
  }
  
  private void cpY()
  {
    x.v("MicroMsg.MListAdapter", "ashutest:: on UI, directly call resetCursor Job");
    if (this.tlG != null) {
      this.tlG.Xa();
    }
    aYc();
    WT();
    if (this.tlG != null) {
      this.tlG.Xb();
    }
  }
  
  public abstract void WS();
  
  public abstract void WT();
  
  public abstract T a(T paramT, Cursor paramCursor);
  
  public void a(int paramInt, m paramm, Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      x.d("MicroMsg.MListAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      return;
    }
    a((String)paramObject, null);
  }
  
  public void a(String paramString, l paraml)
  {
    cpY();
  }
  
  public final int aFL()
  {
    if (this.count < 0) {
      this.count = getCursor().getCount();
    }
    return this.count;
  }
  
  public int aUZ()
  {
    return 0;
  }
  
  public T aVa()
  {
    return (T)this.tlE;
  }
  
  public void aYc()
  {
    if (this.tlF != null) {
      this.tlF.clear();
    }
    if (this.tdV != null) {
      this.tdV.close();
    }
    this.count = -1;
  }
  
  public int getCount()
  {
    if (this.count < 0) {
      this.count = getCursor().getCount();
    }
    return this.count + aUZ();
  }
  
  public final Cursor getCursor()
  {
    if ((this.tdV == null) || (this.tdV.isClosed()))
    {
      WS();
      Assert.assertNotNull(this.tdV);
    }
    return this.tdV;
  }
  
  public T getItem(int paramInt)
  {
    if (qY(paramInt)) {
      localObject1 = aVa();
    }
    Object localObject2;
    do
    {
      return (T)localObject1;
      if (this.tlF == null) {
        break;
      }
      localObject2 = this.tlF.get(Integer.valueOf(paramInt));
      localObject1 = localObject2;
    } while (localObject2 != null);
    if ((paramInt < 0) || (!getCursor().moveToPosition(paramInt))) {
      return null;
    }
    if (this.tlF == null) {
      return (T)a(this.tlE, getCursor());
    }
    Object localObject1 = a(null, getCursor());
    this.tlF.put(Integer.valueOf(paramInt), localObject1);
    return (T)localObject1;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final void lB(boolean paramBoolean)
  {
    if (!paramBoolean) {
      if (this.tlF != null)
      {
        this.tlF.clear();
        this.tlF = null;
      }
    }
    while (this.tlF != null) {
      return;
    }
    this.tlF = new HashMap();
  }
  
  public boolean qY(int paramInt)
  {
    return (paramInt >= this.count) && (paramInt < this.count + aUZ());
  }
  
  public final void setCursor(Cursor paramCursor)
  {
    this.tdV = paramCursor;
    this.count = -1;
  }
  
  public static abstract interface a
  {
    public abstract void Xa();
    
    public abstract void Xb();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */