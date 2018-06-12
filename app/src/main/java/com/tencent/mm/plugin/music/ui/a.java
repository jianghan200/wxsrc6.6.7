package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.g.a.js;
import com.tencent.mm.g.a.js.b;
import com.tencent.mm.plugin.music.b.a;
import com.tencent.mm.plugin.music.b.c;
import com.tencent.mm.plugin.music.b.d;
import com.tencent.mm.plugin.music.b.e;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ad;

public final class a
  extends com.tencent.mm.pluginsdk.ui.b.b
{
  private c fIu;
  private TextView lAw;
  
  public a(Context paramContext)
  {
    super(paramContext);
    if (this.view != null)
    {
      this.lAw = ((TextView)this.view.findViewById(b.c.music_banner_text_view));
      this.lAw.setTextSize(0, com.tencent.mm.bp.a.ad(ad.getContext(), b.a.HintTextSize));
      this.view.setOnClickListener(new a.1(this));
    }
    this.fIu = new a.2(this);
    com.tencent.mm.sdk.b.a.sFg.b(this.fIu);
  }
  
  private boolean biC()
  {
    int i = 8;
    boolean bool = false;
    if (com.tencent.mm.an.b.PY())
    {
      localObject = com.tencent.mm.an.b.Qa();
      String str = ad.getContext().getString(b.e.music_detail_playing) + ad.getContext().getString(b.e.music_detail_split) + ((avq)localObject).rYl;
      if (this.lAw != null) {
        this.lAw.setText(str);
      }
      if (((avq)localObject).rYC) {}
      for (;;)
      {
        setVisibility(i);
        if (!((avq)localObject).rYC) {
          bool = true;
        }
        return bool;
        i = 0;
      }
    }
    Object localObject = new js();
    ((js)localObject).bTw.action = 10;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    if (((js)localObject).bTx.bGZ)
    {
      setVisibility(0);
      return true;
    }
    setVisibility(8);
    return false;
  }
  
  public final boolean anR()
  {
    return biC();
  }
  
  public final void destroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.fIu);
  }
  
  public final int getLayoutId()
  {
    return b.d.music_banner_view;
  }
  
  public final int getOrder()
  {
    return 1;
  }
  
  public final void setVisibility(int paramInt)
  {
    if (this.view != null) {
      this.view.findViewById(b.c.music_banner_view).setVisibility(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/music/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */