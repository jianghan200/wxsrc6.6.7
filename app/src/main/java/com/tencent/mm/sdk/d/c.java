package com.tencent.mm.sdk.d;

import android.os.Message;

public class c
  implements a
{
  public void enter() {}
  
  public void exit() {}
  
  public String getName()
  {
    String str = getClass().getName();
    return str.substring(str.lastIndexOf('$') + 1);
  }
  
  public boolean j(Message paramMessage)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/sdk/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */