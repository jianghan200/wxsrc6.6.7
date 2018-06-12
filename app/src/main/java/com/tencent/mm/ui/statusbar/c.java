package com.tencent.mm.ui.statusbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public class c
{
  public static final boolean uuT;
  @SuppressLint({"StaticFieldLeak"})
  private static final c uuX;
  private static final WeakHashMap<Activity, c> uuY;
  private final WeakReference<Activity> mActivityRef;
  private final Set<WeakReference<a>> uuU = new HashSet();
  private boolean uuV = false;
  int uuW = 0;
  
  static
  {
    if ((Build.VERSION.SDK_INT >= 21) && (!d.apT())) {}
    for (boolean bool = true;; bool = false)
    {
      uuT = bool;
      uuX = new c()
      {
        public final void a(c.a paramAnonymousa) {}
      };
      uuY = new WeakHashMap();
      return;
    }
  }
  
  private c(Activity paramActivity)
  {
    this.mActivityRef = new WeakReference(paramActivity);
  }
  
  public static c ab(Activity paramActivity)
  {
    if ((!uuT) || (paramActivity == null)) {
      localObject = uuX;
    }
    c localc;
    do
    {
      return (c)localObject;
      localc = (c)uuY.get(paramActivity);
      localObject = localc;
    } while (localc != null);
    Object localObject = new c(paramActivity);
    uuY.put(paramActivity, localObject);
    return (c)localObject;
  }
  
  public void a(a parama)
  {
    Activity localActivity;
    if (!this.uuV)
    {
      this.uuV = true;
      localActivity = (Activity)this.mActivityRef.get();
      if ((localActivity != null) && (localActivity.getWindow() != null)) {
        break label74;
      }
    }
    for (;;)
    {
      if (parama != null)
      {
        this.uuU.add(new WeakReference(parama));
        if (this.uuW > 0) {
          parama.lH(this.uuW);
        }
      }
      return;
      try
      {
        label74:
        ((ViewGroup)localActivity.getWindow().getDecorView()).getChildAt(0).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
        {
          public final WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
          {
            c.b(c.this, c.a(c.this, paramAnonymousWindowInsets.getSystemWindowInsetTop()));
            return paramAnonymousWindowInsets.consumeSystemWindowInsets();
          }
        });
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.StatusBarHeightWatcher", "setOnApplyWindowInsetsListener e=%s", new Object[] { localException });
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void lH(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/statusbar/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */