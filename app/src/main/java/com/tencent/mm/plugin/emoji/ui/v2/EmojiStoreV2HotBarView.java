package com.tencent.mm.plugin.emoji.ui.v2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bp.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.y;

public class EmojiStoreV2HotBarView
  extends LinearLayout
{
  private View hyK;
  private View ipJ;
  private TextView ipK;
  private View ipL;
  private TextView ipM;
  private View.OnClickListener ipN = new EmojiStoreV2HotBarView.1(this);
  
  public EmojiStoreV2HotBarView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public EmojiStoreV2HotBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  @TargetApi(11)
  public EmojiStoreV2HotBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    this.hyK = ((ViewGroup)y.gq(getContext()).inflate(R.i.emoji_store_v2_hot_bar_view, this)).findViewById(R.h.root);
    this.ipJ = this.hyK.findViewById(R.h.emoji_designer_catalog);
    this.ipK = ((TextView)this.hyK.findViewById(R.h.emoji_more));
    this.ipK.setText(getResources().getText(R.l.emoji_store_new_suggest) + " ");
    this.ipL = this.hyK.findViewById(R.h.designer_product);
    this.ipL.setOnClickListener(new EmojiStoreV2HotBarView.2(this));
    this.ipM = ((TextView)this.hyK.findViewById(R.h.new_tips));
    aGm();
    setMoreOnClickListener(this.ipN);
  }
  
  public final void aGm()
  {
    au.HU();
    boolean bool = ((Boolean)c.DT().get(aa.a.sPa, Boolean.valueOf(false))).booleanValue();
    TextView localTextView;
    if (this.ipM != null)
    {
      localTextView = this.ipM;
      if (!bool) {
        break label48;
      }
    }
    label48:
    for (int i = 0;; i = 8)
    {
      localTextView.setVisibility(i);
      return;
    }
  }
  
  public View getRootView()
  {
    return this.hyK;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2HotBarView", "onAttachedToWindow");
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2HotBarView", "onAttachedToWindow");
  }
  
  public void setDesignerCatalogViewPadding(boolean paramBoolean)
  {
    if ((this.ipJ != null) && (!paramBoolean))
    {
      int i = a.ad(getContext(), R.f.ListPadding);
      int j = a.ad(getContext(), R.f.MiddlePadding);
      int k = a.ad(getContext(), R.f.NormalPadding);
      this.ipJ.setPadding(k, i, k, j);
    }
  }
  
  public void setDesignerEmojiViewVisibility(int paramInt)
  {
    if (this.ipL != null) {
      this.ipL.setVisibility(paramInt);
    }
  }
  
  public void setMoreOnClickListener(View.OnClickListener paramOnClickListener)
  {
    if (this.ipK != null) {
      this.ipK.setOnClickListener(paramOnClickListener);
    }
  }
  
  public void setVisibility(int paramInt)
  {
    if (this.hyK != null)
    {
      this.hyK.setVisibility(paramInt);
      return;
    }
    super.setVisibility(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */