package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EllipsizingTextView
  extends TextView
{
  private final List<Object> kgS = new ArrayList();
  private boolean kgT;
  private boolean kgU;
  private boolean kgV;
  private String kgW;
  private float kgX = 1.0F;
  private float kgY = 0.0F;
  private int maxLines = -1;
  
  public EllipsizingTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public EllipsizingTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private Layout Ez(String paramString)
  {
    return new StaticLayout(paramString, getPaint(), getWidth() - getPaddingLeft() - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.kgX, this.kgY, false);
  }
  
  public int getMaxLines()
  {
    return this.maxLines;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Object localObject1;
    if (this.kgU)
    {
      super.setEllipsize(null);
      int j = getMaxLines();
      localObject1 = this.kgW;
      if (j == -1) {
        break label304;
      }
      Object localObject2 = Ez((String)localObject1);
      if (((Layout)localObject2).getLineCount() <= j) {
        break label304;
      }
      localObject2 = this.kgW.substring(0, ((Layout)localObject2).getLineEnd(j - 1)).trim();
      if (((String)localObject2).getBytes().length != ((String)localObject2).length()) {}
      for (int i = 1; i == 0; i = 0) {
        for (;;)
        {
          localObject1 = localObject2;
          if (Ez((String)localObject2 + "...").getLineCount() <= j) {
            break;
          }
          i = ((String)localObject2).lastIndexOf(' ');
          localObject1 = localObject2;
          if (i == -1) {
            break;
          }
          localObject2 = ((String)localObject2).substring(0, i);
        }
      }
      localObject1 = localObject2;
      if (((String)localObject2).length() >= 2) {
        localObject1 = ((String)localObject2).substring(0, ((String)localObject2).length() - 1 - 1);
      }
      localObject1 = (String)localObject1 + "...";
    }
    label304:
    for (boolean bool = true;; bool = false)
    {
      if (!((String)localObject1).equals(getText())) {
        this.kgV = true;
      }
      try
      {
        setText((CharSequence)localObject1);
        this.kgV = false;
        this.kgU = false;
        if (bool != this.kgT)
        {
          this.kgT = bool;
          localObject1 = this.kgS.iterator();
          if (((Iterator)localObject1).hasNext()) {
            ((Iterator)localObject1).next();
          }
        }
        return;
      }
      finally
      {
        this.kgV = false;
      }
    }
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    if (!this.kgV)
    {
      this.kgW = paramCharSequence.toString();
      this.kgU = true;
    }
  }
  
  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt) {}
  
  public void setLineSpacing(float paramFloat1, float paramFloat2)
  {
    this.kgY = paramFloat1;
    this.kgX = paramFloat2;
    super.setLineSpacing(paramFloat1, paramFloat2);
  }
  
  public void setMaxLines(int paramInt)
  {
    super.setMaxLines(paramInt);
    this.maxLines = paramInt;
    this.kgU = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/widget/EllipsizingTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */