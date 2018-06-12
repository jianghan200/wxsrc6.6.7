package com.tencent.mm.lib.riskscanner.a;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.lib.riskscanner.RiskScannerReqBufferProvider;

public final class a
{
  public static Bundle bC(Context paramContext)
  {
    paramContext = paramContext.getContentResolver();
    try
    {
      paramContext = paramContext.call(RiskScannerReqBufferProvider.CONTENT_URI, "prepareReqBuffer", null, null);
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/lib/riskscanner/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */