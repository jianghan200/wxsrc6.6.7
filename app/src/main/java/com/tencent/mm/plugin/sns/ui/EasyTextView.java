package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;

public class EasyTextView
  extends View
{
  private static final Paint dvs = new Paint();
  private static int textSize = -1;
  private Context context;
  private String text = "";
  
  static
  {
    dvs.setAntiAlias(true);
    dvs.setFilterBitmap(true);
    dvs.setColor(737373);
  }
  
  public EasyTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    if (textSize == -1)
    {
      textSize = BackwardSupportUtil.b.b(this.context, 12.0F);
      dvs.setTextSize(textSize);
    }
    dvs.setColor(this.context.getResources().getColor(i.c.black));
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getHeight();
    paramCanvas.drawText(this.text, 0.0F, i / 2, dvs);
  }
  
  public void setText(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.text = str;
  }
  
  public void setTextSize(int paramInt)
  {
    dvs.setTextSize(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/EasyTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */