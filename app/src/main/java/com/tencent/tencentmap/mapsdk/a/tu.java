package com.tencent.tencentmap.mapsdk.a;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class tu
  extends Activity
{
  private List<tw> a = new ArrayList();
  private Bundle b;
  
  protected void a(tw paramtw)
  {
    this.a.add(paramtw);
    paramtw.a(this.b);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.b = paramBundle;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      tw localtw = (tw)localIterator.next();
      if (localtw != null) {
        localtw.e();
      }
    }
    this.a.clear();
  }
  
  protected void onPause()
  {
    super.onPause();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      tw localtw = (tw)localIterator.next();
      if (localtw != null) {
        localtw.b();
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      tw localtw = (tw)localIterator.next();
      if (localtw != null) {
        localtw.a();
      }
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      tw localtw = (tw)localIterator.next();
      if (localtw != null) {
        localtw.b(paramBundle);
      }
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      tw localtw = (tw)localIterator.next();
      if (localtw != null) {
        localtw.c();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/tu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */