package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.openim.PluginOpenIM;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public final class t
  extends a
{
  private HashSet<String> ulc = new HashSet();
  private String uld;
  OpenIMAddressUI.a ule;
  
  public t(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, paramString1, null, 2);
    this.uld = paramString2;
  }
  
  protected final int a(com.tencent.mm.storage.f paramf, int paramInt)
  {
    if (paramf == null) {
      x.e("OpenIMContactAdapter", "contact is null, position:%d", new Object[] { Integer.valueOf(paramInt) });
    }
    while (bi.oW(paramf.field_descWording)) {
      return -1;
    }
    return paramf.field_descWording.hashCode();
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof String))) {
      x.d("OpenIMContactAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    }
    do
    {
      return;
      au.HU();
    } while (paramm != c.FR());
    if (ab.XR((String)paramObject))
    {
      this.ule.uhx = true;
      return;
    }
    x.d("OpenIMContactAdapter", "newcursor is not openim ，return");
  }
  
  protected final void a(com.tencent.mm.storage.f paramf, a.b paramb)
  {
    paramb = paramf.field_descWordingId;
    if (this.ulc.contains(paramb)) {
      return;
    }
    this.ulc.add(paramb);
    ((b)g.l(b.class)).aE(paramf.field_openImAppid, paramb);
  }
  
  protected final String b(com.tencent.mm.storage.f paramf, int paramInt)
  {
    String str = paramf.field_descWording;
    paramf = str;
    if (bi.oW(str)) {
      paramf = "#";
    }
    return paramf;
  }
  
  protected final Cursor cxV()
  {
    long l = System.currentTimeMillis();
    g.Ek();
    Object localObject2 = ((PluginOpenIM)g.n(PluginOpenIM.class)).getAppIdInfoStg();
    String str = this.uld;
    Object localObject1 = new LinkedList();
    localObject2 = ((com.tencent.mm.openim.d.d)localObject2).diF.b("select distinct appid from OpenIMAppIdInfo where acctTypeId=? ", new String[] { str }, 2);
    if (((Cursor)localObject2).moveToFirst()) {
      do
      {
        str = ((Cursor)localObject2).getString(0);
        if (!bi.oW(str)) {
          ((List)localObject1).add(str);
        }
      } while (((Cursor)localObject2).moveToNext());
    }
    ((Cursor)localObject2).close();
    au.HU();
    localObject2 = c.FR().a(this.gRN, w.fD(ad.getContext()), (List)localObject1);
    localObject1 = localObject2;
    if ((localObject2 instanceof com.tencent.mm.bt.a.f)) {
      localObject1 = new com.tencent.mm.bt.a.e(new com.tencent.mm.bt.a.d[] { (com.tencent.mm.bt.a.d)com.tencent.mm.bt.d.cnR(), (com.tencent.mm.bt.a.f)localObject2 });
    }
    x.d("OpenIMContactAdapter", "createNewCursor : " + (System.currentTimeMillis() - l));
    return (Cursor)localObject1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/contact/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */