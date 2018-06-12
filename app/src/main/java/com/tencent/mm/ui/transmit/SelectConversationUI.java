package com.tencent.mm.ui.transmit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.g.a.fx;
import com.tencent.mm.g.a.mw;
import com.tencent.mm.g.a.mw.a;
import com.tencent.mm.g.a.mw.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.ca;
import com.tencent.mm.model.r;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.app.ReportUtil.ReportArgs;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.bd.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.l;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.ui.contact.w;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.ui.widget.a.c.a.b;
import com.tencent.mm.ui.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

@com.tencent.mm.ui.base.a(19)
public class SelectConversationUI
  extends MMBaseSelectContactUI
{
  private static final int uEf = com.tencent.mm.ui.contact.s.s(new int[] { 1, 2 });
  private long bJA;
  private long bJC;
  private String bWW;
  private bd bXQ;
  private int eCt;
  private int fromScene = 0;
  private List<String> gRN;
  private String hvD = null;
  private String imagePath = null;
  private int[] jfV = { R.h.chatting_note_thumb_iv_0, R.h.chatting_note_thumb_iv_1, R.h.chatting_note_thumb_iv_2, R.h.chatting_note_thumb_iv_3, R.h.chatting_note_thumb_iv_4 };
  private int msgType;
  private TextView tFu;
  private MenuItem.OnMenuItemClickListener uEA = new SelectConversationUI.16(this);
  private MenuItem.OnMenuItemClickListener uEB = new SelectConversationUI.17(this);
  private int uEg;
  private boolean uEh = false;
  private boolean uEi = false;
  private boolean uEj = false;
  private boolean uEk = false;
  private boolean uEl = false;
  private boolean uEm = false;
  private boolean uEn = false;
  private int uEo;
  private boolean uEp = false;
  private String uEq;
  private String uEr;
  private Boolean uEs = Boolean.valueOf(false);
  private boolean uEt = false;
  private boolean uEu = false;
  private List<String> uEv = null;
  private ReportUtil.ReportArgs uEw;
  private String uEx;
  private String uEy = null;
  private String uEz;
  private int ubT = -1;
  private boolean ukn;
  private boolean ulx = false;
  
  private void Wp()
  {
    if (!this.uEt) {
      return;
    }
    if ((this.uEv != null) && (this.uEv.size() > 0))
    {
      updateOptionMenuText(1, getString(R.l.app_send) + "(" + this.uEv.size() + ")");
      a(this.uEB);
      enableOptionMenu(1, true);
      return;
    }
    if (!this.uEu)
    {
      updateOptionMenuText(1, getString(R.l.app_multi_selected));
      a(this.uEA);
      enableOptionMenu(1, true);
      return;
    }
    updateOptionMenuText(1, getString(R.l.app_single_selected));
    a(this.uEA);
    enableOptionMenu(1, true);
  }
  
  private void a(Intent paramIntent1, Intent paramIntent2)
  {
    x.d("MicroMsg.SelectConversationUI", "has next step, jump now, intent=" + paramIntent2);
    paramIntent2.putExtras(paramIntent1.getExtras());
    startActivityForResult(paramIntent2, 2);
    com.tencent.mm.ui.base.b.E(this.mController.tml, paramIntent2);
  }
  
  private static void a(Intent paramIntent, String paramString1, String paramString2)
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramString2);
    a(paramIntent, paramString1, localLinkedList);
  }
  
  private static void a(Intent paramIntent, String paramString, List<String> paramList)
  {
    if (paramList.size() > 0)
    {
      paramIntent.putExtra("be_send_card_name", paramString);
      paramIntent.putExtra("received_card_name", com.tencent.mm.platformtools.ai.c(paramList, ","));
      paramIntent.putExtra("Is_Chatroom", false);
    }
  }
  
  private void a(com.tencent.mm.pluginsdk.ui.applet.g.a parama)
  {
    Object localObject = (HashMap)getIntent().getSerializableExtra("appbrand_params");
    int i = ca.getInt(((HashMap)localObject).get("type"), 1);
    String str1 = ca.f(((HashMap)localObject).get("title"), "");
    String str2 = ca.f(((HashMap)localObject).get("img_url"), null);
    if ((i == 2) || (i == 3))
    {
      String str3 = ca.f(((HashMap)localObject).get("app_id"), null);
      i = ca.getInt(((HashMap)localObject).get("pkg_type"), 0);
      int j = ca.getInt(((HashMap)localObject).get("pkg_version"), 0);
      String str4 = ca.f(((HashMap)localObject).get("cache_key"), null);
      String str5 = ca.f(((HashMap)localObject).get("path"), null);
      String str6 = ca.f(((HashMap)localObject).get("delay_load_img_path"), null);
      boolean bool = ca.aW(((HashMap)localObject).get("is_dynamic"));
      localObject = ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.g.class)).bH(this);
      String str7 = com.tencent.mm.plugin.appbrand.q.k.bq(this);
      Bundle localBundle = new Bundle();
      localBundle.putString("app_id", str3);
      localBundle.putString("msg_id", String.format("%d-%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) }));
      localBundle.putInt("msg_pkg_type", i);
      localBundle.putInt("pkg_version", j);
      localBundle.putString("image_url", str2);
      localBundle.putBoolean("is_dynamic_page", bool);
      localBundle.putString("title", str1);
      localBundle.putString("cache_key", str4);
      localBundle.putString("msg_path", str5);
      localBundle.putString("delay_load_img_path", str6);
      ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.g.class)).a(str7, (View)localObject, localBundle);
      parama.dh((View)localObject);
      parama.g(Boolean.valueOf(true));
      parama.cdQ();
      parama.gFM = new SelectConversationUI.24(this, str7, (View)localObject);
      return;
    }
    parama.TH(getResources().getString(R.l.app_brand_default_name_with_brackets) + str1);
    parama.TI(str2).cdP();
    parama.g(Boolean.valueOf(true));
  }
  
  private void a(com.tencent.mm.pluginsdk.ui.applet.g.a parama, String paramString)
  {
    au.HU();
    com.tencent.mm.model.c.FR().Ye(paramString);
    String str = r.gT(paramString);
    if (!bi.oW(this.uEr)) {
      str = this.uEr;
    }
    au.HU();
    ab localab = com.tencent.mm.model.c.FR().Ye(paramString);
    if (com.tencent.mm.model.s.gU(localab.field_verifyFlag)) {
      paramString = getResources().getString(R.l.app_friend_card_biz);
    }
    for (;;)
    {
      parama.TH(paramString + str);
      return;
      if (ab.XR(paramString)) {
        paramString = d(this, localab);
      } else {
        paramString = getResources().getString(R.l.app_friend_card_personal);
      }
    }
  }
  
  private boolean abk(String paramString)
  {
    if ((this.ulx) && (ab.XR(this.uEq)) && (paramString != null) && (paramString.endsWith("@chatroom"))) {}
    try
    {
      h.a(this, getString(R.l.share_openim_card_waring), "", null);
      return true;
      return false;
    }
    catch (Throwable paramString)
    {
      for (;;) {}
    }
  }
  
  private boolean abl(String paramString)
  {
    if (!ab.XR(paramString)) {
      return false;
    }
    if (this.ulx)
    {
      au.HU();
      if (ab.Dk(com.tencent.mm.model.c.FR().Ye(this.uEq).field_verifyFlag))
      {
        abm(paramString);
        return true;
      }
    }
    switch (this.msgType)
    {
    default: 
      return false;
    }
    abm(paramString);
    return true;
  }
  
  private void abm(String paramString)
  {
    try
    {
      paramString = r.gT(paramString);
      h.a(this, getString(R.l.share_openim_forbiden_waring, new Object[] { paramString }), "", null);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  private void az(Intent paramIntent)
  {
    Intent localIntent = paramIntent;
    if (this.msgType == 5)
    {
      localIntent = paramIntent;
      if (paramIntent == null) {
        localIntent = new Intent();
      }
      localIntent.putExtra("emoji_thumb_path", this.uEx);
      localIntent.putExtra("emoji_activity_id", getIntent().getStringExtra("emoji_activity_id"));
    }
    super.setResult(-1, localIntent);
  }
  
  private static void b(Intent paramIntent, String paramString1, String paramString2)
  {
    if (paramString1 != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("cardNameToSend is null", bool);
      paramIntent.putExtra("be_send_card_name", paramString1);
      paramIntent.putExtra("received_card_name", paramString2);
      paramIntent.putExtra("Is_Chatroom", true);
      return;
    }
  }
  
  private void b(com.tencent.mm.pluginsdk.ui.applet.g.a parama)
  {
    Object localObject2;
    Object localObject1;
    int i;
    com.tencent.mm.y.g.a locala;
    switch (this.msgType)
    {
    case 6: 
    case 7: 
    case 14: 
    case 15: 
    default: 
      return;
    case 4: 
      parama.TH(this.bWW);
      parama.cdO();
      return;
    case 0: 
    case 16: 
      localObject2 = cAf();
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if (this.imagePath != null)
        {
          float f = com.tencent.mm.bp.a.getDensity(ad.getContext());
          localObject1 = com.tencent.mm.sdk.platformtools.c.f(this.imagePath, f);
          int j = Exif.fromFile(this.imagePath).getOrientationInDegree();
          i = j;
          if (j < 0) {
            i = 0;
          }
          localObject1 = com.tencent.mm.sdk.platformtools.c.b((Bitmap)localObject1, i);
        }
      }
      parama.c((Bitmap)localObject1, 3);
      return;
    case 1: 
      parama.c(cAe(), 2);
      return;
    case 11: 
      parama.c(cAe(), 2);
      return;
    case 9: 
      au.HU();
      localObject2 = com.tencent.mm.model.c.FT().GS(this.bWW);
      localObject1 = "";
      if (localObject2 != null) {
        localObject1 = ((bd.b)localObject2).label;
      }
      parama.TH(this.mController.tml.getString(R.l.app_location) + (String)localObject1);
      return;
    case 5: 
      if (!bi.oW(this.uEx))
      {
        parama.TJ(this.uEx);
        return;
      }
      if (!bi.oW(this.bXQ.field_imgPath))
      {
        parama.TJ(this.bXQ.field_imgPath);
        return;
      }
      parama.TJ(this.imagePath);
      return;
    case 8: 
      au.HU();
      localObject1 = com.tencent.mm.model.c.FT().GR(this.bWW);
      this.uEq = ((bd.a)localObject1).otZ;
      this.uEr = ((bd.a)localObject1).nickname;
      this.uEs = Boolean.valueOf(com.tencent.mm.model.s.gU(((bd.a)localObject1).pOR));
      a(parama, this.uEq);
      return;
    case 2: 
    case 10: 
      locala = com.tencent.mm.y.g.a.gp(bi.WT(this.bWW));
      if ((this.bXQ.cky()) && (locala == null)) {
        locala = com.tencent.mm.y.g.a.J(bi.WT(this.bWW), bi.WT(this.bWW));
      }
      break;
    }
    for (;;)
    {
      if (locala == null)
      {
        if (this.uEy == null) {
          break;
        }
        localObject1 = getResources().getString(R.l.app_video);
        localObject2 = this.uEy;
        parama.TH((String)localObject1 + (String)localObject2);
        return;
      }
      localObject2 = locala.title;
      if (l.e(this.bXQ, this.ubT)) {
        localObject1 = getResources().getString(R.l.app_brand_default_name_with_brackets);
      }
      for (;;)
      {
        Object localObject3 = localObject2;
        if (localObject2 == null) {
          localObject3 = "";
        }
        parama.TH((String)localObject1 + (String)localObject3);
        if (locala.thumburl == null) {
          break;
        }
        parama.TI(locala.thumburl).cdP();
        return;
        if (locala.type == 5)
        {
          localObject1 = getResources().getString(R.l.app_url);
          localObject3 = locala.url;
        }
        else if (locala.type == 6)
        {
          localObject1 = getResources().getString(R.l.app_file);
        }
        else if (locala.type == 24)
        {
          localObject1 = getResources().getString(R.l.app_note);
          localObject2 = new mw();
          ((mw)localObject2).bXL.type = 0;
          ((mw)localObject2).bXL.bXN = locala.dwW;
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
          localObject2 = bi.aG(((mw)localObject2).bXM.bXV.desc, locala.description).replaceAll("\n", " ");
        }
        else if (locala.type == 19)
        {
          localObject1 = getResources().getString(R.l.app_record);
        }
        else if (locala.type == 3)
        {
          localObject1 = getResources().getString(R.l.app_music);
        }
        else if (locala.type == 4)
        {
          localObject1 = getResources().getString(R.l.app_video);
        }
        else if (locala.type == 8)
        {
          localObject1 = getResources().getString(R.l.app_emoji_share);
        }
        else if ((locala.type == 33) || (locala.type == 36))
        {
          if ((locala.dyU == 2) || (locala.dyU == 3) || (locala.type == 36))
          {
            localObject1 = ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.g.class)).bH(this);
            parama.dh((View)localObject1);
            parama.g(Boolean.valueOf(true));
            parama.cdQ();
            Object localObject4 = com.tencent.mm.ak.o.Pf().d(this.bXQ.field_imgPath, false, true);
            localObject2 = com.tencent.mm.plugin.appbrand.q.k.bq(this);
            localObject3 = new Bundle();
            ((Bundle)localObject3).putString("app_id", locala.dyT);
            ((Bundle)localObject3).putString("msg_id", String.format("%d-%d", new Object[] { Integer.valueOf(locala.dyZ), Integer.valueOf(locala.dyW) }));
            ((Bundle)localObject3).putInt("msg_pkg_type", locala.dyZ);
            ((Bundle)localObject3).putInt("pkg_version", locala.dyW);
            if (!bi.oW((String)localObject4)) {
              ((Bundle)localObject3).putString("image_url", "file://" + (String)localObject4);
            }
            localObject4 = (com.tencent.mm.y.a)locala.u(com.tencent.mm.y.a.class);
            if (localObject4 != null)
            {
              ((Bundle)localObject3).putBoolean("is_dynamic_page", ((com.tencent.mm.y.a)localObject4).dvC);
              ((Bundle)localObject3).putString("cache_key", ((com.tencent.mm.y.a)localObject4).dvD);
            }
            ((Bundle)localObject3).putString("title", locala.title);
            ((Bundle)localObject3).putString("msg_path", locala.dyR);
            ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.g.class)).a((String)localObject2, (View)localObject1, (Bundle)localObject3);
            parama.gFM = new SelectConversationUI.25(this, (String)localObject2, (View)localObject1);
            return;
          }
          localObject1 = getResources().getString(R.l.app_brand_default_name_with_brackets);
        }
        else
        {
          localObject1 = getResources().getString(R.l.app_app);
        }
      }
      localObject1 = com.tencent.mm.platformtools.ai.aG(com.tencent.mm.ui.chatting.k.gL(this.mController.tml).bXM.bXU.title, "");
      parama.TH(getResources().getString(R.l.app_multi_record) + (String)localObject1);
      return;
      localObject1 = com.tencent.mm.ui.chatting.k.gL(this.mController.tml);
      if (((mw)localObject1).bXL.bXR != null) {}
      for (i = ((mw)localObject1).bXL.bXR.size();; i = 0)
      {
        localObject1 = this.mController.tml.getString(R.l.retransmit_msg_count, new Object[] { Integer.valueOf(i) });
        parama.TH(getResources().getString(R.l.app_multi_msg) + (String)localObject1);
        return;
        if (this.hvD == null) {
          break;
        }
        parama.TH(getResources().getString(R.l.app_file) + this.hvD);
        return;
      }
    }
  }
  
  private void c(com.tencent.mm.pluginsdk.ui.applet.g.a parama)
  {
    switch (this.msgType)
    {
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 14: 
    case 15: 
    default: 
    case 4: 
    case 0: 
    case 1: 
    case 11: 
    case 16: 
    case 9: 
    case 2: 
    case 10: 
      Object localObject;
      do
      {
        do
        {
          return;
          parama.a(new SelectConversationUI.2(this));
          return;
          parama.a(new SelectConversationUI.3(this));
          return;
          au.HU();
          localObject = com.tencent.mm.model.c.FT().GS(this.bWW);
          parama.a(new SelectConversationUI.4(this, (bd.b)localObject, ((bd.b)localObject).label));
          return;
          localObject = com.tencent.mm.y.g.a.gp(bi.WT(this.bWW));
        } while (localObject == null);
        if ((((com.tencent.mm.y.g.a)localObject).type == 5) && (!l.e(this.bXQ, this.ubT)))
        {
          parama.a(new SelectConversationUI.5(this, ((com.tencent.mm.y.g.a)localObject).url));
          return;
        }
        if (((com.tencent.mm.y.g.a)localObject).type == 6)
        {
          parama.a(new SelectConversationUI.6(this));
          return;
        }
        if (((com.tencent.mm.y.g.a)localObject).type == 24)
        {
          parama.a(new SelectConversationUI.7(this, (com.tencent.mm.y.g.a)localObject));
          return;
        }
        if (((com.tencent.mm.y.g.a)localObject).type == 19)
        {
          parama.a(new SelectConversationUI.8(this, (com.tencent.mm.y.g.a)localObject));
          return;
        }
        if (((com.tencent.mm.y.g.a)localObject).type == 3)
        {
          parama.a(new SelectConversationUI.9(this, (com.tencent.mm.y.g.a)localObject));
          return;
        }
      } while (((com.tencent.mm.y.g.a)localObject).type != 4);
      parama.a(new c.a.b()
      {
        public final void aMV() {}
      });
      return;
    case 13: 
      parama.a(new SelectConversationUI.11(this));
      return;
    case 12: 
      com.tencent.mm.ui.chatting.k.gL(this.mController.tml);
      return;
    }
    parama.a(new SelectConversationUI.13(this));
  }
  
  private Bitmap cAe()
  {
    com.tencent.mm.modelvideo.o.Ta();
    String str2 = com.tencent.mm.modelvideo.s.nL(this.bXQ.field_imgPath);
    String str1 = str2;
    if (str2 == null) {
      str1 = this.imagePath;
    }
    return com.tencent.mm.sdk.platformtools.c.Wb(str1);
  }
  
  private Bitmap cAf()
  {
    Object localObject;
    if (this.bXQ == null) {
      localObject = null;
    }
    String str;
    Bitmap localBitmap;
    do
    {
      return (Bitmap)localObject;
      str = this.bXQ.field_imgPath;
      localObject = com.tencent.mm.ak.o.Pf();
      float f = com.tencent.mm.bp.a.getDensity(ad.getContext());
      localBitmap = com.tencent.mm.sdk.platformtools.c.b(((com.tencent.mm.ak.g)localObject).d(str, false, true), f, 0);
      localObject = localBitmap;
    } while (localBitmap == null);
    try
    {
      int j = Exif.fromFile(str).getOrientationInDegree();
      int i = j;
      if (j < 0) {
        i = 0;
      }
      localObject = com.tencent.mm.sdk.platformtools.c.b(localBitmap, i);
      return (Bitmap)localObject;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.SelectConversationUI", localThrowable, "unexpected exception.", new Object[0]);
    }
    return localBitmap;
  }
  
  private void cAg()
  {
    x.i("MicroMsg.SelectConversationUI", "doCallSelectContactUIForMultiRetransmit");
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_type", 14);
    localIntent.putExtra("titile", getString(R.l.address_title_select_contact));
    localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.ukK);
    localIntent.putExtra("already_select_contact", com.tencent.mm.platformtools.ai.c(this.uEv, ","));
    localIntent.putExtra("max_limit_num", 9);
    if ((this.ulx) && (ab.XR(this.uEq))) {}
    for (boolean bool = true;; bool = false)
    {
      localIntent.putExtra("Forbid_SelectChatRoom", bool);
      this.mController.tml.startActivityForResult(localIntent, 5);
      return;
    }
  }
  
  private void cAh()
  {
    boolean bool = true;
    x.i("MicroMsg.SelectConversationUI", "doSendCardOrQRCode2CallSelectContactUI");
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.ukH);
    localIntent.putExtra("list_type", 3);
    localIntent.putExtra("be_send_card_name", this.uEq);
    localIntent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
    localIntent.putExtra("Add_SendCard", true);
    localIntent.putExtra("titile", getString(R.l.address_title_select_contact));
    if ((this.ulx) && (ab.XR(this.uEq))) {}
    for (;;)
    {
      localIntent.putExtra("Forbid_SelectChatRoom", bool);
      this.mController.tml.startActivityForResult(localIntent, 3);
      return;
      bool = false;
    }
  }
  
  private void cAi()
  {
    x.i("MicroMsg.SelectConversationUI", "doCallSelectContactUI");
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_type", 5);
    localIntent.putExtra("titile", getString(R.l.address_title_select_contact));
    if (((this.fromScene != 4) && (this.fromScene != 9)) || ((getIntent().getIntExtra("jsapi_select_mode", 0) == 1) || (this.fromScene == 10)))
    {
      localIntent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
      localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.s(new int[] { 32, 16, 1, 2, 4, 16384 }));
    }
    for (;;)
    {
      this.mController.tml.startActivityForResult(localIntent, 1);
      return;
      localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.ukJ);
    }
  }
  
  public static String d(Context paramContext, ab paramab)
  {
    paramab = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.openim.a.b.class)).g(paramab.field_openImAppid, "openim_card_type_name", b.a.eui);
    if (TextUtils.isEmpty(paramab)) {
      return paramContext.getResources().getString(R.l.app_friend_card_personal);
    }
    return String.format("[%s]", new Object[] { paramab });
  }
  
  private boolean mx(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.uEv.size() < 9) {}
    }
    else {
      while (this.uEv.size() > 9)
      {
        String str = getString(R.l.select_contact_num_limit_tips_withgroup, new Object[] { Integer.valueOf(getIntent().getIntExtra("max_limit_num", 9)) });
        h.a(this.mController.tml, str, getString(R.l.app_remind), new SelectConversationUI.18(this));
        return true;
      }
    }
    return false;
  }
  
  private void n(Intent paramIntent, String paramString)
  {
    if (abl(paramString)) {
      return;
    }
    if (com.tencent.mm.ui.contact.s.fb(this.eCt, 256))
    {
      az(paramIntent);
      finish();
      return;
    }
    if (com.tencent.mm.platformtools.ai.oW(paramString))
    {
      x.v("MicroMsg.SelectConversationUI", "avatarUseName is null or nil show dialog fail ");
      return;
    }
    if (com.tencent.mm.model.s.fq(paramString))
    {
      int i = com.tencent.mm.model.m.gK(paramString);
      if (this.uEp)
      {
        int j = com.tencent.mm.platformtools.ai.getInt(com.tencent.mm.k.g.AT().getValue("CheckBigFileUploadChatroomMemberCountLimit"), 50);
        if (i > j)
        {
          x.w("MicroMsg.SelectConversationUI", "summerbig SelectConversationUI group limit[%d], count[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          h.b(this, getString(R.l.select_contact_num_limit_tips_bigfile, new Object[] { Integer.valueOf(j) }), "", true);
          return;
        }
      }
      getString(R.l.select_contact_num, new Object[] { Integer.valueOf(i) });
    }
    com.tencent.mm.pluginsdk.ui.applet.g.a locala = new com.tencent.mm.pluginsdk.ui.applet.g.a(this.mController.tml);
    locala.bZ(paramString);
    if (this.ulx)
    {
      a(locala, this.uEq);
      if (paramString.endsWith("@chatroom"))
      {
        b(paramIntent, this.uEq, paramString);
        locala.g(Boolean.valueOf(true));
      }
    }
    for (;;)
    {
      locala.BX(R.l.app_send).a(new SelectConversationUI.23(this, paramIntent)).eIW.show();
      return;
      a(paramIntent, this.uEq, paramString);
      break;
      if (this.uEi)
      {
        if (this.bJA != -1L)
        {
          c(locala);
          paramString = new fx();
          paramString.bOG.bJA = this.bJA;
          paramString.bOG.bOH = locala;
          paramString.bOG.bOI = this.uEz;
          paramString.bOG.bHj = this.mController.tml;
          com.tencent.mm.sdk.b.a.sFg.m(paramString);
        }
        for (;;)
        {
          locala.g(Boolean.valueOf(true));
          break;
          if ((this.msgType == 17) && (this.uEo != 0))
          {
            paramString = this.mController.tml.getString(R.l.retransmit_msg_count, new Object[] { Integer.valueOf(this.uEo) });
            locala.TH(getResources().getString(R.l.app_multi_msg) + paramString);
          }
        }
      }
      String str;
      if (this.uEj)
      {
        Object localObject = (HashMap)getIntent().getSerializableExtra("webview_params");
        paramString = (String)((HashMap)localObject).get("img_url");
        str = (String)((HashMap)localObject).get("title");
        localObject = (String)((HashMap)localObject).get("url");
        locala.TH(getResources().getString(R.l.app_url) + str);
        locala.a(new SelectConversationUI.22(this, (String)localObject));
        locala.TI(paramString).cdP();
        locala.g(Boolean.valueOf(true));
      }
      else if (this.uEk)
      {
        a(locala);
      }
      else if (this.uEm)
      {
        str = getResources().getString(R.l.app_golden_lucky);
        paramString = str;
        if (this.hvD != null) {
          paramString = str + this.hvD;
        }
        locala.TH(paramString);
        locala.g(Boolean.valueOf(false));
      }
      else
      {
        b(locala);
        c(locala);
        locala.g(Boolean.valueOf(true));
      }
    }
  }
  
  protected final void Wj()
  {
    super.Wj();
    this.uEh = getIntent().getBooleanExtra("select_is_ret", false);
    this.fromScene = getIntent().getIntExtra("scene_from", 0);
    x.i("MicroMsg.SelectConversationUI", "from scene:%d", new Object[] { Integer.valueOf(this.fromScene) });
    if (this.fromScene == 1) {
      this.uEi = true;
    }
    for (;;)
    {
      this.uEn = getIntent().getBooleanExtra("send_to_biz", false);
      this.ubT = getIntent().getIntExtra("Retr_Biz_Msg_Selected_Msg_Index", -1);
      this.bJA = getIntent().getLongExtra("select_fav_local_id", -1L);
      this.uEo = getIntent().getIntExtra("select_fav_select_count", 0);
      this.uEt = getIntent().getBooleanExtra("mutil_select_is_ret", false);
      this.ulx = getIntent().getBooleanExtra("Select_Send_Card", false);
      this.uEp = getIntent().getBooleanExtra("Retr_Big_File", false);
      if (this.ulx) {
        this.uEq = getIntent().getStringExtra("Select_Talker_Name");
      }
      this.eCt = getIntent().getIntExtra("Select_Conv_Type", uEf);
      this.msgType = getIntent().getIntExtra("Retr_Msg_Type", -1);
      this.bJC = getIntent().getLongExtra("Retr_Msg_Id", -1L);
      au.HU();
      this.bXQ = com.tencent.mm.model.c.FT().dW(this.bJC);
      this.imagePath = getIntent().getStringExtra("image_path");
      this.uEy = getIntent().getStringExtra("ad_video_title");
      this.hvD = getIntent().getStringExtra("desc_title");
      this.uEx = getIntent().getStringExtra("Retr_Msg_thumb_path");
      this.bWW = getIntent().getStringExtra("Retr_Msg_content");
      this.uEz = getIntent().getStringExtra("Retr_fav_xml_str");
      if ((this.bWW == null) && (this.bXQ != null)) {
        this.bWW = this.bXQ.field_content;
      }
      this.uEw = ((ReportUtil.ReportArgs)getIntent().getParcelableExtra("Select_Report_Args"));
      HashSet localHashSet = new HashSet();
      localHashSet.addAll(com.tencent.mm.ui.contact.s.cyz());
      Object localObject = getIntent().getStringExtra("Select_block_List");
      if (!com.tencent.mm.platformtools.ai.oW((String)localObject)) {
        localHashSet.addAll(com.tencent.mm.platformtools.ai.h(((String)localObject).split(",")));
      }
      if (com.tencent.mm.ui.contact.s.fb(this.eCt, 2))
      {
        localObject = com.tencent.mm.ui.contact.s.cyA();
        com.tencent.mm.ui.contact.s.h((HashSet)localObject);
        localHashSet.addAll((Collection)localObject);
      }
      this.gRN = new ArrayList();
      this.gRN.addAll(localHashSet);
      if (com.tencent.mm.ui.contact.s.fb(this.eCt, 1)) {
        this.ukn = true;
      }
      if (this.uEt)
      {
        this.uEv = new LinkedList();
        if (this.uEt)
        {
          a(1, getString(R.l.app_multi_selected), this.uEA, s.b.tmX);
          Wp();
        }
      }
      return;
      if ((this.fromScene == 2) || (this.fromScene == 10)) {
        this.uEj = true;
      } else if (this.fromScene == 3) {
        this.uEk = true;
      } else if (this.fromScene == 6) {
        this.uEl = true;
      } else if (this.fromScene == 7) {
        this.uEm = true;
      }
    }
  }
  
  protected final boolean Wk()
  {
    return false;
  }
  
  protected final boolean Wl()
  {
    return false;
  }
  
  protected final String Wm()
  {
    String str2 = getIntent().getStringExtra("Select_Conv_ui_title");
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() > 0) {}
    }
    else
    {
      str1 = getString(R.l.select_conversation_title);
    }
    return str1;
  }
  
  protected final com.tencent.mm.ui.contact.o Wn()
  {
    return new w(this, this.gRN, this.ukn, this.uEu, this.uEn, this.eCt);
  }
  
  protected final com.tencent.mm.ui.contact.m Wo()
  {
    return new q(this, this.gRN, this.uEu, this.scene);
  }
  
  protected final void a(ListView paramListView, int paramInt)
  {
    super.a(paramListView, paramInt);
    if (this.tFu == null)
    {
      if (!this.ulx) {
        break label106;
      }
      this.uEg = R.l.select_more_contact;
    }
    for (;;)
    {
      Object localObject = new SelectConversationUI.12(this);
      String str = getString(this.uEg);
      View localView = y.gq(this).inflate(R.i.group_card_item, null);
      localView.setOnClickListener((View.OnClickListener)localObject);
      localObject = (TextView)localView.findViewById(R.h.content_tv);
      ((TextView)localObject).setText(str);
      paramListView.addHeaderView(localView);
      this.tFu = ((TextView)localObject);
      this.tFu.setVisibility(paramInt);
      return;
      label106:
      if (this.fromScene == 10) {
        this.uEg = R.l.open_main_contact_title;
      } else {
        this.uEg = R.l.select_conversation_create;
      }
    }
  }
  
  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.uEv.contains(parama.guS.field_username);
    }
    return false;
  }
  
  public final int[] bbG()
  {
    int[] arrayOfInt2 = getIntent().getIntArrayExtra("search_range");
    int[] arrayOfInt1;
    if ((this.fromScene == 4) || (this.fromScene == 10))
    {
      arrayOfInt1 = new int[1];
      arrayOfInt1[0] = 131072;
    }
    do
    {
      return arrayOfInt1;
      arrayOfInt1 = arrayOfInt2;
    } while (arrayOfInt2 != null);
    return super.bbG();
  }
  
  protected final void bbH()
  {
    if (this.fromScene == 5) {
      h.a(this, getString(R.l.lucky_money_select_contact_cancel_notify), null, getString(R.l.send), getString(R.l.cancel), true, new SelectConversationUI.19(this), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          SelectConversationUI.f(SelectConversationUI.this);
          SelectConversationUI.this.YC();
        }
      });
    }
    for (;;)
    {
      if (this.uEw != null) {
        ReportUtil.a(this, this.uEw);
      }
      return;
      super.bbH();
      YC();
    }
  }
  
  protected final boolean cyt()
  {
    return true;
  }
  
  public final void iV(int paramInt)
  {
    int i;
    if (this.uEu)
    {
      i = paramInt - getContentLV().getHeaderViewsCount();
      if (i < 0)
      {
        x.i("MicroMsg.SelectConversationUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
        cAg();
      }
    }
    Object localObject1;
    label181:
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            localObject1 = cyp();
            localObject2 = ((n)localObject1).FM(i);
          } while ((localObject2 == null) || (((com.tencent.mm.ui.contact.a.a)localObject2).guS == null));
          localObject2 = ((com.tencent.mm.ui.contact.a.a)localObject2).guS.field_username;
          x.i("MicroMsg.SelectConversationUI", "ClickUser=%s", new Object[] { localObject2 });
          if ((!this.uEv.contains(localObject2)) && (mx(true)))
          {
            cyv();
            return;
          }
          if (!abk((String)localObject2))
          {
            cyv();
            this.lbw.Ty((String)localObject2);
            if (!this.uEv.contains(localObject2)) {
              break label181;
            }
            this.uEv.remove(localObject2);
          }
          for (;;)
          {
            Wp();
            ((n)localObject1).notifyDataSetChanged();
            return;
            this.uEv.add(localObject2);
          }
          if (paramInt < getContentLV().getHeaderViewsCount())
          {
            x.i("MicroMsg.SelectConversationUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
            if (this.ulx)
            {
              cAh();
              return;
            }
            cAi();
            return;
          }
          localObject1 = (com.tencent.mm.ui.contact.a.a)getContentLV().getAdapter().getItem(paramInt);
        } while (localObject1 == null);
        if (((localObject1 instanceof com.tencent.mm.ui.contact.a.b)) && (((com.tencent.mm.ui.contact.a.b)localObject1).bgn == getResources().getString(R.l.address_official_accounts_title)))
        {
          x.i("MicroMsg.SelectConversationUI", "doCallSelectBizItem");
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("list_attr", 16384);
          com.tencent.mm.bg.d.b(this, "brandservice", ".ui.BrandServiceIndexUI", (Intent)localObject1, 4);
          this.uEj = true;
          return;
        }
        if ((localObject1 instanceof com.tencent.mm.ui.contact.a.f))
        {
          localObject3 = (com.tencent.mm.ui.contact.a.f)localObject1;
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("scene", this.scene);
          localObject2 = new ArrayList();
          localObject3 = ((com.tencent.mm.ui.contact.a.a)localObject3).jrx.jrX;
          i = localObject3.length;
          paramInt = 0;
          while (paramInt < i)
          {
            ((ArrayList)localObject2).add(localObject3[paramInt]);
            paramInt += 1;
          }
          ((Intent)localObject1).putExtra("query_phrase_list", (Serializable)localObject2);
          com.tencent.mm.bg.d.b(this, ".ui.transmit.MMCreateChatroomUI", (Intent)localObject1, 1);
          return;
        }
        localObject1 = ((com.tencent.mm.ui.contact.a.a)localObject1).guS;
      } while (localObject1 == null);
      localObject1 = ((com.tencent.mm.g.c.ai)localObject1).field_username;
      x.i("MicroMsg.SelectConversationUI", "doClickUser=%s", new Object[] { localObject1 });
    } while ((abk((String)localObject1)) || (abl((String)localObject1)));
    Object localObject2 = new Intent();
    ((Intent)localObject2).putExtra("Select_Conv_User", (String)localObject1);
    Object localObject3 = (Intent)getIntent().getParcelableExtra("Select_Conv_NextStep");
    if (localObject3 != null) {
      a((Intent)localObject2, (Intent)localObject3);
    }
    for (;;)
    {
      YC();
      return;
      if ((this.uEh) || (this.ulx) || (this.uEi) || (this.uEj) || (this.uEk))
      {
        n((Intent)localObject2, (String)localObject1);
      }
      else
      {
        az((Intent)localObject2);
        finish();
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject2;
    if (paramIntent != null)
    {
      x.i("MicroMsg.SelectConversationUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = " + paramIntent.toString());
      if (paramInt1 != 1) {
        break label226;
      }
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        x.i("MicroMsg.SelectConversationUI", "getIntent = " + getIntent());
        localObject2 = (Intent)getIntent().getParcelableExtra("Select_Conv_NextStep");
        if (localObject2 == null) {
          break label173;
        }
        a(paramIntent, (Intent)localObject2);
      }
    }
    label173:
    label226:
    label321:
    label439:
    label466:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return;
                x.i("MicroMsg.SelectConversationUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
                break;
                if ((this.uEh) || (this.ulx) || (this.uEi) || (this.uEj) || (this.uEk))
                {
                  n(paramIntent, (String)localObject1);
                  return;
                }
                az(paramIntent);
                finish();
                return;
                if (paramInt1 != 2) {
                  break label321;
                }
                switch (paramInt2)
                {
                default: 
                  return;
                case -1: 
                  finish();
                }
              } while ((paramIntent == null) || (!paramIntent.getBooleanExtra("Select_stay_in_wx", false)));
              paramIntent = new Intent(this, TaskRedirectUI.class);
              paramIntent.addFlags(268435456);
              startActivity(paramIntent);
              return;
            } while (paramIntent == null);
            this.uEw = ((ReportUtil.ReportArgs)paramIntent.getParcelableExtra("Select_Report_Args"));
            return;
            if (paramInt1 != 3) {
              break label439;
            }
            switch (paramInt2)
            {
            default: 
              return;
            }
          } while (paramIntent == null);
          paramIntent = paramIntent.getStringExtra("received_card_name");
        } while ((bi.oW(paramIntent)) || (abl(paramIntent)));
        localObject1 = new com.tencent.mm.pluginsdk.ui.applet.g.a(this.mController.tml);
        ((com.tencent.mm.pluginsdk.ui.applet.g.a)localObject1).bZ(paramIntent);
        a((com.tencent.mm.pluginsdk.ui.applet.g.a)localObject1, this.uEq);
        {
          public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
          {
            SelectConversationUI.this.YC();
            Intent localIntent;
            if (paramAnonymousBoolean)
            {
              localIntent = new Intent();
              if (!paramIntent.endsWith("@chatroom")) {
                break label74;
              }
              SelectConversationUI.c(localIntent, SelectConversationUI.g(SelectConversationUI.this), paramIntent);
            }
            for (;;)
            {
              localIntent.putExtra("custom_send_text", paramAnonymousString);
              SelectConversationUI.a(SelectConversationUI.this, localIntent);
              SelectConversationUI.this.finish();
              return;
              label74:
              SelectConversationUI.d(localIntent, SelectConversationUI.g(SelectConversationUI.this), paramIntent);
            }
          }
        }.show();
        return;
        if (paramInt1 != 4) {
          break label466;
        }
      } while ((paramInt2 != -1) || (paramIntent == null));
      n(paramIntent, paramIntent.getStringExtra("Select_Contact"));
      return;
      if (paramInt1 != 5) {
        break label621;
      }
    } while ((paramInt2 != -1) || (paramIntent == null));
    paramIntent = paramIntent.getStringExtra("Select_Conv_User");
    Object localObject1 = this.uEv.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      this.lbw.Tz((String)localObject2);
    }
    if (!com.tencent.mm.platformtools.ai.oW(paramIntent)) {
      this.uEv = com.tencent.mm.platformtools.ai.h(paramIntent.split(","));
    }
    for (;;)
    {
      paramIntent = this.uEv.iterator();
      while (paramIntent.hasNext())
      {
        localObject1 = (String)paramIntent.next();
        this.lbw.bm((String)localObject1, false);
      }
      this.uEv.clear();
    }
    Wp();
    cyp().notifyDataSetChanged();
    return;
    label621:
    x.e("MicroMsg.SelectConversationUI", "onActivityResult, unknown requestCode = " + paramInt1);
  }
  
  public void onBackPressed()
  {
    super.bbH();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    com.tencent.mm.pluginsdk.e.k(this);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("Select_App_Id");
    String str = getIntent().getStringExtra("Select_Open_Id");
    x.i("MicroMsg.SelectConversationUI", "onCreate, appId = " + paramBundle + ", openId = " + str);
    if ((!com.tencent.mm.platformtools.ai.oW(paramBundle)) && (!com.tencent.mm.platformtools.ai.oW(str))) {
      new com.tencent.mm.plugin.base.stub.d(this, paramBundle, str, new SelectConversationUI.1(this)).atx();
    }
    com.tencent.mm.pluginsdk.e.l(this);
  }
  
  public final void pf(String paramString)
  {
    this.uEv.remove(paramString);
    cyp().notifyDataSetChanged();
    Wp();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/transmit/SelectConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */