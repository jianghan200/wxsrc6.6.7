package com.tencent.mm.ui.chatting;

import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.q;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.n;
import java.util.Iterator;
import java.util.List;

public final class aa
  implements n
{
  private MMFragmentActivity nfG;
  private e tpn;
  
  public aa(MMFragmentActivity paramMMFragmentActivity, e parame)
  {
    this.tpn = parame;
    this.nfG = paramMMFragmentActivity;
  }
  
  public final void aj(int paramInt, boolean paramBoolean)
  {
    this.tpn.tHA = true;
    Object localObject = this.nfG.getSupportFragmentManager().getFragments();
    label32:
    boolean bool;
    if (localObject == null)
    {
      x.i("MicroMsg.ChattingUIProxy", "fragments is null");
      break label161;
      bool = true;
      label34:
      x.i("MicroMsg.ChattingUIProxy", "[onInit] isPreload：%s ok:%s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
      if (!bool) {
        break label226;
      }
      this.nfG.getSupportFragmentManager().bk().a(paramInt, this.tpn).commitAllowingStateLoss();
      this.nfG.getSupportFragmentManager().executePendingTransactions();
    }
    for (;;)
    {
      if (paramBoolean)
      {
        cpO();
        cpP();
      }
      this.tpn.tHA = false;
      return;
      if (((List)localObject).size() >= 5)
      {
        x.e("MicroMsg.ChattingUIProxy", "fragments more than 5! %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
        localObject = ((List)localObject).iterator();
        label161:
        if (!((Iterator)localObject).hasNext()) {
          break label32;
        }
        if (!((Fragment)((Iterator)localObject).next() instanceof y)) {
          break;
        }
        x.e("MicroMsg.ChattingUIProxy", "fragments more than 5 and find a ChattingUIFragment!!");
        bool = false;
        break label34;
      }
      x.i("MicroMsg.ChattingUIProxy", "fragments size %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      break label32;
      label226:
      this.nfG.getSupportFragmentManager().bk().b(paramInt, this.tpn).commitAllowingStateLoss();
    }
  }
  
  public final void cpM()
  {
    x.i("MicroMsg.ChattingUIProxy", "[onEnterBegin]");
    this.tpn.onActivityCreated(null);
    this.tpn.cpM();
    this.tpn.onStart();
  }
  
  public final void cpN()
  {
    x.i("MicroMsg.ChattingUIProxy", "[onEnterEnd]");
    if (this.tpn.EH(256))
    {
      this.tpn.onResume();
      this.tpn.cpN();
    }
  }
  
  public final void cpO()
  {
    x.i("MicroMsg.ChattingUIProxy", "[onExitBegin]");
    this.tpn.cpO();
  }
  
  public final void cpP()
  {
    x.i("MicroMsg.ChattingUIProxy", "[onExitEnd]");
    this.tpn.onPause();
    this.tpn.onStop();
    this.tpn.onDestroy();
    this.tpn.cpP();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */