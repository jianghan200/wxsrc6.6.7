package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.g.a.je;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;

public abstract class d
  implements j.a
{
  public int qyw = 0;
  
  public abstract b CY(String paramString);
  
  public final void a(String paramString, l paraml)
  {
    paraml = new je();
    paraml.bSL.bSM = CY(paramString);
    a.sFg.m(paraml);
  }
  
  public abstract j aSe();
  
  public final void adc()
  {
    if (this.qyw == 0)
    {
      j localj = aSe();
      if (localj != null) {
        localj.c(this);
      }
    }
    this.qyw += 1;
  }
  
  public final void unregister()
  {
    if (this.qyw == 0) {}
    j localj;
    do
    {
      do
      {
        return;
        this.qyw -= 1;
      } while (this.qyw != 0);
      localj = aSe();
    } while (localj == null);
    localj.d(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */