package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;

final class ba
  extends b.a
{
  protected TextView eCn;
  protected ImageView ugA;
  
  public final ba dM(View paramView)
  {
    super.dx(paramView);
    this.eCn = ((TextView)paramView.findViewById(R.h.chatting_appmsg_desc_tv));
    this.ugA = ((ImageView)paramView.findViewById(R.h.chatting_appmsg_thumb_iv));
    this.jBR = ((CheckBox)paramView.findViewById(R.h.chatting_checkbox));
    this.gFD = paramView.findViewById(R.h.chatting_maskview);
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */