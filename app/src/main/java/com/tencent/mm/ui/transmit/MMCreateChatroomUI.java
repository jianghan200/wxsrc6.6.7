package com.tencent.mm.ui.transmit;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.ListView;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jw;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.ui.k;
import com.tencent.mm.pluginsdk.ui.applet.s.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.s.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MMCreateChatroomUI
  extends MMBaseSelectContactUI
{
  private String chatroomName;
  private ProgressDialog eHw;
  private int scene;
  private com.tencent.mm.pluginsdk.c.b tOA = new MMCreateChatroomUI.3(this);
  private List<String> uCX;
  private boolean uDg;
  a uDh;
  private b uDi;
  private boolean uDj;
  private boolean ulC;
  private jw ulD;
  
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
      ab localab = c.FR().Yg(str);
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
  
  protected final void Wj()
  {
    super.Wj();
    this.uCX = getIntent().getStringArrayListExtra("query_phrase_list");
    this.uDg = getIntent().getBooleanExtra("go_to_chatroom_direct", false);
    this.scene = getIntent().getIntExtra("scene_from", 0);
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
    return getString(R.l.select_create_chatroom_title);
  }
  
  protected final o Wn()
  {
    if (this.uDh == null) {
      this.uDh = new a(this, this.uCX, this.scene);
    }
    return this.uDh;
  }
  
  protected final m Wo()
  {
    if (this.uDi == null) {
      this.uDi = new b(this, this.scene);
    }
    return this.uDi;
  }
  
  public final void Wp()
  {
    List localList = this.uDh.cAa();
    if (localList.size() > 0)
    {
      updateOptionMenuText(1, getString(R.l.app_ok) + "(" + localList.size() + ")");
      if (localList.size() > 1)
      {
        enableOptionMenu(1, true);
        return;
      }
      enableOptionMenu(1, false);
      return;
    }
    updateOptionMenuText(1, getString(R.l.app_ok));
    enableOptionMenu(1, false);
  }
  
  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((parama instanceof d))
    {
      Object localObject = (d)parama;
      parama = this.uDh;
      localObject = ((d)localObject).fyJ.jrv;
      bool1 = bool2;
      if (parama.eCr.contains(localObject)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    if ((parama instanceof d))
    {
      Object localObject = (d)parama;
      a locala = this.uDh;
      localObject = ((d)localObject).fyJ.jrv;
      int j = parama.position;
      if (locala.eCr.contains(localObject))
      {
        int i = locala.uCZ.size() - 1;
        if (i >= 0)
        {
          parama = (a.a)locala.uCZ.get(i);
          if (j < parama.jta) {}
        }
        for (;;)
        {
          if (parama == null) {
            break label117;
          }
          if (((String)localObject).equals(parama.uDc)) {
            break label119;
          }
          return true;
          i -= 1;
          break;
          parama = null;
        }
        label117:
        return false;
      }
      label119:
      return false;
    }
    return false;
  }
  
  public final boolean cyx()
  {
    return true;
  }
  
  public final void iV(int paramInt)
  {
    a locala = this.uDh;
    j localj = this.uDi.jsk;
    Object localObject = this.uDi.bWm;
    if ((localj.jsx.size() != 1) || (!((com.tencent.mm.plugin.fts.a.a.l)localj.jsx.get(0)).jrv.equals("no_result​")))
    {
      a.a locala1 = new a.a(locala, (byte)0);
      locala1.jsx = localj.jsx;
      locala1.jrx = localj.jrx;
      locala1.bWm = ((String)localObject);
      locala.uCZ.add(locala1);
      int i = paramInt - locala.ujW.getContentLV().getHeaderViewsCount();
      if (i >= 3)
      {
        localObject = (com.tencent.mm.plugin.fts.a.a.l)localj.jsx.remove(i);
        localj.jsx.add(0, localObject);
        paramInt = locala.ujW.getContentLV().getHeaderViewsCount();
      }
      locala.czZ();
      i = locala1.jta;
      locala.ujW.getContentLV().post(new a.2(locala, i + paramInt + 1));
    }
    cyv();
    cyw();
    YC();
  }
  
  protected final void initView()
  {
    super.initView();
    a locala = this.uDh;
    Iterator localIterator = locala.uCX.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      i locali = new i();
      locali.handler = locala.handler;
      locali.jsv = locala.lUA;
      locali.bWm = ((String)localObject);
      locali.jsu = com.tencent.mm.plugin.fts.a.c.b.jsU;
      locali.jsq = new int[] { 131072 };
      locali.jst.add("filehelper");
      locali.jst.add(q.GF());
      localObject = ((com.tencent.mm.plugin.fts.a.n)g.n(com.tencent.mm.plugin.fts.a.n.class)).search(2, locali);
      locala.uCY = new ArrayList();
      locala.uCY.add(localObject);
    }
    a(1, getString(R.l.app_ok), new MMCreateChatroomUI.1(this), s.b.tmX);
    Wp();
    com.tencent.mm.pluginsdk.c.b.a(jw.class.getName(), this.tOA);
  }
  
  protected void onDestroy()
  {
    this.uDh.finish();
    com.tencent.mm.pluginsdk.c.b.b(jw.class.getName(), this.tOA);
    if ((!this.uDj) && (this.scene == 3)) {
      k.fh(false);
    }
    super.onDestroy();
  }
  
  public final void pf(String paramString)
  {
    a locala = this.uDh;
    locala.eCr.remove(paramString);
    Iterator localIterator = locala.uCZ.iterator();
    while (localIterator.hasNext())
    {
      a.a locala1 = (a.a)localIterator.next();
      if (paramString.equals(locala1.uDc)) {
        locala1.uDc = null;
      }
    }
    locala.notifyDataSetChanged();
    Wp();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/transmit/MMCreateChatroomUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */