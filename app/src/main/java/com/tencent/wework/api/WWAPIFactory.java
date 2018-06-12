package com.tencent.wework.api;

import android.content.Context;

public class WWAPIFactory
{
  public static IWWAPI ii(Context paramContext)
  {
    return new WWAPIImpl(paramContext);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/wework/api/WWAPIFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */