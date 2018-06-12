package android.support.multidex;

import android.app.Application;
import android.content.Context;

public class MultiDexApplication
  extends Application
{
  protected void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
    a.H(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/android/support/multidex/MultiDexApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */