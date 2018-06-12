package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.d.ac;
import com.tencent.mm.plugin.game.d.n;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.e.e;
import com.tencent.mm.plugin.game.e.e.a.a;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.sdk.platformtools.bi;

public class GameFeedSubscriptView
  extends LinearLayout
  implements View.OnClickListener
{
  private ImageView hVP;
  private TextView jYA;
  private TextView jYB;
  private TextView jYC;
  private ac jYs;
  private TextView jYx;
  private TextView jYy;
  private LinearLayout jYz;
  
  public GameFeedSubscriptView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void qX(int paramInt)
  {
    if (paramInt == 1) {}
    for (String str = an.Q(this.jYs.jPA, "clickType", "leftCorner");; str = an.Q(this.jYs.jPA, "clickType", "rightCorner"))
    {
      an.a(getContext(), 10, 1024, this.jYs.jPC, 7, this.jYs.jQb, GameIndexListView.getSourceScene(), str);
      return;
    }
  }
  
  public void onClick(View paramView)
  {
    if (this.jYs == null) {}
    do
    {
      do
      {
        return;
        if ((paramView.getId() != f.e.left_subscript) && (paramView.getId() != f.e.left_subscript_with_box) && (paramView.getId() != f.e.avatar_sub_script)) {
          break;
        }
      } while ((this.jYs.jQB == null) || (bi.oW(this.jYs.jQB.jOU)));
      c.an(getContext(), this.jYs.jQB.jOU);
      qX(1);
      return;
    } while ((paramView.getId() != f.e.right_subscript) || (this.jYs.jQC == null) || (bi.oW(this.jYs.jQC.jOU)));
    c.an(getContext(), this.jYs.jQC.jOU);
    qX(2);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    View localView = LayoutInflater.from(getContext()).inflate(f.f.game_feed_subscript, this, true);
    this.jYx = ((TextView)localView.findViewById(f.e.left_subscript));
    this.jYy = ((TextView)localView.findViewById(f.e.left_subscript_with_box));
    this.jYz = ((LinearLayout)localView.findViewById(f.e.avatar_sub_script));
    this.hVP = ((ImageView)localView.findViewById(f.e.avatar));
    this.jYA = ((TextView)localView.findViewById(f.e.nick_name));
    this.jYB = ((TextView)localView.findViewById(f.e.user_action));
    this.jYC = ((TextView)localView.findViewById(f.e.right_subscript));
    this.jYx.setOnClickListener(this);
    this.jYy.setOnClickListener(this);
    this.jYz.setOnClickListener(this);
    this.jYC.setOnClickListener(this);
  }
  
  public void setData(ac paramac)
  {
    if ((paramac == null) || ((paramac.jQB == null) && (paramac.jQC == null)))
    {
      setVisibility(8);
      return;
    }
    this.jYs = paramac;
    setVisibility(0);
    this.jYx.setVisibility(8);
    this.jYy.setVisibility(8);
    this.jYz.setVisibility(8);
    if (paramac.jQB != null) {
      switch (paramac.jQB.jPN)
      {
      }
    }
    while (paramac.jQC != null)
    {
      this.jYC.setText(paramac.jQC.jOS);
      this.jYC.setVisibility(0);
      return;
      this.jYx.setVisibility(0);
      this.jYx.setText(paramac.jQB.jOS);
      continue;
      this.jYy.setVisibility(0);
      this.jYy.setText(paramac.jQB.jOS);
      continue;
      this.jYz.setVisibility(0);
      if (!bi.oW(paramac.jQB.jPM))
      {
        e.a.a locala = new e.a.a();
        locala.dXW = true;
        e.aVj().a(this.hVP, paramac.jQB.jPM, locala.aVk());
        this.hVP.setVisibility(0);
      }
      this.jYA.setText(paramac.jQB.jPe);
      this.jYB.setText(paramac.jQB.jOS);
    }
    this.jYC.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedSubscriptView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */