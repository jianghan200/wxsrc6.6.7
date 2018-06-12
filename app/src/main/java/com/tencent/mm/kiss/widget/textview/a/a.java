package com.tencent.mm.kiss.widget.textview.a;

import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;

public final class a
{
  public Typeface boi = null;
  public Layout.Alignment dtV = Layout.Alignment.ALIGN_NORMAL;
  public TextUtils.TruncateAt dtW = null;
  public TextDirectionHeuristic dtY = null;
  public float dtZ = 0.0F;
  public float dua = 1.0F;
  public boolean dub = false;
  public TextPaint dug = null;
  public int duy = -1;
  public float duz = -1.0F;
  public int fontStyle = -1;
  public int gravity = 51;
  public int linkColor = -1;
  public int maxLength = -1;
  public int maxLines = -1;
  public int minLines = -1;
  public int textColor = -1;
  
  public final int hashCode()
  {
    int j = this.maxLines * 31 + 0 + this.maxLength * 31;
    int i = j;
    if (this.dug != null) {
      i = j + this.dug.hashCode() * 31;
    }
    j = i + this.dtV.hashCode() * 31;
    i = j;
    if (this.dtW != null) {
      i = j + this.dtW.hashCode() * 31;
    }
    j = i + this.gravity * 31 + this.duy * 31;
    i = j;
    if (this.dtY != null) {
      i = j + this.dtY.hashCode() * 31;
    }
    j = (int)((int)(i + this.dtZ * 31.0F) + this.dua * 31.0F);
    if (this.dub) {}
    for (i = 1;; i = 0)
    {
      j = i * 31 + j;
      i = j;
      if (this.boi != null) {
        i = j + this.boi.hashCode() * 31;
      }
      return (int)(i + this.fontStyle * 31 + this.duz * 31.0F) + this.textColor * 31 + this.linkColor * 31;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    localStringBuilder.append(String.format("maxLines: %d ", new Object[] { Integer.valueOf(this.maxLines) }));
    localStringBuilder.append(String.format("maxLength: %d ", new Object[] { Integer.valueOf(this.maxLength) }));
    localStringBuilder.append(String.format("textPaint: %s ", new Object[] { this.dug }));
    localStringBuilder.append(String.format("alignment: %s ", new Object[] { this.dtV }));
    localStringBuilder.append(String.format("ellipsize: %s ", new Object[] { this.dtW }));
    localStringBuilder.append(String.format("gravity: %s ", new Object[] { Integer.valueOf(this.gravity) }));
    localStringBuilder.append(String.format("ellipsizeWidth: %s ", new Object[] { Integer.valueOf(this.duy) }));
    localStringBuilder.append(String.format("textDirection: %s ", new Object[] { this.dtY }));
    localStringBuilder.append(String.format("spacingAdd: %s spacingMult: %s ", new Object[] { Float.valueOf(this.dtZ), Float.valueOf(this.dua) }));
    localStringBuilder.append(String.format("includedPad: %b ", new Object[] { Boolean.valueOf(this.dub) }));
    localStringBuilder.append(String.format("typeface: %s ", new Object[] { this.boi }));
    localStringBuilder.append(String.format("fontStyle: %d ", new Object[] { Integer.valueOf(this.fontStyle) }));
    localStringBuilder.append(String.format("textSize: %s ", new Object[] { Float.valueOf(this.duz) }));
    localStringBuilder.append(String.format("textColor: %d", new Object[] { Integer.valueOf(this.textColor) }));
    localStringBuilder.append(String.format("linkColor: %d", new Object[] { Integer.valueOf(this.linkColor) }));
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */