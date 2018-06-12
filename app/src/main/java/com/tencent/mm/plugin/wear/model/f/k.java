package com.tencent.mm.plugin.wear.model.f;

import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.c.cer;
import java.io.IOException;

public final class k
  extends c
{
  private String bIr;
  private int code;
  
  public k(int paramInt, String paramString)
  {
    this.code = paramInt;
    this.bIr = paramString;
  }
  
  public final String getName()
  {
    return "WearPushPayResponseTask";
  }
  
  protected final void send()
  {
    cer localcer = new cer();
    switch (this.code)
    {
    }
    for (;;)
    {
      localcer.syk = this.bIr;
      try
      {
        a.bSl();
        r.b(20016, localcer.toByteArray(), true);
        return;
      }
      catch (IOException localIOException) {}
      localcer.spd = 0;
      continue;
      localcer.spd = 196610;
      continue;
      localcer.spd = 196613;
      continue;
      localcer.spd = 196614;
      continue;
      localcer.spd = 196615;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */