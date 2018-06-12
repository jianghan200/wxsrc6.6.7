package com.google.android.exoplayer2.f.e;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.i.a;

final class d
{
  String ayS;
  int ayT;
  boolean ayU;
  boolean ayV;
  int ayW = -1;
  int ayX = -1;
  int ayY = -1;
  int ayZ = -1;
  int aza = -1;
  float azb;
  d azc;
  Layout.Alignment azd;
  int backgroundColor;
  String id;
  
  public final d al(boolean paramBoolean)
  {
    int i = 1;
    boolean bool;
    if (this.azc == null)
    {
      bool = true;
      a.ap(bool);
      if (!paramBoolean) {
        break label31;
      }
    }
    for (;;)
    {
      this.ayW = i;
      return this;
      bool = false;
      break;
      label31:
      i = 0;
    }
  }
  
  public final d am(boolean paramBoolean)
  {
    int i = 1;
    boolean bool;
    if (this.azc == null)
    {
      bool = true;
      a.ap(bool);
      if (!paramBoolean) {
        break label31;
      }
    }
    for (;;)
    {
      this.ayX = i;
      return this;
      bool = false;
      break;
      label31:
      i = 0;
    }
  }
  
  public final d b(d paramd)
  {
    if (paramd != null)
    {
      if ((!this.ayU) && (paramd.ayU)) {
        cQ(paramd.ayT);
      }
      if (this.ayY == -1) {
        this.ayY = paramd.ayY;
      }
      if (this.ayZ == -1) {
        this.ayZ = paramd.ayZ;
      }
      if (this.ayS == null) {
        this.ayS = paramd.ayS;
      }
      if (this.ayW == -1) {
        this.ayW = paramd.ayW;
      }
      if (this.ayX == -1) {
        this.ayX = paramd.ayX;
      }
      if (this.azd == null) {
        this.azd = paramd.azd;
      }
      if (this.aza == -1)
      {
        this.aza = paramd.aza;
        this.azb = paramd.azb;
      }
      if ((!this.ayV) && (paramd.ayV)) {
        cR(paramd.backgroundColor);
      }
    }
    return this;
  }
  
  public final d cQ(int paramInt)
  {
    if (this.azc == null) {}
    for (boolean bool = true;; bool = false)
    {
      a.ap(bool);
      this.ayT = paramInt;
      this.ayU = true;
      return this;
    }
  }
  
  public final d cR(int paramInt)
  {
    this.backgroundColor = paramInt;
    this.ayV = true;
    return this;
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/f/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */