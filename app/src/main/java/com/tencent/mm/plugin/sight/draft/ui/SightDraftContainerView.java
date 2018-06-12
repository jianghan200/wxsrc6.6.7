package com.tencent.mm.plugin.sight.draft.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.modelvideo.j;

public class SightDraftContainerView
  extends ListView
{
  private boolean neP;
  private a neQ;
  b neR;
  
  public SightDraftContainerView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public SightDraftContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public SightDraftContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    setBackgroundColor(getResources().getColor(R.e.black));
    setSelector(R.e.transparent);
    int i = getResources().getDimensionPixelSize(R.f.SmallPadding);
    int j = getResources().getDimensionPixelSize(R.f.LargePadding);
    TextView localTextView = new TextView(getContext());
    localTextView.setText(R.l.sight_draft_tips);
    localTextView.setTextSize(0, com.tencent.mm.bp.a.ad(getContext(), R.f.HintTextSize));
    localTextView.setGravity(17);
    localTextView.setTextColor(getResources().getColor(R.e.hint_text_color_dark_bg));
    localTextView.setTextSize(1, 11.0F);
    localTextView.setPadding(0, i, 0, j);
    addFooterView(localTextView);
    setOnTouchListener(new SightDraftContainerView.1(this));
  }
  
  public final void bwf()
  {
    if (this.neP)
    {
      this.neR.neB = 12;
      this.neR.a(b.d.neH, false);
      this.neR.a(null, null);
      setSelection(0);
      return;
    }
    this.neP = true;
    this.neR = new b(getContext(), this.neQ);
    this.neR.neB = 12;
    setAdapter(this.neR);
  }
  
  public j getLastDrafInfo()
  {
    b localb = this.neR;
    if (localb.neF == null) {
      return null;
    }
    return localb.neF.neN;
  }
  
  public void setSightDraftCallback(a parama)
  {
    this.neQ = parama;
    if (this.neR != null) {
      this.neR.nez = parama;
    }
  }
  
  public void setTipsResId(int paramInt)
  {
    if (this.neR == null) {
      return;
    }
    this.neR.neA = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sight/draft/ui/SightDraftContainerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */