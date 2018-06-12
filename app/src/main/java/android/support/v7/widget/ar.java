package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.e;
import java.lang.ref.WeakReference;

public final class ar
  extends Resources
{
  private final WeakReference<Context> Wv;
  
  public ar(Context paramContext, Resources paramResources)
  {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    this.Wv = new WeakReference(paramContext);
  }
  
  public static boolean hi()
  {
    return (e.dg()) && (Build.VERSION.SDK_INT <= 20);
  }
  
  public final Drawable getDrawable(int paramInt)
  {
    Context localContext = (Context)this.Wv.get();
    if (localContext != null)
    {
      h localh = h.eJ();
      Drawable localDrawable2 = localh.i(localContext, paramInt);
      Drawable localDrawable1 = localDrawable2;
      if (localDrawable2 == null) {
        localDrawable1 = super.getDrawable(paramInt);
      }
      if (localDrawable1 != null) {
        return localh.a(localContext, paramInt, false, localDrawable1);
      }
      return null;
    }
    return super.getDrawable(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */