package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.e.a.a;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.ab;
import com.tencent.mm.plugin.game.model.av;
import com.tencent.mm.plugin.game.model.be;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class GameCenterUI5
  extends GameCenterBaseUI
  implements e
{
  private Dialog iwc;
  private GameRecomBlockView jVA;
  private GameNewClassifyView jVB;
  private GameIndexListView jVC;
  private boolean jVD = true;
  private GameNewTopBannerView jVv;
  private GameIndexSearchView jVw;
  private GameIndexWxagView jVx;
  private GameMessageBubbleView jVy;
  private GameBlockView jVz;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.GameCenterUI5", "errType: %d errCode: %d, scene: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paraml.hashCode()) });
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      switch (paraml.getType())
      {
      }
    }
    do
    {
      return;
      long l = System.currentTimeMillis();
      paramString = ((av)paraml).ivx.dIE.dIL;
      com.tencent.mm.plugin.game.e.c.Em().H(new GameCenterUI5.2(this, paramString, l));
      return;
      if (!com.tencent.mm.plugin.game.b.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
        Toast.makeText(this, getString(f.i.game_list_get_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
    } while (this.iwc == null);
    this.iwc.cancel();
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return f.f.game_center_4_index;
  }
  
  protected final void initView()
  {
    setBackBtn(new GameCenterUI5.1(this));
    setMMTitle(f.i.game_wechat_game);
    this.jVC = ((GameIndexListView)findViewById(f.e.game_fees_list));
    this.jVC.setVisibility(8);
    View localView = getLayoutInflater().inflate(f.f.game_index_header_view, this.jVC, false);
    this.jVC.addHeaderView(localView);
    this.jVv = ((GameNewTopBannerView)localView.findViewById(f.e.game_top_banner_view));
    this.jVw = ((GameIndexSearchView)localView.findViewById(f.e.game_index_search));
    this.jVx = ((GameIndexWxagView)localView.findViewById(f.e.game_index_wxag));
    this.jVy = ((GameMessageBubbleView)localView.findViewById(f.e.game_msg_bubble_view));
    this.jVz = ((GameBlockView)localView.findViewById(f.e.game_block_view));
    this.jVA = ((GameRecomBlockView)localView.findViewById(f.e.game_recom_block_view));
    this.jVB = ((GameNewClassifyView)localView.findViewById(f.e.game_new_classify_view));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!g.Eg().Dx())
    {
      x.e("MicroMsg.GameCenterUI5", "account not ready");
      finish();
      return;
    }
    GameIndexListView.setSourceScene(this.jNv);
    g.DF().a(2994, this);
    initView();
    com.tencent.mm.plugin.game.e.c.Em().H(new Runnable()
    {
      public final void run()
      {
        Object localObject = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSk().Dw("pb_index_4");
        if (localObject == null) {
          com.tencent.mm.sdk.platformtools.ah.A(new GameCenterUI5.3.1(this));
        }
        for (;;)
        {
          ((com.tencent.mm.plugin.game.a.b)g.l(com.tencent.mm.plugin.game.a.b.class)).aSf().init(GameCenterUI5.this);
          com.tencent.mm.plugin.game.e.c.R(f.aTz());
          localObject = new av(w.chP(), f.aTz(), GameCenterUI5.this.jVf, GameCenterUI5.this.jVg, GameCenterUI5.this.jVh, GameCenterUI5.this.jVe);
          g.DF().a((com.tencent.mm.ab.l)localObject, 0);
          f.ds(GameCenterUI5.this.mController.tml);
          f.aTE();
          a.a.aVh().aVf();
          return;
          com.tencent.mm.sdk.platformtools.ah.A(new GameCenterUI5.3.2(this, new com.tencent.mm.plugin.game.model.ah((byte[])localObject)));
        }
      }
    });
    x.i("MicroMsg.GameCenterUI5", "fromScene = %d", new Object[] { Integer.valueOf(this.jNv) });
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.GameCenterUI5", "onDestroy");
    super.onDestroy();
    if (!g.Eg().Dx())
    {
      x.e("MicroMsg.GameCenterUI5", "account not ready");
      return;
    }
    a.a.aVh().clearCache();
    g.DF().b(2994, this);
    ((com.tencent.mm.plugin.game.a.b)g.l(com.tencent.mm.plugin.game.a.b.class)).aSf().clearCache();
    be.aUD();
    be.aUF();
  }
  
  public void onResume()
  {
    super.onResume();
    if (!g.Eg().Dx())
    {
      x.e("MicroMsg.GameCenterUI5", "account not ready");
      return;
    }
    if (!this.jVD)
    {
      ((com.tencent.mm.plugin.game.a.b)g.l(com.tencent.mm.plugin.game.a.b.class)).aSf().init(this);
      Object localObject = this.jVy;
      ((GameMessageBubbleView)localObject).kaM.setOnClickListener(null);
      ((GameMessageBubbleView)localObject).setVisibility(8);
      if (this.jVe) {
        this.jVy.aVb();
      }
      localObject = this.jVz;
      if (((GameBlockView)localObject).jUF != null) {
        ((GameBlockView)localObject).jUF.jUK.refresh();
      }
      localObject = this.jVC;
      LinearLayoutManager localLinearLayoutManager = (LinearLayoutManager)((GameIndexListView)localObject).getLayoutManager();
      int i = localLinearLayoutManager.fi();
      int j = localLinearLayoutManager.fj();
      ((GameIndexListView)localObject).jYO.X(i, j - i + 1);
    }
    this.jVD = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCenterUI5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */