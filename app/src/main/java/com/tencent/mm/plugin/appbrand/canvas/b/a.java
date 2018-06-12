package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import com.tencent.mm.plugin.appbrand.q.j;
import java.io.Serializable;

public final class a
  extends Paint
  implements Serializable
{
  public int fns = a.fnw;
  private float fnt = getAlpha() / 255.0F;
  private String fnu;
  private int fnv;
  private int pN = getColor();
  
  public final void X(float paramFloat)
  {
    this.fnt = paramFloat;
    setColor(this.pN);
  }
  
  public final a adp()
  {
    a locala = new a();
    locala.setColor(getColor());
    locala.setFlags(getFlags());
    locala.setDither(isDither());
    Shader localShader2 = getShader();
    if (localShader2 != null)
    {
      Object localObject = j.a(Shader.class, "copy", localShader2, new Class[0], new Object[0], null);
      Shader localShader1 = localShader2;
      if (localObject != null)
      {
        localShader1 = localShader2;
        if ((localObject instanceof Shader)) {
          localShader1 = (Shader)localObject;
        }
      }
      locala.setShader(localShader1);
    }
    locala.setStrokeJoin(getStrokeJoin());
    locala.setStrokeMiter(getStrokeMiter());
    locala.setStrokeWidth(getStrokeWidth());
    locala.setStrokeCap(getStrokeCap());
    locala.setStyle(getStyle());
    locala.setTextSize(getTextSize());
    locala.setTextAlign(getTextAlign());
    locala.setTypeface(getTypeface());
    locala.fns = this.fns;
    return locala;
  }
  
  protected final Object clone()
  {
    return super.clone();
  }
  
  public final void jN(int paramInt)
  {
    this.fnv = paramInt;
    setTypeface(Typeface.create(this.fnu, paramInt));
  }
  
  public final void reset()
  {
    this.fns = a.fnw;
    super.reset();
  }
  
  public final void rp(String paramString)
  {
    this.fnu = paramString;
    setTypeface(Typeface.create(paramString, this.fnv));
  }
  
  public final void setColor(int paramInt)
  {
    this.pN = paramInt;
    super.setColor(((int)(Color.alpha(paramInt) * this.fnt) & 0xFF) << 24 | 0xFFFFFF & paramInt);
  }
  
  public static enum a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */