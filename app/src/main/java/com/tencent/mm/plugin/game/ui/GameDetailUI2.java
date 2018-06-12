package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.plugin.game.d.az;
import com.tencent.mm.plugin.game.d.bq;
import com.tencent.mm.plugin.game.d.br;
import com.tencent.mm.plugin.game.d.bu;
import com.tencent.mm.plugin.game.d.bv;
import com.tencent.mm.plugin.game.d.cy;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.ab;
import com.tencent.mm.plugin.game.model.ae;
import com.tencent.mm.plugin.game.model.ae.a;
import com.tencent.mm.plugin.game.model.ae.b;
import com.tencent.mm.plugin.game.model.af;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.at;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.model.m.b;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.t.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GameDetailUI2
  extends MMActivity
  implements e
{
  private String appId = null;
  private Dialog iwc;
  private com.tencent.mm.plugin.game.model.d jMa = null;
  private int jNv = 0;
  private d jWA = null;
  private n jWB = null;
  private ViewGroup jWC;
  private ImageView jWD;
  private ImageView jWE;
  private TextView jWF;
  private Button jWG;
  private TextProgressBar jWH;
  private TextView jWI;
  private LinearLayout jWJ;
  private GameDetailAutoScrollView jWK;
  private LinearLayout jWL;
  private TextView jWM;
  private LinearLayout jWN;
  private TextView jWO;
  private LinearLayout jWP;
  private ImageView jWQ;
  private View jWR;
  private TextView jWS;
  private TextView jWT;
  private View jWU;
  private TextView jWV;
  private ImageView jWW;
  private TextView jWX;
  private TextView jWY;
  private LinearLayout jWZ;
  private String jWs = null;
  private String jWt = null;
  private int jWv = 18;
  private boolean jWw;
  private boolean jWx;
  private String jWy = null;
  private m.b jWz = null;
  private GameMediaList jXa;
  private TextView jXb;
  private TextView jXc;
  private TextView jXd;
  private boolean jXe = false;
  private LinearLayout jXf;
  private TextView jXg;
  private LinearLayout jXh;
  private TextView jXi;
  private cy jXj;
  private DialogInterface.OnClickListener jXk = new GameDetailUI2.15(this);
  private View.OnClickListener jXl = new GameDetailUI2.16(this);
  private View.OnClickListener jXm = new GameDetailUI2.17(this);
  private View.OnClickListener jXn = new GameDetailUI2.2(this);
  private View.OnClickListener jXo = new GameDetailUI2.3(this);
  private View.OnClickListener jXp = new GameDetailUI2.4(this);
  private View.OnClickListener jXq = new GameDetailUI2.5(this);
  
  private void a(ae paramae)
  {
    Object localObject1 = null;
    if ((paramae.jNF.jNG == null) || (paramae.jNF.jNG.size() == 0)) {
      localObject1 = paramae.jNC.jRx;
    }
    if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0))
    {
      this.jWJ.setVisibility(8);
      return;
    }
    this.jWJ.setVisibility(0);
    this.jWJ.removeAllViews();
    paramae = ((LinkedList)localObject1).iterator();
    label76:
    View localView;
    ImageView localImageView;
    TextView localTextView1;
    TextView localTextView2;
    if (paramae.hasNext())
    {
      localObject1 = (com.tencent.mm.plugin.game.d.t)paramae.next();
      localView = LayoutInflater.from(this.mController.tml).inflate(f.f.game_detail2_trend_item, this.jWJ, false);
      localImageView = (ImageView)localView.findViewById(f.e.game_detail_trend_item_icon);
      localTextView1 = (TextView)localView.findViewById(f.e.game_detail_trend_item_title);
      localTextView2 = (TextView)localView.findViewById(f.e.game_detail_trend_item_detail);
      if (bi.oW(((com.tencent.mm.plugin.game.d.t)localObject1).hbL)) {
        break label205;
      }
      a.b.a(localImageView, ((com.tencent.mm.plugin.game.d.t)localObject1).hbL, 0.5F, false);
    }
    for (;;)
    {
      localTextView1.setText(((com.tencent.mm.plugin.game.d.t)localObject1).bHD);
      localTextView2.setText(((com.tencent.mm.plugin.game.d.t)localObject1).jQf);
      this.jWJ.addView(localView);
      break label76;
      break;
      label205:
      Object localObject2 = new c.a();
      ((c.a)localObject2).dXW = true;
      localObject2 = ((c.a)localObject2).Pt();
      com.tencent.mm.ak.o.Pj().a(((com.tencent.mm.plugin.game.d.t)localObject1).jPd, localImageView, (com.tencent.mm.ak.a.a.c)localObject2);
    }
  }
  
  private void b(ae paramae)
  {
    if ((paramae.aUi() != null) && (!paramae.aUi().isEmpty()))
    {
      this.jWN.setVisibility(0);
      int i;
      if (!bi.oW(paramae.aUh()))
      {
        this.jWO.setVisibility(0);
        this.jWO.setText(paramae.aUh());
        this.jWP.removeAllViews();
        if (paramae.aUj() != 1) {
          break label268;
        }
        this.jWP.setOrientation(1);
        i = f.f.game_detail2_gift_item;
        this.jWQ.setVisibility(8);
      }
      Object localObject;
      for (;;)
      {
        localObject = paramae.aUi();
        if (localObject == null) {
          break label291;
        }
        localObject = ((LinkedList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          ae.b localb = (ae.b)((Iterator)localObject).next();
          View localView = LayoutInflater.from(this.mController.tml).inflate(i, this.jWP, false);
          ImageView localImageView = (ImageView)localView.findViewById(f.e.game_detail_gift_item_icon);
          com.tencent.mm.ak.o.Pj().a(localb.bWP, localImageView);
          if (paramae.aUj() == 1) {
            ((TextView)localView.findViewById(f.e.game_detail_gift_item_title)).setText(localb.title);
          }
          ((TextView)localView.findViewById(f.e.game_detail_gift_item_detail)).setText(localb.desc);
          if (paramae.aUj() == 1)
          {
            localView.setTag(localb.url);
            localView.setOnClickListener(this.jXn);
          }
          this.jWP.addView(localView);
        }
        this.jWO.setVisibility(8);
        break;
        label268:
        this.jWP.setOrientation(0);
        i = f.f.game_detail2_gift2_item;
        this.jWQ.setVisibility(0);
      }
      label291:
      if (paramae.jNC.jRF != null)
      {
        localObject = new ae.a();
        ((ae.a)localObject).title = paramae.jNC.jRF.summary;
        ((ae.a)localObject).desc = paramae.jNC.jRF.desc;
        ((ae.a)localObject).url = paramae.jNC.jRF.url;
        paramae = (ae)localObject;
        if (paramae == null) {
          break label528;
        }
        this.jWR.setVisibility(0);
        this.jWS.setText(paramae.title);
        if (bi.oW(paramae.desc)) {
          break label516;
        }
        this.jWT.setVisibility(0);
        this.jWT.setText(paramae.desc);
      }
      for (;;)
      {
        this.jWR.setTag(paramae.url);
        this.jWR.setOnClickListener(this.jXn);
        return;
        if ((paramae.jNC.jRA != null) && (!bi.oW(paramae.jNC.jRA.jSn)) && (!bi.oW(paramae.jNC.jRA.jSo)))
        {
          localObject = new ae.a();
          ((ae.a)localObject).title = paramae.jNC.jRA.jSn;
          ((ae.a)localObject).url = paramae.jNC.jRA.jSo;
          paramae = (ae)localObject;
          break;
        }
        paramae = null;
        break;
        label516:
        this.jWT.setVisibility(8);
      }
      label528:
      this.jWR.setVisibility(8);
      return;
    }
    this.jWN.setVisibility(8);
  }
  
  private void b(af paramaf)
  {
    int i = 0;
    List localList = paramaf.jNG;
    if ((localList == null) || (localList.size() == 0))
    {
      this.jWL.setVisibility(8);
      this.jWM.setVisibility(8);
      return;
    }
    this.jWL.setVisibility(0);
    if (localList.size() > 3) {
      this.jWM.setVisibility(0);
    }
    for (;;)
    {
      this.jWL.removeAllViews();
      i locali = new i(this.mController.tml);
      locali.Ba = f.f.game_detail2_rank_item_small;
      locali.a(paramaf);
      locali.jNv = this.jNv;
      while ((i < localList.size()) && (i < 3))
      {
        paramaf = locali.getView(i, null, this.jWJ);
        this.jWL.addView(paramaf);
        i += 1;
      }
      break;
      this.jWM.setVisibility(8);
    }
  }
  
  private void c(ae paramae)
  {
    if ((paramae.aUo() != null) && (!paramae.aUo().isEmpty()))
    {
      this.jXf.setVisibility(0);
      if (!bi.oW(paramae.aUn()))
      {
        this.jXg.setVisibility(0);
        this.jXg.setText(paramae.aUn());
      }
      for (;;)
      {
        this.jXh.removeAllViews();
        this.jXh.setOnClickListener(null);
        Iterator localIterator = paramae.aUo().iterator();
        while (localIterator.hasNext())
        {
          bv localbv = (bv)localIterator.next();
          View localView = LayoutInflater.from(this.mController.tml).inflate(f.f.game_detail2_guide_item, this.jXh, false);
          TextView localTextView1 = (TextView)localView.findViewById(f.e.game_detail_guide_item_tag);
          TextView localTextView2 = (TextView)localView.findViewById(f.e.game_detail_guide_item_title);
          TextView localTextView3 = (TextView)localView.findViewById(f.e.game_detail_guide_item_detail);
          ImageView localImageView = (ImageView)localView.findViewById(f.e.game_detail_guide_item_icon);
          localTextView1.setText(localbv.jSt);
          localTextView2.setText(localbv.bHD);
          localTextView3.setText(localbv.jQf);
          com.tencent.mm.ak.o.Pj().a(localbv.jSp, localImageView);
          localView.setTag(localbv.jOX);
          localView.setOnClickListener(this.jXo);
          this.jXh.addView(localView);
        }
        this.jXg.setVisibility(8);
      }
      if (paramae.jNC.jRA == null) {
        paramae = null;
      }
      while (paramae != null)
      {
        this.jXi.setVisibility(0);
        this.jXi.setText((CharSequence)paramae.first);
        this.jXi.setTag(paramae.second);
        this.jXi.setOnClickListener(this.jXp);
        return;
        if ((bi.oW(paramae.jNC.jRz.bHD)) || (bi.oW(paramae.jNC.jRz.jSo))) {
          paramae = null;
        } else {
          paramae = new Pair(paramae.jNC.jRz.jSn, paramae.jNC.jRz.jSo);
        }
      }
      this.jXi.setVisibility(8);
      return;
    }
    this.jXf.setVisibility(8);
  }
  
  private void goBack()
  {
    Object localObject = getIntent().getStringExtra("jump_game_center");
    if ((!bi.oW((String)localObject)) && (((String)localObject).equals("jump_game_center")))
    {
      localObject = new Intent(this, GameCenterUI.class);
      ((Intent)localObject).putExtra("jump_find_more_friends", "jump_find_more_friends");
      startActivity((Intent)localObject);
    }
    finish();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (!com.tencent.mm.plugin.game.b.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
        Toast.makeText(this, getString(f.i.game_list_get_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      if (this.iwc != null) {
        this.iwc.cancel();
      }
      return;
    }
    switch (paraml.getType())
    {
    default: 
      return;
    }
    paramString = ((at)paraml).ivx.dIE.dIL;
    com.tencent.mm.kernel.g.Em().H(new GameDetailUI2.14(this, paramString));
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return f.f.game_detail2;
  }
  
  protected final void initView()
  {
    setMMTitle(f.i.game_detail_title);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GameDetailUI2.a(GameDetailUI2.this);
        return true;
      }
    });
    this.jWC = ((ViewGroup)findViewById(f.e.game_detail));
    this.jWD = ((ImageView)findViewById(f.e.game_detail_bg));
    this.jWE = ((ImageView)findViewById(f.e.game_icon));
    this.jWF = ((TextView)findViewById(f.e.game_name));
    this.jWI = ((TextView)findViewById(f.e.game_info));
    this.jWG = ((Button)findViewById(f.e.game_action_btn));
    this.jWH = ((TextProgressBar)findViewById(f.e.game_progress));
    this.jWH.setTextSize(this.jWv);
    this.jWJ = ((LinearLayout)findViewById(f.e.game_detail_trend_container));
    this.jWK = ((GameDetailAutoScrollView)findViewById(f.e.game_detail_trend_brief));
    this.jWL = ((LinearLayout)findViewById(f.e.game_detail_rank_container));
    this.jWM = ((TextView)findViewById(f.e.game_detail_rank_entrance));
    this.jWN = ((LinearLayout)findViewById(f.e.game_detail_gift));
    this.jWO = ((TextView)findViewById(f.e.game_detail_gift_title));
    this.jWP = ((LinearLayout)findViewById(f.e.game_detail_gift_container));
    this.jWQ = ((ImageView)findViewById(f.e.game_detail_gift_divider));
    this.jWR = findViewById(f.e.game_detail_gift_entrance);
    this.jWS = ((TextView)findViewById(f.e.game_detail_gift_entrance_title));
    this.jWT = ((TextView)findViewById(f.e.game_detail_gift_entrance_desc));
    this.jWU = findViewById(f.e.game_detail_group);
    this.jWV = ((TextView)findViewById(f.e.game_detail_group_title));
    this.jWW = ((ImageView)findViewById(f.e.game_detail_group_icon));
    this.jWX = ((TextView)findViewById(f.e.game_detail_group_desc));
    this.jWY = ((TextView)findViewById(f.e.game_detail_group_detail));
    this.jWZ = ((LinearLayout)findViewById(f.e.game_detail_desc));
    this.jXa = ((GameMediaList)findViewById(f.e.game_detail_intro_media));
    GameMediaList localGameMediaList = this.jXa;
    String str = this.appId;
    int i = this.jNv;
    localGameMediaList.appId = str;
    localGameMediaList.iMP = 12;
    localGameMediaList.jYI = i;
    localGameMediaList.mContext = this;
    this.jXa.setItemLayout(f.f.game_media_item_big);
    this.jXb = ((TextView)findViewById(f.e.game_detail_desc_title));
    this.jXc = ((TextView)findViewById(f.e.game_detail_desc_content));
    this.jXc.getViewTreeObserver().addOnGlobalLayoutListener(new GameDetailUI2.10(this));
    this.jXd = ((TextView)findViewById(f.e.game_detail_desc_toggle));
    this.jXd.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (!GameDetailUI2.d(GameDetailUI2.this))
        {
          GameDetailUI2.b(GameDetailUI2.this).setMaxLines(100);
          GameDetailUI2.c(GameDetailUI2.this).setText(GameDetailUI2.this.getResources().getText(f.i.game_desc_toggle_less));
          GameDetailUI2.a(GameDetailUI2.this, true);
          return;
        }
        GameDetailUI2.b(GameDetailUI2.this).setMaxLines(3);
        GameDetailUI2.c(GameDetailUI2.this).setText(GameDetailUI2.this.getResources().getText(f.i.game_desc_toggle_all));
        GameDetailUI2.a(GameDetailUI2.this, false);
      }
    });
    this.jXf = ((LinearLayout)findViewById(f.e.game_detail_guide));
    this.jXg = ((TextView)findViewById(f.e.game_detail_guide_title));
    this.jXh = ((LinearLayout)findViewById(f.e.game_detail_guide_container));
    this.jXi = ((TextView)findViewById(f.e.game_detail_guide_entrance));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.GameDetailUI2", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default: 
      x.e("MicroMsg.GameDetailUI2", "error request code");
    }
    do
    {
      String str2;
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              switch (paramInt2)
              {
              case 0: 
              case 1: 
              default: 
                return;
              }
            } while ((this.jMa == null) || (this.jWB == null));
            this.jWB.aTU();
            this.jWA.a(this.jMa, this.jWB);
            return;
          } while (this.jWB == null);
          this.jWB.aTT();
          return;
        } while (paramInt2 != -1);
        str2 = paramIntent.getStringExtra("Select_Conv_User");
      } while (bi.oW(str2));
      String str1 = this.jXj.jPd;
      paramIntent = str1;
      if (bi.oW(str1)) {
        paramIntent = this.jMa.field_appIconUrl;
      }
      t.a.qJO.a(this.mController, this.jXj.jTm, paramIntent, this.jXj.jTn, true, getResources().getString(f.i.app_send), new GameDetailUI2.9(this, str2));
      return;
    } while (paramInt2 != -1);
    an.a(this.mController.tml, 12, 1207, 2, 15, this.appId, this.jNv, null);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!com.tencent.mm.kernel.g.Eg().Dx())
    {
      x.e("MicroMsg.GameDetailUI2", "account not ready");
      finish();
      return;
    }
    this.jWw = true;
    this.jWx = false;
    this.appId = getIntent().getStringExtra("game_app_id");
    if (bi.oW(this.appId))
    {
      x.e("MicroMsg.GameDetailUI2", "appid is null or nill");
      finish();
      initView();
      com.tencent.mm.kernel.g.DF().a(1217, this);
      paramBundle = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSk().Dw(this.appId);
      if ((paramBundle != null) && (paramBundle.length != 0)) {
        break label205;
      }
      x.i("MicroMsg.GameDetailUI2", "No cache found");
    }
    for (int i = 0;; i = 1)
    {
      if (i == 0)
      {
        this.iwc = com.tencent.mm.plugin.game.e.c.dD(this);
        this.iwc.show();
      }
      paramBundle = w.chP();
      boolean bool = com.tencent.mm.pluginsdk.model.app.g.r(this, this.appId);
      paramBundle = new at(paramBundle, this.appId, bool);
      com.tencent.mm.kernel.g.DF().a(paramBundle, 0);
      return;
      this.jNv = getIntent().getIntExtra("game_report_from_scene", 0);
      break;
      label205:
      com.tencent.mm.kernel.g.Em().H(new GameDetailUI2.12(this, paramBundle));
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.kernel.g.DF().b(1217, this);
    if (this.jWz != null) {
      m.b(this.jWz);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
    if ((this.jMa != null) && (this.jWB != null))
    {
      this.jWB.aTT();
      this.jWA.a(this.jWH, this.jWG, this.jMa, this.jWB);
    }
    if (!this.jWw)
    {
      b(new af(this.appId));
      return;
    }
    this.jWw = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDetailUI2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */