package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.clean.ui.PieView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CleanMsgUI
  extends MMActivity
{
  private ProgressDialog eHw;
  private TextView hSA;
  private TextView hSB;
  private TextView hSC;
  private View hSD;
  private TextView hSE;
  private TextView hSF;
  private TextView hSG;
  private TextView hSH;
  private TextView hSI;
  private TextView hSJ;
  private LinearLayout hSK;
  private View hSu;
  private PieView hSv;
  private TextView hSw;
  private Button hSx;
  private Button hSy;
  private TextView hSz;
  
  private void c(long paramLong1, long paramLong2, long paramLong3)
  {
    long l = paramLong1;
    if (paramLong1 <= 0L)
    {
      l = 1L;
      com.tencent.mm.plugin.report.service.h.mEJ.a(714L, 61L, 1L, false);
    }
    int j = (int)(360L * paramLong2 / l);
    if ((paramLong2 > 0L) && (j < 5)) {
      j = 5;
    }
    for (;;)
    {
      int i = 0;
      if (paramLong3 > 0L)
      {
        int k = (int)(360L * paramLong3 / l);
        i = k;
        if (k < 5) {
          i = 5;
        }
      }
      paramLong1 = l - paramLong2 - paramLong3;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CleanMsgUI", "update acc[%d %d] otherAcc[%d %d] other[%d %d] wechat[%d] stack[%s]", new Object[] { Long.valueOf(paramLong2), Integer.valueOf((int)(100L * paramLong2 / l)), Long.valueOf(paramLong3), Integer.valueOf((int)(100L * paramLong3 / l)), Long.valueOf(paramLong1), Integer.valueOf((int)(100L * paramLong1 / l)), Long.valueOf(l), bi.cjd() });
      this.hSv.setGreenTargetAngle(j);
      this.hSv.setOtherAccTargetAngle(i);
      this.hSv.setStage(1);
      this.hSu.setVisibility(0);
      this.hSz.setText(bi.bF(paramLong2));
      this.hSA.setText(bi.bF(paramLong3));
      this.hSB.setText(bi.bF(paramLong1));
      if (paramLong3 > 0L)
      {
        this.hSD.setVisibility(0);
        this.hSy.setEnabled(true);
      }
      TextView localTextView;
      StringBuffer localStringBuffer;
      for (;;)
      {
        this.hSG.setText(getString(R.l.clean_acc_tips));
        this.hSH.setText(getString(R.l.clean_other_acc_size_tips));
        this.hSI.setText(getString(R.l.clean_other_size_tips));
        if (((Integer)g.Ei().DT().get(aa.a.sYn, Integer.valueOf(0))).intValue() <= 0) {
          break label501;
        }
        this.hSK.setVisibility(0);
        this.hSJ.setVisibility(0);
        localTextView = this.hSJ;
        HashMap localHashMap = j.aBt().hRp;
        localStringBuffer = new StringBuffer();
        if (localHashMap.isEmpty()) {
          break;
        }
        Iterator localIterator = localHashMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localStringBuffer.append(str).append(" : ").append(bi.bF(((Long)localHashMap.get(str)).longValue())).append("\n");
        }
        this.hSy.setEnabled(false);
        this.hSD.setVisibility(0);
      }
      localTextView.setText(localStringBuffer.toString());
      label501:
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.clean_msg_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    c(j.aBt().hQC, j.aBt().hQD, j.aBt().hQE);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.h.mEJ.a(714L, 10L, 1L, false);
    this.hSw = ((TextView)findViewById(R.h.process_info_tv));
    this.hSv = ((PieView)findViewById(R.h.pie_view));
    this.hSx = ((Button)findViewById(R.h.clean_btn));
    this.hSy = ((Button)findViewById(R.h.clean_other_btn));
    this.hSu = findViewById(R.h.analyse_data_layout);
    this.hSz = ((TextView)findViewById(R.h.wechat_data_tv));
    this.hSz.setTextSize(1, 16.0F);
    this.hSA = ((TextView)findViewById(R.h.other_acc_data_tv));
    this.hSA.setTextSize(1, 16.0F);
    this.hSB = ((TextView)findViewById(R.h.other_data_tv));
    this.hSB.setTextSize(1, 16.0F);
    this.hSC = ((TextView)findViewById(R.h.free_data_tv));
    this.hSC.setTextSize(1, 16.0F);
    this.hSE = ((TextView)findViewById(R.h.clean_data_tv));
    this.hSF = ((TextView)findViewById(R.h.clean_suggest_tv));
    this.hSJ = ((TextView)findViewById(R.h.debug));
    this.hSK = ((LinearLayout)findViewById(R.h.debug_root));
    this.hSG = ((TextView)findViewById(R.h.wechat_tip));
    this.hSH = ((TextView)findViewById(R.h.other_acc_tip));
    this.hSI = ((TextView)findViewById(R.h.other_tip));
    this.hSD = ((View)findViewById(R.h.other_acc_data_layout));
    setMMTitle(R.l.clean_msg_ui_title);
    setBackBtn(new CleanMsgUI.1(this));
    this.hSy.setOnClickListener(new CleanMsgUI.2(this));
    this.hSx.setEnabled(true);
    this.hSx.setOnClickListener(new CleanMsgUI.3(this));
    getString(R.l.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.clean_del_data), false, new CleanMsgUI.4(this));
    this.eHw.dismiss();
    c(j.aBt().hQC, j.aBt().hQD, j.aBt().hQE);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/fileindexui/CleanMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */