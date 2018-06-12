package com.tencent.mm.pluginsdk.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.mm.plugin.report.kvdata.log_13905;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

@TargetApi(16)
public class VoiceInputLayoutImpl
  extends VoiceInputLayout
{
  private View.OnLongClickListener aaq = new VoiceInputLayoutImpl.1(this);
  private View.OnTouchListener lmH = new VoiceInputLayoutImpl.2(this);
  private View qHE;
  private l qHF;
  private boolean qHG = false;
  private long qHH;
  
  public VoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public VoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void af(int paramInt, boolean paramBoolean)
  {
    log_13905 locallog_13905 = new log_13905();
    VoiceInputBehavior localVoiceInputBehavior = new VoiceInputBehavior();
    if (paramBoolean) {
      if (this.qHy)
      {
        localVoiceInputBehavior.fullScreenVoiceLongClick = paramInt;
        if ((paramInt != 4) && (this.qHG) && (this.qHH != 0L)) {
          localVoiceInputBehavior.fullScreenVoiceLongClickTime = bi.bI(this.qHH);
        }
      }
    }
    for (;;)
    {
      locallog_13905.viOp_ = localVoiceInputBehavior;
      h.mEJ.c(13905, locallog_13905);
      x.i("MicroMsg.VoiceInputLayoutImp", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", new Object[] { Integer.valueOf(localVoiceInputBehavior.cancel), Integer.valueOf(localVoiceInputBehavior.send), Integer.valueOf(localVoiceInputBehavior.click), Integer.valueOf(localVoiceInputBehavior.longClick), Long.valueOf(localVoiceInputBehavior.longClickTime), Integer.valueOf(localVoiceInputBehavior.textClick), Integer.valueOf(localVoiceInputBehavior.textChangeCount), Long.valueOf(localVoiceInputBehavior.textChangeTime), Integer.valueOf(localVoiceInputBehavior.textChangeReturn), Long.valueOf(localVoiceInputBehavior.voiceInputTime), Integer.valueOf(localVoiceInputBehavior.fail), Integer.valueOf(localVoiceInputBehavior.clear), Integer.valueOf(localVoiceInputBehavior.smileIconClick), Integer.valueOf(localVoiceInputBehavior.voiceIconClick), Integer.valueOf(localVoiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(localVoiceInputBehavior.fullScreenVoiceLongClickTime) });
      return;
      localVoiceInputBehavior.longClick = paramInt;
      if ((paramInt != 4) && (this.qHG) && (this.qHH != 0L))
      {
        localVoiceInputBehavior.longClickTime = bi.bI(this.qHH);
        continue;
        localVoiceInputBehavior.click = paramInt;
      }
    }
  }
  
  private void cdK()
  {
    runOnUiThread(new VoiceInputLayoutImpl.3(this));
    cdD();
  }
  
  private static boolean cdL()
  {
    int i = au.DF().Lg();
    return (i == 4) || (i == 6);
  }
  
  private void init(Context paramContext)
  {
    this.qHE = inflate(paramContext, R.i.voice_input_layout, this).findViewById(R.h.voice_search_start_btn);
    this.qHE.setLayerType(1, null);
    this.qHF = new l(paramContext);
    this.qHE.setBackground(this.qHF);
    this.qHE.setEnabled(true);
    this.qHE.setOnTouchListener(this.lmH);
    this.qHE.setOnLongClickListener(this.aaq);
    reset(true);
    if (isInEditMode()) {}
    while (cdL()) {
      return;
    }
    cdK();
  }
  
  private static void runOnUiThread(Runnable paramRunnable)
  {
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      ah.A(paramRunnable);
      return;
    }
    paramRunnable.run();
  }
  
  protected final void BV(int paramInt)
  {
    runOnUiThread(new VoiceInputLayoutImpl.7(this, paramInt));
  }
  
  public final void R(boolean paramBoolean1, boolean paramBoolean2)
  {
    x.d("MicroMsg.VoiceInputLayoutImp", "directStart currentState = %s longUp = %s clickUp = %s", new Object[] { Integer.valueOf(this.qHc), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (this.qHc == 1) {
      if ((!paramBoolean1) && (!paramBoolean2)) {
        if (!cdL()) {
          cdK();
        }
      }
    }
    do
    {
      do
      {
        return;
        cdC();
        return;
      } while ((!paramBoolean1) || (paramBoolean2));
      af(4, this.qHG);
      af(this.qHc, this.qHG);
      this.qHF.cdu();
      return;
      if (this.qHc == 2)
      {
        if (!paramBoolean2)
        {
          if (paramBoolean1) {
            af(4, this.qHG);
          }
          af(this.qHc, this.qHG);
          bs();
          return;
        }
        this.qHF.cdu();
        Uh();
        if (this.qHB != null) {
          this.qHB.cdE();
        }
        af(5, this.qHG);
        return;
      }
      if ((!paramBoolean1) && (!paramBoolean2))
      {
        af(this.qHc, this.qHG);
        Uh();
        return;
      }
    } while ((!paramBoolean1) || (paramBoolean2));
    af(4, this.qHG);
    af(this.qHc, this.qHG);
    this.qHF.cdu();
  }
  
  protected final void cN(boolean paramBoolean)
  {
    if (!paramBoolean) {
      af(17, false);
    }
    runOnUiThread(new VoiceInputLayoutImpl.5(this));
  }
  
  protected final void cdB()
  {
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this).kE(this.qHJ);
      }
    });
  }
  
  protected final void onReset()
  {
    runOnUiThread(new VoiceInputLayoutImpl.6(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */