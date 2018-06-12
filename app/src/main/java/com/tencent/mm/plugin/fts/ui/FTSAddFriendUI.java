package com.tencent.mm.plugin.fts.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.b;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.plugin.messenger.a.f;
import com.tencent.mm.plugin.websearch.api.ad;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.List;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class FTSAddFriendUI
  extends FTSBaseUI
{
  private long ghF;
  private bja iJw;
  private Dialog iwc;
  private String jbY = "";
  private View jvF;
  private View jvG;
  private View jvH;
  private View jvI;
  private View jvJ;
  private View jvK;
  private View jvL;
  private ImageView jvM;
  private TextView jvN;
  private TextView jvO;
  private TextView jvP;
  private TextView jvQ;
  private TextView jvR;
  private boolean jvS;
  protected boolean jvT;
  private int jvU = 1;
  private FTSLocalPageRelevantView jvV;
  private c jvW;
  private int jvX;
  private int jvY;
  int jvZ = -1;
  
  private void CM(final String paramString)
  {
    this.jvS = true;
    this.jvT = false;
    this.jvU = 1;
    if ((paramString == null) || (paramString.length() == 0) || (paramString.trim().length() == 0)) {
      return;
    }
    if (Character.isDigit(paramString.charAt(0))) {}
    for (int i = 15;; i = 3)
    {
      this.jvZ = i;
      final FTSAddFriendUI.5 local5 = new FTSAddFriendUI.5(this);
      this.jvX = 0;
      this.jvY = 0;
      com.tencent.mm.kernel.g.DF().a(106, local5);
      paramString = new f(paramString, 3);
      com.tencent.mm.kernel.g.DF().a(paramString, 0);
      getString(n.g.app_tip);
      this.iwc = com.tencent.mm.ui.base.h.a(this, getString(n.g.search_contact_doing), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          com.tencent.mm.kernel.g.DF().c(paramString);
          com.tencent.mm.kernel.g.DF().b(106, local5);
          FTSAddFriendUI.i(FTSAddFriendUI.this);
        }
      });
      return;
    }
  }
  
  private void aQA()
  {
    ah.A(new Runnable()
    {
      public final void run()
      {
        if (FTSAddFriendUI.j(FTSAddFriendUI.this) != null)
        {
          FTSAddFriendUI.j(FTSAddFriendUI.this).dismiss();
          FTSAddFriendUI.i(FTSAddFriendUI.this);
        }
      }
    });
  }
  
  private void aQz()
  {
    if (bi.oV(ab.a(this.iJw.rvi)).length() > 0)
    {
      if (2 != this.iJw.sjj) {
        break label121;
      }
      this.jvZ = 15;
    }
    for (;;)
    {
      Intent localIntent = new Intent();
      ((com.tencent.mm.api.h)com.tencent.mm.kernel.g.l(com.tencent.mm.api.h.class)).a(localIntent, this.iJw, this.jvZ);
      if ((this.jvZ == 15) && (2 == this.iJw.sjj)) {
        localIntent.putExtra("Contact_Search_Mobile", this.jbY.trim());
      }
      localIntent.putExtra("add_more_friend_search_scene", 2);
      com.tencent.mm.bg.d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
      return;
      label121:
      if (1 == this.iJw.sjj) {
        this.jvZ = 1;
      }
    }
  }
  
  protected final d a(e parame)
  {
    if (this.jvW == null) {
      this.jvW = new c(parame);
    }
    return this.jvW;
  }
  
  public final void a(com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    if ((parama instanceof com.tencent.mm.plugin.fts.ui.a.a))
    {
      this.jbY = parama.jrx.jrV;
      CM(parama.jrx.jrV);
    }
  }
  
  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    super.a(paramString1, paramString2, paramList, paramb);
    this.jvS = false;
  }
  
  protected final void aQy()
  {
    super.aQy();
    this.jvG.setVisibility(8);
  }
  
  public final boolean anx()
  {
    CM(this.bWm);
    YC();
    return true;
  }
  
  protected final int getLayoutId()
  {
    return n.e.fts_add_friend_ui;
  }
  
  public void onBackPressed()
  {
    finish();
  }
  
  public void onClickClearTextBtn(View paramView)
  {
    super.onClickClearTextBtn(paramView);
    if (!this.jwl.getFtsEditText().jzo.hasFocus())
    {
      this.jwl.getFtsEditText().aQU();
      showVKB();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.fts.a.e.jqM = p.zK(16);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(n.d.action_bar_container), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    lF(this.mController.tml.getResources().getColor(n.a.normal_actionbar_color));
    cqh();
    this.jwm = this.mController.tml.getResources().getString(n.g.contact_search_account_hint);
    this.jwl.getFtsEditText().setHint(getHint());
    this.jvF = findViewById(n.d.bg_layout);
    this.jvG = findViewById(n.d.contact_biz_merge_layout);
    this.jvH = findViewById(n.d.has_contact_layout);
    this.jvL = findViewById(n.d.contact_click_layout);
    this.jvI = findViewById(n.d.no_contact_layout);
    this.jvJ = findViewById(n.d.merge_layout_divider);
    this.jvK = findViewById(n.d.search_content_layout);
    this.jvV = ((FTSLocalPageRelevantView)findViewById(n.d.relevant_serach_query));
    this.jvM = ((ImageView)findViewById(n.d.contact_avatar_iv));
    this.jvN = ((TextView)findViewById(n.d.contact_title_tv));
    this.jvO = ((TextView)findViewById(n.d.contact_desc_tv));
    this.jvP = ((TextView)findViewById(n.d.search_title_tv));
    this.jvQ = ((TextView)findViewById(n.d.contact_error_tv));
    this.jvR = ((TextView)findViewById(n.d.search_desc_tv));
    try
    {
      paramBundle = r.PX("webSearchBar").optString("wording");
      x.i("MicroMsg.FTS.FTSAddFriendUI", "set searchNetworkTips %s", new Object[] { paramBundle });
      this.jvR.setText(paramBundle);
      this.mController.contentView.postDelayed(new FTSAddFriendUI.1(this), 128L);
      this.jvF.setOnClickListener(new FTSAddFriendUI.2(this));
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;) {}
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.jvS) && (!this.jvT)) {
      ad.h(this.bWm, this.jvU, 3, 16);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    p.bSQ();
  }
  
  protected final void stopSearch()
  {
    super.stopSearch();
    this.jvG.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/FTSAddFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */