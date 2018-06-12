package com.tencent.mm.plugin.order.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.order.b.a;
import com.tencent.mm.sdk.platformtools.bl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c
{
  public List<j> huM = new ArrayList();
  private List<a> lNF = new ArrayList();
  
  public c()
  {
    loadFromDB();
    bmt();
    bms();
    bmu();
  }
  
  public static j Jq(String paramString)
  {
    Map localMap = bl.z(paramString, "sysmsg");
    if (localMap == null) {
      return null;
    }
    j localj = new j();
    localj.lOY = ((String)localMap.get(".sysmsg.paymsg.PayMsgType"));
    localj.lOZ = ((String)localMap.get(".sysmsg.paymsg.Brief.IconUrl"));
    localj.lPa = ((String)localMap.get(".sysmsg.paymsg.Brief.CreateTime"));
    localj.lPb = ((String)localMap.get(".sysmsg.paymsg.StatusSection.IconUrl"));
    localj.lPc = ((String)localMap.get(".sysmsg.paymsg.StatusSection.StatusDesc"));
    localj.bWW = ((String)localMap.get(".sysmsg.paymsg.StatusSection.Content"));
    localj.lPd = ((String)localMap.get(".sysmsg.paymsg.StatusSection.JumpUrl"));
    localj.lPe = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppUserName"));
    localj.lOO = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppNickName"));
    localj.lPf = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppTelephone"));
    int i = 0;
    if (i == 0) {
      paramString = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button.Name");
    }
    for (String str = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button.JumpUrl");; str = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button" + i + ".JumpUrl"))
    {
      if (TextUtils.isEmpty(paramString)) {
        break label357;
      }
      localObject = new j.a();
      ((j.a)localObject).name = paramString;
      ((j.a)localObject).jumpUrl = str;
      if (localj.lPg == null) {
        localj.lPg = new ArrayList();
      }
      localj.lPg.add(localObject);
      i += 1;
      break;
      paramString = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button" + i + ".Name");
    }
    label357:
    i = 0;
    if (i == 0)
    {
      paramString = (String)localMap.get(".sysmsg.paymsg.NormalSection.Name");
      str = (String)localMap.get(".sysmsg.paymsg.NormalSection.Value");
    }
    for (Object localObject = (String)localMap.get(".sysmsg.paymsg.NormalSection.JumpUrl");; localObject = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".JumpUrl"))
    {
      if (TextUtils.isEmpty(paramString)) {
        break label575;
      }
      j.b localb = new j.b();
      localb.name = paramString;
      localb.value = str;
      localb.jumpUrl = ((String)localObject);
      if (localj.lPh == null) {
        localj.lPh = new ArrayList();
      }
      localj.lPh.add(localb);
      i += 1;
      break;
      paramString = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".Name");
      str = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".Value");
    }
    label575:
    return localj;
  }
  
  public static MallOrderDetailObject a(j paramj)
  {
    if (paramj == null) {
      return null;
    }
    MallOrderDetailObject localMallOrderDetailObject = new MallOrderDetailObject();
    Object localObject1 = new MallOrderDetailObject.b();
    ((MallOrderDetailObject.b)localObject1).lNA = paramj.lPc;
    if ((!TextUtils.isEmpty(paramj.lPa)) && (com.tencent.mm.plugin.order.c.c.xW(paramj.lPa))) {}
    int i;
    Object localObject2;
    MallOrderDetailObject.a locala;
    for (((MallOrderDetailObject.b)localObject1).time = Integer.valueOf(paramj.lPa).intValue();; ((MallOrderDetailObject.b)localObject1).time = ((int)(System.currentTimeMillis() / 1000L)))
    {
      ((MallOrderDetailObject.b)localObject1).thumbUrl = paramj.lPb;
      ((MallOrderDetailObject.b)localObject1).jOU = paramj.lPd;
      ((MallOrderDetailObject.b)localObject1).lNB = paramj.bWW;
      localMallOrderDetailObject.lNs = ((MallOrderDetailObject.b)localObject1);
      localObject1 = paramj.lPg;
      if ((localObject1 == null) || (((List)localObject1).size() <= 0)) {
        break;
      }
      localMallOrderDetailObject.lNu = new ArrayList();
      i = 0;
      while (i < ((List)localObject1).size())
      {
        localObject2 = (j.a)((List)localObject1).get(i);
        locala = new MallOrderDetailObject.a();
        locala.name = ((j.a)localObject2).name;
        locala.value = "";
        locala.jumpUrl = ((j.a)localObject2).jumpUrl;
        locala.hvi = false;
        localMallOrderDetailObject.lNu.add(locala);
        i += 1;
      }
    }
    localObject1 = paramj.lPh;
    if ((localObject1 != null) && (((List)localObject1).size() > 0))
    {
      if (localMallOrderDetailObject.lNu == null) {
        localMallOrderDetailObject.lNu = new ArrayList();
      }
      i = 0;
      while (i < ((List)localObject1).size())
      {
        localObject2 = (j.b)((List)localObject1).get(i);
        locala = new MallOrderDetailObject.a();
        locala.name = ((j.b)localObject2).name;
        locala.value = ((j.b)localObject2).value;
        locala.jumpUrl = ((j.b)localObject2).jumpUrl;
        locala.hvi = false;
        if (i == 0) {
          locala.hvi = true;
        }
        localMallOrderDetailObject.lNu.add(locala);
        i += 1;
      }
    }
    localMallOrderDetailObject.lNy = paramj.lPf;
    localMallOrderDetailObject.bPg = paramj.lPe;
    if ((!TextUtils.isEmpty(paramj.lPa)) && (com.tencent.mm.plugin.order.c.c.xW(paramj.lPa))) {}
    for (localMallOrderDetailObject.lNz = Integer.valueOf(paramj.lPa).intValue();; localMallOrderDetailObject.lNz = ((int)(System.currentTimeMillis() / 1000L))) {
      return localMallOrderDetailObject;
    }
  }
  
  private void bms()
  {
    if ((this.huM == null) || (this.huM.size() == 0)) {}
    for (;;)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(this.huM);
      int i = 0;
      while (i < localArrayList.size())
      {
        j localj = (j)localArrayList.get(i);
        if ((localj.lOY != null) && (com.tencent.mm.plugin.order.c.c.xW(localj.lOY)))
        {
          int j = Integer.valueOf(localj.lOY).intValue();
          if ((j != 2) && (j != 1)) {
            Jr(localj.bWQ);
          }
        }
        i += 1;
      }
    }
  }
  
  private void bmt()
  {
    int i = 0;
    while (i < this.lNF.size())
    {
      a locala = (a)this.lNF.get(i);
      String str = locala.field_msgContentXml;
      j localj = Jq(str);
      localj.bWQ = locala.field_msgId;
      this.huM.add(localj);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MallPayMsgManager", "parsePayMsgFromMsgXmlList xml:" + str);
      i += 1;
    }
  }
  
  private void loadFromDB()
  {
    com.tencent.mm.plugin.order.a.b.bmn();
    Cursor localCursor = com.tencent.mm.plugin.order.a.b.bmp().axc();
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      localCursor.moveToFirst();
      int i = localCursor.getColumnIndex("msgId");
      int j = localCursor.getColumnIndex("msgContentXml");
      int k = localCursor.getColumnIndex("isRead");
      while (!localCursor.isAfterLast())
      {
        a locala = new a();
        locala.field_msgId = localCursor.getString(i);
        locala.field_msgContentXml = localCursor.getString(j);
        locala.field_isRead = localCursor.getString(k);
        localCursor.moveToNext();
        this.lNF.add(locala);
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
  }
  
  public final boolean Jr(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return false;
      paramString = Jt(paramString);
    } while (paramString == null);
    this.huM.remove(paramString);
    int i;
    if (paramString != null) {
      i = 0;
    }
    for (;;)
    {
      if (i < this.lNF.size())
      {
        a locala = (a)this.lNF.get(i);
        if (paramString.bWQ.equals(locala.field_msgId))
        {
          this.lNF.remove(locala);
          com.tencent.mm.plugin.order.a.b.bmn();
          com.tencent.mm.plugin.order.a.b.bmp().a(locala, new String[0]);
        }
      }
      else
      {
        return true;
      }
      i += 1;
    }
  }
  
  public final boolean Js(String paramString)
  {
    if ((this.huM == null) || (TextUtils.isEmpty(paramString))) {}
    for (;;)
    {
      return false;
      int i = 0;
      while (i < this.huM.size())
      {
        j localj = (j)this.huM.get(i);
        if ((localj != null) && (localj.bWQ.equals(paramString))) {
          return true;
        }
        i += 1;
      }
    }
  }
  
  public final j Jt(String paramString)
  {
    Object localObject;
    if ((this.huM == null) || (TextUtils.isEmpty(paramString)))
    {
      localObject = null;
      return (j)localObject;
    }
    int i = 0;
    for (;;)
    {
      if (i >= this.huM.size()) {
        break label70;
      }
      j localj = (j)this.huM.get(i);
      localObject = localj;
      if (paramString.equals(localj.bWQ)) {
        break;
      }
      i += 1;
    }
    label70:
    return null;
  }
  
  public final a Ju(String paramString)
  {
    Object localObject;
    if ((this.lNF == null) || (TextUtils.isEmpty(paramString)))
    {
      localObject = null;
      return (a)localObject;
    }
    int i = 0;
    for (;;)
    {
      if (i >= this.lNF.size()) {
        break label70;
      }
      a locala = (a)this.lNF.get(i);
      localObject = locala;
      if (paramString.equals(locala.field_msgId)) {
        break;
      }
      i += 1;
    }
    label70:
    return null;
  }
  
  public final void a(j paramj, String paramString1, String paramString2)
  {
    if ((paramj == null) || (TextUtils.isEmpty(paramString1))) {
      return;
    }
    a locala = new a();
    locala.field_msgId = paramj.bWQ;
    locala.field_msgContentXml = paramString1;
    locala.field_isRead = paramString2;
    com.tencent.mm.plugin.order.a.b.bmn();
    if (!com.tencent.mm.plugin.order.a.b.bmp().a(locala)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MallPayMsgManager", "insert CommonMsgXml failed! id:" + paramj.bWQ);
    }
    this.lNF.add(locala);
  }
  
  public final void bmu()
  {
    int i = bmv();
    g.Ek();
    g.Ei().DT().set(204820, Integer.valueOf(i));
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MallPayMsgManager", "save unread msg is :" + i);
  }
  
  public final int bmv()
  {
    if ((this.lNF == null) || (this.lNF.size() == 0)) {
      return 0;
    }
    int i = 0;
    int k;
    for (int j = 0; i < this.lNF.size(); j = k)
    {
      a locala = (a)this.lNF.get(i);
      k = j;
      if (locala != null)
      {
        k = j;
        if ("0".equals(locala.field_isRead)) {
          k = j + 1;
        }
      }
      i += 1;
    }
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MallPayMsgManager", "msg xml unread msg is %s:" + j);
    return j;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/order/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */