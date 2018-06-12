package com.tencent.mm.pluginsdk.ui.websearch;

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
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout.a;
import com.tencent.mm.pluginsdk.ui.l;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

@TargetApi(16)
public class WebSearchVoiceInputLayoutImpl
  extends VoiceInputLayout
{
  private View.OnLongClickListener aaq = new WebSearchVoiceInputLayoutImpl.1(this);
  private View.OnTouchListener lmH = new WebSearchVoiceInputLayoutImpl.2(this);
  private View qHE;
  private l qHF;
  private boolean qHG = false;
  private long qHH;
  
  public WebSearchVoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public WebSearchVoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void cdK()
  {
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        WebSearchVoiceInputLayoutImpl.b(WebSearchVoiceInputLayoutImpl.this).cdx();
      }
    });
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
    runOnUiThread(new WebSearchVoiceInputLayoutImpl.7(this, paramInt));
  }
  
  public final void R(boolean paramBoolean1, boolean paramBoolean2)
  {
    x.d("MicroMsg.WebSearchVoiceInputLayoutImpl", "directStart currentState = %s longUp = %s clickUp = %s", new Object[] { Integer.valueOf(this.qHc), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
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
        do
        {
          return;
          cdC();
          return;
        } while ((!paramBoolean1) || (paramBoolean2));
        this.qHF.cdu();
        return;
        if (this.qHc != 2) {
          break;
        }
        if (!paramBoolean2)
        {
          bs();
          return;
        }
        this.qHF.cdu();
        Uh();
      } while (this.qHB == null);
      this.qHB.cdE();
      return;
      if ((!paramBoolean1) && (!paramBoolean2))
      {
        Uh();
        return;
      }
    } while ((!paramBoolean1) || (paramBoolean2));
    this.qHF.cdu();
  }
  
  protected final void cN(boolean paramBoolean)
  {
    runOnUiThread(new WebSearchVoiceInputLayoutImpl.5(this));
  }
  
  protected final void cdB()
  {
    runOnUiThread(new WebSearchVoiceInputLayoutImpl.4(this));
  }
  
  protected final void onReset()
  {
    runOnUiThread(new WebSearchVoiceInputLayoutImpl.6(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */