package com.tencent.mm.plugin.game.ui.tab;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.d.ak;
import com.tencent.mm.plugin.game.d.bf;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.GameTabData;
import com.tencent.mm.plugin.game.model.GameTabData.TabItem;
import com.tencent.mm.plugin.game.model.ab;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.aq;
import com.tencent.mm.plugin.game.ui.GameCenterActivity;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.a;
import java.io.IOException;
import java.util.List;

@a(19)
public class GameRouteUI
  extends GameCenterActivity
{
  private int jNv;
  
  private static bf aVd()
  {
    byte[] arrayOfByte = ((c)g.l(c.class)).aSk().Dw("game_index4_tab_nav");
    if (bi.bC(arrayOfByte)) {
      return null;
    }
    try
    {
      bf localbf = new bf();
      try
      {
        localbf.aG(arrayOfByte);
        return localbf;
      }
      catch (IOException localIOException2)
      {
        return localbf;
      }
      return null;
    }
    catch (IOException localIOException1) {}
  }
  
  private void e(List<ak> paramList, boolean paramBoolean)
  {
    if ((isFinishing()) || (isDestroyed())) {
      return;
    }
    GameTabData localGameTabData = GameTabData.bn(paramList);
    if ((localGameTabData == null) || (bi.cX(localGameTabData.aUC())))
    {
      x.e("MicroMsg.GameRouteUI", "game tab data is null");
      exit();
      return;
    }
    Object localObject2 = localGameTabData.aUC();
    int i = 0;
    paramList = null;
    Object localObject1;
    if (i < ((List)localObject2).size())
    {
      localObject1 = (GameTabData.TabItem)((List)localObject2).get(i);
      if (localObject1 == null) {
        break label228;
      }
      if (!((GameTabData.TabItem)localObject1).jOm) {
        break label225;
      }
      paramList = (List<ak>)localObject1;
      label100:
      an.a(this, 18, ((GameTabData.TabItem)localObject1).bYq, ((GameTabData.TabItem)localObject1).jOu, null, this.jNv, an.Dx(((GameTabData.TabItem)localObject1).jLt));
    }
    label225:
    label228:
    for (;;)
    {
      i += 1;
      break;
      localObject1 = paramList;
      if (paramList == null) {
        localObject1 = (GameTabData.TabItem)((List)localObject2).get(0);
      }
      if (localObject1 == null)
      {
        x.e("MicroMsg.GameRouteUI", "game tab entry item is null");
        exit();
        return;
      }
      localObject2 = getIntent().getExtras();
      paramList = (List<ak>)localObject2;
      if (localObject2 == null) {
        paramList = new Bundle();
      }
      paramList.putParcelable("tab_data", localGameTabData);
      getIntent().putExtras(paramList);
      GameTabWidget.a(this, (GameTabData.TabItem)localObject1, paramBoolean, true, true);
      return;
      break label100;
    }
  }
  
  private void exit()
  {
    if ((!isFinishing()) && (!isDestroyed()))
    {
      finish();
      overridePendingTransition(MMFragmentActivity.a.tnE, MMFragmentActivity.a.tnF);
    }
  }
  
  protected final boolean aUL()
  {
    return false;
  }
  
  public final int aUM()
  {
    return 0;
  }
  
  public final int aUN()
  {
    return 0;
  }
  
  public final int aUO()
  {
    return 0;
  }
  
  protected final int getLayoutId()
  {
    return f.f.game_route_layout;
  }
  
  protected final void initView()
  {
    setBackBtn(new GameRouteUI.2(this));
    setMMTitle(f.i.game_wechat_game);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = false;
    super.onCreate(paramBundle);
    initView();
    this.jNv = getIntent().getIntExtra("game_report_from_scene", 0);
    paramBundle = aVd();
    if ((paramBundle != null) && (!bi.cX(paramBundle.jQF)))
    {
      x.i("MicroMsg.GameRouteUI", "use cache data");
      aq.a(null);
      boolean bool2 = getIntent().getBooleanExtra("switch_country_no_anim", false);
      getIntent().removeExtra("switch_country_no_anim");
      paramBundle = paramBundle.jQF;
      if (!bool2) {
        bool1 = true;
      }
      e(paramBundle, bool1);
      return;
    }
    aq.a(new GameRouteUI.1(this));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      exit();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/ui/tab/GameRouteUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */