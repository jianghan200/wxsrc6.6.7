package com.tencent.magicbrush.handler.a;

import android.graphics.Bitmap;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.tencent.magicbrush.a.c.f;
import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;

public final class i
  implements c
{
  private b bnM;
  private g bnW;
  private e bnX;
  private f boe;
  private j bof;
  private a bog;
  private boolean boh = false;
  
  public i(b paramb, a parama)
  {
    this.bnM = paramb;
    this.bog = parama;
  }
  
  private void clear()
  {
    c.f.i("MicroMsg.MBFontManagerImpl", "FontManager clear", new Object[0]);
    Object localObject;
    if (this.bnX != null)
    {
      localObject = this.bnX;
      ((e)localObject).bnJ.setEmpty();
      ((e)localObject).bnI.reset();
      if (((e)localObject).bnH != null) {
        ((e)localObject).bnH.eraseColor(0);
      }
    }
    if (this.bnW != null)
    {
      localObject = this.bnW;
      if (((g)localObject).bnO != null)
      {
        Iterator localIterator = ((g)localObject).bnO.values().iterator();
        while (localIterator.hasNext())
        {
          k localk = (k)localIterator.next();
          ((g)localObject).bnP.bnV.offer(localk);
        }
        ((g)localObject).bnO.clear();
      }
    }
    this.boh = true;
  }
  
  public final boolean checkAndFlushClearSignal()
  {
    boolean bool = this.boh;
    this.boh = false;
    return bool;
  }
  
  public final int[] checkAndFlushDirtySignal()
  {
    e locale;
    if (this.bnX != null)
    {
      locale = this.bnX;
      if (locale.bnJ.isEmpty()) {
        break label30;
      }
    }
    label30:
    for (int i = 1; i == 0; i = 0) {
      return null;
    }
    locale.bnK[0] = locale.bnJ.left;
    locale.bnK[1] = locale.bnJ.top;
    locale.bnK[2] = locale.bnJ.right;
    locale.bnK[3] = locale.bnJ.bottom;
    locale.bnJ.setEmpty();
    return locale.bnK;
  }
  
  public final FloatBuffer drawText(String paramString)
  {
    this.bnW.a(this.bof);
    Object localObject2 = this.bnW.bS(paramString);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      c.f.i("MicroMsg.MBFontManagerImpl", "drawText() load result is null. atlas may be full. first time, clear and retry; text = [%s]; mCurrentState = [%s]", new Object[] { paramString, this.bof });
      clear();
      localObject1 = this.bnW.bS(paramString);
    }
    localObject2 = localObject1;
    if (localObject1 == null)
    {
      c.f.i("MicroMsg.MBFontManagerImpl", "drawText() load result is null. atlas may be full. second time, just returned; text = [%s]; mCurrentState = [%s]", new Object[] { paramString, this.bof });
      localObject2 = null;
    }
    return (FloatBuffer)localObject2;
  }
  
  public final void enableStroke(boolean paramBoolean)
  {
    this.bof.boj = paramBoolean;
  }
  
  public final Bitmap getBitmapAtlas()
  {
    if (this.bnX != null) {
      return this.bnX.bnH;
    }
    return null;
  }
  
  public final float getTextLineHeight(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    do
    {
      do
      {
        return 0.0F;
      } while ((this.boe == null) || (this.bnW == null));
      this.bnW.a(this.bof);
      paramString = this.bnW.bnN;
    } while (paramString.bod == null);
    return paramString.bod.descent - paramString.bod.ascent + 1.0F;
  }
  
  public final void init(int paramInt1, int paramInt2)
  {
    c.f.i("MicroMsg.MBFontManagerImpl", "init() called with: m_atlasWidth = [" + paramInt1 + "], m_atlasHeight = [" + paramInt2 + "]", new Object[0]);
    this.bnX = new e(paramInt1, paramInt2);
    this.boe = new f(this.bnM);
    this.bnW = new g(this.bnX, this.bog);
    this.bof = new j(j.a.bol);
  }
  
  public final String loadFont(String paramString)
  {
    f localf = this.boe;
    if ((paramString == null) || (paramString.length() == 0)) {}
    do
    {
      do
      {
        return null;
      } while (localf.bnM == null);
      paramString = localf.bnM.bR(paramString);
    } while (paramString == null);
    String str = "font" + paramString.hashCode();
    localf.bnL.put(str, paramString);
    return str;
  }
  
  public final float measureText(String paramString)
  {
    this.bnW.a(this.bof);
    float f2 = this.bnW.bU(paramString);
    float f1 = f2;
    if (f2 == -1.0F)
    {
      c.f.i("MicroMsg.MBFontManagerImpl", "measure() load result is null. atlas may be full. first time, clear and retry; text = [%s]; mCurrentState = [%s]", new Object[] { paramString, this.bof });
      clear();
      f1 = this.bnW.bU(paramString);
    }
    f2 = f1;
    if (f1 == -1.0F)
    {
      c.f.i("MicroMsg.MBFontManagerImpl", "measure() load result is null. atlas may be full. second time, just returned; text = [%s]; mCurrentState = [%s]", new Object[] { paramString, this.bof });
      f2 = 0.0F;
    }
    return f2;
  }
  
  public final void release()
  {
    Object localObject;
    if (this.bnX != null)
    {
      localObject = this.bnX;
      if (((e)localObject).bnH != null) {
        ((e)localObject).bnH.recycle();
      }
      this.bnX = null;
    }
    if (this.boe != null)
    {
      localObject = this.boe;
      if (((f)localObject).bnL != null)
      {
        ((f)localObject).bnL.clear();
        ((f)localObject).bnL = null;
      }
      this.boe = null;
    }
    if (this.bnW != null)
    {
      localObject = this.bnW;
      if (((g)localObject).bnN != null) {
        ((g)localObject).bnN = null;
      }
      this.bnW = null;
    }
  }
  
  public final void setStrokeWidth(float paramFloat)
  {
    this.bof.strokeWidth = paramFloat;
  }
  
  public final void useFont(String paramString, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    j.a locala2 = j.a.h(paramBoolean1, paramBoolean2);
    j localj = this.bof;
    Object localObject = this.boe;
    if (locala2 == null) {}
    for (j.a locala1 = j.a.bol;; locala1 = locala2)
    {
      if ((paramString == null) || (paramString.length() == 0)) {
        paramString = Typeface.create(null, locala1.bop);
      }
      for (;;)
      {
        localj.boi = paramString;
        this.bof.azb = paramFloat;
        this.bof.bok = locala2;
        return;
        localObject = (Typeface)((f)localObject).bnL.get(paramString);
        if (localObject != null)
        {
          paramString = (String)localObject;
          if (((Typeface)localObject).getStyle() != locala1.bop) {
            paramString = Typeface.create((Typeface)localObject, locala1.bop);
          }
        }
        else
        {
          paramString = Typeface.create(paramString, locala1.bop);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/magicbrush/handler/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */