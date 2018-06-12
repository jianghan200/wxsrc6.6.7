package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.k;
import android.support.v7.widget.RecyclerView.p;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends RecyclerView.k
{
  RecyclerView Sa;
  RecyclerView.p Sb;
  private int gKM = 0;
  private int gPD;
  RecyclerView.p gPE;
  int gPF;
  private int gPG = 0;
  private boolean gPH = false;
  boolean gPI = false;
  int mOffsetX;
  
  public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    super.c(paramRecyclerView, paramInt1, paramInt2);
    this.mOffsetX += paramInt1;
  }
  
  public final void e(RecyclerView paramRecyclerView, int paramInt)
  {
    super.e(paramRecyclerView, paramInt);
    if ((paramInt == 0) && (this.gPG != 2))
    {
      int i = mr(this.mOffsetX);
      if ((this.Sa != null) && (this.gPI))
      {
        this.Sb.Sv = i;
        this.Sa.getLayoutManager().a(this.Sb);
      }
      this.gPH = true;
    }
    for (;;)
    {
      this.gPG = paramInt;
      return;
      if ((!this.gPH) && (paramInt == 2))
      {
        this.gPH = true;
      }
      else if (paramInt == 0)
      {
        this.gPD = this.mOffsetX;
        this.gPH = false;
        this.gPI = false;
        this.gKM = (((LinearLayoutManager)this.Sa.getLayoutManager()).fi() / this.gPF);
      }
      else if (paramInt == 1)
      {
        x.i("ViewPagerHelper", "SCROLL_STATE_DRAGGING");
        this.gPI = true;
      }
    }
  }
  
  final int mr(int paramInt)
  {
    float f = this.Sa.getWidth();
    if (paramInt - this.gPD >= f / 2.0F) {
      this.gKM = (((LinearLayoutManager)this.Sa.getLayoutManager()).fj() / this.gPF);
    }
    for (;;)
    {
      int j = this.Sa.getAdapter().getItemCount();
      int i = this.Sa.getAdapter().getItemCount() / this.gPF;
      paramInt = i;
      if (j % this.gPF != 0) {
        paramInt = i + 1;
      }
      this.gKM = Math.max(Math.min(this.gKM, paramInt - 1), -1);
      x.i("ViewPagerHelper", "[getOffsetToPosition] mCurPage:%s pos:%s", new Object[] { Integer.valueOf(this.gKM), Integer.valueOf(this.gKM * this.gPF) });
      return this.gKM * this.gPF;
      if (paramInt - this.gPD <= -f / 2.0F) {
        this.gKM = (((LinearLayoutManager)this.Sa.getLayoutManager()).fi() / this.gPF);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/recentview/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */