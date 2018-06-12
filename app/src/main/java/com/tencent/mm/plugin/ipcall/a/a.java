package com.tencent.mm.plugin.ipcall.a;

import android.database.Cursor;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.plugin.ipcall.a.g.b;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
{
  private static a koe = null;
  private boolean acT = false;
  private long endTime = -1L;
  ag handler = new ag(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      long l1 = System.currentTimeMillis();
      Object localObject1 = i.aXv();
      Object localObject2 = (ArrayList)paramAnonymousMessage.obj;
      if ((localObject2 != null) && (((List)localObject2).size() > 0))
      {
        long l2 = ((d)localObject1).dO(Thread.currentThread().getId());
        x.i("MicroMsg.IPCallAddressStorage", "getContactIdMap start");
        Object localObject3 = ((d)localObject1).diF.a("IPCallAddressItem", new String[] { "contactId" }, null, null, null, null, null, 2);
        paramAnonymousMessage = new HashMap();
        if ((localObject3 != null) && (((Cursor)localObject3).moveToFirst())) {
          do
          {
            String str = ((Cursor)localObject3).getString(0);
            if (!paramAnonymousMessage.containsKey(str)) {
              paramAnonymousMessage.put(str, Boolean.valueOf(true));
            }
          } while (((Cursor)localObject3).moveToNext());
        }
        if (localObject3 != null) {
          ((Cursor)localObject3).close();
        }
        x.i("MicroMsg.IPCallAddressStorage", "getContactIdMap end");
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (com.tencent.mm.plugin.ipcall.a.g.c)((Iterator)localObject2).next();
          if (!paramAnonymousMessage.containsKey(((com.tencent.mm.plugin.ipcall.a.g.c)localObject3).field_contactId)) {
            ((d)localObject1).b((com.tencent.mm.sdk.e.c)localObject3);
          }
        }
        ((d)localObject1).dP(l2);
      }
      x.d("MicroMsg.IPCallAddressBookLoader", "batchInsert, used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
      a.a(a.this, System.currentTimeMillis());
      x.d("MicroMsg.IPCallAddressBookLoader", "loadAllAddressItem, used: %dms", new Object[] { Long.valueOf(a.a(a.this) - a.b(a.this)) });
      a.c(a.this);
      a.a(a.this, -1L);
      a.d(a.this);
      paramAnonymousMessage = a.this.kod.iterator();
      while (paramAnonymousMessage.hasNext())
      {
        localObject1 = (a.a)paramAnonymousMessage.next();
        if (localObject1 != null) {
          ((a.a)localObject1).amF();
        }
      }
      a.this.kod.clear();
    }
  };
  public ArrayList<a> kod = new ArrayList();
  private long startTime = -1L;
  
  public static a aXa()
  {
    if (koe == null) {
      koe = new a();
    }
    return koe;
  }
  
  public final void a(a parama, boolean paramBoolean)
  {
    if (parama != null) {
      this.kod.add(parama);
    }
    if (this.acT) {
      x.d("MicroMsg.IPCallAddressBookLoader", "loadAllAddressItem, isLoading is true, ignore");
    }
    do
    {
      return;
      this.startTime = System.currentTimeMillis();
    } while ((b.aXV().size() != 0) && (paramBoolean));
    x.d("MicroMsg.IPCallAddressBookLoader", "loadFromSystemAddressBook");
    long l = System.currentTimeMillis();
    new b();
    parama = b.aXU();
    x.d("MicroMsg.IPCallAddressBookLoader", "getAllAddressItemFromSystemPhoneBook, used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    Message localMessage = this.handler.obtainMessage();
    localMessage.obj = parama;
    this.handler.sendMessage(localMessage);
    this.acT = true;
  }
  
  public static abstract interface a
  {
    public abstract void amF();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */