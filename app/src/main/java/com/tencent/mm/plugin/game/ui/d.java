package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.g.c.p;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.f.j;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.be;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.y;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.i;
import java.util.Set;

public final class d
{
  private static Object lock = new Object();
  private al icJ = new al(Looper.getMainLooper(), new d.1(this), false);
  private Dialog jJX;
  int jNv = 0;
  String jTR = null;
  private h jUc = null;
  private u jUd = null;
  private q jUe = null;
  private t jUf = null;
  DialogInterface.OnClickListener jUg = null;
  private int jUh = 3000;
  private Context mContext;
  
  public d(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private static boolean a(Set<String> paramSet, String paramString)
  {
    if ((paramSet == null) || (paramSet.isEmpty())) {}
    while (!paramSet.contains(paramString)) {
      return false;
    }
    return true;
  }
  
  public final void a(ProgressBar paramProgressBar, Button paramButton, com.tencent.mm.plugin.game.model.d paramd, n paramn)
  {
    if ((paramProgressBar == null) || (paramButton == null)) {
      return;
    }
    paramButton.setEnabled(true);
    paramButton.setVisibility(0);
    if (paramd.status == 1)
    {
      if (paramd.jLg)
      {
        paramButton.setEnabled(false);
        paramButton.setText(f.i.game_action_subscribed);
        paramButton.setVisibility(0);
        paramProgressBar.setVisibility(8);
        return;
      }
      paramButton.setText(f.i.game_action_subscribe);
      paramButton.setVisibility(0);
      paramProgressBar.setVisibility(8);
      return;
    }
    if (com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, paramd))
    {
      int i = c.DP(paramd.field_packageName);
      if (paramd.versionCode > i) {
        if (paramn.status == 1)
        {
          paramProgressBar.setVisibility(0);
          paramProgressBar.setProgress(paramn.progress);
          paramButton.setVisibility(8);
        }
      }
      for (;;)
      {
        x.i("MicroMsg.GameActionBtnHandler", "AppId: %s installed, local: %d, server: %d", new Object[] { paramd.field_appId, Integer.valueOf(i), Integer.valueOf(paramd.versionCode) });
        return;
        if (paramd.scene == 12) {
          paramButton.setText(f.i.game_detail_rank_update);
        }
        for (;;)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          paramButton.setText(f.i.game_action_update);
        }
        paramButton.setVisibility(0);
        paramProgressBar.setVisibility(8);
        if (paramd.scene == 12) {
          paramButton.setText(f.i.game_detail_rank_launch);
        } else {
          paramButton.setText(f.i.game_list_launch);
        }
      }
    }
    if (paramd.aTx())
    {
      paramButton.setVisibility(0);
      paramProgressBar.setVisibility(8);
      if (paramd.scene == 12)
      {
        paramButton.setText(f.i.game_detail_rank_launch);
        return;
      }
      paramButton.setText(f.i.game_list_launch);
      return;
    }
    switch (paramd.status)
    {
    default: 
      paramButton.setVisibility(8);
      paramProgressBar.setVisibility(8);
    }
    for (;;)
    {
      x.i("MicroMsg.GameActionBtnHandler", "updateBtnStateAndText: %s, Status: %d, Text: %s", new Object[] { paramd.field_appId, Integer.valueOf(paramd.status), paramButton.getText() });
      return;
      if (paramn == null)
      {
        paramButton.setVisibility(8);
        paramProgressBar.setVisibility(8);
        return;
      }
      switch (paramn.status)
      {
      default: 
        break;
      case 0: 
        if (paramd.scene == 12) {
          if (paramd.jLn)
          {
            paramn = paramd.field_appId;
            if (!a(f.dv(this.mContext), paramn)) {
              paramButton.setText(f.i.game_download_gift);
            }
          }
        }
        for (;;)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          paramButton.setText(f.i.game_list_download_app);
          continue;
          paramButton.setText(f.i.game_list_download);
        }
      case 1: 
        if (paramn.mode == 3) {
          paramButton.setText(f.i.game_list_download_view);
        }
      case 2: 
      case 3: 
        for (;;)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          if (paramn.mode != 1) {
            break;
          }
          paramProgressBar.setProgress(paramn.progress);
          paramButton.setVisibility(8);
          paramProgressBar.setVisibility(0);
          break;
          if (paramd.scene == 12) {
            paramButton.setText(f.i.game_download_continue_task);
          }
          for (;;)
          {
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
            break;
            paramButton.setText(f.i.game_list_download_continue);
          }
          if (paramd.scene == 12) {
            paramButton.setText(f.i.game_list_app_install_btn);
          } else {
            paramButton.setText(f.i.game_list_app_install);
          }
        }
        if (paramd.jLg)
        {
          paramButton.setEnabled(false);
          paramButton.setText(f.i.game_action_subscribed);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
        }
        else
        {
          paramButton.setText(f.i.game_action_subscribe);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          continue;
          paramButton.setText(f.i.game_action_preemptive);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          continue;
          if (paramn == null)
          {
            paramButton.setText(f.i.game_action_grab);
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
            return;
          }
          switch (paramn.status)
          {
          default: 
            break;
          case 0: 
            paramButton.setText(f.i.game_action_grab);
          case 1: 
          case 2: 
          case 3: 
            for (;;)
            {
              paramButton.setVisibility(0);
              paramProgressBar.setVisibility(8);
              break;
              if (paramn.mode == 3)
              {
                paramButton.setText(f.i.game_list_download_view);
                break;
              }
              if (paramn.mode != 1) {
                break;
              }
              paramProgressBar.setProgress(paramn.progress);
              paramButton.setVisibility(8);
              paramProgressBar.setVisibility(0);
              break;
              if (paramd.scene == 12) {
                paramButton.setText(f.i.game_download_continue_task);
              }
              for (;;)
              {
                paramButton.setVisibility(0);
                paramProgressBar.setVisibility(8);
                break;
                paramButton.setText(f.i.game_list_download_continue);
              }
              if (paramd.scene == 12) {
                paramButton.setText(f.i.game_list_app_install_btn);
              } else {
                paramButton.setText(f.i.game_list_app_install);
              }
            }
            paramButton.setText(f.i.game_action_trial);
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
          }
        }
        break;
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.game.model.d paramd, n paramn)
  {
    if ((paramd == null) || (paramn == null))
    {
      x.e("MicroMsg.GameActionBtnHandler", "Null appInfo or null downloadInfo");
      return;
    }
    Object localObject1 = new View(this.mContext);
    ((View)localObject1).setTag(paramd);
    x.i("MicroMsg.GameActionBtnHandler", "App Status: %d, Download Mode: %d, Download Status: %d", new Object[] { Integer.valueOf(paramd.status), Integer.valueOf(paramn.mode), Integer.valueOf(paramn.status) });
    if ((com.tencent.mm.pluginsdk.model.app.g.r(this.mContext, paramd.field_appId)) || (paramd.aTx())) {
      paramn.mode = 1;
    }
    int i;
    if (paramn.mode == 3)
    {
      be.aUD();
      i = be.i(this.mContext, "com.tencent.android.qqdownloader", paramd.cmT);
      x.i("MicroMsg.GameActionBtnHandler", "qqdownloader install status:[%d], yybSupportedVersionCode:[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramd.cmT) });
      if ((i == -1) || (i == 1) || (i == 2)) {
        paramn.mode = 1;
      }
    }
    switch (paramd.status)
    {
    default: 
      return;
    case 0: 
    case 3: 
    case 4: 
      switch (paramn.mode)
      {
      default: 
        x.d("MicroMsg.GameActionBtnHandler", "summertoken downloadInfo.mode[%d]", new Object[] { Integer.valueOf(paramn.mode) });
        if (this.jUc == null) {
          this.jUc = new h(this.mContext);
        }
        this.jUc.setSourceScene(this.jNv);
        this.jUc.dc(this.jTR, "");
        this.jUc.onClick((View)localObject1);
      }
      while (paramd.jLn)
      {
        localObject1 = f.dv(this.mContext);
        if (a((Set)localObject1, paramd.field_appId)) {
          break;
        }
        if (paramn.mode != 3)
        {
          paramn = LayoutInflater.from(this.mContext).inflate(f.f.game_gift_tips, null);
          ((LinearLayout)paramn.findViewById(f.e.mm_alert_msg_area)).setGravity(17);
          localObject2 = (ImageView)paramn.findViewById(f.e.mm_alert_msg_icon);
          localObject3 = (TextView)paramn.findViewById(f.e.mm_alert_msg);
          TextView localTextView = (TextView)paramn.findViewById(f.e.mm_alert_msg_subdesc);
          ((ImageView)localObject2).setBackgroundResource(f.d.download_gift);
          ((TextView)localObject3).setText(f.i.game_gift_title);
          localTextView.setText(f.i.game_gift_content);
          this.jJX = new i(this.mContext, f.j.GameNoticStyle);
          this.jJX.setContentView(paramn);
          this.jJX.setCancelable(true);
          this.jJX.setCanceledOnTouchOutside(true);
          this.jJX.show();
          paramn = this.icJ;
          long l = this.jUh;
          paramn.J(l, l);
        }
        ((b)com.tencent.mm.kernel.g.l(b.class)).aSh();
        y.b(paramd.field_appId, 1, 0, null, null);
        ((Set)localObject1).add(paramd.field_appId);
        f.a(this.mContext, (Set)localObject1);
        return;
        Object localObject2 = com.tencent.mm.plugin.downloader.model.d.aCU().yO(paramd.field_appId);
        if ((localObject2 != null) && (((FileDownloadTaskInfo)localObject2).id > 0L)) {
          com.tencent.mm.plugin.downloader.model.d.aCU().cl(((FileDownloadTaskInfo)localObject2).id);
        }
        if (this.jUd == null) {
          this.jUd = new u(this.mContext);
        }
        localObject2 = this.jUd;
        i = this.jNv;
        Object localObject3 = this.jTR;
        ((u)localObject2).jNv = i;
        ((u)localObject2).jTR = ((String)localObject3);
        this.jUd.onClick((View)localObject1);
        continue;
        if (!bi.oW(paramd.cmK))
        {
          x.i("MicroMsg.GameActionBtnHandler", "gp download url is not null and download flag is download directly by gp store");
          com.tencent.mm.pluginsdk.model.app.q.bi(this.mContext, paramd.cmK);
          an.a(this.mContext, paramd.scene, paramd.bYq, paramd.position, 25, paramd.field_appId, this.jNv, paramd.bHF, this.jTR);
        }
      }
    case 1: 
      if (this.jUf == null)
      {
        this.jUf = new t(this.mContext);
        this.jUf.kcI = this.jUg;
      }
      this.jUf.jNv = this.jNv;
      this.jUf.onClick((View)localObject1);
      an.a(this.mContext, paramd.scene, paramd.bYq, paramd.position, 9, paramd.field_appId, this.jNv, paramd.bHF, this.jTR);
      return;
    }
    paramn = com.tencent.mm.plugin.downloader.model.d.aCU().yO(paramd.field_appId);
    if ((paramn != null) && (paramn.id > 0L)) {
      com.tencent.mm.plugin.downloader.model.d.aCU().cl(paramn.id);
    }
    if (this.jUe == null) {
      this.jUe = new q(this.mContext);
    }
    this.jUe.hop = this.jNv;
    this.jUe.kbt = paramd.cmO;
    this.jUe.onClick((View)localObject1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */