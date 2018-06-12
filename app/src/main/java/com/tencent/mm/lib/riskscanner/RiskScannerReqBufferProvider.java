package com.tencent.mm.lib.riskscanner;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.c.a.c;
import com.tencent.mm.sdk.platformtools.x;

public class RiskScannerReqBufferProvider
  extends ContentProvider
{
  public static final Uri CONTENT_URI = Uri.parse("content://com.tencent.mm.lib.riskscanner.RiskScannerReqBufferProvider");
  
  private Bundle bC(Context paramContext)
  {
    Bundle[] arrayOfBundle = new Bundle[1];
    arrayOfBundle[0] = null;
    try
    {
      a.Fi();
      c.a(paramContext, new RiskScannerReqBufferProvider.1(this, arrayOfBundle));
      return arrayOfBundle[0];
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        a.c(paramContext);
      }
    }
  }
  
  public Bundle call(String paramString1, String paramString2, Bundle paramBundle)
  {
    if ("prepareReqBuffer".equals(paramString1))
    {
      x.i("MicroMsg.RiskScannerReqBufferProvider", "invoke method: %s, with arg: %s, extras: %s", new Object[] { paramString1, paramString2, paramBundle });
      return bC(getContext());
    }
    x.w("MicroMsg.RiskScannerReqBufferProvider", "unknown method: %s", new Object[] { paramString1 });
    return new Bundle[] { null }[0];
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    x.i("MicroMsg.RiskScannerReqBufferProvider", "onCreate called.");
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/lib/riskscanner/RiskScannerReqBufferProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */