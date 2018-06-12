package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.tools.j;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.chatting.b.b.m;
import com.tencent.mm.ui.chatting.b.b.o;
import com.tencent.mm.ui.chatting.b.l;
import com.tencent.mm.ui.t;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.util.TreeSet;

@SuppressLint({"ValidFragment"})
public class y
  extends e
{
  public static String tMb;
  private int jdField_if = 0;
  private MMPullDownView lbd;
  public s tMc;
  ListView tMd;
  public boolean tMe = false;
  private boolean tMf = true;
  protected boolean tMg = true;
  private boolean tMh = false;
  private boolean tMi = false;
  private boolean tMj = false;
  private int tMk = 0;
  private final int tMl = 10;
  private p tipDialog = null;
  
  @SuppressLint({"ValidFragment"})
  public y() {}
  
  @SuppressLint({"ValidFragment"})
  public y(byte paramByte)
  {
    super((byte)0);
  }
  
  private void cud()
  {
    com.tencent.mm.ui.chatting.b.b.w localw = (com.tencent.mm.ui.chatting.b.b.w)this.bAG.O(com.tencent.mm.ui.chatting.b.b.w.class);
    x.i("MicroMsg.ChattingUIFragment", "From Show Search ChatResult %b, From Gloabl Search %b", new Object[] { Boolean.valueOf(localw.cvQ()), Boolean.valueOf(localw.cvS()) });
    localw = (com.tencent.mm.ui.chatting.b.b.w)this.bAG.O(com.tencent.mm.ui.chatting.b.b.w.class);
    if ((!this.tMi) && (!localw.cvQ()) && (!localw.cvS())) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.tMi = true;
        this.tMj = true;
        this.tMh = false;
        this.tMd.getViewTreeObserver().addOnGlobalLayoutListener(new y.11(this));
      }
      return;
    }
  }
  
  private void lU(boolean paramBoolean)
  {
    int j = this.tMd.getLastVisiblePosition();
    int i = this.tMd.getCount() - 1;
    x.i("MicroMsg.ChattingUIFragment", "[scrollToLastImpl] is FirstScroll:%s, last visible:count=[%s:%s] force:%s", new Object[] { Boolean.valueOf(this.tMf), Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(paramBoolean) });
    this.tMf = false;
    if ((j >= i - 1) || (paramBoolean))
    {
      j = this.tMc.getCount();
      if ((j > 1) && (((bd)this.tMc.getItem(j - 2)).isSystem())) {
        j.a(this.tMd, i - 1, 0, false);
      }
    }
    else
    {
      return;
    }
    j.a(this.tMd, i, 0, true);
  }
  
  private void lV(boolean paramBoolean)
  {
    if (this.tMc != null) {
      this.tMc.lS(paramBoolean);
    }
  }
  
  public final void EV(int paramInt)
  {
    x.i("MicroMsg.ChattingUIFragment", "[setSelection] pos:%d isSmooth:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(false) });
    ListView localListView = this.tMd;
    if (localListView != null)
    {
      x.i("MicroMsg.ChattingUI.ScrollController", "setSelection position %s smooth %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(false) });
      localListView.setItemChecked(paramInt, true);
      localListView.setSelection(paramInt);
    }
  }
  
  public final void EW(int paramInt)
  {
    this.tMd.setVisibility(paramInt);
    x.i("MicroMsg.ChattingUIFragment", "[setListViewVisibility] visibility:" + paramInt + " stack:" + bi.cjd().toString());
  }
  
  protected final void W(ab paramab)
  {
    super.W(paramab);
    tMb = paramab.field_username;
  }
  
  @Deprecated
  public final void Y(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
    {
      com.tencent.mm.ui.chatting.c.a.cwt().postDelayed(new y.1(this, paramBoolean1), 10L);
      return;
    }
    lU(paramBoolean1);
  }
  
  public final void avj()
  {
    if (this.tMc == null) {
      return;
    }
    this.tMc.notifyDataSetChanged();
  }
  
  public final void bg(int paramInt)
  {
    this.tMd.post(new y.9(this, paramInt));
  }
  
  public final void c(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    dismissDialog();
    this.tipDialog = com.tencent.mm.ui.base.h.a(paramContext, paramString, true, paramOnCancelListener);
  }
  
  public void cpM()
  {
    super.cpM();
    this.tMc.resume();
    cud();
    lV(true);
  }
  
  public final void cpN()
  {
    super.cpN();
    lV(false);
  }
  
  public final void cpO()
  {
    super.cpO();
    lV(true);
  }
  
  public final void cpP()
  {
    super.cpP();
    dismissDialog();
    if (this.tMc != null)
    {
      this.tMc.ctA();
      x.i("MicroMsg.ChattingUIFragment", "ChattingUI resetAdapter");
    }
  }
  
  public void csH()
  {
    this.tMi = false;
    this.tMj = false;
    this.tMf = true;
    this.tMg = true;
    this.tMe = true;
    x.d("MicroMsg.ChattingUIFragment", "isFromSearch  " + getBooleanExtra("finish_direct", false));
    int i;
    String str;
    Object localObject2;
    int j;
    label130:
    Object localObject1;
    label139:
    Object localObject3;
    if (this.bAG.oLT == null)
    {
      i = 1;
      x.i("MicroMsg.ChattingUIFragment", "[doCreate] rawUserName from :%s to :%s ", new Object[] { this.bAG.getTalkerUserName(), getStringExtra("Chat_User") });
      str = getStringExtra("Chat_User");
      au.HU();
      localObject2 = com.tencent.mm.model.c.FR().Yg(str);
      if (localObject2 != null) {
        break label516;
      }
      j = -1;
      if (localObject2 != null) {
        break label526;
      }
      localObject1 = "null";
      x.w("MicroMsg.ChattingUIFragment", "protectContactNotExist raw:%s contact:%d username:%s", new Object[] { str, Integer.valueOf(j), localObject1 });
      if ((localObject2 != null) && ((int)((com.tencent.mm.l.a)localObject2).dhP != 0) && (!bi.oW(((ai)localObject2).field_username))) {
        break label535;
      }
      localObject2 = new ab();
      ((ab)localObject2).setUsername(str);
      ((ab)localObject2).taj = str;
      ((ab)localObject2).Bc();
      ((ab)localObject2).eI(3);
      au.HU();
      com.tencent.mm.model.c.FR().S((ab)localObject2);
      au.HU();
      localObject3 = com.tencent.mm.model.c.FR().Yg(str);
      localObject1 = localObject3;
      if (localObject3 != null) {
        break label538;
      }
      x.e("MicroMsg.ChattingUIFragment", "protectContactNotExist contact get from db is null!");
      ((ab)localObject2).setUsername(this.bAG.cwp());
      finish();
      label289:
      W((ab)localObject2);
      super.csH();
      if (isSupportNavigationSwipeBack())
      {
        getSwipeBackLayout().setEnableGesture(true);
        getSwipeBackLayout().init();
      }
      if (i != 0) {
        com.tencent.mm.ui.chatting.c.a.cwt().post(new Runnable()
        {
          public final void run()
          {
            ((o)y.this.bAG.O(o.class)).cvo();
            ((o)y.this.bAG.O(o.class)).cvn();
          }
        });
      }
      csJ();
      localObject1 = this.tMc;
      localObject2 = this.bAG.getTalkerUserName();
      localObject3 = this.bAG.cwp();
      ((s)localObject1).tKk = new TreeSet();
      ((s)localObject1).tJM = ((String)localObject2);
      if (!ab.gY((String)localObject2)) {
        break label590;
      }
      ((s)localObject1).dIc = ab.XV((String)localObject3);
      label401:
      ((s)localObject1).tJL = ((com.tencent.mm.ui.chatting.b.b.ag)((s)localObject1).bAG.O(com.tencent.mm.ui.chatting.b.b.ag.class)).cwl();
      localObject3 = new iy();
      ((iy)localObject3).bSB.bSv = 0;
      ((iy)localObject3).bSB.aem = com.tencent.mm.sdk.platformtools.w.chP();
      if (!com.tencent.mm.model.s.fq((String)localObject2)) {
        break label599;
      }
    }
    label516:
    label526:
    label535:
    label538:
    label590:
    label599:
    for (((iy)localObject3).bSB.bSD = true;; ((iy)localObject3).bSB.bSD = false)
    {
      com.tencent.mm.sdk.b.a.sFg.m((b)localObject3);
      ((s)localObject1).talker = ((String)localObject2);
      ((s)localObject1).hpD = ((com.tencent.mm.ui.chatting.b.b.c)((s)localObject1).tJh.O(com.tencent.mm.ui.chatting.b.b.c.class)).cuC();
      ((s)localObject1).ctA();
      return;
      i = 0;
      break;
      j = (int)((com.tencent.mm.l.a)localObject2).dhP;
      break label130;
      localObject1 = ((ai)localObject2).field_username;
      break label139;
      localObject1 = localObject2;
      localObject2 = localObject1;
      if (!ab.gY(str)) {
        break label289;
      }
      x.i("MicroMsg.ChattingUIFragment", "[protectContactNotExist] isBottleContact userName:" + str);
      ((ab)localObject1).taj = str;
      ((ab)localObject1).setUsername(str);
      localObject2 = localObject1;
      break label289;
      ((s)localObject1).dIc = ((String)localObject3);
      break label401;
    }
  }
  
  public void csI()
  {
    super.csI();
    if (getWindow() != null) {
      getWindow().setBackgroundDrawableResource(R.e.room_info_comment_layout_bg);
    }
    boolean bool1;
    boolean bool2;
    if (getContentView() != null)
    {
      bool1 = getContentView().isShown();
      if (getView() == null) {
        break label114;
      }
      bool2 = getView().isShown();
      label51:
      if (this.tMd.getVisibility() != 0) {
        break label119;
      }
    }
    label114:
    label119:
    for (boolean bool3 = true;; bool3 = false)
    {
      if (this.bAG.eaR) {
        break label125;
      }
      x.i("MicroMsg.ChattingUIFragment", "onResume fragment not foreground, return,  chatting contentview is show %b, viewShow %b listviewShow:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label51;
    }
    label125:
    if (!au.HX())
    {
      x.w("MicroMsg.ChattingUIFragment", "account not ready, mabey not call onDestroy!!!");
      finish();
      return;
    }
    x.i("MicroMsg.ChattingUIFragment", "ashutest::onResume %d,  chatting is show %b, viewShow %b listviewShow:%b", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
    long l = System.currentTimeMillis();
    if ((EH(256)) && (!EH(128))) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        this.tMc.resume();
        cud();
      }
      x.v("Test", "KEVIN Chatting OnResume: diff:%d  rawUserName:%s ", new Object[] { Long.valueOf(System.currentTimeMillis() - l), this.bAG.getTalkerUserName() });
      return;
    }
  }
  
  protected void csJ()
  {
    this.tMd = ((ListView)findViewById(R.h.chatting_history_lv));
    this.tMd.setVisibility(0);
    this.jdField_if = 0;
    this.lbd = ((MMPullDownView)findViewById(R.h.chatting_pull_down_view));
    this.lbd.setCanOverScrool(false);
    this.lbd.lJ(false);
    this.lbd.setOnTopLoadDataListener(new y.16(this));
    this.lbd.setOnBottomLoadDataListener(new y.2(this));
    this.lbd.setTopViewVisible(true);
    this.lbd.setAtBottomCallBack(new y.3(this));
    this.lbd.setAtTopCallBack(new y.4(this));
    this.lbd.setOnScrollChangedListener(new y.5(this));
    this.lbd.setIsBottomShowAll(true);
    Object localObject = (com.tencent.mm.ui.chatting.b.b.w)this.bAG.O(com.tencent.mm.ui.chatting.b.b.w.class);
    this.lbd.setBottomViewVisible(((com.tencent.mm.ui.chatting.b.b.w)localObject).cvQ());
    this.lbd.lK(false);
    this.tMd.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      /* Error */
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: aload_0
        //   3: getfield 14	com/tencent/mm/ui/chatting/y$6:tMm	Lcom/tencent/mm/ui/chatting/y;
        //   6: getfield 26	com/tencent/mm/ui/chatting/e:tHz	Lcom/tencent/mm/ui/chatting/b/l;
        //   9: aload_1
        //   10: iload_2
        //   11: iload_3
        //   12: iload 4
        //   14: invokevirtual 30	com/tencent/mm/ui/chatting/b/l:onScroll	(Landroid/widget/AbsListView;III)V
        //   17: aload_0
        //   18: getfield 14	com/tencent/mm/ui/chatting/y$6:tMm	Lcom/tencent/mm/ui/chatting/y;
        //   21: invokestatic 34	com/tencent/mm/ui/chatting/y:i	(Lcom/tencent/mm/ui/chatting/y;)Z
        //   24: ifeq +33 -> 57
        //   27: aload_0
        //   28: getfield 14	com/tencent/mm/ui/chatting/y$6:tMm	Lcom/tencent/mm/ui/chatting/y;
        //   31: invokestatic 38	com/tencent/mm/ui/chatting/y:a	(Lcom/tencent/mm/ui/chatting/y;)Landroid/widget/ListView;
        //   34: invokevirtual 44	android/widget/ListView:getLastVisiblePosition	()I
        //   37: istore_3
        //   38: iload_3
        //   39: iload 4
        //   41: iconst_1
        //   42: isub
        //   43: if_icmpeq +6 -> 49
        //   46: aload_0
        //   47: monitorexit
        //   48: return
        //   49: aload_0
        //   50: getfield 14	com/tencent/mm/ui/chatting/y$6:tMm	Lcom/tencent/mm/ui/chatting/y;
        //   53: invokestatic 47	com/tencent/mm/ui/chatting/y:j	(Lcom/tencent/mm/ui/chatting/y;)Z
        //   56: pop
        //   57: aload_0
        //   58: getfield 14	com/tencent/mm/ui/chatting/y$6:tMm	Lcom/tencent/mm/ui/chatting/y;
        //   61: getfield 51	com/tencent/mm/ui/chatting/e:bAG	Lcom/tencent/mm/ui/chatting/c/a;
        //   64: ldc 53
        //   66: invokevirtual 59	com/tencent/mm/ui/chatting/c/a:O	(Ljava/lang/Class;)Lcom/tencent/mm/ui/chatting/b/u;
        //   69: checkcast 53	com/tencent/mm/ui/chatting/b/b/z
        //   72: iload 4
        //   74: iload_2
        //   75: invokeinterface 63 3 0
        //   80: aload_0
        //   81: getfield 14	com/tencent/mm/ui/chatting/y$6:tMm	Lcom/tencent/mm/ui/chatting/y;
        //   84: getfield 51	com/tencent/mm/ui/chatting/e:bAG	Lcom/tencent/mm/ui/chatting/c/a;
        //   87: ldc 65
        //   89: invokevirtual 59	com/tencent/mm/ui/chatting/c/a:O	(Ljava/lang/Class;)Lcom/tencent/mm/ui/chatting/b/u;
        //   92: checkcast 65	com/tencent/mm/ui/chatting/b/b/p
        //   95: iload 4
        //   97: iload_2
        //   98: invokeinterface 66 3 0
        //   103: goto -57 -> 46
        //   106: astore_1
        //   107: aload_0
        //   108: monitorexit
        //   109: aload_1
        //   110: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	111	0	this	6
        //   0	111	1	paramAnonymousAbsListView	AbsListView
        //   0	111	2	paramAnonymousInt1	int
        //   0	111	3	paramAnonymousInt2	int
        //   0	111	4	paramAnonymousInt3	int
        // Exception table:
        //   from	to	target	type
        //   2	38	106	finally
        //   49	57	106	finally
        //   57	103	106	finally
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        y.this.tHz.onScrollStateChanged(paramAnonymousAbsListView, paramAnonymousInt);
        y.a(y.this, paramAnonymousInt);
        int i;
        if (paramAnonymousInt == 0)
        {
          paramAnonymousAbsListView = y.a(y.this).getChildAt(0);
          i = y.a(y.this).getFirstVisiblePosition();
          if (paramAnonymousAbsListView != null) {
            break label197;
          }
        }
        label197:
        for (paramAnonymousInt = -1;; paramAnonymousInt = paramAnonymousAbsListView.getTop())
        {
          x.i("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] firstPos:%d childTop:%s pullDownView [scrollY:%s top:%s] chatHistoryListTop:%s TranscriptMode:%s OverScrollMode:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousInt), Integer.valueOf(y.f(y.this).getScrollY()), Integer.valueOf(y.f(y.this).getTop()), Integer.valueOf(y.a(y.this).getTop()), Integer.valueOf(y.a(y.this).getTranscriptMode()), Integer.valueOf(y.a(y.this).getOverScrollMode()) });
          if ((y.this.tMd.getFirstVisiblePosition() == 0) && (paramAnonymousAbsListView != null) && (paramAnonymousAbsListView.getTop() >= 0)) {
            y.f(y.this).lJ(true);
          }
          return;
        }
      }
    });
    if (this.tMc == null)
    {
      localObject = this.bAG;
      bd localbd = new bd();
      String str = this.bAG.getTalkerUserName();
      this.bAG.cwp();
      this.tMc = new s((com.tencent.mm.ui.chatting.c.a)localObject, localbd, str);
    }
    this.tMc.lB(true);
    this.tMc.ioW = com.tencent.mm.ui.chatting.c.a.cwt();
    this.tMc.tlG = new y.14(this);
    ((o)this.bAG.O(o.class)).cvm();
    if (this.tMd.getAdapter() == null)
    {
      this.tMd.setAdapter(this.tMc);
      x.i("MicroMsg.ChattingUIFragment", "chatHistoryList.setAdapter");
    }
    if (!((com.tencent.mm.ui.chatting.b.b.w)this.bAG.O(com.tencent.mm.ui.chatting.b.b.w.class)).cvQ())
    {
      this.tMd.setTranscriptMode(1);
      this.tMd.setOverScrollMode(2);
    }
    for (;;)
    {
      this.tMd.setOnTouchListener(new y.15(this));
      registerForContextMenu(this.tMd);
      return;
      this.tMd.setTranscriptMode(0);
    }
  }
  
  public void csK()
  {
    super.csK();
    q.dismiss();
    x.i("MicroMsg.ChattingUIFragment", "on chatting ui pause  rawuser:%s", new Object[] { this.bAG.getTalkerUserName() });
    if (this.bAG.getTalkerUserName() == null) {
      return;
    }
    this.tMc.pause();
    hideVKB();
    x.d("MicroMsg.ChattingUIFragment", "chattingui cancel pause auto download logic");
  }
  
  public final void csT()
  {
    super.csT();
    if (this.bAG.getTalkerUserName() == null) {
      return;
    }
    this.tMc.aYc();
    this.tMc.tlG = null;
  }
  
  public final t csU()
  {
    if (this.bAG.O(o.class) == null) {
      return null;
    }
    return ((o)this.bAG.O(o.class)).csU();
  }
  
  public final boolean csV()
  {
    if (!isScreenEnable())
    {
      x.w("MicroMsg.ChattingUIFragment", "Actionbar customView onclick screen not enable");
      return true;
    }
    y.7 local7 = new y.7(this);
    if (hideVKB())
    {
      ah.i(local7, 300L);
      return true;
    }
    local7.run();
    return true;
  }
  
  public final void ctY()
  {
    x.i("MicroMsg.ChattingUIFragment", "[smoothScrollBy] dis:%d duration:%d", new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
    this.tMd.smoothScrollBy(0, 0);
  }
  
  public final void ctZ()
  {
    this.lbd.setTopViewVisible(true);
  }
  
  public final void cua()
  {
    this.lbd.setIsTopShowAll(false);
  }
  
  public final void cub()
  {
    this.lbd.lJ(false);
  }
  
  public final void cuc()
  {
    this.tMd.setTranscriptMode(0);
  }
  
  public final void cue()
  {
    Object localObject = (com.tencent.mm.ui.chatting.b.b.w)this.bAG.O(com.tencent.mm.ui.chatting.b.b.w.class);
    if ((!((com.tencent.mm.ui.chatting.b.b.w)localObject).cvQ()) && (!((com.tencent.mm.ui.chatting.b.b.w)localObject).cvS()))
    {
      int i = this.tMk;
      this.tMk = (i + 1);
      if ((i < 10) && (((thisActivity() instanceof ChattingUI)) || ((thisActivity() instanceof AppBrandServiceChattingUI))))
      {
        localObject = this.tMd;
        y.12 local12 = new y.12(this);
        if (this.tMk == 1) {}
        for (i = 10;; i = 100)
        {
          ((ListView)localObject).postDelayed(local12, i);
          return;
        }
      }
    }
    x.d("MicroMsg.ChattingUIFragment", "scrollToLastProtect:%s, %s ,%s", new Object[] { Boolean.valueOf(((com.tencent.mm.ui.chatting.b.b.w)localObject).cvQ()), Boolean.valueOf(((com.tencent.mm.ui.chatting.b.b.w)localObject).cvS()), Integer.valueOf(this.tMk) });
  }
  
  protected final void cuf()
  {
    boolean bool;
    if (this.bAG == null)
    {
      bool = true;
      x.i("MicroMsg.ChattingUIFragment", "[goBackImpl] context is null? %b", new Object[] { Boolean.valueOf(bool) });
      localObject = (com.tencent.mm.ui.chatting.b.b.h)this.bAG.O(com.tencent.mm.ui.chatting.b.b.h.class);
      com.tencent.mm.ui.chatting.b.b.w localw = (com.tencent.mm.ui.chatting.b.b.w)this.bAG.O(com.tencent.mm.ui.chatting.b.b.w.class);
      if (((com.tencent.mm.ui.chatting.b.b.h)localObject).cuS())
      {
        if (!localw.cvO()) {
          break label152;
        }
        localw.cvN();
        ((com.tencent.mm.ui.chatting.b.b.h)localObject).cuT();
      }
      label85:
      localObject = (com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class);
      if (!ab.XO(this.bAG.getTalkerUserName())) {
        break label161;
      }
      localObject = new Intent();
      ((Intent)localObject).addFlags(67108864);
      com.tencent.mm.bg.d.b(getContext(), "tmessage", ".ui.TConversationUI", (Intent)localObject);
    }
    label152:
    label161:
    label323:
    do
    {
      for (;;)
      {
        finish();
        return;
        bool = false;
        break;
        ((com.tencent.mm.ui.chatting.b.b.h)localObject).cuQ();
        break label85;
        if (getIntExtra("chat_from_scene", 0) == 4)
        {
          finish();
          return;
        }
        if (((getIntExtra("chat_from_scene", 0) == 1) || (getIntExtra("chat_from_scene", 0) == 3)) && (this.bAG.oLT != null) && (this.bAG.oLT.ckW()) && (((com.tencent.mm.ui.chatting.b.b.c)localObject).cuo() != null) && (((com.tencent.mm.ui.chatting.b.b.c)localObject).cuo().LZ()) && (((com.tencent.mm.ui.chatting.b.b.c)localObject).cuo().bG(false) != null) && (((com.tencent.mm.ui.chatting.b.b.c)localObject).cuo().bG(false).MB() != null) && (!bi.oW(((com.tencent.mm.ui.chatting.b.b.c)localObject).cuo().Mg())))
        {
          finish();
          return;
        }
        if (!((com.tencent.mm.ui.chatting.b.b.q)this.bAG.O(com.tencent.mm.ui.chatting.b.b.q.class)).cvD()) {
          break label323;
        }
        finish();
      }
    } while (getBooleanExtra("finish_direct", false).booleanValue());
    if (!this.isCurrentActivity)
    {
      finish();
      return;
    }
    Object localObject = new Intent(getContext(), LauncherUI.class);
    ((Intent)localObject).addFlags(67108864);
    startActivity((Intent)localObject);
    overridePendingTransition(MMFragmentActivity.a.tnE, MMFragmentActivity.a.tnF);
    finish();
  }
  
  protected void dealContentView(View paramView)
  {
    super.dealContentView(paramView);
    ((o)this.bAG.O(o.class)).dt(paramView);
  }
  
  public final void dismissDialog()
  {
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
  }
  
  public final void eX(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.ChattingUIFragment", "[setSelectionFromTop] pos:%d offset:%s isSmooth:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(false) });
    j.a(this.tMd, paramInt1, paramInt2, false);
  }
  
  public void finish()
  {
    int i = 100;
    if (!hideVKB()) {
      i = 0;
    }
    ah.i(new y.8(this), i);
  }
  
  public final void gK(Context paramContext)
  {
    super.gK(paramContext);
    x.i("MicroMsg.ChattingUIFragment", "[doAttach]:%s#0x%x task:%s hc:%d", new Object[] { thisActivity().getClass().getSimpleName(), Integer.valueOf(thisActivity().hashCode()), bi.fV(thisActivity()), Integer.valueOf(hashCode()) });
    if (this.mController != null) {
      this.mController.ak(3, true);
    }
  }
  
  public final int getBottomHeight()
  {
    return this.lbd.getBottomHeight();
  }
  
  public final int getFirstVisiblePosition()
  {
    return this.tMd.getFirstVisiblePosition();
  }
  
  protected int getLayoutId()
  {
    return R.i.chatting;
  }
  
  public final ListView getListView()
  {
    return this.tMd;
  }
  
  public final int getTopHeight()
  {
    return this.lbd.getTopHeight();
  }
  
  public boolean getUserVisibleHint()
  {
    return this.bAG.eaR;
  }
  
  public boolean hideVKB()
  {
    ChatFooter localChatFooter = ((m)this.bAG.O(m.class)).cvb();
    if (localChatFooter != null) {
      return bi.hideVKB(localChatFooter);
    }
    return super.hideVKB();
  }
  
  public boolean isSupportCustomActionBar()
  {
    return isSupportNavigationSwipeBack();
  }
  
  public final void lK(boolean paramBoolean)
  {
    this.lbd.lK(paramBoolean);
  }
  
  public final void lT(boolean paramBoolean)
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {}
    for (boolean bool = true;; bool = false)
    {
      Y(paramBoolean, bool);
      return;
    }
  }
  
  public void onCancelDrag()
  {
    if ((isSupportNavigationSwipeBack()) && (this.tMc != null))
    {
      this.tMc.lS(false);
      this.tMg = true;
    }
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    if (!this.bAG.eaR) {
      return;
    }
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
  }
  
  public void onDragBegin()
  {
    if ((isSupportNavigationSwipeBack()) && (this.tMc != null))
    {
      this.tMc.lS(true);
      this.tMg = false;
    }
  }
  
  public void onKeyboardStateChanged()
  {
    if (keyboardState() == 1) {
      this.tMd.post(new y.13(this));
    }
  }
  
  public void onSwipeBack()
  {
    cuf();
    if (isSupportNavigationSwipeBack())
    {
      getSwipeBackLayout().setEnableGesture(false);
      if (this.tMc != null) {
        this.tMc.lS(false);
      }
    }
  }
  
  public void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    ((o)this.bAG.O(o.class)).setBackBtn(paramOnMenuItemClickListener);
  }
  
  public final void setBottomViewVisible(boolean paramBoolean)
  {
    this.lbd.setBottomViewVisible(paramBoolean);
  }
  
  public final void setIsBottomShowAll(boolean paramBoolean)
  {
    this.lbd.setIsBottomShowAll(paramBoolean);
  }
  
  public final void setKeepScreenOn(boolean paramBoolean)
  {
    this.tMd.setKeepScreenOn(paramBoolean);
  }
  
  public void setMMSubTitle(int paramInt)
  {
    setMMSubTitle(getMMString(paramInt));
  }
  
  public void setMMSubTitle(String paramString)
  {
    ((o)this.bAG.O(o.class)).setMMSubTitle(paramString);
  }
  
  public void setMMTitle(int paramInt)
  {
    setMMTitle(getMMString(paramInt));
  }
  
  public void setMMTitle(String paramString)
  {
    ((o)this.bAG.O(o.class)).setMMTitle(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/chatting/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */