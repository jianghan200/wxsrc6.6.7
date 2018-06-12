package com.tencent.mm.cache;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Stack;

public final class a
  implements d<com.tencent.mm.t.a>
{
  public Stack<com.tencent.mm.t.a> dai;
  private Stack<com.tencent.mm.t.a> daj;
  public Matrix dak = new Matrix();
  private int dal;
  
  public final void a(Canvas paramCanvas, boolean paramBoolean) {}
  
  public final void a(com.tencent.mm.t.a parama)
  {
    if (this.dai != null) {
      this.dai.push(parama);
    }
  }
  
  public final void aV(boolean paramBoolean)
  {
    x.i("MicroMsg.CropCache", "[onSave] size:%s", new Object[] { Integer.valueOf(this.dai.size()) });
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
  
  public final void c(Canvas paramCanvas) {}
  
  public final void onCreate()
  {
    x.i("MicroMsg.CropCache", "[onCreate]");
    this.dai = new Stack();
  }
  
  public final void onDestroy()
  {
    if (this.dai != null) {
      this.dai.clear();
    }
    if (this.daj != null) {
      this.daj.clear();
    }
    this.dak.reset();
  }
  
  public final void vN()
  {
    this.dal += 1;
  }
  
  public final void yo()
  {
    x.i("MicroMsg.CropCache", "[onRestore] size:%s", new Object[] { Integer.valueOf(this.dai.size()) });
    this.dai.clear();
    if (this.daj != null)
    {
      x.i("MicroMsg.CropCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.daj.size()) });
      this.dai.addAll(this.daj);
    }
  }
  
  public final com.tencent.mm.t.a yp()
  {
    if (this.dai.size() <= 0)
    {
      x.e("MicroMsg.CropCache", "[pop]");
      return null;
    }
    return (com.tencent.mm.t.a)this.dai.pop();
  }
  
  public final com.tencent.mm.t.a yq()
  {
    if ((this.dai != null) && (this.dai.size() > 0)) {
      return (com.tencent.mm.t.a)this.dai.peek();
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/cache/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */