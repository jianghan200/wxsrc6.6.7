package com.tencent.mm.plugin.appbrand.game.c;

import android.content.Context;
import android.os.Looper;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.al;

public final class c
  extends AppCompatTextView
{
  StringBuilder azu = new StringBuilder(100);
  private al eOf = new al(Looper.getMainLooper(), new c.1(this), true);
  private long fBi = -1L;
  private long fBj = -1L;
  private int fBk = 0;
  private float fBl = 60.0F;
  private int fBm = 0;
  
  public c(Context paramContext)
  {
    super(paramContext);
    setTextSize(12.0F);
    setTextColor(-65536);
    setFocusable(false);
    setClickable(false);
    setOnClickListener(null);
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        c.a(c.this);
      }
    });
    this.eOf.J(500L, 500L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */