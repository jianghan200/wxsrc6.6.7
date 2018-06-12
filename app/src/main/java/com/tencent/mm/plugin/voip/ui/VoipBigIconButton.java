package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.n;

public class VoipBigIconButton
  extends FrameLayout
{
  private TextView ih;
  private ImageView isa;
  private Drawable oQI = null;
  private Drawable oQJ = null;
  private Drawable oQK = null;
  private Drawable oQL = null;
  private View.OnTouchListener oQM = new View.OnTouchListener()
  {
    public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      switch (paramAnonymousMotionEvent.getAction())
      {
      }
      for (;;)
      {
        return false;
        VoipBigIconButton.b(VoipBigIconButton.this).setBackgroundDrawable(VoipBigIconButton.a(VoipBigIconButton.this));
        VoipBigIconButton.b(VoipBigIconButton.this).setImageDrawable(VoipBigIconButton.c(VoipBigIconButton.this));
        VoipBigIconButton.d(VoipBigIconButton.this).setTextColor(-855638017);
        continue;
        VoipBigIconButton.b(VoipBigIconButton.this).setBackgroundDrawable(VoipBigIconButton.e(VoipBigIconButton.this));
        VoipBigIconButton.b(VoipBigIconButton.this).setImageDrawable(VoipBigIconButton.f(VoipBigIconButton.this));
        VoipBigIconButton.d(VoipBigIconButton.this).setTextColor(-1);
      }
    }
  };
  
  public VoipBigIconButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(R.i.layout_voip_big_icon_button, this);
    paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, R.n.VoipButton, 0, 0);
    for (;;)
    {
      try
      {
        this.oQI = paramAttributeSet.getDrawable(R.n.VoipButton_iconBackground);
        this.oQJ = paramAttributeSet.getDrawable(R.n.VoipButton_iconBackgroundPressed);
        this.oQK = paramAttributeSet.getDrawable(R.n.VoipButton_iconRes);
        this.oQL = paramAttributeSet.getDrawable(R.n.VoipButton_iconResPressed);
        int i = paramAttributeSet.getResourceId(R.n.VoipButton_iconTip, -1);
        int j = paramAttributeSet.getResourceId(R.n.VoipButton_iconTip, 0);
        if (j == 0) {
          break label293;
        }
        paramContext = getContext().getString(j);
        paramAttributeSet.recycle();
        if (this.oQJ == null)
        {
          paramAttributeSet = this.oQI;
          this.oQJ = paramAttributeSet;
          if (this.oQL != null) {
            break label285;
          }
          paramAttributeSet = this.oQK;
          this.oQL = paramAttributeSet;
          this.isa = ((ImageView)findViewById(R.h.big_icon_button));
          this.isa.setBackgroundDrawable(this.oQI);
          this.isa.setImageDrawable(this.oQK);
          this.isa.setOnTouchListener(this.oQM);
          this.isa.setContentDescription(paramContext);
          this.ih = ((TextView)findViewById(R.h.big_icon_text));
          if (i != -1) {
            this.ih.setText(getContext().getString(i));
          }
          return;
        }
      }
      finally
      {
        paramAttributeSet.recycle();
      }
      paramAttributeSet = this.oQJ;
      continue;
      label285:
      paramAttributeSet = this.oQL;
      continue;
      label293:
      paramContext = null;
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.isa.setEnabled(paramBoolean);
    this.ih.setEnabled(paramBoolean);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.isa.setOnClickListener(paramOnClickListener);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/ui/VoipBigIconButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */