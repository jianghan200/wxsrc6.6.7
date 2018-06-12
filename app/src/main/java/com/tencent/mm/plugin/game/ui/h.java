package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.tencent.mm.a.e;
import com.tencent.mm.g.c.p;
import com.tencent.mm.plugin.downloader.c.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.game.d.bw;
import com.tencent.mm.plugin.game.f.b;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class h
  extends c
{
  public h(Context paramContext)
  {
    super(paramContext);
  }
  
  private void aUS()
  {
    an.a(this.jMa.field_appId, this.jMa.bYq, 10, this.jTP.field_downloadId, "");
    if (com.tencent.mm.plugin.downloader.model.d.aCU().co(this.jTP.field_downloadId))
    {
      f.ai(this.mContext, this.jMa.field_appId);
      an.a(this.mContext, this.jMa.scene, this.jMa.bYq, this.jMa.position, 4, this.jMa.field_appId, this.jNv, this.jMa.bHF, this.jTR);
      return;
    }
    x.e("MicroMsg.GameClickListener", "resumeDownloadTask false");
    com.tencent.mm.plugin.downloader.model.d.aCU().cl(this.jTP.field_downloadId);
    fw(false);
  }
  
  public final void dc(String paramString1, String paramString2)
  {
    this.jTR = paramString1;
    this.jTS = paramString2;
  }
  
  public final void onClick(View paramView)
  {
    int j;
    int i;
    if ((paramView.getTag() instanceof com.tencent.mm.plugin.game.model.d))
    {
      this.jMa = ((com.tencent.mm.plugin.game.model.d)paramView.getTag());
      x.i("MicroMsg.GameClickListener", "Clicked appid = " + this.jMa.field_appId);
      aUJ();
      if (!g.r(this.mContext, this.jMa.field_appId)) {
        break label565;
      }
      if (!(this.jMa instanceof com.tencent.mm.plugin.game.model.d)) {
        break label1012;
      }
      j = com.tencent.mm.plugin.game.e.c.DP(this.jMa.field_packageName);
      i = this.jMa.versionCode;
    }
    for (;;)
    {
      boolean bool;
      if (i > j)
      {
        x.i("MicroMsg.GameClickListener", "AppId: %s installed, local: %d, server: %d", new Object[] { this.jMa.field_appId, Integer.valueOf(j), Integer.valueOf(i) });
        m.a(this.jMa.cmE, this.jMa.cmJ, this.jMa.bYq, this.jMa.field_appId, this.jTQ, "app_update");
        if (this.jTO.status == 1)
        {
          bool = com.tencent.mm.plugin.downloader.model.d.aCU().cn(this.jTO.id);
          x.i("MicroMsg.GameClickListener", "pauseDownloadTask ret = " + bool);
          return;
          x.e("MicroMsg.GameClickListener", "No AppInfo");
          return;
        }
        if (this.jTO.status == 2)
        {
          if (com.tencent.mm.plugin.downloader.model.d.aCU().co(this.jTO.id))
          {
            f.ai(this.mContext, this.jMa.field_appId);
            an.a(this.mContext, this.jMa.scene, this.jMa.bYq, this.jMa.position, 4, this.jMa.field_appId, this.jNv, this.jMa.bHF, this.jTR);
            return;
          }
          x.e("MicroMsg.GameClickListener", "resumeDownloadTask false");
          fw(true);
          return;
        }
        if (this.jTO.status == 3)
        {
          if ((e.cn(this.jTO.path)) && (com.tencent.mm.plugin.game.e.c.DQ(this.jTO.path) > j))
          {
            paramView = Uri.fromFile(new File(this.jTO.path));
            q.g(this.mContext, paramView);
            an.a(this.mContext, this.jMa.scene, this.jMa.bYq, this.jMa.position, 8, this.jMa.field_appId, this.jNv, this.jMa.bHF, this.jTR);
            return;
          }
          fw(true);
          return;
        }
        fw(true);
        return;
      }
      x.i("MicroMsg.GameClickListener", "launchFromWX, appId = %s, pkg = %s, openId = %s", new Object[] { this.jMa.field_appId, this.jMa.field_packageName, this.jMa.field_openId });
      an.a(this.mContext, this.jMa.scene, this.jMa.bYq, this.jMa.position, 3, this.jMa.field_appId, this.jNv, this.jMa.bHF, this.jTR);
      aUI();
      return;
      label565:
      if (this.jMa.aTx())
      {
        com.tencent.mm.plugin.game.e.c.r(this.mContext, this.jMa.jLx.jSu, "game_center_hv_game");
        an.a(this.mContext, this.jMa.scene, this.jMa.bYq, this.jMa.position, 29, this.jMa.field_appId, this.jNv, this.jMa.bHF, this.jTR);
        return;
      }
      m.a(this.jMa.cmE, this.jMa.cmJ, this.jMa.bYq, this.jMa.field_appId, this.jTQ, this.jTS);
      switch (this.mStatus)
      {
      default: 
        fw(false);
        return;
      case 1: 
        bool = com.tencent.mm.plugin.downloader.model.d.aCU().cn(this.jTO.id);
        x.i("MicroMsg.GameClickListener", "pauseDownloadTask ret = " + bool);
        return;
      case 2: 
        if (!ao.isNetworkConnected(this.mContext))
        {
          Toast.makeText(this.mContext, this.mContext.getString(f.i.game_download_network_unavailable), 0).show();
          return;
        }
        if (ao.isWifi(this.mContext))
        {
          aUS();
          return;
        }
        com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(f.i.webview_download_ui_download_not_in_wifi_tips), this.mContext.getString(f.i.webview_download_ui_download_not_in_wifi_title), this.mContext.getString(f.i.webview_download_ui_btn_state_to_download), this.mContext.getString(f.i.app_cancel), false, new h.1(this), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            paramAnonymousDialogInterface.dismiss();
            x.i("MicroMsg.GameClickListener", "resumeDownloadTask not wifi, user cancel");
          }
        }, f.b.wechat_green);
        return;
      }
      if ((!bi.oW(this.jTN)) && (e.cn(this.jTN)) && (com.tencent.mm.plugin.game.e.c.dd(this.jTN, this.jTP.field_md5)))
      {
        com.tencent.mm.plugin.game.e.c.a(this.jTN, this.jMa.field_appId, this.jMa.bYq, this.jTP.field_downloadId, this.jTP.field_channelId);
        an.a(this.mContext, this.jMa.scene, this.jMa.bYq, this.jMa.position, 8, this.jMa.field_appId, this.jNv, this.jMa.bHF, this.jTR);
        return;
      }
      fw(false);
      return;
      label1012:
      i = 0;
      j = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */