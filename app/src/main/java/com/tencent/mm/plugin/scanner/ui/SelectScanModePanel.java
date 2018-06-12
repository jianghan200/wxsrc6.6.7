package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.base.MMFlipper;
import java.util.List;

public class SelectScanModePanel
  extends LinearLayout
{
  private static int mLV = 85;
  private static int mLW = 85;
  private Context context;
  private final int mLX = 0;
  private int mLY = 0;
  protected List<SelectScanModeGrid> mLZ;
  private int[] mMa = { R.l.scan_entry_qbar, R.l.scan_entry_image, R.l.scan_entry_street, R.l.scan_entry_ocr };
  private int[] mMb = { R.g.scan_qr, R.g.scan_book, R.g.scan_street, R.g.scan_word };
  private int[] mMc = { R.g.scan_qr_hl, R.g.scan_book_hl, R.g.scan_street_hl, R.g.scan_word_hl };
  private int[] mMd = { 1, 2, 5, 3 };
  private AdapterView.OnItemClickListener mMe;
  private int mMf = 0;
  private boolean mMg = false;
  private int mMh;
  private int mMi;
  private MMFlipper mMj;
  private MMDotView mMk;
  private a mMl;
  
  public SelectScanModePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    View.inflate(this.context, R.i.select_scan_mode_panel, this);
    this.mMk = ((MMDotView)findViewById(R.h.select_scan_mode_panel_dot));
    x.v("MicroMsg.scanner.SelectScanModePanel", "AppPanel initFlipper");
    this.mMj = ((MMFlipper)findViewById(R.h.select_scan_mode_panel_flipper));
    paramContext = findViewById(R.h.select_scan_mode_panel_display_view);
    if (this.context.getResources().getConfiguration().orientation == 2)
    {
      paramAttributeSet = (LinearLayout.LayoutParams)paramContext.getLayoutParams();
      paramAttributeSet.height = BackwardSupportUtil.b.b(this.context, mLW);
      paramContext.setLayoutParams(paramAttributeSet);
    }
    for (;;)
    {
      this.mMj.removeAllViews();
      this.mMj.setOnMeasureListener(new SelectScanModePanel.1(this));
      this.mMj.setOnScreenChangedListener(new SelectScanModePanel.2(this));
      return;
      paramAttributeSet = (LinearLayout.LayoutParams)paramContext.getLayoutParams();
      paramAttributeSet.height = BackwardSupportUtil.b.b(this.context, mLV);
      paramContext.setLayoutParams(paramAttributeSet);
    }
  }
  
  public void setOnGridItemClickCallback(a parama)
  {
    this.mMl = parama;
  }
  
  public void setSelectedMode(int paramInt)
  {
    int i = 0;
    while (i < this.mMd.length)
    {
      if (this.mMd[i] == paramInt) {
        this.mLY = i;
      }
      i += 1;
    }
    if (this.mLZ != null)
    {
      i = 0;
      while (i < this.mLZ.size())
      {
        SelectScanModeGrid.a locala = (SelectScanModeGrid.a)((SelectScanModeGrid)this.mLZ.get(i)).getAdapter();
        if (locala != null)
        {
          int j = 0;
          if (j < locala.getCount())
          {
            SelectScanModeGrid.b localb = (SelectScanModeGrid.b)locala.getItem(j);
            if ((localb != null) && (localb.mLU != null))
            {
              if (localb.mLT != paramInt) {
                break label165;
              }
              localb.mLU.setBackgroundResource(localb.mLS);
              if (i > 0)
              {
                this.mMj.setToScreen(i);
                this.mMk.setSelectedDot(i);
              }
            }
            for (;;)
            {
              j += 1;
              break;
              label165:
              localb.mLU.setBackgroundResource(localb.mLR);
            }
          }
        }
        i += 1;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void vB(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/SelectScanModePanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */