package com.tencent.mm.cache;

import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Stack;

public final class b
  implements d<com.tencent.mm.t.b>
{
  private Stack<com.tencent.mm.t.b> dai;
  public Stack<com.tencent.mm.t.b> daj;
  public int dal;
  
  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
      localObject = this.dai.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((com.tencent.mm.t.b)((Iterator)localObject).next()).draw(paramCanvas);
      }
    }
    if ((this.dai != null) && (this.dai.size() > 0)) {}
    for (Object localObject = (com.tencent.mm.t.b)this.dai.peek();; localObject = null)
    {
      if (localObject != null) {
        ((com.tencent.mm.t.b)localObject).draw(paramCanvas);
      }
      return;
    }
  }
  
  public final void aV(boolean paramBoolean)
  {
    x.i("MicroMsg.DoodleCache", "[onSave] size:%s", new Object[] { Integer.valueOf(this.dai.size()) });
    if (this.daj != null) {
      this.daj.clear();
    }
    this.daj = ((Stack)this.dai.clone());
    if (paramBoolean) {
      this.dai.clear();
    }
  }
  
  public final int aW(boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean) {
      if (this.dai != null) {
        i = this.dai.size();
      }
    }
    while (this.daj == null) {
      return i;
    }
    return this.daj.size();
  }
  
  public final void c(Canvas paramCanvas)
  {
    Iterator localIterator = this.dai.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.t.b)localIterator.next()).draw(paramCanvas);
    }
  }
  
  public final void onCreate()
  {
    this.dai = new Stack();
  }
  
  public final void onDestroy()
  {
    x.i("MicroMsg.DoodleCache", "[onDestroy]");
    if (this.dai != null) {
      this.dai.clear();
    }
    if (this.daj != null) {
      this.daj.clear();
    }
  }
  
  public final void vN()
  {
    this.dal += 1;
  }
  
  public final void yo()
  {
    x.i("MicroMsg.DoodleCache", "[onRestore] size:%s", new Object[] { Integer.valueOf(this.dai.size()) });
    this.dai.clear();
    if (this.daj != null)
    {
      x.i("MicroMsg.DoodleCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.daj.size()) });
      this.dai.addAll(this.daj);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/cache/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */