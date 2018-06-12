package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.model.m.b;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.x;

public class GameRankHeadView
  extends LinearLayout
  implements View.OnClickListener
{
  private TextView eGX;
  private com.tencent.mm.plugin.game.model.d jNS;
  private TextView jVX;
  private n jWB;
  m.b jWz;
  private TextView kbu;
  private ImageView kbv;
  
  public GameRankHeadView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void aUU()
  {
    if (g.a(getContext(), this.jNS))
    {
      int i = c.DP(this.jNS.field_packageName);
      if (this.jNS.versionCode > i)
      {
        this.jVX.setText(f.i.game_detail_rank_update);
        return;
      }
      this.jVX.setText(f.i.game_detail_rank_launch);
      return;
    }
    switch (this.jNS.status)
    {
    default: 
      this.jVX.setText(f.i.game_detail_rank_download);
      return;
    }
    if (this.jWB == null)
    {
      this.jVX.setVisibility(8);
      this.kbv.setVisibility(8);
      return;
    }
    this.jVX.setVisibility(0);
    this.kbv.setVisibility(0);
    switch (this.jWB.status)
    {
    default: 
      return;
    case 0: 
      this.jVX.setText(f.i.game_detail_rank_download);
      return;
    case 1: 
      this.jVX.setText(f.i.game_detail_rank_downloading);
      return;
    case 2: 
      this.jVX.setText(f.i.game_detail_rank_continue);
      return;
    }
    this.jVX.setText(f.i.game_detail_rank_install);
  }
  
  public void onClick(View paramView)
  {
    paramView = new d(getContext());
    n localn = new n(this.jNS);
    paramView.a(this.jNS, localn);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.eGX = ((TextView)findViewById(f.e.game_detail_rank_title));
    this.kbu = ((TextView)findViewById(f.e.game_detail_rank_desc));
    this.jVX = ((TextView)findViewById(f.e.game_detail_rank_tag));
    this.kbv = ((ImageView)findViewById(f.e.game_more_icon));
    x.i("MicroMsg.GameRankHeadView", "initView finished");
  }
  
  public void setData(GameDetailRankUI.a parama)
  {
    this.eGX.setText(parama.jWs);
    this.kbu.setText(parama.jWt);
    this.jNS = parama.jWu;
    this.jNS.bYq = 1203;
    this.jNS.position = 2;
    if (this.jWB == null) {
      this.jWB = new n(this.jNS);
    }
    this.jWB.dC(getContext());
    this.jWB.aTT();
    aUU();
    if (this.jWz != null) {
      m.a(this.jWz);
    }
    for (;;)
    {
      this.jVX.setOnClickListener(this);
      return;
      this.jWz = new GameRankHeadView.1(this);
      m.a(this.jWz);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameRankHeadView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */