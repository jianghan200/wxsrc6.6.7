package com.tencent.mm.vending.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import java.util.Map;
import junit.framework.Assert;

public final class c
  implements com.tencent.mm.vending.e.b
{
  private com.tencent.mm.vending.e.c uPF = new com.tencent.mm.vending.e.c();
  private b uPX = b.cBv();
  private a uPY;
  private com.tencent.mm.vending.c.b<? extends a> uPZ;
  private int uQa = 0;
  
  private <T extends com.tencent.mm.vending.c.b<? extends a>> T S(Class<? extends com.tencent.mm.vending.c.b<? extends a>> paramClass)
  {
    try
    {
      if (this.uPZ == null) {
        break label61;
      }
      if (!paramClass.isInstance(this.uPZ)) {
        throw new IllegalAccessError("Only one interactor pair with one presenter! duplicate pairWith : " + paramClass.toString());
      }
    }
    finally {}
    paramClass = this.uPZ;
    for (;;)
    {
      return paramClass;
      try
      {
        label61:
        this.uPZ = ((com.tencent.mm.vending.c.b)paramClass.newInstance());
        if (this.uPY == null) {
          this.uPY = ((a)this.uPZ.VT());
        }
        cBw();
        com.tencent.mm.vending.c.b localb = this.uPZ;
        paramClass = localb;
      }
      catch (InstantiationException localInstantiationException)
      {
        throw new InternalError("Could not create interactor api instance : " + paramClass.toString());
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
    }
  }
  
  private <T extends a> T T(Class<? extends a> paramClass)
  {
    for (;;)
    {
      try
      {
        if (this.uPZ != null)
        {
          paramClass = (a)this.uPZ.VT();
          return paramClass;
        }
        if (this.uPY == null) {
          break label84;
        }
        if (!paramClass.isInstance(this.uPY)) {
          throw new IllegalAccessError("Only one interactor pair with one presenter! duplicate pairWith : " + paramClass.toString());
        }
      }
      finally {}
      paramClass = this.uPY;
      continue;
      try
      {
        label84:
        this.uPY = ((a)paramClass.newInstance());
        cBw();
        a locala = this.uPY;
        paramClass = locala;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new InternalError("Could not create interactor instance : " + paramClass.toString());
      }
      catch (InstantiationException localInstantiationException)
      {
        for (;;) {}
      }
    }
  }
  
  private void cBw()
  {
    if (this.uPX != null)
    {
      b localb = this.uPX;
      a locala = this.uPY;
      if (localb.uPT.containsKey(this)) {
        break label187;
      }
      localb.uPT.put(this, locala);
      com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "presenter %s hash %s interactor %s looper %s", new Object[] { this, Integer.valueOf(hashCode()), locala, Looper.myLooper() });
      int i = localb.uPU.get(hashCode(), 0);
      if ((i > 0) && (i < 4))
      {
        if (i > 0) {
          localb.uPV.sendMessage(localb.uPV.obtainMessage(1, locala));
        }
        if (i >= 2) {
          localb.uPV.sendMessage(localb.uPV.obtainMessage(2, locala));
        }
        if (i >= 3) {
          localb.uPV.sendMessage(localb.uPV.obtainMessage(3, locala));
        }
        if (i >= 4) {
          localb.uPV.sendMessage(localb.uPV.obtainMessage(4, locala));
        }
      }
    }
    return;
    label187:
    com.tencent.mm.vending.f.a.e("Vending.InteractorManager", "duplicate activity and interactor.", new Object[0]);
  }
  
  private void z(Intent paramIntent, Context paramContext)
  {
    try
    {
      Assert.assertNotNull("You must pair this presenter with a interactor!", this.uPY);
      this.uPY.mContext = paramContext;
      this.uPY.uPN = new com.tencent.mm.vending.d.a(paramIntent);
      return;
    }
    finally
    {
      paramIntent = finally;
      throw paramIntent;
    }
  }
  
  public final void A(Intent paramIntent, Context paramContext)
  {
    z(paramIntent, paramContext);
    GM(1);
  }
  
  public final a EW()
  {
    try
    {
      if ((this.uPY == null) && (this.uPX != null)) {
        this.uPY = ((a)this.uPX.uPT.get(this));
      }
      Assert.assertNotNull("You must pair this presenter with a interactor!", this.uPY);
      a locala = this.uPY;
      return locala;
    }
    finally {}
  }
  
  public final void GM(int paramInt)
  {
    this.uQa = paramInt;
    b localb = this.uPX;
    a locala = (a)localb.uPT.get(this);
    if (locala != null) {
      switch (paramInt)
      {
      default: 
        com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "Unknow phase %s, interactor %s activity %s %s %s", new Object[] { Integer.valueOf(paramInt), locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
        return;
      case 1: 
        com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "onCreate interactor %s presenter %s %s %s", new Object[] { locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
      }
    }
    for (;;)
    {
      localb.uPV.sendMessage(localb.uPV.obtainMessage(paramInt, locala));
      localb.uPU.put(hashCode(), paramInt);
      return;
      com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "onDestroy interactor %s activity %s %s %s", new Object[] { locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
      localb.uPT.remove(this);
    }
  }
  
  public final <T extends com.tencent.mm.vending.c.b<? extends a>> T a(Activity paramActivity, Class<? extends com.tencent.mm.vending.c.b<? extends a>> paramClass)
  {
    if ((paramActivity.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (paramActivity.isDestroyed())))
    {
      com.tencent.mm.vending.f.a.e("Vending.Presenter", "Activity %s is finished! This is invalid!", new Object[] { paramActivity });
      return null;
    }
    return S(paramClass);
  }
  
  public final <T extends a> T b(Activity paramActivity, Class<? extends a> paramClass)
  {
    if ((paramActivity.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (paramActivity.isDestroyed())))
    {
      com.tencent.mm.vending.f.a.e("Vending.Presenter", "Activity %s is finished! This is invalid!", new Object[] { paramActivity });
      return null;
    }
    return T(paramClass);
  }
  
  public final void keep(com.tencent.mm.vending.e.a parama)
  {
    Assert.assertTrue("target must be a ILifeCycle", parama instanceof com.tencent.mm.vending.e.a);
    this.uPF.keep(parama);
  }
  
  public final void onDestroy()
  {
    this.uPF.dead();
    GM(4);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/vending/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */