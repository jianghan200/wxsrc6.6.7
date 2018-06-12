package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.jw;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.pluginsdk.c.b;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.a.j;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.ui.w.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SelectContactUI
  extends MMBaseSelectContactUI
  implements com.tencent.mm.ab.e
{
  private String chatroomName;
  private HashSet<String> eCr;
  private ProgressDialog eHw;
  private List<String> gRN;
  private TextView gmo;
  private int hOX;
  private String hwC;
  private b tOA = new SelectContactUI.6(this);
  private String title;
  private int uhk;
  private String ulA;
  private boolean ulB;
  private boolean ulC;
  private jw ulD;
  private boolean ulE;
  private boolean ulF = true;
  private boolean ulG = false;
  private String ulH;
  private AlphaAnimation ulI;
  private AlphaAnimation ulJ;
  private boolean ulK = false;
  private TextView uls;
  private TextView ult;
  private TextView ulu;
  private TextView ulv;
  private HashSet<String> ulw;
  private boolean ulx;
  private boolean uly;
  private String ulz;
  
  private void Wp()
  {
    if ((s.fb(this.hOX, 64)) && (this.eCr.size() > 0))
    {
      updateOptionMenuText(1, getString(R.l.app_ok) + "(" + this.eCr.size() + ")");
      int i = getIntent().getIntExtra("min_limit_num", 0);
      if ((s.fb(this.hOX, 262144)) && (this.eCr.size() < i))
      {
        enableOptionMenu(1, false);
        return;
      }
      enableOptionMenu(1, true);
      return;
    }
    updateOptionMenuText(1, getString(R.l.app_ok));
    enableOptionMenu(1, false);
  }
  
  private TextView a(ListView paramListView, View.OnClickListener paramOnClickListener, String paramString)
  {
    View localView = com.tencent.mm.ui.y.gq(this).inflate(R.i.group_card_item, null);
    localView.setOnClickListener(paramOnClickListener);
    paramOnClickListener = (TextView)localView.findViewById(R.h.content_tv);
    paramOnClickListener.setText(paramString);
    paramListView.addHeaderView(localView);
    return paramOnClickListener;
  }
  
  private static List<String> aE(List<String> paramList)
  {
    LinkedList localLinkedList = new LinkedList();
    if (!au.HX()) {
      return localLinkedList;
    }
    if (paramList == null) {
      return localLinkedList;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      au.HU();
      ab localab = com.tencent.mm.model.c.FR().Yg(str);
      paramList = str;
      if (localab != null)
      {
        paramList = str;
        if ((int)localab.dhP != 0) {
          paramList = localab.BL();
        }
      }
      localLinkedList.add(paramList);
    }
    return localLinkedList;
  }
  
  private void aaN(String paramString)
  {
    if (this.ulw.contains(paramString)) {
      return;
    }
    cyv();
    this.lbw.Ty(paramString);
    if (this.eCr.contains(paramString))
    {
      this.eCr.remove(paramString);
      return;
    }
    this.eCr.add(paramString);
  }
  
  private void cyB()
  {
    int i;
    int j;
    if ((this.ulF) && ((this.uhk == 1) || (this.uhk == 0)))
    {
      if (this.ulw == null) {
        break label207;
      }
      i = this.ulw.size();
      if (this.eCr == null) {
        break label212;
      }
      j = this.eCr.size();
      label52:
      i += j;
      j = bi.WU(g.AT().getValue("ChatRoomInviteStartCount"));
      if ((j <= 0) || (i != j + 1) || (this.ulK)) {
        break label217;
      }
      if (this.gmo == null) {
        this.gmo = ((TextView)findViewById(R.h.select_contact_float_tips));
      }
      if (this.gmo.getVisibility() != 0)
      {
        this.gmo.setText(R.l.room_add_member_tips);
        this.gmo.setOnClickListener(new SelectContactUI.9(this));
        if (this.ulI == null) {
          this.ulI = new AlphaAnimation(0.0F, 1.0F);
        }
        this.ulI.setDuration(300L);
        if (this.ulJ != null) {
          this.ulJ.cancel();
        }
        this.gmo.setVisibility(0);
        this.gmo.startAnimation(this.ulI);
      }
    }
    label207:
    label212:
    label217:
    while (i >= j)
    {
      return;
      i = 0;
      break;
      j = 0;
      break label52;
    }
    cyD();
    this.ulK = false;
  }
  
  private void cyD()
  {
    if (this.gmo == null) {
      this.gmo = ((TextView)findViewById(R.h.select_contact_float_tips));
    }
    if (this.gmo.getVisibility() == 8) {
      return;
    }
    if (this.ulJ == null)
    {
      this.ulJ = new AlphaAnimation(1.0F, 0.0F);
      this.ulJ.setAnimationListener(new SelectContactUI.10(this));
    }
    this.ulJ.setDuration(300L);
    if (this.ulI != null) {
      this.ulI.cancel();
    }
    this.gmo.startAnimation(this.ulJ);
  }
  
  private boolean dT(final List<String> paramList)
  {
    x.i("MicroMsg.SelectContactUI", "handleSelect %s", new Object[] { paramList });
    String str;
    if (s.fb(this.hOX, 65536))
    {
      if (paramList == null) {
        break label240;
      }
      if (paramList.size() == 1) {
        str = getString(R.l.select_contact_confirm_tips, new Object[] { com.tencent.mm.model.r.gT((String)paramList.get(0)) });
      }
    }
    for (;;)
    {
      this.ulE = true;
      com.tencent.mm.ui.base.h.a(this.mController.tml, str, null, true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          SelectContactUI.b(SelectContactUI.this, SelectContactUI.a(SelectContactUI.this, paramList));
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          SelectContactUI.b(SelectContactUI.this, false);
        }
      });
      return this.ulE;
      if (paramList.size() > 1)
      {
        str = getString(R.l.app_seperator_marker);
        StringBuilder localStringBuilder = new StringBuilder();
        int i = 0;
        for (;;)
        {
          if (i < paramList.size())
          {
            if (i == 3) {
              localStringBuilder.append("...");
            }
          }
          else
          {
            str = getString(R.l.select_contact_confirm_tips, new Object[] { localStringBuilder.toString() });
            break;
          }
          localStringBuilder.append(com.tencent.mm.model.r.gT((String)paramList.get(i)));
          if (i < paramList.size() - 1) {
            localStringBuilder.append(str);
          }
          i += 1;
        }
        return dU(paramList);
      }
      label240:
      str = null;
    }
  }
  
  private boolean dU(List<String> paramList)
  {
    if (getIntent().getBooleanExtra("Add_SendCard", false))
    {
      if (bi.oW(this.ulz)) {
        this.ulz = bi.c(paramList, ",");
      }
      for (;;)
      {
        boolean bool = this.ulA.endsWith("@chatroom");
        paramList = new Intent();
        paramList.putExtra("be_send_card_name", this.ulz);
        paramList.putExtra("received_card_name", this.ulA);
        paramList.putExtra("Is_Chatroom", bool);
        setResult(-1, paramList);
        finish();
        return true;
        if (!bi.oW(this.ulA)) {
          break;
        }
        this.ulA = bi.c(paramList, ",");
      }
      x.e("MicroMsg.SelectContactUI", "send card occur error: send:%s | receive:%s", new Object[] { this.ulz, this.ulA });
      return false;
    }
    Object localObject;
    int i;
    if (getIntent().getBooleanExtra("snsPostWhoCanSee", false))
    {
      x.i("MicroMsg.SelectContactUI", "sns post who can see scene,users=%s", new Object[] { paramList.toString() });
      localObject = ml(false);
      ((ArrayList)localObject).remove(com.tencent.mm.model.q.GF());
      paramList = paramList.iterator();
      for (i = 0; paramList.hasNext(); i = 1)
      {
        label211:
        String str = (String)paramList.next();
        if (bi.oW(str)) {
          break label813;
        }
        if ((((ArrayList)localObject).contains(str)) || (com.tencent.mm.model.q.GF().equals(str))) {
          break label211;
        }
        au.HU();
        ab localab = com.tencent.mm.model.c.FR().Yg(str);
        if ((localab == null) || ((int)localab.dhP == 0) || (!com.tencent.mm.l.a.gd(localab.field_type))) {
          break label813;
        }
        aaN(str);
        ((ArrayList)localObject).add(str);
      }
    }
    label813:
    for (;;)
    {
      break label211;
      if (i != 0)
      {
        Wp();
        cyp().notifyDataSetChanged();
        break;
      }
      localObject = ml(false);
      ((ArrayList)localObject).remove(com.tencent.mm.model.q.GF());
      paramList = bi.c((List)localObject, ",");
      if (!bi.cX((List)localObject))
      {
        com.tencent.mm.ui.base.h.a(this.mController.tml, true, getString(R.l.label_selected_contact_save_label), "", getString(R.l.label_selected_contact_save_btn), getString(R.l.label_selected_contact_cancel_btn), new SelectContactUI.2(this, paramList), new SelectContactUI.3(this, paramList));
        break;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("Select_Contact", paramList);
      ((Intent)localObject).putExtra("Select_Conv_User", paramList);
      ((Intent)localObject).putExtra("Select_Contact", paramList);
      ((Intent)localObject).putExtra("Select_Contacts_To_Create_New_Label", paramList);
      setResult(0, (Intent)localObject);
      finish();
      break;
      if (getIntent().getBooleanExtra("recommend_friends", false))
      {
        x.i("MicroMsg.SelectContactUI", "Recommend Friends");
        y.a(this.mController.tml, this.ulA, paramList);
        break;
      }
      if (s.fb(this.hOX, 16384))
      {
        x.i("MicroMsg.SelectContactUI", "return the result");
        localObject = new Intent();
        paramList = bi.c(paramList, ",");
        ((Intent)localObject).putExtra("Select_Contact", paramList);
        ((Intent)localObject).putExtra("Select_Conv_User", paramList);
        ((Intent)localObject).putExtra("Select_Contact", paramList);
        setResult(-1, (Intent)localObject);
        finish();
        break;
      }
      if (getIntent().getBooleanExtra("shareImage", false))
      {
        x.i("MicroMsg.SelectContactUI", "Share Image");
        paramList = ml(true);
        paramList.remove(com.tencent.mm.model.q.GF());
        if (paramList.size() <= 0) {
          break;
        }
        this.eHw = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(R.l.main_sending), false, null);
        au.Em().H(new SelectContactUI.18(this, paramList));
        break;
      }
      if (paramList.size() > 0)
      {
        x.i("MicroMsg.SelectContactUI", "Launch ChattingUI: users=%s", new Object[] { paramList.toString() });
        finish();
        localObject = new Intent();
        ((Intent)localObject).setClass(this, ChattingUI.class);
        ((Intent)localObject).putExtra("Chat_User", (String)paramList.get(0));
        ((Intent)localObject).addFlags(67108864);
        startActivity((Intent)localObject);
        break;
      }
      x.e("MicroMsg.SelectContactUI", "unkown action: User=%s", new Object[] { paramList.toString() });
      break;
    }
  }
  
  private ArrayList<String> ml(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.eCr.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if ((!paramBoolean) && (com.tencent.mm.model.s.hc((String)localObject)))
      {
        localObject = com.tencent.mm.model.m.gJ((String)localObject);
        if (localObject != null)
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            localHashSet.add((String)((Iterator)localObject).next());
          }
        }
      }
      else
      {
        localHashSet.add(localObject);
      }
    }
    localArrayList.addAll(localHashSet);
    return localArrayList;
  }
  
  private ArrayList<String> mm(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.eCr.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if ((!paramBoolean) && (com.tencent.mm.model.s.hc((String)localObject)))
      {
        localObject = com.tencent.mm.model.m.gJ((String)localObject);
        if (localObject != null)
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            localHashSet.add((String)((Iterator)localObject).next());
          }
        }
      }
      else
      {
        localHashSet.add(localObject);
      }
    }
    localHashSet.addAll(this.ulw);
    localArrayList.addAll(localHashSet);
    return localArrayList;
  }
  
  protected final void Gr(String paramString)
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(11225, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
    Intent localIntent = new Intent();
    localIntent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
    localIntent.putExtra("label", paramString);
    paramString = new HashSet();
    paramString.addAll(ml(s.fb(this.hOX, 8192)));
    paramString.addAll(this.ulw);
    localIntent.putExtra("always_select_contact", bi.c(new ArrayList(paramString), ","));
    localIntent.putExtra("always_select_contact", bi.c(new ArrayList(paramString), ","));
    if (s.fb(this.hOX, 64))
    {
      localIntent.putExtra("list_attr", s.s(new int[] { 16384, 64, 131072 }));
      if (this.uhk == 14) {
        localIntent.putExtra("max_limit_num", getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE));
      }
    }
    for (;;)
    {
      startActivityForResult(localIntent, 3);
      return;
      localIntent.putExtra("list_attr", 16384);
    }
  }
  
  protected final void Wj()
  {
    super.Wj();
    this.hOX = getIntent().getIntExtra("list_attr", s.ukE);
    this.title = getIntent().getStringExtra("titile");
    this.hwC = getIntent().getStringExtra("sub_title");
    this.uhk = getIntent().getIntExtra("list_type", -1);
    this.ulF = getIntent().getBooleanExtra("show_too_many_member", true);
    if ((s.fb(this.hOX, 256)) && (com.tencent.mm.model.s.Hq().size() == 0)) {
      s.fc(this.hOX, 256);
    }
    this.ulx = getIntent().getBooleanExtra("Add_SendCard", false);
    this.uly = getIntent().getBooleanExtra("recommend_friends", false);
    if ((this.ulx) || (this.uly))
    {
      this.ulz = bi.aG(getIntent().getStringExtra("be_send_card_name"), "");
      this.ulA = bi.aG(getIntent().getStringExtra("received_card_name"), "");
    }
    this.ulB = getIntent().getBooleanExtra("Forbid_SelectChatRoom", false);
    this.gRN = new ArrayList();
    this.eCr = new HashSet();
    this.ulw = new HashSet();
    Object localObject = getIntent().getStringExtra("always_select_contact");
    if (!bi.oW((String)localObject)) {
      this.ulw.addAll(bi.F(((String)localObject).split(",")));
    }
    localObject = getIntent().getStringExtra("already_select_contact");
    if (!bi.oW((String)localObject)) {
      this.eCr.addAll(bi.F(((String)localObject).split(",")));
    }
    localObject = new HashSet();
    String str = getIntent().getStringExtra("block_contact");
    if (!bi.oW(str)) {
      ((HashSet)localObject).addAll(bi.F(str.split(",")));
    }
    localObject = new HashSet((Collection)localObject);
    ((HashSet)localObject).addAll(s.cyz());
    ((HashSet)localObject).addAll(s.cyA());
    if (this.ulx) {
      ((HashSet)localObject).removeAll(s.cyz());
    }
    this.gRN.addAll((Collection)localObject);
    cyB();
  }
  
  protected final boolean Wk()
  {
    return false;
  }
  
  protected final boolean Wl()
  {
    return true;
  }
  
  protected final String Wm()
  {
    return this.title;
  }
  
  protected final o Wn()
  {
    boolean bool2 = false;
    c.a locala = new c.a();
    locala.uhW = s.fb(this.hOX, 16);
    locala.uhV = s.fb(this.hOX, 32);
    if (!s.fb(this.hOX, 4))
    {
      bool1 = true;
      locala.uhX = bool1;
      if (s.fb(this.hOX, 1)) {
        break label271;
      }
    }
    label271:
    for (boolean bool1 = true;; bool1 = false)
    {
      locala.uhY = bool1;
      locala.uhZ = s.fb(this.hOX, 128);
      locala.uia = s.fb(this.hOX, 1048576);
      if (locala.uhZ)
      {
        this.ulG = true;
        locala.uib = getIntent().getStringExtra("wechat_sport_contact");
        locala.uic = getIntent().getStringExtra("wechat_sport_recent_like");
        this.ulH = locala.uib;
      }
      if ((getIntent().getBooleanExtra("snsPostWhoCanSee", false)) || (getIntent().getBooleanExtra("without_openim", false)) || (getIntent().getIntExtra("scene", 0) == 5)) {
        locala.ugF = "@all.contact.without.chatroom.without.openim";
      }
      List localList = this.gRN;
      boolean bool3 = s.fb(this.hOX, 1);
      boolean bool4 = s.fb(this.hOX, 64);
      bool1 = bool2;
      if (this.uhk == 15) {
        bool1 = true;
      }
      return new c(this, localList, bool3, bool4, locala, bool1);
      bool1 = false;
      break;
    }
  }
  
  protected final m Wo()
  {
    if (this.ulG) {
      return new r(this, this.gRN, s.fb(this.hOX, 64), this.ulH);
    }
    return new q(this, this.gRN, s.fb(this.hOX, 64), this.scene);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (!bi.ci(this)) {}
    do
    {
      do
      {
        return;
      } while (w.a.a(this, paramInt1, paramInt2, paramString, 4));
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break;
      }
    } while ((paramInt1 != 4) || (paramInt2 != -24) || (bi.oW(paramString)));
    Toast.makeText(this, paramString, 1).show();
    return;
    switch (paraml.getType())
    {
    default: 
      return;
    }
    cyp().notifyDataSetChanged();
  }
  
  protected final void a(ListView paramListView, int paramInt)
  {
    super.a(paramListView, paramInt);
    String str;
    if (s.fb(this.hOX, 256))
    {
      if (this.uls == null)
      {
        SelectContactUI.11 local11 = new SelectContactUI.11(this);
        if (this.uhk == 14)
        {
          str = getString(R.l.address_select_group_card);
          this.uls = a(paramListView, local11, str);
        }
      }
      else
      {
        this.uls.setVisibility(paramInt);
      }
    }
    else
    {
      if (s.fb(this.hOX, 512))
      {
        if (this.ult == null) {
          this.ult = a(paramListView, new SelectContactUI.12(this), getString(R.l.find_friends_create_pwdgroup));
        }
        this.ult.setVisibility(paramInt);
      }
      if (s.fb(this.hOX, 1024))
      {
        if (this.ulu == null) {
          this.ulu = a(paramListView, new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.setClassName(SelectContactUI.this, "com.tencent.mm.ui.contact.GroupCardSelectUI");
              paramAnonymousView.putExtra("group_select_type", false);
              SelectContactUI.this.startActivityForResult(paramAnonymousView, 1);
            }
          }, getString(R.l.address_history_group_card_import));
        }
        this.ulu.setVisibility(paramInt);
      }
      if (s.fb(this.hOX, 2048))
      {
        if (this.ulv == null) {
          this.ulv = a(paramListView, new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("list_attr", 16384);
              d.b(SelectContactUI.this, "brandservice", ".ui.BrandServiceIndexUI", paramAnonymousView, 2);
            }
          }, getString(R.l.address_official_accounts_title));
        }
        this.ulv.setVisibility(paramInt);
        this.ulv.setTextSize(16.0F * com.tencent.mm.bp.a.fe(this.ulv.getContext()));
      }
      if (!s.fb(this.hOX, 2048)) {
        break label292;
      }
      if (this.ulv != null) {
        this.ulv.setBackgroundResource(R.g.comm_list_item_selector_no_divider);
      }
    }
    label292:
    label323:
    label354:
    do
    {
      do
      {
        do
        {
          return;
          str = getString(R.l.address_history_group_card);
          break;
          if (!s.fb(this.hOX, 1024)) {
            break label323;
          }
        } while (this.ulu == null);
        this.ulu.setBackgroundResource(R.g.comm_list_item_selector_no_divider);
        return;
        if (!s.fb(this.hOX, 512)) {
          break label354;
        }
      } while (this.ult == null);
      this.ult.setBackgroundResource(R.g.comm_list_item_selector_no_divider);
      return;
    } while ((!s.fb(this.hOX, 256)) || (this.uls == null));
    this.uls.setBackgroundResource(R.g.comm_list_item_selector_no_divider);
  }
  
  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.eCr.contains(parama.guS.field_username);
    }
    if ((parama.ujY) && (parama.guS != null)) {
      return this.eCr.contains(parama.guS.field_username);
    }
    if ((parama instanceof j)) {
      return this.eCr.isEmpty();
    }
    return false;
  }
  
  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.ulw.contains(parama.guS.field_username);
    }
    return false;
  }
  
  public final int[] bbG()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(131072));
    if (!s.fb(this.hOX, 1)) {
      localArrayList.add(Integer.valueOf(131076));
    }
    if (!s.fb(this.hOX, 4)) {
      localArrayList.add(Integer.valueOf(131075));
    }
    int[] arrayOfInt = new int[localArrayList.size()];
    int i = 0;
    while (i < localArrayList.size())
    {
      arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
      i += 1;
    }
    return arrayOfInt;
  }
  
  protected final boolean bcN()
  {
    return !this.ulG;
  }
  
  public final boolean cyC()
  {
    if (this.ulB) {}
    try
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.share_openim_card_waring), "", null);
      return true;
      return false;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
  }
  
  public final void iV(int paramInt)
  {
    int i = paramInt - getContentLV().getHeaderViewsCount();
    if (i < 0) {
      x.i("MicroMsg.SelectContactUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    }
    do
    {
      do
      {
        do
        {
          return;
          localObject = cyp().FM(i);
        } while (localObject == null);
        if (!(localObject instanceof j)) {
          break;
        }
      } while (!s.fb(this.hOX, 16384));
      x.i("MicroMsg.SelectContactUI", "handleClickNonSelect, return the result");
      localObject = new Intent();
      ((Intent)localObject).putExtra("Select_Contact", "");
      ((Intent)localObject).putExtra("Select_Conv_User", "");
      ((Intent)localObject).putExtra("Select_Contact", "");
      setResult(-1, (Intent)localObject);
      finish();
      return;
    } while ((((com.tencent.mm.ui.contact.a.a)localObject).guS == null) || (((com.tencent.mm.ui.contact.a.a)localObject).guS.field_deleteFlag == 1));
    Object localObject = ((com.tencent.mm.ui.contact.a.a)localObject).guS.field_username;
    x.i("MicroMsg.SelectContactUI", "ClickUser=%s", new Object[] { localObject });
    if (s.fb(this.hOX, 64))
    {
      if ((s.fb(this.hOX, 131072)) && (this.eCr.size() >= getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE))) {
        if (!this.ulw.contains(localObject))
        {
          cyv();
          if (!this.eCr.contains(localObject)) {
            break label286;
          }
          this.lbw.Ty((String)localObject);
          this.eCr.remove(localObject);
        }
      }
      for (;;)
      {
        Wp();
        cyB();
        cyq().notifyDataSetChanged();
        return;
        label286:
        String str = getIntent().getStringExtra("too_many_member_tip_string");
        localObject = str;
        if (bi.oW(str)) {
          localObject = getString(R.l.select_contact_num_limit_tips, new Object[] { Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10)) });
        }
        com.tencent.mm.ui.base.h.a(this.mController.tml, (String)localObject, getString(R.l.app_remind), new SelectContactUI.5(this));
        continue;
        aaN((String)localObject);
      }
    }
    dT(bi.F(new String[] { localObject }));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.SelectContactUI", "requestCode=%d | resultCode=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1) {}
    Object localObject;
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            switch (paramInt1)
            {
            default: 
              return;
            case 0: 
              paramIntent = paramIntent.getStringExtra("Select_Conv_User");
            }
          } while (bi.oW(paramIntent));
          dT(bi.F(new String[] { paramIntent }));
          return;
          paramIntent = paramIntent.getStringExtra("Select_Conv_User");
          localObject = this.eCr.iterator();
          while (((Iterator)localObject).hasNext())
          {
            String str = (String)((Iterator)localObject).next();
            this.lbw.Tz(str);
          }
          this.eCr.clear();
          if (!bi.oW(paramIntent)) {
            this.eCr.addAll(bi.F(paramIntent.split(",")));
          }
          paramIntent = this.eCr.iterator();
          while (paramIntent.hasNext())
          {
            localObject = (String)paramIntent.next();
            this.lbw.bm((String)localObject, false);
          }
          Wp();
          return;
          paramIntent = paramIntent.getStringExtra("Select_Contact");
        } while (bi.oW(paramIntent));
        dT(bi.F(paramIntent.split(",")));
        return;
      } while (paramIntent == null);
      paramIntent = paramIntent.getStringExtra("Select_Contact");
    } while (bi.oW(paramIntent));
    dT(bi.F(new String[] { paramIntent }));
    return;
    paramIntent = paramIntent.getStringExtra("Select_Contact");
    if (bi.oW(paramIntent))
    {
      x.i("MicroMsg.SelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
      return;
    }
    x.i("MicroMsg.SelectContactUI", "GET_LABEL_USERS select username=%s", new Object[] { paramIntent });
    if (s.fb(this.hOX, 64))
    {
      paramIntent = paramIntent.split(",");
      paramInt2 = paramIntent.length;
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        localObject = paramIntent[paramInt1];
        if (this.eCr.add(localObject)) {
          this.lbw.Ty((String)localObject);
        }
        paramInt1 += 1;
      }
      Wp();
      cyp().notifyDataSetChanged();
      return;
    }
    dT(bi.F(new String[] { paramIntent }));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    au.DF().a(30, this);
    au.DF().a(138, this);
    b.a(jw.class.getName(), this.tOA);
    x.i("MicroMsg.SelectContactUI", "create!");
    if (!bi.oW(this.hwC)) {
      setMMSubTitle(this.hwC);
    }
    if (s.fb(this.hOX, 64)) {
      a(1, getString(R.l.app_ok), new SelectContactUI.17(this), s.b.tmX);
    }
    Wp();
    setBackBtn(new SelectContactUI.1(this));
    if (this.uhk != 15)
    {
      paramBundle = this.eCr.iterator();
      while (paramBundle.hasNext())
      {
        String str = (String)paramBundle.next();
        this.lbw.bm(str, false);
      }
    }
  }
  
  protected void onDestroy()
  {
    au.DF().b(30, this);
    au.DF().b(138, this);
    b.b(jw.class.getName(), this.tOA);
    super.onDestroy();
  }
  
  public final void pf(String paramString)
  {
    this.eCr.remove(paramString);
    cyp().notifyDataSetChanged();
    Wp();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/contact/SelectContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */