package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import java.util.Stack;

public final class f
  implements c
{
  public String doU;
  public a fnf;
  public a fng;
  public Stack<a> fnh;
  public Stack<a> fni;
  public Paint fnj = new Paint();
  public Paint fnk;
  public g fnl;
  private c fnm;
  
  public f(c paramc)
  {
    this.fnm = paramc;
    this.fnf = new a();
    this.fng = new a();
    this.fnf.setStyle(Paint.Style.STROKE);
    this.fng.setStyle(Paint.Style.FILL);
    this.fnf.setAntiAlias(true);
    this.fng.setAntiAlias(true);
    this.fnf.setStrokeWidth(com.tencent.mm.plugin.appbrand.q.f.lP(1));
    this.fng.setStrokeWidth(com.tencent.mm.plugin.appbrand.q.f.lP(1));
    this.fnh = new Stack();
    this.fni = new Stack();
    this.fnj.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
  }
  
  public final void invalidate()
  {
    this.fnm.invalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */