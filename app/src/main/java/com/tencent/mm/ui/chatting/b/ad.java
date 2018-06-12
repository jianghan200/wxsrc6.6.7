package com.tencent.mm.ui.chatting.b;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.b.b.g;
import com.tencent.mm.ui.chatting.b.b.w;
import com.tencent.mm.ui.chatting.e;
import com.tencent.mm.ui.chatting.v;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.tools.o.b;
import java.util.ArrayList;

@com.tencent.mm.ui.chatting.b.a.a(cwo=w.class)
public class ad
  extends a
  implements w
{
  private o eMS = null;
  private v tRA;
  public boolean tRB = false;
  private boolean tRC = true;
  private int tRD = 0;
  public boolean tRE = false;
  private boolean tRF = false;
  private View tRp;
  public boolean tRq = false;
  public boolean tRr = false;
  public boolean tRs = false;
  public boolean tRt = false;
  private long tRu = -1L;
  private ArrayList<String> tRv;
  public boolean tRw = false;
  private TextView tRx;
  private ListView tRy;
  private View tRz;
  
  public final void Fd(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.SearchComponent", "search result count %d, in edit mode %B, can report %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.tRB), Boolean.valueOf(this.tRC) });
    if ((!this.tRq) && (!this.tRB))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.SearchComponent", "not search now");
      return;
    }
    if ((this.tRC) && (paramInt >= 0))
    {
      this.tRC = false;
      com.tencent.mm.plugin.report.service.h.mEJ.h(10811, new Object[] { Integer.valueOf(2) });
    }
    if (paramInt > 0)
    {
      this.tRy.setVisibility(0);
      this.bAG.EW(8);
      this.tRx.setVisibility(8);
      this.tRz.setVisibility(8);
      return;
    }
    if (paramInt == 0)
    {
      this.tRy.setVisibility(8);
      this.bAG.EW(8);
      this.tRx.setVisibility(0);
      this.tRz.setVisibility(8);
      return;
    }
    this.tRy.setVisibility(8);
    this.bAG.EW(0);
    this.tRx.setVisibility(8);
    this.tRz.setVisibility(0);
  }
  
  public final void cpF()
  {
    this.tRE = this.bAG.tTq.getBooleanExtra("need_hight_item", false).booleanValue();
    this.tRq = this.bAG.tTq.getBooleanExtra("search_chat_content", false).booleanValue();
    this.tRr = this.bAG.tTq.getBooleanExtra("show_search_chat_content_result", false).booleanValue();
    this.tRv = this.bAG.tTq.getStringArrayList("highlight_keyword_list");
    this.tRu = this.bAG.tTq.getLongExtra("msg_local_id", -1L);
    this.tRt = this.bAG.tTq.getBooleanExtra("from_global_search", false).booleanValue();
    this.tRs = this.bAG.tTq.getBooleanExtra("img_gallery_enter_from_chatting_ui", false).booleanValue();
  }
  
  public final void cpG()
  {
    if ((this.tRu >= 0L) && (!this.tRF)) {
      ah.i(new ad.1(this), 2000L);
    }
    if (this.tRq)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(219L, 11L, 1L, true);
      i.a(this.bAG.tTq, R.h.search_chat_content_ly);
      this.tRp = this.bAG.findViewById(R.h.search_content);
      this.tRz = this.bAG.findViewById(R.h.search_chat_content_bg);
      this.bAG.getListView().setFocusable(false);
      this.bAG.getListView().setFocusableInTouchMode(false);
      this.tRz.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView) {}
      });
      if (this.tRx == null)
      {
        i.a(this.bAG.tTq, R.h.viewstub_empty_search);
        this.tRx = ((TextView)this.bAG.findViewById(R.h.empty_search_result_tv));
      }
      if ((!s.fq(this.bAG.getTalkerUserName())) && (!((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cus())) {
        break label460;
      }
    }
    final long l;
    int i;
    label460:
    for (boolean bool = true;; bool = false)
    {
      this.tRA = new v(this.bAG.tTq.getContext(), new bd(), this.bAG.getTalkerUserName(), this.bAG.cwp(), bool);
      this.tRA.tLf = new ad.7(this);
      this.tRy = ((ListView)this.bAG.findViewById(R.h.search_chat_content_lv));
      this.tRy.setAdapter(this.tRA);
      this.tRy.setOnItemClickListener(new ad.8(this));
      this.tRy.setOnTouchListener(new ad.9(this));
      this.eMS = new o();
      this.eMS.uBw = new o.b()
      {
        private int tRI = 0;
        
        public final void WW()
        {
          new ag().post(new ad.10.1(this));
        }
        
        public final void WX() {}
        
        public final void WY() {}
        
        public final void WZ() {}
        
        public final boolean pj(String paramAnonymousString)
        {
          return false;
        }
        
        public final void pk(String paramAnonymousString)
        {
          if (bi.oW(paramAnonymousString))
          {
            this.tRI = 0;
            ad.this.Fd(-1);
            return;
          }
          if (paramAnonymousString.length() > this.tRI) {
            com.tencent.mm.plugin.report.service.h.mEJ.h(10451, new Object[] { Integer.valueOf(1) });
          }
          this.tRI = paramAnonymousString.length();
          com.tencent.mm.plugin.report.service.h.mEJ.h(10456, new Object[] { Integer.valueOf(1) });
          ad.d(ad.this).pi(paramAnonymousString);
        }
      };
      this.bAG.tTq.addSearchMenu(true, this.eMS);
      this.eMS.mv(true);
      if ((this.tRr) || (this.tRt))
      {
        l = this.bAG.tTq.getLongExtra("msg_local_id", -1L);
        i = ((g)this.bAG.O(g.class)).t(l, this.tRt);
        Window localWindow = this.bAG.tTq.getWindow();
        if (localWindow == null) {
          break;
        }
        localWindow.getDecorView().post(new ad.11(this, l, i));
      }
      return;
    }
    this.bAG.getListView().postDelayed(new Runnable()
    {
      public final void run()
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.SearchComponent", "if (isShowSearchChatResult || isFromGlobalSearch) on set position %d, set selection %d", new Object[] { Long.valueOf(l), Integer.valueOf(this.gIO) });
        ad.this.bAG.EV(this.gIO);
        if ((ad.this.tRE) && (!ad.this.tRt))
        {
          ad.a(ad.this, this.gIO, l);
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sSm, Boolean.valueOf(false));
        }
      }
    }, 100L);
  }
  
  public final void cpJ()
  {
    if (this.tRB)
    {
      cvN();
      ((com.tencent.mm.ui.chatting.b.b.h)this.bAG.O(com.tencent.mm.ui.chatting.b.b.h.class)).cuT();
    }
  }
  
  public final void cun()
  {
    super.cun();
    this.tRF = true;
    if (this.tRA != null) {
      this.tRA.aYc();
    }
    if (this.eMS != null) {
      this.eMS.clearFocus();
    }
  }
  
  public final ArrayList<String> cvK()
  {
    return this.tRv;
  }
  
  public final boolean cvL()
  {
    return this.tRs;
  }
  
  public final void cvM()
  {
    if (this.tRp == null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.ChattingUI.SearchComponent", "enter edit search mode, search stub view is null?%B", new Object[] { Boolean.valueOf(bool) });
      this.tRB = true;
      this.bAG.EW(8);
      if (this.tRp == null) {
        break;
      }
      this.tRp.setVisibility(0);
      if (this.tRA != null) {
        this.tRA.talker = this.bAG.getTalkerUserName();
      }
      Fd(-1);
      return;
    }
    i.a(this.bAG.tTq, R.h.search_chat_content_ly);
    this.tRp = this.bAG.findViewById(R.h.search_content);
    this.tRp.setVisibility(0);
    this.tRz = this.bAG.findViewById(R.h.search_chat_content_bg);
    this.bAG.getListView().setFocusable(false);
    this.bAG.getListView().setFocusableInTouchMode(false);
    this.tRz.setOnClickListener(new ad.2(this));
    this.tRz.setVisibility(8);
    this.tRx = ((TextView)this.bAG.findViewById(R.h.empty_search_result_tv));
    if ((s.fq(this.bAG.getTalkerUserName())) || (((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cus())) {}
    for (bool = true;; bool = false)
    {
      this.tRA = new v(this.bAG.tTq.getContext(), new bd(), this.bAG.getTalkerUserName(), this.bAG.cwp(), bool);
      this.tRA.tLf = new ad.3(this);
      this.tRy = ((ListView)this.bAG.findViewById(R.h.search_chat_content_lv));
      this.tRy.setVisibility(0);
      this.tRy.setAdapter(this.tRA);
      this.tRy.setOnItemClickListener(new ad.4(this));
      this.tRy.setOnTouchListener(new ad.5(this));
      break;
    }
  }
  
  public final void cvN()
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.ChattingUI.SearchComponent", "exit edit search mode");
    this.tRB = false;
    this.tRC = true;
    if (this.tRx != null) {
      this.tRx.setVisibility(8);
    }
    if (this.tRz != null) {
      this.tRz.setVisibility(8);
    }
    if (this.tRy != null) {
      this.tRy.setVisibility(8);
    }
    this.bAG.EW(0);
    this.bAG.YC();
  }
  
  public final boolean cvO()
  {
    return this.tRB;
  }
  
  public final v cvP()
  {
    return this.tRA;
  }
  
  public final boolean cvQ()
  {
    return this.tRr;
  }
  
  public final boolean cvR()
  {
    return this.tRq;
  }
  
  public final boolean cvS()
  {
    return this.tRt;
  }
  
  public final boolean cvT()
  {
    return this.tRw;
  }
  
  public final boolean gA(long paramLong)
  {
    return (this.tRu == paramLong) && (this.tRt) && (this.tRv != null) && (this.tRv.size() > 0);
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((((g)this.bAG.O(g.class)).isInEditMode()) && (this.tRB)) {
      cvN();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/b/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */