package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class LuckyAvatarParticleView
  extends View
{
  public static DisplayMetrics ewi;
  private long duration;
  private Paint fBa = new Paint();
  private ValueAnimator gGc;
  private int kNA;
  private int kNB;
  private int kNt;
  private int kNu;
  private List<Rect> kNv = new ArrayList();
  private List<Integer> kNw = new ArrayList();
  private List<Integer> kNx = new ArrayList();
  private int kNy;
  private int kNz;
  
  public LuckyAvatarParticleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private int getRandomRectWidth()
  {
    return this.kNA + (int)(Math.random() * (this.kNB - this.kNA));
  }
  
  private int getRandomVelocity()
  {
    return this.kNy + (int)(Math.random() * (this.kNz - this.kNy));
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = 0;
    while (i < this.kNv.size())
    {
      paramCanvas.drawRect((Rect)this.kNv.get(i), this.fBa);
      i += 1;
    }
  }
  
  public void setColor(int paramInt)
  {
    this.fBa.setColor(paramInt);
    this.fBa.setStyle(Paint.Style.FILL);
  }
  
  public void setDuration(long paramLong)
  {
    this.duration = paramLong;
    this.gGc = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(this.duration);
    this.gGc.addUpdateListener(new LuckyAvatarParticleView.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyAvatarParticleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */