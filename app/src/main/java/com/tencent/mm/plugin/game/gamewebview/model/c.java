package com.tencent.mm.plugin.game.gamewebview.model;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ba.a;
import com.tencent.mm.bg.d;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public final class c
  extends b
{
  private TextView eBO;
  private ImageView gxd;
  
  public c(Context paramContext)
  {
    super(paramContext);
    if (this.view != null)
    {
      this.eBO = ((TextView)this.view.findViewById(R.h.game_webview_banner_text_view));
      this.gxd = ((ImageView)this.view.findViewById(R.h.game_webview_banner_icon_view));
      this.view.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = a.erR;
          paramAnonymousView = a.Ut();
          if (bi.oW(paramAnonymousView)) {
            return;
          }
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramAnonymousView);
          localIntent.putExtra("is_from_keep_top", true);
          localIntent.addFlags(268435456);
          d.b((Context)c.this.qJS.get(), "game", ".gamewebview.ui.GameWebViewUI", localIntent);
        }
      });
    }
  }
  
  public final boolean anR()
  {
    x.i("MicroMsg.GameWebViewBanner", "refreshAndReturnIsVisible");
    Object localObject = a.erR;
    if (a.Us())
    {
      x.i("MicroMsg.GameWebViewBanner", "refreshAndReturnIsVisible, VISIBLE");
      localObject = a.erR;
      localObject = a.Uu();
      if (this.eBO != null) {
        this.eBO.setText((CharSequence)localObject);
      }
      setVisibility(0);
      return true;
    }
    setVisibility(8);
    return false;
  }
  
  public final void destroy() {}
  
  public final int getLayoutId()
  {
    return R.i.game_webview_banner_view;
  }
  
  public final void setVisibility(int paramInt)
  {
    if (this.view != null) {
      this.view.findViewById(R.h.game_webview_banner_view).setVisibility(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */