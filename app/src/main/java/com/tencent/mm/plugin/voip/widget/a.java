package com.tencent.mm.plugin.voip.widget;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.voip.model.i;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMTextureView;

public final class a
  extends BaseSmallView
{
  private boolean Hg;
  private ag guJ = new ag(Looper.getMainLooper());
  private int oRO;
  private OpenGlRender oVK;
  private OpenGlView oVL;
  private OpenGlRender oVM;
  private OpenGlView oVN;
  private int[] oVO = null;
  private int oVP = 0;
  private float oVQ;
  private Runnable oVR = new a.1(this);
  private Runnable oVS = new a.2(this);
  
  public a(Context paramContext, float paramFloat)
  {
    super(paramContext, null);
    LayoutInflater.from(paramContext).inflate(R.i.voip_widget_video_talking, this);
    this.oVQ = paramFloat;
    this.oVL = ((OpenGlView)findViewById(R.h.ogv_talking));
    this.oVK = new OpenGlRender(this.oVL, OpenGlRender.oUL);
    this.oVL.setRenderer(this.oVK);
    this.oVL.setRenderMode(0);
    this.oVN = ((OpenGlView)findViewById(R.h.ogv_local_video));
    this.oVM = new OpenGlRender(this.oVN, OpenGlRender.oUK);
    this.oVN.setRenderer(this.oVM);
    this.oVN.setRenderMode(0);
    this.oVN.setZOrderMediaOverlay(true);
    this.Hg = false;
    this.oRM = ((MMTextureView)findViewById(R.h.hwViewSmall));
    if (this.oRM != null) {
      x.i("MicroMsg.Voip.TalkingSmallView", "hwViewSmall creat ok!");
    }
    this.ioW.postDelayed(new a.3(this), 3000L);
    this.ioW.postDelayed(this.oVS, 2000L);
    this.ioW.postDelayed(this.oVR, 5000L);
  }
  
  private void bMo()
  {
    if (!this.Hg)
    {
      this.Hg = true;
      this.oVK.oUr = true;
      this.oVM.oUr = true;
    }
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (this.oVN.getVisibility() != 0) {}
    do
    {
      do
      {
        return;
        bMo();
        if (OpenGlRender.oUV != 1) {
          break;
        }
        if (this.oVP < paramInt1 * paramInt2) {
          this.oVO = null;
        }
        if (this.oVO == null)
        {
          this.oVP = (paramInt1 * paramInt2);
          this.oVO = new int[this.oVP];
        }
      } while ((i.bJI().a(paramArrayOfByte, (int)paramLong, paramInt3 & 0x1F, paramInt1, paramInt2, this.oVO, false) < 0) || (this.oVO == null));
      this.oVM.b(this.oVO, paramInt1, paramInt2, OpenGlRender.oUC + paramInt4 + paramInt5);
      return;
    } while (OpenGlRender.oUV != 2);
    this.oVM.e(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.oUG + paramInt4 + paramInt5);
  }
  
  public final void bKB()
  {
    if (this.Hg)
    {
      this.oVM.bMi();
      this.oVK.bMi();
    }
  }
  
  protected final void bLM()
  {
    this.oVN.setVisibility(0);
    this.ioW.removeCallbacks(this.oVR);
    this.ioW.postDelayed(this.oVR, 3000L);
  }
  
  protected final void bLN()
  {
    this.oVK.bMh();
    this.oVM.bMh();
  }
  
  public final void c(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    bMo();
    if (OpenGlRender.oUV == 1)
    {
      this.oVK.b(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.oUB + OpenGlRender.oUH);
      return;
    }
    this.oVK.b(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.oUE + OpenGlRender.oUH);
  }
  
  public final void dV(int paramInt1, int paramInt2)
  {
    Object localObject = (RelativeLayout.LayoutParams)this.oVN.getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject).height = (paramInt2 / 4);
    ((RelativeLayout.LayoutParams)localObject).width = ((int)(this.oVQ * ((RelativeLayout.LayoutParams)localObject).height));
    this.oVN.setLayoutParams((ViewGroup.LayoutParams)localObject);
    WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)getLayoutParams();
    localObject = localLayoutParams;
    if (localLayoutParams == null) {
      localObject = new WindowManager.LayoutParams();
    }
    ((WindowManager.LayoutParams)localObject).width = paramInt1;
    ((WindowManager.LayoutParams)localObject).height = paramInt2;
    setLayoutParams((ViewGroup.LayoutParams)localObject);
  }
  
  protected final void onAnimationEnd()
  {
    this.oVK.oUr = true;
    this.oVM.oUr = true;
  }
  
  public final void setCaptureView(CaptureView paramCaptureView)
  {
    x.k("MicroMsg.Voip.BaseSmallView", "addCaptureView", new Object[0]);
    if (this.oLP != null)
    {
      removeView(this.oLP);
      this.oLP = null;
    }
    if (paramCaptureView != null)
    {
      this.oLP = paramCaptureView;
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(1, 1);
      localLayoutParams.leftMargin = 20;
      localLayoutParams.topMargin = 20;
      addView(paramCaptureView, localLayoutParams);
      paramCaptureView.setVisibility(0);
      x.d("MicroMsg.Voip.BaseSmallView", "CaptureView added");
    }
  }
  
  public final void setHWDecMode(int paramInt)
  {
    int i;
    if (this.guJ != null)
    {
      if ((paramInt & 0x1) == 0) {
        break label49;
      }
      i = 1;
      if (i != 0) {
        break label54;
      }
      x.i("MicroMsg.Voip.TalkingSmallView", "setHWDecMode, not hwdec");
      this.guJ.post(new a.4(this));
    }
    for (;;)
    {
      this.oRO = paramInt;
      return;
      label49:
      i = 0;
      break;
      label54:
      x.i("MicroMsg.Voip.TalkingSmallView", "setHWDecMode, is hwdec");
      this.guJ.post(new a.5(this));
    }
  }
  
  public final void uninit()
  {
    super.uninit();
    setVisibility(4);
    if (this.Hg)
    {
      this.oVK.bMh();
      this.oVM.bMh();
    }
    this.ioW.removeCallbacks(this.oVR);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/voip/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */