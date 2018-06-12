package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class q
  implements View.OnClickListener
{
  int hop;
  private d jMa;
  String kbt;
  protected Context mContext;
  
  public q(Context paramContext)
  {
    this.mContext = paramContext;
    this.kbt = null;
  }
  
  public final void onClick(View paramView)
  {
    if (!(paramView.getTag() instanceof d))
    {
      x.e("MicroMsg.GamePreemptiveCliclListener", "No GameAppInfo");
      return;
    }
    this.jMa = ((d)paramView.getTag());
    x.i("MicroMsg.GamePreemptiveCliclListener", "Clicked appid = " + this.jMa.field_appId);
    if (g.r(this.mContext, this.jMa.field_appId))
    {
      x.d("MicroMsg.GamePreemptiveCliclListener", "launchFromWX, appId = " + this.jMa.field_appId + ", pkg = " + this.jMa.field_packageName + ", openId = " + this.jMa.field_openId);
      f.ah(this.mContext, this.jMa.field_appId);
      an.a(this.mContext, this.jMa.scene, this.jMa.bYq, this.jMa.position, 3, this.jMa.field_appId, this.hop, this.jMa.bHF, this.jMa.jLt);
      return;
    }
    x.i("MicroMsg.GamePreemptiveCliclListener", "get preemptive url:[%s]", new Object[] { this.kbt });
    if (!bi.oW(this.kbt))
    {
      c.an(this.mContext, this.kbt);
      an.a(this.mContext, this.jMa.scene, this.jMa.bYq, this.jMa.position, 11, this.jMa.field_appId, this.hop, this.jMa.bHF, this.jMa.jLt);
      return;
    }
    x.e("MicroMsg.GamePreemptiveCliclListener", "null or nill preemptive url");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/ui/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */