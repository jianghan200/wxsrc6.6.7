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
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public class ChattingFooterMoreBtnBar
  extends LinearLayout
{
  private LinearLayout.LayoutParams jZp;
  private ImageButton jfl;
  private ImageButton tJo;
  private ImageButton tJp;
  private ImageButton tJq;
  private ImageButton tJr;
  
  public ChattingFooterMoreBtnBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(0);
    setGravity(16);
    setBackgroundResource(R.g.bottombar_bg);
    this.jZp = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.f.SmallListHeight), 1.0F);
    this.jZp.topMargin = a.fromDPToPix(getContext(), 0);
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
    this.jfl = new ImageButton(getContext());
    this.jfl.setImageResource(R.g.chat_more_del_btn);
    this.jfl.setScaleType(ImageView.ScaleType.CENTER);
    this.jfl.setBackgroundResource(0);
    this.jfl.setContentDescription(paramContext.getString(R.l.chatting_more_delete));
    this.tJq = new ImageButton(getContext());
    this.tJq.setImageResource(R.g.chat_more_more_btn);
    this.tJq.setScaleType(ImageView.ScaleType.CENTER);
    this.tJq.setBackgroundResource(0);
    this.tJq.setContentDescription(paramContext.getString(R.l.chatting_more));
    this.tJp = new ImageButton(getContext());
    this.tJp.setImageResource(R.g.chat_more_email_btn);
    this.tJp.setScaleType(ImageView.ScaleType.CENTER);
    this.tJp.setBackgroundResource(0);
    this.tJp.setContentDescription(paramContext.getString(R.l.chatting_more_email));
    ctt();
  }
  
  public final void EO(int paramInt)
  {
    boolean bool;
    if (paramInt > 0)
    {
      bool = true;
      this.tJo.setClickable(bool);
      this.tJo.setEnabled(bool);
      if (j.ctc().size() <= 0) {
        break label87;
      }
      this.tJq.setClickable(bool);
      this.tJq.setEnabled(bool);
    }
    for (;;)
    {
      this.jfl.setClickable(bool);
      this.jfl.setEnabled(bool);
      this.tJr.setClickable(bool);
      this.tJr.setEnabled(bool);
      return;
      bool = false;
      break;
      label87:
      this.tJp.setClickable(bool);
      this.tJp.setEnabled(bool);
    }
  }
  
  public final void c(int paramInt, View.OnClickListener paramOnClickListener)
  {
    switch (paramInt)
    {
    default: 
      x.w("Ashu.ChattingFooterMoreBtnBar", "set button listener error button index %d", new Object[] { Integer.valueOf(paramInt) });
      return;
    case 2: 
      this.tJq.setOnClickListener(paramOnClickListener);
      return;
    case 3: 
      this.jfl.setOnClickListener(paramOnClickListener);
      return;
    case 1: 
      this.tJp.setOnClickListener(paramOnClickListener);
      return;
    case 0: 
      this.tJo.setOnClickListener(paramOnClickListener);
      return;
    }
    this.tJr.setOnClickListener(paramOnClickListener);
  }
  
  public final void ctt()
  {
    removeAllViews();
    addView(this.tJo, this.jZp);
    addView(this.tJr, this.jZp);
    addView(this.jfl, this.jZp);
    if (j.ctc().size() > 0)
    {
      addView(this.tJq, this.jZp);
      return;
    }
    addView(this.tJp, this.jZp);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/ChattingFooterMoreBtnBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */