package com.tencent.mm.view.a;

import android.content.Context;
import android.widget.BaseAdapter;

public abstract class a
  extends BaseAdapter
{
  public int hou;
  public int jZk;
  public Context mContext;
  public int uSC;
  public int uSE;
  public com.tencent.mm.view.f.a uSM;
  public int uTG;
  public int uTH;
  public String uTI;
  public int uTJ;
  
  public a(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    this.mContext = paramContext;
    this.uSM = parama;
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this.uSC = paramInt1;
    this.hou = paramInt2;
    this.uTG = paramInt3;
    this.uSE = paramInt4;
    this.uTH = paramInt5;
    this.uTJ = paramInt6;
    this.jZk = paramInt7;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/view/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */