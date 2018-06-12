package com.tencent.mm.plugin.game.ui;

import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.plugin.game.b.a;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.plugin.game.model.s.d;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.v;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;

public class GameMessageUI
  extends GameCenterActivity
  implements AdapterView.OnItemClickListener, e
{
  private int cYQ = 0;
  private TextView eFf;
  private int hop;
  private AbsListView.OnScrollListener jUS = new GameMessageUI.4(this);
  private ListView kaT;
  private n kaU;
  private View kaV;
  private int kaW = 1;
  private boolean kaX = false;
  private boolean kaY = false;
  private String kaZ = "";
  private DialogInterface.OnClickListener kba;
  private DialogInterface.OnClickListener kbb;
  
  private void goBack()
  {
    ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().aUe();
    finish();
  }
  
  private void ra(int paramInt)
  {
    if (this.eFf == null) {
      this.eFf = ((TextView)findViewById(f.e.game_msg_empty_tv));
    }
    this.eFf.setVisibility(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.GameMessageUI", "onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paraml.getType()) });
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (paraml.getType() == 573)
      {
        ra(8);
        this.kaU.a(null, null);
      }
    }
    do
    {
      return;
      if (this.kaU.getCount() > 0)
      {
        x.i("MicroMsg.GameMessageUI", "has local message, do not show error tips");
        return;
      }
    } while (a.ezo.a(this, paramInt1, paramInt2, paramString));
    Toast.makeText(this, getString(f.i.game_get_msg_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  public final int aUM()
  {
    return 13;
  }
  
  public final int aUN()
  {
    return 1300;
  }
  
  public final int aUO()
  {
    return this.hop;
  }
  
  protected final int getLayoutId()
  {
    return f.f.game_message;
  }
  
  protected final void initView()
  {
    setMMTitle(f.i.game_message);
    setBackBtn(new GameMessageUI.1(this));
    addTextOptionMenu(0, getString(f.i.app_clear), new GameMessageUI.2(this));
    this.hop = getIntent().getIntExtra("game_report_from_scene", 0);
    this.kaT = ((ListView)findViewById(f.e.game_msg_lv));
    this.kaT.setOnItemClickListener(this);
    if (this.cYQ > 20)
    {
      if (!f.dw(this)) {
        break label250;
      }
      this.kaV = View.inflate(this, f.f.game_msg_tips, null);
      this.kaV.setOnClickListener(new GameMessageUI.5(this));
      this.kaT.addHeaderView(this.kaV);
      this.kaV.setVisibility(0);
      f.dx(this);
    }
    for (;;)
    {
      com.tencent.mm.plugin.game.model.s locals = new com.tencent.mm.plugin.game.model.s();
      locals.jNe = true;
      this.kaU = new n(this, locals, this.hop);
      this.kaU.lB(true);
      ra(8);
      this.kaU.tlG = new GameMessageUI.3(this);
      this.kaT.setOnScrollListener(this.jUS);
      this.kaT.setAdapter(this.kaU);
      an.a(this.mController.tml, 13, 1300, 0, 1, 0, null, this.hop, 0, null, null, null);
      return;
      label250:
      if (this.kaV != null) {
        this.kaV.setVisibility(8);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.DF().a(573, this);
    this.cYQ = getIntent().getIntExtra("game_unread_msg_count", 0);
    this.kaZ = getIntent().getStringExtra("game_manage_url");
    initView();
    ((b)com.tencent.mm.kernel.g.l(b.class)).aSi();
    v.aUc();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.kaU != null) {
      this.kaU.aYc();
    }
    com.tencent.mm.kernel.g.DF().b(573, this);
    w localw = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSj();
    String str = "delete from GameRawMessage where createTime < (" + "select createTime from GameRawMessage order by createTime desc limit 9999,1" + ")";
    x.i("MicroMsg.GameMessageStorage", "clearMessageStorage: [%b], [%s]", new Object[] { Boolean.valueOf(localw.fV("GameRawMessage", str)), str });
    ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().aUe();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (com.tencent.mm.plugin.game.model.s)paramAdapterView.getAdapter().getItem(paramInt);
    if (paramAdapterView == null) {
      x.e("MicroMsg.GameMessageUI", "get message null: position:[%d]", new Object[] { Integer.valueOf(paramInt) });
    }
    do
    {
      do
      {
        do
        {
          return;
          paramAdapterView.aTW();
          if (paramAdapterView.field_msgType != 100) {
            break;
          }
        } while (bi.oW(paramAdapterView.jMQ));
        paramView = (s.d)paramAdapterView.jMw.get(paramAdapterView.jMQ);
      } while (paramView == null);
      paramInt = t.a(this, paramAdapterView, paramView, paramAdapterView.field_appId, 1301);
    } while (paramInt == 0);
    an.a(this.mController.tml, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.hop, paramAdapterView.jNa, paramAdapterView.field_gameMsgId, paramAdapterView.jNb, null);
    return;
    if (paramAdapterView.jNc == 0)
    {
      switch (paramAdapterView.field_msgType)
      {
      case 3: 
      case 4: 
      case 7: 
      case 8: 
      case 9: 
      default: 
        return;
      case 2: 
      case 5: 
        if (com.tencent.mm.pluginsdk.model.app.g.r(this, paramAdapterView.field_appId))
        {
          f.ah(this, paramAdapterView.field_appId);
          paramInt = 3;
        }
        break;
      }
      for (;;)
      {
        an.a(this.mController.tml, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.hop, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.jNb, null);
        return;
        if (bi.oW(paramAdapterView.jMj)) {
          break;
        }
        paramInt = com.tencent.mm.plugin.game.e.c.an(this, paramAdapterView.jMj);
        continue;
        if (bi.oW(paramAdapterView.jML)) {
          break;
        }
        paramInt = com.tencent.mm.plugin.game.e.c.an(this, paramAdapterView.jML);
        continue;
        paramView = new Bundle();
        paramView.putCharSequence("game_app_id", paramAdapterView.field_appId);
        paramView.putInt("game_report_from_scene", 1301);
        paramInt = com.tencent.mm.plugin.game.e.c.b(this, paramAdapterView.field_appId, null, paramView);
      }
    }
    switch (paramAdapterView.jNc)
    {
    default: 
      x.e("MicroMsg.GameMessageUI", "unknowed jumptype : " + paramAdapterView.jNc);
      return;
    case 1: 
      if (bi.oW(paramAdapterView.field_appId))
      {
        x.e("MicroMsg.GameMessageUI", "appid is null");
        return;
      }
      paramView = new Bundle();
      paramView.putCharSequence("game_app_id", paramAdapterView.field_appId);
      paramView.putInt("game_report_from_scene", 1301);
      paramInt = com.tencent.mm.plugin.game.e.c.b(this, paramAdapterView.field_appId, null, paramView);
      an.a(this.mController.tml, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.hop, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.jNb, null);
      return;
    case 2: 
      if (com.tencent.mm.pluginsdk.model.app.g.r(this, paramAdapterView.field_appId)) {
        f.ah(this, paramAdapterView.field_appId);
      }
      for (paramInt = 3;; paramInt = com.tencent.mm.plugin.game.e.c.b(this, paramAdapterView.field_appId, null, paramView))
      {
        an.a(this.mController.tml, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.hop, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.jNb, null);
        return;
        paramView = new Bundle();
        paramView.putCharSequence("game_app_id", paramAdapterView.field_appId);
        paramView.putInt("game_report_from_scene", 1301);
      }
    }
    if (!bi.oW(paramAdapterView.jNd))
    {
      paramInt = com.tencent.mm.plugin.game.e.c.an(this, paramAdapterView.jNd);
      an.a(this.mController.tml, 13, 1301, 4, paramInt, 0, paramAdapterView.field_appId, this.hop, paramAdapterView.field_msgType, paramAdapterView.field_gameMsgId, paramAdapterView.jNb, null);
      return;
    }
    x.e("MicroMsg.GameMessageUI", "jumpurl is null");
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.kaU.notifyDataSetChanged();
    if ((this.kaY) && (this.kaV != null)) {
      this.kaT.removeHeaderView(this.kaV);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameMessageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */