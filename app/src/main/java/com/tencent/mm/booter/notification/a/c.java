package com.tencent.mm.booter.notification.a;

import com.tencent.mm.R.g;
import com.tencent.mm.bf.a;
import com.tencent.mm.k.f;

public final class c
{
  public int cZf = -1;
  
  public final int y(String paramString, int paramInt)
  {
    this.cZf = a.cbg();
    if ((!f.fW(paramInt)) || (f.fm(paramString))) {}
    try
    {
      this.cZf = R.g.voip_newmessagetips1;
      for (;;)
      {
        if (this.cZf < 0) {
          this.cZf = a.cbg();
        }
        return this.cZf;
        if (f.fn(paramString)) {
          try
          {
            this.cZf = R.g.voip_newmessagetips1;
          }
          catch (Exception paramString) {}
        }
      }
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/booter/notification/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */