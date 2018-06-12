package com.tencent.mm.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.sdk.platformtools.x;

public abstract class v
  implements MenuItem.OnMenuItemClickListener
{
  private long ngz = -1L;
  
  public abstract void bHJ();
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    x.i("MicroMsg.MMCustomMenuItemClickListener", "button onclick");
    if (this.ngz != -1L)
    {
      long l = (System.nanoTime() - this.ngz) / 1000000L;
      if (l < 500L)
      {
        x.i("MicroMsg.MMCustomMenuItemClickListener", "click time limited limitetime:%d, delaytime:%d", new Object[] { Long.valueOf(l), Long.valueOf(500L) });
        return false;
      }
    }
    this.ngz = System.nanoTime();
    bHJ();
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */