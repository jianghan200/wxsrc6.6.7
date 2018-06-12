package com.tencent.mm.plugin.brandservice.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.tencent.mm.ac.d;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.q;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;

public abstract interface a
  extends com.tencent.mm.kernel.c.a
{
  public abstract void a(int paramInt, Context paramContext, String paramString1, String paramString2, long paramLong1, long paramLong2);
  
  public abstract void a(long paramLong, int paramInt, Context paramContext, Activity paramActivity, bd parambd);
  
  public abstract void a(View paramView, long paramLong, String paramString1, String paramString2, int paramInt);
  
  public abstract void a(bd parambd, Activity paramActivity);
  
  public abstract void a(bd parambd, Context paramContext);
  
  public abstract void a(m paramm, q paramq, int paramInt, l paraml, View paramView, boolean paramBoolean);
  
  public abstract void b(d paramd, Activity paramActivity, ab paramab);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */