package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.R.color;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.string;
import com.google.android.gms.b.c.a;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.zzab;

public final class SignInButton
  extends FrameLayout
  implements View.OnClickListener
{
  private View aJN;
  private View.OnClickListener aJO = null;
  private int fi;
  private int pN;
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setStyle(0, 0);
  }
  
  private void setStyle(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < 3))
    {
      bool = true;
      w.a(bool, "Unknown button size %d", new Object[] { Integer.valueOf(paramInt1) });
      if ((paramInt2 < 0) || (paramInt2 >= 2)) {
        break label142;
      }
    }
    Object localObject;
    label142:
    for (boolean bool = true;; bool = false)
    {
      w.a(bool, "Unknown color scheme %s", new Object[] { Integer.valueOf(paramInt2) });
      this.fi = paramInt1;
      this.pN = paramInt2;
      localObject = getContext();
      if (this.aJN != null) {
        removeView(this.aJN);
      }
      try
      {
        this.aJN = b.b((Context)localObject, this.fi, this.pN);
        addView(this.aJN);
        this.aJN.setEnabled(isEnabled());
        this.aJN.setOnClickListener(this);
        return;
      }
      catch (c.a locala)
      {
        paramInt2 = this.fi;
        int i = this.pN;
        localzzab = new zzab((Context)localObject);
        localObject = ((Context)localObject).getResources();
        if ((paramInt2 < 0) || (paramInt2 >= 3)) {
          break label344;
        }
        bool = true;
        w.a(bool, "Unknown button size %d", new Object[] { Integer.valueOf(paramInt2) });
        if ((i < 0) || (i >= 2)) {
          break label350;
        }
        for (bool = true;; bool = false)
        {
          w.a(bool, "Unknown color scheme %s", new Object[] { Integer.valueOf(i) });
          localzzab.setTypeface(Typeface.DEFAULT_BOLD);
          localzzab.setTextSize(14.0F);
          float f = ((Resources)localObject).getDisplayMetrics().density;
          localzzab.setMinHeight((int)(f * 48.0F + 0.5F));
          localzzab.setMinWidth((int)(f * 48.0F + 0.5F));
          switch (paramInt2)
          {
          default: 
            throw new IllegalStateException("Unknown button size: " + paramInt2);
            bool = false;
            break label191;
          }
        }
        for (paramInt1 = zzab.v(i, R.drawable.common_signin_btn_text_dark, R.drawable.common_signin_btn_text_light); paramInt1 == -1; paramInt1 = zzab.v(i, R.drawable.common_signin_btn_icon_dark, R.drawable.common_signin_btn_icon_light)) {
          throw new IllegalStateException("Could not find background resource!");
        }
        localzzab.setBackgroundDrawable(((Resources)localObject).getDrawable(paramInt1));
        localzzab.setTextColor(((Resources)localObject).getColorStateList(zzab.v(i, R.color.common_signin_btn_text_dark, R.color.common_signin_btn_text_light)));
        switch (paramInt2)
        {
        default: 
          throw new IllegalStateException("Unknown button size: " + paramInt2);
        }
      }
      bool = false;
      break;
    }
    zzab localzzab;
    label191:
    label344:
    label350:
    localzzab.setText(((Resources)localObject).getString(R.string.common_signin_button_text));
    for (;;)
    {
      this.aJN = localzzab;
      break;
      localzzab.setText(((Resources)localObject).getString(R.string.common_signin_button_text_long));
      continue;
      localzzab.setText(null);
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((this.aJO != null) && (paramView == this.aJN)) {
      this.aJO.onClick(this);
    }
  }
  
  public final void setColorScheme(int paramInt)
  {
    setStyle(this.fi, paramInt);
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.aJN.setEnabled(paramBoolean);
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.aJO = paramOnClickListener;
    if (this.aJN != null) {
      this.aJN.setOnClickListener(this);
    }
  }
  
  public final void setSize(int paramInt)
  {
    setStyle(paramInt, this.pN);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/common/SignInButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */