package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.tencent.mm.storage.ab;

public abstract class ProfileItemView
  extends FrameLayout
{
  public ab ipd;
  
  public ProfileItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ProfileItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    LayoutInflater.from(paramContext).inflate(getLayout(), this);
    init();
  }
  
  public boolean N(ab paramab)
  {
    this.ipd = paramab;
    return bnH();
  }
  
  public abstract boolean bnH();
  
  public abstract int getLayout();
  
  public abstract void init();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/ProfileItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */