package android.support.v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

public final class an
  implements Iterable<Intent>
{
  private static final b qM = new c();
  public final ArrayList<Intent> qN = new ArrayList();
  public final Context qO;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      qM = new d();
      return;
    }
  }
  
  private an(Context paramContext)
  {
    this.qO = paramContext;
  }
  
  public static an N(Context paramContext)
  {
    return new an(paramContext);
  }
  
  public final an a(ComponentName paramComponentName)
  {
    int i = this.qN.size();
    try
    {
      for (paramComponentName = v.a(this.qO, paramComponentName); paramComponentName != null; paramComponentName = v.a(this.qO, paramComponentName.getComponent())) {
        this.qN.add(i, paramComponentName);
      }
      return this;
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      throw new IllegalArgumentException(paramComponentName);
    }
  }
  
  public final Iterator<Intent> iterator()
  {
    return this.qN.iterator();
  }
  
  public static abstract interface a
  {
    public abstract Intent getSupportParentActivityIntent();
  }
  
  static abstract interface b {}
  
  static final class c
    implements an.b
  {}
  
  static final class d
    implements an.b
  {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */