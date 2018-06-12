package com.tencent.neattextview.textview.b;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.tencent.neattextview.textview.layout.c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class b<T extends CharacterStyle>
  implements Serializable
{
  private int Tw;
  private int tK;
  protected LinkedList<RectF> vaa;
  public CharacterStyle vab;
  
  b(int paramInt1, int paramInt2, CharacterStyle paramCharacterStyle)
  {
    this.Tw = paramInt1;
    this.tK = paramInt2;
    this.vab = paramCharacterStyle;
  }
  
  public final boolean W(float paramFloat1, float paramFloat2)
  {
    if (this.vaa == null) {
      return false;
    }
    Iterator localIterator = this.vaa.iterator();
    while (localIterator.hasNext()) {
      if (((RectF)localIterator.next()).contains(paramFloat1, paramFloat2)) {
        return true;
      }
    }
    return false;
  }
  
  public abstract void a(Canvas paramCanvas, TextPaint paramTextPaint, List<c> paramList);
  
  final void ee(List<c> paramList)
  {
    if (this.vaa == null)
    {
      this.vaa = new LinkedList();
      paramList = paramList.iterator();
    }
    for (;;)
    {
      c localc;
      if (paramList.hasNext())
      {
        localc = (c)paramList.next();
        if ((localc.Tw <= this.Tw) && (this.tK < localc.tK)) {
          this.vaa.add(localc.fz(this.Tw, this.tK));
        }
      }
      else
      {
        return;
      }
      if ((localc.Tw <= this.Tw) && (this.Tw < localc.tK) && (localc.tK <= this.tK))
      {
        this.vaa.add(localc.fz(this.Tw, localc.tK));
      }
      else
      {
        if ((this.Tw < localc.Tw) && (this.tK < localc.tK) && (this.tK >= localc.Tw))
        {
          this.vaa.add(localc.fz(localc.Tw, this.tK));
          return;
        }
        if ((this.Tw < localc.Tw) && (this.tK >= localc.tK)) {
          this.vaa.add(localc.fz(localc.Tw, localc.tK));
        }
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      do
      {
        return false;
      } while (!(paramObject instanceof b));
      paramObject = (b)paramObject;
    } while ((((b)paramObject).Tw != this.Tw) || (((b)paramObject).tK != this.tK));
    int i = 0;
    for (;;)
    {
      if (i >= this.vaa.size()) {
        break label88;
      }
      if (!((RectF)this.vaa.get(i)).equals((RectF)((b)paramObject).vaa.get(i))) {
        break;
      }
      i += 1;
    }
    label88:
    return true;
  }
  
  public int hashCode()
  {
    int i = 0;
    int j = 0;
    while (i < this.vaa.size())
    {
      j += ((RectF)this.vaa.get(i)).hashCode();
      i += 1;
    }
    return this.Tw + this.tK + j;
  }
  
  public String toString()
  {
    return "CharacterBgStyle{mRectFList=" + this.vaa + ", mStart=" + this.Tw + ", mEnd=" + this.tK + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/neattextview/textview/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */