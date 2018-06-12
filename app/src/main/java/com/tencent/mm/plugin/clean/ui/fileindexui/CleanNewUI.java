package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.jj;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.j.b;
import com.tencent.mm.plugin.j.b.5;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.c.b.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bk;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.i;
import com.tencent.mm.ui.s;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class CleanNewUI
  extends MMActivity
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
  private boolean hSZ = false;
  private com.tencent.mm.plugin.clean.b.a hTa;
  private long hTb = 0L;
  private long hTc = 0L;
  private long hTd = 0L;
  private long hTe = 0L;
  private com.tencent.mm.plugin.clean.b.c hTf = new CleanNewUI.6(this);
  private com.tencent.mm.sdk.b.c<jj> hTg = new CleanNewUI.9(this);
  
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
      localObject = g.u(localObject[0].toByteArray());
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
        h.mEJ.a(714L, 7L, 1L, false);
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
  
  private void aBy()
  {
    this.hSS.setEnabled(false);
    this.hSP.setVisibility(8);
    this.hSQ.setVisibility(8);
    this.hST.setVisibility(0);
  }
  
  private void aBz()
  {
    this.hTa = new com.tencent.mm.plugin.clean.b.a(this.hTf);
    this.hTd = bi.VF();
    com.tencent.mm.sdk.f.e.post(this.hTa, "cleanUI_calc");
    aBy();
    h.mEJ.a(714L, 52L, 1L, false);
  }
  
  private String avy()
  {
    return hashCode();
  }
  
  private void o(long paramLong1, long paramLong2)
  {
    this.hSS.setEnabled(true);
    this.hST.setVisibility(8);
    this.hSP.setVisibility(0);
    this.hSQ.setVisibility(0);
    this.hSR.setEnabled(true);
    this.hSP.setText(bi.bF(paramLong1));
    int i = (int)(100L * paramLong1 / paramLong2);
    if (i > 0)
    {
      this.hSQ.setText(getString(R.l.clean_wechat_size_tips, new Object[] { i + "%" }));
      return;
    }
    this.hSQ.setText(R.l.clean_wechat_size_tips_less_1_percent);
  }
  
  public final void cr(int paramInt1, int paramInt2)
  {
    ah.A(new CleanNewUI.7(this, paramInt1, paramInt2));
  }
  
  protected final int getLayoutId()
  {
    return R.i.clean_new_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.clean_msg_ui_title);
    setBackBtn(new CleanNewUI.1(this));
    this.hSO = ((LinearLayout)findViewById(R.h.wechat_root));
    this.hSP = ((TextView)findViewById(R.h.wechat_size));
    this.hSQ = ((TextView)findViewById(R.h.wechat_size_tip));
    this.hSR = ((Button)findViewById(R.h.wechat_clean_msg_btn));
    this.hSR.setEnabled(false);
    this.hSS = ((Button)findViewById(R.h.wechat_clean_cache_btn));
    this.hSS.setVisibility(8);
    this.hST = ((TextView)findViewById(R.h.process_info_tv));
    this.hSR.setOnClickListener(new CleanNewUI.2(this));
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
    j.aBt();
    long l1 = j.aBa();
    j.aBt();
    long l2 = j.aBb();
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
      new com.tencent.mm.sdk.c.a((HttpURLConnection)new URL(paramBundle.getUrl()).openConnection()).a(paramBundle, new CleanNewUI.5(this, ""), new ag());
      if (b.avr().avu())
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CleanNewUI", "%s it scan finish", new Object[] { avy() });
        this.hSZ = false;
        aBz();
        this.hST.setText(getString(R.l.analyse_file_profress, new Object[] { "0%" }));
        h.mEJ.a(714L, 50L, 1L, false);
        h.mEJ.a(714L, 1L, 1L, false);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CleanNewUI", paramBundle, paramBundle.getMessage(), new Object[0]);
        continue;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CleanNewUI", "%s it scan not finish", new Object[] { avy() });
        this.hTb = bi.VF();
        this.hSZ = true;
        com.tencent.mm.sdk.b.a.sFg.a(this.hTg);
        b.avr().dN(true);
        aBy();
        cr(0, 100);
      }
    }
  }
  
  protected void onDestroy()
  {
    boolean bool = false;
    super.onDestroy();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CleanNewUI", "%s stop maunal scan needScanWxFileIndex[%b]", new Object[] { avy(), Boolean.valueOf(this.hSZ) });
    if (this.hSZ)
    {
      com.tencent.mm.sdk.b.a.sFg.c(this.hTg);
      b localb = b.avr();
      String str = localb.avy();
      if (localb.hsL != null) {
        bool = true;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CalcWxService", "%s stop manual scan now manualScanTask[%b]", new Object[] { str, Boolean.valueOf(bool) });
      localb.j(new b.5(localb));
    }
    if (this.hTa != null) {
      this.hTa.stop();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.hTe > 0L) && (j.aBt().hQC != 0L))
    {
      long l = j.aBt().hQC;
      j.aBt();
      o(l, j.aBa());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */