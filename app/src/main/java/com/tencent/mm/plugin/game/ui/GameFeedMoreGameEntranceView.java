package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.d.ac;
import com.tencent.mm.plugin.game.d.cm;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.sdk.platformtools.bi;

public class GameFeedMoreGameEntranceView
  extends RelativeLayout
  implements View.OnClickListener
{
  private TextView ih;
  private e jUA;
  
  public GameFeedMoreGameEntranceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void onClick(View paramView)
  {
    if ((this.jUA == null) || (this.jUA.jLz == null)) {}
    while (bi.oW(this.jUA.jLz.jOU)) {
      return;
    }
    int i = c.an(getContext(), this.jUA.jLz.jOU);
    an.a(getContext(), 10, 1024, this.jUA.position, i, this.jUA.jLz.jQb, GameIndexListView.getSourceScene(), an.Q(this.jUA.jLz.jPA, "clickType", "card"));
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.ih = ((TextView)findViewById(f.e.more_game_text));
    setOnClickListener(this);
  }
  
  public void setData(e parame)
  {
    if ((parame == null) || (parame.jLz == null) || (parame.jLz.jQz == null)) {
      setVisibility(8);
    }
    do
    {
      return;
      this.jUA = parame;
      setVisibility(0);
      this.ih.setText(parame.jLz.jQz.jOS);
    } while (this.jUA.jLB);
    an.a(getContext(), 10, 1024, this.jUA.position, this.jUA.jLz.jQb, GameIndexListView.getSourceScene(), an.Dx(this.jUA.jLz.jPA));
    this.jUA.jLB = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedMoreGameEntranceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */