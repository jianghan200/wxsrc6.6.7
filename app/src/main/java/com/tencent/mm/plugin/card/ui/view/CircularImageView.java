package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircularImageView
  extends ImageView
{
  private Paint fBa = new Paint();
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Object localObject1 = getDrawable();
    if (localObject1 != null)
    {
      Object localObject2 = ((BitmapDrawable)localObject1).getBitmap();
      localObject1 = Bitmap.createBitmap(((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight(), Bitmap.Config.ARGB_8888);
      Object localObject3 = new Canvas((Bitmap)localObject1);
      Rect localRect = new Rect(0, 0, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight());
      RectF localRectF = new RectF(localRect);
      this.fBa.setAntiAlias(true);
      this.fBa.setDither(true);
      this.fBa.setFlags(1);
      ((Canvas)localObject3).setDrawFilter(new PaintFlagsDrawFilter(0, 3));
      ((Canvas)localObject3).drawARGB(0, 0, 0, 0);
      ((Canvas)localObject3).drawRoundRect(localRectF, 20.0F, 20.0F, this.fBa);
      this.fBa.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      ((Canvas)localObject3).drawBitmap((Bitmap)localObject2, localRect, localRect, this.fBa);
      localObject2 = new Rect(0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
      localObject3 = new Rect(0, 0, getWidth(), getHeight());
      this.fBa.reset();
      paramCanvas.drawBitmap((Bitmap)localObject1, (Rect)localObject2, (Rect)localObject3, this.fBa);
      paramCanvas.save();
      return;
    }
    super.onDraw(paramCanvas);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/CircularImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */