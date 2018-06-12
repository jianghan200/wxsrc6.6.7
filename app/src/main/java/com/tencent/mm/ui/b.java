package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.w.a.e;
import com.tencent.mm.w.a.g;

public final class b
{
  public TextView eCm;
  private ImageView jfx;
  private View qfa;
  public TextView tfV;
  private ImageView tfW;
  public ImageView tfX;
  private ImageView tfY;
  public ImageView tfZ;
  private View tga;
  
  public b(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null) {
      localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
    }
    for (;;)
    {
      paramView.setLayoutParams(localLayoutParams);
      this.eCm = ((TextView)paramView.findViewById(a.g.title_area));
      this.tfV = ((TextView)paramView.findViewById(a.g.sub_title_area));
      this.tfW = ((ImageView)paramView.findViewById(a.g.mute_icon));
      this.tfX = ((ImageView)paramView.findViewById(a.g.phone_icon));
      this.tfY = ((ImageView)paramView.findViewById(a.g.qmsg_icon));
      this.qfa = paramView.findViewById(a.g.arrow_area);
      this.jfx = ((ImageView)paramView.findViewById(a.g.arrow_area_btn));
      this.tfZ = ((ImageView)paramView.findViewById(a.g.reject_icon));
      this.tga = paramView;
      return;
      localLayoutParams.width = -2;
      localLayoutParams.height = -1;
    }
  }
  
  public final void b(View.OnClickListener paramOnClickListener)
  {
    this.qfa.setOnClickListener(paramOnClickListener);
  }
  
  public final void lq(boolean paramBoolean)
  {
    ImageView localImageView = this.tfW;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localImageView.setVisibility(i);
      return;
    }
  }
  
  public final void lr(boolean paramBoolean)
  {
    ImageView localImageView = this.tfY;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localImageView.setVisibility(i);
      return;
    }
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.eCm.setText(paramCharSequence);
    if (a.fi(this.eCm.getContext())) {
      this.eCm.setTextSize(0, a.ae(this.eCm.getContext(), a.e.ActionBarTextSize) * a.fg(this.eCm.getContext()));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */