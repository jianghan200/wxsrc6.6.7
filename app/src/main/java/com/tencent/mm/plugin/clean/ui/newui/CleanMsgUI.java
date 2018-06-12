package com.tencent.mm.plugin.clean.ui.newui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.clean.c.c;
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.plugin.clean.c.g;
import com.tencent.mm.plugin.clean.ui.PieView;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CleanMsgUI
  extends MMActivity
  implements g, com.tencent.mm.plugin.clean.c.h
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
  private View hSu;
  private PieView hSv;
  private TextView hSw;
  private Button hSx;
  private Button hSy;
  private TextView hSz;
  private com.tencent.mm.plugin.clean.c.e hTq;
  private c hTw;
  
  private void d(long paramLong1, long paramLong2, long paramLong3)
  {
    int j = (int)(360L * paramLong3 / paramLong1);
    if (j < 5) {
      j = 5;
    }
    for (;;)
    {
      int i = 0;
      if (paramLong2 > 0L)
      {
        int k = (int)(360L * paramLong2 / paramLong1);
        i = k;
        if (k < 5) {
          i = 5;
        }
      }
      long l = paramLong1 - paramLong3 - paramLong2;
      x.i("MicroMsg.CleanMsgUI", "update [%d %d] [%d %d] [%d %d] wechatSize[%d]", new Object[] { Long.valueOf(paramLong3), Integer.valueOf(j), Long.valueOf(paramLong2), Integer.valueOf(i), Long.valueOf(l), Integer.valueOf((int)(360L * l / paramLong1)), Long.valueOf(paramLong1) });
      this.hSv.setGreenTargetAngle(j);
      this.hSv.setOtherAccTargetAngle(i);
      this.hSv.setStage(1);
      this.hSu.setVisibility(0);
      this.hSz.setText(bi.bF(paramLong3));
      this.hSA.setText(bi.bF(paramLong2));
      this.hSB.setText(bi.bF(l));
      if (paramLong2 > 0L)
      {
        this.hSD.setVisibility(0);
        this.hSy.setVisibility(0);
      }
      for (;;)
      {
        i = (int)(100L * paramLong3 / paramLong1);
        this.hSG.setText(getString(R.l.clean_acc_tips, new Object[] { i + "%" }));
        i = (int)(100L * paramLong2 / paramLong1);
        this.hSH.setText(getString(R.l.clean_other_acc_size_tips, new Object[] { i + "%" }));
        i = (int)(100L * l / paramLong1);
        this.hSI.setText(getString(R.l.clean_other_size_tips, new Object[] { i + "%" }));
        return;
        this.hSy.setVisibility(8);
        this.hSD.setVisibility(8);
      }
    }
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, ArrayList<com.tencent.mm.plugin.clean.c.b> paramArrayList, long paramLong4, HashSet<String> paramHashSet)
  {
    x.i("MicroMsg.CleanMsgUI", "%d on clean result cleanDataSize[%d] wechatSize[%d] otherAccSize[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong4) });
    this.hSw.setVisibility(8);
    this.hSx.setEnabled(true);
    enableOptionMenu(0, true);
    d(paramLong2, paramLong4, paramLong3);
    if (paramLong1 > 0L)
    {
      this.hSE.setVisibility(0);
      this.hSE.setText(getString(R.l.clean_del_temp_data, new Object[] { bi.bF(paramLong1) }));
    }
    for (;;)
    {
      d.ci(paramLong1);
      d.cf(paramLong2);
      d.ch(paramLong4);
      d.b(paramHashSet);
      d.cg(paramLong3);
      d.m(paramArrayList);
      if (paramLong4 <= 0L) {
        break;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(282L, 9L, 1L, false);
      return;
      this.hSE.setVisibility(8);
      this.hSE.setText("");
    }
    com.tencent.mm.plugin.report.service.h.mEJ.a(282L, 10L, 1L, false);
  }
  
  public final void ck(long paramLong)
  {
    this.eHw.dismiss();
    d.cf(d.aBj() - paramLong);
    d.ci(d.aBm() + paramLong);
    d.aBm();
    d(d.aBj(), d.aBl(), d.aBk());
  }
  
  public final void cp(int paramInt1, int paramInt2)
  {
    this.hSw.setText(getString(R.l.analyse_file_profress, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
  }
  
  public final void cq(int paramInt1, int paramInt2)
  {
    this.eHw.setMessage(getString(R.l.clean_progress_tip, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
  }
  
  protected final int getLayoutId()
  {
    return R.i.clean_msg_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    d.aBm();
    d(d.aBj(), d.aBl(), d.aBk());
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.h.mEJ.a(282L, 3L, 1L, false);
    d.aBp();
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
    this.hSG = ((TextView)findViewById(R.h.wechat_tip));
    this.hSH = ((TextView)findViewById(R.h.other_acc_tip));
    this.hSI = ((TextView)findViewById(R.h.other_tip));
    this.hSD = ((View)findViewById(R.h.other_acc_data_layout));
    setMMTitle(R.l.clean_ui_title);
    d.a(new com.tencent.mm.plugin.clean.c.a.b());
    setBackBtn(new CleanMsgUI.1(this));
    this.hSy.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        com.tencent.mm.ui.base.h.a(CleanMsgUI.this, CleanMsgUI.this.getString(R.l.clean_other_acc_tips, new Object[] { bi.gc(d.aBl()) }), "", CleanMsgUI.this.getString(R.l.app_ok), CleanMsgUI.this.getString(R.l.app_cancel), new CleanMsgUI.2.1(this), null);
      }
    });
    this.hSx.setOnClickListener(new CleanMsgUI.3(this));
    addIconOptionMenu(0, R.k.actionbar_icon_dark_more, new CleanMsgUI.4(this));
    enableOptionMenu(0, false);
    getString(R.l.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.clean_del_data), false, new CleanMsgUI.5(this));
    this.eHw.dismiss();
    if (d.aBi() != null)
    {
      this.hSw.setVisibility(8);
      this.hSx.setEnabled(true);
      enableOptionMenu(0, true);
      d.aBm();
      d(d.aBj(), d.aBl(), d.aBk());
    }
    do
    {
      return;
      paramBundle = d.aBg();
    } while (paramBundle == null);
    this.hTw = new c(paramBundle, this);
    com.tencent.mm.sdk.f.e.post(this.hTw, "CleanUI_clean");
    this.hSw.setText(getString(R.l.analyse_file_profress, new Object[] { "0%" }));
  }
  
  protected void onDestroy()
  {
    Object localObject;
    if (this.hTw != null)
    {
      localObject = this.hTw;
      x.i("MicroMsg.CleanController", "stop CleanController [%d]", new Object[] { Integer.valueOf(localObject.hashCode()) });
      ((c)localObject).isStop = true;
      com.tencent.mm.sdk.f.e.S((Runnable)localObject);
    }
    if (this.hTq != null) {
      this.hTq.aBr();
    }
    if (d.aBg() != null)
    {
      localObject = d.aBg();
      Iterator localIterator = ((com.tencent.mm.plugin.clean.c.a.b)localObject).hRt.values().iterator();
      while (localIterator.hasNext()) {
        ((ag)localIterator.next()).removeCallbacksAndMessages(null);
      }
      localIterator = ((com.tencent.mm.plugin.clean.c.a.b)localObject).hRt.values().iterator();
      while (localIterator.hasNext())
      {
        ag localag = (ag)localIterator.next();
        localag.getLooper().getThread().interrupt();
        localag.getLooper().quit();
      }
      x.i("MicroMsg.ThreadController", "finish thread controller [%d]", new Object[] { Integer.valueOf(localObject.hashCode()) });
    }
    d.aBq();
    d.aBo();
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/newui/CleanMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */