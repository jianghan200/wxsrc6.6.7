package com.tencent.mm.pluginsdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.k;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Random;

public final class l
  extends Drawable
{
  private Context context;
  private Paint fBa = new Paint(1);
  private ValueAnimator gGc = ValueAnimator.ofFloat(new float[] { 0.0F, 100.0F });
  private float jOI = 0.0F;
  private Drawable qGE = null;
  private int qGF = 0;
  private int qGG = 0;
  private Interpolator qGH = new LinearInterpolator();
  private Interpolator qGI = new AccelerateDecelerateInterpolator();
  private int qGJ;
  private int qGK;
  private int qGL;
  private int qGM;
  private int qGN;
  private int qGO;
  private int qGP;
  private int qGQ;
  private int qGR;
  private int qGS;
  private int qGT = 0;
  private float qGU = -90.0F;
  private float qGV = 0.0F;
  private float qGW = 0.0F;
  private float qGX = 5.0F;
  private boolean qGY = false;
  private int qGZ;
  private int qHa;
  private int qHb;
  private int qHc = 2;
  private RectF qHd;
  private Random random = new Random(System.currentTimeMillis());
  
  public l(Context paramContext)
  {
    this.gGc.setInterpolator(this.qGH);
    this.gGc.addUpdateListener(new l.1(this));
    this.qHd = new RectF();
    this.context = paramContext;
    this.qGF = a.g(paramContext, R.e.wechat_green);
    this.qGG = a.g(paramContext, R.e.normal_color);
    this.qGE = paramContext.getResources().getDrawable(R.k.voiceinput_icon_button);
    this.qGM = a.ae(paramContext, R.f.voice_input_min_circle_radius);
    this.qGN = a.ae(paramContext, R.f.voice_input_max_circle_radius);
    this.qGO = a.ae(paramContext, R.f.voice_input_breathe_circle_radius);
    this.qGT = a.ae(paramContext, R.f.voice_input_btn_radius);
    this.qGK = a.g(paramContext, R.e.voice_input_btn_outer_color);
    this.qGL = a.ae(paramContext, R.f.voice_input_btn_outer_radius);
    this.qGR = a.ae(paramContext, R.f.voice_input_btn_inner_radius);
    this.qGS = a.g(paramContext, R.e.voice_input_btn_pressed_mask);
    this.qGZ = this.qGR;
    this.qHa = this.qGZ;
    this.qHb = a.ae(paramContext, R.f.voice_input_btn_outer_radius_minpressed);
    this.qGP = a.ae(paramContext, R.f.voice_input_btn_outer_radius_minpressed);
    this.qGQ = a.ae(paramContext, R.f.voice_input_btn_outer_radius_maxpressed);
    this.qGJ = a.ae(paramContext, R.f.voice_input_paint_stroke_width);
  }
  
  private static boolean i(Canvas paramCanvas)
  {
    return (paramCanvas == null) || (paramCanvas.getWidth() == 0) || (paramCanvas.getHeight() == 0);
  }
  
  public final void BU(int paramInt)
  {
    boolean bool = true;
    x.d("MicroMsg.VoiceInputDrawable", "recordingState() called with: maxAmplitudeRate = [%s]", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt < 28) {}
    for (;;)
    {
      this.qGY = bool;
      invalidateSelf();
      return;
      bool = false;
    }
  }
  
  public final void cdt()
  {
    x.d("MicroMsg.VoiceInputDrawable", "longClickState %s", new Object[] { Integer.valueOf(this.qHc) });
    this.qHc = 7;
    this.gGc.cancel();
    this.jOI = 0.0F;
    invalidateSelf();
  }
  
  public final void cdu()
  {
    x.d("MicroMsg.VoiceInputDrawable", "readyState %s", new Object[] { Integer.valueOf(this.qHc) });
    this.qHc = 2;
    this.gGc.cancel();
    this.jOI = 0.0F;
    this.qGU = -90.0F;
    this.qGV = 0.0F;
    this.qGW = 0.0F;
    this.qGX = 5.0F;
    invalidateSelf();
  }
  
  public final void cdv()
  {
    x.d("MicroMsg.VoiceInputDrawable", "readyPressState %s", new Object[] { Integer.valueOf(this.qHc) });
    this.qHc = 6;
    this.gGc.cancel();
    this.jOI = 0.0F;
    invalidateSelf();
  }
  
  public final void cdw()
  {
    x.d("MicroMsg.VoiceInputDrawable", "recognizingState %s", new Object[] { Integer.valueOf(this.qHc) });
    this.qHc = 4;
    this.gGc.cancel();
    this.jOI = 0.0F;
    this.gGc.setInterpolator(new AccelerateDecelerateInterpolator());
    this.gGc.setDuration(1000L);
    this.gGc.setRepeatCount(-1);
    this.gGc.start();
  }
  
  public final void cdx()
  {
    x.d("MicroMsg.VoiceInputDrawable", "disableState %s", new Object[] { Integer.valueOf(this.qHc) });
    this.qHc = 5;
    this.gGc.cancel();
    this.jOI = 0.0F;
    invalidateSelf();
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int i;
    int j;
    if (((this.qHc == 6) || (this.qHc == 7)) && (!i(paramCanvas)))
    {
      i = paramCanvas.getWidth() >> 1;
      j = paramCanvas.getHeight() >> 1;
      this.fBa.setShader(null);
      this.fBa.setStyle(Paint.Style.FILL);
      this.fBa.setColor(this.qGK);
      if (this.qHc != 7) {
        break label445;
      }
      if (this.qGY)
      {
        this.qHb -= 4;
        this.qHb = Math.min(Math.max(this.qGP, this.qHb), this.qGQ);
        paramCanvas.drawCircle(i, j, this.qHb, this.fBa);
      }
    }
    else
    {
      label134:
      if ((this.qGE != null) && (!i(paramCanvas))) {
        break label465;
      }
      if ((this.qHc == 4) && (paramCanvas != null))
      {
        this.fBa.setColor(this.qGF);
        this.fBa.setStrokeWidth(this.qGJ);
        this.fBa.setStyle(Paint.Style.STROKE);
        this.fBa.clearShadowLayer();
        this.fBa.setShader(null);
        this.qHd.left = (paramCanvas.getWidth() / 2 - this.qGR);
        this.qHd.top = (paramCanvas.getHeight() / 2 - this.qGR);
        this.qHd.right = (paramCanvas.getWidth() / 2 + this.qGR);
        this.qHd.bottom = (paramCanvas.getHeight() / 2 + this.qGR);
        paramCanvas.drawArc(this.qHd, this.qGU, this.qGW, false, this.fBa);
        this.qGU += this.qGV;
        this.qGW += this.qGX;
        if (this.qGW < 360.0F) {
          break label560;
        }
        this.qGX = (-this.qGX);
        this.qGV = 5.0F;
      }
    }
    for (;;)
    {
      if (((this.qHc == 6) || (this.qHc == 7)) && (!i(paramCanvas)))
      {
        this.fBa.setStyle(Paint.Style.FILL);
        this.fBa.setColor(this.qGS);
        paramCanvas.drawCircle(paramCanvas.getWidth() >> 1, paramCanvas.getHeight() >> 1, this.qGT, this.fBa);
      }
      return;
      this.qHb += 4;
      break;
      label445:
      paramCanvas.drawCircle(i, j, this.qGP, this.fBa);
      break label134;
      label465:
      if (this.qHc == 5) {
        this.qGE.setColorFilter(this.qGG, PorterDuff.Mode.SRC_ATOP);
      }
      for (;;)
      {
        i = paramCanvas.getWidth() / 2;
        j = paramCanvas.getHeight() / 2;
        this.qGE.setBounds(i - this.qGT, j - this.qGT, i + this.qGT, j + this.qGT);
        this.qGE.draw(paramCanvas);
        break;
        this.qGE.setColorFilter(this.qGF, PorterDuff.Mode.SRC_ATOP);
      }
      label560:
      if (this.qGW <= 0.0F)
      {
        this.qGX = (-this.qGX);
        this.qGV = 0.0F;
        this.qGU = -90.0F;
        this.qGW = 0.0F;
      }
    }
  }
  
  public final int getIntrinsicHeight()
  {
    return this.qGT * 2;
  }
  
  public final int getIntrinsicWidth()
  {
    if (this.context == null) {
      return 0;
    }
    return a.fk(this.context);
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final void kE(boolean paramBoolean)
  {
    x.d("MicroMsg.VoiceInputDrawable", "recordingStartState() called with: maxAmplitudeRate = [%s] fromLongCkick = %s", new Object[] { Integer.valueOf(0), Boolean.valueOf(paramBoolean) });
    if (!paramBoolean) {
      this.qHc = 3;
    }
    this.qGY = true;
    invalidateSelf();
  }
  
  public final void setAlpha(int paramInt) {}
  
  public final void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */