package com.tencent.mm.plugin.game.gamewebview.ui;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.webkit.WebView;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.e.b;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.webview.modeltools.f.c;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.k;
import com.tencent.xweb.WebView.b;

public final class h
  implements View.OnCreateContextMenuListener
{
  private MMActivity fcq;
  public k gcQ;
  String gcR;
  public int gcS;
  public int gcT;
  public com.tencent.mm.plugin.webview.modeltools.f gcU;
  WebView.b gcV;
  WebView.b gcW;
  private f.c gda = new h.1(this);
  private b jIZ;
  private e jJi;
  
  public h(MMActivity paramMMActivity, b paramb, e parame)
  {
    this.fcq = paramMMActivity;
    this.jIZ = paramb;
    this.jJi = parame;
    this.gcQ = new k(paramMMActivity);
    this.gcQ.a(this.jIZ, this, null);
    this.gcQ.d(new h.2(this));
  }
  
  private boolean a(ContextMenu paramContextMenu, String paramString)
  {
    if (!com.tencent.mm.compatible.util.f.zZ())
    {
      x.e("MicroMsg.GameWebViewMenuListHelper", "SD card unavailable");
      return true;
    }
    boolean bool = d.aSn();
    paramContextMenu.setHeaderTitle(R.l.wv_image);
    x.i("MicroMsg.GameWebViewMenuListHelper", "hasSetAcc = %b", new Object[] { Boolean.valueOf(bool) });
    if (bool) {
      paramContextMenu.add(0, 0, 0, this.fcq.getString(R.l.readerapp_alert_retransmit)).setOnMenuItemClickListener(new h.4(this, paramString));
    }
    paramContextMenu.add(0, 0, 0, this.fcq.getString(R.l.save_to_local)).setOnMenuItemClickListener(new h.5(this, paramString));
    if (bool) {
      paramContextMenu.add(0, 0, 0, this.fcq.getString(R.l.plugin_favorite_opt)).setOnMenuItemClickListener(new h.6(this, paramString));
    }
    if (this.gcR != null)
    {
      String str = this.gcR;
      if (this.gcS == 22) {}
      for (paramString = this.fcq.getString(R.l.recog_wxcode_of_image_file);; paramString = this.fcq.getString(R.l.recog_qbar_of_image_file))
      {
        paramContextMenu.add(0, 0, 0, paramString).setOnMenuItemClickListener(new h.7(this, str));
        this.gcR = null;
        return true;
      }
    }
    return false;
  }
  
  private static boolean aTg()
  {
    CommonLogicTask localCommonLogicTask = new CommonLogicTask();
    localCommonLogicTask.type = 5;
    GameWebViewMainProcessService.b(localCommonLogicTask);
    return localCommonLogicTask.jfZ.getBoolean("allow_webview_scan", false);
  }
  
  final void a(ContextMenu paramContextMenu, WebView.b paramb)
  {
    if ((!a(paramContextMenu, paramb.mExtra)) && (this.jJi.bVS().cgh()) && (aTg()))
    {
      this.gcW = paramb;
      this.gcU = new com.tencent.mm.plugin.webview.modeltools.f();
      this.gcU.a(this.jIZ, this.gda);
    }
  }
  
  final void b(ContextMenu paramContextMenu, WebView.b paramb)
  {
    if ((!a(paramContextMenu, paramb.mExtra)) && (this.jJi.bVS().cgh()) && (aTg()))
    {
      this.gcV = paramb;
      this.gcU = new com.tencent.mm.plugin.webview.modeltools.f();
      this.gcU.a(this.jIZ, this.gda);
    }
  }
  
  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    x.d("MicroMsg.GameWebViewMenuListHelper", "onCreateContextMenu");
    if ((paramView instanceof WebView))
    {
      paramView = this.jIZ.getHitTestResult();
      if (paramView != null) {}
    }
    do
    {
      do
      {
        return;
      } while ((paramView.mType != 5) && (paramView.mType != 8));
      b(paramContextMenu, paramView);
      return;
      paramView = this.jIZ.getHitTestResult();
    } while ((paramView == null) || ((paramView.mType != 5) && (paramView.mType != 8)));
    a(paramContextMenu, paramView);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */