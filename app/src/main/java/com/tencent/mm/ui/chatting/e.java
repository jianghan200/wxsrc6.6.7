package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import com.tencent.mm.bg.d.a;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.kernel.d;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.chatting.b.b.j;
import com.tencent.mm.ui.chatting.b.g.a;
import com.tencent.mm.ui.chatting.b.l;
import com.tencent.mm.ui.chatting.b.v;
import com.tencent.mm.ui.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public abstract class e
  extends com.tencent.mm.ui.x
  implements af, ag
{
  public com.tencent.mm.ui.chatting.c.a bAG = new com.tencent.mm.ui.chatting.c.a(this, this, this);
  public boolean tHA = false;
  private int tHB = 0;
  int tHC;
  int tHD;
  protected String tHw;
  protected String tHx;
  private com.tencent.mm.ui.chatting.b.h tHy = new com.tencent.mm.ui.chatting.b.h();
  l tHz = new l();
  
  public e()
  {
    csS();
  }
  
  public e(byte paramByte)
  {
    super(true);
    csS();
  }
  
  private void EI(int paramInt)
  {
    this.tHB &= (paramInt ^ 0xFFFFFFFF);
  }
  
  private void csS()
  {
    Bundle localBundle = new Bundle();
    if (!localBundle.containsKey(getClass().getName())) {
      localBundle.putInt(getClass().getName(), Integer.MAX_VALUE);
    }
    setArguments(localBundle);
  }
  
  private void d(int paramInt, Runnable paramRunnable)
  {
    boolean bool1;
    boolean bool2;
    if ((4 == paramInt) && (EH(2)))
    {
      bool1 = false;
      bool2 = EH(paramInt);
      if ((!bool2) || (!bool1)) {
        break label303;
      }
      this.tHB |= paramInt;
      if (2 != paramInt) {
        break label163;
      }
      EI(64);
    }
    for (;;)
    {
      paramRunnable.run();
      return;
      if ((8 == paramInt) && (EH(4)))
      {
        bool1 = false;
        break;
      }
      if ((16 == paramInt) && (EH(8)))
      {
        bool1 = false;
        break;
      }
      if ((32 == paramInt) && (EH(4)))
      {
        bool1 = false;
        break;
      }
      if ((64 == paramInt) && (EH(2)))
      {
        bool1 = false;
        break;
      }
      if ((512 == paramInt) && (EH(256)))
      {
        bool1 = false;
        break;
      }
      bool1 = true;
      break;
      label163:
      if (64 == paramInt) {
        EI(2);
      } else if (4 == paramInt) {
        EI(32);
      } else if (32 == paramInt) {
        EI(4);
      } else if (8 == paramInt) {
        EI(16);
      } else if (16 == paramInt) {
        EI(8);
      } else if (128 == paramInt) {
        EI(256);
      } else if (256 == paramInt) {
        EI(128);
      } else if (512 == paramInt) {
        EI(1024);
      } else if (1024 == paramInt) {
        EI(512);
      }
    }
    label303:
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseChattingUIFragment", "catch! [check] %s flag:%x isNever:%s isStrict:%s", new Object[] { this.tHx, Integer.valueOf(paramInt), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
  }
  
  public final boolean EH(int paramInt)
  {
    return (this.tHB & paramInt) == 0;
  }
  
  protected void W(ab paramab)
  {
    this.tHx = String.format(this.tHw, new Object[] { paramab.field_username });
    this.bAG.oLT = paramab;
  }
  
  public final void addHeaderView(View paramView)
  {
    getListView().addHeaderView(paramView);
  }
  
  public void bw()
  {
    d(64, new e.7(this));
  }
  
  public void cpM()
  {
    d(128, new Runnable()
    {
      public final void run()
      {
        int i = 0;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BaseChattingUIFragment", "[onEnterBegin] activity:%s isPreLoaded:%b", new Object[] { e.this.tHx, Boolean.valueOf(e.this.tHA) });
        e locale = e.this;
        boolean bool = HardCoderJNI.hcEnterChattingEnable;
        int j = HardCoderJNI.hcEnterChattingDelay;
        int k = HardCoderJNI.hcEnterChattingCPU;
        int m = HardCoderJNI.hcEnterChattingIO;
        if (HardCoderJNI.hcEnterChattingThr) {
          i = com.tencent.mm.kernel.g.Em().cij();
        }
        locale.tHC = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcEnterChattingTimeout, 301, HardCoderJNI.hcEnterChattingAction, "ChattingUIFragment");
        e.this.bAG.eaR = true;
        e.a(e.this).cpG();
      }
    });
  }
  
  public void cpN()
  {
    d(256, new e.9(this));
  }
  
  public void cpO()
  {
    d(512, new e.10(this));
  }
  
  public void cpP()
  {
    d(1024, new e.2(this));
  }
  
  public void csH()
  {
    d(2, new e.1(this));
  }
  
  public void csI()
  {
    d(8, new e.4(this));
  }
  
  public void csK()
  {
    d(16, new e.5(this));
  }
  
  public void csT()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BaseChattingUIFragment", "[doDetach] activity:%s isPreLoaded:%b", new Object[] { this.tHx, Boolean.valueOf(this.tHA) });
    Iterator localIterator = this.bAG.tTn.tXO.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((localEntry.getValue() instanceof v)) {
        ((v)localEntry.getValue()).cun();
      }
    }
  }
  
  public abstract t csU();
  
  public abstract boolean csV();
  
  protected void gK(Context paramContext)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BaseChattingUIFragment", "[doAttach] activity:%s isPreLoaded:%b", new Object[] { this.tHx, Boolean.valueOf(this.tHA) });
  }
  
  public final View getChildAt(int paramInt)
  {
    return getListView().getChildAt(paramInt);
  }
  
  public int getFirstVisiblePosition()
  {
    return getListView().getFirstVisiblePosition();
  }
  
  public final int getHeaderViewsCount()
  {
    return getListView().getHeaderViewsCount();
  }
  
  public String getIdentityString()
  {
    ab localab = this.bAG.oLT;
    if ((localab == null) || ((int)localab.dhP == 0) || (bi.oW(localab.field_username))) {
      return "";
    }
    if (com.tencent.mm.kernel.g.Eg().Dx())
    {
      if (com.tencent.mm.ac.f.eZ(localab.field_username)) {
        return "_EnterpriseChat";
      }
      if (com.tencent.mm.ac.f.kM(localab.field_username)) {
        return "_EnterpriseFatherBiz";
      }
      if (com.tencent.mm.ac.f.kL(localab.field_username)) {
        return "_EnterpriseChildBiz";
      }
    }
    if (localab.ckW()) {
      return "_bizContact";
    }
    if (s.fq(localab.field_username)) {
      return "_chatroom";
    }
    if (s.gY(localab.field_username)) {
      return "_bottle";
    }
    if (s.gZ(localab.field_username)) {
      return "_QQ";
    }
    return "";
  }
  
  public final int getLastVisiblePosition()
  {
    return getListView().getLastVisiblePosition();
  }
  
  public abstract ListView getListView();
  
  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    csH();
    if ((this.isCurrentActivity) || (this.tHA)) {
      cpM();
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent == null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BaseChattingUIFragment", "onActivityResult return, requestCode:%d resultCode:%s data is null? %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if (this.bAG.eaR) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseChattingUIFragment", "[onActivityResult] not foreground, return, requestCode:%d", new Object[] { Integer.valueOf(paramInt1) });
      return;
    }
    Object localObject = this.bAG.tTo.cxF();
    if (localObject != null)
    {
      localObject = com.tencent.mm.ui.chatting.e.b.b((Fragment)localObject, paramInt1);
      if (localObject != null) {
        ((d.a)localObject).onActivityResult(paramInt1, paramInt2, paramIntent);
      }
    }
    this.tHz.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public final void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    this.tHw = (getActivity().getClass().getName() + "@" + hashCode() + " @talker:%s");
    gK(paramContext);
    this.bAG.a(com.tencent.mm.ui.chatting.b.b.f.class, this.tHy);
    this.bAG.a(j.class, this.tHz);
    paramContext = com.tencent.mm.ui.chatting.b.g.cuN().iterator();
    while (paramContext.hasNext())
    {
      g.a locala = (g.a)paramContext.next();
      this.bAG.a(locala.Yw, locala.cuO());
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.bAG.eaR) {
      this.tHz.onConfigurationChanged(paramConfiguration);
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramBundle = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    paramViewGroup = paramBundle.getLayoutParams();
    paramLayoutInflater = paramViewGroup;
    if (paramViewGroup == null) {
      paramLayoutInflater = new ViewGroup.LayoutParams(-1, -1);
    }
    paramBundle.setLayoutParams(paramLayoutInflater);
    return paramBundle;
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseChattingUIFragment.Sys", "[onDestroy] activity:%s isForeground:%s isFinishing:%s", new Object[] { this.tHx, Boolean.valueOf(this.bAG.eaR), Boolean.valueOf(isFinishing()) });
    bw();
    cpO();
    cpP();
  }
  
  public final void onDetach()
  {
    super.onDetach();
    csT();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return this.tHz.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final void onPause()
  {
    int i = 1;
    super.onPause();
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseChattingUIFragment.Sys", "[onPause] activity:%s isForeground:%s isFinishing:%s", new Object[] { this.tHx, Boolean.valueOf(this.bAG.eaR), Boolean.valueOf(isFinishing()) });
    if ((this.bAG.eaR) || (isFinishing())) {
      if ((EH(8)) && (!isFinishing())) {
        if ((!EH(1024)) || (EH(512))) {
          break label127;
        }
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseChattingUIFragment", "[onPause] is never doResume before doPause! Because while entering ChattingUI, the app back to background.");
        csI();
        cpN();
      }
      csK();
      return;
      label127:
      i = 0;
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    this.tHz.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public final void onResume()
  {
    super.onResume();
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseChattingUIFragment.Sys", "[onResume] activity:%s isForeground:%s isFinishing:%s", new Object[] { this.tHx, Boolean.valueOf(this.bAG.eaR), Boolean.valueOf(isFinishing()) });
    if (this.bAG.eaR)
    {
      csI();
      if ((this.isCurrentActivity) || (this.tHA)) {
        cpN();
      }
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStart] activity:%s isForeground:%s isFinishing:%s", new Object[] { this.tHx, Boolean.valueOf(this.bAG.eaR), Boolean.valueOf(isFinishing()) });
    if (this.bAG.eaR) {
      d(4, new e.3(this));
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStop] activity:%s isForeground:%s isFinishing:%s", new Object[] { this.tHx, Boolean.valueOf(this.bAG.eaR), Boolean.valueOf(isFinishing()) });
    if ((this.bAG.eaR) || (isFinishing()))
    {
      if (EH(16))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStop] activity:%s is never pause when stop coming!", new Object[] { this.tHx });
        csK();
      }
      d(32, new e.6(this));
    }
  }
  
  public boolean supportNavigationSwipeBack()
  {
    if (this.isCurrentActivity) {
      return false;
    }
    com.tencent.mm.kernel.g.Ek();
    if (com.tencent.mm.compatible.f.b.bt(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).dsQ))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseChattingUIFragment", "Running on a Chromebook, so we not support swipeback and so on");
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */