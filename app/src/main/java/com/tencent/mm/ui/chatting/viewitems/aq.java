package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;

final class aq
  extends b.a
{
  protected TextView eCn;
  protected TextView ufj;
  protected TextView ufk;
  protected Button ufl;
  protected Button ufm;
  protected ImageView ufn;
  
  public final aq dL(View paramView)
  {
    super.dx(paramView);
    this.eCn = ((TextView)paramView.findViewById(R.h.chatting_appmsg_desc_tv));
    this.ufj = ((TextView)paramView.findViewById(R.h.chatting_appmsg_date_tv));
    this.ufk = ((TextView)paramView.findViewById(R.h.chatting_appmsg_time_tv));
    this.ufl = ((Button)paramView.findViewById(R.h.chatting_item_voiceremind_play));
    this.ufm = ((Button)paramView.findViewById(R.h.chatting_item_voiceremind_del));
    this.ufn = ((ImageView)paramView.findViewById(R.h.chatting_timeout_icon));
    this.jBR = ((CheckBox)paramView.findViewById(R.h.chatting_checkbox));
    this.gFD = paramView.findViewById(R.h.chatting_maskview);
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */