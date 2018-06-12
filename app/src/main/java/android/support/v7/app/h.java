package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.view.b;
import android.support.v7.view.f.a;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window;
import android.view.Window.Callback;
import java.util.Calendar;

class h
  extends g
{
  private static n Ep;
  private int Eq = -100;
  private boolean Er;
  boolean Es = true;
  
  h(Context paramContext, Window paramWindow, d paramd)
  {
    super(paramContext, paramWindow, paramd);
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }
  
  int aG(int paramInt)
  {
    Location localLocation1 = null;
    Object localObject;
    n.a locala;
    boolean bool;
    switch (paramInt)
    {
    default: 
      return paramInt;
    case 0: 
      if (Ep == null) {
        Ep = new n(this.mContext.getApplicationContext());
      }
      localObject = Ep;
      locala = n.FF;
      if (n.a(locala))
      {
        bool = locala.FH;
        if (bool) {
          return 2;
        }
      }
      else
      {
        if (android.support.v4.content.e.f(((n)localObject).mContext, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
          break label223;
        }
      }
      break;
    }
    label188:
    label223:
    for (Location localLocation2 = ((n)localObject).M("network");; localLocation2 = null)
    {
      if (android.support.v4.content.e.f(((n)localObject).mContext, "android.permission.ACCESS_FINE_LOCATION") == 0) {
        localLocation1 = ((n)localObject).M("gps");
      }
      if ((localLocation1 != null) && (localLocation2 != null))
      {
        localObject = localLocation2;
        if (localLocation1.getTime() > localLocation2.getTime()) {
          localObject = localLocation1;
        }
      }
      for (;;)
      {
        if (localObject == null) {
          break label188;
        }
        n.d((Location)localObject);
        bool = locala.FH;
        break;
        localObject = localLocation2;
        if (localLocation1 != null) {
          localObject = localLocation1;
        }
      }
      paramInt = Calendar.getInstance().get(11);
      if ((paramInt < 6) || (paramInt >= 22))
      {
        bool = true;
        break;
      }
      bool = false;
      break;
      return 1;
      return -1;
    }
  }
  
  public final boolean df()
  {
    this.Er = true;
    Resources localResources;
    Configuration localConfiguration;
    int j;
    if (this.Eq == -100)
    {
      i = e.Ed;
      i = aG(i);
      if (i == -1) {
        break label116;
      }
      localResources = this.mContext.getResources();
      localConfiguration = localResources.getConfiguration();
      j = localConfiguration.uiMode;
      if (i != 2) {
        break label108;
      }
    }
    label108:
    for (int i = 32;; i = 16)
    {
      if ((j & 0x30) == i) {
        break label114;
      }
      localConfiguration = new Configuration(localConfiguration);
      localConfiguration.uiMode = (i | localConfiguration.uiMode & 0xFFFFFFCF);
      localResources.updateConfiguration(localConfiguration, null);
      return true;
      i = this.Eq;
      break;
    }
    label114:
    return false;
    label116:
    return false;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((paramBundle != null) && (this.Eq == -100)) {
      this.Eq = paramBundle.getInt("appcompat:local_night_mode", -100);
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.Eq != -100) {
      paramBundle.putInt("appcompat:local_night_mode", this.Eq);
    }
  }
  
  class a
    extends f.b
  {
    a(Window.Callback paramCallback)
    {
      super(paramCallback);
    }
    
    final ActionMode a(ActionMode.Callback paramCallback)
    {
      paramCallback = new f.a(h.this.mContext, paramCallback);
      b localb = h.this.startSupportActionMode(paramCallback);
      if (localb != null) {
        return paramCallback.b(localb);
      }
      return null;
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
    {
      if (h.this.Es) {
        return a(paramCallback);
      }
      return super.onWindowStartingActionMode(paramCallback);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */