package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.m.a;
import com.tencent.mm.ac.m.a.a;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.r;
import com.tencent.mm.ui.widget.MMEditText;

@com.tencent.mm.ui.base.a(1)
public class BottleBeachUI
  extends MMActivity
  implements View.OnClickListener, e, m.a.a, m.b
{
  private MoonImageView hkA;
  private ImageView hkB;
  private int hkC = 0;
  boolean hkD = true;
  private ImageView hkE;
  private ImageView hkF;
  private ImageView hkG;
  private TextView hkH;
  private d hkI;
  private b hkJ;
  private boolean hkK = true;
  private View hks;
  private FrameLayout hkt;
  private ThrowBottleUI hku;
  private PickBottleUI hkv;
  private OpenBottleUI hkw;
  private BallonImageView hkx;
  private LightHouseImageView hky;
  private ImageView hkz;
  private p tipDialog = null;
  
  private void aun()
  {
    boolean bool = this.hkK;
    fullScreenNoTitleBar(bool);
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      this.hkK = bool;
      return;
    }
  }
  
  private void auo()
  {
    if (this.hkH == null)
    {
      this.hkH = ((TextView)findViewById(R.h.bottle_list_unread_tv));
      this.hkH.setBackgroundResource(r.hd(this.mController.tml));
    }
    int i = com.tencent.mm.plugin.bottle.a.c.aue();
    this.hkH.setText(String.valueOf(i));
    TextView localTextView = this.hkH;
    if (i > 0) {}
    for (i = 0;; i = 8)
    {
      localTextView.setVisibility(i);
      return;
    }
  }
  
  private void n(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    x.v("MM.UI.BottleUI", "set frame visible");
    if (this.hkt == null) {
      this.hkt = ((FrameLayout)findViewById(R.h.bottle_float_frame_container));
    }
    this.hks.setVisibility(paramInt1);
    if (paramInt1 == 0)
    {
      auo();
      this.hkB.setVisibility(8);
      YC();
    }
    Object localObject;
    if ((paramInt2 == 0) && (this.hku == null))
    {
      this.hku = ((ThrowBottleUI)View.inflate(this, R.i.bottle_throw, null));
      this.hkt.addView(this.hku);
      localObject = this.hku;
      ((ThrowBottleUI)localObject).hnf = new ToneGenerator(1, 60);
      ((ThrowBottleUI)localObject).hni = ((Vibrator)((ThrowBottleUI)localObject).hlO.getSystemService("vibrator"));
      ((ThrowBottleUI)localObject).hnl = ((ImageView)((ThrowBottleUI)localObject).findViewById(R.h.bottle_record_volumn_hint));
      ((ThrowBottleUI)localObject).hnm = ((TextView)((ThrowBottleUI)localObject).findViewById(R.h.bottle_audio_status_img));
      ((ThrowBottleUI)localObject).hnm.setVisibility(8);
      ((ThrowBottleUI)localObject).hnn = ((ImageView)((ThrowBottleUI)localObject).findViewById(R.h.bottle_record_text_hint));
      ((ThrowBottleUI)localObject).hno = ((MMEditText)((ThrowBottleUI)localObject).findViewById(R.h.bottle_throw_edittext));
      ((ThrowBottleUI)localObject).hnp = ((ThrowBottleUI)localObject).findViewById(R.h.bottle_throw_bottom_margin_view);
      ((ThrowBottleUI)localObject).hns = ((ThrowBottleFooter)((ThrowBottleUI)localObject).findViewById(R.h.bottle_throw_footer));
      ((ThrowBottleUI)localObject).hml = ((ImageView)((ThrowBottleUI)localObject).hlO.findViewById(R.h.bottle_close_frame_btn));
      ((ThrowBottleUI)localObject).hnr = ((ImageButton)((ThrowBottleUI)localObject).findViewById(R.h.bottle_attach_btn));
      ((ThrowBottleUI)localObject).hnr.setOnClickListener((View.OnClickListener)localObject);
      ((ThrowBottleUI)localObject).hnq = ((Button)((ThrowBottleUI)localObject).findViewById(R.h.bottle_throw_btn));
      ((ThrowBottleUI)localObject).hnq.setOnTouchListener(new ThrowBottleUI.2((ThrowBottleUI)localObject));
      ((ThrowBottleUI)localObject).setOnClickListener((View.OnClickListener)localObject);
      if (((ThrowBottleUI)localObject).hnv == null)
      {
        ((ThrowBottleUI)localObject).hnv = ((LinearLayout.LayoutParams)((ThrowBottleUI)localObject).hno.getLayoutParams());
        ((ThrowBottleUI)localObject).hnx = ((ThrowBottleUI)localObject).hnv.topMargin;
      }
      ((ThrowBottleUI)localObject).hns.setOnLayoutChangeListener(new ThrowBottleUI.1((ThrowBottleUI)localObject));
    }
    if (this.hku != null) {
      this.hku.setVisibility(paramInt2);
    }
    if ((paramInt3 == 0) && (this.hkv == null))
    {
      this.hkv = ((PickBottleUI)View.inflate(this, R.i.bottle_pick, null));
      this.hkt.addView(this.hkv);
      this.hkv.initView();
    }
    if (this.hkv != null) {
      this.hkv.setVisibility(paramInt3);
    }
    if (paramInt3 == 0)
    {
      this.hkv.setDensity(com.tencent.mm.bp.a.getDensity(this));
      localObject = this.hkv;
      ((PickBottleUI)localObject).hmk.setVisibility(8);
      ((PickBottleUI)localObject).hmj.E(Integer.MAX_VALUE, -1, -1);
      ((PickBottleUI)localObject).hml.setVisibility(8);
      ((PickBottleUI)localObject).hlO.hkD = false;
      ((PickBottleUI)localObject).handler.postDelayed(((PickBottleUI)localObject).hmn, 1000L);
    }
    if ((paramInt4 == 0) && (this.hkw == null))
    {
      this.hkw = ((OpenBottleUI)View.inflate(this, R.i.bottle_open, null));
      this.hkt.addView(this.hkw);
      localObject = this.hkw;
      ((Button)((OpenBottleUI)localObject).findViewById(R.h.bottle_open_throw_back_btn)).setOnClickListener((View.OnClickListener)localObject);
      ((Button)((OpenBottleUI)localObject).findViewById(R.h.bottle_open_reply_btn)).setOnClickListener((View.OnClickListener)localObject);
      ((OpenBottleUI)localObject).hme = this;
    }
    if (this.hkw != null) {
      this.hkw.setVisibility(paramInt4);
    }
  }
  
  private void nk(int paramInt)
  {
    if (paramInt > 0) {}
    for (String str = this.mController.tml.getString(paramInt);; str = null)
    {
      if (this.hkI == null) {
        this.hkI = new d(this);
      }
      this.hkI.cancel();
      if (str != null)
      {
        this.hkI.setDuration(0);
        this.hkI.setText(str);
        this.hkI.show();
      }
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.d("MM.UI.BottleUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paramInt2 == 63534) && (this.hkC == 0)) {
      nl(R.l.bottle_banby_expose);
    }
    Intent localIntent;
    do
    {
      do
      {
        return;
        switch (paraml.getType())
        {
        default: 
          nk(R.l.bottle_get_count_err);
          return;
        case 152: 
          auo();
          return;
        }
        x.i("MM.UI.BottleUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
      } while (com.tencent.mm.plugin.bottle.a.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString));
      if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        com.tencent.mm.ui.base.h.i(this.mController.tml, R.l.address_not_found, R.l.app_tip);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Toast.makeText(this.mController.tml, this.mController.tml.getString(R.l.fmt_search_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        return;
      }
      paramString = ((com.tencent.mm.plugin.messenger.a.f)paraml).bcS();
      paraml = com.tencent.mm.platformtools.ab.a(paramString.rvi);
      com.tencent.mm.aa.q.Kp().g(paraml, com.tencent.mm.platformtools.ab.a(paramString.rcn));
      localIntent = new Intent();
      com.tencent.mm.pluginsdk.ui.tools.c.a(localIntent, paramString, 25);
    } while (bi.oV(paraml).length() <= 0);
    if ((paramString.rTe & 0x8) > 0) {
      com.tencent.mm.plugin.report.service.h.mEJ.k(10298, paraml + ",25");
    }
    com.tencent.mm.plugin.bottle.a.ezn.d(localIntent, this.mController.tml);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    auo();
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.bottle_beach;
  }
  
  protected final void initView()
  {
    int j = 8;
    setMMTitle(R.l.bottle_beach_title);
    lF(getResources().getColor(R.e.transparent));
    addIconOptionMenu(0, R.l.actionbar_title_setting, R.k.actionbar_setting_icon, new BottleBeachUI.2(this));
    setBackBtn(new BottleBeachUI.3(this));
    boolean bool = bi.ciW();
    Object localObject;
    if (this.hkx == null)
    {
      localObject = (FrameLayout)findViewById(R.h.bottle_beach_bg_fl);
      ((FrameLayout)((FrameLayout)localObject).getParent()).removeView((View)localObject);
      ((FrameLayout)getWindow().getDecorView()).addView((View)localObject, 0);
      if (bool)
      {
        i = R.g.bottle_day_bg;
        ((FrameLayout)localObject).setBackgroundResource(i);
        ((FrameLayout)localObject).setVisibility(0);
        this.hkx = ((BallonImageView)findViewById(R.h.bottle_ballon_iv));
        this.hky = ((LightHouseImageView)findViewById(R.h.bottle_light_house_iv));
        this.hkz = ((ImageView)findViewById(R.h.bottle_star_iv));
        this.hkA = ((MoonImageView)findViewById(R.h.bottle_moon_iv));
      }
    }
    else
    {
      localObject = this.hkx;
      if (!bool) {
        break label371;
      }
      i = 0;
      label195:
      ((BallonImageView)localObject).setVisibility(i);
      localObject = this.hky;
      if (!bool) {
        break label377;
      }
      i = 8;
      label214:
      ((LightHouseImageView)localObject).setVisibility(i);
      this.hkA.hkz = this.hkz;
      localObject = this.hkA;
      if (!bool) {
        break label382;
      }
    }
    label371:
    label377:
    label382:
    for (int i = j;; i = 0)
    {
      ((MoonImageView)localObject).setVisibility(i);
      this.hks = findViewById(R.h.bottle_board_frame);
      this.hks.setOnClickListener(new BottleBeachUI.4(this));
      this.hkE = ((ImageView)findViewById(R.h.bottle_opt_throw_tv));
      this.hkF = ((ImageView)findViewById(R.h.bottle_opt_pick_tv));
      this.hkG = ((ImageView)findViewById(R.h.bottle_opt_list_tv));
      this.hkE.setOnClickListener(this);
      this.hkF.setOnClickListener(this);
      this.hkG.setOnClickListener(this);
      this.hkB = ((ImageView)findViewById(R.h.bottle_close_frame_btn));
      this.hkB.setOnClickListener(this);
      return;
      i = R.g.bottle_night_bg;
      break;
      i = 8;
      break label195;
      i = 0;
      break label214;
    }
  }
  
  public final void kX(String paramString)
  {
    if (this.hkv != null)
    {
      Object localObject = this.hkv;
      if (((PickBottleUI)localObject).hmk != null)
      {
        localObject = ((PickBottleUI)localObject).hmk;
        if (paramString.equals(((PickedBottleImageView)localObject).hkb))
        {
          ((PickedBottleImageView)localObject).iconBitmap = com.tencent.mm.ac.m.d(((PickedBottleImageView)localObject).hkb, ((PickedBottleImageView)localObject).iconUrl, R.g.nosdcard_headimg);
          ((PickedBottleImageView)localObject).update();
          ((PickedBottleImageView)localObject).invalidate();
        }
      }
    }
  }
  
  public final void nl(int paramInt)
  {
    if (this.hkJ == null) {
      this.hkJ = new b(this);
    }
    b localb = this.hkJ;
    String str = getString(paramInt);
    localb.ePz.setText(str);
    this.hkJ.show();
  }
  
  public final void nm(int paramInt)
  {
    this.hkC = paramInt;
    nk(0);
    if (this.hkK) {
      aun();
    }
    switch (paramInt)
    {
    default: 
      n(8, 8, 8, 8);
      return;
    case 0: 
      this.hkD = true;
      n(0, 8, 8, 8);
      return;
    case 1: 
      n(8, 0, 8, 8);
      return;
    case 2: 
      n(8, 8, 0, 8);
      return;
    }
    n(8, 8, 8, 0);
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (R.h.bottle_opt_throw_tv == i) {
      if (com.tencent.mm.plugin.bottle.a.c.auc() > 0) {
        nm(1);
      }
    }
    do
    {
      return;
      nl(R.l.bottle_cannot_throw);
      return;
      if (R.h.bottle_opt_pick_tv == i)
      {
        if (com.tencent.mm.plugin.bottle.a.c.aud() > 0)
        {
          nm(2);
          return;
        }
        nl(R.l.bottle_cannot_pick);
        return;
      }
      if (R.h.bottle_opt_list_tv == i)
      {
        if (!this.hkK) {
          aun();
        }
        paramView = new Intent();
        paramView.setClass(this, BottleConversationUI.class);
        paramView.putExtra("conversation_from", "from_beach");
        startActivity(paramView);
        return;
      }
      if (R.h.bottle_close_frame_btn == i)
      {
        if (this.hkC == 3)
        {
          this.hkw.onPause();
          this.hkw.aux();
        }
        nm(0);
        n(0, 8, 8, 8);
        return;
      }
    } while (R.h.bottle_picked_result_img != i);
    Object localObject = ((PickedBottleImageView)paramView).getBottleTalker();
    paramView = ((PickedBottleImageView)paramView).getRealUserName();
    if ((paramView != null) && (paramView.length() > 0))
    {
      nm(0);
      au.HU();
      localObject = com.tencent.mm.model.c.FR().Yg(paramView);
      if ((localObject != null) && ((int)((com.tencent.mm.l.a)localObject).dhP != 0) && (com.tencent.mm.l.a.gd(((ai)localObject).field_type)))
      {
        paramView = new Intent();
        paramView.putExtra("Contact_User", ((ai)localObject).field_username);
        if (((com.tencent.mm.storage.ab)localObject).ckW())
        {
          com.tencent.mm.plugin.report.service.h.mEJ.k(10298, ((ai)localObject).field_username + ",25");
          paramView.putExtra("Contact_Scene", 25);
        }
        com.tencent.mm.plugin.bottle.a.ezn.d(paramView, this.mController.tml);
        return;
      }
      paramView = new com.tencent.mm.plugin.messenger.a.f(paramView);
      au.DF().a(paramView, 0);
      localObject = this.mController.tml;
      getString(R.l.app_tip);
      this.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.address_searching), true, new BottleBeachUI.5(this, paramView));
      return;
    }
    if (localObject != null)
    {
      nm(3);
      paramView = this.hkw;
      if (paramView.hlX == null)
      {
        paramView.hlX = ((ThrowBottleAnimUI)paramView.hlO.findViewById(R.h.bottle_throw_anim_lo1));
        paramView.hlX.setOnThrowEndListener(new OpenBottleUI.1(paramView));
      }
      if (paramView.hlP == null)
      {
        paramView.hlP = ((TextView)paramView.findViewById(R.h.bottle_open_text_container));
        paramView.hlQ = ((LinearLayout)paramView.findViewById(R.h.bottle_open_voice_container));
        paramView.hlR = ((FrameLayout)paramView.findViewById(R.h.bottle_open_voice_node_fl));
        paramView.hlS = ((ImageView)paramView.findViewById(R.h.bottle_open_voice_anim_iv));
        paramView.hlT = ((TextView)paramView.findViewById(R.h.bottle_open_voice_length_tv));
        paramView.hlU = ((TextView)paramView.findViewById(R.h.bottle_open_contact_from_tv));
        paramView.hlV = ((TextView)paramView.findViewById(R.h.bottle_open_contact_signature_tv));
        paramView.hlR.setOnClickListener(paramView);
      }
      paramView.hlY = ((String)localObject);
      x.d("MM.Bottle_OpenBottleUI", (String)localObject);
      au.HU();
      paramView.bGS = com.tencent.mm.model.c.FT().GE((String)localObject);
      if (paramView.bGS.ckz())
      {
        paramView.hlP.setVisibility(8);
        paramView.hlQ.setVisibility(0);
        float f = com.tencent.mm.modelvoice.q.E(paramView.bGS);
        paramView.hlR.setMinimumWidth(com.tencent.mm.bp.a.fromDPToPix(paramView.hlO, OpenBottleUI.nr((int)f)));
        paramView.hlT.setText(paramView.hlO.getString(R.l.fmt_time_length, new Object[] { Integer.valueOf((int)f) }));
        OpenBottleUI.hlW.a(paramView);
        if (paramView.bGS != null)
        {
          f = com.tencent.mm.modelvoice.q.bD(new n(paramView.bGS.field_content).time);
          localObject = paramView.hlR;
          paramView.getResources().getString(R.l.bottle_voice_play_btn_text);
          ((FrameLayout)localObject).setContentDescription(String.format("%d", new Object[] { Integer.valueOf((int)f) }));
        }
      }
      for (;;)
      {
        paramView.auy();
        if (paramView.hmd != null) {
          break;
        }
        paramView.hmd = ((TextView)paramView.findViewById(R.h.expose_bottle));
        paramView.hmd.setOnClickListener(new OpenBottleUI.4(paramView));
        return;
        paramView.hlP.setVisibility(0);
        paramView.hlQ.setVisibility(8);
        localObject = paramView.bGS;
        paramView.hlP.setText(((cm)localObject).field_content);
        j.g(paramView.hlP, 1);
      }
    }
    nm(0);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!com.tencent.mm.model.q.GW())
    {
      au.HU();
      com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.g(11, 1));
    }
    initView();
    au.DF().a(152, this);
    au.DF().a(new com.tencent.mm.plugin.bottle.a.d(), 0);
  }
  
  public void onDestroy()
  {
    Object localObject;
    if (this.hku != null)
    {
      localObject = this.hku;
      ((ThrowBottleUI)localObject).hne = null;
      ((ThrowBottleUI)localObject).hnh = null;
      if (((ThrowBottleUI)localObject).hni != null)
      {
        ((ThrowBottleUI)localObject).hni.cancel();
        ((ThrowBottleUI)localObject).hni = null;
      }
      if (((ThrowBottleUI)localObject).hnj != null) {
        ((ThrowBottleUI)localObject).hnj.release();
      }
      ((ThrowBottleUI)localObject).hnj = null;
      ((ThrowBottleUI)localObject).hnk = null;
      ((ThrowBottleUI)localObject).hlO = null;
      if (((ThrowBottleUI)localObject).hnf != null) {
        ((ThrowBottleUI)localObject).hnf.release();
      }
      this.hku = null;
    }
    if (this.hkv != null)
    {
      localObject = this.hkv;
      ((PickBottleUI)localObject).handler.removeCallbacks(((PickBottleUI)localObject).hmn);
      ((PickBottleUI)localObject).handler.removeCallbacks(((PickBottleUI)localObject).hmo);
      ((PickBottleUI)localObject).hlO = null;
      ((PickBottleUI)localObject).hmj = null;
      ((PickBottleUI)localObject).hmk = null;
      this.hkv = null;
    }
    if (this.hkI != null)
    {
      this.hkI.cancel();
      this.hkI.context = null;
      this.hkI = null;
    }
    if (this.hkw != null)
    {
      localObject = this.hkw;
      if ((((OpenBottleUI)localObject).bGS != null) && (((OpenBottleUI)localObject).bGS.ckz())) {
        ((OpenBottleUI)localObject).aux();
      }
      ((OpenBottleUI)localObject).hlO = null;
      if (((OpenBottleUI)localObject).hlX != null)
      {
        ((OpenBottleUI)localObject).hlX.release();
        ((OpenBottleUI)localObject).hlX = null;
      }
      OpenBottleUI.hlW = null;
      au.HU();
      com.tencent.mm.model.c.FR().b((m.b)localObject);
      this.hkw = null;
    }
    this.hkx = null;
    this.hky = null;
    this.hkA = null;
    if (this.hkJ != null)
    {
      this.hkJ.dismiss();
      this.hkJ = null;
    }
    au.DF().b(152, this);
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1))
    {
      if (!this.hkD) {
        return true;
      }
      if (this.hkC == 0)
      {
        finish();
        return true;
      }
      nm(0);
      return true;
    }
    if (this.hkC == 3)
    {
      x.v("MM.UI.BottleUI", "on key dwon");
      if ((paramInt == 25) && (this.hkw.auz()))
      {
        au.HV().fE(0);
        return true;
      }
      if ((paramInt == 24) && (this.hkw.auz()))
      {
        au.HV().fD(0);
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    if ((this.hkC == 1) && (this.hku != null)) {
      this.hku.auH();
    }
    if ((this.hkC == 3) && (this.hkw != null)) {
      this.hkw.onPause();
    }
    if (au.HX())
    {
      au.HU();
      com.tencent.mm.model.c.FW().b(this);
      au.DF().b(106, this);
    }
    z.Ni().b(this);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MM.UI.BottleUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    do
    {
      return;
    } while (paramArrayOfInt[0] == 0);
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_microphone_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new BottleBeachUI.6(this), null);
  }
  
  protected void onResume()
  {
    super.onResume();
    auo();
    this.mController.tlX.postDelayed(new BottleBeachUI.1(this), 1000L);
    if ((this.hkC == 3) && (this.hkw != null))
    {
      OpenBottleUI localOpenBottleUI = this.hkw;
      if ((localOpenBottleUI.bGS != null) && (localOpenBottleUI.bGS.ckz())) {
        OpenBottleUI.hlW.a(localOpenBottleUI);
      }
      localOpenBottleUI.setScreenEnable(true);
      localOpenBottleUI.hmf = bi.VG();
    }
    au.HU();
    com.tencent.mm.model.c.FW().a(this);
    z.Ni().a(this);
    au.DF().a(106, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BottleBeachUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */