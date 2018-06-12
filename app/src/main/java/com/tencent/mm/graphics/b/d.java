package com.tencent.mm.graphics.b;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Timer;

public enum d
{
  public boolean bgH = false;
  public Timer bno = null;
  public WeakReference<Context> djp = null;
  public HashMap<Integer, a> djq = new HashMap();
  public final Object djr = new Object();
  
  private d() {}
  
  public final void Cl()
  {
    synchronized (this.djr)
    {
      if (!this.bgH) {
        return;
      }
      if (this.bno != null) {
        this.bno.cancel();
      }
      this.bgH = false;
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/graphics/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */