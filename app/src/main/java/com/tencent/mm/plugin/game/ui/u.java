package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.g.c.p;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.be;
import com.tencent.mm.plugin.game.model.be.a;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class u
  implements View.OnClickListener
{
  private d jNE;
  int jNv = 0;
  String jTR = null;
  private int kcO;
  private Context mContext;
  
  public u(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public final void onClick(View paramView)
  {
    if (!(paramView.getTag() instanceof d))
    {
      x.e("MicroMsg.GameTMAssistClickListener", "No GameAppInfo");
      return;
    }
    this.jNE = ((d)paramView.getTag());
    x.i("MicroMsg.GameTMAssistClickListener", "Clicked appid = " + this.jNE.field_appId);
    if (g.r(this.mContext, this.jNE.field_appId))
    {
      x.d("MicroMsg.GameTMAssistClickListener", "launchFromWX, appId = " + this.jNE.field_appId + ", pkg = " + this.jNE.field_packageName + ", openId = " + this.jNE.field_openId);
      an.a(this.mContext, this.jNE.scene, this.jNE.bYq, this.jNE.position, 3, this.jNE.field_appId, this.jNv, this.jTR);
      f.ah(this.mContext, this.jNE.field_appId);
      return;
    }
    be.aUD();
    paramView = this.jNE.cmP;
    int i;
    if (bi.oW(paramView))
    {
      x.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
      i = -1;
      this.kcO = i;
      String str = this.jNE.cmP;
      paramView = str;
      if (!bi.oW(str)) {
        paramView = str.replace("ANDROIDWX.GAMECENTER", "ANDROIDWX.YYB.GAMECENTER");
      }
      if (this.jNE.status != 3) {
        break label369;
      }
      be.aUD();
      be.startToAuthorized(this.mContext, paramView);
      label271:
      i = 5;
      if (this.jNE.status == 3) {
        i = 10;
      }
      if (this.kcO != 4) {
        break label384;
      }
      i = 8;
    }
    label369:
    label384:
    for (;;)
    {
      an.a(this.mContext, this.jNE.scene, this.jNE.bYq, this.jNE.position, i, this.jNE.field_appId, this.jNv, this.jNE.bHF, this.jTR);
      return;
      i = be.a(new be.a((byte)0).Dz(paramView));
      break;
      be.aUD();
      be.am(this.mContext, paramView);
      break label271;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */