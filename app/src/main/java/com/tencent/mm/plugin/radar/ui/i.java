package com.tencent.mm.plugin.radar.ui;

import android.app.Activity;
import android.view.View;
import b.b;
import b.c.a.a;
import b.g;
import b.h;
import b.l;

public final class i
{
  public static final <T extends View> b<T> D(View paramView, int paramInt)
  {
    b.c.b.e.i(paramView, "$receiver");
    return a((a)new i.b(paramView, paramInt));
  }
  
  static final <T> b<T> a(a<? extends T> parama)
  {
    b.e locale = b.e.vGs;
    b.c.b.e.i(locale, "mode");
    b.c.b.e.i(parama, "initializer");
    switch (b.d.mkC[locale.ordinal()])
    {
    default: 
      throw new b.f();
    case 1: 
      return (b)new h(parama, (byte)0);
    case 2: 
      return (b)new g(parama);
    }
    return (b)new l(parama);
  }
  
  static final class a
    extends b.c.b.f
    implements a<T>
  {
    a(Activity paramActivity, int paramInt) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/radar/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */