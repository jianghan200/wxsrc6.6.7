package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.s.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SnsAddressUI
  extends MMBaseSelectContactUI
{
  private HashSet<String> eCr;
  private List<String> gRN;
  
  private void Wp()
  {
    String str;
    if (this.eCr.size() == 0)
    {
      str = String.format("%s", new Object[] { getString(R.l.app_ok) });
      updateOptionMenuText(1, str);
      if (this.eCr.size() < 0) {
        break label100;
      }
    }
    label100:
    for (boolean bool = true;; bool = false)
    {
      enableOptionMenu(1, bool);
      return;
      str = String.format("%s(%d/%d)", new Object[] { getString(R.l.app_ok), Integer.valueOf(this.eCr.size()), Integer.valueOf(z.sOr) });
      break;
    }
  }
  
  protected final void Gr(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
    localIntent.putExtra("label", paramString);
    paramString = new HashSet();
    paramString.addAll(this.eCr);
    localIntent.putExtra("always_select_contact", bi.c(new ArrayList(paramString), ","));
    localIntent.putExtra("list_attr", s.s(new int[] { 16384, 64 }));
    startActivityForResult(localIntent, 3);
  }
  
  protected final void Wj()
  {
    super.Wj();
    this.gRN = new ArrayList();
    Object localObject = bi.F(bi.aG(getIntent().getStringExtra("Block_list"), "").split(","));
    HashSet localHashSet = s.cyz();
    localHashSet.addAll((Collection)localObject);
    this.gRN.addAll(localHashSet);
    this.gRN.addAll(s.cyA());
    this.eCr = new HashSet();
    localObject = bi.aG(getIntent().getStringExtra("Select_Contact"), "");
    if (!bi.oW((String)localObject)) {
      this.eCr.addAll(bi.F(((String)localObject).split(",")));
    }
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
    return bi.aG(getIntent().getStringExtra("Add_address_titile"), "");
  }
  
  protected final o Wn()
  {
    c.a locala = new c.a();
    locala.uhW = true;
    locala.uie = true;
    locala.uig = getString(R.l.address_near_contact_catalog_name);
    locala.uif = bi.aG(getIntent().getStringExtra("Add_get_from_sns"), "");
    locala.ugF = "@all.contact.without.chatroom.without.openim";
    return new c(this, this.gRN, true, locala);
  }
  
  protected final m Wo()
  {
    return new q(this, this.gRN, true, this.scene);
  }
  
  public final boolean a(a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.eCr.contains(parama.guS.field_username);
    }
    return false;
  }
  
  public final int[] bbG()
  {
    return new int[] { 131072 };
  }
  
  protected final boolean bcN()
  {
    return true;
  }
  
  public final void iV(int paramInt)
  {
    n localn = cyp();
    Object localObject = localn.FM(paramInt - getContentLV().getHeaderViewsCount());
    if (localObject == null) {}
    while (((a)localObject).guS == null) {
      return;
    }
    x.i("MicroMsg.SnsAddressUI", "ClickUser=%s", new Object[] { ((a)localObject).guS.field_username });
    localObject = ((a)localObject).guS.field_username;
    cyv();
    if (this.eCr.contains(localObject))
    {
      this.eCr.remove(localObject);
      this.lbw.Ty((String)localObject);
    }
    for (;;)
    {
      Wp();
      localn.notifyDataSetChanged();
      return;
      if (this.eCr.size() < z.sOr)
      {
        this.eCr.add(localObject);
        this.lbw.Ty((String)localObject);
      }
      else
      {
        Toast.makeText(this, R.l.sns_max_select_at, 0).show();
        x.i("MicroMsg.SnsAddressUI", "select user size equal max size:%d", new Object[] { Integer.valueOf(z.sOr) });
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1) {
      return;
    }
    switch (paramInt1)
    {
    default: 
      return;
    }
    paramIntent = paramIntent.getStringExtra("Select_Contact");
    if (bi.oW(paramIntent))
    {
      x.i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS return usernames is null or empty");
      return;
    }
    x.i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS select username=%s", new Object[] { paramIntent });
    paramIntent = paramIntent.split(",");
    paramInt2 = paramIntent.length;
    paramInt1 = i;
    while (paramInt1 < paramInt2)
    {
      Object localObject = paramIntent[paramInt1];
      if (this.eCr.add(localObject)) {
        this.lbw.Ty((String)localObject);
      }
      paramInt1 += 1;
    }
    Wp();
    cyp().notifyDataSetChanged();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.SnsAddressUI", "Create!");
    a(1, getString(R.l.app_ok), new SnsAddressUI.1(this), s.b.tmX);
    setBackBtn(new SnsAddressUI.2(this));
    paramBundle = this.eCr.iterator();
    while (paramBundle.hasNext())
    {
      String str = (String)paramBundle.next();
      this.lbw.Ty(str);
    }
    this.lbw.setOnContactDeselectListener(new SnsAddressUI.3(this));
    Wp();
  }
  
  public final void pf(String paramString)
  {
    this.eCr.remove(paramString);
    cyp().notifyDataSetChanged();
    Wp();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/contact/SnsAddressUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */