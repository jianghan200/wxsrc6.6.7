package com.google.android.exoplayer2.f.g;

import android.text.Layout.Alignment;
import java.util.Collections;
import java.util.List;

final class d
{
  String ayS = null;
  int ayT;
  boolean ayU = false;
  boolean ayV = false;
  int ayW = -1;
  int ayX = -1;
  int ayY = -1;
  int ayZ = -1;
  String azA = "";
  List<String> azB = Collections.emptyList();
  String azC = "";
  int aza = -1;
  float azb;
  Layout.Alignment azd = null;
  String azz = "";
  int backgroundColor;
  
  static int a(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    if ((paramString1.isEmpty()) || (paramInt1 == -1)) {
      return paramInt1;
    }
    if (paramString1.equals(paramString2)) {
      return paramInt1 + paramInt2;
    }
    return -1;
  }
  
  public final int getStyle()
  {
    int j = 0;
    if ((this.ayY == -1) && (this.ayZ == -1)) {
      return -1;
    }
    if (this.ayY == 1) {}
    for (int i = 1;; i = 0)
    {
      if (this.ayZ == 1) {
        j = 2;
      }
      return i | j;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/exoplayer2/f/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */