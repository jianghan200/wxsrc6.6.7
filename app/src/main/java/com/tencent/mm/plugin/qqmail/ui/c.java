package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.os.Looper;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.ju;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.b.a;

public final class c
  implements e
{
  private static long mhO = 0L;
  private Activity bOb;
  private a mhP;
  
  public c(Activity paramActivity)
  {
    au.DF().a(138, this);
    this.bOb = paramActivity;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (this.mhP != null)
      {
        this.mhP.boz();
        this.mhP = null;
      }
    }
    for (;;)
    {
      mhO = System.currentTimeMillis();
      return;
      if (this.mhP != null)
      {
        this.mhP.boA();
        this.mhP = null;
      }
    }
  }
  
  public final void a(a parama)
  {
    this.mhP = parama;
    parama = new ju();
    parama.bTI.bOb = this.bOb;
    parama.bTI.bTK = new c.1(this, parama);
    a.sFg.a(parama, Looper.myLooper());
  }
  
  protected final void finalize()
  {
    release();
    super.finalize();
  }
  
  public final void release()
  {
    au.DF().b(138, this);
  }
  
  public static abstract class a
  {
    public abstract void boA();
    
    public abstract void boz();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */