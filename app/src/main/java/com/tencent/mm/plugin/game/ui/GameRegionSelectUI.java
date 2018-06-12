package com.tencent.mm.plugin.game.ui;

import android.os.Bundle;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.plugin.game.e.a.a;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.s.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class GameRegionSelectUI
  extends MMPreference
{
  private com.tencent.mm.ui.base.preference.f eOE;
  private Map<String, GameRegionPreference.a> kbB;
  private GameRegionPreference.a kbx;
  
  public final int Ys()
  {
    return -1;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    if ((paramPreference instanceof GameRegionPreference))
    {
      paramPreference = ((GameRegionPreference)paramPreference).kbx;
      if (paramPreference == null) {
        return false;
      }
      this.kbx = paramPreference;
      Iterator localIterator = this.kbB.values().iterator();
      while (localIterator.hasNext()) {
        ((GameRegionPreference.a)localIterator.next()).eQK = false;
      }
      paramPreference.eQK = true;
      paramf.notifyDataSetChanged();
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(f.i.game_region_setting_title);
    setBackBtn(new GameRegionSelectUI.1(this));
    a(0, getString(f.i.game_region_setting_save), new GameRegionSelectUI.2(this), s.b.tmX);
    this.eOE.removeAll();
    this.kbB = a.a.aVh().aVg();
    Object localObject = com.tencent.mm.plugin.game.model.f.dr(this);
    if (localObject != null) {
      ((GameRegionPreference.a)localObject).eQK = true;
    }
    localObject = this.kbB.values().iterator();
    while (((Iterator)localObject).hasNext())
    {
      GameRegionPreference.a locala = (GameRegionPreference.a)((Iterator)localObject).next();
      if (locala != null)
      {
        GameRegionPreference localGameRegionPreference = new GameRegionPreference(this);
        if ((locala == null) || (bi.oW(locala.csQ))) {
          x.e("MicroMsg.GameRegionPreference", "setData region error");
        }
        for (;;)
        {
          if (!locala.isDefault) {
            break label180;
          }
          this.eOE.a(localGameRegionPreference, 0);
          break;
          localGameRegionPreference.kbx = locala;
          localGameRegionPreference.setKey(locala.csQ);
        }
        label180:
        this.eOE.a(localGameRegionPreference);
      }
    }
    localObject = new PreferenceCategory(this);
    this.eOE.a((Preference)localObject);
    this.eOE.notifyDataSetChanged();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    initView();
  }
  
  protected void onDestroy()
  {
    a.a.aVh().aVe();
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameRegionSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */