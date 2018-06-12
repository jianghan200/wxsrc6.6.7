package com.tencent.mm.plugin.ext.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.g.a.cb;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;

public class RedirectToQrCodeStubUI
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.RedirectToQrCodeStubUI", "hy: start to handle qrcode string");
    paramBundle = getIntent().getStringExtra("K_STR");
    int i = getIntent().getIntExtra("K_TYPE", -1);
    int j = getIntent().getIntExtra("K_VERSION", -1);
    cb localcb = new cb();
    localcb.bJq.activity = this;
    localcb.bJq.bHL = paramBundle;
    localcb.bJq.bJr = i;
    localcb.bJq.bJs = j;
    localcb.bJq.scene = 47;
    a.sFg.m(localcb);
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ext/ui/RedirectToQrCodeStubUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */