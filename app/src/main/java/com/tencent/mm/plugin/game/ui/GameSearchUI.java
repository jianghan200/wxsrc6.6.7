package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.ar;
import com.tencent.mm.plugin.game.model.as;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.protocal.c.xv;
import com.tencent.mm.protocal.c.xx;
import com.tencent.mm.protocal.c.xz;
import com.tencent.mm.protocal.c.ya;
import com.tencent.mm.protocal.c.yb;
import com.tencent.mm.protocal.c.yc;
import com.tencent.mm.protocal.c.yd;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.o.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;

public class GameSearchUI
  extends MMActivity
  implements e, o.b
{
  private static final Pattern kct = Pattern.compile("\\s+");
  private com.tencent.mm.ui.tools.o eMS;
  private ProgressBar eVR;
  private int fromScene;
  private View gPU;
  private TextView jwj;
  private String kcA;
  private LinkedList<String> kcB;
  private String kcC;
  private LinkedList<l> kcD = new LinkedList();
  private boolean kcE = false;
  private AdapterView.OnItemClickListener kcF = new AdapterView.OnItemClickListener()
  {
    public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      paramAnonymousAdapterView = GameSearchUI.b(GameSearchUI.this);
      if ((paramAnonymousInt < 0) || (paramAnonymousInt >= paramAnonymousAdapterView.getCount()))
      {
        paramAnonymousAdapterView = null;
        if (paramAnonymousAdapterView != null) {
          break label42;
        }
      }
      label42:
      do
      {
        return;
        paramAnonymousAdapterView = ((r.b)paramAnonymousAdapterView.getItem(paramAnonymousInt)).kcj;
        break;
        if ((paramAnonymousAdapterView.actionType == 1) && (!bi.oW(paramAnonymousAdapterView.appId)))
        {
          paramAnonymousView = new Bundle();
          paramAnonymousView.putCharSequence("game_app_id", paramAnonymousAdapterView.appId);
          paramAnonymousView.putInt("game_report_from_scene", paramAnonymousAdapterView.bYq);
          paramAnonymousInt = c.b(GameSearchUI.this, paramAnonymousAdapterView.appId, null, paramAnonymousView);
          paramAnonymousView = new HashMap();
          paramAnonymousView.put("function_type", "search");
          paramAnonymousView.put("funtion_value", paramAnonymousAdapterView.kcl);
          paramAnonymousView.put("keyword", GameSearchUI.f(GameSearchUI.this));
          paramAnonymousView = an.D(paramAnonymousView);
          an.a(GameSearchUI.this, 14, paramAnonymousAdapterView.bYq, paramAnonymousAdapterView.position, paramAnonymousInt, paramAnonymousAdapterView.appId, GameSearchUI.g(GameSearchUI.this), paramAnonymousView);
          return;
        }
      } while ((paramAnonymousAdapterView.actionType != 2) || (bi.oW(paramAnonymousAdapterView.kck)));
      paramAnonymousInt = c.r(GameSearchUI.this, paramAnonymousAdapterView.kck, "game_center_detail");
      paramAnonymousView = new HashMap();
      paramAnonymousView.put("function_type", "search");
      paramAnonymousView.put("funtion_value", paramAnonymousAdapterView.kcl);
      paramAnonymousView.put("keyword", GameSearchUI.f(GameSearchUI.this));
      paramAnonymousView = an.D(paramAnonymousView);
      an.a(GameSearchUI.this, 14, paramAnonymousAdapterView.bYq, paramAnonymousAdapterView.position, paramAnonymousInt, 0, paramAnonymousAdapterView.appId, GameSearchUI.g(GameSearchUI.this), paramAnonymousAdapterView.kcf, String.valueOf(paramAnonymousAdapterView.kcg), null, paramAnonymousView);
    }
  };
  private AdapterView.OnItemClickListener kcG = new GameSearchUI.6(this);
  private ViewGroup kcu;
  private ListView kcv;
  private ListView kcw;
  private r kcx;
  private s kcy;
  private String kcz;
  
  private void Q(LinkedList<String> paramLinkedList)
  {
    a(paramLinkedList, 0, true);
  }
  
  private void a(LinkedList<String> paramLinkedList, int paramInt, boolean paramBoolean)
  {
    while (!this.kcD.isEmpty())
    {
      g.Ek();
      g.Eh().dpP.c((l)this.kcD.pop());
    }
    if (paramBoolean)
    {
      localObject = this.kcx;
      ((r)localObject).jNB = 0;
      ((r)localObject).kbN = false;
    }
    this.kcB = paramLinkedList;
    Object localObject = new ar(w.chP(), paramLinkedList, f.aTz(), this.kcx.jNB);
    g.DF().a((l)localObject, 0);
    this.kcD.add(localObject);
    paramLinkedList = paramLinkedList.iterator();
    for (this.kcz = ""; paramLinkedList.hasNext(); this.kcz = (this.kcz + " " + (String)paramLinkedList.next())) {}
    this.kcz = this.kcz.trim();
    if ((paramInt == 1) || (paramInt == 2))
    {
      this.kcE = true;
      this.eMS.setSearchContent(this.kcz);
    }
  }
  
  private void mH(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.kcu.setVisibility(8);
      this.jwj.setVisibility(8);
      this.kcv.setVisibility(8);
      this.kcw.setVisibility(8);
      this.eVR.setVisibility(8);
      return;
    case 1: 
      YC();
      this.kcv.smoothScrollToPosition(0);
      this.eMS.clearFocus();
      this.kcu.setVisibility(8);
      this.jwj.setVisibility(8);
      this.kcv.setVisibility(8);
      this.kcw.setVisibility(8);
      this.eVR.setVisibility(0);
      return;
    case 6: 
      this.kcv.smoothScrollToPosition(0);
      this.kcu.setVisibility(8);
      this.jwj.setVisibility(8);
      this.kcv.setVisibility(8);
      this.kcw.setVisibility(8);
      this.eVR.setVisibility(0);
      return;
    case 2: 
      this.kcu.setVisibility(8);
      if (this.kcx.getCount() > 0)
      {
        this.jwj.setVisibility(8);
        this.kcv.setVisibility(0);
      }
      for (;;)
      {
        this.kcw.setVisibility(8);
        this.eVR.setVisibility(8);
        return;
        this.jwj.setVisibility(0);
        this.kcv.setVisibility(8);
      }
    case 3: 
      this.kcu.setVisibility(0);
      this.jwj.setVisibility(8);
      this.kcv.setVisibility(8);
      this.kcw.setVisibility(8);
      this.eVR.setVisibility(8);
      return;
    case 4: 
      this.kcu.setVisibility(8);
      this.jwj.setVisibility(0);
      this.kcv.setVisibility(8);
      this.kcw.setVisibility(8);
      this.eVR.setVisibility(8);
      return;
    }
    this.kcu.setVisibility(8);
    this.jwj.setVisibility(8);
    this.kcv.setVisibility(8);
    this.kcw.setVisibility(0);
    this.eVR.setVisibility(8);
  }
  
  public final void WW()
  {
    YC();
    onBackPressed();
  }
  
  public final void WX() {}
  
  public final void WY() {}
  
  public final void WZ() {}
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.aBS) {}
    label264:
    label583:
    label602:
    label622:
    label637:
    label707:
    label712:
    label718:
    label723:
    label738:
    label1749:
    do
    {
      return;
      if (this.kcD.contains(paraml)) {
        this.kcD.remove(paraml);
      }
      this.gPU.setVisibility(8);
      switch (paraml.getType())
      {
      default: 
        return;
      case 1328: 
        paramString = (xz)((ar)paraml).ivx.dID.dIL;
        x.d("MicroMsg.GameSearchUI", "keywords = %s, offset = %d", new Object[] { paramString.rDP, Integer.valueOf(paramString.rDQ) });
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (ya)((ar)paraml).ivx.dIE.dIL;
          Object localObject3;
          Object localObject4;
          if (paramString != null)
          {
            paramString = paramString.rDR;
            if (bi.cX(paramString)) {
              break label1749;
            }
            this.kcA = this.kcz;
            if (this.kcx.jNB != 0)
            {
              paraml = this.kcx;
              localObject1 = this.kcA;
              paramString = paramString.iterator();
            }
          }
          else
          {
            for (;;)
            {
              if (!paramString.hasNext()) {
                break label1749;
              }
              localObject2 = (yb)paramString.next();
              if ((((yb)localObject2).type == 3) && (!bi.cX(((yb)localObject2).rDT)))
              {
                paraml.jNB = ((yb)localObject2).rDX;
                paraml.kbN = ((yb)localObject2).rDY;
                localObject2 = ((yb)localObject2).rDT.iterator();
                if (((Iterator)localObject2).hasNext())
                {
                  localObject3 = r.b.a((yd)((Iterator)localObject2).next());
                  ((r.b)localObject3).bHt = ((String)localObject1);
                  ((r.b)localObject3).kcj.appId = ((r.b)localObject3).appId;
                  ((r.b)localObject3).kcj.kcf = ((r.b)localObject3).kcf;
                  ((r.b)localObject3).kcj.kcg = ((r.b)localObject3).kcg;
                  ((r.b)localObject3).kcj.kcl = "2";
                  localObject4 = ((r.b)localObject3).kcj;
                  paramInt1 = paraml.kbK;
                  paraml.kbK = (paramInt1 + 1);
                  ((r.c)localObject4).position = (paramInt1 + 301);
                  localObject4 = ((r.b)localObject3).kcj;
                  if (paraml.bHx) {}
                  for (paramInt1 = 1403;; paramInt1 = 1405)
                  {
                    ((r.c)localObject4).bYq = paramInt1;
                    paraml.hQM.add(localObject3);
                    break label264;
                    paramString = null;
                    break;
                  }
                }
              }
              else
              {
                paraml.kbN = false;
              }
            }
          }
          paraml = this.kcx;
          localObject1 = this.kcA;
          if (paraml.hQM == null) {
            paraml.hQM = new ArrayList();
          }
          paraml.jZl = 0;
          paraml.kbI = 0;
          paraml.kbJ = 0;
          paraml.kbK = 0;
          paraml.kbL = 0;
          paraml.bHx = false;
          paraml.kbH = false;
          paraml.kbN = false;
          paraml.jNB = 0;
          paraml.hQM.clear();
          paraml.kbO = false;
          Object localObject2 = paramString.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            paramString = (yb)((Iterator)localObject2).next();
            int i;
            if ((paramString.rDS == null) || (paramString.rDS.size() == 0))
            {
              paramInt1 = 1;
              if ((paramString.rDT != null) && (paramString.rDT.size() != 0)) {
                break label707;
              }
              paramInt2 = 1;
              if ((paramString.rDW != null) && (paramString.rDW.size() != 0)) {
                break label712;
              }
              i = 1;
              if ((paramInt1 == 0) || (paramInt2 == 0) || (i == 0)) {
                break label718;
              }
              paramInt1 = 1;
              if (paramInt1 == 0) {
                break label738;
              }
              if (paramString.type != 1) {
                continue;
              }
              if (bi.oW((String)localObject1)) {
                break label723;
              }
            }
            for (paramString = paraml.context.getString(f.i.game_search_no_res_kw, new Object[] { localObject1 });; paramString = paraml.context.getString(f.i.game_search_no_res))
            {
              paraml.hQM.add(r.b.ap(6, paramString));
              paraml.kbO = true;
              break;
              paramInt1 = 0;
              break label583;
              paramInt2 = 0;
              break label602;
              i = 0;
              break label622;
              paramInt1 = 0;
              break label637;
            }
            paraml.hQM.add(r.b.ap(0, paramString.bHD));
            if (!paraml.kbO)
            {
              ((r.b)paraml.hQM.get(paraml.hQM.size() - 1)).kch = true;
              paraml.kbO = true;
            }
            Object localObject5;
            if ((paramString.type == 4) && (paramString.rDW != null))
            {
              localObject3 = paramString.rDW.iterator();
              while (((Iterator)localObject3).hasNext())
              {
                localObject5 = (yc)((Iterator)localObject3).next();
                localObject4 = new r.b();
                ((r.b)localObject4).type = 3;
                ((r.b)localObject4).appId = ((yc)localObject5).rDZ.jQb;
                ((r.b)localObject4).name = ((yc)localObject5).rDZ.jPe;
                ((r.b)localObject4).fky = ((yc)localObject5).rDZ.rul;
                ((r.b)localObject4).iconUrl = ((yc)localObject5).rDZ.jPG;
                ((r.b)localObject4).kcb = ((yc)localObject5).rDZ.jPf;
                ((r.b)localObject4).kcc = ((yc)localObject5).rDZ.rDE;
                ((r.b)localObject4).actionType = ((yc)localObject5).rDZ.rDF;
                ((r.b)localObject4).kcd = ((yc)localObject5).rDZ.rDG;
                ((r.b)localObject4).kce = ((yc)localObject5).rEa;
                ((r.b)localObject4).kcj = new r.c(((yc)localObject5).rDZ.rDF, 4, ((yc)localObject5).rDZ.jQb, ((yc)localObject5).rDZ.rDG);
                ((r.b)localObject4).bHt = ((String)localObject1);
                ((r.b)localObject4).kcj.kcl = "3";
                localObject5 = ((r.b)localObject4).kcj;
                paramInt1 = paraml.kbJ;
                paraml.kbJ = (paramInt1 + 1);
                ((r.c)localObject5).position = (paramInt1 + 601);
                paraml.hQM.add(localObject4);
              }
            }
            if (((paramString.type == 1) || (paramString.type == 2)) && (paramString.rDS != null))
            {
              localObject3 = paramString.rDS.iterator();
              if (((Iterator)localObject3).hasNext())
              {
                localObject5 = (xv)((Iterator)localObject3).next();
                localObject4 = new r.b();
                ((r.b)localObject4).type = 1;
                ((r.b)localObject4).appId = ((xv)localObject5).jQb;
                ((r.b)localObject4).name = ((xv)localObject5).jPe;
                ((r.b)localObject4).fky = ((xv)localObject5).rul;
                ((r.b)localObject4).iconUrl = ((xv)localObject5).jPG;
                ((r.b)localObject4).kcb = ((xv)localObject5).jPf;
                ((r.b)localObject4).kcc = ((xv)localObject5).rDE;
                ((r.b)localObject4).actionType = ((xv)localObject5).rDF;
                ((r.b)localObject4).kcd = ((xv)localObject5).rDG;
                ((r.b)localObject4).kcj = new r.c(((xv)localObject5).rDF, 1, ((xv)localObject5).jQb, ((xv)localObject5).rDG);
                ((r.b)localObject4).bHt = ((String)localObject1);
                if (paramString.type == 1)
                {
                  paraml.bHx = true;
                  localObject5 = ((r.b)localObject4).kcj;
                  paramInt1 = paraml.jZl;
                  paraml.jZl = (paramInt1 + 1);
                  ((r.c)localObject5).position = (paramInt1 + 1);
                }
                for (;;)
                {
                  ((r.b)localObject4).kcj.kcl = "1";
                  paraml.hQM.add(localObject4);
                  break;
                  if (paramString.type == 2)
                  {
                    paraml.kbH = true;
                    localObject5 = ((r.b)localObject4).kcj;
                    paramInt1 = paraml.kbI;
                    paraml.kbI = (paramInt1 + 1);
                    ((r.c)localObject5).position = (paramInt1 + 1);
                  }
                }
              }
            }
            else if ((paramString.type == 3) && (paramString.rDT != null))
            {
              paraml.jNB = paramString.rDX;
              paraml.kbN = paramString.rDY;
              localObject3 = paramString.rDT.iterator();
              while (((Iterator)localObject3).hasNext())
              {
                localObject4 = r.b.a((yd)((Iterator)localObject3).next());
                ((r.b)localObject4).bHt = ((String)localObject1);
                ((r.b)localObject4).kcj.appId = ((r.b)localObject4).appId;
                ((r.b)localObject4).kcj.kcf = ((r.b)localObject4).kcf;
                ((r.b)localObject4).kcj.kcg = ((r.b)localObject4).kcg;
                ((r.b)localObject4).kcj.kcl = "2";
                localObject5 = ((r.b)localObject4).kcj;
                paramInt1 = paraml.kbK;
                paraml.kbK = (paramInt1 + 1);
                ((r.c)localObject5).position = (paramInt1 + 301);
                paraml.hQM.add(localObject4);
              }
            }
            if ((!bi.oW(paramString.rDU)) && (!bi.oW(paramString.rDV)) && (paramString.type == 1))
            {
              localObject3 = paramString.rDU;
              paramString = paramString.rDV;
              localObject4 = new r.b();
              ((r.b)localObject4).type = 5;
              ((r.b)localObject4).name = ((String)localObject3);
              ((r.b)localObject4).kcj = new r.c(paramString);
              ((r.b)localObject4).kcj.appId = "wx62d9035fd4fd2059";
              ((r.b)localObject4).kcj.kcl = "1";
              ((r.b)localObject4).kcj.position = 300;
              paraml.hQM.add(localObject4);
            }
          }
          paramString = paraml.hQM.iterator();
          while (paramString.hasNext())
          {
            localObject1 = (r.b)paramString.next();
            if (paraml.bHx) {
              ((r.b)localObject1).kcj.bYq = 1403;
            } else if (paraml.kbH) {
              ((r.b)localObject1).kcj.bYq = 1404;
            } else {
              ((r.b)localObject1).kcj.bYq = 1405;
            }
          }
          paraml.notifyDataSetChanged();
        }
        mH(2);
        return;
      }
    } while ((paramInt1 != 0) || (paramInt2 != 0));
    paramString = ((as)paraml).bHt;
    Object localObject1 = ((xx)((as)paraml).ivx.dIE.dIL).bHD;
    paraml = ((xx)((as)paraml).ivx.dIE.dIL).rDN;
    this.kcy.a(paramString, (String)localObject1, paraml);
    mH(5);
  }
  
  protected final int getLayoutId()
  {
    return f.f.game_search_layout;
  }
  
  protected final void initView()
  {
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GameSearchUI.this.onBackPressed();
        return true;
      }
    });
    this.eMS = new com.tencent.mm.ui.tools.o();
    this.eMS.mv(true);
    this.eMS.uBw = this;
    this.kcu = ((ViewGroup)findViewById(f.e.voicesearch_view));
    this.eVR = ((ProgressBar)findViewById(f.e.search_progress_bar));
    this.jwj = ((TextView)findViewById(f.e.no_result));
    this.kcv = ((ListView)findViewById(f.e.search_result));
    this.kcx = new r(this);
    this.kcv.setAdapter(this.kcx);
    this.kcv.setOnItemClickListener(this.kcF);
    this.kcv.setOnTouchListener(new GameSearchUI.2(this));
    this.kcv.setOnScrollListener(new GameSearchUI.3(this));
    this.gPU = getLayoutInflater().inflate(f.f.game_list_footer_loading, this.kcv, false);
    this.gPU.setVisibility(8);
    this.kcv.addFooterView(this.gPU);
    this.kcw = ((ListView)findViewById(f.e.search_recmd));
    this.kcy = new s(this);
    this.kcw.setAdapter(this.kcy);
    this.kcw.setOnItemClickListener(this.kcG);
    this.kcw.setOnTouchListener(new GameSearchUI.4(this));
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    if (!g.Eg().Dx())
    {
      x.e("MicroMsg.GameSearchUI", "account not ready");
      finish();
      return;
    }
    g.DF().a(1328, this);
    g.DF().a(1329, this);
    this.fromScene = getIntent().getIntExtra("game_report_from_scene", 0);
    initView();
    an.a(this, 14, 1401, 0, 2, this.fromScene, null);
    x.i("MicroMsg.GameSearchUI", "[onCreate] time:" + (System.currentTimeMillis() - l));
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    this.eMS.a(this, paramMenu);
    this.eMS.setHint(f.aTK());
    return true;
  }
  
  protected void onDestroy()
  {
    x.i("MicroMsg.GameSearchUI", "onDestroy");
    super.onDestroy();
    g.DF().b(1328, this);
    g.DF().b(1329, this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    this.eMS.a(this, paramMenu);
    return true;
  }
  
  public final boolean pj(String paramString)
  {
    if (bi.oW(paramString)) {
      return true;
    }
    LinkedList localLinkedList = new LinkedList();
    paramString = kct.split(paramString.replace('*', ' '));
    int i = 0;
    while (i < paramString.length)
    {
      localLinkedList.add(paramString[i]);
      i += 1;
    }
    Q(localLinkedList);
    mH(1);
    return true;
  }
  
  public final void pk(String paramString)
  {
    if (this.kcE)
    {
      this.kcE = false;
      return;
    }
    if ((this.kcC != null) && (this.kcC.equals(bi.oV(paramString))))
    {
      x.d("MicroMsg.GameSearchUI", "repeat searchChange");
      return;
    }
    this.kcC = paramString;
    if (bi.oW(paramString))
    {
      while (!this.kcD.isEmpty())
      {
        g.Ek();
        g.Eh().dpP.c((l)this.kcD.pop());
      }
      paramString = new as(w.chP(), paramString, f.aTz());
      g.DF().a(paramString, 0);
      this.kcD.add(paramString);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    paramString = kct.split(paramString.replace('*', ' '));
    int i = 0;
    while (i < paramString.length)
    {
      localLinkedList.add(paramString[i]);
      i += 1;
    }
    Q(localLinkedList);
    mH(6);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */