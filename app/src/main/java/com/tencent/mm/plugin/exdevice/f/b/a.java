package com.tencent.mm.plugin.exdevice.f.b;

import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import junit.framework.Assert;

public final class a
{
  SparseArray<WeakReference<e>> iyd;
  
  public final void a(e parame)
  {
    if (parame != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.iyd == null) {
        this.iyd = new SparseArray();
      }
      this.iyd.put(parame.hashCode(), new WeakReference(parame));
      return;
    }
  }
  
  public final void a(String paramString, d paramd)
  {
    Assert.assertTrue(true);
    if (this.iyd == null)
    {
      x.d("MicroMsg.ExdeviceRankCallbackManager", "hy: callback pool is null. abort");
      return;
    }
    int i = 0;
    while (i < this.iyd.size())
    {
      int j = this.iyd.keyAt(i);
      e locale = (e)((WeakReference)this.iyd.get(j)).get();
      if (locale != null) {
        locale.b(paramString, paramd);
      }
      i += 1;
    }
    x.d("MicroMsg.ExdeviceRankCallbackManager", "hy: publish end");
  }
  
  public final void b(e parame)
  {
    if (parame != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.iyd != null) {
        break;
      }
      x.d("MicroMsg.ExdeviceRankCallbackManager", "hy: callback pool is null. abort ");
      return;
    }
    this.iyd.remove(parame.hashCode());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */