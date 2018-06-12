package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.af;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.chatroom.b.b;
import com.tencent.mm.plugin.comm.a.c;
import com.tencent.mm.plugin.comm.a.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class i
{
  private Context context;
  private View eLM;
  f eOE;
  private View hsd;
  public View.OnClickListener mtE;
  ContactListExpandPreference.a opw;
  String qII;
  private HashMap<String, Preference> qIJ = new HashMap();
  boolean qIK = false;
  boolean qIL;
  public j qIM;
  k.b qIN;
  private View.OnClickListener qIO;
  private View.OnClickListener qIP;
  private View.OnClickListener qIQ;
  private k.b qIR;
  private k.a qIS;
  private j.a qIT;
  String username;
  
  public i(Context paramContext)
  {
    if (this.qIK) {
      bool = true;
    }
    this.qIL = bool;
    this.qIN = null;
    this.mtE = null;
    this.opw = null;
    this.qIQ = new i.1(this);
    this.qIR = new i.2(this);
    this.qIS = new i.3(this);
    this.qIT = new i.4(this);
    this.context = paramContext;
    this.qIM = new j(this.context);
    this.qIM.qIX = this.qIT;
  }
  
  private static String BY(int paramInt)
  {
    if (paramInt >= 0) {
      return "pref_contact_list_row_" + paramInt;
    }
    String str = "unkown";
    if (paramInt == -1) {
      str = "header";
    }
    for (;;)
    {
      return "pref_contact_list_row_" + str;
      if (paramInt == -2) {
        str = "footer";
      }
    }
  }
  
  final void FX(String paramString)
  {
    j localj = this.qIM;
    localj.username = paramString;
    localj.bSD = s.fq(paramString);
    if ((!localj.bSD) && (p.a.qJH != null)) {
      localj.qIZ = p.a.qJH.TE(paramString);
    }
    if (!localj.qIZ) {
      localj.hLB = ((b)g.l(b.class)).Ga().ih(paramString);
    }
    if ((localj.qIZ) && (p.a.qJH != null)) {
      localj.hOC = p.a.qJH.TG(localj.username);
    }
    this.qIM.qJm = this.qIL;
    this.qIM.notifyChanged();
    bpx();
  }
  
  public final void bpx()
  {
    if ((this.eOE == null) || (this.qII == null)) {
      return;
    }
    Object localObject1 = this.qIJ.keySet().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      this.eOE.aaa((String)localObject2);
    }
    this.qIJ.clear();
    int m = this.eOE.indexOf(this.qII);
    int k = 0;
    if (this.eLM != null) {
      k = 1;
    }
    if (this.hsd != null) {
      if (this.qIK)
      {
        localObject1 = this.qIM;
        if (((j)localObject1).qJf <= ((j)localObject1).qJn) {
          break label546;
        }
        i = 1;
        if (i == 0) {
          break label857;
        }
      }
    }
    label246:
    label259:
    label304:
    label546:
    label560:
    label569:
    label581:
    label662:
    label762:
    label854:
    label857:
    for (int i = 1;; i = 0)
    {
      int j = m;
      if (k != 0)
      {
        localObject1 = new ContactListCustomPreference(this.context);
        ((ContactListCustomPreference)localObject1).setKey(BY(-1));
        ((ContactListCustomPreference)localObject1).setCustomView(this.eLM);
        ((ContactListCustomPreference)localObject1).background = a.d.comm_list_item_selector;
        ((ContactListCustomPreference)localObject1).mtE = this.qIO;
        this.eOE.a((Preference)localObject1, m);
        this.qIJ.put(((Preference)localObject1).mKey, localObject1);
        j = m + 1;
      }
      Object localObject3;
      boolean bool2;
      boolean bool1;
      if (this.qIN != null)
      {
        localObject1 = this.qIN;
        if (this.mtE == null) {
          break label560;
        }
        localObject2 = this.mtE;
        localObject3 = this.qIM.qJo;
        bool2 = this.qIM.cdR();
        if ((!bi.oW((String)localObject3)) && ((localObject3 == null) || (((String)localObject3).equals(q.GF())))) {
          break label569;
        }
        bool1 = false;
        if (!this.qIM.qIZ) {
          break label854;
        }
        bool1 = this.qIM.qJa;
      }
      for (;;)
      {
        int i2 = this.qIM.qJg;
        if ((!bool2) || (bool1)) {}
        int n;
        Object localObject4;
        for (k = 2;; k = 1)
        {
          n = 0;
          localObject3 = this.qIM;
          localObject4 = this.context;
          if (localObject4 != null) {
            break label581;
          }
          m = 0;
          i1 = 0;
          while ((i1 < this.qIM.getCount()) && (i1 < i2 + k))
          {
            localObject3 = new ContactListExpandPreference(this.context, 1);
            ((ContactListExpandPreference)localObject3).setKey(BY(n));
            localObject4 = ((ContactListExpandPreference)localObject3).qJB;
            ((k)localObject4).qIM = this.qIM;
            ((k)localObject4).row = n;
            ((k)localObject4).index = i1;
            ((ContactListExpandPreference)localObject3).qJB.qJC = m;
            ((ContactListExpandPreference)localObject3).qJB.hLy = bool1;
            ((ContactListExpandPreference)localObject3).qJB.mtE = ((View.OnClickListener)localObject2);
            ((ContactListExpandPreference)localObject3).qJB.qIS = this.qIS;
            ((ContactListExpandPreference)localObject3).qJB.qJD = ((k.b)localObject1);
            this.eOE.a((Preference)localObject3, j + n);
            this.qIJ.put(((Preference)localObject3).mKey, localObject3);
            i1 += m;
            n += 1;
          }
          i = 0;
          break;
          localObject1 = this.qIR;
          break label246;
          localObject2 = this.qIQ;
          break label259;
          bool1 = true;
          break label304;
        }
        Display localDisplay = ((WindowManager)((Context)localObject4).getSystemService("window")).getDefaultDisplay();
        m = localDisplay.getWidth();
        int i1 = localDisplay.getHeight();
        float f2;
        if ((m / (((Context)localObject4).getResources().getDimension(a.c.NormalAvatarWrapSize) + ((Context)localObject4).getResources().getDimension(a.c.MiddlePadding) * 2.0F) >= 5.0F) && (i1 > m))
        {
          ((j)localObject3).qJu = true;
          f2 = ((Context)localObject4).getResources().getDimension(a.c.MiddlePadding);
          if (!((j)localObject3).qJu) {
            break label762;
          }
        }
        for (float f1 = ((Context)localObject4).getResources().getDimension(a.c.NormalAvatarWrapSize);; f1 = ((Context)localObject4).getResources().getDimension(a.c.NormalAvatarSize))
        {
          i1 = m / (int)(f1 + 2.0F * f2);
          x.i("MicroMsg.ContactsListArchAdapter", "[getWrapColNum] :%s", new Object[] { Integer.valueOf(i1) });
          j.qIW = i1;
          m = i1;
          if (i1 != 4) {
            break;
          }
          j.qIV = 43;
          m = i1;
          break;
          ((j)localObject3).qJu = false;
          break label662;
        }
        if (i == 0) {
          break;
        }
        localObject1 = new ContactListCustomPreference(this.context);
        ((ContactListCustomPreference)localObject1).setKey(BY(-2));
        ((ContactListCustomPreference)localObject1).setCustomView(this.hsd);
        ((ContactListCustomPreference)localObject1).mtE = this.qIP;
        this.eOE.a((Preference)localObject1, j + n);
        this.qIJ.put(((Preference)localObject1).mKey, localObject1);
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/applet/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */