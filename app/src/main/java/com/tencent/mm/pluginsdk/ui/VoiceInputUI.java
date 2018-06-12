package com.tencent.mm.pluginsdk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.g.a.so;
import com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.mm.plugin.report.kvdata.log_13905;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.n;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;

@com.tencent.mm.ui.base.a(3)
public class VoiceInputUI
  extends MMActivity
{
  private String bIr;
  private String cds;
  private Button ioq;
  private int offset;
  private MMEditText qHM;
  private VoiceInputFooter qHN;
  private String qHO;
  private long qHP = 0L;
  private boolean qHQ = true;
  private boolean qHR = false;
  private View.OnTouchListener qHS = new VoiceInputUI.2(this);
  private MenuItem.OnMenuItemClickListener qHT = new VoiceInputUI.3(this);
  private VoiceInputFooter.a qHU = new VoiceInputUI.4(this);
  private int textChangeCount = 0;
  
  private static void a(VoiceInputBehavior paramVoiceInputBehavior)
  {
    x.i("VoiceInputUI", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", new Object[] { Integer.valueOf(paramVoiceInputBehavior.cancel), Integer.valueOf(paramVoiceInputBehavior.send), Integer.valueOf(paramVoiceInputBehavior.click), Integer.valueOf(paramVoiceInputBehavior.longClick), Long.valueOf(paramVoiceInputBehavior.longClickTime), Integer.valueOf(paramVoiceInputBehavior.textClick), Integer.valueOf(paramVoiceInputBehavior.textChangeCount), Long.valueOf(paramVoiceInputBehavior.textChangeTime), Integer.valueOf(paramVoiceInputBehavior.textChangeReturn), Long.valueOf(paramVoiceInputBehavior.voiceInputTime), Integer.valueOf(paramVoiceInputBehavior.fail), Integer.valueOf(paramVoiceInputBehavior.clear), Integer.valueOf(paramVoiceInputBehavior.smileIconClick), Integer.valueOf(paramVoiceInputBehavior.voiceIconClick), Integer.valueOf(paramVoiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(paramVoiceInputBehavior.fullScreenVoiceLongClickTime) });
    log_13905 locallog_13905 = new log_13905();
    locallog_13905.viOp_ = paramVoiceInputBehavior;
    h.mEJ.c(13905, locallog_13905);
  }
  
  private void kB(int paramInt)
  {
    VoiceInputBehavior localVoiceInputBehavior = new VoiceInputBehavior();
    localVoiceInputBehavior.textChangeCount = this.textChangeCount;
    localVoiceInputBehavior.textChangeReturn = paramInt;
    if (this.qHP != 0L)
    {
      localVoiceInputBehavior.textChangeTime = bi.bI(this.qHP);
      this.qHP = 0L;
    }
    a(localVoiceInputBehavior);
  }
  
  public final void BW(int paramInt)
  {
    x.i("VoiceInputUI", "alvinluo voiceinputui finish type: %d, call stack: %s", new Object[] { Integer.valueOf(paramInt), bi.cjd().toString() });
    so localso;
    if (paramInt == 8)
    {
      kB(7);
      localso = new so();
      if (paramInt != 7) {
        break label133;
      }
      localso.cdq.action = 1;
      label61:
      if (!this.qHR) {
        break label161;
      }
    }
    label133:
    label161:
    for (localso.cdq.cdr = 1;; localso.cdq.cdr = 2)
    {
      localso.cdq.result = this.qHM.getText().toString();
      localso.cdq.cds = this.cds;
      com.tencent.mm.sdk.b.a.sFg.m(localso);
      bi.hideVKB(this.qHM);
      super.finish();
      return;
      kB(paramInt);
      break;
      if (paramInt == 8)
      {
        localso.cdq.action = 4;
        break label61;
      }
      localso.cdq.action = 2;
      break label61;
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.voice_input_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.bIr = paramBundle.getStringExtra("text");
      this.offset = paramBundle.getIntExtra("offset", -1);
      this.qHO = paramBundle.getStringExtra("punctuation");
      this.cds = paramBundle.getStringExtra("userCode");
    }
    this.qHP = bi.VG();
    this.textChangeCount = 0;
    this.qHR = false;
    this.qHQ = true;
    this.qHM = ((MMEditText)findViewById(R.h.voice_input_ui_text_edit));
    this.ioq = ((Button)findViewById(R.h.voice_input_ui_send_btn));
    this.qHM.addTextChangedListener(new VoiceInputUI.5(this));
    this.ioq.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new VoiceInputBehavior();
        paramAnonymousView.send = 3;
        VoiceInputUI.b(paramAnonymousView);
        VoiceInputUI.this.BW(7);
      }
    });
    setMMTitle(getString(R.l.voice_input_ui_eidt_content));
    enableOptionMenu(true);
    setBackBtn(new VoiceInputUI.1(this));
    this.qHM.setOnTouchListener(this.qHS);
    this.qHM.abr(this.bIr);
    if (this.offset != -1) {
      this.qHM.setSelection(this.offset);
    }
    this.qHN = ((VoiceInputFooter)findViewById(R.h.say_footer));
    paramBundle = this.qHN;
    MMEditText localMMEditText = this.qHM;
    String str = this.qHO;
    paramBundle.obg = localMMEditText;
    localMMEditText.setOnClickListener(new VoiceInputFooter.1(paramBundle));
    localMMEditText.setOnEditorActionListener(new VoiceInputFooter.2(paramBundle));
    if (paramBundle.qHf == null)
    {
      paramBundle.qHf = new n(paramBundle.getContext(), true, paramBundle.obg);
      paramBundle.qHf.setCallback(new VoiceInputFooter.6(paramBundle));
      paramBundle.qHf.setPortHeightPX(j.fA(paramBundle.getContext()));
    }
    paramBundle.qHf.ceU();
    paramBundle.qHf.cee();
    paramBundle.qHf.setVisibility(8);
    paramBundle.qHf.setFullScreenData(str);
    paramBundle.lqO.addView(paramBundle.qHf, -1, 0);
    this.qHN.setVoiceInputFooterListener(this.qHU);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.qHN != null)
    {
      VoiceInputFooter localVoiceInputFooter = this.qHN;
      if (localVoiceInputFooter.kXH != null)
      {
        localVoiceInputFooter.kXH.um();
        localVoiceInputFooter.kXH.destroy();
      }
      if (localVoiceInputFooter.qHf != null) {
        localVoiceInputFooter.qHf.destroy();
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0)) {
      BW(2);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.qHM.requestFocus();
  }
  
  public void onSwipeBack()
  {
    BW(3);
    super.onSwipeBack();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/VoiceInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */