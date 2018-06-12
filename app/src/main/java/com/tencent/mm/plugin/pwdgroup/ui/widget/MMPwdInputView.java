package com.tencent.mm.plugin.pwdgroup.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class MMPwdInputView
  extends LinearLayout
{
  public StringBuilder hPZ = new StringBuilder();
  public int iUo;
  private boolean mbh = false;
  private ImageView mbi;
  private ImageView mbj;
  private ImageView mbk;
  private ImageView mbl;
  private a mbm;
  private int mbn = b.mbp;
  
  public MMPwdInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public MMPwdInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramContext = inflate(getContext(), R.i.pwd_input_view, null);
    this.mbi = ((ImageView)paramContext.findViewById(R.h.first));
    this.mbj = ((ImageView)paramContext.findViewById(R.h.second));
    this.mbk = ((ImageView)paramContext.findViewById(R.h.third));
    this.mbl = ((ImageView)paramContext.findViewById(R.h.fourth));
    this.mbi.setImageResource(R.g.around_friends_point);
    this.mbj.setImageResource(R.g.around_friends_point);
    this.mbk.setImageResource(R.g.around_friends_point);
    this.mbl.setImageResource(R.g.around_friends_point);
    addView(paramContext);
  }
  
  private static void m(ImageView paramImageView, String paramString)
  {
    if (paramImageView == null) {
      return;
    }
    if (paramString.equals("0"))
    {
      paramImageView.setImageResource(R.g.around_friends_number0);
      return;
    }
    if (paramString.equals("1"))
    {
      paramImageView.setImageResource(R.g.around_friends_number1);
      return;
    }
    if (paramString.equals("2"))
    {
      paramImageView.setImageResource(R.g.around_friends_number2);
      return;
    }
    if (paramString.equals("3"))
    {
      paramImageView.setImageResource(R.g.around_friends_number3);
      return;
    }
    if (paramString.equals("4"))
    {
      paramImageView.setImageResource(R.g.around_friends_number4);
      return;
    }
    if (paramString.equals("5"))
    {
      paramImageView.setImageResource(R.g.around_friends_number5);
      return;
    }
    if (paramString.equals("6"))
    {
      paramImageView.setImageResource(R.g.around_friends_number6);
      return;
    }
    if (paramString.equals("7"))
    {
      paramImageView.setImageResource(R.g.around_friends_number7);
      return;
    }
    if (paramString.equals("8"))
    {
      paramImageView.setImageResource(R.g.around_friends_number8);
      return;
    }
    if (paramString.equals("9"))
    {
      paramImageView.setImageResource(R.g.around_friends_number9);
      return;
    }
    paramImageView.setImageResource(R.g.around_friends_point);
  }
  
  public final void aPm()
  {
    if (this.iUo > 0) {
      this.hPZ.delete(0, this.iUo);
    }
    bnZ();
    bnY();
  }
  
  public final void bnY()
  {
    int i = 0;
    if (i < 4)
    {
      String str;
      if (this.iUo > i)
      {
        str = this.hPZ.toString().charAt(i);
        label40:
        switch (i)
        {
        }
      }
      for (;;)
      {
        i += 1;
        break;
        str = "";
        break label40;
        m(this.mbi, str);
        continue;
        m(this.mbj, str);
        continue;
        m(this.mbk, str);
        continue;
        m(this.mbl, str);
      }
    }
  }
  
  public final void bnZ()
  {
    if (this.hPZ != null)
    {
      this.iUo = this.hPZ.length();
      if (this.iUo < 4) {
        break label67;
      }
    }
    label67:
    for (this.mbh = true;; this.mbh = false)
    {
      if (this.mbm != null) {
        this.mbm.m(this.mbh, this.hPZ.toString());
      }
      return;
      this.iUo = 0;
      break;
    }
  }
  
  public final void input(String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (this.mbh)) {
      return;
    }
    this.hPZ.append(paramString);
    bnZ();
    bnY();
  }
  
  public void setNumberStyle$7824e0e2(int paramInt)
  {
    this.mbn = paramInt;
  }
  
  public void setNumberWidth(int paramInt)
  {
    if (this.mbi != null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.mbi.getLayoutParams();
      localLayoutParams.width = paramInt;
      this.mbi.setLayoutParams(localLayoutParams);
      this.mbj.setLayoutParams(localLayoutParams);
      this.mbk.setLayoutParams(localLayoutParams);
      this.mbl.setLayoutParams(localLayoutParams);
    }
  }
  
  public void setOnFinishInputListener(a parama)
  {
    this.mbm = parama;
  }
  
  public static abstract interface a
  {
    public abstract void m(boolean paramBoolean, String paramString);
  }
  
  public static enum b {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/pwdgroup/ui/widget/MMPwdInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */