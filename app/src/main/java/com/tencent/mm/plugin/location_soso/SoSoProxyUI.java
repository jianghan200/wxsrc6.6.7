package com.tencent.mm.plugin.location_soso;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import com.tencent.mm.plugin.r.c;
import com.tencent.mm.plugin.r.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.y;
import com.tencent.tencentmap.mapsdk.map.MapActivity;

@com.tencent.mm.ui.base.a(19)
public class SoSoProxyUI
  extends MapActivity
{
  protected static final String TAG = "MicroMsg.SoSoProxyUI";
  private com.tencent.mm.plugin.r.a basemapUI;
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (this.basemapUI.dispatchKeyEvent(paramKeyEvent)) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.basemapUI.dispatchTouchEvent(paramMotionEvent)) {
      return true;
    }
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void finish()
  {
    super.finish();
  }
  
  public Resources getResources()
  {
    if ((getAssets() != null) && (ad.getResources() != null)) {
      return ad.getResources();
    }
    return super.getResources();
  }
  
  public Object getSystemService(String paramString)
  {
    Object localObject2 = super.getSystemService(paramString);
    Object localObject1 = localObject2;
    if (getAssets() != null)
    {
      localObject1 = localObject2;
      if ("layout_inflater".equals(paramString)) {
        localObject1 = y.b((LayoutInflater)localObject2);
      }
    }
    return localObject1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.basemapUI.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    this.basemapUI.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    x.i("MicroMsg.SoSoProxyUI", "SoSoProxyUI onCreate");
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("intent_map_key", -1);
    if (c.a.kKA == null) {
      for (;;)
      {
        try
        {
          boolean bool2 = b.foreground;
          if (paramBundle == null) {
            continue;
          }
          x.e("MicroMsg.SoSoProxyUI", "summerasyncinit not init activity foreground[%b] savedInstanceState[%b], activity[%s, %d]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), getClass().getSimpleName(), Integer.valueOf(hashCode()) });
          finish();
        }
        catch (Throwable paramBundle)
        {
          x.printErrStackTrace("MicroMsg.SoSoProxyUI", paramBundle, "summerasyncinit finish:", new Object[0]);
          continue;
        }
        h.mEJ.a(598L, 20L, 1L, false);
        return;
        bool1 = false;
      }
    }
    this.basemapUI = c.a.kKA.d(this, i);
    if (this.basemapUI == null)
    {
      finish();
      return;
    }
    this.basemapUI.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    if (this.basemapUI != null) {
      this.basemapUI.onDestroy();
    }
    super.onDestroy();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) && (paramKeyEvent.getAction() == 1))
    {
      this.basemapUI.aZX();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    this.basemapUI.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.basemapUI.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/location_soso/SoSoProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */