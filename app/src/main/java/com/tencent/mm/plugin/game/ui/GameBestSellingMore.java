package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.d.ac;
import com.tencent.mm.plugin.game.d.ar;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.sdk.platformtools.bi;

public class GameBestSellingMore
  extends LinearLayout
  implements View.OnClickListener
{
  private e jUA;
  private TextView jUB;
  private ImageView jUC;
  
  public GameBestSellingMore(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void onClick(View paramView)
  {
    if ((this.jUA == null) || (this.jUA.jLz == null) || (this.jUA.jLz.jQx == null) || (bi.oW(this.jUA.jLz.jQx.jQZ))) {
      return;
    }
    int i = c.an(getContext(), this.jUA.jLz.jQx.jQZ);
    an.a(getContext(), 10, 1022, 999, i, null, GameIndexListView.getSourceScene(), an.Dx(this.jUA.jLz.jPA));
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.jUB = ((TextView)findViewById(f.e.more_game_text));
    this.jUC = ((ImageView)findViewById(f.e.more_game_arrow));
    setOnClickListener(this);
  }
  
  public void setData(e parame)
  {
    this.jUA = parame;
    if ((parame == null) || (parame.jLz == null) || (parame.jLz.jQx == null) || (bi.oW(parame.jLz.jQx.jQG)))
    {
      this.jUB.setVisibility(8);
      this.jUC.setVisibility(8);
      setPadding(0, 0, 0, 0);
      return;
    }
    setPadding(getResources().getDimensionPixelSize(f.c.GameLargePadding), 0, getResources().getDimensionPixelSize(f.c.GameLargePadding), getResources().getDimensionPixelSize(f.c.GameLargePadding));
    this.jUB.setVisibility(0);
    this.jUC.setVisibility(0);
    this.jUB.setText(parame.jLz.jQx.jQG);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameBestSellingMore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */