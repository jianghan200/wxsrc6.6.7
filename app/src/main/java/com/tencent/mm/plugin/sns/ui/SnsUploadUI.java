package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.ab.l;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.j;
import com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.KeyboardLinearLayout;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.e.h;
import com.tencent.mm.ui.i.a.a;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(17)
public class SnsUploadUI
  extends MMActivity
  implements LocationWidget.a
{
  private SnsAdClick bYl = null;
  private String desc;
  private SnsUploadConfigView nLD;
  private boolean nOU = false;
  private int nOh = 0;
  private String nQQ = "";
  private String nQR = "";
  private SnsEditText nRk;
  private z nRl = null;
  private LinearLayout nRm;
  private int nRo = 0;
  private int nRp = 0;
  private ArrayList<String> nRq;
  private boolean nRr = false;
  private boolean nRt = false;
  private long nRu = 0L;
  private AtContactWidget ogK;
  private LocationWidget ogL;
  private RangeWidget ogM;
  private SnsUploadSayFooter ogN;
  private KeyboardLinearLayout ogO;
  private boolean ogP = false;
  private boolean ogQ = false;
  private String ogR = null;
  private FrameLayout ogS = null;
  private long ogT = 0L;
  
  private void aa(Intent paramIntent)
  {
    Object localObject1 = null;
    this.ogM.a(5, -1, paramIntent, this.ogK);
    int j = paramIntent.getIntExtra("Ktag_range_index", 0);
    if (j >= 2)
    {
      this.nQQ = paramIntent.getStringExtra("Klabel_name_list");
      this.nQR = paramIntent.getStringExtra("Kother_user_name_list");
      if (bi.oW(this.nQQ)) {
        break label441;
      }
    }
    label234:
    label333:
    label338:
    label438:
    label441:
    for (paramIntent = Arrays.asList(this.nQQ.split(","));; paramIntent = null)
    {
      if (!bi.oW(this.nQR)) {
        localObject1 = Arrays.asList(this.nQR.split(","));
      }
      this.nRq = new ArrayList();
      this.nRo = 0;
      HashSet localHashSet;
      Object localObject2;
      int i;
      if ((paramIntent != null) && (paramIntent.size() > 0))
      {
        Iterator localIterator = paramIntent.iterator();
        localHashSet = new HashSet();
        if (localIterator.hasNext())
        {
          localObject2 = (String)localIterator.next();
          localObject2 = com.tencent.mm.plugin.label.a.a.aYK().FD(com.tencent.mm.plugin.label.a.a.aYK().FA((String)localObject2));
          if ((localObject2 == null) || (((List)localObject2).size() == 0)) {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SnsUploadUI", "dz: getContactNamesFromLabelsAndOtherUserName,namelist get bu label is null");
          }
        }
        else
        {
          this.nRq = new ArrayList(localHashSet);
        }
      }
      else
      {
        if (paramIntent == null) {
          break label338;
        }
        paramIntent = paramIntent.iterator();
        i = 0;
        if (!paramIntent.hasNext()) {
          break label333;
        }
        if (bi.oW((String)paramIntent.next())) {
          break label438;
        }
        i += 1;
      }
      for (;;)
      {
        break label234;
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          localHashSet.add(str);
          this.nRo += 1;
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsUploadUI", "dz:name : %s", new Object[] { str });
        }
        break;
        this.nRo = i;
        this.nRp = 0;
        if ((localObject1 != null) && (((List)localObject1).size() > 0))
        {
          paramIntent = ((List)localObject1).iterator();
          while (paramIntent.hasNext())
          {
            localObject1 = (String)paramIntent.next();
            if (!this.nRq.contains(localObject1))
            {
              this.nRq.add(localObject1);
              this.nRp += 1;
            }
          }
        }
        if (j == 2)
        {
          this.nRr = false;
          return;
        }
        this.nRr = true;
        return;
      }
    }
  }
  
  private void bEy()
  {
    if (((this.nOh == 0) && (((ah)this.nRl).nPY.nQj.size() > 0)) || (this.nOh == 14) || ((this.nOh == 9) && (!bi.oW(this.nRk.getText().toString()))))
    {
      h.a(this, i.j.sns_upload_exit_and_save_tips, 0, i.j.sns_upload_exit_save, i.j.sns_upload_exit_not_save, true, new SnsUploadUI.14(this), new SnsUploadUI.15(this), i.c.alert_btn_color_no);
      return;
    }
    h.a(this, i.j.sns_upload_cancel_tips, 0, i.j.app_alert_exit, i.j.app_cancel, false, new SnsUploadUI.16(this), null, i.c.alert_btn_color_warn);
  }
  
  private void bEz()
  {
    if (this.bYl != null) {
      this.bYl.in(10);
    }
    setResult(0, new Intent());
    finish();
  }
  
  public final ArrayList<Exif.a> bCh()
  {
    if ((this.nRl instanceof ah))
    {
      ah localah = (ah)this.nRl;
      Object localObject1 = localah.nPY.nQj;
      ArrayList localArrayList = new ArrayList();
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (String)((Iterator)localObject1).next();
        localObject2 = (Exif.a)localah.nQa.get(localObject2);
        if (localObject2 != null) {
          localArrayList.add(localObject2);
        }
      }
      return localArrayList;
    }
    return null;
  }
  
  public final boolean bCi()
  {
    return this.nOU;
  }
  
  public final void bEA()
  {
    if (this.nRl.bBU())
    {
      enableOptionMenu(true);
      return;
    }
    enableOptionMenu(false);
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_upload_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.nRk != null) {
      this.nRk.clearFocus();
    }
    if (paramInt2 != -1) {}
    do
    {
      boolean bool;
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if (this.nRl.d(paramInt1, paramIntent)) {
                bEA();
              }
              switch (paramInt1)
              {
              case 7: 
              case 9: 
              default: 
                return;
              }
            } while (paramIntent == null);
            getIntent().putExtras(paramIntent.getExtras());
            aa(paramIntent);
            return;
          } while (paramIntent == null);
          getIntent().putExtras(paramIntent.getExtras());
          this.ogK.Y(paramIntent);
          return;
        } while (paramIntent == null);
        bool = paramIntent.getBooleanExtra("bind_facebook_succ", false);
        paramIntent = this.nLD;
      } while (!bool);
      paramIntent.ogw = true;
      paramIntent.setSyncFacebook(true);
      return;
    } while (paramIntent == null);
    getIntent().putExtras(paramIntent.getExtras());
    this.ogL.Y(paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = true;
    com.tencent.mm.pluginsdk.e.k(this);
    super.onCreate(paramBundle);
    lF(this.mController.tml.getResources().getColor(i.c.white));
    cqh();
    getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    this.nRt = getIntent().getBooleanExtra("KSnsPostManu", false);
    this.nRu = getIntent().getLongExtra("KTouchCameraTime", 0L);
    this.nOh = getIntent().getIntExtra("Ksnsupload_type", 0);
    this.bYl = ((SnsAdClick)getIntent().getParcelableExtra("KsnsAdTag"));
    this.nOU = getIntent().getBooleanExtra("Kis_take_photo", false);
    this.ogP = getIntent().getBooleanExtra("need_result", false);
    this.ogQ = getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false);
    this.ogR = getIntent().getStringExtra("Ksnsupload_canvas_info");
    this.nRk = ((SnsEditText)findViewById(i.f.sns_desc_tv));
    this.nRk.setTextSize(1, com.tencent.mm.ui.ah.fe(this.mController.tml) * this.nRk.getTextSize() / com.tencent.mm.bp.a.getDensity(this.mController.tml));
    Object localObject2;
    if (!bi.oW(getIntent().getStringExtra(e.h.thz)))
    {
      this.nRk.setText(com.tencent.mm.ui.e.c.b.d(this.mController.tml, getIntent().getStringExtra(e.h.thz), this.nRk.getTextSize()));
      if (this.nOh == 8)
      {
        localObject1 = getIntent().getStringExtra(e.h.thz);
        this.nRk.setText(com.tencent.mm.ui.e.c.b.d(this.mController.tml, (CharSequence)localObject1, this.nRk.getTextSize()));
      }
      this.ogO = ((KeyboardLinearLayout)findViewById(i.f.root));
      this.ogN = ((SnsUploadSayFooter)findViewById(i.f.say_footer));
      this.ogN.setMMEditText(this.nRk);
      this.ogN.setVisibility(8);
      this.ogS = ((FrameLayout)findViewById(i.f.root_fr));
      this.ogS.post(new SnsUploadUI.17(this));
      this.nRk.setOnClickListener(new SnsUploadUI.2(this));
      this.nRk.setOnLongClickListener(new SnsUploadUI.3(this));
      localObject1 = (WrapScollview)findViewById(i.f.scroll_view);
      ((WrapScollview)localObject1).setContentView(this.nRk);
      ((WrapScollview)localObject1).setDoComputeScrollDeltaToGetChildRectOnScreen(false);
      localObject2 = bi.aG(getIntent().getStringExtra("reportSessionId"), "");
      this.nLD = ((SnsUploadConfigView)findViewById(i.f.config_view));
      localObject1 = this.nLD;
      if ((this.nOh != 14) || (((String)localObject2).contains("wx5dfbe0a95623607b"))) {
        break label1542;
      }
      bool1 = true;
      label517:
      ((SnsUploadConfigView)localObject1).ogC = bool1;
      if (bool1)
      {
        g.Ek();
        g.Eh().dpP.a(2842, (com.tencent.mm.ab.e)localObject1);
        localObject2 = new j();
        g.Ek();
        g.Eh().dpP.a((l)localObject2, 0);
      }
      ((SnsUploadConfigView)localObject1).ogD.rms = -1000.0F;
      ((SnsUploadConfigView)localObject1).ogD.rmr = -1000.0F;
      if (!((SnsUploadConfigView)localObject1).oaw)
      {
        g.Ek();
        i = bi.f((Integer)g.Ei().DT().get(68404, null));
        if ((i & 0x2) == 0) {
          break label1548;
        }
        bool1 = true;
        label636:
        ((SnsUploadConfigView)localObject1).ogw = bool1;
        if ((i & 0x8) == 0) {
          break label1554;
        }
        bool1 = true;
        label653:
        ((SnsUploadConfigView)localObject1).ogx = bool1;
        if (!com.tencent.mm.al.b.PD()) {
          ((SnsUploadConfigView)localObject1).ogx = false;
        }
        if (!com.tencent.mm.model.q.He()) {
          ((SnsUploadConfigView)localObject1).ogw = false;
        }
      }
      ((SnsUploadConfigView)localObject1).setSyncFacebook(false);
      ((SnsUploadConfigView)localObject1).bEs();
      ((SnsUploadConfigView)localObject1).bEu();
      ((SnsUploadConfigView)localObject1).bEt();
      if (((SnsUploadConfigView)localObject1).ogx) {
        ((SnsUploadConfigView)localObject1).ogE.a((a.a)localObject1);
      }
      if (this.nOh != 0)
      {
        localObject1 = this.nLD;
        ((SnsUploadConfigView)localObject1).ogr.setVisibility(8);
        ((SnsUploadConfigView)localObject1).ogs.setVisibility(8);
        ((SnsUploadConfigView)localObject1).ogt.setVisibility(8);
        ((SnsUploadConfigView)localObject1).ogu.setVisibility(8);
      }
      if (this.nOh == 9) {
        this.nLD.ogt.setVisibility(0);
      }
      setBackBtn(new SnsUploadUI.4(this));
      a(0, getString(i.j.sns_send), new SnsUploadUI.5(this), s.b.tmX);
      findViewById(i.f.upload_content).setOnTouchListener(new SnsUploadUI.6(this));
      this.ogK = ((AtContactWidget)findViewById(i.f.at_contact_widget));
      this.ogK.nLD = this.nLD;
      this.ogL = ((LocationWidget)findViewById(i.f.location_widget));
      this.ogL.setLocationWidgetListener(this);
      switch (this.nOh)
      {
      default: 
        label984:
        this.ogM.nLD = this.nLD;
        this.ogL.Y(getIntent());
        this.ogK.Y(getIntent());
        aa(getIntent());
        YC();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsUploadUI", "share type %d, isManuSnsPost:%b", new Object[] { Integer.valueOf(this.nOh), Boolean.valueOf(this.nRt) });
        if ((this.nOh == 0) || (this.nOh == 14) || (this.nOh == 9))
        {
          localObject1 = Parcel.obtain();
          getIntent().writeToParcel((Parcel)localObject1, 0);
          localObject1 = ((Parcel)localObject1).marshall();
          if (this.nOh == 9)
          {
            g.Ek();
            g.Ei().DT().a(aa.a.sQM, bi.bE((byte[])localObject1));
            setMMTitle(this.mController.tml.getResources().getString(i.j.sns_text_title));
          }
        }
        else
        {
          label1160:
          switch (this.nOh)
          {
          }
        }
        break;
      }
    }
    for (;;)
    {
      this.nRl.G(paramBundle);
      if (!(this.nRl instanceof a)) {
        break label2038;
      }
      paramBundle = findViewById(i.f.sns_desc_container_frame);
      localObject2 = findViewById(i.f.sns_img_tips);
      localObject1 = (DynamicGridView)findViewById(i.f.sns_preview_img_dynamicgrid);
      ((DynamicGridView)localObject1).setOnTouchListener(new SnsUploadUI.11(this));
      paramBundle = ((a)this.nRl).a(paramBundle, findViewById(i.f.del_area), (DynamicGridView)localObject1, (View)localObject2);
      ((DynamicGridView)localObject1).setVisibility(0);
      localObject1 = findViewById(i.f.widget_line);
      localObject2 = (RelativeLayout.LayoutParams)((View)localObject1).getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject2).addRule(3, i.f.sns_preview_img_dynamicgrid);
      ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      if ((this.nRl instanceof aa))
      {
        localObject1 = (LinearLayout.LayoutParams)paramBundle.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).width = -1;
        paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
      if (((this.nRl instanceof p)) || ((this.nRl instanceof n)) || ((this.nRl instanceof o)))
      {
        localObject1 = (LinearLayout.LayoutParams)paramBundle.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).width = -1;
        paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
      bEA();
      this.ogO.setOnkbdStateListener(new KeyboardLinearLayout.a()
      {
        public final void qN(int paramAnonymousInt)
        {
          if (paramAnonymousInt == -3)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsUploadUI", "KEYBOARD_STATE_SHOW");
            new ag().postDelayed(new SnsUploadUI.12.1(this), 100L);
            return;
          }
          new ag().postDelayed(new SnsUploadUI.12.2(this), 200L);
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsUploadUI", "KEYBOARD_STATE_HIDE");
        }
      });
      if (this.nOh == 0)
      {
        if ((this.nRl instanceof ah)) {
          break label2185;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SnsUploadUI", "!(widget instanceof PicWidget)");
      }
      label1500:
      com.tencent.mm.pluginsdk.e.l(this);
      return;
      if ((this.nRk == null) || (paramBundle == null)) {
        break;
      }
      localObject1 = paramBundle.getString("contentdesc");
      if (localObject1 == null) {
        break;
      }
      this.nRk.setText((CharSequence)localObject1);
      break;
      label1542:
      bool1 = false;
      break label517;
      label1548:
      bool1 = false;
      break label636;
      label1554:
      bool1 = false;
      break label653;
      this.ogM = ((RangeWidget)findViewById(i.f.rang_widget_bottom));
      findViewById(i.f.rang_widget_top).setVisibility(8);
      break label984;
      this.ogM = ((RangeWidget)findViewById(i.f.rang_widget_bottom));
      findViewById(i.f.rang_widget_top).setVisibility(8);
      break label984;
      this.ogM = ((RangeWidget)findViewById(i.f.rang_widget_bottom));
      findViewById(i.f.rang_widget_top).setVisibility(8);
      this.ogK.setVisibility(8);
      break label984;
      g.Ek();
      g.Ei().DT().a(aa.a.sQL, bi.bE((byte[])localObject1));
      setMMTitle("");
      break label1160;
      this.nRl = new ah(this);
      this.nRk.addTextChangedListener(new SnsUploadUI.1(this));
      continue;
      this.nRl = new ad(this);
      continue;
      this.nRl = new aa(this);
      continue;
      this.nRl = new ac(this);
      continue;
      this.nRl = new ai(this, 9);
      continue;
      this.nRl = new ai(this, 12);
      continue;
      this.nRl = new p(this);
      continue;
      this.nRl = new n(this);
      continue;
      this.nRl = new q(this);
      continue;
      this.nRl = new o(this);
      continue;
      this.nRl = new ai(this, 14);
      continue;
      this.nRl = new ai(this, 13);
    }
    g.Ek();
    Object localObject1 = bi.aG((String)g.Ei().DT().get(68408, ""), "");
    g.Ek();
    int i = bi.a((Integer)g.Ei().DT().get(7489, Integer.valueOf(0)), 0);
    if (!bi.oW((String)localObject1)) {}
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.nRl = new ae(this, bool1);
      this.nRk.setPasterLen(i);
      this.nRk.setText(com.tencent.mm.ui.e.c.b.d(this.mController.tml, (CharSequence)localObject1, this.nRk.getTextSize()));
      this.nRk.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable) {}
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          if (SnsUploadUI.a(SnsUploadUI.this).getText().toString().trim().length() > 0)
          {
            SnsUploadUI.this.enableOptionMenu(true);
            return;
          }
          SnsUploadUI.this.enableOptionMenu(false);
        }
      });
      break;
      this.nRl = new be(this);
      break;
      label2038:
      paramBundle = this.nRl.bBV();
      this.nRm = ((LinearLayout)findViewById(i.f.widget_content));
      this.nRm.setVisibility(0);
      this.nRm.setClipChildren(false);
      label2090:
      float f;
      if (paramBundle != null)
      {
        this.nRm.addView(paramBundle);
        if ((this.nOh == 9) || (this.nOh == 14))
        {
          localObject1 = findViewById(i.f.widget_line);
          localObject2 = (RelativeLayout.LayoutParams)((View)localObject1).getLayoutParams();
          f = c.chu().density;
          if (this.nOh != 9) {
            break label2179;
          }
        }
      }
      label2179:
      for (i = 128;; i = 96)
      {
        ((RelativeLayout.LayoutParams)localObject2).topMargin = ((int)(i * f));
        ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        break;
        this.nRm.setVisibility(8);
        break label2090;
      }
      label2185:
      if (Build.VERSION.SDK_INT < 11)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsUploadUI", "sdk not support dragdrop event");
        break label1500;
      }
      new SnsUploadUI.13(this).run();
      break label1500;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    Object localObject;
    if (this.nLD != null)
    {
      localObject = this.nLD;
      g.Ek();
      g.Eh().dpP.b(2842, (com.tencent.mm.ab.e)localObject);
    }
    if (this.nRl != null) {
      this.nRl.bBW();
    }
    if (this.ogL != null) {
      this.ogL.stop();
    }
    if (this.ogN != null)
    {
      localObject = this.ogN;
      if (((SnsUploadSayFooter)localObject).kXH != null)
      {
        ((SnsUploadSayFooter)localObject).kXH.um();
        ((SnsUploadSayFooter)localObject).kXH.destroy();
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4)
    {
      paramKeyEvent = this.ogN;
      if ((paramKeyEvent.bEw()) || (paramKeyEvent.getVisibility() == 0)) {}
      for (paramInt = 1; paramInt != 0; paramInt = 0)
      {
        this.ogN.bEx();
        return true;
      }
      bEy();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    if (this.nOh == 9)
    {
      String str = this.nRk.getText().toString().trim();
      g.Ek();
      g.Ei().DT().set(68408, str);
      if (bi.oW(str)) {
        break label82;
      }
      g.Ek();
      g.Ei().DT().set(7489, Integer.valueOf(this.nRk.getPasterLen()));
    }
    for (;;)
    {
      super.YC();
      super.onPause();
      return;
      label82:
      g.Ek();
      g.Ei().DT().set(7489, Integer.valueOf(0));
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsUploadUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      this.ogL.bCe();
      return;
    }
    h.a(this, getString(i.j.permission_location_request_again_msg), getString(i.j.permission_tips_title), getString(i.j.jump_to_settings), getString(i.j.app_cancel), false, new SnsUploadUI.8(this), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
      }
    });
  }
  
  protected void onResume()
  {
    super.onResume();
    this.ogN.post(new SnsUploadUI.7(this));
    if ((this.nRl != null) && ((this.nRl instanceof ad)))
    {
      ad localad = (ad)this.nRl;
      if ((localad.nOQ != null) && (!bi.oW(localad.videoPath))) {
        localad.nOQ.aO(localad.videoPath, false);
      }
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (this.nRk != null) {
      paramBundle.putString("contentdesc", this.nRk.getText().toString());
    }
    paramBundle.getString("contentdesc");
    this.nRl.H(paramBundle);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsUploadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */