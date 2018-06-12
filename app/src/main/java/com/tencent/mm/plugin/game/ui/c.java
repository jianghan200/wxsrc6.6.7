package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.mm.g.c.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.game.f.b;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public abstract class c
  implements View.OnClickListener
{
  protected long fGL = -1L;
  protected com.tencent.mm.plugin.game.model.d jMa = null;
  protected int jNv;
  protected String jTN;
  protected FileDownloadTaskInfo jTO;
  protected com.tencent.mm.plugin.downloader.c.a jTP;
  protected String jTQ;
  protected String jTR;
  protected String jTS;
  private String jTT = "xiaomi";
  protected Context mContext;
  protected int mStatus = -1;
  
  public c(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private void fx(boolean paramBoolean)
  {
    e.a locala;
    if (paramBoolean)
    {
      m.a(this.jMa.cmE, this.jMa.cmJ, this.jMa.bYq, this.jMa.field_appId, this.jTQ, "app_update");
      locala = new e.a();
      locala.yQ(this.jMa.cmE);
      locala.yR(this.jMa.jLv);
      locala.cx(this.jMa.jLw);
      locala.yS(com.tencent.mm.pluginsdk.model.app.g.b(this.mContext, this.jMa, null));
      locala.setAppId(this.jMa.field_appId);
      locala.yT(this.jMa.cmJ);
      locala.ef(true);
      locala.ox(1);
      locala.cQ(this.jMa.field_packageName);
      locala.setScene(this.jMa.bYq);
      if (this.jMa.bPG != 1) {
        break label306;
      }
    }
    label306:
    for (long l = com.tencent.mm.plugin.downloader.model.d.aCU().b(locala.ick);; l = com.tencent.mm.plugin.downloader.model.d.aCU().a(locala.ick))
    {
      x.i("MicroMsg.CommonGameClickLinstener", " add download task result:[%d], appid[%s]，downloaerType[%d]", new Object[] { Long.valueOf(l), this.jMa.field_appId, Integer.valueOf(this.jMa.bPG) });
      com.tencent.mm.plugin.game.model.f.ai(this.mContext, this.jMa.field_appId);
      an.a(this.jMa.field_appId, this.jMa.bYq, 9, l, "");
      return;
      m.a(this.jMa.cmE, this.jMa.cmJ, this.jMa.bYq, this.jMa.field_appId, this.jTQ, this.jTS);
      break;
    }
  }
  
  protected final void aUI()
  {
    com.tencent.mm.plugin.game.model.f.ah(this.mContext, this.jMa.field_appId);
  }
  
  protected final void aUJ()
  {
    this.jTP = com.tencent.mm.plugin.downloader.model.c.yK(this.jMa.field_appId);
    this.jTO = com.tencent.mm.plugin.downloader.model.d.aCU().yO(this.jMa.field_appId);
    this.fGL = this.jTO.id;
    this.mStatus = this.jTO.status;
    this.jTN = this.jTO.path;
  }
  
  protected final void fw(final boolean paramBoolean)
  {
    if (!ao.isNetworkConnected(this.mContext))
    {
      Toast.makeText(this.mContext, this.mContext.getString(f.i.game_download_network_unavailable), 0).show();
      m.aTQ();
      m.a(this.jMa.field_appId, com.tencent.mm.plugin.downloader.a.a.ibn, false, null);
    }
    for (;;)
    {
      return;
      com.tencent.mm.kernel.g.Ek();
      if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
      {
        Toast.makeText(this.mContext, this.mContext.getString(f.i.game_download_sdcard_unavailable), 0).show();
        m.aTQ();
        m.a(this.jMa.field_appId, com.tencent.mm.plugin.downloader.a.a.ibo, false, null);
        return;
      }
      if (!com.tencent.mm.compatible.util.f.aM(this.jMa.jLw))
      {
        Toast.makeText(this.mContext, this.mContext.getString(f.i.game_download_not_enough_space), 0).show();
        m.aTQ();
        m.a(this.jMa.field_appId, com.tencent.mm.plugin.downloader.a.a.ibo, false, null);
        return;
      }
      if (com.tencent.mm.protocal.d.qVH.toLowerCase().contains(this.jTT)) {}
      try
      {
        if ((Settings.Secure.getInt(this.mContext.getContentResolver(), "install_non_market_apps") == 0) && (!com.tencent.mm.plugin.game.model.f.dt(this.mContext)))
        {
          com.tencent.mm.ui.base.h.a(this.mContext, f.i.game_show_tips_message, f.i.game_show_tips_title, f.i.game_gcontact_authorize_title, f.i.app_cancel, false, new c.3(this), new c.4(this));
          com.tencent.mm.plugin.game.model.f.du(this.mContext);
        }
        if ((bi.oW(this.jMa.cmE)) || (bi.oW(this.jMa.cmJ)))
        {
          x.d("MicroMsg.CommonGameClickLinstener", "downloadApk: appdownloadurl is null or appmd5 is null, try gpDownload");
          if (bi.oW(this.jMa.cmK))
          {
            x.e("MicroMsg.CommonGameClickLinstener", "downloadApk fail, gpDownloadUrl is null");
            if (bi.oW(this.jMa.cmE))
            {
              m.aTQ();
              m.a(this.jMa.field_appId, com.tencent.mm.plugin.downloader.a.a.DOWNLOAD_ERR_URL_INVALID, false, null);
            }
            if (!bi.oW(this.jMa.cmJ)) {
              continue;
            }
            m.aTQ();
            m.a(this.jMa.field_appId, com.tencent.mm.plugin.downloader.a.a.ibl, false, null);
            return;
          }
        }
      }
      catch (Settings.SettingNotFoundException localSettingNotFoundException)
      {
        for (;;)
        {
          x.e("MicroMsg.CommonGameClickLinstener", "SettingNotFoundException ; %S", new Object[] { localSettingNotFoundException.getMessage() });
          continue;
          x.d("MicroMsg.CommonGameClickLinstener", "downloadApk with gp, ret = %b", new Object[] { Boolean.valueOf(q.bi(this.mContext, this.jMa.cmK)) });
        }
        an.a(this.mContext, this.jMa.scene, this.jMa.bYq, this.jMa.position, 4, this.jMa.field_appId, this.jNv, this.jMa.bHF, this.jTR);
        if (ao.isWifi(this.mContext))
        {
          fx(paramBoolean);
          return;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.h(14217, new Object[] { this.jMa.field_appId, Integer.valueOf(4), "", this.jMa.cmE, Integer.valueOf(2) });
        com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(f.i.webview_download_ui_download_not_in_wifi_tips), this.mContext.getString(f.i.webview_download_ui_download_not_in_wifi_title), this.mContext.getString(f.i.webview_download_ui_btn_state_to_download), this.mContext.getString(f.i.app_cancel), false, new DialogInterface.OnClickListener()new c.2
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            com.tencent.mm.plugin.report.service.h.mEJ.h(14217, new Object[] { c.this.jMa.field_appId, Integer.valueOf(5), "", c.this.jMa.cmE, Integer.valueOf(2) });
            c.a(c.this, paramBoolean);
            paramAnonymousDialogInterface.dismiss();
          }
        }, new c.2(this), f.b.wechat_green);
      }
    }
  }
  
  public final void setSourceScene(int paramInt)
  {
    this.jNv = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */