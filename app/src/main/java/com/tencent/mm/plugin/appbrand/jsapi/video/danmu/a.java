package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;

public final class a
  implements d
{
  private static int gbJ;
  private static int gbK;
  private int Jg;
  private int Jq;
  private StaticLayout duh;
  private SpannableString gbL;
  private int gbM;
  private int gbN;
  private int gbO = -1;
  private int gbP;
  private int gbQ;
  private float gbR;
  private Context mContext;
  private int vD = -1;
  
  public a(Context paramContext, SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    this.gbL = paramSpannableString;
    this.gbP = b.y(this.mContext, b.gbS);
    this.vD = paramInt1;
    this.gbR = 3.0F;
    this.gbQ = paramInt2;
    paramContext = new TextPaint();
    paramContext.setAntiAlias(true);
    paramContext.setColor(this.vD);
    paramContext.setTextSize(this.gbP);
    paramSpannableString = paramContext.getFontMetrics();
    this.Jq = ((int)Math.ceil(paramSpannableString.descent - paramSpannableString.top) + 2);
    this.duh = new StaticLayout(this.gbL, paramContext, (int)Layout.getDesiredWidth(this.gbL, 0, this.gbL.length(), paramContext) + 1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    this.Jg = this.duh.getWidth();
  }
  
  public final boolean a(d paramd)
  {
    if (paramd.getWidth() + paramd.getCurrX() > gbJ) {}
    do
    {
      do
      {
        return true;
        if (this.gbO < 0) {
          this.gbO = b.y(this.mContext, 20);
        }
        if (paramd.akc() < this.gbR) {
          break;
        }
      } while ((paramd.akc() == this.gbR) && (gbJ - (paramd.getCurrX() + paramd.getWidth()) < this.gbO));
      return false;
    } while ((paramd.getCurrX() + paramd.getWidth()) / (paramd.akc() * b.akf()) * this.gbR * b.akf() > gbJ - this.gbO * 1.5D);
    return false;
  }
  
  public final float akc()
  {
    return this.gbR;
  }
  
  public final boolean akd()
  {
    return (this.gbM < 0) && (Math.abs(this.gbM) > this.Jg);
  }
  
  public final int ake()
  {
    return this.gbQ;
  }
  
  public final void b(Canvas paramCanvas, boolean paramBoolean)
  {
    int i = paramCanvas.getWidth();
    int j = paramCanvas.getHeight();
    if ((i != gbJ) || (j != gbK))
    {
      gbJ = i;
      gbK = j;
    }
    paramCanvas.save();
    paramCanvas.translate(this.gbM, this.gbN);
    this.duh.draw(paramCanvas);
    paramCanvas.restore();
    if (!paramBoolean) {
      this.gbM = ((int)(this.gbM - b.akf() * this.gbR));
    }
  }
  
  public final void bN(int paramInt1, int paramInt2)
  {
    this.gbM = paramInt1;
    this.gbN = paramInt2;
  }
  
  public final int getCurrX()
  {
    return this.gbM;
  }
  
  public final int getWidth()
  {
    return this.Jg;
  }
  
  public final boolean kX(int paramInt)
  {
    if (paramInt < this.gbQ) {}
    while (paramInt - this.gbQ > b.gbT) {
      return false;
    }
    return true;
  }
  
  public final boolean kY(int paramInt)
  {
    return paramInt - this.gbQ > b.gbT;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/danmu/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */