package com.tencent.mm.plugin.backup.f;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.al;

public final class g
{
  static int index = 0;
  private a gWF;
  int[] gYd = { 1000, 1000, 1000, 2000, 5000, 9000, 13000, 26000, 26000, 26000 };
  int gYe = 0;
  boolean gYf = false;
  al gYg = new al(Looper.getMainLooper(), new g.1(this), false);
  
  public g(a parama)
  {
    this.gWF = parama;
  }
  
  public static abstract interface a
  {
    public abstract void asc();
    
    public abstract void asd();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */