package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;

public class VoicePrintVolumeMeter
  extends View
{
  static int kHx = 20;
  private static float oGE = 1.5F;
  private static float oGF = 2.0F;
  private static float oGG = 0.1F;
  private static float oGH = 0.05F;
  private static int oGv = Color.rgb(240, 250, 235);
  private static int oGw = Color.rgb(210, 240, 200);
  private static int oGx = 100;
  private Paint cN;
  private View kHl;
  private Context mContext;
  boolean mIsPlaying = false;
  private float mVolume = -1.0F;
  private float oGA = 0.0F;
  private float oGB = 0.0F;
  private float oGC = 0.0F;
  private float oGD = 0.0F;
  private boolean oGI = true;
  private int oGr = -1;
  private int oGs = -1;
  ah oGt = null;
  al oGu = null;
  private float oGy = 0.0F;
  private float oGz = 0.0F;
  
  public VoicePrintVolumeMeter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public VoicePrintVolumeMeter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.mContext = paramContext;
    this.cN = new Paint();
    this.oGt = new ah("VoicePrintVolumeMeter");
    this.oGu = new al(this.oGt.lnJ.getLooper(), new VoicePrintVolumeMeter.1(this), true);
  }
  
  final void bJj()
  {
    if ((this.kHl == null) || (this.kHl.getVisibility() == 8)) {
      return;
    }
    int[] arrayOfInt = new int[2];
    this.kHl.getLocationOnScreen(arrayOfInt);
    if ((arrayOfInt[0] == 0) || (arrayOfInt[1] == 0))
    {
      x.d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, cannot get archView location");
      return;
    }
    int i = this.kHl.getWidth();
    int j = this.kHl.getHeight();
    if ((j == 0) || (i == 0))
    {
      x.d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, cannot get archView size");
      return;
    }
    this.oGr = (arrayOfInt[0] + i / 2);
    this.oGs = (arrayOfInt[1] + j / 2 - a.fromDPToPix(this.mContext, 25));
    x.d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, mCenterX:%d, mCenterY:%d", new Object[] { Integer.valueOf(this.oGr), Integer.valueOf(this.oGs) });
    this.oGy = (i / 2.0F);
    this.oGz = (this.oGy * oGE);
    this.oGA = (this.oGy * oGF);
    this.oGB = (this.oGz * oGF);
    this.oGD = this.oGz;
    this.oGC = this.oGy;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.mIsPlaying) {
      return;
    }
    if ((this.oGr == -1) || (this.oGs == -1)) {
      bJj();
    }
    this.cN.setAlpha(oGx);
    if (this.oGD > this.oGB) {
      this.oGD = this.oGB;
    }
    if (this.oGD < this.oGz) {
      this.oGD = this.oGz;
    }
    this.cN.setColor(oGv);
    paramCanvas.drawCircle(this.oGr, this.oGs, this.oGD, this.cN);
    if (this.oGC > this.oGA) {
      this.oGC = this.oGA;
    }
    if (this.oGC < this.oGy) {
      this.oGC = this.oGy;
    }
    this.cN.setColor(oGw);
    paramCanvas.drawCircle(this.oGr, this.oGs, this.oGC, this.cN);
  }
  
  public final void reset()
  {
    this.oGI = false;
    this.mVolume = -1.0F;
    this.mIsPlaying = false;
    this.oGC = 0.0F;
    this.oGD = 0.0F;
    postInvalidate();
  }
  
  public void setArchView(View paramView)
  {
    this.kHl = paramView;
  }
  
  public void setVolume(float paramFloat)
  {
    if (paramFloat > this.mVolume) {}
    for (this.oGI = true;; this.oGI = false)
    {
      this.mVolume = paramFloat;
      return;
    }
  }
  
  public final void stop()
  {
    reset();
    this.mIsPlaying = false;
    this.oGu.SO();
    postInvalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/VoicePrintVolumeMeter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */