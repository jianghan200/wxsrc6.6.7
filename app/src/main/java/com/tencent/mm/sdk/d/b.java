package com.tencent.mm.sdk.d;

import com.tencent.mm.sdk.platformtools.x;
import java.io.Serializable;

public class b
  extends c
  implements Serializable
{
  public final String name = getClass().getSimpleName();
  
  public void enter()
  {
    super.enter();
    x.i("LogStateTransitionState", "entering " + this.name);
  }
  
  public void exit()
  {
    super.exit();
    x.i("LogStateTransitionState", "exiting " + this.name);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/sdk/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */