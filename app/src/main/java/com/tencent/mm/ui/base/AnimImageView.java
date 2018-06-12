package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.bp.a;

public class AnimImageView
  extends TextView
{
  private boolean bgH = false;
  private Context context;
  private AlphaAnimation mtq;
  private AnimationDrawable mtr;
  private boolean tsk = false;
  private AnimationDrawable tsl;
  private int type = 1;
  
  public AnimImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    bqM();
  }
  
  public AnimImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    bqM();
  }
  
  private void bqM()
  {
    this.mtq = new AlphaAnimation(0.1F, 1.0F);
    this.mtq.setDuration(1000L);
    this.mtq.setRepeatCount(-1);
    this.mtq.setRepeatMode(2);
    this.mtr = new AnimationDrawable();
    Drawable localDrawable = getResources().getDrawable(R.k.chatfrom_voice_playing_f1);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mtr.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.chatfrom_voice_playing_f2);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mtr.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.chatfrom_voice_playing_f3);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mtr.addFrame(localDrawable, 300);
    this.mtr.setOneShot(false);
    this.mtr.setVisible(true, true);
    this.tsl = new AnimationDrawable();
    localDrawable = getResources().getDrawable(R.k.chatto_voice_playing_f1);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.tsl.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.chatto_voice_playing_f2);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.tsl.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.chatto_voice_playing_f3);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.tsl.addFrame(localDrawable, 300);
    this.tsl.setOneShot(false);
    this.tsl.setVisible(true, true);
  }
  
  public final void bqN()
  {
    if ((this.mtq != null) && (this.mtq.isInitialized())) {
      setAnimation(null);
    }
    if ((this.type == 1) || (this.type == 2))
    {
      this.bgH = false;
      setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      this.mtr.stop();
      this.tsl.stop();
    }
  }
  
  public final void cre()
  {
    switch (this.type)
    {
    default: 
      return;
    case 2: 
      if (this.tsk) {
        setBackgroundResource(R.e.bubble_chat_from_bg_color);
      }
    case 1: 
      while (!this.bgH)
      {
        this.bgH = true;
        if (!this.tsk) {
          break label102;
        }
        setCompoundDrawablesWithIntrinsicBounds(this.mtr, null, null, null);
        this.mtr.stop();
        this.mtr.start();
        return;
        setBackgroundResource(R.e.bubble_chat_to_bg_color);
      }
      label102:
      setCompoundDrawablesWithIntrinsicBounds(null, null, this.tsl, null);
      this.tsl.stop();
      this.tsl.start();
      return;
    }
    if (this.tsk) {
      setBackgroundDrawable(a.f(this.context, R.g.chatfrom_bg));
    }
    for (;;)
    {
      setAnimation(this.mtq);
      this.mtq.startNow();
      return;
      setBackgroundDrawable(a.f(this.context, R.g.chatto_bg));
    }
  }
  
  public int getBaseline()
  {
    try
    {
      int i = super.getBaseline();
      return i;
    }
    catch (Throwable localThrowable) {}
    return -1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      return;
    }
    catch (Throwable paramCanvas) {}
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public boolean onPreDraw()
  {
    try
    {
      boolean bool = super.onPreDraw();
      return bool;
    }
    catch (Throwable localThrowable) {}
    return true;
  }
  
  public void setFromGroup(boolean paramBoolean) {}
  
  public void setFromVoice(boolean paramBoolean)
  {
    this.tsk = paramBoolean;
  }
  
  public void setType(int paramInt)
  {
    this.type = paramInt;
    if (this.tsk)
    {
      if (paramInt == 2)
      {
        setBackgroundResource(R.e.bubble_chat_from_bg_color);
        return;
      }
      setBackgroundDrawable(a.f(this.context, R.g.chatfrom_bg));
      return;
    }
    if (paramInt == 2)
    {
      setBackgroundResource(R.e.bubble_chat_to_bg_color);
      return;
    }
    setBackgroundDrawable(a.f(this.context, R.g.chatto_bg));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/base/AnimImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */