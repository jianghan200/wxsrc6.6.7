package com.tencent.mm.opensdk.openapi;

import android.content.Context;
import com.tencent.mm.opensdk.utils.Log;

public class WXAPIFactory
{
  private static final String TAG = "MicroMsg.PaySdk.WXFactory";
  
  private WXAPIFactory()
  {
    throw new RuntimeException(getClass().getSimpleName() + " should not be instantiated");
  }
  
  public static IWXAPI createWXAPI(Context paramContext, String paramString)
  {
    return createWXAPI(paramContext, paramString, false);
  }
  
  public static IWXAPI createWXAPI(Context paramContext, String paramString, boolean paramBoolean)
  {
    Log.d("MicroMsg.PaySdk.WXFactory", "createWXAPI, appId = " + paramString + ", checkSignature = " + paramBoolean);
    return new WXApiImplV10(paramContext, paramString, paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/opensdk/openapi/WXAPIFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */