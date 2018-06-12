package com.tencent.mm.cache;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.t.e;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public final class c
  implements d<com.tencent.mm.t.c>
{
  public Stack<com.tencent.mm.t.c> dai;
  public Stack<com.tencent.mm.t.c> daj;
  private int dal;
  
  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
      localObject = this.dai.iterator();
      while (((Iterator)localObject).hasNext())
      {
        com.tencent.mm.t.c localc = (com.tencent.mm.t.c)((Iterator)localObject).next();
        if (!localc.dnN) {
          localc.draw(paramCanvas);
        }
      }
    }
    Object localObject = ys();
    if ((localObject != null) && (!((com.tencent.mm.t.c)localObject).dnN)) {
      ((com.tencent.mm.t.c)localObject).draw(paramCanvas);
    }
  }
  
  public final void a(com.tencent.mm.t.c paramc)
  {
    if (this.dai != null) {
      this.dai.push(paramc);
    }
  }
  
  public final void aV(boolean paramBoolean)
  {
    x.i("MicroMsg.EmojiAndTextCache", "[onSave] size:%s isExit:%s", new Object[] { Integer.valueOf(this.dai.size()), Boolean.valueOf(paramBoolean) });
    if (this.daj != null) {
      this.daj.clear();
    }
    this.daj = new Stack();
    Iterator localIterator = this.dai.iterator();
    com.tencent.mm.t.c localc;
    while (localIterator.hasNext())
    {
      localc = (com.tencent.mm.t.c)localIterator.next();
      this.daj.push(localc.CL());
    }
    x.i("MicroMsg.EmojiAndTextCache", "[onSave] mLastStack size:%s", new Object[] { Integer.valueOf(this.daj.size()) });
    if (paramBoolean)
    {
      this.dai.clear();
      localIterator = this.daj.iterator();
      while (localIterator.hasNext())
      {
        localc = (com.tencent.mm.t.c)localIterator.next();
        x.d("MicroMsg.EmojiItem", "[recycleBitmap]");
        if ((localc.dnJ != null) && (!localc.dnJ.isRecycled())) {
          localc.dnJ.recycle();
        }
      }
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
  
  public final void b(com.tencent.mm.t.c paramc)
  {
    if (paramc == null) {
      return;
    }
    int i = this.dai.indexOf(paramc);
    this.dai.remove(i);
    this.dai.push(paramc);
  }
  
  public final void c(Canvas paramCanvas)
  {
    Iterator localIterator = this.dai.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.t.c localc = (com.tencent.mm.t.c)localIterator.next();
      localc.setSelected(false);
      localc.draw(paramCanvas);
    }
  }
  
  public final void onCreate()
  {
    x.i("MicroMsg.EmojiAndTextCache", "[onCreate]");
    this.dai = new Stack();
  }
  
  public final void onDestroy()
  {
    x.i("MicroMsg.EmojiAndTextCache", "[onDestroy]");
    Iterator localIterator;
    if (this.dai != null)
    {
      localIterator = this.dai.iterator();
      while (localIterator.hasNext()) {
        ((com.tencent.mm.t.c)localIterator.next()).clear();
      }
      this.dai.clear();
    }
    if (this.daj != null)
    {
      localIterator = this.daj.iterator();
      while (localIterator.hasNext()) {
        ((com.tencent.mm.t.c)localIterator.next()).clear();
      }
      this.daj.clear();
    }
  }
  
  public final void vN()
  {
    this.dal += 1;
  }
  
  public final void yo()
  {
    x.i("MicroMsg.EmojiAndTextCache", "[onRestore] size:%s isExit:%s", new Object[] { Integer.valueOf(this.dai.size()), Boolean.valueOf(false) });
    this.dai.clear();
    if (this.daj != null)
    {
      x.i("MicroMsg.EmojiAndTextCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.daj.size()) });
      this.dai.addAll(this.daj);
    }
    x.i("MicroMsg.EmojiAndTextCache", "[onRestore] mCurStack size:%s ", new Object[] { Integer.valueOf(this.dai.size()) });
    Iterator localIterator = this.dai.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.t.c)localIterator.next()).CG();
    }
  }
  
  public final com.tencent.mm.t.c yr()
  {
    return (com.tencent.mm.t.c)this.dai.pop();
  }
  
  public final com.tencent.mm.t.c ys()
  {
    if ((this.dai != null) && (this.dai.size() > 0)) {
      return (com.tencent.mm.t.c)this.dai.peek();
    }
    return null;
  }
  
  public final ListIterator<com.tencent.mm.t.c> yt()
  {
    return this.dai.listIterator(this.dai.size());
  }
  
  public final int[] yu()
  {
    int[] arrayOfInt = new int[2];
    if (this.daj != null)
    {
      Iterator localIterator = this.daj.iterator();
      while (localIterator.hasNext()) {
        if (((com.tencent.mm.t.c)localIterator.next() instanceof e)) {
          arrayOfInt[1] += 1;
        } else {
          arrayOfInt[0] += 1;
        }
      }
    }
    return arrayOfInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/cache/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */