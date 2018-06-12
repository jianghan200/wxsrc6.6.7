package com.tencent.mm.t;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.tencent.mm.bd.a.c;
import com.tencent.mm.bp.a;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.view.PhotoEditText;

public final class e
  extends c
{
  private static TextPaint dG;
  private static final float dof = ad.getResources().getDimension(a.c.edit_text_size);
  private static final int dog = (int)ad.getResources().getDimension(a.c.line_padding_text);
  private static final int doh = (int)ad.getResources().getDimension(a.c.padding_text);
  public int doi = -65536;
  public SpannableString doj;
  public int pN = -1;
  
  static
  {
    TextPaint localTextPaint = new TextPaint(1);
    dG = localTextPaint;
    localTextPaint.setStrokeCap(Paint.Cap.ROUND);
    dG.setStyle(Paint.Style.FILL);
    dG.setDither(true);
    dG.setTextSize(dof);
  }
  
  public e(Context paramContext, Matrix paramMatrix, String paramString, Rect paramRect, SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    super(paramContext, paramMatrix, paramString, paramRect);
    this.pN = paramInt1;
    this.doj = paramSpannableString;
    this.doi = paramInt2;
  }
  
  protected final Bitmap CJ()
  {
    dG.setColor(this.pN);
    if (this.doj == null) {
      return null;
    }
    PhotoEditText localPhotoEditText = new PhotoEditText(this.mContext);
    int i = a.ad(this.mContext, a.c.edit_text_padding);
    localPhotoEditText.setPadding(i, 0, i, 0);
    localPhotoEditText.setTextBackground(this.doi);
    localPhotoEditText.setTextColor(this.pN);
    localPhotoEditText.setTextSize(Math.round(dof / this.mContext.getResources().getDisplayMetrics().density));
    localPhotoEditText.setText(j.a(this.mContext, this.doj, dof / 1.3F));
    localPhotoEditText.setSingleLine(false);
    localPhotoEditText.setMaxWidth((int)(this.mContext.getResources().getDisplayMetrics().widthPixels - this.mContext.getResources().getDimension(a.c.edit_text_padding) * 2.0F));
    localPhotoEditText.measure(0, 0);
    Bitmap localBitmap = Bitmap.createBitmap(localPhotoEditText.getMeasuredWidth() - i, localPhotoEditText.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localPhotoEditText.getLayout().getPaint().setColor(this.pN);
    localCanvas.save();
    localCanvas.translate(-0.5F * i, 0.0F);
    localPhotoEditText.draw(localCanvas);
    localCanvas.restore();
    localCanvas.save();
    localCanvas.translate(i * 0.5F, 0.0F);
    localPhotoEditText.getLayout().draw(localCanvas);
    localCanvas.restore();
    return localBitmap;
  }
  
  public final void setSelected(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    if (!paramBoolean) {
      this.dnR = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/t/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */