package com.tencent.mm.plugin.shake.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.z;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.gw;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.shake.e.a.a;
import com.tencent.mm.plugin.shake.e.c.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.aij;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;

public class TVInfoUI
  extends MMPreference
  implements com.tencent.mm.ab.e, y.a
{
  private long bJC;
  private TextView eBO;
  protected ProgressDialog eHw = null;
  protected com.tencent.mm.ui.base.preference.f eOE;
  private ImageView hEf;
  private boolean mJg = false;
  private boolean mLF = false;
  private c.a nbA;
  private com.tencent.mm.plugin.shake.e.b nbB;
  private String nby = "";
  private TextView nbz;
  
  private void a(c.a parama)
  {
    if (parama == null)
    {
      x.e("MicroMsg.TVInfoUI", "refreshViewByProduct(), pd == null");
      finish();
      return;
    }
    this.eBO.setText(parama.field_title);
    if (bi.oW(parama.field_topic)) {
      this.nbz.setVisibility(8);
    }
    for (;;)
    {
      this.hEf = ((ImageView)findViewById(R.h.tvinfo_header_img));
      if (!bi.oW(parama.field_playurl))
      {
        ImageView localImageView = (ImageView)findViewById(R.h.tvinfo_detail_play_img);
        localImageView.setVisibility(0);
        localImageView.setOnClickListener(new TVInfoUI.1(this, parama));
        this.hEf.setOnClickListener(new TVInfoUI.2(this, parama));
      }
      addIconOptionMenu(0, R.g.mm_title_btn_menu, new TVInfoUI.3(this));
      if ((!bi.oW(parama.field_id)) && (!this.mLF) && (!getIntent().getBooleanExtra("key_TV_come_from_shake", false)))
      {
        int i = getIntent().getIntExtra("key_TV_getProductInfoScene", 0);
        x.d("MicroMsg.TVInfoUI", "GetTVInfo id[%s], scene[%s]", new Object[] { parama.field_id, Integer.valueOf(i) });
        au.DF().a(new com.tencent.mm.plugin.shake.d.a.b(parama.field_id, i), 0);
        this.mLF = true;
      }
      this.hEf.setVisibility(0);
      setBackBtn(new TVInfoUI.4(this));
      x.v("MicroMsg.TVInfoUI", "start postToMainThread initBodyView");
      ah.A(new TVInfoUI.5(this, parama));
      return;
      this.nbz.setText(parama.field_topic);
    }
  }
  
  private void bsG()
  {
    this.bJC = getIntent().getLongExtra("key_TVInfoUI_chatting_msgId", 0L);
    if ((this.bJC > 0L) && (au.HX()))
    {
      au.HU();
      bd localbd = com.tencent.mm.model.c.FT().dW(this.bJC);
      if (localbd.field_msgId > 0L)
      {
        localbd.eq(this.nbB.Vv());
        au.HU();
        com.tencent.mm.model.c.FT().a(this.bJC, localbd);
      }
    }
  }
  
  public final int Ys()
  {
    return R.o.tv_info_pref;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml == null) {
      x.w("MicroMsg.TVInfoUI", "scene == null");
    }
    do
    {
      do
      {
        do
        {
          return;
        } while (paraml.getType() != 552);
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          x.e("MicroMsg.TVInfoUI", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          Toast.makeText(this, R.l.scan_tv_get_tvinfo_fail_tips, 0).show();
          return;
        }
        if (this.nbA == null)
        {
          x.w("MicroMsg.TVInfoUI", "onSceneEnd tv == null");
          return;
        }
        paramString = (com.tencent.mm.plugin.shake.d.a.b)paraml;
        if ((paramString.diG != null) && (paramString.diG.dIE.dIL != null)) {}
        for (paramString = (aij)paramString.diG.dIE.dIL; paramString == null; paramString = null)
        {
          x.w("MicroMsg.TVInfoUI", "onSceneEnd tvInfo == null");
          return;
        }
      } while (paramString.rjF == null);
      x.d("MicroMsg.TVInfoUI", "onSceneEnd  tvInfo.DescriptionXML != null, res:" + paramString.rjF);
      paramString = com.tencent.mm.plugin.shake.e.c.Lk(paramString.rjF);
    } while ((this.nbA == null) || (this.nbA.field_xml == null) || (paramString == null) || (paramString.field_xml == null) || (this.nbA.field_xml.equals(paramString.field_xml)));
    this.nbA = paramString;
    a(this.nbA);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    x.d("MicroMsg.TVInfoUI", "onPreferenceTreeClick item: [%s]", new Object[] { paramPreference.mKey });
    if ((this.nbA == null) || (this.nbA.mNX == null))
    {
      x.e("MicroMsg.TVInfoUI", "tv == null || tv.actionlist == null");
      return false;
    }
    Intent localIntent;
    try
    {
      int i = Integer.valueOf(paramPreference.mKey).intValue();
      int j = i / 100;
      int k = i % 100;
      x.v("MicroMsg.TVInfoUI", "keyId=[%s], ii=[%s], jj=[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      if ((j < 0) || (j >= this.nbA.mNX.size()))
      {
        x.w("MicroMsg.TVInfoUI", "index out of bounds, ii=[%s], list Size=[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(this.nbA.mNX.size()) });
        return false;
      }
      paramf = (com.tencent.mm.plugin.shake.e.a)this.nbA.mNX.get(j);
      if (paramf == null)
      {
        x.w("MicroMsg.TVInfoUI", "actionList == null");
        return false;
      }
      if ((k < 0) || (k >= paramf.egs.size()))
      {
        x.w("MicroMsg.TVInfoUI", "index out of bounds, jj=[%s], actions Size=[%s]", new Object[] { Integer.valueOf(k), Integer.valueOf(paramf.egs.size()) });
        return false;
      }
      paramf = (a.a)paramf.egs.get(k);
      if (paramf == null)
      {
        x.w("MicroMsg.TVInfoUI", "action == null");
        return false;
      }
      x.v("MicroMsg.TVInfoUI", "action type:" + paramf.type + ", target:" + paramf.nbK + ", targetDesc:" + paramf.nbM + ", targetDesc2:" + paramf.nbN);
      if (paramf.type == 3)
      {
        paramPreference = new Intent();
        paramPreference.putExtra("rawUrl", paramf.nbK);
        paramPreference.putExtra("show_bottom", false);
        paramPreference.putExtra("geta8key_scene", 10);
        paramPreference.putExtra("srcUsername", paramf.nbN);
        com.tencent.mm.plugin.shake.a.ezn.j(paramPreference, this);
      }
      else if (paramf.type == 4)
      {
        au.HU();
        paramPreference = com.tencent.mm.model.c.FR().Yg(paramf.nbK);
        if (paramPreference == null) {
          break label707;
        }
        localIntent = new Intent();
        if ((com.tencent.mm.l.a.gd(paramPreference.field_type)) && (paramPreference.ckW()))
        {
          z.MY().kA(paramf.nbK);
          if (paramf.nbM.equals("1"))
          {
            localIntent.putExtra("Chat_User", paramf.nbK);
            localIntent.putExtra("finish_direct", true);
            com.tencent.mm.plugin.shake.a.ezn.e(localIntent, this);
          }
        }
      }
    }
    catch (Exception paramf)
    {
      x.e("MicroMsg.TVInfoUI", "onPreferenceTreeClick, [%s]", new Object[] { paramf.getMessage() });
      x.printErrStackTrace("MicroMsg.TVInfoUI", paramf, "", new Object[0]);
      return false;
    }
    localIntent.putExtra("Contact_User", paramf.nbK);
    localIntent.putExtra("force_get_contact", true);
    d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
    break label707;
    if (paramf.type == 5)
    {
      paramPreference = new gw();
      paramPreference.bQd.actionCode = 11;
      paramPreference.bQd.result = paramf.nbK;
      paramPreference.bQd.context = this;
      paramPreference.bJX = null;
      com.tencent.mm.sdk.b.a.sFg.a(paramPreference, Looper.myLooper());
    }
    else if (paramf.type == 6)
    {
      paramPreference = new Intent();
      paramPreference.putExtra("key_product_id", paramf.nbK);
      paramPreference.putExtra("key_product_scene", 9);
      d.b(this, "product", ".ui.MallProductUI", paramPreference);
    }
    label707:
    return true;
  }
  
  public final int auY()
  {
    return R.i.tv_info_header_view;
  }
  
  protected final int getLayoutId()
  {
    return R.i.tv_info;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.scan_tv_detail_title);
    this.eOE = this.tCL;
    this.eBO = ((TextView)findViewById(R.h.tvinfo_title));
    this.nbz = ((TextView)findViewById(R.h.tvinfo_topic_tv));
    String str2 = getIntent().getStringExtra("key_TV_xml");
    String str1 = str2;
    if (bi.oW(str2))
    {
      byte[] arrayOfByte = getIntent().getByteArrayExtra("key_TV_xml_bytes");
      str1 = str2;
      if (arrayOfByte != null) {
        str1 = new String(arrayOfByte);
      }
    }
    x.d("MicroMsg.TVInfoUI", "tvinfo xml : %s", new Object[] { str1 });
    this.nbA = com.tencent.mm.plugin.shake.e.c.Lk(str1);
    if (this.nbA == null)
    {
      x.e("MicroMsg.TVInfoUI", "initView(), tv == null");
      finish();
      return;
    }
    a(this.nbA);
  }
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    if (paramString != null)
    {
      if (paramBitmap == null) {}
      for (boolean bool = true;; bool = false)
      {
        x.d("MicroMsg.TVInfoUI", "onGetPictureFinish pic, url = [%s], bitmap is null ? [%B]", new Object[] { paramString, Boolean.valueOf(bool) });
        try
        {
          ah.A(new TVInfoUI.7(this, paramString, paramBitmap));
          return;
        }
        catch (Exception paramString)
        {
          x.e("MicroMsg.TVInfoUI", "onGetPictureFinish : [%s]", new Object[] { paramString.getLocalizedMessage() });
          x.printErrStackTrace("MicroMsg.TVInfoUI", paramString, "", new Object[0]);
          return;
        }
      }
    }
    x.e("MicroMsg.TVInfoUI", "onUpdate pic, url  is null ");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    y.b(this);
    initView();
  }
  
  protected void onDestroy()
  {
    y.c(this);
    super.onDestroy();
  }
  
  protected void onPause()
  {
    au.DF().b(552, this);
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    au.DF().a(552, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/TVInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */