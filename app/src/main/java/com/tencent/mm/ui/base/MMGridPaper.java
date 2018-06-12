package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import junit.framework.Assert;

public final class MMGridPaper
  extends LinearLayout
{
  protected View Iq;
  protected MMDotView gKU;
  protected int hQu = 0;
  protected int mNumColumns = 0;
  protected ag msM = new ag(Looper.getMainLooper());
  protected int tsr = 10;
  protected int tss = 10;
  protected MMFlipper tuF;
  protected j tuG;
  protected int tuH;
  protected int tuI;
  protected int tuJ = 0;
  protected int tuK = 0;
  protected int tuL = 3;
  protected int tuM = 0;
  protected int tuN = this.tuL - 1;
  protected int tuO = 0;
  protected boolean tuP = false;
  protected int tuQ = 9;
  protected int tuR = -1;
  protected int tuS = -1;
  protected int tuT = 96;
  protected int tuU = 96;
  protected boolean tuV = false;
  protected boolean tuW = false;
  protected int tuX = -1;
  protected int tuY = -1;
  protected int tuZ = 0;
  final MMFlipper.b tuk = new MMGridPaper.5(this);
  final MMFlipper.a tul = new MMGridPaper.4(this);
  protected int tva = -1;
  protected int tvb = -1;
  protected boolean tvc = false;
  protected int tvd = 0;
  protected int tve = 0;
  protected a tvf;
  
  public MMGridPaper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    View.inflate(getContext(), a.h.mm_gridpaper, this);
    this.tuZ = getScreenOrientation();
  }
  
  private void cec()
  {
    x.v("MicroMsg.MMGridPaper", "MMGridPaper initFlipper");
    if (this.gKU == null)
    {
      this.gKU = ((MMDotView)findViewById(a.g.gridpaper_dot));
      this.gKU.setMaxCount(this.tuQ);
    }
    if (this.tuF == null)
    {
      this.tuF = ((MMFlipper)findViewById(a.g.gridpaper_flipper));
      this.tuF.setOnMeasureListener(this.tul);
      this.tuF.setOnScreenChangedListener(this.tuk);
    }
    crx();
    cry();
  }
  
  private void crx()
  {
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    int i;
    if ((-1 != this.tuR) && (getScreenOrientation() == 2))
    {
      localView = findViewById(a.g.gridpaper_display_view);
      localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      i = a.fromDPToPix(getContext(), this.tuR);
      if (i != localLayoutParams.height)
      {
        x.i("MicroMsg.MMGridPaper", "set land mode, special height is %d", new Object[] { Integer.valueOf(this.tuR) });
        localLayoutParams.height = i;
        localView.setLayoutParams(localLayoutParams);
      }
    }
    do
    {
      this.msM.post(new MMGridPaper.2(this));
      do
      {
        return;
      } while ((-1 == this.tuS) || (getScreenOrientation() != 1));
      localView = findViewById(a.g.gridpaper_display_view);
      localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      i = a.fromDPToPix(getContext(), this.tuS);
    } while (i == localLayoutParams.height);
    x.i("MicroMsg.MMGridPaper", "set port mode, special height is %d", new Object[] { Integer.valueOf(this.tuS) });
    localLayoutParams.height = i;
    localView.setLayoutParams(localLayoutParams);
    this.msM.post(new MMGridPaper.3(this));
  }
  
  private void cry()
  {
    x.v("MicroMsg.MMGridPaper", "initSubGrid, grid width %d, grid height %d", new Object[] { Integer.valueOf(this.tuH), Integer.valueOf(this.tuI) });
    if ((this.tuH == 0) || (this.tuI == 0))
    {
      x.w("MicroMsg.MMGridPaper", "initSubGrid:gridWithd or gridHeight is 0");
      return;
    }
    int j = a.fromDPToPix(getContext(), this.tuT);
    int i = a.fromDPToPix(getContext(), this.tuU);
    j = Math.max(this.tuH / j, 1);
    i = Math.max(this.tuI / i, 1);
    if ((j != this.mNumColumns) || (i != this.hQu)) {
      this.tuP = true;
    }
    this.mNumColumns = j;
    if (this.tva != -1) {
      this.mNumColumns = Math.min(this.mNumColumns, this.tva);
    }
    this.hQu = i;
    if (this.tvb != -1) {
      this.hQu = Math.min(this.hQu, this.tvb);
    }
    int m = this.mNumColumns * this.hQu;
    this.tuO = 0;
    boolean bool;
    if (this.tuG == null)
    {
      i = 0;
      j = i + 0;
      x.d("MicroMsg.MMGridPaper", "totalCount is %d, dialogMode is %B", new Object[] { Integer.valueOf(j), Boolean.valueOf(this.tuW) });
      if (j < 0) {
        break label314;
      }
      bool = true;
      label243:
      Assert.assertTrue(bool);
      if (this.tuW)
      {
        k = eQ(j, this.mNumColumns);
        i = getScreenOrientation();
      }
      switch (i)
      {
      default: 
        i = 1;
      }
    }
    for (;;)
    {
      if (i != 0) {
        break label524;
      }
      crx();
      return;
      i = this.tuG.getCount();
      break;
      label314:
      bool = false;
      break label243;
      k = Math.min(k, this.tuY);
      n = (this.tuU + 10) * k + 8;
      x.d("MicroMsg.MMGridPaper", "orientation[%d], minRows[%d], targetHeight[%d], displayHeight[%d], orientationChange[%B]", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(this.tuR), Boolean.valueOf(this.tuV) });
      if (this.tuR != n)
      {
        this.tuR = n;
        i = 0;
      }
      else
      {
        i = 1;
        continue;
        k = Math.min(k, this.tuX);
        n = (this.tuU + 10) * k + 8;
        x.d("MicroMsg.MMGridPaper", "orientation[%d], minRows[%d], targetHeight[%d], displayHeight[%d], orientationChange[%B]", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(this.tuS), Boolean.valueOf(this.tuV) });
        if (this.tuS != n)
        {
          this.tuS = n;
          i = 0;
        }
        else
        {
          i = 1;
        }
      }
    }
    label524:
    this.tuO = eQ(j, m);
    int n = this.tuO;
    int k = this.tuJ;
    MMGridPaperGridView localMMGridPaperGridView;
    if ((k == 0) || (m <= 0))
    {
      x.w("MicroMsg.MMGridPaper", "floor:total[%d], length[%d]", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
      i = 0;
      this.tuK = Math.min(n - 1, i);
      this.tuL = Math.min(3, this.tuO);
      this.tuM = Math.min(this.tuO - this.tuL, Math.max(0, this.tuK - (this.tuL >> 1)));
      this.tuN = (this.tuM + this.tuL - 1);
      x.d("MicroMsg.MMGridPaper", "initSubGrid:item[%ddp,%ddp], row[%d], column[%d], activePage[%d], virtualPage[%d], curVirtualPage[%d], edge[%d, %d]", new Object[] { Integer.valueOf(this.tuT), Integer.valueOf(this.tuU), Integer.valueOf(this.hQu), Integer.valueOf(this.mNumColumns), Integer.valueOf(this.tuL), Integer.valueOf(this.tuO), Integer.valueOf(this.tuK), Integer.valueOf(this.tuM), Integer.valueOf(this.tuN) });
      if ((this.tuF.getChildCount() != this.tuL) || (this.tuP))
      {
        x.w("MicroMsg.MMGridPaper", "error child count or RowOrColChanged(%B), reset child view", new Object[] { Boolean.valueOf(this.tuP) });
        this.tuP = false;
        this.tuF.removeAllViews();
        i = this.tuM;
        while (i <= this.tuN)
        {
          localMMGridPaperGridView = (MMGridPaperGridView)inflate(getContext(), a.h.mm_drap_drop_gridview, null);
          localMMGridPaperGridView.a(i, this.hQu, this.mNumColumns, this.tuG);
          localMMGridPaperGridView.setHorizontalSpacing(a.fromDPToPix(getContext(), this.tsr));
          localMMGridPaperGridView.setVerticalSpacing(a.fromDPToPix(getContext(), this.tss));
          this.tuF.addView(localMMGridPaperGridView, new LinearLayout.LayoutParams(-1, -1));
          i += 1;
        }
      }
    }
    for (;;)
    {
      if (j >= m)
      {
        j -= m;
        i += 1;
      }
      else
      {
        x.i("MicroMsg.MMGridPaper", "floor:num[%d], length[%d], result[%d]", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i) });
        break;
        i = this.tuM;
        if (i <= this.tuN)
        {
          localMMGridPaperGridView = (MMGridPaperGridView)this.tuF.getChildAt(i - this.tuM);
          if (localMMGridPaperGridView.getIndex() != i)
          {
            x.w("MicroMsg.MMGridPaper", "old index %d, new index %d, reset it", new Object[] { Integer.valueOf(localMMGridPaperGridView.getIndex()), Integer.valueOf(i) });
            localMMGridPaperGridView.a(i, this.hQu, this.mNumColumns, this.tuG);
            if (localMMGridPaperGridView.tvp != null) {
              localMMGridPaperGridView.tvp.notifyDataSetChanged();
            }
          }
          for (;;)
          {
            i += 1;
            break;
            x.v("MicroMsg.MMGridPaper", "same grid index, continus");
          }
        }
        crz();
        return;
        j = k;
        i = 0;
      }
    }
  }
  
  private void crz()
  {
    x.v("MicroMsg.MMGridPaper", "set DotView");
    boolean bool;
    if (this.tuO >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      this.gKU.setDotCount(this.tuO);
      if ((this.tuG != null) && (this.tuO > 1)) {
        break label129;
      }
      this.gKU.setVisibility(8);
      x.v("MicroMsg.MMGridPaper", "set DotView gone");
    }
    for (;;)
    {
      if (this.tuK >= this.tuO) {
        this.tuK = (this.tuO - 1);
      }
      this.tuF.El(this.tuK - this.tuM);
      this.tuF.Em(this.tuK);
      this.gKU.setSelectedDot(this.tuK);
      return;
      bool = false;
      break;
      label129:
      this.gKU.setVisibility(0);
      x.v("MicroMsg.MMGridPaper", "set DotView visible");
    }
  }
  
  private static int eQ(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0)
    {
      x.w("MicroMsg.MMGridPaper", "ceil:total[%d], length[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      return 0;
    }
    for (;;)
    {
      int j;
      int i;
      if (j > 0)
      {
        j -= paramInt2;
        i += 1;
      }
      else
      {
        x.i("MicroMsg.MMGridPaper", "ceil:num[%d], length[%d], result[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
        return i;
        j = paramInt1;
        i = 0;
      }
    }
  }
  
  private MMGridPaperGridView getCurrentPage()
  {
    return (MMGridPaperGridView)this.tuF.getChildAt(this.tuF.getCurScreen());
  }
  
  private int getScreenOrientation()
  {
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    if (localDisplay.getWidth() < localDisplay.getHeight()) {
      return 1;
    }
    return 2;
  }
  
  public final void crv()
  {
    this.tuY = 3;
    this.tuX = 3;
  }
  
  public final void crw()
  {
    this.tsr = 8;
    this.tss = 15;
  }
  
  public final int getItemsCountPerPage()
  {
    return this.hQu * this.mNumColumns;
  }
  
  public final int getPageCount()
  {
    return this.tuO;
  }
  
  @TargetApi(8)
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      x.d("MicroMsg.MMGridPaper", "onConfigChanged:" + paramConfiguration.orientation);
      this.tuV = true;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    x.d("MicroMsg.MMGridPaper", "onLayout left=%s top=%s right=%s bottom=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if (this.tuZ != getScreenOrientation())
    {
      this.tuZ = getScreenOrientation();
      x.d("MicroMsg.MMGridPaper", "onLayout, currentOrientation changed, reAdjustDisplayArea");
      this.tuV = true;
      clearAnimation();
      crx();
      cry();
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void refresh()
  {
    this.tuJ = (this.tuK * this.mNumColumns * this.hQu);
    x.v("MicroMsg.MMGridPaper", "refreshed:virtualPage[%d], col[%d], row[%d], scrollCount[%d]", new Object[] { Integer.valueOf(this.tuK), Integer.valueOf(this.mNumColumns), Integer.valueOf(this.hQu), Integer.valueOf(this.tuJ) });
    cec();
  }
  
  public final void setDialogMode(boolean paramBoolean)
  {
    this.tuW = paramBoolean;
  }
  
  public final void setDisplayHeightLandInDp(int paramInt)
  {
    this.tuR = paramInt;
  }
  
  public final void setDisplayHeightPortInDp(int paramInt)
  {
    this.tuS = paramInt;
  }
  
  public final void setGridHeight(int paramInt)
  {
    this.tuI = paramInt;
  }
  
  public final void setGridPaperAdapter(j paramj)
  {
    boolean bool = true;
    this.tuG = paramj;
    if (paramj == null) {}
    for (;;)
    {
      x.d("MicroMsg.MMGridPaper", "setGridPaperAdapter:adapter is null[%B]", new Object[] { Boolean.valueOf(bool) });
      if (this.tuG != null) {
        this.tuG.tvj = new j.a()
        {
          public final void avj()
          {
            MMGridPaper.this.refresh();
          }
        };
      }
      cec();
      return;
      bool = false;
    }
  }
  
  public final void setGridWidth(int paramInt)
  {
    this.tuH = paramInt;
  }
  
  public final void setHeaderView(View paramView)
  {
    this.Iq = paramView;
    paramView = (ViewGroup)findViewById(a.g.header_area);
    paramView.removeAllViews();
    if (this.Iq != null) {
      paramView.addView(this.Iq);
    }
  }
  
  public final void setItemHeightInDp(int paramInt)
  {
    this.tuU = paramInt;
  }
  
  public final void setItemWidthInDp(int paramInt)
  {
    this.tuT = paramInt;
  }
  
  public final void setManualMeasureMode(boolean paramBoolean)
  {
    this.tvc = paramBoolean;
  }
  
  public final void setMaxCol(int paramInt)
  {
    this.tva = paramInt;
  }
  
  public final void setMaxDotCount(int paramInt)
  {
    this.tuQ = paramInt;
  }
  
  public final void setMaxRow(int paramInt)
  {
    this.tvb = paramInt;
  }
  
  public final void setOnPageSizeChangeListener(a parama)
  {
    this.tvf = parama;
  }
  
  public static abstract interface a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/MMGridPaper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */