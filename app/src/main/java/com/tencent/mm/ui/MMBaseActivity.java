package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.base.a;

@a(3)
public class MMBaseActivity
  extends Activity
{
  private boolean mIsPaused;
  
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
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onPause()
  {
    this.mIsPaused = true;
    super.onPause();
  }
  
  public void onResume()
  {
    this.mIsPaused = false;
    super.onResume();
  }
  
  public void startActivities(Intent[] paramArrayOfIntent)
  {
    super.startActivities(paramArrayOfIntent);
  }
  
  public void startActivities(Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    if (d.a(this, this.mIsPaused, paramArrayOfIntent, new Object[] { paramBundle })) {
      return;
    }
    super.startActivities(paramArrayOfIntent, paramBundle);
  }
  
  public void startActivity(Intent paramIntent)
  {
    super.startActivity(paramIntent);
  }
  
  public void startActivity(Intent paramIntent, Bundle paramBundle)
  {
    super.startActivity(paramIntent, paramBundle);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (d.a(this, this.mIsPaused, new Intent[] { paramIntent }, new Object[] { Integer.valueOf(paramInt), paramBundle })) {
      return;
    }
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/MMBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */