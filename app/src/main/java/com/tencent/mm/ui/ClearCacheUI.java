package com.tencent.mm.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.base.h;

public class ClearCacheUI
  extends MMBaseActivity
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_message");
    long l = getIntent().getLongExtra("key_mask", 0L);
    h.a(this, paramBundle, getString(R.l.clear_cache_title), getString(R.l.clear_cache_now), getString(R.l.clear_cache_cancel), false, new ClearCacheUI.1(this, l), new ClearCacheUI.2(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/ClearCacheUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */