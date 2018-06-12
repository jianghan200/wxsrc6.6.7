package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.n;

public class VoipSmallIconButton
  extends FrameLayout
{
  private TextView ih;
  private ImageView isa;
  private Drawable oQK = null;
  private Drawable oQL = null;
  private View.OnTouchListener oQM = new VoipSmallIconButton.1(this);
  
  public VoipSmallIconButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(R.i.layout_voip_small_icon_button, this);
    paramContext = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, R.n.VoipButton, 0, 0);
    try
    {
      this.oQK = paramContext.getDrawable(R.n.VoipButton_iconRes);
      this.oQL = paramContext.getDrawable(R.n.VoipButton_iconResPressed);
      paramAttributeSet = paramContext.getString(R.n.VoipButton_iconTip);
      int i = paramContext.getResourceId(R.n.VoipButton_iconTip, -1);
      paramContext.recycle();
      this.isa = ((ImageView)findViewById(R.h.small_icon_button));
      this.isa.setImageDrawable(this.oQK);
      this.isa.setOnTouchListener(this.oQM);
      this.isa.setContentDescription(paramAttributeSet);
      this.ih = ((TextView)findViewById(R.h.small_icon_text));
      if (i != -1) {
        this.ih.setText(getContext().getString(i));
      }
      return;
    }
    finally
    {
      paramContext.recycle();
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip/ui/VoipSmallIconButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */