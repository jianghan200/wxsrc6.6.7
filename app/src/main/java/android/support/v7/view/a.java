package android.support.v7.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.support.v7.a.a.b;

public final class a
{
  public Context mContext;
  
  private a(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public static a R(Context paramContext)
  {
    return new a(paramContext);
  }
  
  public final boolean dr()
  {
    if (this.mContext.getApplicationInfo().targetSdkVersion >= 16) {
      return this.mContext.getResources().getBoolean(a.b.abc_action_bar_embed_tabs);
    }
    return this.mContext.getResources().getBoolean(a.b.abc_action_bar_embed_tabs_pre_jb);
  }
  
  public final boolean ds()
  {
    return this.mContext.getApplicationInfo().targetSdkVersion < 14;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */