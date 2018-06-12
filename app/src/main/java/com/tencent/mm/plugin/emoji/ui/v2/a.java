package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.a.a.f.a;
import com.tencent.mm.plugin.emoji.e.m;
import com.tencent.mm.plugin.emoji.f.g;
import com.tencent.mm.plugin.emoji.model.h.b;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader;
import com.tencent.mm.protocal.c.adh;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.y;
import com.tencent.mm.w.a.e;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class a
  extends com.tencent.mm.ui.x
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, e, com.tencent.mm.plugin.emoji.a.h.a, com.tencent.mm.plugin.emoji.model.h.a, h.b, com.tencent.mm.pluginsdk.model.h.a, j.a, MMPullDownView.c, MMPullDownView.d, MMPullDownView.e
{
  ListView CU;
  private ProgressDialog eEX;
  private View gQd;
  com.tencent.mm.plugin.emoji.a.a.a ihz;
  private com.tencent.mm.sdk.b.c ikA = new a.2(this);
  private g ikB;
  private boolean ikC = false;
  private LinkedList<th> ikD = new LinkedList();
  private LinkedList<tj> ikE = new LinkedList();
  EmojiStoreVpHeader ikc;
  private MMPullDownView ikf;
  private TextView ikg;
  private int iki = -1;
  private boolean ikj;
  private View ikk;
  private byte[] ikl;
  private final int ikp = 131074;
  private final int ikq = 131075;
  private final int ikr = 131076;
  private final String iks = "product_id";
  private final String ikt = "progress";
  private final String iku = "status";
  private com.tencent.mm.plugin.emoji.f.n ikv;
  private int ikw;
  private com.tencent.mm.plugin.emoji.model.f ikx;
  private com.tencent.mm.plugin.emoji.model.h iky;
  private final int ioR = 131077;
  public EmojiStoreV2HotBarView ioS;
  private boolean ioT = false;
  private boolean ioU = false;
  private boolean ioV = false;
  private ag ioW = new a.1(this);
  private MenuItem.OnMenuItemClickListener ioX = new MenuItem.OnMenuItemClickListener()
  {
    public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
    {
      a.this.thisActivity().finish();
      return false;
    }
  };
  private ActionBar mActionBar;
  private com.tencent.mm.ui.b mActionBarHelper;
  
  private void a(int paramInt, com.tencent.mm.plugin.emoji.model.f paramf)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "");
    int i;
    switch (paramInt)
    {
    default: 
      paramInt = 0;
      i = 0;
      if (this.ikx != null) {
        this.ikx.aEr();
      }
      if ((this.ikx != null) && (i != 0)) {
        if (paramInt != 0)
        {
          if (this.ikx != null) {
            break label189;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "update store ui header failed. ");
        }
      }
      break;
    }
    for (;;)
    {
      if (this.ihz != null) {
        this.ihz.b(this.ikx);
      }
      return;
      this.ikx = paramf;
      paramInt = 1;
      i = 1;
      break;
      this.ikx = paramf;
      paramInt = 0;
      i = 1;
      break;
      this.ikx = paramf;
      paramInt = 0;
      i = 0;
      break;
      if (this.ikx == null) {
        this.ikx = new com.tencent.mm.plugin.emoji.model.f();
      }
      this.ikx.oL(paramf.ihp);
      this.ikx.aN(paramf.ihq);
      paramInt = 0;
      i = 1;
      break;
      label189:
      this.ikD = ((LinkedList)this.ikx.ihs);
      this.ikE = ((LinkedList)this.ikx.iht);
      if (this.ikD != null)
      {
        this.ikc.c(this.ikD, this.ikE);
      }
      else if (this.ikx.ihr != null)
      {
        this.ikD = new LinkedList();
        this.ikD.add(this.ikx.ihr);
        this.ikc.c(this.ikD, this.ikE);
      }
    }
  }
  
  private void a(com.tencent.mm.plugin.emoji.a.a.f paramf, int paramInt)
  {
    if (paramf == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "item is null.");
      return;
    }
    if (paramf.iey == f.a.ieH)
    {
      paramf = paramf.ieA;
      if (paramf == null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "banner set is null. do nothing");
        return;
      }
      m.a(getContext(), paramf, false);
      return;
    }
    ts localts = paramf.iez;
    if (localts == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "summary is null. do nothing");
      return;
    }
    if (aGk()) {
      if ((paramInt >= 0) && (paramInt < this.ihz.aDz())) {
        paramInt = 3;
      }
    }
    for (;;)
    {
      String str = thisActivity().getIntent().getStringExtra("to_talker_name");
      m.a(getContext(), localts, paramInt, paramf.mStatus, paramf.pF, str, 5);
      return;
      if ((paramInt >= this.ihz.aDz()) && (paramInt < this.ihz.aDA() + this.ihz.aDz()))
      {
        paramInt = 19;
      }
      else
      {
        paramInt = 1;
        continue;
        paramInt = 2;
      }
    }
  }
  
  private void aFl()
  {
    com.tencent.mm.plugin.emoji.a.a.b.a(this.ihz.ien, this);
  }
  
  protected static void aFp() {}
  
  private void aGh()
  {
    int j = 0;
    this.ioU = true;
    this.iky = new com.tencent.mm.plugin.emoji.model.h();
    this.iky.gKE = thisActivity();
    this.iky.ihB = this;
    this.iky.ihz = this.ihz;
    adh localadh;
    int k;
    int i;
    if (aGk())
    {
      this.iky.ihC = 1;
      this.iky.ihF = this;
      this.ikw = thisActivity().getIntent().getIntExtra("preceding_scence", 5);
      localadh = i.aEA().igA.Dw(aFm());
      com.tencent.mm.plugin.emoji.model.f localf = com.tencent.mm.plugin.emoji.f.n.a(localadh);
      k = aFm();
      if (localadh != null) {
        break label339;
      }
      i = 0;
      label123:
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "load cache type: %d, size: %d ", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
      i = j;
      if (localf != null)
      {
        i = j;
        if (localf.ihq.size() > 0)
        {
          this.ikC = true;
          this.gQd.setVisibility(8);
          this.ikf.setVisibility(0);
          a(this.iki, localf);
          if (localadh == null) {
            break label366;
          }
          if (localadh.rHN != null) {
            break label348;
          }
          i = 0;
          label218:
          k = localadh.rHK;
          j = localadh.rHL;
        }
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "load cache hotcount:%d type:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(aFm()) });
      if ((this.ihz != null) && (aGk()))
      {
        this.ihz.oD(i + k);
        this.ihz.oE(j);
      }
      aFl();
      i = 1;
      if ((i != 0) && (this.ioW != null))
      {
        this.ioW.postDelayed(new Runnable()
        {
          public final void run()
          {
            a.this.ep(false);
          }
        }, 3000L);
        return;
        this.iky.ihC = 2;
        break;
        label339:
        i = localadh.rHB;
        break label123;
        label348:
        i = localadh.rHN.size();
        break label218;
      }
      ep(true);
      return;
      label366:
      j = 0;
      k = 0;
      i = 0;
    }
  }
  
  private void aGi()
  {
    au.DF().a(this.ikv, 0);
  }
  
  private static boolean aGj()
  {
    au.HU();
    ((Long)com.tencent.mm.model.c.DT().get(aa.a.sOV, Long.valueOf(0L))).longValue();
    return true;
  }
  
  private void al(byte[] paramArrayOfByte)
  {
    int j = aFm();
    if (this.ikw == 1) {}
    for (int i = 1; paramArrayOfByte != null; i = 2)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer %s", new Object[] { paramArrayOfByte.toString() });
      this.ikv = new com.tencent.mm.plugin.emoji.f.n(j, paramArrayOfByte, i);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer is null.");
    this.ikv = new com.tencent.mm.plugin.emoji.f.n(j, i);
  }
  
  private void d(final adh paramadh)
  {
    if (this.iki == -1) {
      au.Em().H(new Runnable()
      {
        public final void run()
        {
          int j = 0;
          int i;
          if (paramadh != null)
          {
            if (paramadh != null) {
              break label85;
            }
            i = 0;
            if (paramadh != null) {
              break label96;
            }
          }
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "jacks save EmoijStoreUI Cache: list:%d, size: %d, type: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(a.this.aFm()) });
            i.aEA().igA.a(a.this.aFm(), paramadh);
            return;
            label85:
            i = paramadh.rHB;
            break;
            label96:
            if (paramadh.rcT != null) {
              j = paramadh.rcT.boi();
            }
          }
        }
      });
    }
  }
  
  private void eq(boolean paramBoolean)
  {
    if (this.ikj) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "isLoading");
    }
    do
    {
      return;
      this.ikj = true;
      if (paramBoolean) {
        this.ikk.setVisibility(0);
      }
      al(this.ikl);
      aGi();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
    } while (paramBoolean);
    zM(getString(R.l.app_waiting));
  }
  
  private void zM(String paramString)
  {
    if (isFinishing())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[showLoadingDialog] acitivity is finished.");
      return;
    }
    FragmentActivity localFragmentActivity = thisActivity();
    getString(R.l.app_tip);
    this.eEX = com.tencent.mm.ui.base.h.a(localFragmentActivity, paramString, true, new a.9(this));
  }
  
  public final void M(String paramString1, String paramString2, String paramString3)
  {
    this.ikB = new g(paramString1, paramString2, paramString3);
    au.DF().a(this.ikB, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((this.eEX != null) && (this.eEX.isShowing())) {
      this.eEX.dismiss();
    }
    int i3 = paraml.getType();
    switch (i3)
    {
    default: 
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiStoreV2BaseFragment", "unknow scene type.");
    }
    for (;;)
    {
      return;
      paramString = (com.tencent.mm.plugin.emoji.f.n)paraml;
      if ((paramString != null) && (paramString.mType == aFm()))
      {
        int i2 = 0;
        int m = 0;
        int n = 0;
        int i1 = 0;
        int i = i2;
        int k = i1;
        int j = n;
        if (paramString != null)
        {
          i = i2;
          k = i1;
          j = n;
          if (paramString.aEQ() != null)
          {
            i = m;
            if (this.ihz.aDB() <= 0)
            {
              i = m;
              if (aGk())
              {
                if (paramString.aEQ().rHN != null) {
                  break label560;
                }
                i = 0;
                this.ihz.oF(i);
              }
            }
            j = paramString.aEQ().rHK;
            k = paramString.aEQ().rHL;
          }
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd setSize:%d hotcount:%d recentHotCount:%d type:%d getSceneType:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i3), Integer.valueOf(paramString.mType) });
        if ((this.ihz != null) && (this.ihz.aDA() <= 0) && (aGk()))
        {
          this.ihz.oD(j + this.ihz.aDB());
          this.ihz.oE(k);
        }
        this.ikj = false;
        this.ikk.setVisibility(8);
        label351:
        Object localObject;
        if ((paramInt1 == 0) || (paramInt1 == 4))
        {
          paramInt1 = 1;
          if (paramInt1 == 0) {
            break label673;
          }
          this.gQd.setVisibility(8);
          this.ikf.setVisibility(0);
          localObject = (com.tencent.mm.plugin.emoji.f.n)paraml;
          paraml = com.tencent.mm.plugin.emoji.f.n.a(((com.tencent.mm.plugin.emoji.f.n)localObject).aEQ());
          this.ikl = ((com.tencent.mm.plugin.emoji.f.n)localObject).iiN;
          if (paramInt2 != 0) {
            break label580;
          }
          localObject = ((com.tencent.mm.plugin.emoji.f.n)localObject).aEQ();
          a(this.iki, paraml);
          d((adh)localObject);
          this.iki = 0;
        }
        for (;;)
        {
          if (!aGk()) {
            break label708;
          }
          if ((paramString.aEQ() == null) || (paramString.aEQ().rHN == null) || (paramString.aEQ().rHN.size() <= 0)) {
            break label710;
          }
          paramInt1 = 0;
          while (paramInt1 < paramString.aEQ().rHN.size())
          {
            com.tencent.mm.plugin.report.service.h.mEJ.h(13223, new Object[] { Integer.valueOf(0), Integer.valueOf(((tj)paramString.aEQ().rHN.get(paramInt1)).bzI), ((tj)paramString.aEQ().rHN.get(paramInt1)).bHD, Integer.valueOf(0) });
            paramInt1 += 1;
          }
          label560:
          i = paramString.aEQ().rHN.size();
          break;
          paramInt1 = 0;
          break label351;
          label580:
          if (paramInt2 == 2)
          {
            localObject = ((com.tencent.mm.plugin.emoji.f.n)localObject).aEQ();
            a(this.iki, paraml);
            aFl();
            d((adh)localObject);
            this.iki = 2;
          }
          else if (paramInt2 == 3)
          {
            a(this.iki, paraml);
            this.iki = 1;
          }
          else
          {
            this.gQd.setVisibility(0);
            this.ikf.setVisibility(8);
            this.ikg.setText(R.l.emoji_store_load_failed);
            continue;
            label673:
            if (!this.ikC)
            {
              this.gQd.setVisibility(0);
              this.ikf.setVisibility(8);
              this.ikg.setText(R.l.emoji_store_load_failed_network);
            }
          }
        }
        label708:
        continue;
        label710:
        if ((paramString.aEQ().rHL > 0) && (paramString.aEQ().rHC != null) && (paramString.aEQ().rHC.size() > paramString.aEQ().rHK + paramString.aEQ().rHL))
        {
          paramInt1 = 0;
          while (paramInt1 < paramString.aEQ().rHL)
          {
            com.tencent.mm.plugin.report.service.h.mEJ.h(13223, new Object[] { Integer.valueOf(0), ((ts)paramString.aEQ().rHC.get(paramString.aEQ().rHK + paramInt1)).rem, ((ts)paramString.aEQ().rHC.get(paramString.aEQ().rHK + paramInt1)).rwQ, Integer.valueOf(1) });
            paramInt1 += 1;
          }
        }
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    if (parama.aDp() == 9) {
      zM(getString(R.l.app_uninstalling));
    }
    if (aGk()) {
      if ((parama.mPosition >= 0) && (parama.mPosition < this.ihz.aDz())) {
        this.iky.ihC = 3;
      }
    }
    for (;;)
    {
      this.iky.a(parama);
      return;
      if ((parama.mPosition >= this.ihz.aDz()) && (parama.mPosition < this.ihz.aDA() + this.ihz.aDz()))
      {
        this.iky.ihC = 19;
      }
      else
      {
        this.iky.ihC = 1;
        continue;
        this.iky.ihC = 2;
      }
    }
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals("delete_group")) && (this.ioW != null)) {
      this.ioW.sendEmptyMessageDelayed(131074, 50L);
    }
  }
  
  public final boolean aCg()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onBottomLoadData] startLoadRemoteEmoji.");
    eq(true);
    return true;
  }
  
  public final boolean aCh()
  {
    return false;
  }
  
  public final boolean aCi()
  {
    return false;
  }
  
  public final void aEs()
  {
    this.ikl = null;
    this.iki = -1;
    eq(false);
  }
  
  public abstract com.tencent.mm.plugin.emoji.a.a.a aFf();
  
  public abstract int aFm();
  
  public abstract boolean aGk();
  
  public final void ep(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "loadNetWork force:%b isNeedToRefresh:%b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(aGj()) });
    if (!paramBoolean) {
      aGj();
    }
    al(this.ikl);
    aGi();
  }
  
  protected int getForceOrientation()
  {
    return 1;
  }
  
  public final void m(Message paramMessage)
  {
    if (this.ioW != null) {
      this.ioW.sendMessage(paramMessage);
    }
  }
  
  public final void ms(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= ((com.tencent.mm.plugin.emoji.a.h)this.ihz).aDD())) {
      return;
    }
    a(this.ihz.oG(paramInt), paramInt);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onActivityCreated");
    super.onActivityCreated(paramBundle);
    this.ioV = true;
    this.ihz = aFf();
    this.ihz.ieo = this;
    this.gQd = findViewById(R.h.empty);
    this.ikg = ((TextView)this.gQd.findViewById(R.h.empty_content));
    this.ikk = getLayoutInflater().inflate(R.i.emoji_store_load_more, null);
    this.ikk.setVisibility(8);
    this.ikc = new EmojiStoreVpHeader(getContext());
    this.CU = ((ListView)findViewById(16908298));
    this.CU.addHeaderView(this.ikc);
    if (!aGk())
    {
      this.ioS = new EmojiStoreV2HotBarView(getContext());
      this.ioS.setDesignerEmojiViewVisibility(8);
      this.ioS.setDesignerCatalogViewPadding(false);
      this.CU.addHeaderView(this.ioS);
    }
    this.CU.addFooterView(this.ikk);
    this.CU.setAdapter(this.ihz);
    if (aGk()) {
      this.CU.setOnItemClickListener(this);
    }
    for (;;)
    {
      this.CU.setOnScrollListener(this);
      this.CU.setLongClickable(false);
      this.CU.setOnTouchListener(new a.6(this));
      this.ihz.iem = this.CU;
      this.ikf = ((MMPullDownView)findViewById(R.h.load_more_pull_view));
      if (this.ikf != null)
      {
        this.ikf.setTopViewVisible(false);
        this.ikf.setAtTopCallBack(this);
        this.ikf.setOnBottomLoadDataListener(this);
        this.ikf.setAtBottomCallBack(this);
        this.ikf.setBottomViewVisible(false);
        this.ikf.setIsBottomShowAll(false);
        this.ikf.setIsReturnSuperDispatchWhenCancel(true);
      }
      if (this.ioT) {
        aGh();
      }
      return;
      ((com.tencent.mm.plugin.emoji.a.h)this.ihz).idX = this;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.iky != null)
    {
      this.iky.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "mPayOrDownloadComponent have no init.");
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onAttach");
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.ikc != null) {
      this.ikc.requestLayout();
    }
    setRequestedOrientation(1);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setRequestedOrientation(1);
    this.mActionBar = ((ActionBarActivity)thisActivity()).getSupportActionBar();
    paramBundle = y.gq(getContext()).inflate(R.i.actionbar_custom_area, null);
    this.mActionBarHelper = new com.tencent.mm.ui.b(paramBundle);
    this.mActionBar.setLogo(new ColorDrawable(getResources().getColor(17170445)));
    this.mActionBar.da();
    this.mActionBar.setDisplayHomeAsUpEnabled(false);
    this.mActionBar.cZ();
    this.mActionBar.db();
    this.mActionBar.setCustomView(paramBundle);
    this.mActionBar.show();
    paramBundle = this.mActionBarHelper;
    int i = R.l.emoji_store;
    paramBundle.eCm.setText(i);
    Object localObject;
    if (com.tencent.mm.bp.a.fi(paramBundle.eCm.getContext()))
    {
      localObject = paramBundle.eCm;
      float f = com.tencent.mm.bp.a.ae(paramBundle.eCm.getContext(), a.e.ActionBarTextSize);
      ((TextView)localObject).setTextSize(0, com.tencent.mm.bp.a.fg(paramBundle.eCm.getContext()) * f);
    }
    this.mActionBarHelper.b(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (!a.this.isScreenEnable()) {}
        while (a.a(a.this) == null) {
          return;
        }
        a.a(a.this).onMenuItemClick(null);
      }
    });
    paramBundle = this.mActionBar;
    boolean bool = ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).getBoolean("dark_actionbar", false);
    if (paramBundle.getCustomView() != null)
    {
      localObject = (ImageView)paramBundle.getCustomView().findViewById(R.h.arrow_area_btn);
      if ((localObject != null) && (bool)) {
        ((ImageView)localObject).getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
      }
      localObject = (TextView)paramBundle.getCustomView().findViewById(R.h.title_area);
      if ((localObject != null) && (bool)) {
        ((TextView)localObject).setTextColor(getActivity().getResources().getColor(R.e.white_text_color));
      }
      paramBundle = (TextView)paramBundle.getCustomView().findViewById(R.h.sub_title_area);
      if ((paramBundle != null) && (bool)) {
        paramBundle.setTextColor(getActivity().getResources().getColor(R.e.white_text_color));
      }
    }
    showOptionMenu(true);
    addIconOptionMenu(0, R.k.actionbar_setting_icon, new a.5(this));
    com.tencent.mm.sdk.b.a.sFg.b(this.ikA);
    i.aEA().igy.c(this);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onCreateView");
    return paramLayoutInflater.inflate(getLayoutId(), paramViewGroup, false);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onDestroy");
    if (this.ihz != null)
    {
      this.ihz.clear();
      this.ihz = null;
    }
    if (this.ikc != null)
    {
      this.ikc.aGd();
      this.ikc.clear();
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.ikA);
    i.aEA().igy.d(this);
  }
  
  public void onDestroyView()
  {
    super.onDestroyView();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onResume");
  }
  
  public void onDetach()
  {
    super.onDetach();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onDetach");
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramInt -= this.CU.getHeaderViewsCount();
    if ((paramInt < 0) || (paramInt >= this.ihz.getCount())) {}
    do
    {
      return;
      paramAdapterView = this.ihz.oG(paramInt);
      a(paramAdapterView, paramInt);
    } while ((!aGk()) || (this.ihz.aDA() <= 0) || (paramInt < this.ihz.aDz()) || (paramInt >= this.ihz.aDz() + this.ihz.aDA()) || (paramAdapterView.iez == null));
    com.tencent.mm.plugin.report.service.h.mEJ.h(13223, new Object[] { Integer.valueOf(1), paramAdapterView.iez.rem, paramAdapterView.iez.rwQ, Integer.valueOf(1), Integer.valueOf(0) });
  }
  
  public void onPause()
  {
    super.onPause();
    au.DF().b(411, this);
    au.DF().b(423, this);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onPause");
    if (this.ikc != null) {
      this.ikc.aGd();
    }
    if (this.ioW != null) {
      this.ioW.removeMessages(131077);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onResume");
    au.DF().a(411, this);
    au.DF().a(423, this);
    if (this.ioT)
    {
      if (this.ioW != null) {
        this.ioW.sendEmptyMessageDelayed(131077, 4000L);
      }
      if ((this.ihz != null) && (this.ihz.ien != null))
      {
        this.ihz.ien.aDF();
        this.ihz.aoV();
      }
      au.HU();
      if (((Boolean)com.tencent.mm.model.c.DT().get(208900, Boolean.valueOf(false))).booleanValue())
      {
        aEs();
        au.HU();
        com.tencent.mm.model.c.DT().set(208900, Boolean.valueOf(false));
      }
    }
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1))
    {
      if ((this.iki == 0) || (this.ikj)) {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "No More List.");
      }
    }
    else {
      return;
    }
    eq(true);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onScrollStateChanged] startLoadRemoteEmoji.");
  }
  
  public void onStart()
  {
    super.onStart();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onStart");
  }
  
  public void onStop()
  {
    super.onStop();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onStop");
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "setUserVisibleHint :%b", new Object[] { Boolean.valueOf(paramBoolean) });
    super.setUserVisibleHint(paramBoolean);
    this.ioT = paramBoolean;
    if ((!this.ioU) && (this.ioV)) {
      aGh();
    }
  }
  
  public final void u(ArrayList<com.tencent.mm.pluginsdk.model.n> paramArrayList)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "google [onQueryFinish]");
    if (this.ihz == null) {
      return;
    }
    if (this.ioW != null) {
      this.ioW.sendEmptyMessageDelayed(131074, 50L);
    }
    com.tencent.mm.plugin.emoji.a.a.b.a(paramArrayList, this.ihz.ien);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */