package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.e.a.a.a;
import com.tencent.e.a.a.b;

class be
{
  private static be e = null;
  bh a = null;
  Context b;
  b c;
  a d;
  
  private be(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    this.a = new bh(this.b);
  }
  
  public static be a(Context paramContext)
  {
    try
    {
      if (e == null) {
        e = new be(paramContext);
      }
      paramContext = e;
      return paramContext;
    }
    finally {}
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  void a(Activity paramActivity, int paramInt)
  {
    this.a.a(paramActivity, paramInt);
  }
  
  public boolean a()
  {
    this.a.a();
    return this.a.b();
  }
  
  public boolean a(String paramString, Bundle paramBundle, b paramb)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    if (!TextUtils.isEmpty(paramString)) {
      localBundle.putString("videoUrl", paramString);
    }
    if (paramb != null)
    {
      this.a.a();
      if (!this.a.b()) {
        return false;
      }
      this.c = paramb;
      this.d = new bf(this);
      localBundle.putInt("callMode", 3);
    }
    for (;;)
    {
      paramBundle = this.a;
      paramString = this;
      if (paramb == null) {
        paramString = null;
      }
      paramBundle.a(localBundle, paramString);
      return true;
      localBundle.putInt("callMode", 1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/smtt/sdk/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */