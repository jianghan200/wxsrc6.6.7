package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.ArrayList;

public class AutoResizeTextView
  extends TextView
{
  private a kgz;
  
  public AutoResizeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    e(paramAttributeSet);
  }
  
  public AutoResizeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    e(paramAttributeSet);
  }
  
  private void e(AttributeSet paramAttributeSet)
  {
    a locala = new a(this);
    if (paramAttributeSet != null)
    {
      int i = (int)locala.kgF;
      float f = locala.kgH;
      locala.j(0, i).ak(f);
    }
    locala.fA(true);
    if (locala.mListeners == null) {
      locala.mListeners = new ArrayList();
    }
    locala.mListeners.add(this);
    this.kgz = locala;
  }
  
  public a getAutofitHelper()
  {
    return this.kgz;
  }
  
  public float getMaxTextSize()
  {
    return this.kgz.kgG;
  }
  
  public float getMinTextSize()
  {
    return this.kgz.kgF;
  }
  
  public float getPrecision()
  {
    return this.kgz.kgH;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.kgz != null) {
      this.kgz.aVD();
    }
  }
  
  public void setLines(int paramInt)
  {
    super.setLines(paramInt);
    if (this.kgz != null) {
      this.kgz.re(paramInt);
    }
  }
  
  public void setMaxLines(int paramInt)
  {
    super.setMaxLines(paramInt);
    if (this.kgz != null) {
      this.kgz.re(paramInt);
    }
  }
  
  public void setMaxTextSize(float paramFloat)
  {
    a locala = this.kgz;
    Context localContext = locala.ih.getContext();
    Resources localResources = Resources.getSystem();
    if (localContext != null) {
      localResources = localContext.getResources();
    }
    paramFloat = TypedValue.applyDimension(2, paramFloat, localResources.getDisplayMetrics());
    if (paramFloat != locala.kgG)
    {
      locala.kgG = paramFloat;
      locala.aVD();
    }
  }
  
  public void setMinTextSize(int paramInt)
  {
    this.kgz.j(2, paramInt);
  }
  
  public void setPrecision(float paramFloat)
  {
    this.kgz.ak(paramFloat);
  }
  
  public void setSizeToFit(boolean paramBoolean)
  {
    this.kgz.fA(paramBoolean);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    super.setTextSize(paramInt, paramFloat);
    if (this.kgz != null)
    {
      a locala = this.kgz;
      if (!locala.kgI)
      {
        Context localContext = locala.ih.getContext();
        Resources localResources = Resources.getSystem();
        if (localContext != null) {
          localResources = localContext.getResources();
        }
        locala.setRawTextSize(TypedValue.applyDimension(paramInt, paramFloat, localResources.getDisplayMetrics()));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/widget/AutoResizeTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */