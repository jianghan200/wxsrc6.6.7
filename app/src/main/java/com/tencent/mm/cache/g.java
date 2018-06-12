package com.tencent.mm.cache;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.t.d.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public final class g
  implements d<com.tencent.mm.t.d>
{
  private Stack<com.tencent.mm.t.d> dai;
  private Stack<com.tencent.mm.t.d> daj;
  public int dal;
  public SparseArray<String> daq;
  public HashMap<String, Bitmap> dar;
  
  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    if (!paramBoolean) {
      if ((this.dai == null) || (this.dai.size() <= 0)) {
        break label52;
      }
    }
    label52:
    for (com.tencent.mm.t.d locald = (com.tencent.mm.t.d)this.dai.peek();; locald = null)
    {
      if ((locald != null) && (locald.bCF == d.a.doc)) {
        locald.draw(paramCanvas);
      }
      return;
    }
  }
  
  public final void a(com.tencent.mm.t.d paramd)
  {
    if (this.dai != null) {
      this.dai.push(paramd);
    }
  }
  
  public final void aV(boolean paramBoolean)
  {
    x.i("MicroMsg.MosaicCache", "[onSave] size:%s", new Object[] { Integer.valueOf(this.dai.size()) });
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
    Bitmap localBitmap = yv();
    if ((localBitmap != null) && (!localBitmap.isRecycled())) {
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, null);
    }
  }
  
  public final void onCreate()
  {
    x.i("MicroMsg.MosaicCache", "[onCreate]");
    this.dai = new Stack();
    this.daq = new SparseArray();
    this.dar = new HashMap();
  }
  
  public final void onDestroy()
  {
    if (this.dai != null)
    {
      localIterator = this.dai.iterator();
      while (localIterator.hasNext())
      {
        localIterator.next();
        com.tencent.mm.t.d.clear();
      }
      this.dai.clear();
    }
    if (this.daj != null)
    {
      localIterator = this.daj.iterator();
      while (localIterator.hasNext())
      {
        localIterator.next();
        com.tencent.mm.t.d.clear();
      }
      this.daj.clear();
    }
    this.daq.clear();
    Iterator localIterator = this.dar.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)((Map.Entry)localIterator.next()).getValue();
      if ((localBitmap != null) && (!localBitmap.isRecycled())) {
        localBitmap.recycle();
      }
    }
    this.dar.clear();
  }
  
  public final void vN()
  {
    this.dal += 1;
  }
  
  public final void yo()
  {
    x.i("MicroMsg.MosaicCache", "[onRestore] size:%s", new Object[] { Integer.valueOf(this.dai.size()) });
    this.dai.clear();
    if (this.daj != null)
    {
      x.i("MicroMsg.MosaicCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.daj.size()) });
      this.dai.addAll(this.daj);
    }
  }
  
  public final Bitmap yv()
  {
    String str = (String)this.daq.get(aW(true));
    if (bi.oW(str))
    {
      x.w("MicroMsg.MosaicCache", "[getCacheFromLocal] path is null");
      return null;
    }
    x.i("MicroMsg.MosaicCache", "[getCacheFromLocal] path:%s size:%s", new Object[] { str, Integer.valueOf(aW(true)) });
    if (this.dar.containsKey(str)) {}
    for (Bitmap localBitmap1 = (Bitmap)this.dar.get(str);; localBitmap1 = null)
    {
      Bitmap localBitmap2;
      if (localBitmap1 != null)
      {
        localBitmap2 = localBitmap1;
        if (!localBitmap1.isRecycled()) {}
      }
      else
      {
        x.i("MicroMsg.MosaicCache", "");
        localBitmap2 = c.Wb(str);
        x.i("MicroMsg.MosaicCache", "[getCacheFromLocal] get from local!");
      }
      if (localBitmap2 == null)
      {
        x.e("MicroMsg.MosaicCache", "[getCacheFromLocal] null == bitmap path:%s", new Object[] { str });
        return null;
      }
      localBitmap1 = localBitmap2.copy(Bitmap.Config.ARGB_8888, true);
      localBitmap2.recycle();
      return localBitmap1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/cache/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */