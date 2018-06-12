package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;

public final class x
{
  private LinearLayout irL;
  private View.OnClickListener mtE = new x.1(this);
  private ChatFooterCustom tLV;
  private FrameLayout tLW;
  
  public x(ChatFooterCustom paramChatFooterCustom)
  {
    this.tLV = paramChatFooterCustom;
  }
  
  public final void crB()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Sport.ChattingSportFooterHandler", "initFooter");
    this.tLV.findViewById(R.h.chatting_footer_switch2input).setVisibility(8);
    this.tLV.findViewById(R.h.chatting_footer_menu_arrow).setVisibility(8);
    this.irL = ((LinearLayout)this.tLV.findViewById(R.h.chatting_footer_menu_container));
    this.irL.setWeightSum(1.0F);
    this.tLW = ((FrameLayout)this.irL.getChildAt(0));
    this.tLW.setVisibility(0);
    this.tLW.setOnClickListener(this.mtE);
    ((TextView)this.tLW.getChildAt(0).findViewById(R.h.chatting_footer_menu_text)).setText(R.l.exdevice_sport_rank_title);
    this.tLW.getChildAt(0).findViewById(R.h.chatting_footer_menu_icon).setVisibility(8);
    this.tLW.getChildAt(1).setVisibility(8);
    int i = 1;
    while (i < 6)
    {
      this.irL.getChildAt(i).setVisibility(8);
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */