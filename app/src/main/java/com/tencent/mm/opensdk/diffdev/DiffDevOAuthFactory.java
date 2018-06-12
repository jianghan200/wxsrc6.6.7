package com.tencent.mm.opensdk.diffdev;

import com.tencent.mm.opensdk.diffdev.a.a;
import com.tencent.mm.opensdk.utils.Log;

public class DiffDevOAuthFactory
{
  public static final int MAX_SUPPORTED_VERSION = 1;
  private static final String TAG = "MicroMsg.SDK.DiffDevOAuthFactory";
  public static final int VERSION_1 = 1;
  private static IDiffDevOAuth v1Instance = null;
  
  public static IDiffDevOAuth getDiffDevOAuth()
  {
    return getDiffDevOAuth(1);
  }
  
  public static IDiffDevOAuth getDiffDevOAuth(int paramInt)
  {
    Log.v("MicroMsg.SDK.DiffDevOAuthFactory", "getDiffDevOAuth, version = " + paramInt);
    if (paramInt > 1)
    {
      Log.e("MicroMsg.SDK.DiffDevOAuthFactory", "getDiffDevOAuth fail, unsupported version = " + paramInt);
      return null;
    }
    switch (paramInt)
    {
    default: 
      return null;
    }
    if (v1Instance == null) {
      v1Instance = new a();
    }
    return v1Instance;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/opensdk/diffdev/DiffDevOAuthFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */