package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.x;

public class ToolsBar
  extends LinearLayout
{
  private LinearLayout.LayoutParams jZp;
  private ImageButton tJo;
  private ImageButton tJr;
  private ImageButton tNr;
  
  public ToolsBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(0);
    setGravity(16);
    setBackgroundResource(R.g.bottombar_bg);
    this.jZp = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.f.SmallListHeight), 1.0F);
    this.tJo = new ImageButton(getContext());
    this.tJo.setImageResource(R.g.chat_more_tran_btn);
    this.tJo.setScaleType(ImageView.ScaleType.CENTER);
    this.tJo.setBackgroundResource(0);
    this.tJo.setContentDescription(paramContext.getString(R.l.chatting_more_share));
    this.tJr = new ImageButton(getContext());
    this.tJr.setImageResource(R.g.chat_more_fav_btn);
    this.tJr.setScaleType(ImageView.ScaleType.CENTER);
    this.tJr.setBackgroundResource(0);
    this.tJr.setContentDescription(paramContext.getString(R.l.chatting_more_favorite));
    this.tNr = new ImageButton(getContext());
    this.tNr.setImageResource(R.g.chat_more_remind_btn);
    this.tNr.setScaleType(ImageView.ScaleType.CENTER);
    this.tNr.setBackgroundResource(0);
    this.tNr.setContentDescription(paramContext.getString(R.l.chatting_more_favorite));
    removeAllViews();
    addView(this.tJo, this.jZp);
    addView(this.tJr, this.jZp);
    addView(this.tNr, this.jZp);
  }
  
  public final void c(int paramInt, View.OnClickListener paramOnClickListener)
  {
    switch (paramInt)
    {
    default: 
      x.w("MicroMsg.ToolsBar", "set button listener error button index %d", new Object[] { Integer.valueOf(paramInt) });
      return;
    case 0: 
      this.tJo.setOnClickListener(paramOnClickListener);
      return;
    case 1: 
      this.tJr.setOnClickListener(paramOnClickListener);
      return;
    }
    this.tNr.setOnClickListener(paramOnClickListener);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/ToolsBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */