package com.tinkerboots.sdk.b;

import android.content.Context;

public final class b
{
  public static Context context;
  
  public static Context getContext()
  {
    if (context == null) {
      throw new RuntimeException("TinkerClientContext, context is null, please init first");
    }
    return context;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tinkerboots/sdk/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */