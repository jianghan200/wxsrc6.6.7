package com.tencent.mm.plugin.traceroute.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ui.MMActivity;

public class NetworkDiagnoseReportUI
  extends MMActivity
{
  private static String oDd;
  private boolean oDR = false;
  private Button oDS;
  private Button oDT;
  private ImageView oDU;
  private TextView oDV;
  private TextView oDW;
  private TextView oDX;
  
  protected final int getLayoutId()
  {
    return R.i.network_diagnose_report;
  }
  
  protected final void initView()
  {
    setMMTitle("");
    this.oDU = ((ImageView)findViewById(R.h.report_result_iv));
    this.oDV = ((TextView)findViewById(R.h.report_result_tv));
    this.oDW = ((TextView)findViewById(R.h.report_result_tip_tv));
    this.oDR = getIntent().getBooleanExtra("diagnose_result", false);
    if (this.oDR)
    {
      this.oDU.setImageResource(R.g.net_connectreport_success);
      this.oDV.setText(getString(R.l.upload_report_success));
      this.oDW.setVisibility(0);
      addTextOptionMenu(0, getString(R.l.diagnose_finish), new NetworkDiagnoseReportUI.1(this));
    }
    do
    {
      return;
      setBackBtn(new NetworkDiagnoseReportUI.2(this));
      oDd = getIntent().getStringExtra("diagnose_log_file_path");
      this.oDU.setImageResource(R.g.net_connectreport_fail);
      this.oDV.setText(getString(R.l.upload_report_failed));
    } while ((oDd == null) || (e.cm(oDd) <= 0));
    this.oDX = ((TextView)findViewById(R.h.report_result_on_sdcard));
    this.oDX.setText(getString(R.l.report_on_sdcard, new Object[] { oDd.replace("mnt/", "") }));
    findViewById(R.h.report_result_on_sdcard).setVisibility(0);
    findViewById(R.h.send_mail_tip).setVisibility(0);
    this.oDS = ((Button)findViewById(R.h.send_report_by_email));
    this.oDS.setVisibility(0);
    this.oDS.setOnClickListener(new NetworkDiagnoseReportUI.3(this));
    this.oDT = ((Button)findViewById(R.h.view_log));
    this.oDT.setVisibility(0);
    this.oDT.setOnClickListener(new NetworkDiagnoseReportUI.4(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */