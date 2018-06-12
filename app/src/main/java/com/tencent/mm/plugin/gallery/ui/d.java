package com.tencent.mm.plugin.gallery.ui;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.at.a;
import com.tencent.mm.ui.base.MultiTouchImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

final class d
{
  private at dMA = new at(1, "album-image-gallery-lazy-loader");
  private int jdField_if = 0;
  SparseArray<WeakReference<MultiTouchImageView>> jDo = new SparseArray();
  HashMap<String, Integer> jDp = new HashMap();
  SparseArray<String> jDq = new SparseArray();
  SparseArray<Bitmap> jDr = new SparseArray();
  protected f<String, Bitmap> jDs = new f(5, new d.1(this));
  protected SparseIntArray jDt = new SparseIntArray();
  c jDu;
  boolean jDv = false;
  LinkedList<String> qD = new LinkedList();
  
  public d(c paramc)
  {
    this.jDu = paramc;
  }
  
  private void a(int paramInt, Bitmap paramBitmap)
  {
    if (this.jDo.get(paramInt) == null) {
      return;
    }
    MultiTouchImageView localMultiTouchImageView = (MultiTouchImageView)((WeakReference)this.jDo.get(paramInt)).get();
    String str = (String)this.jDq.get(paramInt);
    if ((paramBitmap != null) && (localMultiTouchImageView != null))
    {
      int i = paramBitmap.hashCode();
      int j = this.jDt.indexOfValue(paramInt);
      if (j >= 0) {
        this.jDt.removeAt(j);
      }
      this.jDt.put(i, paramInt);
    }
    this.jDu.jCX.remove(str);
    if ((paramBitmap != null) && (localMultiTouchImageView != null)) {
      c.a(localMultiTouchImageView, paramBitmap);
    }
    qF(paramInt);
  }
  
  public final void N(int paramInt)
  {
    int j = 0;
    this.jdField_if = paramInt;
    if (aRV())
    {
      int[] arrayOfInt = new int[this.jDr.size()];
      int i = 0;
      for (;;)
      {
        paramInt = j;
        if (i >= arrayOfInt.length) {
          break;
        }
        arrayOfInt[i] = this.jDr.keyAt(i);
        i += 1;
      }
      while (paramInt < arrayOfInt.length)
      {
        i = arrayOfInt[paramInt];
        a(i, (Bitmap)this.jDr.get(i));
        paramInt += 1;
      }
    }
  }
  
  final void aRU()
  {
    this.jDs.a(new d.2(this));
  }
  
  final boolean aRV()
  {
    return this.jdField_if == 0;
  }
  
  final void ahW()
  {
    if (this.jDv) {}
    do
    {
      do
      {
        return;
      } while (this.qD.size() == 0);
      localObject = (String)this.qD.removeLast();
    } while (!this.jDp.containsKey(localObject));
    this.jDv = true;
    Object localObject = new d.3(this, (String)localObject);
    this.dMA.c((at.a)localObject);
  }
  
  final void qF(int paramInt)
  {
    if (this.jDq.get(paramInt) != null)
    {
      String str = (String)this.jDq.get(paramInt);
      this.jDo.remove(paramInt);
      this.jDq.remove(paramInt);
      this.jDp.remove(str);
      this.jDr.remove(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/gallery/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */