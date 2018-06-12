package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.tencent.mm.plugin.game.f.b;

public class TextViewWithBorder
  extends AppCompatTextView
{
  public TextViewWithBorder(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Paint localPaint = new Paint();
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setColor(getResources().getColor(f.b.game_title_hint));
    paramCanvas.drawRoundRect(new RectF(2.0F, 2.0F, getWidth() - 2, getHeight() - 2), 5.0F, 5.0F, localPaint);
    super.onDraw(paramCanvas);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/widget/TextViewWithBorder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */