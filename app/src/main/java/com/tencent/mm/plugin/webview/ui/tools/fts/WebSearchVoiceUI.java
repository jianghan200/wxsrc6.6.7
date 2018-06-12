package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

@com.tencent.mm.ui.base.a(7)
public class WebSearchVoiceUI
  extends WebSearchBaseActivity
{
  private String bJK;
  private String bWr;
  private View qfA;
  private int qfB;
  private com.tencent.mm.pluginsdk.ui.websearch.a qfz;
  private int scene;
  
  protected final int getLayoutId()
  {
    return R.i.websearch_voice_ui;
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    setResult(0);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent() != null)
    {
      this.bJK = getIntent().getStringExtra("sessionId");
      this.bWr = getIntent().getStringExtra("subSessionId");
      this.scene = getIntent().getIntExtra("key_scene", -1);
      this.qfB = getIntent().getIntExtra("key_is_nav_voice", 0);
    }
    this.qfA = findViewById(R.h.voiceinput_mask_view);
    this.mController.hideTitleView();
    if (this.qfz == null)
    {
      this.qfz = new com.tencent.mm.pluginsdk.ui.websearch.a(this.mController.tml);
      this.qfz.setCallback(new WebSearchVoiceUI.1(this));
    }
    this.qfz.ceU();
    com.tencent.mm.pluginsdk.ui.websearch.a locala = this.qfz;
    x.d("MicroMsg.VoiceInputPanel", "refreshHeight DISPLAY_HEIGHT_PORT_IN_PX %s,needRefreshProtHeight %s", new Object[] { Integer.valueOf(locala.qKG), Boolean.valueOf(locala.qNS) });
    if (locala.qNS)
    {
      locala.qNS = false;
      View localView = locala.findViewById(R.h.voice_panel_display_view);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      int i = locala.qKG;
      paramBundle = localLayoutParams;
      if (localLayoutParams == null) {
        paramBundle = new LinearLayout.LayoutParams(-1, i);
      }
      paramBundle.height = i;
      localView.setLayoutParams(paramBundle);
      locala.ceW();
      locala.requestLayout();
    }
    this.qfz.setVisibility(0);
    paramBundle = new RelativeLayout.LayoutParams(-1, -2);
    paramBundle.addRule(12);
    ((ViewGroup)findViewById(R.h.root)).addView(this.qfz, paramBundle);
    h.mEJ.h(15178, new Object[] { Integer.valueOf(1), Long.valueOf(System.currentTimeMillis()), "", this.bJK, this.bWr, Integer.valueOf(this.scene), Integer.valueOf(this.qfB) });
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.qfz != null) {
      this.qfz.destroy();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/WebSearchVoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */