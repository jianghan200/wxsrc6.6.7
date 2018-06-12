package com.tencent.mm.ui.chatting.viewitems;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.x;

public final class r
  extends RelativeLayout
{
  private LayoutInflater eMa;
  private int ucc;
  
  public r(LayoutInflater paramLayoutInflater, int paramInt)
  {
    super(paramLayoutInflater.getContext());
    this.eMa = paramLayoutInflater;
    this.ucc = paramInt;
    paramLayoutInflater = this.eMa.inflate(R.i.chatting_history_msg_tip_layout, null);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    paramLayoutInflater.setId(R.h.chatting_histroy_msg_tip);
    localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(R.f.NormalPadding), 0, getResources().getDimensionPixelSize(R.f.NormalPadding));
    paramLayoutInflater.setVisibility(8);
    addView(paramLayoutInflater, localLayoutParams);
    paramLayoutInflater = new TextView(getContext(), null, R.m.ChattingUISplit);
    paramLayoutInflater.setId(R.h.chatting_time_tv);
    paramInt = paramLayoutInflater.getResources().getDimensionPixelSize(R.f.SmallestTextSize);
    int i = a.ad(getContext(), R.f.SmallestTextSize);
    if (i != paramInt) {
      x.e("MicroMsg.ChattingItemContainer", "warn!!! cacheSize:%s sysSize:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    }
    paramLayoutInflater.setTextSize(0, paramInt);
    localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.addRule(3, R.h.chatting_histroy_msg_tip);
    localLayoutParams.addRule(14);
    localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(R.f.NormalPadding), 0, getResources().getDimensionPixelSize(R.f.NormalPadding));
    addView(paramLayoutInflater, localLayoutParams);
    paramLayoutInflater = (CheckBox)LayoutInflater.from(getContext()).inflate(R.i.mm_big_checkbox, this, false);
    paramLayoutInflater.setId(R.h.chatting_checkbox);
    paramInt = a.fromDPToPix(getContext(), 32);
    localLayoutParams = new RelativeLayout.LayoutParams(paramInt, paramInt);
    localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(R.f.BasicPaddingSize), getResources().getDimensionPixelSize(R.f.SmallPadding), 0);
    localLayoutParams.addRule(3, R.h.chatting_time_tv);
    localLayoutParams.addRule(11);
    localLayoutParams.width = paramInt;
    localLayoutParams.height = paramInt;
    addView(paramLayoutInflater, localLayoutParams);
    paramLayoutInflater = this.eMa.inflate(this.ucc, null);
    i = paramLayoutInflater.getId();
    paramInt = i;
    if (-1 == i)
    {
      x.v("MicroMsg.ChattingItemContainer", "content view has no id, use defaul id");
      paramInt = R.h.chatting_content_area;
      paramLayoutInflater.setId(R.h.chatting_content_area);
    }
    localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(3, R.h.chatting_time_tv);
    localLayoutParams.addRule(0, R.h.chatting_checkbox);
    addView(paramLayoutInflater, localLayoutParams);
    paramLayoutInflater = new View(getContext());
    paramLayoutInflater.setId(R.h.chatting_maskview);
    paramLayoutInflater.setVisibility(8);
    localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(6, paramInt);
    localLayoutParams.addRule(8, paramInt);
    addView(paramLayoutInflater, localLayoutParams);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */