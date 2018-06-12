package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.af;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.y;
import com.google.android.gms.c.ae;
import com.google.android.gms.c.ag;
import com.google.android.gms.c.h;

public class c
  extends ag<c>
{
  public final q aHe;
  public boolean aIm;
  
  public c(q paramq)
  {
    super(paramq.ns(), paramq.aFC);
    this.aHe = paramq;
  }
  
  protected final void a(ae paramae)
  {
    paramae = (h)paramae.e(h.class);
    if (TextUtils.isEmpty(paramae.aGl)) {
      paramae.aGl = this.aHe.nw().nP();
    }
    if ((this.aIm) && (TextUtils.isEmpty(paramae.aWp)))
    {
      Object localObject = this.aHe;
      q.a(((q)localObject).aGe);
      localObject = ((q)localObject).aGe;
      paramae.aWp = ((a)localObject).mG();
      paramae.aWq = ((a)localObject).mF();
    }
  }
  
  public final ae oj()
  {
    ae localae = qm().ql();
    q localq = this.aHe;
    q.a(localq.aGf);
    localae.b(localq.aGf.nG());
    localae.b(this.aHe.aGg.og());
    qo();
    return localae;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/analytics/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */