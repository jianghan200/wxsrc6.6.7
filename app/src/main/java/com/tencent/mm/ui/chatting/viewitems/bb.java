package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.R.h;

final class bb
  extends b.a
{
  TextView eCn;
  
  public final b.a dN(View paramView)
  {
    super.dx(paramView);
    this.hrs = ((TextView)paramView.findViewById(R.h.chatting_time_tv));
    this.mQc = ((TextView)paramView.findViewById(R.h.chatting_user_tv));
    this.eCn = ((TextView)paramView.findViewById(R.h.chatting_content_itv));
    this.jBR = ((CheckBox)paramView.findViewById(R.h.chatting_checkbox));
    this.gFD = paramView.findViewById(R.h.chatting_maskview);
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */