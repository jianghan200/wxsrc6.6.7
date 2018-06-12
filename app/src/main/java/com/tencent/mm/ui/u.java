package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.x;

public abstract class u
  implements View.OnClickListener
{
  private long ngz = -1L;
  
  public abstract void aBU();
  
  public void onClick(View paramView)
  {
    x.i("MicroMsg.MMCustomClickListener", "button onclick");
    if (this.ngz != -1L)
    {
      long l = (System.nanoTime() - this.ngz) / 1000000L;
      if (l < 3000L)
      {
        x.i("MicroMsg.MMCustomClickListener", "click time limited limitetime:%d, delaytime:%d", new Object[] { Long.valueOf(l), Long.valueOf(3000L) });
        return;
      }
    }
    this.ngz = System.nanoTime();
    aBU();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */