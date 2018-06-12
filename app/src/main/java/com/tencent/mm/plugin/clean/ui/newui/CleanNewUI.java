package com.tencent.mm.plugin.clean.ui.newui;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.b.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bk;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.i;
import com.tencent.mm.ui.s;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

public class CleanNewUI
  extends MMActivity
  implements com.tencent.mm.plugin.clean.c.g
{
  private JSONObject hRA;
  private long hRw;
  private String hRx = "com.tencent.qqpimsecure";
  private String hRy = "00B1208638DE0FCD3E920886D658DAF6";
  private String hRz = "11206657";
  private LinearLayout hSO;
  private TextView hSP;
  private TextView hSQ;
  private Button hSR;
  private Button hSS;
  private TextView hST;
  private LinearLayout hSU;
  private TextView hSV;
  private TextView hSW;
  private Button hSX;
  private View hSY;
  private com.tencent.mm.plugin.clean.c.c hTw;
  
  private boolean aBu()
  {
    aBv();
    if (!p.r(this.mController.tml, this.hRx)) {}
    Object localObject;
    do
    {
      do
      {
        return false;
        localObject = p.bh(this, this.hRx);
      } while ((localObject == null) || (localObject[0] == null));
      localObject = com.tencent.mm.a.g.u(localObject[0].toByteArray());
    } while ((localObject == null) || (!((String)localObject).equalsIgnoreCase(this.hRy)));
    try
    {
      localObject = getPackageManager().getLaunchIntentForPackage(this.hRx);
      if (localObject != null)
      {
        Bundle localBundle = new Bundle();
        p.g(localBundle, this.hRz);
        ((Intent)localObject).putExtras(localBundle);
        ((Intent)localObject).addFlags(268435456);
        startActivity((Intent)localObject);
        h.mEJ.a(282L, 6L, 1L, false);
        return true;
      }
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CleanNewUI", localException, "", new Object[0]);
    }
    return true;
  }
  
  private boolean aBv()
  {
    au.HU();
    String str = (String)com.tencent.mm.model.c.DT().get(aa.a.sSl, "");
    if (bi.oW(str)) {
      return false;
    }
    try
    {
      this.hRA = new JSONObject(str);
      this.hRx = this.hRA.getString("packageName");
      this.hRA.get("md5");
      this.hRz = this.hRA.getString("launcherID");
      this.hRy = this.hRA.getString("signature");
      this.hRA.get("url");
      this.hRw = this.hRA.getLong("size");
      return true;
    }
    catch (JSONException localJSONException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CleanNewUI", localJSONException, "", new Object[0]);
    }
    return false;
  }
  
  private void o(long paramLong1, long paramLong2)
  {
    this.hSS.setEnabled(true);
    this.hST.setVisibility(8);
    this.hSP.setVisibility(0);
    this.hSQ.setVisibility(0);
    this.hSP.setText(bi.bF(paramLong1));
    int i = (int)(100L * paramLong1 / paramLong2);
    this.hSQ.setText(getString(R.l.clean_wechat_size_tips, new Object[] { i + "%" }));
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, ArrayList<com.tencent.mm.plugin.clean.c.b> paramArrayList, long paramLong4, HashSet<String> paramHashSet)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CleanNewUI", "wechatSize[%d] accSize[%d] otherAccSize[%d]", new Object[] { Long.valueOf(paramLong2), Long.valueOf(paramLong3), Long.valueOf(paramLong4) });
    d.ci(paramLong1);
    d.cf(paramLong2);
    d.ch(paramLong4);
    d.b(paramHashSet);
    d.cg(paramLong3);
    d.m(paramArrayList);
    o(d.aBj(), com.tencent.mm.plugin.clean.c.c.aBa());
  }
  
  public final void cp(int paramInt1, int paramInt2)
  {
    this.hST.setText(getString(R.l.analyse_file_profress, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
  }
  
  protected final int getLayoutId()
  {
    return R.i.clean_new_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.clean_ui_title);
    setBackBtn(new CleanNewUI.1(this));
    this.hSO = ((LinearLayout)findViewById(R.h.wechat_root));
    this.hSP = ((TextView)findViewById(R.h.wechat_size));
    this.hSQ = ((TextView)findViewById(R.h.wechat_size_tip));
    this.hSR = ((Button)findViewById(R.h.wechat_clean_msg_btn));
    this.hSS = ((Button)findViewById(R.h.wechat_clean_cache_btn));
    this.hSS.setVisibility(8);
    this.hST = ((TextView)findViewById(R.h.process_info_tv));
    this.hSR.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CleanNewUI", "goto clean msg ui");
        CleanNewUI.this.startActivityForResult(new Intent(CleanNewUI.this, CleanMsgUI.class), 0);
      }
    });
    this.hSS.setOnClickListener(new CleanNewUI.3(this));
    this.hSU = ((LinearLayout)findViewById(R.h.mobile_root));
    this.hSV = ((TextView)findViewById(R.h.mobile_size));
    this.hSW = ((TextView)findViewById(R.h.mobile_size_tip));
    this.hSX = ((Button)findViewById(R.h.qq_manager_clean_btn));
    this.hSY = ((View)findViewById(R.h.qq_manager_padding));
    this.hSX.setOnClickListener(new CleanNewUI.4(this));
    if ((bk.cjj()) || (com.tencent.mm.sdk.platformtools.e.bxk == 1))
    {
      this.hSX.setVisibility(8);
      this.hSY.setVisibility(0);
    }
    long l1 = com.tencent.mm.plugin.clean.c.c.aBa();
    long l2 = com.tencent.mm.plugin.clean.c.c.aBb();
    this.hSV.setText(bi.bF(l1 - l2));
    this.hSW.setText(getString(R.l.clean_mobile_size_tips, new Object[] { bi.bF(l2) }));
    paramBundle = new Intent();
    paramBundle.setComponent(new ComponentName(e.i.thA, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    paramBundle.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
    sendBroadcast(paramBundle);
    try
    {
      paramBundle = new b.b();
      paramBundle.sFu = "https://";
      paramBundle.host = "jtool.qq.com";
      paramBundle.uri = "/channel?productId=31&channelId=102133";
      new a((HttpURLConnection)new URL(paramBundle.getUrl()).openConnection()).a(paramBundle, new CleanNewUI.5(this, ""), new ag());
      d.a(new com.tencent.mm.plugin.clean.c.a.b());
      if (d.aBi() == null)
      {
        paramBundle = d.aBg();
        if (paramBundle != null)
        {
          this.hTw = new com.tencent.mm.plugin.clean.c.c(paramBundle, this);
          com.tencent.mm.sdk.f.e.post(this.hTw, "CleanUI_clean");
          this.hSS.setEnabled(false);
          this.hSP.setVisibility(8);
          this.hSQ.setVisibility(8);
          this.hST.setVisibility(0);
          this.hST.setText(getString(R.l.analyse_file_profress, new Object[] { "0%" }));
        }
      }
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CleanNewUI", paramBundle, paramBundle.getMessage(), new Object[0]);
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (d.aBi() != null) {
      o(d.aBj(), com.tencent.mm.plugin.clean.c.c.aBa());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/newui/CleanNewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */