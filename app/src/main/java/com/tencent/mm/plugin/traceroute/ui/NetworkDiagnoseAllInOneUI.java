package com.tencent.mm.plugin.traceroute.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;

public class NetworkDiagnoseAllInOneUI
  extends MMActivity
  implements View.OnClickListener
{
  private ImageView bOA;
  private a.a cXs;
  private Button eGn;
  private al eOf;
  private com.tencent.mm.modelgeo.c kJQ;
  private TextView oDA;
  private TextView oDB;
  private TextView oDC;
  private p oDD;
  private int oDE;
  private String oDF;
  private com.tencent.mm.sdk.b.c<kd> oDG;
  private boolean oDH;
  private boolean oDI;
  private boolean oDJ;
  private int oDy;
  private TextView oDz;
  
  private void YI()
  {
    x.i("MicroMsg.NetworkDiagnoseAllInOneUI", "refreshUI, state:%d", new Object[] { Integer.valueOf(this.oDy) });
    switch (this.oDy)
    {
    default: 
      return;
    case 0: 
    case 1: 
      this.bOA.setImageResource(R.k.network_diagnose_work);
      this.oDB.setText(getString(R.l.diagnose_state_doing, new Object[] { Integer.valueOf(this.oDE) }));
      this.oDC.setText(R.l.diagnose_descript_doing);
      this.eGn.setVisibility(4);
      this.oDA.setVisibility(4);
      return;
    case 2: 
      this.bOA.setImageResource(R.k.network_diagnose_work);
      this.oDB.setText(R.l.diagnose_state_success);
      this.oDC.setText(R.l.diagnose_descript_success);
      this.eGn.setVisibility(0);
      this.oDA.setVisibility(4);
      return;
    case 4: 
      this.bOA.setImageResource(R.k.network_diagnose_fail);
      this.oDB.setText(R.l.diagnose_state_longlink_fail);
      this.oDC.setText(R.l.diagnose_descript_fail);
      this.eGn.setVisibility(0);
      this.eGn.setText(R.l.diagnose_btn_submit);
      this.oDA.setVisibility(0);
      return;
    case 5: 
      this.bOA.setImageResource(R.k.network_diagnose_fail);
      this.oDB.setText(R.l.diagnose_state_fail);
      this.oDC.setText(R.l.diagnose_descript_fail);
      this.eGn.setVisibility(0);
      this.eGn.setText(R.l.diagnose_btn_submit);
      this.oDA.setVisibility(0);
      return;
    case 3: 
      Intent localIntent = new Intent();
      localIntent.putExtra("title", R.l.net_warn_no_network);
      localIntent.putExtra("rawUrl", getString(R.l.net_warn_detail_doc));
      localIntent.putExtra("showShare", false);
      d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
      iG(false);
      finish();
      return;
    }
    this.bOA.setImageResource(R.k.network_diagnose_feedback);
    this.oDB.setText(R.l.diagnose_state_feedback);
    this.oDC.setText(R.l.diagnose_descript_feedback);
    this.eGn.setVisibility(0);
    this.eGn.setText(R.l.diagnose_btn_comfirm);
    this.oDA.setVisibility(4);
  }
  
  private void iG(boolean paramBoolean)
  {
    if (bi.oW(this.oDF)) {
      return;
    }
    x.i("MicroMsg.NetworkDiagnoseAllInOneUI", "submit action, bSendLoaction:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
      if (com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 71, "", ""))
      {
        getString(R.l.app_tip);
        this.oDD = com.tencent.mm.ui.base.h.a(this, getString(R.l.diagnose_uploading), true, null);
        this.eGn.setEnabled(false);
        if (this.kJQ == null) {
          this.kJQ = com.tencent.mm.modelgeo.c.OB();
        }
        this.kJQ.a(this.cXs, true);
      }
    }
    for (;;)
    {
      this.oDF = null;
      return;
      com.tencent.mm.plugin.report.service.h.mEJ.k(14533, "," + this.oDF);
    }
  }
  
  public void finish()
  {
    super.finish();
    overridePendingTransition(R.a.anim_not_change, R.a.push_down_out);
  }
  
  protected final int getLayoutId()
  {
    return R.i.network_diagnose_all_in_one;
  }
  
  public void onClick(View paramView)
  {
    if (((this.oDy == 5) || (this.oDy == 4)) && (paramView == this.eGn))
    {
      iG(true);
      return;
    }
    iG(false);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    overridePendingTransition(R.a.push_up_in, R.a.anim_not_change);
    setMMTitle("");
    getSupportActionBar().hide();
    paramBundle = getIntent();
    this.oDy = paramBundle.getIntExtra("diagnose_state", 0);
    this.oDE = paramBundle.getIntExtra("diagnose_percent", 1);
    this.oDF = paramBundle.getStringExtra("diagnose_kvInfo");
    x.i("MicroMsg.NetworkDiagnoseAllInOneUI", "get state: %d percent: %d, kv: %s", new Object[] { Integer.valueOf(this.oDy), Integer.valueOf(this.oDE), this.oDF });
    if (this.oDy == 0)
    {
      this.oDy = 1;
      x.i("MicroMsg.NetworkDiagnoseAllInOneUI", "start diagnose");
      au.DF().a(new bg(new NetworkDiagnoseAllInOneUI.4(this)), 0);
    }
    this.eGn = ((Button)findViewById(R.h.diagnose_okBtn));
    this.oDz = ((TextView)findViewById(R.h.diagnose_closeLabel));
    this.oDA = ((TextView)findViewById(R.h.diagnose_cancelLabel));
    this.bOA = ((ImageView)findViewById(R.h.diagnose_state_img));
    this.oDB = ((TextView)findViewById(R.h.diagnose_state_label));
    this.oDC = ((TextView)findViewById(R.h.diagnose_descp_label));
    this.oDz.setOnClickListener(this);
    this.eGn.setOnClickListener(this);
    this.oDA.setOnClickListener(this);
    YI();
    this.oDG = new NetworkDiagnoseAllInOneUI.1(this);
    com.tencent.mm.sdk.b.a.sFg.a(this.oDG);
    this.cXs = new NetworkDiagnoseAllInOneUI.2(this);
    this.eOf = new al(new NetworkDiagnoseAllInOneUI.3(this), true);
    if ((this.oDy == 0) || (this.oDy == 1)) {
      this.eOf.J(1000L, 1000L);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.b.a.sFg.c(this.oDG);
    if (this.kJQ != null)
    {
      this.kJQ.c(this.cXs);
      this.kJQ = null;
    }
    if (this.eOf != null)
    {
      this.eOf.SO();
      this.eOf = null;
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.NetworkDiagnoseAllInOneUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      iG(true);
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_location_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.permission_cancel), false, new NetworkDiagnoseAllInOneUI.5(this), new NetworkDiagnoseAllInOneUI.6(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseAllInOneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */