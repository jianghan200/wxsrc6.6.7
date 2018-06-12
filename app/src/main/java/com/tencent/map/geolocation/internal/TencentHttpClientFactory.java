package com.tencent.map.geolocation.internal;

import android.content.Context;
import android.os.Bundle;
import c.t.m.g.dj;

public abstract class TencentHttpClientFactory
{
  private static TencentHttpClientFactory sCustFact;
  
  public static TencentHttpClientFactory getInstance()
  {
    new TencentHttpClientFactory()
    {
      public final Bundle getParams()
      {
        return null;
      }
    };
  }
  
  public static void setTencentHttpClientFactory(TencentHttpClientFactory paramTencentHttpClientFactory)
  {
    sCustFact = paramTencentHttpClientFactory;
  }
  
  public abstract Bundle getParams();
  
  public TencentHttpClient getTencentHttpClient(Context paramContext, Bundle paramBundle)
  {
    if (sCustFact != null)
    {
      paramContext = sCustFact.getTencentHttpClient(paramContext, sCustFact.getParams());
      if (paramContext == null) {
        throw new NullPointerException(String.valueOf("http client should NOT be null"));
      }
      return (TencentHttpClient)paramContext;
    }
    return new dj(paramContext, paramBundle.getString("channelId"));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/map/geolocation/internal/TencentHttpClientFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */