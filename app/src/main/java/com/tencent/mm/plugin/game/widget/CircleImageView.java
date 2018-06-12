package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.plugin.game.f.k;

public class CircleImageView
  extends ImageView
{
  private static final Bitmap.Config dvc = Bitmap.Config.ARGB_8888;
  private static final ImageView.ScaleType kgL = ImageView.ScaleType.CENTER_CROP;
  private boolean fCi;
  private float fPH;
  private int fPI = -16777216;
  private final Paint fPJ = new Paint();
  private int fg = 0;
  private ColorFilter jN;
  private final RectF kgM = new RectF();
  private final RectF kgN = new RectF();
  private final Paint kgO = new Paint();
  private float kgP;
  private boolean kgQ;
  private boolean kgR;
  private Bitmap mBitmap;
  private BitmapShader rB;
  private final Matrix rC = new Matrix();
  private int rH;
  private int rI;
  
  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, f.k.CircleImageView, paramInt, 0);
    this.fg = paramContext.getDimensionPixelSize(f.k.CircleImageView_border_width, 0);
    this.fPI = paramContext.getColor(f.k.CircleImageView_border_color, -16777216);
    this.kgR = paramContext.getBoolean(f.k.CircleImageView_border_overlay, false);
    paramContext.recycle();
    super.setScaleType(kgL);
    this.fCi = true;
    if (this.kgQ)
    {
      setup();
      this.kgQ = false;
    }
  }
  
  private static Bitmap o(Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      return null;
    }
    if ((paramDrawable instanceof BitmapDrawable)) {
      return ((BitmapDrawable)paramDrawable).getBitmap();
    }
    try
    {
      if ((paramDrawable instanceof ColorDrawable)) {}
      for (Bitmap localBitmap = Bitmap.createBitmap(2, 2, dvc);; localBitmap = Bitmap.createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), dvc))
      {
        Canvas localCanvas = new Canvas(localBitmap);
        paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
        paramDrawable.draw(localCanvas);
        return localBitmap;
      }
      return null;
    }
    catch (OutOfMemoryError paramDrawable) {}
  }
  
  private void setup()
  {
    if (!this.fCi) {
      this.kgQ = true;
    }
    while (this.mBitmap == null) {
      return;
    }
    this.rB = new BitmapShader(this.mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    this.kgO.setAntiAlias(true);
    this.kgO.setShader(this.rB);
    this.fPJ.setStyle(Paint.Style.STROKE);
    this.fPJ.setAntiAlias(true);
    this.fPJ.setColor(this.fPI);
    this.fPJ.setStrokeWidth(this.fg);
    this.rI = this.mBitmap.getHeight();
    this.rH = this.mBitmap.getWidth();
    this.kgN.set(0.0F, 0.0F, getWidth(), getHeight());
    this.fPH = Math.min((this.kgN.height() - this.fg) / 2.0F, (this.kgN.width() - this.fg) / 2.0F);
    this.kgM.set(this.kgN);
    if (!this.kgR) {
      this.kgM.inset(this.fg, this.fg);
    }
    this.kgP = Math.min(this.kgM.height() / 2.0F, this.kgM.width() / 2.0F);
    this.rC.set(null);
    float f3;
    float f2;
    float f1;
    if (this.rH * this.kgM.height() > this.kgM.width() * this.rI)
    {
      f3 = this.kgM.height() / this.rI;
      f2 = (this.kgM.width() - this.rH * f3) * 0.5F;
      f1 = 0.0F;
    }
    for (;;)
    {
      this.rC.setScale(f3, f3);
      this.rC.postTranslate((int)(f2 + 0.5F) + this.kgM.left, (int)(f1 + 0.5F) + this.kgM.top);
      this.rB.setLocalMatrix(this.rC);
      invalidate();
      return;
      f3 = this.kgM.width() / this.rH;
      f1 = (this.kgM.height() - this.rI * f3) * 0.5F;
      f2 = 0.0F;
    }
  }
  
  public int getBorderColor()
  {
    return this.fPI;
  }
  
  public int getBorderWidth()
  {
    return this.fg;
  }
  
  public ImageView.ScaleType getScaleType()
  {
    return kgL;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (getDrawable() == null) {}
    do
    {
      return;
      paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.kgP, this.kgO);
    } while (this.fg == 0);
    paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.fPH, this.fPJ);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    setup();
  }
  
  public void setAdjustViewBounds(boolean paramBoolean)
  {
    if (paramBoolean) {
      throw new IllegalArgumentException("adjustViewBounds not supported.");
    }
  }
  
  public void setBorderColor(int paramInt)
  {
    if (paramInt == this.fPI) {
      return;
    }
    this.fPI = paramInt;
    this.fPJ.setColor(this.fPI);
    invalidate();
  }
  
  public void setBorderColorResource(int paramInt)
  {
    setBorderColor(getContext().getResources().getColor(paramInt));
  }
  
  public void setBorderOverlay(boolean paramBoolean)
  {
    if (paramBoolean == this.kgR) {
      return;
    }
    this.kgR = paramBoolean;
    setup();
  }
  
  public void setBorderWidth(int paramInt)
  {
    if (paramInt == this.fg) {
      return;
    }
    this.fg = paramInt;
    setup();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    if (paramColorFilter == this.jN) {
      return;
    }
    this.jN = paramColorFilter;
    this.kgO.setColorFilter(this.jN);
    invalidate();
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    this.mBitmap = paramBitmap;
    setup();
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    this.mBitmap = o(paramDrawable);
    setup();
  }
  
  public void setImageResource(int paramInt)
  {
    super.setImageResource(paramInt);
    this.mBitmap = o(getDrawable());
    setup();
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    this.mBitmap = o(getDrawable());
    setup();
  }
  
  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    if (paramScaleType != kgL) {
      throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[] { paramScaleType }));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/widget/CircleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */